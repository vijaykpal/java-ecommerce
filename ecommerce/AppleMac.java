package ecommerce;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class AppleMac extends JInternalFrame {

	private JPanel contentPane;
	private JTextField textField;
	static DetailsDto dt;
	JLabel label_2;
	CartDto ct=new CartDto();

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppleMac frame = new AppleMac();
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
	public AppleMac(DetailsDto dt,firstpage fp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-10,-10,700,700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		BasicInternalFrameUI fi=(BasicInternalFrameUI)this.getUI();
		fi.setNorthPane(null);
		
     	JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.scrollbar);
		desktopPane.setBounds(0, 0, 700,2000);
		contentPane.add(desktopPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.MAGENTA);
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 11, 649, 58);
		desktopPane.add(panel);
		
		label_2 = new JLabel(dt.getName());
		label_2.setBounds(511, 12, 106, 40);
		panel.add(label_2);
		
		JLabel label = new JLabel("vcart");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Sylfaen", Font.ITALIC, 18));
		label.setBounds(59, 27, 68, 25);
		panel.add(label);
		
		textField = new JTextField();
		textField.setText("search your products here");
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(111, 27, 197, 20);
		panel.add(textField);
		
		JButton button = new JButton("search");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setBounds(306, 26, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("cart");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Cart(ct).setVisible(true);
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.PINK);
		button_1.setBounds(405, 12, 68, 40);
		panel.add(button_1);
		
		JButton button_2 = new JButton("sign in/up");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signin sign=new signin(fp);
				sign.setVisible(true);
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(Color.PINK);
		button_2.setBounds(483, 12, 98, 41);
		if(label_2.getText().equals(""))
		{
		panel.add(button_2);
		}
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\v3.png"));
		label_1.setBounds(10, 2, 56, 58);
		panel.add(label_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\apple-macbook-pro1-notebook-original-imaepfvjzzbnv5xk.jpeg"));
		lblNewLabel.setBounds(20, 80, 318, 303);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apple MacBook Pro Core i7");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(348, 82, 241, 26);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rs 2,25,000");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(348, 105, 131, 26);
		desktopPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(345, 129, 314, 323);
		desktopPane.add(scrollPane);
		
		JTextArea txtrEmisFrommonth = new JTextArea();
		txtrEmisFrommonth.setEditable(false);
		txtrEmisFrommonth.setText("EMIs from 10,999/month \r\n\r\n Bank OfferExtra 5% off* on Axis Bank Buzz Credit Cards T&C \r\n\r\n Features \r\n              Intel Core i7 Processor ( ) \r\n              16 GB DDR3 RAM  \r\n              64 bit Mac OS Operating System  \r\n              2 TB SSD \r\n              15 inch Display \r\n              Mac OS Sierra/2 GB Graphics \r\n\r\nServices \r\n             1 Year Warranty \r\n\r\n             10 Days Replacement*");
		txtrEmisFrommonth.setBounds(348, 135, 311, 323);
		
		
		scrollPane.add(txtrEmisFrommonth);
	  scrollPane.setViewportView(txtrEmisFrommonth);
		
		JButton btnNewButton = new JButton("ADD TO CART");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Product is Added to Your Cart");
				ct.setIcon(lblNewLabel.getIcon());
				new Cart(ct);
			}
		});
		btnNewButton.setBounds(30, 394, 145, 40);
		desktopPane.add(btnNewButton);
		
		JButton btnBuyNow = new JButton("BUY NOW");
		btnBuyNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new DeliveryAdd(dt,fp)).setVisible(true);
			}
		});
		btnBuyNow.setBounds(196, 394, 123, 40);
		desktopPane.add(btnBuyNow);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(139, 451, 89, 40);
		desktopPane.add(btnBack);
		
		
	}
}
