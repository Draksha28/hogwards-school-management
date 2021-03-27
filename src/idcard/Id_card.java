package idcard;

import java.awt.Color;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileFilter;

//import project.ImageFilter;
import javax.swing.filechooser.FileFilter;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageFilter;
import java.awt.print.PrinterException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Id_card {

	public JFrame frame;
	private JTextField name;
	private JTextField DOB;
	private JTextField Gender;
	private JTextField House;
	private JTextField txt_name;
	private JTextField txt_dob;
	private JTextField txt_gender;
	private JTextField txt_house;
	private JTextField txt_blood_type;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Id_card window = new Id_card();
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
	public Id_card() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 878, 509);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel border = new JPanel();
		border.setBackground(Color.WHITE);
		border.setBorder(new LineBorder(new Color(0, 0, 0)));
		border.setBounds(0, 514, 886, 49);
		frame.getContentPane().add(border);
		border.setLayout(null);
		
		JPanel panel_above = new JPanel();
		panel_above.setBounds(0, 0, 862, 59);
		panel_above.setBackground(Color.BLACK);
		border.add(panel_above);
		
		JLabel lblName = new JLabel("Hogwarts School of Witchcraft and Wizardry");
		lblName.setFont(new Font("Vladimir Script", Font.BOLD, 35));
		lblName.setForeground(Color.WHITE);
		panel_above.add(lblName);
		
		JPanel panel_details = new JPanel();
		panel_details.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_details.setBounds(0, 59, 443, 374);
		border.add(panel_details);
		panel_details.setLayout(null);
		
		JLabel idcard = new JLabel("ID - CARD");
		idcard.setBounds(207, 5, 81, 23);
		idcard.setFont(new Font("Arial Black", Font.BOLD, 16));
		panel_details.add(idcard);
		
//		JLabel photo = new JLabel("PHOTO");
//		photo.setFont(new Font("Arial Black", Font.BOLD, 15));
//		photo.setBounds(60, 49, 72, 14);
//		panel_details.add(photo);
		
//		JButton upload = new JButton("UPLOAD");
//		final JLabel output = new JLabel();
//		upload.addActionListener(new ActionListener() {
//		     @Override
//		     public void actionPerformed(ActionEvent e) {
//		        JFileChooser fileChooser = new JFileChooser();
//		        //fileChooser.addChoosableFileFilter(new ImageFilter());
//		        fileChooser.setAcceptAllFileFilterUsed(false);
//
//		        int option = fileChooser.showOpenDialog(panel_details);
//		        
//		        if(option == JFileChooser.APPROVE_OPTION){
//		        	
//		           File file = fileChooser.getSelectedFile();
//		           //System.out.print(file.getName());
//		           output.setText("File Selected: " + file.getName());
//		        }else{
//		           output.setText("Open command canceled");
//		        }
//		     }
//		  });
//		    panel_details.add(output);
//		upload.setFont(new Font("Arial Black", Font.BOLD, 16));
//		upload.setBounds(174, 47, 114, 23);
//		panel_details.add(upload);
//		
//		class ImageFilter extends FileFilter
//		{
//			   public final static String JPEG = "jpeg";
//			   public final static String JPG = "jpg";
//			   public final static String GIF = "gif";
//			   public final static String TIFF = "tiff";
//			   public final static String TIF = "tif";
//			   public final static String PNG = "png";
//			   
//			   @Override
//			   public boolean accept(File f)
//			   {
//			      if (f.isDirectory())
//			      {
//			         return true;
//			      }
//
//			      String extension = getExtension(f);
//			      if (extension != null) 
//			      {
//			         if (extension.equals(TIFF) ||
//			            extension.equals(TIF) ||
//			            extension.equals(GIF) ||
//			            extension.equals(JPEG) ||
//			            extension.equals(JPG) ||
//			            extension.equals(PNG)) 
//			         {
//			            return true;
//			         } 
//			         else 
//			         {
//			            return false;
//			         }
//			      }
//			      return false;
//			   }
//
//			   @Override
//			   public String getDescription() 
//			   {
//			      return "Image Only";
//			   }
//
//			   String getExtension(File f) 
//			   {
//			      String ext = null;
//			      String s = f.getName();
//			      int i = s.lastIndexOf('.');
//			   
//			      if (i > 0 &&  i < s.length() - 1) 
//			      {
//			         ext = s.substring(i+1).toLowerCase();
//			      }
//			      return ext;
//			   } 
//		}
		
					
		JLabel Adm_no = new JLabel("ADM_NO");
		Adm_no.setFont(new Font("Arial Black", Font.BOLD, 16));
		Adm_no.setBounds(51, 101, 81, 14);
		panel_details.add(Adm_no);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "10011", "10012", "10013", "10014", "10015", "10016", "10017", "10018", "10019"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().equals("10011"))
				{
					txt_name.setText("Harry Potter");
					txt_dob.setText("06/07/2009");
					txt_gender.setText("Male");
					txt_house.setText("Gryffindor");
					txt_blood_type.setText("Pure Blood");
				}
				else if (comboBox.getSelectedItem().equals("10012"))
				{
					txt_name.setText("Ron Weasley");
					txt_dob.setText("12/09/2009");
					txt_gender.setText("Male");
					txt_house.setText("Gryffindor");
					txt_blood_type.setText("Pure Blood");
				}
				else if (comboBox.getSelectedItem().equals("10013"))
				{
					txt_name.setText("Draco Malfoy");
					txt_dob.setText("26/11/2009");
					txt_gender.setText("Male");
					txt_house.setText("Gryffindor");
					txt_blood_type.setText("Pure Blood");
				}
				else if (comboBox.getSelectedItem().equals("10014"))
				{
					txt_name.setText("Lucious Malfoy");
					txt_dob.setText("06/07/2009");
					txt_gender.setText("Male");
					txt_house.setText("Slytherin");
					txt_blood_type.setText("Pure Blood");
					
				}
				else if (comboBox.getSelectedItem().equals("10015"))
				{
					txt_name.setText("Hermione Granger");
					txt_dob.setText("27/10/2009");
					txt_gender.setText("Female");
					txt_house.setText("Gryffindor");
					txt_blood_type.setText("Mud Blood");
				}
				else if (comboBox.getSelectedItem().equals("10016"))
				{
					txt_name.setText("Luna Lovegood");
					txt_dob.setText("18/03/2009");
					txt_gender.setText("Female");
					txt_house.setText("Ravenclaw");	
					txt_blood_type.setText("Pure Blood");
				}
				else if (comboBox.getSelectedItem().equals("10017"))
				{

					txt_name.setText("Hannah Abbot");
					txt_dob.setText("23/08/2009");
					txt_gender.setText("Female");
					txt_house.setText("Hufflepuff");	
					txt_blood_type.setText("Half Blood");
				}
				else if (comboBox.getSelectedItem().equals("10018"))
				{

					txt_name.setText("Susan Bones");
					txt_dob.setText("19/09/2009");
					txt_gender.setText("Female");
					txt_house.setText("Hufflepuff");
					txt_blood_type.setText("Half Blood");
				}
				else if (comboBox.getSelectedItem().equals("10019"))
				{
					txt_name.setText("Sybill Trelawney");
					txt_dob.setText("13/06/2009");
					txt_gender.setText("Female");
					txt_house.setText("Ravenclaw");	
					txt_blood_type.setText("Half Blood");
				}
				else if (comboBox.getSelectedItem().equals("Select"))
				{
					txt_name.setText("");
					txt_dob.setText("");
					txt_gender.setText("");
					txt_house.setText("");			
				}
			}
		});
		comboBox.setBounds(150, 100, 96, 23);
		panel_details.add(comboBox);
		
		JLabel Name = new JLabel("NAME");
		Name.setFont(new Font("Arial Black", Font.BOLD, 15));
		Name.setBounds(60, 144, 56, 14);
		panel_details.add(Name);
		txt_name = new JTextField();
		txt_name.setBounds(135, 143, 153, 20);
		panel_details.add(txt_name);
		txt_name.setColumns(10);
		
		JLabel Dob = new JLabel("DOB");
		Dob.setFont(new Font("Arial Black", Font.BOLD, 16));
		Dob.setBounds(60, 189, 48, 14);
		panel_details.add(Dob);
		txt_dob = new JTextField();
		txt_dob.setBounds(135, 189, 96, 20);
		panel_details.add(txt_dob);
		txt_dob.setColumns(10);
		
		JLabel gender = new JLabel("GENDER");
		gender.setFont(new Font("Arial Black", Font.BOLD, 16));
		gender.setBounds(42, 236, 90, 14);
		panel_details.add(gender);
		txt_gender = new JTextField();
		txt_gender.setBounds(135, 236, 96, 20);
		panel_details.add(txt_gender);
		txt_gender.setColumns(10);
		
		JLabel house = new JLabel("HOUSE");
		house.setFont(new Font("Arial Black", Font.BOLD, 16));
		house.setBounds(42, 286, 74, 14);
		panel_details.add(house);
		txt_house = new JTextField();
		txt_house.setBounds(135, 286, 96, 20);
		panel_details.add(txt_house);
		txt_house.setColumns(10);
		
		JLabel Blood_type = new JLabel("BLOOD STATUS");
		Blood_type.setFont(new Font("Arial Black", Font.BOLD, 16));
		Blood_type.setBounds(10, 330, 161, 14);
		panel_details.add(Blood_type);
		txt_blood_type = new JTextField();
		txt_blood_type.setBounds(174, 330, 96, 20);
		panel_details.add(txt_blood_type);
		txt_blood_type.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(444, 59, 417, 42);
		panel_1.setBorder(new LineBorder(Color.WHITE, 3));
		panel_1.setBackground(new Color(255, 215, 0));
		border.add(panel_1);
		panel_1.setLayout(null);
		JLabel lblhogwart = new JLabel("Hogwarts School of Witchcraft and Wizardry");
		lblhogwart.setForeground(Color.BLACK);
		lblhogwart.setHorizontalAlignment(SwingConstants.CENTER);
		lblhogwart.setFont(new Font("Myanmar Text", Font.BOLD, 15));
		lblhogwart.setBounds(-1, 0, 416, 42);
		panel_1.add(lblhogwart);
		
		JPanel panel_display = new JPanel();
		panel_display.setBounds(442, 102, 420, 331);
		panel_display.setBorder(new LineBorder(Color.BLACK));
		border.add(panel_display);
		panel_display.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial Black", Font.BOLD, 15));
		textArea.setForeground(Color.BLACK);
		textArea.setBounds(10, 24, 400, 283);
		panel_display.add(textArea);
		
//		JLabel lblphoto = new JLabel("");
//		lblphoto.setBounds(52, 11, 325, 115);
//		panel_display.add(lblphoto);
		
		JPanel panel_below = new JPanel();
		panel_below.setBounds(0, 431, 862, 39);
		panel_below.setBorder(new LineBorder(Color.LIGHT_GRAY));
		border.add(panel_below);
		panel_below.setLayout(null);
		
		JButton btnpreview = new JButton("Preview");
		btnpreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Qty1 = (txt_name.getText());
				String Qty2 = (txt_dob.getText());
				String Qty3 = (txt_gender.getText());
				String Qty4 = (txt_house.getText());
				String Qty5 = (txt_blood_type.getText());
				
				textArea.setText("");
				textArea.append("\nName:\t\t" +Qty1
						+"\nDate of Birth:\t\t" +Qty2
						+"\nGender:\t\t" +Qty3
						+"\nHouse:\t\t" +Qty4
						+"\nBlood Status:\t\t" +Qty5						
						);
			}
		});
		btnpreview.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnpreview.setBounds(133, 11, 143, 23);
		panel_below.add(btnpreview);
		
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
		btnprint.setFont(new Font("Arial Black", Font.BOLD, 16));
		btnprint.setBounds(702, 11, 89, 23);
		panel_below.add(btnprint);
		
		JButton btnback = new JButton("BACK");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Student window = new Student();
				window.frame.setVisible(true);
			}
		});
		btnback.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnback.setBounds(490, 11, 104, 23);
		panel_below.add(btnback);
		
		
		
		
		
	}
}
