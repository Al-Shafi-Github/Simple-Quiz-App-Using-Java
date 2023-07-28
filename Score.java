import java.awt.BorderLayout;
import java.io.*;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Score extends JFrame {

	private JPanel contentPane;
	private static ShowScore s;
	private JTextField scoreF1;
	private JTextField scoreF2;
	private JTextField scoreF3;
	private JTextField scoreF4;
	private JTextField scoreF5;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Score frame = new Score();
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
	public Score() throws IOException {
		s = new ShowScore();
		ArrayList<String> lists = s.sort();

		setTitle("Qbin");
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(Score.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 100, 545, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Scores");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 26));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(214, 11, 123, 36);
		contentPane.add(lblNewLabel);

		JList list = new JList();
		list.setBounds(422, 362, -263, -126);
		contentPane.add(list);

		scoreF1 = new JTextField();
		scoreF1.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		scoreF1.setEditable(false);
		scoreF1.setColumns(10);
		scoreF1.setBounds(51, 58, 468, 36);
		contentPane.add(scoreF1);

		JButton btnNewButton = new JButton("Show");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lists.size() >= 5) {
					String s0 = lists.get(lists.size() - 1);
					scoreF1.setText(s0);
					String s1 = lists.get(lists.size() - 2);
					scoreF2.setText(s1);
					String s2 = lists.get(lists.size() - 3);
					scoreF3.setText(s2);
					String s3 = lists.get(lists.size() - 4);
					scoreF4.setText(s3);
					String s4 = lists.get(lists.size() - 5);
					scoreF5.setText(s4);
				} else if (lists.size() == 4) {
					String s0 = lists.get(lists.size() - 1);
					scoreF1.setText(s0);
					String s1 = lists.get(lists.size() - 2);
					scoreF2.setText(s1);
					String s2 = lists.get(lists.size() - 3);
					scoreF3.setText(s2);
					String s3 = lists.get(lists.size() - 4);
					scoreF4.setText(s3);

				} else if (lists.size() == 3) {
					String s0 = lists.get(lists.size() - 1);
					scoreF1.setText(s0);
					String s1 = lists.get(lists.size() - 2);
					scoreF2.setText(s1);
					String s2 = lists.get(lists.size() - 3);
					scoreF3.setText(s2);

				} else if (lists.size() == 2) {
					String s0 = lists.get(lists.size() - 1);
					scoreF1.setText(s0);
					String s1 = lists.get(lists.size() - 2);
					scoreF2.setText(s1);

				} else if (lists.size() == 1) {
					String s0 = lists.get(lists.size() - 1);
					scoreF1.setText(s0);

				}

			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnNewButton.setBounds(51, 362, 123, 39);
		contentPane.add(btnNewButton);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstBody.main(null);
				dispose();
			}
		});
		btnBack.setBackground(Color.GREEN);
		btnBack.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnBack.setBounds(365, 362, 123, 39);
		contentPane.add(btnBack);

		scoreF2 = new JTextField();
		scoreF2.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		scoreF2.setEditable(false);
		scoreF2.setColumns(10);
		scoreF2.setBounds(51, 105, 468, 36);
		contentPane.add(scoreF2);

		scoreF3 = new JTextField();
		scoreF3.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		scoreF3.setEditable(false);
		scoreF3.setColumns(10);
		scoreF3.setBounds(51, 152, 468, 36);
		contentPane.add(scoreF3);

		scoreF4 = new JTextField();
		scoreF4.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		scoreF4.setEditable(false);
		scoreF4.setColumns(10);
		scoreF4.setBounds(51, 199, 468, 36);
		contentPane.add(scoreF4);

		scoreF5 = new JTextField();
		scoreF5.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		scoreF5.setEditable(false);
		scoreF5.setColumns(10);
		scoreF5.setBounds(51, 247, 468, 36);
		contentPane.add(scoreF5);

		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(18, 58, 23, 28);
		contentPane.add(lblNewLabel_1);

		JLabel label = new JLabel("2");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		label.setBounds(18, 105, 23, 28);
		contentPane.add(label);

		JLabel label_1 = new JLabel("3");
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		label_1.setBounds(18, 152, 23, 28);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("4");
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		label_2.setBounds(18, 199, 23, 28);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("5");
		label_3.setVerticalAlignment(SwingConstants.TOP);
		label_3.setForeground(Color.BLUE);
		label_3.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		label_3.setBounds(18, 247, 23, 28);
		contentPane.add(label_3);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					s.eraseFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				scoreF1.setText(null);
				scoreF2.setText(null);
				scoreF3.setText(null);
				scoreF4.setText(null);
				scoreF5.setText(null);
			}
		});
		btnReset.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		btnReset.setBackground(Color.GREEN);
		btnReset.setBounds(214, 362, 123, 39);
		contentPane.add(btnReset);
	}
}
