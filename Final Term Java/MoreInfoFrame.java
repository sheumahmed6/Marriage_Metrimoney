import javax.swing.*;

public class MoreInfoFrame extends JFrame {
    public MoreInfoFrame() {
        // Frame settings
        setTitle("More Information");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Content
        JLabel infoLabel = new JLabel("<html><center><h2>Exclusive Information</h2><p>Here is the more information you paid for!</p></center></html>", SwingConstants.CENTER);
        
        add(infoLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MoreInfoFrame().setVisible(true));
    }
}
