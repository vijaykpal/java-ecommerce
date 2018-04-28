package ecommerce;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JButton;

public class Payment extends JInternalFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment(DetailsDto dt,firstpage fp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-10,-10, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		BasicInternalFrameUI fi=(BasicInternalFrameUI)this.getUI();
		fi.setNorthPane(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.controlHighlight);
		desktopPane.setBounds(0, 0, 700,2000);
		contentPane.add(desktopPane);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBounds(0, 162, 676, 513);
		desktopPane.add(desktopPane_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnBack.setBounds(261, 27, 89, 23);
		desktopPane_1.add(btnBack);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 11, 666, 56);
		desktopPane.add(panel);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\v3.png"));
		label.setBounds(31, 0, 52, 49);
		panel.add(label);
		
		JLabel label_1 = new JLabel("vcart");
		label_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		label_1.setBounds(93, 10, 52, 28);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Need Help? Call 1800 123 4567");
		label_2.setBounds(143, 17, 209, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("<HTML><P>\r\nSECURE\r\nPAYMENTS\r\n</P></HTML>");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(415, 0, 64, 56);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("<HTML><P>\r\nORIGINAL\r\nPRODUCTS\r\n</P></HTML>");
		label_4.setBounds(489, 0, 64, 56);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("<HTML><P>\r\nEASY\r\nRETURN\r\n</P></HTML>");
		label_5.setBounds(563, 0, 64, 56);
		panel.add(label_5);
		
		JLabel lblPaymentMethod = new JLabel("PAYMENT METHOD");
		lblPaymentMethod.setForeground(Color.BLUE);
		lblPaymentMethod.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPaymentMethod.setBounds(20, 78, 185, 28);
		desktopPane.add(lblPaymentMethod);
		
		JRadioButton rdbtnNetBanking = new JRadioButton("NET BANKING");
		rdbtnNetBanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNetBanking.isSelected())
				{
					 
					desktopPane_1.add(new NetBanking()).setVisible(true);
			}
			
			}
		});
		rdbtnNetBanking.setBounds(30, 113, 109, 23);
		desktopPane.add(rdbtnNetBanking);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("DEBIT CARD");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected())
				desktopPane_1.add(new DebitCard()).setVisible(true);
			}
		});
		rdbtnNewRadioButton.setBounds(171, 113, 109, 23);
		desktopPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnPhonepe = new JRadioButton("PhonePe");
		rdbtnPhonepe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnPhonepe.isSelected())
					desktopPane_1.add(new Phonepe()).setVisible(true);
			}
		});
		rdbtnPhonepe.setBounds(314, 113, 109, 23);
		desktopPane.add(rdbtnPhonepe);
		
		JRadioButton rdbtnCashOnDelivery = new JRadioButton("CASH ON DELIVERY");
		rdbtnCashOnDelivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnCashOnDelivery.isSelected())
				{
					JOptionPane.showMessageDialog(null,"Your Order has been Confirmed..Thankyou!!!");
				}
			}
		});
		rdbtnCashOnDelivery.setBounds(450, 113, 155, 23);
		desktopPane.add(rdbtnCashOnDelivery);
		
		ButtonGroup gb=new ButtonGroup();
		gb.add(rdbtnNetBanking);
		gb.add(rdbtnNewRadioButton);
		gb.add(rdbtnPhonepe);
		gb.add(rdbtnCashOnDelivery);
		
		
}
}