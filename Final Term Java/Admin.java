import java.lang.*;

import javax.swing.*;

import java.awt.*; 

import java.awt.event.*;
import java.io.*; 
import java.nio.file.*;
 
public class Admin extends JFrame implements  ActionListener 

{

    private JPanel panel;

    private JLabel label1, label2, label3,label4,label5;

    private JTextField tf1, tf2;

    private JPasswordField pf1;

    private JButton bt1, bt2, bt3;

	private JTextArea ta;

    private Font f1;

    private Color c1;
	private ImageIcon ic;

    private static final String DEFAULT_ADMIN_USERNAME = "Admin";
    private static final String DEFAULT_ADMIN_PASSWORD = "Admin12";


    public Admin() 

	{

        super("Admin Panel");

        super.setBounds(350, 80, 650, 500);

        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

        panel.setLayout(null);

       // c1 = new Color(210, 234, 238);

        panel.setBackground(Color.WHITE);
 
        label1 = new JLabel("Admin Panel");

        label1.setBounds(150, 20, 300, 50); 

        f1 = new Font("Cambria", Font.BOLD, 40);

        label1.setFont(f1);

        label1.setForeground(Color.DARK_GRAY);

        panel.add(label1);
 
        label2 = new JLabel("Username:");

        label2.setBounds(100, 140, 120, 30);

        panel.add(label2);
 
        tf1 = new JTextField();

        tf1.setBounds(220, 140, 200, 30);

        panel.add(tf1);
 
        label3 = new JLabel("Password:");

        label3.setBounds(100, 190, 120, 30);

        panel.add(label3);
 
        pf1 = new JPasswordField();

        pf1.setBounds(220, 190, 200, 30);

        pf1.setEchoChar('*');

        panel.add(pf1);
 
        bt1 = new JButton("Login");

        bt1.setBounds(480, 350, 100, 30);

        bt1.addActionListener(this);

        panel.add(bt1);
 
        bt2 = new JButton("Back");

        bt2.setBounds(10, 380, 100, 30);

        bt2.addActionListener(this);

        panel.add(bt2);
 
       // bt3 = new JButton("Exit");

       // bt3.setBounds(480, 350, 100, 30);

       // bt3.addActionListener(this);

        //panel.add(bt3);
		
		ta = new JTextArea();
        ta.setBounds(100, 300, 400, 40); 
        panel.add(ta); 
		
		
		ic = new ImageIcon("img4.JPG");
		label4 = new JLabel(ic) ;
		label4.setBounds(320,-20,400,400);
		panel.add(label4);
		
		

        super.add(panel);
		
		
        initializeAdminFile();
 
    }

    public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == bt1) {
        String username = tf1.getText().trim();
        String password = new String(pf1.getPassword()).trim();

        if (checkAdminCredentials(username, password)) {
            
            String usersData = getRegisteredUsers();
            
           
            new UsersFrame("Login Successful!\nRegistered Users:\n" + usersData);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid ! Try again.");
        }
    } else if (ae.getSource() == bt2) {
        Welcome obj7 = new Welcome();
					obj7.setVisible(true);
					this.setVisible(false);
    }
}

 
    
    private void initializeAdminFile() {
        File file = new File("admin.txt");
 
        
        if (file.exists() && file.length() > 0) 
		{
            return;
        }
 
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(DEFAULT_ADMIN_USERNAME + "," + DEFAULT_ADMIN_PASSWORD);
            bw.newLine();  
            bw.flush(); 
            System.out.println("Admin credentials saved: " + DEFAULT_ADMIN_USERNAME + " " + DEFAULT_ADMIN_PASSWORD);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error initializing admin file.");
        }
    }
 
    
    private boolean checkAdminCredentials(String username, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("admin.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] creds = line.split(",");
                if (creds.length == 2 && creds[0].trim().equals(username) && creds[1].trim().equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading admin file.");
        }
        return false;
    }
 
    
    private String getRegisteredUsers() {
        StringBuilder sb = new StringBuilder();
        File usersFile = new File("users.txt");
 
        if (!usersFile.exists()) {
            return "No registered users found!";
        }
 
        try (BufferedReader br = new BufferedReader(new FileReader(usersFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading user file.");
        }
        return sb.toString();
    }
}
    
 
 