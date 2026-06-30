
		import javax.swing.*;
		import java.awt.*;
		import java.awt.event.*;

		public class AmazonLogin extends JFrame implements ActionListener {

		    JLabel title, userLabel, passLabel;
		    JTextField userText;
		    JPasswordField passText;
		    JButton loginBtn, resetBtn;

		    AmazonLogin() {

		        setTitle("Amazon Login");
		        setSize(400, 300);
		        setLayout(null);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		        title = new JLabel("Amazon Login");
		        title.setFont(new Font("Arial", Font.BOLD, 20));
		        title.setBounds(120, 20, 200, 30);
		        add(title);

		        userLabel = new JLabel("Username:");
		        userLabel.setBounds(50, 80, 100, 25);
		        add(userLabel);

		        userText = new JTextField();
		        userText.setBounds(150, 80, 180, 25);
		        add(userText);

		        passLabel = new JLabel("Password:");
		        passLabel.setBounds(50, 120, 100, 25);
		        add(passLabel);

		        passText = new JPasswordField();
		        passText.setBounds(150, 120, 180, 25);
		        add(passText);

		        loginBtn = new JButton("Login");
		        loginBtn.setBounds(80, 180, 100, 30);
		        loginBtn.addActionListener(this);
		        add(loginBtn);

		        resetBtn = new JButton("Reset");
		        resetBtn.setBounds(210, 180, 100, 30);
		        resetBtn.addActionListener(this);
		        add(resetBtn);

		        setVisible(true);
		    }

		    public void actionPerformed(ActionEvent e) {

		        if (e.getSource() == loginBtn) {

		            String username = userText.getText();
		            String password = String.valueOf(passText.getPassword());

		            if (username.equals("admin") && password.equals("amazon123")) {
		                JOptionPane.showMessageDialog(this, "Login Successful!");
		            } else {
		                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
		            }

		        } else if (e.getSource() == resetBtn) {
		            userText.setText("");
		            passText.setText("");
		        }
		    }

		    public static void main(String[] args) {
		        new AmazonLogin();
		    }
		}

	}

}
