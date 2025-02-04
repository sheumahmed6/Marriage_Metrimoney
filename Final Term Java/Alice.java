import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Alice extends JFrame implements ActionListener
{
	private JPanel panel;
	private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,label20,label21,label22,label23;
	private JTextField tf1,tf2,tf3,tf4,tf5;
	private JComboBox jb,jb1,jb2,jb3,jb4,jb5;
	private JPasswordField pf1,pf2;
	private JCheckBox jc1,jc2,jc3,jc4;
	private JButton back;
	private ImageIcon ic;
	
	private Font f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14;
	private Color c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	
	public Alice()
	{
		super.setBounds(350,20,730,620);
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		
		c1 = new Color(14, 166, 145);
		panel.setBackground(c1);
		panel.setLayout(null);
		
		
		
		label1 = new JLabel("Name     : Amelia");
		label1.setBounds(200, 200, 300, 100);
		label1.setForeground(Color.DARK_GRAY);
		panel.add(label1);
		
		label2 = new JLabel("Age        : 27 ");
		label2.setBounds(200, 230, 300, 100);
		label2.setForeground(Color.DARK_GRAY);
		panel.add(label2);
		
		
		label3 = new JLabel("Email     : amelia78@gmai.com ");
		label3.setBounds(200, 260, 300, 100);
		label3.setForeground(Color.DARK_GRAY);
		panel.add(label3);
		
		label4 = new JLabel("Religion   : cristian ");
		label4.setBounds(200, 290, 300, 100);
		label4.setForeground(Color.DARK_GRAY);
		panel.add(label4);
		
		label5 = new JLabel("Country    : UK ");
		label5.setBounds(200, 320, 300, 100);
		label5.setForeground(Color.DARK_GRAY);
		panel.add(label5);
		
		label6 = new JLabel("Profession : Teacher ");
		label6.setBounds(200, 350, 300, 100);
		label6.setForeground(Color.DARK_GRAY);
		panel.add(label6);
		
		label7 = new JLabel("Hobby        : Driving");
		label7.setBounds(200, 380, 300, 100);
		label7.setForeground(Color.DARK_GRAY);
		panel.add(label7);


		
		back=new JButton("Back");
		back.setBounds(0,0,100,25);
		c6 = new Color(14, 106, 145);
		back.setBackground(c6);
		back.setForeground(Color.ORANGE);
	    //back.addMouseListener(this);
		back.addActionListener(this);
		panel.add(back);
		
		ic = new ImageIcon("img8.JPG");
		label23 = new JLabel(ic) ;
		label23.setBounds(-80,-30,820,700);
		panel.add(label23);
		
		
		
		super.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == back)
		{
			Basic obj3 =new Basic();
			obj3.setVisible(true);
			this.setVisible(false);
		}
	}
}