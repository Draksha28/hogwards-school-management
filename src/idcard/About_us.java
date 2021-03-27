package idcard;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class About_us {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About_us window = new About_us();
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
	public About_us() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 878, 509);
		//frame.setBounds(100, 100, 897, 492);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 881, 54);
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
		mntmAbout.setBackground(SystemColor.controlShadow);
		mntmAbout.setHorizontalAlignment(SwingConstants.CENTER);
		mntmAbout.setFont(new Font("Arial Black", Font.BOLD, 20));
		menuBar.add(mntmAbout);
		
		JMenuItem mntmContact = new JMenuItem("CONTACT");
		mntmContact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Contact window = new Contact();
				window.frame.setVisible(true);
			}
		});
		mntmContact.setBackground(SystemColor.activeCaptionBorder);
		mntmContact.setFont(new Font("Arial Black", Font.BOLD, 20));
		mntmContact.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmContact);
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setHorizontalAlignment(SwingConstants.CENTER);
		lbllogo.setBackground(Color.BLACK);
		Image img = new ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		lbllogo.setIcon(new ImageIcon(img));
		lbllogo.setBounds(0, 51, 449, 402);
		frame.getContentPane().add(lbllogo);
		
		JLabel lblabout = new JLabel("");
		lblabout.setHorizontalAlignment(SwingConstants.TRAILING);
		Image img1 = new ImageIcon(this.getClass().getResource("/about_new.png")).getImage();
		lblabout.setIcon(new ImageIcon(img1));
		lblabout.setBounds(614, 59, 248, 411);
		frame.getContentPane().add(lblabout);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 51, 862, 419);
		frame.getContentPane().add(panel);
		

	}
}
