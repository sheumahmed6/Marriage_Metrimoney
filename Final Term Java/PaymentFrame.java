import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentFrame extends JFrame implements ActionListener 
{
	private JPanel panel;
	private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,label20,label21,label22,label23;
    private JTextField cardNumberField;
    private JTextField cvvField;
    private JButton payButton, cancelButton;
    private Basic basicWindow; 
	private Color c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	private ImageIcon ic;

    public PaymentFrame(Basic basicWindow)
	{
        super("Payment page");
        setBounds(350, 80, 550, 320);
		
		panel=new JPanel();
		
		//c1 = new Color(14, 166, 145);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

        JLabel cardLabel = new JLabel("Card Number:");
        cardLabel.setBounds(50, 50, 100, 30);
        panel.add(cardLabel);

        cardNumberField = new JTextField();
        cardNumberField.setBounds(160, 50, 180, 30);
        add(cardNumberField);

        JLabel cvvLabel = new JLabel("CVV:");
        cvvLabel.setBounds(50, 100, 100, 30);
        add(cvvLabel);

        cvvField = new JTextField();
        cvvField.setBounds(160, 100, 50, 30);
        add(cvvField);

        payButton = new JButton("Pay");
        payButton.setBounds(50, 150, 120, 30);
        payButton.addActionListener(this);
        add(payButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(220, 150, 120, 30);
        cancelButton.addActionListener(this);
        add(cancelButton);
		
		ic = new ImageIcon("img11.JPG");
		label23 = new JLabel(ic) ;
		label23.setBounds(30,180,363,100);
		panel.add(label23);
		
		super.add(panel);
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == payButton) {
            String cardNumber = cardNumberField.getText();
            String cvv = cvvField.getText();

            
            if (cardNumber.matches("\\d{16}") && cvv.matches("\\d{3}")) {
                JOptionPane.showMessageDialog(this, "Payment Successful!");
                Basic.setPaymentDone(true);
				Basic obj3 =new Basic();
			obj3.setVisible(true);
			this.setVisible(false);
                dispose(); 
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Card Details! Try again.");
            }
        } else if (e.getSource() == cancelButton) {
			Basic obj3 =new Basic();
			obj3.setVisible(true);
			this.setVisible(false);
            
        }
    }
}
