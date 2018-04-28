package ecommerce;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class signin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	public String a;
	DetailsDto dt;
	firstpage fp;
	/* private void register()
	{
		this.setVisible(false);
		this.dispose();
		signup signup1=new signup(fp);
		signup1.setVisible(true);
		signup1.setLocationRelativeTo(null);
	}


	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {
	
	//}

	/**
	 * Create the frame.
	 */
	public signin(firstpage fp) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 453, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(10, 24, 164, 341);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSignIn = new JLabel("Login");
		lblSignIn.setBackground(Color.BLUE);
		lblSignIn.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSignIn.setForeground(Color.WHITE);
		lblSignIn.setBounds(10, 11, 102, 32);
		panel.add(lblSignIn);
		
		JLabel lblNewLabel = new JLabel("<html><p>Get access to your order,wishlist.</p></html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 50, 119, 68);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\ecommerce-img1.jpg"));
		lblNewLabel_1.setBounds(10, 210, 144, 120);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\v31.png"));
		label.setBounds(49, 161, 51, 49);
		panel.add(label);
		
		JLabel lblEnterEmailMobile = new JLabel("User Name");
		lblEnterEmailMobile.setBounds(184, 43, 171, 21);
		contentPane.add(lblEnterEmailMobile);
		
		textField = new JTextField();
		textField.setBounds(184, 62, 212, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassward = new JLabel("Password");
		lblPassward.setBounds(184, 93, 88, 21);
		contentPane.add(lblPassward);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(184, 113, 212, 21);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String name=textField.getText();
			String pass=passwordField.getText();
			DatabaseOperation dbo=new DatabaseOperation();
	     	try {
				dt=dbo.signin(name, pass);
				if(dt!=null)
				{
				dispose();
				System.out.println(dt.getName());
				fp.dispose();
				
	            firstpage fp1=new firstpage(dt);
	            fp1.btnNewButton_1.setVisible(false);
	            fp1.setVisible(true);
	           
	         
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter correct name and password");
					textField.setText("");
					passwordField.setText("");
				}
	            
				/*		if(i==1){
					firstpage.label_3.setText(name);
					
					
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "user not exist");
			 textField.setText("");
			 passwordField.setText("");
				}*/
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setForeground(Color.RED);
		btnLogin.setBounds(219, 156, 158, 31);
		contentPane.add(btnLogin);
		
		JButton btnNewToVcart = new JButton("New to vcart? Sign up");
		btnNewToVcart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new signup(fp).setVisible(true);
			dispose();
			}
		});
		btnNewToVcart.setForeground(Color.BLUE);
		btnNewToVcart.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewToVcart.setBounds(219, 198, 158, 31);
		contentPane.add(btnNewToVcart);
	}
}
