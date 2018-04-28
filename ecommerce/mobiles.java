/*package ecommerce;

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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JDesktopPane;

public class mobiles extends JInternalFrame {

	private JPanel contentPane;
	private JTextField textField;
	static JLabel label_3;
	String name;
	static DetailsDto dt=new DetailsDto();
	static	mobiles frame;
	static firstpage fp;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new mobiles(dt,fp);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	/*public mobiles(DetailsDto dt,firstpage fp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,firstpage.width,firstpage.height);
		BasicInternalFrameUI fi=(BasicInternalFrameUI)this.getUI();
		fi.setNorthPane(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 674, 671);
		contentPane.add(desktopPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.MAGENTA);
		panel.setBackground(Color.PINK);
		panel.setBounds(29, 22, 620, 58);
		desktopPane.add(panel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\v3.png"));
		label.setBounds(10, 5, 50, 47);
		panel.add(label);
		
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
		button_1.setForeground(Color.BLACK);
		button_1.setBackground(Color.PINK);
		button_1.setBounds(416, 12, 68, 40);
		panel.add(button_1);
		
		label_3 = new JLabel(dt.getName());
		label_3.setBounds(506, 11, 90, 36);
		panel.add(label_3);
		
		JButton button_2 = new JButton("sign in/up");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				signin sign=new signin(fp);
				sign.setVisible(true);
			
				//frame1.setVisible(true);
				
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(Color.PINK);
		button_2.setBounds(494, 11, 98, 41);
		
		if(label_3.getText().equals(""))
		{
			panel.add(button_2);
		
		}
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(10, 5, 50, 47);
		panel.add(label_2);
		
		
		
		JLabel lblMobiles = new JLabel("MOBILES");
		lblMobiles.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMobiles.setBounds(43, 81, 93, 33);
		desktopPane.add(lblMobiles);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(43, 113, 587, 558);
		desktopPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\mi-5-na-original-imaejfhg2fjszfs5.jpeg"));
		lblNewLabel.setBounds(130, 11, 78, 151);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\motorola-moto-turbo-xt1225-original-imae5fyxgh7qy6ag.jpeg"));
		lblNewLabel_1.setBounds(251, 11, 78, 151);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\samsung-galaxy-s7-edge-sm-g935fzbuins-original-imaepypxk5aqqgyg.jpeg"));
		lblNewLabel_2.setBounds(371, 11, 78, 151);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\apple-iphone-6s-plus-na-original-imaeby76dahnngqa.jpeg"));
		lblNewLabel_3.setBounds(486, 11, 78, 151);
		panel_2.add(lblNewLabel_3);
		
		JButton btnNexus = new JButton("<html><p>Mi 5</html>");
		btnNexus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNexus.setBounds(140, 176, 78, 51);
		panel_2.add(btnNexus);
		
		JButton btnIphone = new JButton("<html><p>Motorola Nexus 6</p></html>");
		btnIphone.setVerticalAlignment(SwingConstants.TOP);
		btnIphone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnIphone.setBounds(261, 176, 78, 51);
		panel_2.add(btnIphone);
		
		JButton btnNokia = new JButton("<html><p>Samsung Galaxy S7</p></html>");
		btnNokia.setVerticalAlignment(SwingConstants.TOP);
		btnNokia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNokia.setBounds(371, 176, 78, 51);
		panel_2.add(btnNokia);
		
		JButton btnHtcOne = new JButton("<html><p>iPhone 6s plus</p></html>");
		btnHtcOne.setVerticalAlignment(SwingConstants.TOP);
		btnHtcOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHtcOne.setBounds(486, 173, 88, 51);
		panel_2.add(btnHtcOne);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\lenovo-p2-p2a42-original-imaepw3ws2h8gvbz.jpeg"));
		lblNewLabel_4.setBounds(10, 11, 78, 151);
		panel_2.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("<html><p>Lenevo P2</html>");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setBounds(10, 176, 78, 51);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\honor-8-frd-l02-original-imaema4zfp56qnbc.jpeg"));
		lblNewLabel_5.setBounds(10, 282, 78, 151);
		panel_2.add(lblNewLabel_5);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\htc-one-m9-m9-original-imae74mbemgdn2kj.jpeg"));
		label_5.setBounds(130, 282, 78, 151);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\24-7-zone-nj-56321-original-imaesyuwguht5dcx.jpeg"));
		label_6.setBounds(251, 282, 101, 151);
		panel_2.add(label_6);
		
		JButton btnNewButton_1 = new JButton("Honor 8");
		btnNewButton_1.setBounds(10, 438, 78, 40);
		panel_2.add(btnNewButton_1);
		
		JButton btnHtcOneM = new JButton("<html><p>HTC one M9+</p></html>");
		btnHtcOneM.setVerticalAlignment(SwingConstants.TOP);
		btnHtcOneM.setBounds(130, 438, 78, 40);
		panel_2.add(btnHtcOneM);
		
		JButton btnNokia_1 = new JButton("Nokia 6");
		btnNokia_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNokia_1.setBounds(254, 438, 98, 40);
		panel_2.add(btnNokia_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\iPhone-8-Concept.jpg"));
		lblNewLabel_6.setBounds(371, 297, 208, 120);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("<html><p>IPHONE 8 6GB RAM (256 GB) </P></HTML> ");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(362, 438, 113, 40);
		panel_2.add(lblNewLabel_7);
		
		JButton btnBuyNow = new JButton("BUY NOW");
		btnBuyNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new mobileIphone(dt,fp)).setVisible(true);
			}
		});
		btnBuyNow.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBuyNow.setBounds(475, 444, 89, 28);
		panel_2.add(btnBuyNow);
		
		JButton btnBackToHome = new JButton("<html><p><center>Back to Home Page</center></p></html>");
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			//	desktopPane.add(new firstpage()).setVisible(true);
				
				
			}
		});
		btnBackToHome.setVerticalAlignment(SwingConstants.TOP);
		btnBackToHome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBackToHome.setBounds(254, 489, 145, 58);
		panel_2.add(btnBackToHome);
	}
}*/
