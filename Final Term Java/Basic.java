import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Basic extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton about, about1, about2, about3, back;
	private ImageIcon ic;
    private static boolean paymentDone = false; 
    private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,label20,label21,label22,label23;
	private Color c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;

    public Basic() {
        super("All Users");
        setBounds(350, 20, 730, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
		c1 = new Color(14, 166, 145);
		panel.setBackground(c1);
		panel.setLayout(null);
        //panel.setLayout(null);

        

        about = new JButton("More Info");
        about.setBounds(230, 225, 100, 25);
		c2 = new Color(14, 166, 145);
		about.setBackground(c1);
        about.addActionListener(this);
        panel.add(about);

        about1 = new JButton("More Info");
        about1.setBounds(480, 225, 100, 25);
		c3 = new Color(14, 166, 145);
		about1.setBackground(c3);
        about1.addActionListener(this);
        panel.add(about1);

        about2 = new JButton("More Info");
        about2.setBounds(230, 500, 100, 25);
		c4 = new Color(14, 166, 145);
		about2.setBackground(c1);
        about2.addActionListener(this);
        panel.add(about2);

        about3 = new JButton("More Info");
        about3.setBounds(480, 500, 100, 25);
		c5 = new Color(14, 166, 145);
		about3.setBackground(c5);
        about3.addActionListener(this);
        panel.add(about3);

        back = new JButton("Back");
        back.setBounds(350, 540, 100, 25);
        back.addActionListener(this);
        panel.add(back);
		
		ic = new ImageIcon("img6.JPG");
		label23 = new JLabel(ic) ;
		label23.setBounds(-130,-250,1080,1080);
		panel.add(label23);
        add(panel);
    }

    
    public static void setPaymentDone(boolean status) {
        paymentDone = status;
        JOptionPane.showMessageDialog(null, "Payment confirmed! You can now access More Info.");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // If payment is done, show "More Info"
        if (ae.getSource() == about || ae.getSource() == about1 || ae.getSource() == about2 || ae.getSource() == about3) {
            if (paymentDone) {
                JOptionPane.showMessageDialog(this, "Now you can see More Info!");
                if (ae.getSource() == about) {
                    new Alice().setVisible(true); 
					this.setVisible(false);
                } else if (ae.getSource() == about1) {
                    new Amelia().setVisible(true);  
					this.setVisible(false);
                } else if (ae.getSource() == about2) {
                    new Tony().setVisible(true);  
					this.setVisible(false);
                } else if (ae.getSource() == about3) {
                    new Samir().setVisible(true);
                    this.setVisible(false);					
                }
            } else {
                JOptionPane.showMessageDialog(this, "You need to pay 10$ to see More Info!");
                new PaymentFrame(this).setVisible(true); 
				 this.setVisible(false);
            }
        }
        
        else if (ae.getSource() == back) {
			if (paymentDone) {
    
    int response = JOptionPane.showConfirmDialog(this, 
        "You want to get ?If you back you need to pay 10$ again to see more info!", 
        "Confirmation", 
        JOptionPane.YES_NO_OPTION);

    if (response == JOptionPane.YES_OPTION) {
        
        Login obj4 = new Login();
        obj4.setVisible(true);
        this.setVisible(false);  
    } else {
        Basic obj4 = new Basic();
        obj4.setVisible(true);
        this.setVisible(false);
        
    }
} else {
    
    Login obj4 = new Login();
    obj4.setVisible(true);
    this.setVisible(false);  
}

        }
    }

    
}
