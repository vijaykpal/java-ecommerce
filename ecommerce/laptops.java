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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.JDesktopPane;

public class laptops extends JInternalFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String name;
	static DetailsDto dt;
	
	
	
	static JLabel label_2;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					laptops frame = new laptops(dt);
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
	public laptops(DetailsDto dt,firstpage fp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, firstpage.width,firstpage.height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		BasicInternalFrameUI fi=(BasicInternalFrameUI)this.getUI();
		fi.setNorthPane(null);
	
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 684, 671);
		contentPane.add(desktopPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.PINK);
		panel.setBounds(31, 11, 643, 60);
		desktopPane.add(panel);
		
	
		
	  label_2 = new JLabel(dt.getName());
	  label_2.setBounds(501, 22, 81, 35);
	  panel.add(label_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\v3.png"));
		label.setBounds(10, 11, 53, 53);
		panel.add(label);
		
		JLabel label_1 = new JLabel("vcart");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		label_1.setBounds(60, 28, 53, 22);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(112, 32, 188, 20);
		panel.add(textField);
		
		JButton button = new JButton("search");
		button.setHorizontalAlignment(SwingConstants.LEADING);
		button.setBounds(300, 30, 89, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Cart");
		button_1.setBackground(Color.PINK);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(399, 11, 67, 45);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Sign in/ up");
		button_2.setBackground(Color.PINK);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signin sign=new signin(fp);
				sign.setVisible(true);
		
			}
		});
		button_2.setBounds(476, 11, 103, 45);
		if(label_2.getText().equals(""))
		{
		panel.add(button_2);
		}
		
		
		JLabel lblLaptops = new JLabel("LAPTOPS");
		lblLaptops.setBounds(31, 72, 96, 22);
		desktopPane.add(lblLaptops);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 93, 654, 531);
		desktopPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\acer-ferrari1.jpg"));
		lblNewLabel.setBounds(10, 0, 200, 150);
		panel_2.add(lblNewLabel);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\Apple-Top-Selling-Laptop-Brands-In-the-World1.jpg"));
		label_3.setBounds(232, 0, 188, 150);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\best-laptop-for-graphic-design1.jpg"));
		label_4.setBounds(10, 192, 200, 150);
		panel_2.add(label_4);
		
		JButton btnNewButton = new JButton("Acer ferrari 5005WLMi");
		btnNewButton.setBounds(10, 151, 200, 23);
		panel_2.add(btnNewButton);
		
		JButton btnMacbook = new JButton("Apple MacBook Pros");
		btnMacbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			desktopPane.add(new AppleMac(dt,fp)).setVisible(true);
			}
		});
		btnMacbook.setBounds(232, 151, 200, 23);
		panel_2.add(btnMacbook);
		
		JButton btnDell = new JButton("DELL Inspiron 15 ");
		btnDell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDell.setBounds(10, 353, 200, 23);
		panel_2.add(btnDell);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\hp-spectre-13-main11.jpg"));
		label_5.setBounds(232, 192, 202, 150);
		panel_2.add(label_5);
		
		JButton btnHp = new JButton("HP Spectre");
		btnHp.setBounds(232, 353, 202, 23);
		panel_2.add(btnHp);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\8420094_orig1.jpg"));
		lblNewLabel_1.setBounds(442, 192, 200, 150);
		panel_2.add(lblNewLabel_1);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\microsoft1.jpg"));
		label_6.setBounds(442, 0, 200, 150);
		panel_2.add(label_6);
		
		JButton btnAlienware = new JButton("ALIENWARE 17 R2\r\n");
		btnAlienware.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAlienware.setBounds(444, 353, 200, 23);
		panel_2.add(btnAlienware);
		
		JButton btnAsus = new JButton("MICROSOFT SURFACE\r\n");
		btnAsus.setBounds(442, 151, 200, 23);
		panel_2.add(btnAsus);
		
		JButton btnNewButton_1 = new JButton("<html><p><center>BACK TO HOME PAGE</CENTER></P></HTML>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//bck.setVisible(true);
			
				
				//desktopPane.add(new firstpage()).setVisible(true);
			}
		});
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1.setBounds(263, 428, 122, 53);
		panel_2.add(btnNewButton_1);
		
		
	}
}
