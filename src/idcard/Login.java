package idcard;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends javax.swing.JFrame {
	
	int attempt=0;

	public JFrame frame;
	
	private final JPanel panel = new JPanel();
	private JTextField jtxtUsername;
	private JPasswordField jPassword;

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
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		//frame.setBounds(100, 100, 700, 500);
		frame.setBounds(100, 100, 878, 509);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Arial Black", Font.BOLD, 24));
		lblUsername.setBounds(205, 278, 169, 31);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Arial Black", Font.BOLD, 24));
		lblPassword.setBounds(205, 335, 169, 31);
		frame.getContentPane().add(lblPassword);
		
		jtxtUsername = new JTextField();
		jtxtUsername.setBounds(450, 284, 188, 31);
		frame.getContentPane().add(jtxtUsername);
		jtxtUsername.setColumns(10);
		
		jPassword = new JPasswordField();
		jPassword.setBounds(450, 341, 188, 31);
		frame.getContentPane().add(jPassword);
		
		JButton jbtnLogin = new JButton("Login");
		jbtnLogin.setBackground(Color.LIGHT_GRAY);
		jbtnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Username= jtxtUsername.getText();
				String Password= jPassword.getText();
				
				
				if (Password.contains("student") && Username.contains("student")) {
					
					jtxtUsername.setText(null);
					jPassword.setText(null);
					JOptionPane.showMessageDialog(frame,"Login Successful!");	
					frame.dispose();
					Student window = new Student();
					window.frame.setVisible(true);
				}
				else if (Password.contains("admin") && Username.contains("admin")) 
				{
					
					jtxtUsername.setText(null);
					jPassword.setText(null);
					JOptionPane.showMessageDialog(frame,"Login Successful!");	
					frame.dispose();
					Admin window = new Admin();
					window.frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid username or password","Login Error", JOptionPane.ERROR_MESSAGE);
					jtxtUsername.setText(null);
					jPassword.setText(null);
				}
			}
		});
		jbtnLogin.setFont(new Font("Arial Black", Font.BOLD, 15));
		jbtnLogin.setBounds(205, 403, 109, 31);
		frame.getContentPane().add(jbtnLogin);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.setBackground(Color.LIGHT_GRAY);
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Main_Page window = new Main_Page();
				window.frame.setVisible(true);
				
			}
		});
		jbtnExit.setFont(new Font("Arial Black", Font.BOLD, 15));
		jbtnExit.setBounds(532, 403, 109, 31);
		frame.getContentPane().add(jbtnExit);
		
		JLabel lbllogo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logow.png")).getImage();
		lbllogo.setIcon(new ImageIcon(img));
		lbllogo.setBounds(332, 24, 211, 232);
		frame.getContentPane().add(lbllogo);
		
	}
}

