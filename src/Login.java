import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;
	private JLabel lblUserId;
	private JLabel lblPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 683);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel mainLabel = new JLabel("New label");
		mainLabel.setBounds(0, -11, 982, 647);
		
		Image img = new ImageIcon(this.getClass().getResource("/home_blur.png")).getImage();
		
		textField = new JTextField();
		textField.setToolTipText("Enter unique username");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		textField.setBounds(342, 337, 298, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter password");
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		passwordField.setBounds(342, 393, 298, 34);
		frame.getContentPane().add(passwordField);
		
		JLabel userIconlbl = new JLabel();
		userIconlbl.setBounds(426, 169, 130, 128);
		Image usr = new ImageIcon(this.getClass().getResource("/user.png")).getImage(); //pic declare
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setToolTipText("Click if you are already registered");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(433, 447, 97, 34);
		frame.getContentPane().add(btnLogin);
		
		JButton btnSignUp = new JButton("Register");
		btnSignUp.setToolTipText("Click to register as a new user");
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSignUp.setBounds(433, 511, 97, 34);
		frame.getContentPane().add(btnSignUp);
		
		lblUserId = new JLabel("User ID:");
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUserId.setBounds(243, 343, 79, 16);
		frame.getContentPane().add(lblUserId);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblPassword.setBounds(226, 399, 95, 16);
		frame.getContentPane().add(lblPassword);
		userIconlbl.setIcon(new ImageIcon(usr));
		
		frame.getContentPane().add(userIconlbl);
		mainLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().add(mainLabel);
	}
}
