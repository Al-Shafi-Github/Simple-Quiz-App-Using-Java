import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class FirstBody {

	private JFrame frmQbin;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstBody window = new FirstBody();
					window.frmQbin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstBody() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQbin = new JFrame();
		frmQbin.setIconImage(Toolkit.getDefaultToolkit().getImage(FirstBody.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		frmQbin.setTitle("Qbin");
		frmQbin.getContentPane().setBackground(new Color(255, 153, 0));
		frmQbin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Qbin");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 82));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(null);
		lblNewLabel.setBounds(152, 36, 192, 95);
		frmQbin.getContentPane().add(lblNewLabel);
		
		JButton playBut = new JButton("Play");
		playBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Catagories.main();
				frmQbin.dispose();
			}
		});
		playBut.setBackground(Color.GREEN);
		playBut.setForeground(Color.BLACK);
		playBut.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		playBut.setBounds(191, 201, 115, 47);
		frmQbin.getContentPane().add(playBut);
		
		JButton btnNewButton = new JButton("Scores");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Score.main();
				frmQbin.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(191, 257, 115, 47);
		frmQbin.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmQbin.dispose();
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 17));
		btnNewButton_1.setBounds(191, 315, 115, 47);
		frmQbin.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("@A project by Kavin, Nida & Rita");
		lblNewLabel_1.setBounds(319, 497, 200, 14);
		frmQbin.getContentPane().add(lblNewLabel_1);
		frmQbin.setBackground(new Color(255, 153, 102));
		frmQbin.setBounds(450, 100, 545, 561);
		frmQbin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
