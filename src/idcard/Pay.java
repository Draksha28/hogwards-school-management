package idcard;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pay {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pay window = new Pay();
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
	public Pay() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(253, 245, 230));
		frame.setBackground(Color.PINK);
		frame.setBounds(100, 100, 878, 509);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel image = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logow.png")).getImage();
		image.setIcon(new ImageIcon(img));
		image.setBounds(0, 0, 211, 231);
		frame.getContentPane().add(image);
		
		JPanel PANEL1 = new JPanel();
		PANEL1.setBackground(Color.WHITE);
		PANEL1.setBounds(255, 39, 570, 397);
		frame.getContentPane().add(PANEL1);
		PANEL1.setVisible(false);
		JLabel lblpaytm = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/ptm.png")).getImage();
		lblpaytm.setIcon(new ImageIcon(img1));
		lblpaytm.setBounds(0, 0, 220, 186);
		lblpaytm.setFont(new Font("Times New Roman", Font.BOLD, 15));
		PANEL1.add(lblpaytm);		
		JLabel lblscan1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/scan1.png")).getImage();
		lblscan1.setIcon(new ImageIcon(img2));
		lblscan1.setBounds(301, 11, 180, 180);
		PANEL1.add(lblscan1);
		JLabel lblsteps = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/steps.png")).getImage();
		lblsteps.setIcon(new ImageIcon(img3));
		lblsteps.setBounds(20, 197, 540, 189);
		PANEL1.add(lblsteps);
		
		JPanel PANEL2 = new JPanel();
		PANEL2.setBackground(SystemColor.textHighlight);
		PANEL2.setBounds(255, 39, 570, 397);
		frame.getContentPane().add(PANEL2);
		PANEL2.setVisible(false);
		JLabel lblgpay = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/gpay.png")).getImage();
		lblgpay.setIcon(new ImageIcon(img4));
		lblgpay.setBounds(0, 0, 220, 186);
		lblgpay.setFont(new Font("Times New Roman", Font.BOLD, 15));
		PANEL2.add(lblgpay);		
		JLabel lblscan2 = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/scan2.png")).getImage();
		lblscan2.setIcon(new ImageIcon(img5));
		lblscan2.setBounds(301, 11, 180, 180);
		PANEL2.add(lblscan2);
		JLabel lbl_steps = new JLabel("");
		Image img6 = new ImageIcon(this.getClass().getResource("/steps.png")).getImage();
		lbl_steps.setIcon(new ImageIcon(img6));
		lbl_steps.setBounds(20, 197, 540, 189);
		PANEL2.add(lbl_steps);
		
//		JPanel PANEL3 = new JPanel();
//		PANEL3.setBackground(Color.CYAN);
//		PANEL3.setBounds(255, 39, 570, 397);
//		frame.getContentPane().add(PANEL3);
//		PANEL3.setVisible(false);
					
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 231, 211, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JLabel payment_options = new JLabel("PAYMENT-OPTIONS");
		payment_options.setHorizontalAlignment(SwingConstants.CENTER);
		payment_options.setFont(new Font("Arial Black", Font.BOLD, 16));
		payment_options.setForeground(Color.WHITE);
		payment_options.setBounds(10, 11, 191, 14);
		panel.add(payment_options);
		JButton paytm = new JButton("PAYTM");
		paytm.setBounds(56, 52, 89, 23);
		panel.add(paytm);
		paytm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				PANEL1.setVisible(true);
				PANEL2.setVisible(false);
				//PANEL3.setVisible(false);
			}
		});
		paytm.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		paytm.setBackground(Color.GRAY);
		JButton gpay = new JButton("GPAY");
		gpay.setBounds(56, 110, 89, 23);
		panel.add(gpay);
		gpay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PANEL1.setVisible(false);
				PANEL2.setVisible(true);
				//PANEL3.setVisible(false);
			}
		});
		gpay.setBackground(Color.GRAY);
		gpay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		JButton card = new JButton("CARD");
		card.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Card_payment window = new Card_payment();
				window.frame.setVisible(true);
			}
		});
		card.setBounds(56, 161, 89, 23);
		panel.add(card);
		card.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		card.setBackground(Color.GRAY);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				fee_payment window = new fee_payment();
				window.frame.setVisible(true);
			}
		});
		btnback.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnback.setBounds(490, 447, 106, 23);
		frame.getContentPane().add(btnback);
	}
}
