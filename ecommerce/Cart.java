package ecommerce;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Cart extends JFrame {

	JLabel label[]=new JLabel[3];
	JLabel label1[]=new JLabel[3];
	JLabel label2[]=new JLabel[3];
	JPanel contentPane;
	int x=0;
	int y=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart frame = new Cart(null);
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
	public Cart(CartDto ct) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		int i=0;
		label[i]=new JLabel(ct.getIcon());
	//	this.label[i].setIcon(new ImageIcon(label));
        label[i].setBounds(0,0,ct.getIcon().getIconWidth()+x,ct.getIcon().getIconHeight()+y);
        contentPane.add(this.label[i]);
        contentPane.setLayout(null);
        x=x+20;
        y=y+20;
        i++;
      
	}

}
