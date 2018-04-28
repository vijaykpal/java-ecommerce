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

public class BookAPJ extends JInternalFrame {

	private JPanel contentPane;
	private JTextField textField;
	static CartDto ct=new CartDto();
	Cart c;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAPJ frame = new BookAPJ();
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
	public BookAPJ(DetailsDto dt,firstpage fp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 700,700);
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
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.MAGENTA);
		panel.setBackground(Color.PINK);
		panel.setBounds(10, 11, 649, 58);
		desktopPane.add(panel);
		
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
			public void actionPerformed(ActionEvent e) {
				new Cart(ct).setVisible(true);
				
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.PINK);
		button_1.setBounds(405, 12, 68, 40);
		panel.add(button_1);
		
		JButton button_2 = new JButton("sign in/up");
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(Color.PINK);
		button_2.setBounds(483, 12, 98, 41);
		panel.add(button_2);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\v3.png"));
		label_1.setBounds(10, 2, 56, 58);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel((String) null);
		label_2.setBounds(511, 12, 106, 40);
		panel.add(label_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\wings-of-fire-1an-autobiography-original-imaer2yzjmz5tzuj.jpeg"));
		lblNewLabel.setBounds(20, 74, 200, 294);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Wings Of Fire: An Autobiography 1st Edition(APJ Abdul Kalam) ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(230, 80, 429, 25);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rs 299");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(230, 105, 119, 25);
		desktopPane.add(lblNewLabel_2);
		
		JTextArea txtrBankOfferextra = new JTextArea();
		txtrBankOfferextra.setText("Bank OfferExtra 5% off* on Axis Bank Buzz Credit CardsT&C\r\n\r\nAuthors\r\n          APJ Abdul Kalam, Arun Tiwari\r\n\r\nFeatures\r\n          Language: English\r\n          Binding: Paperback\r\n          Publisher: Universities Press\r\n          Genre: Biographies & Autobiographies\r\n          ISBN: 9788173711466, 8173711461\r\n          Edition: 1st Edition, 2015\r\n          Pages: 180\r\n\r\nServices\r\n          10 Days Replacement Policy\r\n          Cash on Delivery available");
		txtrBankOfferextra.setBounds(252, 129, 337, 324);
		desktopPane.add(txtrBankOfferextra);
		
		JButton btnAddToCart = new JButton("ADD TO CART");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Product is Added to Your Cart");
				ct.setIcon(lblNewLabel.getIcon());
				c=new Cart(ct);
			}
		});
		btnAddToCart.setBounds(10, 387, 112, 36);
		desktopPane.add(btnAddToCart);
		
		JButton btnBuyNow = new JButton("BUY NOW");
		btnBuyNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new DeliveryAdd(dt,fp)).setVisible(true);
			}
		});
		btnBuyNow.setBounds(132, 387, 102, 36);
		desktopPane.add(btnBuyNow);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(79, 443, 89, 36);
		desktopPane.add(btnBack);
	}

}
