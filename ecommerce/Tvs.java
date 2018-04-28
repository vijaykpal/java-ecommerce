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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Tvs extends JInternalFrame {

	private JPanel contentPane;
	private JTextField textField;
	static JLabel label_4;
	String name;
	static DetailsDto dt;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tvs frame = new Tvs(dt);
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
	public Tvs(DetailsDto dt,firstpage fp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,firstpage.width,firstpage.height);
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
		panel.setBounds(22, 21, 620, 58);
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
		button_1.setBounds(405, 12, 68, 40);
		panel.add(button_1);
		
	  label_4 = new JLabel(dt.getName());
	  label_4.setBounds(497, 12, 89, 40);
	  panel.add(label_4);
		
		JButton button_2 = new JButton("sign in/up");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		  	signin sign=new signin(fp);
			sign.setVisible(true);
			
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setBackground(Color.PINK);
		button_2.setBounds(476, 11, 98, 41);
		if(label_4.getText().equals(""))
		{panel.add(button_2);
		
		}
		
		
		JLabel lblTvs = new JLabel("TELEVISIONS");
		lblTvs.setBounds(130, 98, 98, 21);
		desktopPane.add(lblTvs);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(35, 118, 595, 451);
		desktopPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\tv\\01ztvgrandee.jpg"));
		lblNewLabel.setBounds(10, 0, 181, 134);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\tv\\kz8ih.jpg"));
		lblNewLabel_1.setBounds(212, 0, 181, 134);
		panel_2.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("SONY BRAVIA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desktopPane.add(new TvSony(dt,fp)).setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 135, 181, 23);
		panel_2.add(btnNewButton);
		
		JButton btnLg = new JButton("PANASONIC");
		btnLg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLg.setBounds(212, 135, 181, 23);
		panel_2.add(btnLg);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\tv\\kz8ih.jpg"));
		lblNewLabel_2.setBounds(10, 175, 181, 143);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("LG OLED");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 320, 181, 23);
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\tv\\samsung-smart-tv-ui-2016-01-05-01.jpg"));
		lblNewLabel_3.setBounds(212, 175, 181, 143);
		panel_2.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("SAMSUNG");
		btnNewButton_2.setBounds(212, 320, 181, 23);
		panel_2.add(btnNewButton_2);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\tv\\Samsung-40F60.jpg"));
		label_2.setBounds(404, 0, 180, 134);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\tv\\LG-OLED.jpg"));
		label_3.setBounds(403, 184, 181, 134);
		panel_2.add(label_3);
		
		JButton btnSamsungK = new JButton("SAMSUNG K33");
		btnSamsungK.setBounds(403, 135, 181, 23);
		panel_2.add(btnSamsungK);
		
		JButton btnLgOledPro = new JButton("LG OLED PRO");
		btnLgOledPro.setBounds(403, 320, 181, 23);
		panel_2.add(btnLgOledPro);
		
		JButton btnNewButton_3 = new JButton("<HTML><P><CENTER> BACK TO HOME PAGE</CENTER></P></HTML>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//desktopPane.add(new firstpage()).setVisible(true);
			}
		});
		btnNewButton_3.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_3.setBounds(236, 377, 114, 52);
		panel_2.add(btnNewButton_3);
		
		
	}
}
