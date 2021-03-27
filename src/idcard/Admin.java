package idcard;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Admin {

	public JFrame frame;
	private JTextField txt_adm;
	private JTextField txt_name;
	private JTextField txt_dob;
	private JTextField txt_gender;
	private JTextField txt_house;
	private JTextField txt_bloodstats;
	private JTable table;
	DefaultTableModel model;
	private JButton add;
	private JButton update;
	private JButton delete;
	private JButton clear;
	private JScrollPane scrollPane;
	private JButton back;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
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
	public Admin() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 862, 470);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel adm_no = new JLabel("ADM NO.");
		adm_no.setFont(new Font("Arial Black", Font.BOLD, 14));
		adm_no.setBounds(10, 94, 81, 28);
		panel.add(adm_no);
		
		JLabel name = new JLabel("NAME");
		name.setFont(new Font("Arial Black", Font.BOLD, 14));
		name.setBounds(10, 133, 81, 21);
		panel.add(name);
		
		JLabel dob = new JLabel("DOB");
		dob.setFont(new Font("Arial Black", Font.BOLD, 14));
		dob.setBounds(10, 165, 66, 21);
		panel.add(dob);
		
		JLabel gender = new JLabel("GENDER");
		gender.setFont(new Font("Arial Black", Font.BOLD, 14));
		gender.setBounds(10, 197, 81, 21);
		panel.add(gender);
		
		JLabel house = new JLabel("HOUSE");
		house.setFont(new Font("Arial Black", Font.BOLD, 14));
		house.setBounds(10, 229, 81, 21);
		panel.add(house);
		
		JLabel blood_status = new JLabel("BLOOD STATUS");
		blood_status.setFont(new Font("Arial Black", Font.BOLD, 14));
		blood_status.setBounds(10, 261, 144, 21);
		panel.add(blood_status);
		
		JLabel data = new JLabel("DATA ENTRY");
		data.setHorizontalAlignment(SwingConstants.CENTER);
		data.setFont(new Font("Arial Black", Font.BOLD, 16));
		data.setBounds(345, 11, 146, 28);
		panel.add(data);
		
		txt_adm = new JTextField();
		txt_adm.setBounds(143, 94, 96, 20);
		panel.add(txt_adm);
		txt_adm.setColumns(10);
		
		txt_name = new JTextField();
		txt_name.setBounds(143, 135, 96, 20);
		panel.add(txt_name);
		txt_name.setColumns(10);
		
		txt_dob = new JTextField();
		txt_dob.setBounds(143, 167, 96, 20);
		panel.add(txt_dob);
		txt_dob.setColumns(10);
		
		txt_gender = new JTextField();
		txt_gender.setBounds(143, 199, 96, 20);
		panel.add(txt_gender);
		txt_gender.setColumns(10);
		
		txt_house = new JTextField();
		txt_house.setBounds(143, 231, 96, 20);
		panel.add(txt_house);
		txt_house.setColumns(10);
		
		txt_bloodstats = new JTextField();
		txt_bloodstats.setBounds(143, 263, 96, 20);
		panel.add(txt_bloodstats);
		txt_bloodstats.setColumns(20);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(249, 91, 613, 346);
		panel.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				txt_adm.setText(model.getValueAt(i,0).toString());
				txt_name.setText(model.getValueAt(i,1).toString());
				txt_dob.setText(model.getValueAt(i,2).toString());
				txt_gender.setText(model.getValueAt(i,3).toString());
				txt_house.setText(model.getValueAt(i,4).toString());
				txt_bloodstats.setText(model.getValueAt(i,5).toString());
			}
		});
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		model = new DefaultTableModel();
		Object[] column = {"ADM NO.","NAME","DOB","GENDER","HOUSE","BLOOD STATUS"};
		Object[] row = new Object[10];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		table.setBackground(new Color(255, 250, 205));
		scrollPane.setViewportView(table);
		
		add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt_adm.getText().equals("") || txt_name.getText().equals("") || txt_dob.getText().equals("") || txt_gender.getText().equals("") || txt_house.getText().equals("") || txt_bloodstats.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please fill Complete Information");
				}
				else
				{
					row[0] = txt_adm.getText();
					row[1] = txt_name.getText();
					row[2] = txt_dob.getText();
					row[3] = txt_gender.getText();
					row[4] = txt_house.getText();
					row[5] = txt_bloodstats.getText();
					model.addRow(row);
			
					txt_adm.setText("");
					txt_name.setText("");
					txt_dob.setText("");
					txt_gender.setText("");
					txt_house.setText("");
					txt_bloodstats.setText("");
					JOptionPane.showMessageDialog(null, "Saved Successfully!");
				}
			}
		});
		add.setFont(new Font("Arial Black", Font.BOLD, 15));
		add.setBounds(10, 323, 89, 23);
		panel.add(add);
		
		JButton update = new JButton("UPDATE");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int i = table.getSelectedRow();
			if(i>=0) {
			model.setValueAt(txt_adm.getText(),i,0);
			model.setValueAt(txt_name.getText(),i,1);
			model.setValueAt(txt_dob.getText(),i,2);
			model.setValueAt(txt_gender.getText(),i,3);
			model.setValueAt(txt_house.getText(),i,4);
			model.setValueAt(txt_bloodstats.getText(),i,5);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Please Select a Row First");
			}
			}
		});
		update.setFont(new Font("Arial Black", Font.BOLD, 15));
		update.setBounds(132, 323, 112, 23);
		panel.add(update);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int i = table.getSelectedRow();
			if(i>=0)
			{
				model.removeRow(i);
				JOptionPane.showMessageDialog(null, "Deleted Successfully!");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Please Select a Row First");
			}
			}
		});
		delete.setFont(new Font("Arial Black", Font.BOLD, 15));
		delete.setBounds(10, 375, 104, 23);
		panel.add(delete);
		
		clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txt_adm.setText("");
			txt_name.setText("");
			txt_dob.setText("");
			txt_gender.setText("");
			txt_house.setText("");
			txt_bloodstats.setText("");
			}
		});
		clear.setFont(new Font("Arial Black", Font.BOLD, 15));
		clear.setBounds(132, 375, 112, 23);
		panel.add(clear);
		
		back = new JButton("BACK");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					frame.dispose();
					Login window = new Login();
					window.frame.setVisible(true);
				}
		
		});
		back.setFont(new Font("Arial Black", Font.BOLD, 15));
		back.setBounds(65, 424, 89, 23);
		panel.add(back);
	}
}
