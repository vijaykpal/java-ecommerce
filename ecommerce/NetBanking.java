package ecommerce;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class NetBanking extends JInternalFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	DetailsDto dt;
	firstpage fp;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetBanking frame = new NetBanking();
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
	public NetBanking() {
		setBounds(10,0, 676, 515);
		BasicInternalFrameUI fi=(BasicInternalFrameUI)this.getUI();
		fi.setNorthPane(null);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NET BANKING");
		lblNewLabel.setBounds(10, 30, 211, 27);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblNewLabel);
		
		JLabel lblSelectBank = new JLabel("SELECT BANK");
		lblSelectBank.setBounds(140, 78, 114, 14);
		getContentPane().add(lblSelectBank);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SBI", "PNB", "BOB", "HDFC", "AXIS", "ICICI", "UCO"}));
		comboBox.setBounds(398, 75, 176, 20);
		getContentPane().add(comboBox);
		
		JLabel lblUserId = new JLabel("USER ID");
		lblUserId.setBounds(140, 120, 46, 14);
		getContentPane().add(lblUserId);
		
		textField = new JTextField();
		textField.setBounds(398, 106, 176, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(140, 162, 114, 14);
		getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(398, 137, 174, 20);
		getContentPane().add(passwordField);
		
		JButton btnPay = new JButton("PAY");
		btnPay.setBounds(193, 215, 166, 23);
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField.getText();
				String pass=String.valueOf(passwordField.getPassword());
				if((id.equals(""))||(pass.equals(""))){
					JOptionPane.showMessageDialog(null, "Enter all the fields");
				}
				else
				JOptionPane.showMessageDialog(null,"Your Order has been Confirmed..Thankyou!!!");
			   // fp=new firstpage(dt);
				
			//fp.setVisible(true);
			
			}
			});
		getContentPane().add(btnPay);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(398, 215, 176, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		getContentPane().add(btnBack);

	}
}
