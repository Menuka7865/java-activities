import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main extends JFrame {
    public Main() {
        setTitle("Login Page");

        JLabel userlabel1 = new JLabel("Username:");
        JTextField usertext = new JTextField(20);

        JLabel password = new JLabel("Password:");
        JPasswordField passwordText = new JPasswordField(20);

        JButton btn = new JButton("Login");

        JPanel panel = new JPanel(new GridLayout(3,2));

        panel.add(userlabel1);
        panel.add(usertext);
        panel.add(password);
        panel.add(passwordText);
        panel.add( new JLabel());
        panel.add(btn);

        add(panel,BorderLayout.CENTER);

        setSize(300,150);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usertext.getText();
                String password = new String(passwordText.getPassword());

                if(username.equals("admin") && password.equals("menuka123")){
                    JOptionPane.showMessageDialog(null,"Login Successful");
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}