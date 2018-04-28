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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class firstpage extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearchYourProducts;
	 JDesktopPane desktopPane;
	static DetailsDto dt=new DetailsDto();
	final static int width=700;
	final static int height=700;
	public static JLabel label_3;
	private String name;
	static firstpage frame;
	JButton btnNewButton_1;
	
/*	private void login()
	{
		//this.setVisible(false);
		//this.dispose();
		signin signin1=new signin();
		signin1.setVisible(true);
		signin1.setLocationRelativeTo(null);
	}
	public void view()
	{
		this.setVisible(false);
		this.dispose();
		books view1=new books();
		view1.setVisible(true);
		view1.setLocationRelativeTo(null);
	}
	private void lappy()
	{
		this.setVisible(false);
		this.dispose();
		laptops lappy1=new laptops();
		lappy1.setVisible(true);
	    setLocationRelativeTo(null);
	}
	private void mobile()
	{
		this.setVisible(false);
		this.dispose();
		mobiles mob=new mobiles();
		mob.setVisible(true);
		setLocationRelativeTo(null);
	}*/
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new firstpage(dt);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public firstpage(DetailsDto dt) {
		setTitle("vcart.com");
		setResizable(false);
	
		setBounds(0,0,width,height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0,0,700, 700);
		contentPane.add(desktopPane);

		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setForeground(Color.MAGENTA);
		panel.setBounds(10, 11, 649, 58);
		desktopPane.add(panel);
		panel.setLayout(null);;
		
		 label_3 = new JLabel(dt.getName());
		 label_3.setBounds(503, 12, 106, 40);
		 panel.add(label_3); 
		
		JLabel lblVcart = new JLabel("vcart");
		lblVcart.setBounds(59, 27, 68, 25);
		panel.add(lblVcart);
		lblVcart.setForeground(Color.BLUE);
		lblVcart.setFont(new Font("Sylfaen", Font.ITALIC, 18));
		
		txtSearchYourProducts = new JTextField();
		txtSearchYourProducts.setEditable(false);
		txtSearchYourProducts.setEnabled(false);
		txtSearchYourProducts.setText("search your products here");
		txtSearchYourProducts.setBounds(111, 27, 197, 20);
		panel.add(txtSearchYourProducts);
		txtSearchYourProducts.setColumns(10);
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\search.png"));
		btnNewButton.setBounds(306, 26, 105, 23);
		panel.add(btnNewButton);
		
		JButton btnCart = new JButton("cart");
		btnCart.setBackground(Color.PINK);
		btnCart.setForeground(Color.BLACK);
		btnCart.setBounds(421, 12, 68, 40);
		panel.add(btnCart);
		
		btnNewButton_1 = new JButton("sign in/up");
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		   signin si=new signin(frame);
		   si.setVisible(true);
		   
			//btnNewButton_1.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(499, 12, 98, 41);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\v3.png"));
		lblNewLabel.setBounds(10, 2, 56, 58);
		panel.add(lblNewLabel);
		

		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 80, 110, 190);
		desktopPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("CATEGORIES");
		lblNewLabel_1.setBounds(10, 11, 78, 23);
		panel_1.add(lblNewLabel_1).setVisible(true);;
		
		JButton btnMobiles = new JButton("MOBILES");
		btnMobiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 desktopPane.add(new mobile(dt,frame)).setVisible(true);
				
			}
		});
		btnMobiles.setBounds(20, 36, 89, 23);
		panel_1.add(btnMobiles);
		
		JButton btnMens = new JButton("LAPTOPS");
		btnMens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	    	desktopPane.add(new laptops(dt,frame)).setVisible(true);
			}
		});
		btnMens.setBounds(20, 70, 89, 23);
		panel_1.add(btnMens);
		
		JButton btnWomens = new JButton("TV'S");
		btnWomens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new Tvs(dt,frame)).setVisible(true);
			}
		});
		btnWomens.setBounds(20, 104, 89, 23);
		panel_1.add(btnWomens);
		
		JButton btnBooks = new JButton("BOOKS");
		btnBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				desktopPane.add(new books(dt,frame)).setVisible(true);
		  /*    if(label_3.getText().equals(""))
		      {
				books b=new books(dt);
				desktopPane.add(b).setVisible(true);		
		      }
		      else
		      {
		    	  books b=new books(dt);
				  desktopPane.add(b).setVisible(true);	
				  b.btnSignInSign.setVisible(false);
		      }*/
			}
		});
		btnBooks.setBounds(20, 138, 89, 23);
		panel_1.add(btnBooks);
		
		JLabel lblOfferZone = new JLabel("\r\n");
		lblOfferZone.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\reliance-digital-offers (1).jpg"));
		lblOfferZone.setBounds(130, 80, 354, 131);
		desktopPane.add(lblOfferZone);
		
		JLabel lblTopMobilePhones = new JLabel("TOP MOBILE PHONES ");
		lblTopMobilePhones.setBounds(130, 222, 144, 22);
		desktopPane.add(lblTopMobilePhones);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(130, 244, 500, 148);
		desktopPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("iphone 8\r\n90000");
		btnNewButton_2.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desktopPane.add(new mobileIphone(dt,frame)).setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\Apple-iphone-8-features.jpg"));
		btnNewButton_2.setBounds(10, 0, 127, 109);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\HTC-One_Silver.jpg"));
		btnNewButton_3.setBounds(145, 0, 115, 109);
		panel_2.add(btnNewButton_3);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\nokia-6-fron-back-view.jpg"));
		button.setBounds(266, 0, 105, 109);
		panel_2.add(button);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\nexus-smartphones.jpg"));
		btnNewButton_4.setBounds(375, 0, 115, 109);
		panel_2.add(btnNewButton_4);
		
		JButton btnIphone = new JButton("iphone 8");
		btnIphone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new mobileIphone(dt,frame)).setVisible(true);
			}
		});
		btnIphone.setBounds(10, 103, 127, 34);
		panel_2.add(btnIphone);
		
		JButton btnHtcOne = new JButton("htc one");
		btnHtcOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new mobile(dt,frame)).setVisible(true);
			}
		});
		btnHtcOne.setBounds(145, 109, 115, 28);
		panel_2.add(btnHtcOne);
		
		JButton btnNokia = new JButton(" NOKIA 6");
		btnNokia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new mobile(dt,frame)).setVisible(true);
			}
		});
		btnNokia.setBounds(266, 109, 105, 28);
		panel_2.add(btnNokia);
		
		JButton btnNexusx = new JButton("Nexus 6x");
		btnNexusx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new mobile(dt,frame)).setVisible(true);
			}
		});
		btnNexusx.setBounds(375, 109, 115, 28);
		panel_2.add(btnNexusx);
		
		JLabel lblBestBooks = new JLabel("BEST BOOKS");
		lblBestBooks.setBounds(130, 403, 110, 22);
		desktopPane.add(lblBestBooks);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(130, 423, 509, 206);
		desktopPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\APJ.jpg"));
		lblNewLabel_2.setBounds(10, 0, 98, 148);
		panel_3.add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\7627652.jpg"));
		label.setBounds(118, 0, 99, 148);
		panel_3.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\msd-the-man-the-leader.jpeg"));
		label_1.setBounds(229, 0, 98, 148);
		panel_3.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\narendra-modi-a-political-biography-400x400-imadsv8yhskeukhp.jpeg"));
		label_2.setBounds(337, 0, 98, 148);
		panel_3.add(label_2);
		
		JButton btnNewButton_5 = new JButton("<html><p>Wings of Fire</p></html>\r\n");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new BookAPJ(dt,frame)).setVisible(true);
			}
		});
		btnNewButton_5.setBounds(10, 150, 98, 45);
		panel_3.add(btnNewButton_5);
		
		JButton btnStephenHawking = new JButton("<html><p>Stephen Hawking</p></html>");
		btnStephenHawking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new books(dt,frame)).setVisible(true);
			}
		});
		btnStephenHawking.setVerticalAlignment(SwingConstants.TOP);
		btnStephenHawking.setBounds(118, 150, 99, 45);
		panel_3.add(btnStephenHawking);
		
		JButton btnMsd = new JButton("MSD");
		btnMsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new books(dt,frame)).setVisible(true);
			}
		});
		btnMsd.setBounds(229, 150, 98, 45);
		panel_3.add(btnMsd);
		
		JButton btnNamo = new JButton("Namo");
		btnNamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new books(dt,frame)).setVisible(true);
			}
		});
		btnNamo.setBounds(337, 150, 98, 45);
		panel_3.add(btnNamo);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				books b=new books(dt,frame);
				desktopPane.add(b).setVisible(true);
				
			}
		});
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\view-all.png"));
		btnNewButton_6.setBounds(433, 67, 76, 43);
		panel_3.add(btnNewButton_6);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\axis1.jpg"));
		button_1.setBounds(487, 80, 143, 131);
		desktopPane.add(button_1);
	}
}
