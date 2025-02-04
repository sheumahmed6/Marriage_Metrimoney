import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements MouseListener,ActionListener
{
	private JLabel label,label1,label2,label3,label4;
	
	private JPanel panel;
	private JPasswordField pfield;
	private JTextField text;
	private String user; 
    private String pas;
	
	
	private Color c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	private ImageIcon ic;
	private Font f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14;
	private JButton backBtn,next;
	
	public Login()
	{
		super("LogIN");
		this.setBounds(320,120,760,445);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		c1 = new Color(61, 69, 79);
		panel.setBackground(c1);
		panel.setLayout(null);
		
		
		
		
		backBtn=new JButton("Back");
		backBtn.setBounds(30,360,80,30);
		backBtn.setForeground(Color.WHITE);
		c4 = new Color(54, 69, 79);
		backBtn.setBackground(c4);
		//backBtn.setOpaque(true);
		backBtn.addMouseListener(this);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		next=new JButton("Next >");
		next.setBounds(640,360,80,30);
		next.setForeground(Color.WHITE);
		c5 = new Color(54, 69, 79);
		next.setBackground(c5);
		//next.setBackground(Color.WHITE);
		//next.setOpaque(true);
		next.addMouseListener(this);
		next.addActionListener(this);
		panel.add(next);
		
		
		
		label2=new JLabel("LOGIN");
		label2.setBounds(230,40,300,30);
		f1 = new Font("Algerian", Font.BOLD, 25);
        label2.setFont(f1);
		label2.setForeground(Color.WHITE);
		panel.add(label2);
		
		label=new JLabel("User Name");
		label.setBounds(50,120,300,30);
		f1 = new Font("Times New Roman", Font.ITALIC, 18);
        label.setFont(f1);
		label.setForeground(Color.WHITE);
		panel.add(label);
		
		label3=new JLabel("______________________________");
		label3.setBounds(150,125,300,30);
		label3.setForeground(Color.WHITE);
		panel.add(label3);
		
		text= new JTextField();
		text.setBounds(150,116,200,30);
		c6 = new Color(54, 69, 79);
		text.setBackground(c6);
		text.setForeground(Color.WHITE);
		panel.add(text);
		
		label1=new JLabel("Password");
		label1.setBounds(50,180,300,30);
		f2 = new Font("Times New Roman", Font.ITALIC, 18);
        label1.setFont(f1);
		label1.setForeground(Color.WHITE);
		panel.add(label1);
		
		label4=new JLabel("______________________________");
		label4.setBounds(150,185,300,30);
		label4.setForeground(Color.WHITE);
		panel.add(label4);
		
		pfield = new JPasswordField();
		pfield.setBounds(150,176,200,30);
		c7 = new Color(54, 69, 79);
		pfield.setForeground(Color.WHITE);
		pfield.setBackground(c7);
		panel.add(pfield);
		
		
		
		ic = new ImageIcon("img3.JPG");
		label = new JLabel(ic) ;
		label.setBounds(5,-20,725,445);
		panel.add(label);
		
		

		this.add(panel);
	}
	
	 public void mouseClicked(MouseEvent me){}
	 public void mousePressed(MouseEvent me) {}
     public void mouseReleased(MouseEvent me) {}
	 public void mouseEntered(MouseEvent me)
	 {
		 if(me.getSource()==backBtn)
		{
			c4 = new Color(121, 123, 83);
		  backBtn.setBackground(c4);
			//login.setBackground(Color.RED);
		}
		else if(me.getSource()==next)
		{
			c3 = new Color(80, 150, 114);
		  next.setBackground(c3);
			//signup.setBackground(Color.BLUE);
		}
	 }
	 public void mouseExited(MouseEvent me)
	 {
		  if(me.getSource()==backBtn)
		{
			c2 = new Color(54, 69, 79);
		  backBtn.setBackground(c2);
			//login.setBackground(Color.BLUE);
		}
		else if(me.getSource()==next)
		{
			c2 = new Color(54, 69, 79);
		  next.setBackground(c2);
			//signup.setBackground(Color.BLUE);
		}
	 }
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == next)
		{
			String name="", email="",nid="";
			 user = text.getText();
			pas = pfield.getText();
			
			Account acc = new Account( name,  email, nid,user,pas);
			if(acc.checkAccount() == true)
			{
				JOptionPane.showMessageDialog(this,"Login Successfull");
				Basic obj1 = new Basic();
				obj1.setVisible(true);
				this.setVisible(false);
			}
			else 
			{
				JOptionPane.showMessageDialog(this,"Invalid");
			}
		}
		if(ae.getSource() == backBtn)
		{
			Welcome r1 = new Welcome();
			r1.setVisible(true);
			this.setVisible(false);
		}
	}
	}