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

public class books extends JInternalFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String name;
	static DetailsDto dt;
	static JLabel label_1;
	JButton btnSignInSign ;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					books frame = new books(dt);
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
	public books(DetailsDto dt,firstpage fp) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,firstpage.width,firstpage.height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		BasicInternalFrameUI fi=(BasicInternalFrameUI)this.getUI();
		fi.setNorthPane(null);
	
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 700,2000);
		contentPane.add(desktopPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 13, 632, 69);
		panel.setBackground(Color.PINK);
		desktopPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\v31.png"));
		label.setBounds(10, 11, 53, 53);
		panel.add(label);
		
		JLabel lblVcart = new JLabel("vcart");
		lblVcart.setForeground(Color.BLUE);
		lblVcart.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblVcart.setBounds(60, 28, 53, 22);
		panel.add(lblVcart);
		
		textField = new JTextField();
		textField.setBounds(112, 32, 188, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("search");
		btnSearch.setHorizontalAlignment(SwingConstants.LEADING);
		btnSearch.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\search.png"));
		btnSearch.setBounds(300, 30, 89, 23);
		panel.add(btnSearch);
		
		JButton btnCart = new JButton("Cart");
		btnCart.setBackground(Color.PINK);
		btnCart.setBounds(399, 11, 69, 45);
		panel.add(btnCart);
		
			label_1 = new JLabel(dt.getName());
			label_1.setBounds(503, 22, 82, 31);
			panel.add(label_1);
		
	
		btnSignInSign = new JButton("Sign in/ up");
		btnSignInSign.setBackground(Color.PINK);
       	btnSignInSign.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			signin sign=new signin(fp);
			sign.setVisible(true);
		
		}
	});
	btnSignInSign.setBounds(476, 11, 109, 45);
	if(label_1.getText().equals(""))
	{
	panel.add(btnSignInSign);
	}
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(51, 118, 612, 602);
		desktopPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("<html><p>Wings on Fire</p></html>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desktopPane.add(new BookAPJ(dt,fp)).setVisible(true);
			}
		});
		btnNewButton.setToolTipText("");
		btnNewButton.setBounds(0, 183, 100, 41);
		panel_2.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\20575978.jpg"));
		lblNewLabel_1.setBounds(123, 23, 100, 149);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\81VInd+t+5L._SL1500_.jpg"));
		lblNewLabel_2.setBounds(248, 23, 100, 149);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Albert Einstein");
		btnNewButton_1.setBounds(123, 183, 102, 41);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Steve Jobs");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(248, 183, 100, 41);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("<html><p>Kapil Dev</p></html>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(373, 183, 101, 41);
		panel_2.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\51DVbVOCedL._SX318_BO1,204,203,200_.jpg"));
		lblNewLabel_4.setBounds(0, 253, 100, 149);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\7627652.jpg"));
		lblNewLabel_5.setBounds(125, 252, 100, 150);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\msd-the-man-the-leader.jpeg"));
		lblNewLabel_6.setBounds(248, 252, 100, 150);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\narendra-modi-a-political-biography-400x400-imadsv8yhskeukhp.jpeg"));
		lblNewLabel_7.setBounds(373, 252, 101, 150);
		panel_2.add(lblNewLabel_7);
		
		JButton btnNewButton_4 = new JButton("<html><p>Nelson Mandela</p></html>");
		btnNewButton_4.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_4.setBounds(0, 413, 100, 39);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("<html><p>Stephen Hawking</p></html>");
		btnNewButton_5.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(125, 413, 100, 39);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("<html><p>Mahendra Singh Dhoni</p></html>");
		btnNewButton_6.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(248, 413, 100, 39);
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("<html><p>Narendra Modi</p></html>");
		btnNewButton_7.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_7.setBounds(373, 413, 101, 39);
		panel_2.add(btnNewButton_7);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\kapil dev book straight from the heart.jpg"));
		lblNewLabel_9.setBounds(374, 22, 100, 150);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\41VTREZ576L._SX296_BO1,204,203,200_.jpg"));
		lblNewLabel_10.setBounds(502, 252, 100, 150);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\Playing-It-My-Way.jpg"));
		lblNewLabel_11.setBounds(501, 22, 101, 150);
		panel_2.add(lblNewLabel_11);
		
		JButton btnNewButton_8 = new JButton("<html><p>Donald Trump");
		btnNewButton_8.setBounds(0, 554, 100, 37);
		panel_2.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("<html><p>Kapil Dev</p></html>");
		btnNewButton_9.setBounds(124, 554, 101, 37);
		panel_2.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("<html><p>Shane Warne</p></html>");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(248, 554, 100, 37);
		panel_2.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("<html><p>Sachin Tendulkar</p></html>");
		btnNewButton_11.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11.setBounds(373, 554, 101, 37);
		panel_2.add(btnNewButton_11);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(2, 23, 98, 150);
		panel_2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\books\\Wings_of_Fire_by_A_P_J_Abdul_Kalam_Book_Cover.jpg"));
		
		JButton btnshaneWarne = new JButton("<html><p>Shane Warne</p></html>");
		btnshaneWarne.setBounds(502, 413, 101, 39);
		panel_2.add(btnshaneWarne);
		
		JButton btnsachinTendulkar = new JButton("<html><p>Sachin Tendulkar</p></html>");
		btnsachinTendulkar.setVerticalAlignment(SwingConstants.TOP);
		btnsachinTendulkar.setBounds(502, 183, 101, 41);
		panel_2.add(btnsachinTendulkar);
		
		JButton btnNewButton_12 = new JButton("<html><p><center>BACK TO HOME PAGE </CENTER></P></HTML>");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                dispose();
				//bck.setVisible(true);
				//bok.setVisible(false);
				//desktopPane.add(new firstpage()).setVisible(true);
			}
		});
		btnNewButton_12.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_12.setBounds(248, 488, 125, 55);
		panel_2.add(btnNewButton_12);
		
		JLabel lblBooks = new JLabel("BOOKS");
		lblBooks.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBooks.setBounds(51, 107, 101, 30);
		desktopPane.add(lblBooks);
		
		JLabel lblBooks_1 = new JLabel("BOOKS");
		lblBooks_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBooks_1.setBounds(51, 93, 72, 24);
		desktopPane.add(lblBooks_1);
	}
}
