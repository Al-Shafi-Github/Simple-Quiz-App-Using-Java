import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Catagories {

	private JFrame frmQbin2;
	

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Catagories window = new Catagories();
					window.frmQbin2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Catagories() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQbin2 = new JFrame();
		frmQbin2.setTitle("Catagories");
		frmQbin2.setIconImage(Toolkit.getDefaultToolkit().getImage(Catagories.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		frmQbin2.getContentPane().setBackground(new Color(255, 153, 0));
		frmQbin2.setBounds(450, 100, 545, 561);
		frmQbin2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQbin2.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Bangladesh Affairs");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				QuestionBA.main();
				frmQbin2.dispose();
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(125, 202, 265, 57);
		frmQbin2.getContentPane().add(btnNewButton);
		
		JButton btnInternationalAffairs = new JButton("International Affairs");
		btnInternationalAffairs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				QuestionIA.main();
				frmQbin2.dispose();
			}
		});
		btnInternationalAffairs.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnInternationalAffairs.setBackground(Color.GREEN);
		btnInternationalAffairs.setBounds(125, 270, 265, 57);
		frmQbin2.getContentPane().add(btnInternationalAffairs);
		
		JButton btnSports = new JButton("Sports");
		btnSports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				QuestionSP.main();
				frmQbin2.dispose();
			}
		});
		btnSports.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnSports.setBackground(Color.GREEN);
		btnSports.setBounds(125, 338, 265, 57);
		frmQbin2.getContentPane().add(btnSports);
		
		JLabel lblNewLabel = new JLabel("What kind of questions you would like to answer?");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 93, 507, 48);
		frmQbin2.getContentPane().add(lblNewLabel);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstBody.main(null);
				frmQbin2.dispose();
			}
		});
		btnBack.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnBack.setBackground(Color.GREEN);
		btnBack.setBounds(125, 406, 265, 57);
		frmQbin2.getContentPane().add(btnBack);
	}
}
