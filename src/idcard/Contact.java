package idcard;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Contact {

	public JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldEmail;
	private JTextField textFieldNumber;
	private JTextField textFieldMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact window = new Contact();
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
	public Contact() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 878, 509);
		//frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbllogo = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		lbllogo.setIcon(new ImageIcon(img));
		lbllogo.setBounds(0, 68, 342, 413);
		frame.getContentPane().add(lbllogo);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 862, 54);
		frame.getContentPane().add(menuBar);
		
		JMenuItem mntmHome = new JMenuItem("HOME");
		mntmHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Main_Page window = new Main_Page();
				window.frame.setVisible(true);
			}
		});
		mntmHome.setBackground(UIManager.getColor("Button.darkShadow"));
		mntmHome.setHorizontalAlignment(SwingConstants.CENTER);
		mntmHome.setFont(new Font("Arial Black", Font.BOLD, 20));
		mntmHome.setForeground(new Color(0, 0, 0));
		menuBar.add(mntmHome);
		
		JMenuItem mntmAbout = new JMenuItem("ABOUT ");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				About_us window = new About_us();
				window.frame.setVisible(true);
			}
		});
		mntmAbout.setBackground(SystemColor.controlShadow);
		mntmAbout.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAbout.setFont(new Font("Arial Black", Font.BOLD, 20));
		menuBar.add(mntmAbout);
		
		JMenuItem mntmContact = new JMenuItem("CONTACT");
		mntmContact.setBackground(SystemColor.activeCaptionBorder);
		mntmContact.setFont(new Font("Arial Black", Font.BOLD, 20));
		mntmContact.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmContact);
		
		JLabel lblContact = new JLabel("CONTACT");
		lblContact.setForeground(Color.WHITE);
		lblContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblContact.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblContact.setBounds(456, 64, 224, 24);
		frame.getContentPane().add(lblContact);
		
		JLabel lblName = new JLabel("NAME ");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(407, 99, 107, 34);
		frame.getContentPane().add(lblName);
		
		JLabel lblEmail = new JLabel("E-MAIL");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(417, 144, 107, 40);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblNumber = new JLabel("PHONE NO.");
		lblNumber.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNumber.setForeground(Color.WHITE);
		lblNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumber.setBounds(401, 195, 113, 34);
		frame.getContentPane().add(lblNumber);
		
		JLabel lblQuery = new JLabel("YOUR MESSAGE");
		lblQuery.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblQuery.setForeground(Color.WHITE);
		lblQuery.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuery.setBounds(362, 250, 171, 34);
		frame.getContentPane().add(lblQuery);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(540, 99, 253, 24);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(541, 155, 262, 24);
		frame.getContentPane().add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldNumber = new JTextField();
		textFieldNumber.setBounds(540, 203, 171, 24);
		frame.getContentPane().add(textFieldNumber);
		textFieldNumber.setColumns(10);
		
		textFieldMessage = new JTextField();
		textFieldMessage.setBounds(543, 250, 287, 116);
		frame.getContentPane().add(textFieldMessage);
		textFieldMessage.setColumns(10);
		
		JButton btnmessage = new JButton("SEND MESSAGE");
		btnmessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Message Sent!");	
			}
		});
		btnmessage.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnmessage.setBounds(673, 390, 163, 40);
		frame.getContentPane().add(btnmessage);
		
		JLabel lblcontact = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/contact.png")).getImage();
		lblcontact.setIcon(new ImageIcon(img1));
		lblcontact.setBounds(352, 390, 48, 40);
		frame.getContentPane().add(lblcontact);
		
		JLabel lblNo = new JLabel("(605) 475-6961");
		lblNo.setForeground(Color.WHITE);
		lblNo.setFont(new Font("Arial Black", Font.BOLD, 10));
		lblNo.setBounds(407, 404, 107, 24);
		frame.getContentPane().add(lblNo);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 52, 852, 418);
		frame.getContentPane().add(panel);
	}
}
