import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Welcome extends JFrame implements MouseListener,ActionListener
{
	private JPanel panel;
	private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,label20,label21,label22,label23;
	private JTextField tf1,tf2,tf3,tf4,tf5;
	private JComboBox jb,jb1,jb2,jb3,jb4,jb5;
	private JPasswordField pf1,pf2;
	private JCheckBox jc1,jc2,jc3,jc4;
	private JButton login,signup,exit,admin;
	private ImageIcon ic;
	
	private Font f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14;
	private Color c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	
	
	public Welcome()
	{
		//super("BibahoBD.com");
		
		super.setBounds(200,20,947,630);
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		signup =new JButton("SIGN UP");
		signup.setBounds(670,33,100,40);
		f1 = new Font("Times New Roman", Font.ITALIC, 15);
        signup.setFont(f1);
		signup.setForeground(Color.ORANGE);
		c1 = new Color(54, 69, 79);
		signup.setBackground(c1);
		signup.addMouseListener(this);
		signup.addActionListener(this);
		panel.add(signup);
		
		
		
		
		
		
		
		login=new JButton("LOGIN");
		login.setBounds(795,33,100,40);
		f1 = new Font("Times New Roman", Font.ITALIC, 15);
        login.setFont(f1);
		login.setForeground(Color.ORANGE);
		c1 = new Color(54, 69, 79);
		login.setBackground(c1);
		login.addMouseListener(this);
		login.addActionListener(this);
		panel.add(login);
		
		
		exit=new JButton("EXIT");
		exit.setBounds(0,540,100,40);
		exit.setBounds(100,540,100,40);
		f1 = new Font("Times New Roman", Font.ITALIC, 15);
        exit.setFont(f1);
		exit.setForeground(Color.ORANGE);
		c1 = new Color(54, 69, 79);
		exit.setBackground(c1);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		panel.add(exit);
		
		
		admin =new JButton("Admin Panel");
		admin.setBounds(170,33,120,40);
		f1 = new Font("Times New Roman", Font.ITALIC, 15);
       admin.setFont(f1);
		admin.setForeground(Color.ORANGE);
		c1 = new Color(54, 69, 79);
		admin.setBackground(c1);
		admin.addMouseListener(this);
		admin.addActionListener(this);
		panel.add(admin);
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		ic = new ImageIcon("img1.JPG");
		label23 = new JLabel(ic) ;
		label23.setBounds(0,0,947,600);
		panel.add(label23);
		
		
		
		
		
		
		
		
		
		super.add(panel);
		
		
		
	}
	 public void mouseClicked(MouseEvent me){}
	 public void mousePressed(MouseEvent me) {}
     public void mouseReleased(MouseEvent me) {}
     public void mouseEntered(MouseEvent me) 
	 {
		 if(me.getSource()==login)
		{
			c4 = new Color(121, 123, 83);
		  login.setBackground(c4);
			//login.setBackground(Color.RED);
		}
		else if(me.getSource()==signup)
		{
			c3 = new Color(80, 150, 114);
		  signup.setBackground(c3);
			//signup.setBackground(Color.BLUE);
		}
		else if(me.getSource()==exit)
		{
			//c3 = new Color(80, 150, 114);
		  //exit.setBackground(c3);
			exit.setBackground(Color.RED);
		}
		else if(me.getSource()==admin)
		{
			//c3 = new Color(80, 150, 114);
		  //exit.setBackground(c3);
			admin.setBackground(Color.BLUE);
		}
		
	 }
     public void mouseExited(MouseEvent me) 
	 {
		 if(me.getSource()==login)
		{
			c2 = new Color(54, 69, 79);
		  login.setBackground(c2);
			//login.setBackground(Color.BLUE);
		}
		else if(me.getSource()==signup)
		{
			c2 = new Color(54, 69, 79);
		  signup.setBackground(c2);
			//signup.setBackground(Color.BLUE);
		}
		else if(me.getSource()==exit)
		{
			c8 = new Color(54, 69, 79);
		  exit.setBackground(c8);
			//exit.setBackground(Color.BLUE);
		}
		else if(me.getSource()==admin)
		{
			c3 = new Color(54, 69, 79);
		  admin.setBackground(c3);
			//admin.setBackground(Color.BLUE);
		}
	 }
	 public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == login)
		{
			Login obj3 =new Login();
			obj3.setVisible(true);
			this.setVisible(false);
		}
		else if (ae.getSource() == exit)
		{
			System.exit(0);
		}
		else  if (ae.getSource() == admin)
		{
			Admin obj4 = new Admin();
			obj4.setVisible(true);
			this.setVisible(false);
			
		}
		else if (ae.getSource() == signup)
		{
			Registration obj4 = new Registration();
			obj4.setVisible(true);
			this.setVisible(false);
		}
	}
}