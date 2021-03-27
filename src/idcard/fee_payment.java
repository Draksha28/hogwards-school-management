package idcard;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.im.InputContext;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class fee_payment {

	public JFrame frame;
	private JTextField fee1;
	private JTextField fee2;
	private JTextField fee3;
	private JTextField fee4;
	private JTextField fee5;
	private Object comboBox;
	private JTextField txt_telescope;
	private JTextField txt_wand;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fee_payment window = new fee_payment();
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
	public fee_payment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 878, 509);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_above = new JPanel();
		panel_above.setBackground(Color.BLACK);
		panel_above.setBounds(0, 0, 862, 59);
		frame.getContentPane().add(panel_above);
		panel_above.setLayout(null);
		JLabel lblNewLabel = new JLabel("Hogwarts School of Witchcraft and Wizardry");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Vladimir Script", Font.BOLD, 35));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(104, 0, 657, 59);
		panel_above.add(lblNewLabel);
		
		JPanel panel_fee_details = new JPanel();
		panel_fee_details.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_fee_details.setBounds(0, 59, 443, 411);
		frame.getContentPane().add(panel_fee_details);
		panel_fee_details.setLayout(null);
		JLabel lblfee_details = new JLabel("FEE - DETAILS");
		lblfee_details.setHorizontalAlignment(SwingConstants.CENTER);
		lblfee_details.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblfee_details.setBounds(129, 0, 171, 29);
		panel_fee_details.add(lblfee_details);
		
		JLabel lbladm_no = new JLabel("ADM NO");
		lbladm_no.setFont(new Font("Arial Black", Font.BOLD, 16));
		lbladm_no.setBounds(48, 33, 84, 23);
		panel_fee_details.add(lbladm_no);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "10011", "10012", "10013", "10014", "10015", "10016", "10017", "10018", "10019"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().equals("10011"))
				{
					fee1.setText("1000");
					fee2.setText("2000");
					fee3.setText("2500");
					fee4.setText("5000");
					fee5.setText("2000");
				}
				else if (comboBox.getSelectedItem().equals("10012"))
				{
					fee1.setText("1000");
					fee2.setText("2000");
					fee3.setText("2500");
					fee4.setText("5000");
					fee5.setText("2000");
				}
				else if (comboBox.getSelectedItem().equals("10013"))
				{
					fee1.setText("1000");
					fee2.setText("2000");
					fee3.setText("2500");
					fee4.setText("5000");
					fee5.setText("2000");
				}
				else if (comboBox.getSelectedItem().equals("10014"))
				{
					fee1.setText("1000");
					fee2.setText("2000");
					fee3.setText("2500");
					fee4.setText("5000");
					fee5.setText("2000");
					
				}
				else if (comboBox.getSelectedItem().equals("10015"))
				{
					fee1.setText("1000");
					fee2.setText("2000");
					fee3.setText("2500");
					fee4.setText("5000");
					fee5.setText("2000");
				}
				else if (comboBox.getSelectedItem().equals("10016"))
				{
					fee1.setText("1000");
					fee2.setText("2000");
					fee3.setText("2500");
					fee4.setText("5000");
					fee5.setText("2000");
				}
				else if (comboBox.getSelectedItem().equals("10017"))
				{
					fee1.setText("1000");
					fee2.setText("2000");
					fee3.setText("2500");
					fee4.setText("5000");
					fee5.setText("2000");
				}
				else if (comboBox.getSelectedItem().equals("10018"))
				{
					fee1.setText("1000");
					fee2.setText("2000");
					fee3.setText("2500");
					fee4.setText("5000");
					fee5.setText("2000");
				}
				else if (comboBox.getSelectedItem().equals("10019"))
				{
					fee1.setText("1000");
					fee2.setText("2000");
					fee3.setText("2500");
					fee4.setText("5000");
					fee5.setText("2000");
				}
				else if (comboBox.getSelectedItem().equals("Select"))
				{
					fee1.setText("");
					fee2.setText("");
					fee3.setText("");
					fee4.setText("");
					fee5.setText("");
				}
			}
		});
		comboBox.setBounds(160, 36, 100, 22);
		panel_fee_details.add(comboBox);
		
		JLabel lblfee1 = new JLabel("Admission Fee");
		lblfee1.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblfee1.setBounds(10, 67, 143, 29);
		panel_fee_details.add(lblfee1);
		fee1 = new JTextField();
		fee1.setBounds(160, 69, 96, 20);
		panel_fee_details.add(fee1);
		fee1.setColumns(10);
		
		JLabel lblfee2 = new JLabel("Hostel Fee");
		lblfee2.setHorizontalAlignment(SwingConstants.CENTER);
		lblfee2.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblfee2.setBounds(10, 107, 129, 29);
		panel_fee_details.add(lblfee2);
		fee2 = new JTextField();
		fee2.setBounds(160, 113, 96, 23);
		panel_fee_details.add(fee2);
		fee2.setColumns(10);
		
		JLabel lblfee3 = new JLabel("Mess Fee");
		lblfee3.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblfee3.setHorizontalAlignment(SwingConstants.CENTER);
		lblfee3.setBounds(10, 147, 129, 23);
		panel_fee_details.add(lblfee3);
		fee3 = new JTextField();
		fee3.setBounds(160, 151, 96, 20);
		panel_fee_details.add(fee3);
		fee3.setColumns(10);
		
		JLabel lblfee4 = new JLabel("Uniform Fee");
		lblfee4.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblfee4.setHorizontalAlignment(SwingConstants.CENTER);
		lblfee4.setBounds(0, 181, 129, 23);
		panel_fee_details.add(lblfee4);
		fee4 = new JTextField();
		fee4.setBounds(160, 182, 96, 20);
		panel_fee_details.add(fee4);
		fee4.setColumns(10);
		
		JLabel lblfee5 = new JLabel("Library Fee");
		lblfee5.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblfee5.setHorizontalAlignment(SwingConstants.CENTER);
		lblfee5.setBounds(3, 214, 129, 23);
		panel_fee_details.add(lblfee5);
		fee5 = new JTextField();
		fee5.setBounds(160, 218, 96, 20);
		panel_fee_details.add(fee5);
		fee5.setColumns(10);
		
		JLabel equipment = new JLabel("Other Equipment:");
		equipment.setFont(new Font("Arial Black", Font.BOLD, 16));
		equipment.setHorizontalAlignment(SwingConstants.CENTER);
		equipment.setBounds(129, 248, 157, 29);
		panel_fee_details.add(equipment);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Wand(Wood)", "Unicorn Hair- $25", "Veela Hair- $45", "PhoenixTail Feathers- $50", "Dragon Heartstrings- $40", "Thestraltail Hair- $70"}));
		comboBox_1.setBounds(10, 325, 176, 27);
		panel_fee_details.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Telescope", "Hubble- $55", "Nebula- $65", "Odin- $40", "Planck- $60"}));		
		comboBox_2.setBounds(10, 288, 113, 29);
		panel_fee_details.add(comboBox_2);
		
		JPanel panel_reciept = new JPanel();
		panel_reciept.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_reciept.setBounds(442, 59, 420, 411);
		frame.getContentPane().add(panel_reciept);
		panel_reciept.setLayout(null);
		JLabel lblreciept = new JLabel("FEE - RECEIPT");
		lblreciept.setHorizontalAlignment(SwingConstants.CENTER);
		lblreciept.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblreciept.setBounds(136, 0, 183, 29);
		panel_reciept.add(lblreciept);
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Book Antiqua", Font.BOLD, 18));
		textArea.setBounds(24, 27, 368, 337);
		panel_reciept.add(textArea);
		
		JButton btnPreview = new JButton("PREVIEW");
		btnPreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty0 = comboBox.getSelectedItem().toString();
				int Qty1 = Integer.parseInt(fee1.getText());
				int Qty2 = Integer.parseInt(fee2.getText());
				int Qty3 = Integer.parseInt(fee3.getText());
				int Qty4 = Integer.parseInt(fee4.getText());
				int Qty5 = Integer.parseInt(fee5.getText());
				int Qty6 = Integer.parseInt(fee1.getText())+Integer.parseInt(fee2.getText())+Integer.parseInt(fee3.getText())+Integer.parseInt(fee4.getText())+Integer.parseInt(fee5.getText());
				int Qty7 = Integer.parseInt(txt_wand.getText());
				int Qty8 = Integer.parseInt(txt_telescope.getText());
				int Qty9 = Integer.parseInt(txt_wand.getText())+Integer.parseInt(txt_telescope.getText());		
				int Final = Qty6 + Qty9;
				textArea.setText("");
				textArea.append("    Admission Number: \t" +Qty0 +
						"\n\n    Admission Fee:\t"+Qty1
						+"\n     Hostel Fee:\t\t" +Qty2
						+"\n     Mess Fee:\t\t" +Qty3
						+"\n     Uniform Fee:\t" +Qty4
						+"\n     Library Fee:\t\t" +Qty5
						+"\n\n Total Fee:\t\t" +Qty6
						+"\n     Telescope Cost:\t" +Qty8
						+"\n     Wand Cost:\t\t" +Qty7
						+"\n     Other Materials Cost:\t" +Qty9
						+"\n\n  Final Fee(To be Paid):\t" +Final
						);
			}
		});
		btnPreview.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnPreview.setBounds(265, 359, 143, 37);
		panel_fee_details.add(btnPreview);
		
		txt_wand = new JTextField();
		txt_wand.setHorizontalAlignment(SwingConstants.CENTER);
		txt_wand.setBounds(326, 328, 96, 20);
		panel_fee_details.add(txt_wand);
		txt_wand.setColumns(10);
		JCheckBox chckbxwand = new JCheckBox("WAND");
		chckbxwand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxwand.isSelected()) {
                    txt_wand.setEnabled(true);
                    txt_wand.setText("");
                    txt_wand.requestFocus();
                }
                else {
                	txt_wand.setEnabled(false);
                	txt_wand.setText("0");
                }
			}
		});
		chckbxwand.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		chckbxwand.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxwand.setBounds(223, 326, 97, 23);
		panel_fee_details.add(chckbxwand);
		
		txt_telescope = new JTextField();
//		txt_telescope.addKeyListener(new KeyAdapter()
//		{
//			public void keyPressed(KeyEvent keyEvent)
//			{
//				
//			}
//			public void keyReleased(KeyEvent keyEvent)
//			{
//				if(Integer.parseInt(txt_telescope.getText())= "55" || "60" || "65" || "40")
//				{
//					txt_telescope.setText("");
//				}
//			}
//			public void keyTyped(KeyEvent keyEvent)
//			{
//				
//			}
//		});
		txt_telescope.setHorizontalAlignment(SwingConstants.CENTER);
		txt_telescope.setBounds(265, 288, 96, 20);
		panel_fee_details.add(txt_telescope);
		txt_telescope.setColumns(10);
		JCheckBox chckbxtelescope = new JCheckBox("TELESCOPE");
		chckbxtelescope.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxtelescope.isSelected()) {
                    txt_telescope.setEnabled(true);
                    txt_telescope.setText("");
                    txt_telescope.requestFocus();
                }
                else {
                	txt_telescope.setEnabled(false);
                	txt_telescope.setText("0");
                }
			}
		});
		chckbxtelescope.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxtelescope.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 15));
		chckbxtelescope.setBounds(129, 290, 124, 23);
		panel_fee_details.add(chckbxtelescope);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Student window = new Student();
				window.frame.setVisible(true);
			}
		});
		btnback.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnback.setBounds(48, 363, 116, 34);
		panel_fee_details.add(btnback);
		
		JButton btnprint = new JButton("PRINT");
		btnprint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {                     
					textArea.print();                 
				}
			catch (PrinterException ex) 
				{                     
					Logger.getLogger(Id_card.class.getName()).log(Level.SEVERE,null,ex);
				}
			}
		});
		btnprint.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnprint.setBounds(39, 375, 118, 25);
		panel_reciept.add(btnprint);
		
		JButton btnpay = new JButton("PAY");
		btnpay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Pay window = new Pay();
				window.frame.setVisible(true);
			}
		});
		btnpay.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnpay.setBounds(260, 375, 89, 23);
		panel_reciept.add(btnpay);
		
		
		
		
	}
}
