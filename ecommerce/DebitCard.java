package ecommerce;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DebitCard extends JInternalFrame {

	private JPanel contentPane;
	private JTextField txtDebitCardNumber;
	private JTextField txtMmyy;
	private JTextField txtExpireDate;
	private JTextField txtCvv;
	private JTextField txtNameOnCard;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DebitCard frame = new DebitCard();
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
	public DebitCard() {
		setBounds(10,0, 676, 515);
		BasicInternalFrameUI fi=(BasicInternalFrameUI)this.getUI();
		fi.setNorthPane(null);
		getContentPane().setLayout(null);
		
		JLabel lblDebitCard = new JLabel("DEBIT CARD");
		lblDebitCard.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDebitCard.setForeground(Color.BLUE);
		lblDebitCard.setBounds(10, 30, 134, 24);
		getContentPane().add(lblDebitCard);
		
		txtDebitCardNumber = new JTextField();
		txtDebitCardNumber.setText("CARD NUMBER");
		txtDebitCardNumber.setBounds(131, 94, 330, 20);
		getContentPane().add(txtDebitCardNumber);
		txtDebitCardNumber.setColumns(10);
		
		txtMmyy = new JTextField();
		txtMmyy.setEnabled(false);
		txtMmyy.setText("MM /YY");
		txtMmyy.setBounds(131, 142, 86, 20);
		getContentPane().add(txtMmyy);
		txtMmyy.setColumns(10);
		
		txtExpireDate = new JTextField();
		txtExpireDate.setEnabled(false);
		txtExpireDate.setEditable(false);
		txtExpireDate.setText("EXPIRY DATE");
		txtExpireDate.setBounds(227, 142, 86, 20);
		getContentPane().add(txtExpireDate);
		txtExpireDate.setColumns(10);
		
		txtCvv = new JTextField();
		txtCvv.setEnabled(false);
		txtCvv.setText("CVV");
		txtCvv.setBounds(375, 142, 86, 20);
		getContentPane().add(txtCvv);
		txtCvv.setColumns(10);
		
		txtNameOnCard = new JTextField();
		txtNameOnCard.setText("NAME ON CARD");
		txtNameOnCard.setBounds(131, 190, 330, 20);
		getContentPane().add(txtNameOnCard);
		txtNameOnCard.setColumns(10);
		
		JButton btnPay = new JButton("PAY");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no =txtDebitCardNumber.getText();
				String month=txtMmyy.getText();
				String cvv=txtCvv.getText();
				String Cname=txtNameOnCard.getText();
				if((no.equals(""))&&(month.equals(""))&&(cvv.equals(""))&&(Cname.equals(""))){
					JOptionPane.showMessageDialog(null, "Enter all the fields");
				}
				else
				JOptionPane.showMessageDialog(null,"Your Order has been Confirmed..Thankyou!!!");
			}
		});
		btnPay.setBounds(227, 236, 134, 23);
		getContentPane().add(btnPay);
		
		JLabel lblNewLabel = new JLabel("<html><p>Note: This card will be securely saved for a faster payment experience. CVV number will not be saved.</p></html>\r\n");
		lblNewLabel.setBounds(131, 270, 330, 33);
		getContentPane().add(lblNewLabel);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(227, 329, 134, 23);
		getContentPane().add(btnBack);
	}
}
