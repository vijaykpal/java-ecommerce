package ecommerce;

import java.awt.Color;
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

public class TvSony extends JInternalFrame {

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
					TvSony frame = new TvSony();
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
	public TvSony(DetailsDto dt,firstpage fp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-10, -10, 700, 700);
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\tv\\sony-1kd-55x9300d-original-imaemzh7y27athw3.jpeg"));
		lblNewLabel.setBounds(20, 80, 303, 189);
		desktopPane.add(lblNewLabel);
		
		JLabel lblSonyBravia = new JLabel("Sony Bravia 163.9cm Ultra HD(4K),Smart TV");
		lblSonyBravia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSonyBravia.setBounds(333, 84, 326, 28);
		desktopPane.add(lblSonyBravia);
		
		JLabel lblNewLabel_1 = new JLabel("Rs 3,09,999");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(333, 114, 142, 22);
		desktopPane.add(lblNewLabel_1);
		
		JTextArea txtrNoCostEmis = new JTextArea();
		txtrNoCostEmis.setText("No Cost EMIs from Rs 34,999/month\r\n\r\nGet upto Rs 27,000 off on exchange\r\nBuy with Exchange\r\n\r\nAdditional Discount of Rs.5,000 on Regular Exchange Value (Price Shown Inclusive of Offer)\r\n\r\nBank OfferExtra Rs 2,500 off on Prepaid OrdersT&C*\r\n\r\nDisplay Size  65\r\n\r\nFeatures\r\n              3D Display\r\n              178 degree Viewing Angle\r\n              30 W Speaker Output\r\n              Dolby Digital, Dolby Digital Plus, Dolby Pulse\r\n              3X USB\r\n\r\nServices\r\n             1 year sony Domestic Warranty\r\n\r\n             Free Installation and Demo\r\n\r\n             10 Days Replacement Policy");
		txtrNoCostEmis.setBounds(333, 134, 326, 436);
		desktopPane.add(txtrNoCostEmis);
		
		JButton btnAddToCart = new JButton("ADD TO CART");
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Product is Added to Your Cart");
				ct.setIcon(lblNewLabel.getIcon());
				c=new Cart(ct);
			}
		});
		btnAddToCart.setBounds(39, 291, 123, 42);
		desktopPane.add(btnAddToCart);
		
		JButton btnBuyNow = new JButton("BUY NOW");
		btnBuyNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new DeliveryAdd(dt,fp)).setVisible(true);
			}
		});
		btnBuyNow.setBounds(184, 291, 128, 42);
		desktopPane.add(btnBuyNow);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setBounds(132, 363, 89, 42);
		desktopPane.add(btnBack);
	}

}
