package ecommerce;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class mobile extends JInternalFrame {

	private JPanel contentPane;
	private JTextField textField;
	static JLabel label_3;
	String name;
	static DetailsDto dt=new DetailsDto();
	static	mobile frame;
	static firstpage fp;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new test(dt,fp);
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
	public mobile(DetailsDto dt,firstpage fp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,firstpage.width,firstpage.height);
		BasicInternalFrameUI fi=(BasicInternalFrameUI)this.getUI();
		fi.setNorthPane(null);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 674, 671);
		setContentPane(scrollPane);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		contentPane.setPreferredSize(new Dimension(650,2000));
		scrollPane.add(contentPane);
		scrollPane.setViewportView(contentPane);
	
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 700,2000);
		contentPane.add(desktopPane);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.MAGENTA);
		panel.setBackground(Color.PINK);
		panel.setBounds(15, 12, 638, 58);
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
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		lblMobiles.setBounds(20, 81, 93, 33);
		desktopPane.add(lblMobiles);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(15, 116, 638,1997);
		desktopPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\iPhone-8-Concept.jpg"));
		lblNewLabel_6.setBounds(20,10, 208, 120);
		panel_2.add(lblNewLabel_6);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\motorola-moto-turbo-xt1225-original-imae5fyxgh7qy6ag.jpeg"));
		lblNewLabel_1.setBounds(20,200, 78, 151);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\samsung-galaxy-s7-edge-sm-g935fzbuins-original-imaepypxk5aqqgyg.jpeg"));
		lblNewLabel_2.setBounds(20,400, 78, 151);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\apple-iphone-6s-plus-na-original-imaeby76dahnngqa.jpeg"));
		lblNewLabel_3.setBounds(20,600, 78, 151);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\lenovo-p2-p2a42-original-imaepw3ws2h8gvbz.jpeg"));
		lblNewLabel_4.setBounds(20,800, 78, 151);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\honor-8-frd-l02-original-imaema4zfp56qnbc.jpeg"));
		lblNewLabel_5.setBounds(20,1000, 78, 151);
		panel_2.add(lblNewLabel_5);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\htc-one-m9-m9-original-imae74mbemgdn2kj.jpeg"));
		label_5.setBounds(20,1200, 78, 151);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\24-7-zone-nj-56321-original-imaesyuwguht5dcx.jpeg"));
		label_6.setBounds(20,1400, 101, 151);
		panel_2.add(label_6);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\mobiles\\resize\\mi-5-na-original-imaejfhg2fjszfs5.jpeg"));
		lblNewLabel.setBounds(20, 1600, 78, 151);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_8 = new JLabel("Apple Iphone 8, 4GB RAM(256 GB)");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 
		        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				desktopPane.add(new mobileIphone(dt,fp)).setVisible(true);
			}
		});
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_8.setBounds(255, 10, 222, 28);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("Rs 1,22,000");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(505, 10, 101, 28);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("<html>\r\n<pre>\n4 GB RAM | 256 GB ROM \n5.5 inch Retina HD Display\n21MP Primary Camera | 13MP Front\n4000mAh Li-Ion Battery\n</pre>\n</html>");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				desktopPane.add(new mobileIphone(dt,fp)).setVisible(true);
			}
		});
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_9.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_9.setBounds(254, 40, 241, 90);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Motorola Moto Turbo, 3GB RAM(64 GB)");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_10.setBounds(255, 200, 240, 28);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Rs 31,999");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11.setBounds(505, 200, 101, 28);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("<html>\r\n<pre>3 GB RAM | 64 GB ROM |\r\n5.2 inch Quad HD Display\r\n21MP Primary Camera | 2MP Front\r\n3900 mAh Battery\r\nQualcomm Snapdragon 805 \r\n</pre></html>");
		lblNewLabel_12.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_12.setBounds(255, 239, 222, 112);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Samsung Galaxy S7 Edge");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_13.setBounds(255, 400, 222, 28);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Rs 50,900");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_14.setBounds(505, 400, 101, 28);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("<html><pre>\r\n4 GB RAM | 32 GB ROM |\r\nExpandable Upto 200 GB\r\n5.5 inch Quad HD Display\r\n12MP Primary Camera | 5MP Front\r\n3600 mAh Li-Ion Battery\r\nExynos 8890 Processor\r\n</pre>\r\n</html>");
		lblNewLabel_15.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_15.setBounds(255, 427, 222, 112);
		panel_2.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Apple Iphone 6s Plus");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_16.setBounds(255, 600, 222, 28);
		panel_2.add(lblNewLabel_16);
		
		JLabel lblNewLabel_161 = new JLabel("Rs 84,999 ");
		lblNewLabel_161.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_161.setBounds(505, 600, 101, 28);
		panel_2.add(lblNewLabel_161);
		
		JLabel lblNewLabel_162 = new JLabel("<Html><pre>2 GB RAM | 128 GB ROM |\n5.5 inch Retina HD Display|\n12MP Primary Camera |5MP Front|\n2750 mAh Li-Ion Battery|\nA9 Chip with 64-bit Architecture</pre></html>");
		lblNewLabel_162.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_162.setBounds(255, 630, 222, 112);
		panel_2.add(lblNewLabel_162);
		
		JLabel lblNewLabel_17 = new JLabel("Lenovo P2");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_17.setBounds(255, 800, 222, 28);
		panel_2.add(lblNewLabel_17);
		
		JLabel lblNewLabel_171 = new JLabel("Rs 16,999 ");
		lblNewLabel_171.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_171.setBounds(505, 800, 101, 28);
		panel_2.add(lblNewLabel_171);
		
		JLabel lblNewLabel_172 = new JLabel("<html><pre>4 GB RAM | 32 GB ROM |\n Expandable Upto 128 GB|\n5.5 inch Full HD Display|\n13MP Primary Camera |5MP Front|\n5100 mAh Battery|\nQualcomm Snapdragon 625 </pre></html>");
		lblNewLabel_172.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_172.setBounds(255, 830, 222, 112);
		panel_2.add(lblNewLabel_172);
		
		JLabel lblNewLabel_18 = new JLabel("Honor 8");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_18.setBounds(255, 1000, 222, 28);
		panel_2.add(lblNewLabel_18);
		
		JLabel lblNewLabel_181 = new JLabel("Rs 29,999 ");
		lblNewLabel_181.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_181.setBounds(505, 1000, 101, 28);
		panel_2.add(lblNewLabel_181);
		
		JLabel lblNewLabel_182 = new JLabel("<html><pre>4 GB RAM |\n32 GB ROM |\nExpandable Upto 128 GB|\n5.2 inch Full HD Display|\n12MP + 12MP Dual Rear Cameras |\n8MP Front|\n3000 mAh Li-Polymer Battery|</pre></html>");
		lblNewLabel_182.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_182.setBounds(255, 1030, 222, 112);
		panel_2.add(lblNewLabel_182);
		
		JLabel lblNewLabel_19 = new JLabel("HTC One M9");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_19.setBounds(255, 1200, 222, 28);
		panel_2.add(lblNewLabel_19);
		
		JLabel lblNewLabel_191 = new JLabel("Rs 41,990");
		lblNewLabel_191.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_191.setBounds(505, 1200, 101, 28);
		panel_2.add(lblNewLabel_191);
		
		JLabel lblNewLabel_192 = new JLabel("<html><pre>3 GB RAM |\n32 GB ROM |\nExpandable Upto 2 TB|\n5.2 inch Quad HD Display|\n20MP + 2MP Dual Rear Cameras|\n4MP Front|2840 mAh Battery</pre></html>");
		lblNewLabel_192.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_192.setBounds(255, 1230, 222, 112);
		panel_2.add(lblNewLabel_192);
		
		JLabel lblNewLabel_20 = new JLabel("Nokia 6");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_20.setBounds(255, 1400, 222, 28);
		panel_2.add(lblNewLabel_20);
		
		JLabel lblNewLabel_201 = new JLabel("Rs 16,999");
		lblNewLabel_201.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_201.setBounds(505, 1400, 101, 28);
		panel_2.add(lblNewLabel_201);
		
		JLabel lblNewLabel_202 = new JLabel("<html><pre>3 GB RAM|\n64GB ROM|\n5.50-inch Display|\n16MP Rear Camera|8MP Front|\n3000mAh Battery</pre></html>");
		lblNewLabel_202.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_202.setBounds(255, 1430, 222, 112);
		panel_2.add(lblNewLabel_202);
		
		JLabel lblNewLabel_21 = new JLabel("MI 5");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_21.setBounds(255, 1600, 222, 28);
		panel_2.add(lblNewLabel_21);
		
		JLabel lblNewLabel_211= new JLabel("Rs 22,999");
		lblNewLabel_211.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_211.setBounds(505, 1600, 101, 28);
		panel_2.add(lblNewLabel_211);
		
		JLabel lblNewLabel_212 = new JLabel("<html><pre>3 GB RAM |32 GB ROM |\n5.15 inch Full HD Display|\n16MP Primary Camera |4MP Front|\n3000 mAh Li-Ion Polymer Battery|\nSnapdragon 820 Kryo Processor</pre></html>");




		lblNewLabel_212.setBounds(255, 1630, 222, 112);
		panel_2.add(lblNewLabel_212);
		
		JButton btnBackToHome = new JButton("Back to Home Page");
		btnBackToHome.setBounds(479, 79, 175, 36);
		desktopPane.add(btnBackToHome);
		btnBackToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			//	desktopPane.add(new firstpage()).setVisible(true);
				
				
			}
		});
		btnBackToHome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
	}
}
