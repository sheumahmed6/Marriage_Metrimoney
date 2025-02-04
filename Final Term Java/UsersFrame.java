import javax.swing.*;
import java.awt.*;

public class UsersFrame extends JFrame {

    private JTextArea ta;

    public UsersFrame(String usersData) {
        super("Registered Users");
        setBounds(350, 80, 650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        ta = new JTextArea();
        ta.setText(usersData);
        ta.setEditable(false); 
        ta.setBounds(50, 50, 500, 300);

        JScrollPane scrollPane = new JScrollPane(ta);  
        scrollPane.setBounds(50, 50, 500, 300);

        add(scrollPane);

        setLayout(null);
        setVisible(true);  
    }
}
