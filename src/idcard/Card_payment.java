package idcard;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Card_payment {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Card_payment window = new Card_payment();
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
	public Card_payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 878, 509);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(39,50,786,397);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel cards = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/cards.png")).getImage();
		cards.setIcon(new ImageIcon(img1));
		cards.setBounds(0, 0, 370, 188);
		panel.add(cards);
		JLabel name = new JLabel("CARD HOLDER NAME");
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("Arial", Font.ITALIC, 18));
		name.setBounds(449,32,236,22);
		panel.add(name);
		JTextField txt_cardname = new JTextField();
		txt_cardname.setBounds(416, 76, 320, 33);
		panel.add(txt_cardname);
		txt_cardname.setColumns(10);
		JLabel number = new JLabel("CARD NUMBER");
		number.setHorizontalAlignment(SwingConstants.CENTER);
		number.setFont(new Font("Arial", Font.ITALIC, 18));
		number.setBounds(440, 120, 245, 24);
		panel.add(number);
		JTextField txt_cardnum = new JTextField();
		txt_cardnum.setBounds(416, 168, 323, 31);
		panel.add(txt_cardnum);
		txt_cardnum.setColumns(10);
		JLabel date = new JLabel("END DATE");
		date.setHorizontalAlignment(SwingConstants.CENTER);
		date.setFont(new Font("Arial", Font.ITALIC, 18));
		date.setBounds(172, 233, 156, 33);
		panel.add(date);
		JComboBox month = new JComboBox();
		month.setModel(new DefaultComboBoxModel(new String[] {"Month", "01", "02", "03", "04", "05", "06", "07", "08", "09","10","11","12"}));
		month.setBounds(167, 277, 85, 22);
		panel.add(month);
		JComboBox year = new JComboBox();
		year.setModel(new DefaultComboBoxModel(new String[] {"Year", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029"}));
		year.setBounds(262, 277, 93, 22);
		panel.add(year);
		JLabel cvv = new JLabel("CVV");
		cvv.setHorizontalAlignment(SwingConstants.CENTER);
		cvv.setFont(new Font("Arial", Font.ITALIC, 18));
		cvv.setBounds(440, 238, 93, 22);
		panel.add(cvv);
		JTextField txt_cvv = new JTextField();
		txt_cvv.setBounds(440, 278, 96, 20);
		panel.add(txt_cvv);
		txt_cvv.setColumns(10);
		JLabel icon = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
		icon.setIcon(new ImageIcon(img2));
		icon.setBounds(567, 244, 48, 55);
		panel.add(icon);
		JLabel information = new JLabel("3 Digits");
		information.setFont(new Font("Arial Black", Font.BOLD, 14));
		information.setBounds(639, 252, 93, 47);
		panel.add(information);
		JCheckBox chckbx = new JCheckBox("I accept the terms and conditions");
		chckbx.setHorizontalAlignment(SwingConstants.CENTER);
		chckbx.setBounds(10, 317, 747, 23);
		panel.add(chckbx);
		JButton pay = new JButton("PAY");
		pay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_cardname.getText().equals("") || txt_cardnum.getText().equals("") || month.getSelectedItem().equals("") ||year.getSelectedItem().equals("") || txt_cvv.getText().equals("") || chckbx.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "Please fill Complete Information");
					}
				else
				{
					JOptionPane.showMessageDialog(frame,"Payment Successful! Receipt will be sent to your e-mail");
				}
				
			}
		});
		pay.setFont(new Font("Arial Black", Font.BOLD, 16));
		pay.setBounds(457, 363, 89, 23);
		panel.add(pay);
		
		JButton back = new JButton("BACK");
		back.setFont(new Font("Arial Black", Font.BOLD, 16));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Pay window = new Pay();
				window.frame.setVisible(true);
			}
		});
		back.setBounds(102, 366, 89, 23);
		panel.add(back);
		
		
	}

}
