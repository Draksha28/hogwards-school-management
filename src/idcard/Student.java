package idcard;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student window = new Student();
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
	public Student() {
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
		
		JLabel lblLetter = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/letter.png")).getImage();
		lblLetter.setIcon(new ImageIcon(img));
		lblLetter.setBounds(257, 0, 605, 470);
		frame.getContentPane().add(lblLetter);
		
		JLabel lblwelcome = new JLabel("");
		lblwelcome.setHorizontalAlignment(SwingConstants.CENTER);
		Image img1 = new ImageIcon(this.getClass().getResource("/logow.png")).getImage();
		lblwelcome.setIcon(new ImageIcon(img1));
		lblwelcome.setBounds(0, 0, 258, 268);
		frame.getContentPane().add(lblwelcome);
		
		JLabel lblNote = new JLabel("NOTE");
		lblNote.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNote.setHorizontalAlignment(SwingConstants.CENTER);
		lblNote.setBounds(53, 260, 90, 35);
		frame.getContentPane().add(lblNote);
		
		JLabel lblpoint1 = new JLabel("Generate your Id-Card below :");
		lblpoint1.setHorizontalAlignment(SwingConstants.CENTER);
		lblpoint1.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblpoint1.setBounds(0, 279, 238, 62);
		frame.getContentPane().add(lblpoint1);
		
		JButton btnId = new JButton("Id-Card");
		btnId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Id_card window = new Id_card();
				window.frame.setVisible(true);
			}
		});
		btnId.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnId.setBounds(27, 325, 152, 48);
		frame.getContentPane().add(btnId);
		
		JLabel lblpoint2 = new JLabel("Fee-Payment ");
		lblpoint2.setHorizontalAlignment(SwingConstants.CENTER);
		lblpoint2.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblpoint2.setBounds(76, 378, 181, 27);
		frame.getContentPane().add(lblpoint2);
		
		JButton btnfee = new JButton("PAY");
		btnfee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				fee_payment window = new fee_payment();
				window.frame.setVisible(true);
			}
		});
		btnfee.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnfee.setBounds(149, 416, 89, 43);
		frame.getContentPane().add(btnfee);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Login window = new Login();
				window.frame.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBounds(10, 416, 117, 35);
		frame.getContentPane().add(btnBack);
	}
}
