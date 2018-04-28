package ecommerce;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
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
import java.awt.SystemColor;


public class mobileIphone extends JInternalFrame {

	private JPanel contentPane;
	private JTextField textField;
	static DetailsDto dt;
	JLabel label_3;
	static CartDto ct=new CartDto();
	Cart c;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mobileIphone frame = new mobileIphone();
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
	public mobileIphone(DetailsDto dt,firstpage fp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-10,-10,700, 700);
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
		
		JLabel label_3 = new JLabel(dt.getName());
		label_3.setBounds(489, 12, 106, 40);
		panel.add(label_3);
		
		JLabel label_1 = new JLabel("vcart");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Sylfaen", Font.ITALIC, 18));
		label_1.setBounds(59, 27, 68, 25);
		panel.add(label_1);
		
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
		     
		      new Cart(ct).setVisible(true);;
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
		if(label_3.getText().equals(""))
		{
		panel.add(button_2);
		}
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\v3.png"));
		label_2.setBounds(10, 2, 56, 58);
		panel.add(label_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\iPhone-8-Concept-1.jpg"));
		lblNewLabel.setBounds(10, 80, 250, 289);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apple iPhone 8 (golden 256GB) (4GB RAM)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(270, 80, 320, 21);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rs 1,19,999");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(270, 103, 146, 21);
		desktopPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(270, 125, 367, 338);
		desktopPane.add(scrollPane);
		
		JTextArea txtrEmisFromRs = new JTextArea();
		txtrEmisFromRs.setEditable(false);
		txtrEmisFromRs.setText("EMIs from Rs 10,000/month\r\n\r\nSpecial PriceFlat Rs 10,500 Off on iPhone 8 T&C*\r\n\r\nBank OfferExtra 5% off* on Axis Bank Buzz Credit Cards T&C*\r\n\r\nFeatures\r\n             4 GB RAM\r\n             256 GB Storage\r\n             Dual Sim \r\n             5.5 inch. Retina HD Display\r\n             21 MP Primary Camera | 13 MP Front\r\n             4800 mAh Li-ion Battery\r\n             A10 Chip with 128 bit Architecture\r\n\r\nServices\r\n             1 Year Manufacturer Warrenty\r\n             10 Days Replacement\r\n\r\nSpecifications\r\n          \r\n  General\r\n           Sales Package\r\n           Handset, Apple EarPods with Remote and Mic, Lightning to USB Cable, USB Power            Adapter, SIM Slot Remover Tool\r\nModel Number\r\n          MKUE2HN/A\r\nModel Name\r\n          iPhone 8 Plus\r\nColor\r\n          Silver\r\nBrowse Type\r\n          Smartphones\r\nSIM Type\r\n          Dual Sim\r\nDisplay Features\r\n   Display Size\r\n          5.5 inch\r\n   Resolution\r\n         1080 x 1920 Pixels\r\n   Resolution Type\r\n         Retina HD Display\r\nGPU\r\n         PowerVR GT7600 (six-core graphics)\r\nDisplay Type\r\n         LED-backlit IPS LCD\r\nDisplay Colors\r\n         16 M\r\nOther Display Features\r\n         Retina HD Display with 3D Touch, LED Backlit Widescreen, 401 PPI, 500 cd/m2          Maximum Brightness, Full sRGB Standard, Dual Domain Pixels for Wide Viewing          Angles, Fingerprint Resistant Oleophobic Coating, Display Zoom, Reachability\r\n         Os & Processor Features\r\nOperating System\r\n         iOS 9\r\nProcessor Type\r\n         A9 Chip with 64-bit Architecture and M9 Motion Co-processor\r\nProcessor Core\r\n         Deca Core\r\nProcessor Clock Speed\r\n         2.84 GHz\r\nOperating Frequency\r\n         GSM - 850, 900, 1800, 1900; UMTS - 850, 900, 1700, 1900, 2100; 4G LTE (TD) - Band          38/39/40/41\r\nMemory & Storage Features\r\n  Internal Storage\r\n          256 GB\r\n  RAM\r\n          4 GB\r\nCall Log Memory\r\n          Yes\r\nCamera Features\r\n          Primary Camera Available\r\n          Primary Camera\r\n          12 megapixel\r\n  Primary Camera Features\r\n          iSight Camera, 1.22 \u00B5 Pixels, Live Photos, Auto Focus, Focus Pixels, True Tone Flash,           Panorama (Upto 63 MP), Auto HDR for Photos,\r\n      Exposure Control, Burst Mode, Timer           Mode, f/2.2 Aperture,\r\nSecondary Camera Available\r\nYes\r\nSecondary Camera\r\n      5 megapixel\r\nSecondary Camera Features\r\n     720p HD Video Recording, Retina Flash, f/2.2 Aperture, \r\n    Auto HDR for Photos and Videos,\r\n\r\nConnectivity Features\r\n Network Type\r\n    4G, 3G\r\nSupported Networks\r\n    4G LTE\r\nInternet Connectivity\r\n    3G, 4G, Wi-Fi, GPRS, \r\nBluetooth Version\r\n    4.2\r\nWi-Fi\r\n   Yes\r\n\r\nSIM Size\r\n   Nano Sim\r\nRemovable Battery\r\n   No\r\nBattery Capacity\r\n   2750 mAh\r\nBattery Type\r\n   Li-Ion\r\nDimensions\r\nWidth\r\n   77.9 mm\r\nHeight\r\n   158.2 mm\r\nDepth\r\n   7.3 mm\r\nWeight\r\n   192 g\r\nWarranty\r\n Warranty Summary\r\n   1 Year Manufacturer Warranty");
		txtrEmisFromRs.setBounds(270, 125, 367, 338);
		//contentPane.add(txtrEmisFromRs);
		
		scrollPane.add(txtrEmisFromRs);
		  scrollPane.setViewportView(txtrEmisFromRs);
		
		
		
		JButton btnAddToCart = new JButton("ADD TO CART");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				JOptionPane.showMessageDialog(null,"Product is Added to Your Cart");
				ct.setIcon(lblNewLabel.getIcon());
				c=new Cart(ct);
			}
		});
		btnAddToCart.setBounds(10, 380, 119, 38);
		desktopPane.add(btnAddToCart);
		
		JButton btnNewButton = new JButton("BUY NOW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new DeliveryAdd(dt,fp)).setVisible(true);
				
			}
		});
		btnNewButton.setBounds(143, 380, 109, 38);
		desktopPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(92, 429, 89, 34);
		desktopPane.add(btnNewButton_1);
		
		
	}
}
