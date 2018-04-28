package ecommerce;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class signup extends JFrame {
	Connection con;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	/*private void login()
	{
		this.setVisible(false);
		this.dispose();
		signin signin1=new signin();
		signin1.setVisible(true);
		signin1.setLocationRelativeTo(null);
	}

	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {
	
	//}

	/**
	 * Create the frame.
	 */
	public signup(firstpage fp) {
		setResizable(false);
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 461, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(10, 23, 147, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Signup");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 127, 38);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html><p> We do not share your personal detail with anyone.</p></html>");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 50, 127, 91);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\ecommerce-img1.jpg"));
		label.setBounds(10, 226, 127, 113);
		panel.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\priyanka\\Downloads\\ecommerce\\v31.png"));
		label_1.setBounds(47, 165, 51, 50);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(167, 66, 201, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setBounds(167, 44, 55, 20);
		contentPane.add(lblName);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO./ EMAIL");
		lblMobileNo.setBounds(167, 97, 120, 20);
		contentPane.add(lblMobileNo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 116, 201, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnContinue = new JButton("CONTINUE");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name=textField.getText();
				String mob=textField_1.getText();
				String password=passwordField.getText();
			DatabaseOperation dbo=new DatabaseOperation();
			
				try {
					dbo.signup(name,mob,password);
					JOptionPane.showMessageDialog(null,"You can Signin now");
					dispose();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
	
		/*	try {
				Statement s=null;
				con=Database.getConnection();
				// s=  (Statement) con.createStatement();
				PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into signup values(?,?,?)");
				//s.executeQuery("insert into signup(name,mob,password) values('"+name+"','"+mob+"''"+password+"')");
				ps.setString(1,name);
				ps.setString(2, mob);
				ps.setString(3,password);
				ps.executeUpdate();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}*/
			}
		});
		btnContinue.setForeground(Color.RED);
		btnContinue.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnContinue.setBounds(190, 203, 166, 34);
		contentPane.add(btnContinue);
		setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("Existing User? Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new signin(fp).setVisible(true);
				dispose();			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(190, 262, 166, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblCreatePassword = new JLabel("CREATE PASSWORD");
		lblCreatePassword.setBounds(167, 157, 120, 14);
		contentPane.add(lblCreatePassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(167, 172, 201, 20);
		contentPane.add(passwordField);
	}
}
