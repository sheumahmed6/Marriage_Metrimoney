import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Registration extends JFrame implements ActionListener
{
	private JPanel panel;
	private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
	private Font f1, f2, f3;
	private JTextField tf1, tf2, tf3, tf4, tf5, tf6;
	private JComboBox jb;
	private JCheckBox jc;
	private JButton bt, bt1, bt2;
	private JRadioButton rd1, rd2;
	private ButtonGroup bg1;
	
	public Registration()
	{
		super("Registration");
		super.setBounds(200, 10, 800, 650);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.ORANGE);
		
        label1 = new JLabel("Registration");
		label1.setBounds(250, 20, 300, 50);
		f1 = new Font("Algerian", Font.BOLD, 30);
		label1.setFont(f1);
		panel.add(label1);
		
		label9 = new JLabel("If you have any existing account, first");
		label9.setBounds(210, 60, 300, 50);
		f2 = new Font("Times New Roman", Font.BOLD, 15);
		label9.setFont(f2);
		
		/*
		bt1 = new JButton("Login"); // use for button
		bt1.setBounds(440, 78, 82, 17);
		bt1.setFont(f2);
		bt1.setForeground(Color.BLUE);
		*/
		
		panel.add(label9);
		
		//panel.add(bt1);
		

		label2 = new JLabel("Name:");
		label2.setBounds(200, 100, 100, 20);
		panel.add(label2);
		f2 = new Font("Times New Roman", Font.BOLD, 15);
		label2.setFont(f2);
		tf1 = new JTextField();
		tf1.setBounds(200, 125, 300, 30);
		panel.add(tf1);
		
		label3 = new JLabel("Email:");
		label3.setBounds(200, 155, 100, 20);
		panel.add(label3);
		label3.setFont(f2);
		tf2 = new JTextField();
		tf2.setBounds(200, 180, 300, 30);
		panel.add(tf2);

		label4 = new JLabel("NID:");
		label4.setBounds(200, 215, 100, 20);
		panel.add(label4);
		label4.setFont(f2);
		tf6 = new JTextField();
		tf6.setBounds(200, 240, 300, 30);
		panel.add(tf6);
		
		label5 = new JLabel("UserName:");
		label5.setBounds(200, 275, 100, 20);
		panel.add(label5);
		label5.setFont(f2);
		tf3 = new JTextField();
		tf3.setBounds(200, 300, 300, 30);
		panel.add(tf3);
		
		label6 = new JLabel("Pass:");
        label6.setBounds(200, 335, 200, 20);
		panel.add(label6);
		label6.setFont(f2);
		tf4 = new JPasswordField();
        tf4.setBounds(200, 360, 300, 30);
		panel.add(tf4);
		
		/*
		label7 = new JLabel("Repeat Password:");
        label7.setBounds(200, 395, 250, 20);
		panel.add(label7);
		label7.setFont(f2);
		tf5 = new JPasswordField();
        tf5.setBounds(200, 420, 300, 30);
		panel.add(tf5);
		*/
		
		label8 = new JLabel("Country");
		label8.setBounds(200, 455, 100, 20);
		panel.add(label8);
		label8.setFont(f2);
		String topics[] = new String[]
		{"", "BD", "UK", "US", "Canada"};
		jb = new JComboBox(topics);
		jb.setBounds(200, 480, 300, 30);
		jb.setFont(f2);
		panel.add(jb);
		
		jc = new JCheckBox("Yes, I would like to receive updates.");
		jc.setBounds(200, 520, 280, 20);
		jc.setFont(f2);
		panel.add(jc);
		
		bt = new JButton("Sign Up");
		bt.setBounds(350, 560, 100, 30);//350, 560, 100, 30
		bt.setForeground(Color.WHITE);
		bt.setBackground(new Color(153, 231, 233));
		bt.setFont(f2);
		panel.add(bt);
		bt.addActionListener(this);
		
		label9 = new JLabel("Your Gender");
		label9.setBounds(200, 395, 250, 20); 
		label9.setFont(f2);
		panel.add(label9);
		rd1 = new JRadioButton("Male");
		rd1.setBounds(200, 420, 100, 30); 
		rd1.setFont(f2);
		panel.add(rd1);
		rd2 = new JRadioButton("Female");
		rd2.setBounds(310, 420, 120, 30); 
		rd2.setFont(f2);
		panel.add(rd2);
		bg1 = new ButtonGroup();
		bg1.add(rd1);
		bg1.add(rd2);
		
		bt2=new JButton("Back");
		bt2.setBounds(200, 560, 100, 30);
		bt2.addActionListener(this);
		panel.add(bt2);
		bt2.setFont(f2);

		super.add(panel);
	}
	
	
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == bt2)
		{
			Welcome obj7 = new Welcome();
					obj7.setVisible(true);
					this.setVisible(false);
		}
		if(ae.getSource() == bt)
		{
			String name, email,nid,userName,pass;
			name = tf1.getText();
		    email = tf2.getText();
		    nid = tf6.getText();
		    userName = tf3.getText();
		    pass = tf4.getText();

			if(name.isEmpty() || email.isEmpty() || nid.isEmpty() || userName.isEmpty() || pass.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Please fill up all the info");
			}
			else 
			{
				Account acc = new Account( name,email, nid,userName,pass );
				
				if(acc.checkAccount() == true)
				{
					JOptionPane.showMessageDialog(this,"Already exists");
				}
				else  
				{
					acc.addAccount();
					JOptionPane.showMessageDialog(this,"Signup Successfull");
				
					tf3.setText("");
					tf4.setText("");
				
					Login obj7 = new Login();
					obj7.setVisible(true);
					this.setVisible(false);
				}
				
			}
		}
		
	        
	
        

    }
}
