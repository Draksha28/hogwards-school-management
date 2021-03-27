package idcard;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.UIManager;

public class Main_Page {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Page window = new Main_Page();
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
	public Main_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 878, 509);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 862, 54);
		frame.getContentPane().add(menuBar);
		
		JMenuItem mntmHome = new JMenuItem("HOME");
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
		//Image img = new ImageIcon(this.getClass().getResource("/Hogwarts.jpg")).getImage();
		
		JLabel lblbanner = new JLabel("");
		lblbanner.setHorizontalAlignment(SwingConstants.CENTER);
		lblbanner.setBackground(Color.BLACK);
		Image img1 = new ImageIcon(this.getClass().getResource("/banner.png")).getImage();
		lblbanner.setIcon(new ImageIcon(img1));
		lblbanner.setBounds(0, 37, 221, 405);
		frame.getContentPane().add(lblbanner);
		
		JLabel lblcastle = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/castle.png")).getImage();
		lblcastle.setIcon(new ImageIcon(img2));
		lblcastle.setBounds(220, 52, 642, 374);
		frame.getContentPane().add(lblcastle);
		
		JLabel lblsklname = new JLabel("Hogwarts School of Witchcraft and Wizardry");
		lblsklname.setForeground(Color.WHITE);
		lblsklname.setVerticalAlignment(SwingConstants.BOTTOM);
		lblsklname.setHorizontalAlignment(SwingConstants.CENTER);
		lblsklname.setBackground(Color.WHITE);
		lblsklname.setFont(new Font("Gabriola", Font.BOLD, 24));
		lblsklname.setBounds(0, 426, 523, 44);
		frame.getContentPane().add(lblsklname);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Login window = new Login();
				window.frame.setVisible(true);
				
			}
		});
		btnLogin.setBackground(Color.GRAY);
		btnLogin.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnLogin.setBounds(728, 430, 124, 29);
		frame.getContentPane().add(btnLogin);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 52, 862, 418);
		frame.getContentPane().add(panel);
		
		}
}
