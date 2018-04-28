package ecommerce;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.SystemColor;

public class DeliveryAdd extends JInternalFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryAdd frame = new DeliveryAdd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DeliveryAdd(DetailsDto dt,firstpage fp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-10, -10, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		BasicInternalFrameUI fi=(BasicInternalFrameUI)this.getUI();
		fi.setNorthPane(null);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(186, 296, 207, 20);
		contentPane.add(textField_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(186, 271, 207, 20);
		contentPane.add(textField_4);
		
		textField = new JTextField();
		textField.setBounds(186, 113, 207, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(186, 221, 207, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(186, 246, 207, 20);
		contentPane.add(textField_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(186, 321, 207, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(186, 349, 207, 20);
		contentPane.add(textField_7);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.controlHighlight);
		desktopPane.setBounds(0, 0, 700,2000);
		contentPane.add(desktopPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 11, 659, 56);
		desktopPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\v3.png"));
		lblNewLabel.setBounds(31, 0, 52, 49);
		panel.add(lblNewLabel);
		
		JLabel lblVcart = new JLabel("vcart");
		lblVcart.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblVcart.setBounds(93, 10, 52, 28);
		panel.add(lblVcart);
		
		JLabel lblNeedHelpCall = new JLabel("Need Help? Call 1800 123 4567");
		lblNeedHelpCall.setBounds(143, 17, 203, 14);
		panel.add(lblNeedHelpCall);
		
		JLabel lblNewLabel_2 = new JLabel("<HTML><P>\r\nSECURE\r\nPAYMENTS\r\n</P></HTML>");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(415, 0, 64, 56);
		panel.add(lblNewLabel_2);
		
		JLabel lblOriginalProducts = new JLabel("<HTML><P>\r\nORIGINAL\r\nPRODUCTS\r\n</P></HTML>");
		lblOriginalProducts.setBounds(489, 0, 64, 56);
		panel.add(lblOriginalProducts);
		
		JLabel lblNewLabel_3 = new JLabel("<HTML><P>\r\nEASY\r\nRETURN\r\n</P></HTML>");
		lblNewLabel_3.setBounds(563, 0, 64, 56);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("DELIVERY ADDRESS");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBackground(Color.MAGENTA);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(20, 78, 176, 27);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(52, 116, 109, 14);
		desktopPane.add(lblName);
		
		JLabel lblStreetAddress = new JLabel("STREET ADDRESS");
		lblStreetAddress.setBounds(52, 141, 97, 14);
		desktopPane.add(lblStreetAddress);
		
		JLabel lblLandmark = new JLabel("LANDMARK");
		lblLandmark.setBounds(52, 224, 109, 14);
		desktopPane.add(lblLandmark);
		
		JLabel lblCity = new JLabel("CITY");
		lblCity.setBounds(52, 249, 97, 14);
		desktopPane.add(lblCity);
		
		JLabel lblState = new JLabel("STATE");
		lblState.setBounds(52, 274, 97, 14);
		desktopPane.add(lblState);
		
		JLabel lblCountry = new JLabel("COUNTRY");
		lblCountry.setBounds(52, 299, 97, 14);
		desktopPane.add(lblCountry);
		
		JLabel lblPinCode = new JLabel("PIN CODE");
		lblPinCode.setBounds(52, 324, 97, 14);
		desktopPane.add(lblPinCode);
		
		JLabel lblMobileNumber = new JLabel("MOBILE NUMBER");
		lblMobileNumber.setBounds(52, 349, 97, 14);
		desktopPane.add(lblMobileNumber);
		
		JButton btnProceed = new JButton("PROCEED");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt1 =textField.getText();
				String txt2=textField_2.getText();
				String txt3=textField_3.getText();
				String txt4=textField_4.getText();
				String txt5=textField_5.getText();
				String txt6=textField_6.getText();
				String txt7=textField_7.getText();
				if((txt1.equals(""))&&(txt2.equals(""))&&(txt3.equals(""))&&(txt4.equals(""))&&(txt5.equals(""))&&(txt6.equals(""))&&(txt7.equals(""))){
					JOptionPane.showMessageDialog(null, "Enter all the fields");
				}
				else
				desktopPane.add(new Payment(dt,fp)).setVisible(true);
			}
		});
		btnProceed.setBounds(233, 398, 117, 32);
		desktopPane.add(btnProceed);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setLineWrap(true);
		textArea.setBounds(186, 136, 207, 74);
		desktopPane.add(textArea);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(87, 398, 109, 32);
		desktopPane.add(btnCancel);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(171, 456, 97, 32);
		desktopPane.add(btnBack);
	}
}
