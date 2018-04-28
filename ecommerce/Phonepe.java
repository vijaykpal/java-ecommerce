package ecommerce;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Phonepe extends JInternalFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Phonepe frame = new Phonepe();
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
	public Phonepe() {
		setBounds(10,0, 676, 515);
		BasicInternalFrameUI fi=(BasicInternalFrameUI)this.getUI();
		fi.setNorthPane(null);
		getContentPane().setLayout(null);
		
		JLabel lblPhonepe = new JLabel("PhonePe");
		lblPhonepe.setForeground(Color.BLUE);
		lblPhonepe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhonepe.setBounds(22, 33, 113, 26);
		getContentPane().add(lblPhonepe);
		
		JLabel lblPayUsingUpi = new JLabel("PAY USING UPI");
		lblPayUsingUpi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPayUsingUpi.setBounds(216, 59, 137, 26);
		getContentPane().add(lblPayUsingUpi);
		
		JLabel lblEnterMobileNumber = new JLabel("ENTER MOBILE NUMBER");
		lblEnterMobileNumber.setBounds(99, 124, 142, 14);
		getContentPane().add(lblEnterMobileNumber);
		
		textField = new JTextField();
		textField.setBounds(271, 121, 137, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterUpi = new JLabel("ENTER UPI ");
		lblEnterUpi.setBounds(99, 171, 113, 14);
		getContentPane().add(lblEnterUpi);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(271, 168, 137, 20);
		getContentPane().add(passwordField);
		
		JButton btnPay = new JButton("PAY");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String mobile=textField.getText();
				String pass=String.valueOf(passwordField.getPassword());
				if((mobile.equals(""))&&(pass.equals(""))){
					JOptionPane.showMessageDialog(null, "Enter all the fields");
				}
				else JOptionPane.showMessageDialog(null, "Your order has been confirmed");
			}
		});
		btnPay.setBounds(199, 220, 137, 23);
		getContentPane().add(btnPay);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnBack.setBounds(199, 270, 137, 23);
		getContentPane().add(btnBack);
	}
}
