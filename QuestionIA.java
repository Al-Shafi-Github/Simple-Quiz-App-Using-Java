import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.io.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class QuestionIA extends JFrame {

	private JPanel contentPane;
	private JTextField quesF1;
	private JTextField optionF1;
	private JRadioButton aBut1;
	private JRadioButton bBut1;
	private JRadioButton cBut1;
	private JRadioButton dBut1;
	private JButton confirmBut;
	private int scores = 0;
	private String nameOK;
	private String ans1;
	private String ans2;
	private String ans3;
	
	private JLabel lblQuestion;
	private JTextField quesF2;
	private JTextField optionF2;
	private JTextField quesF3;
	private JTextField optionF3;
	static Player p;
	private JButton quesBut;
	private JRadioButton aBut2;
	private JRadioButton bBut2;
	private JRadioButton dBut2;
	private JRadioButton cBut2;
	private JRadioButton aBut3;
	private JRadioButton bBut3;
	private JRadioButton cBut3;
	private JRadioButton dBut3;
	private JTextField nameF;
	private JButton okBut;
	private JLabel label;
	private JButton button;

	/**
	 * Launch the application.
	 */

	public static void main() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestionIA frame = new QuestionIA();
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
	public QuestionIA()throws IOException{
		p=new InternationalAffairs();
		setTitle("International Affairs");
		setIconImage(Toolkit.getDefaultToolkit().getImage(QuestionIA.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 100, 545, 561);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		quesF1 = new JTextField();
		quesF1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		quesF1.setEditable(false);
		quesF1.setFont(new Font("Candara", Font.PLAIN, 14));
		quesF1.setBackground(new Color(255, 255, 255));
		quesF1.setBounds(10, 35, 507, 40);
		contentPane.add(quesF1);
		quesF1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Question1:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 123, 29);
		contentPane.add(lblNewLabel);
		
		optionF1 = new JTextField();
		optionF1.setBackground(Color.WHITE);
		optionF1.setEditable(false);
		optionF1.setBounds(10, 73, 507, 40);
		contentPane.add(optionF1);
		optionF1.setColumns(10);
		
		aBut1 = new JRadioButton("a");
		aBut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(aBut1.isSelected()) {
					bBut1.setSelected(false);
					cBut1.setSelected(false);
					dBut1.setSelected(false);
					
				}
			}
		});
		aBut1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		aBut1.setBackground(new Color(255, 153, 0));
		aBut1.setBounds(10, 120, 33, 29);
		contentPane.add(aBut1);
		
		bBut1 = new JRadioButton("b");
		bBut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(bBut1.isSelected()) {
					aBut1.setSelected(false);
					cBut1.setSelected(false);
					dBut1.setSelected(false);
					
				}
			}
		});
		bBut1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		bBut1.setBackground(new Color(255, 153, 0));
		bBut1.setBounds(88, 120, 45, 29);
		contentPane.add(bBut1);
		
		cBut1 = new JRadioButton("c");
		cBut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cBut1.isSelected()) {
					bBut1.setSelected(false);
					aBut1.setSelected(false);
					dBut1.setSelected(false);
					
				}
			}
		});
		cBut1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		cBut1.setBackground(new Color(255, 153, 0));
		cBut1.setForeground(new Color(0, 0, 0));
		cBut1.setBounds(154, 120, 40, 29);
		contentPane.add(cBut1);
		
		dBut1 = new JRadioButton("d");
		dBut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dBut1.isSelected()) {
					bBut1.setSelected(false);
					cBut1.setSelected(false);
					aBut1.setSelected(false);
					
				}
			}
		});
		dBut1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		dBut1.setBackground(new Color(255, 153, 0));
		dBut1.setBounds(224, 114, 40, 40);
		contentPane.add(dBut1);
		
		confirmBut = new JButton("Confirm");
		confirmBut.setEnabled(false);
		confirmBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String A1=((InternationalAffairs)p).getA1();
				String A2=((InternationalAffairs)p).getA2();
				String A3=((InternationalAffairs)p).getA3();
				if(A1.equalsIgnoreCase(ans1))
					scores+=10;
				if(A2.equalsIgnoreCase(ans2))
					scores+=10;
				if(A3.equalsIgnoreCase(ans3))
					scores+=10;
				p.setScore(scores);
				try {
					p.setFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null,"Thank you for playing ;) You got "+String.valueOf(scores) );
				FirstBody.main(null);
				dispose();
			}
		});confirmBut.setBackground(Color.GREEN);confirmBut.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));confirmBut.setBounds(352,482,141,29);contentPane.add(confirmBut);
lblQuestion = new JLabel("Question2:");
lblQuestion.setForeground(Color.WHITE);
lblQuestion.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
lblQuestion.setBounds(10, 143, 123, 29);
contentPane.add(lblQuestion);
quesF2 = new JTextField();
quesF2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
	}
});
quesF2.setFont(new Font("Candara", Font.PLAIN, 14));
quesF2.setEditable(false);
quesF2.setColumns(10);
quesF2.setBackground(Color.WHITE);
quesF2.setBounds(10, 167, 507, 40);
contentPane.add(quesF2);
optionF2 = new JTextField();
optionF2.setEditable(false);
optionF2.setColumns(10);
optionF2.setBackground(Color.WHITE);
optionF2.setBounds(10, 204, 507, 40);
contentPane.add(optionF2);
aBut2 = new JRadioButton("a");
aBut2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(aBut2.isSelected()) {
			bBut2.setSelected(false);
			cBut2.setSelected(false);
			dBut2.setSelected(false);
			ans2=aBut2.getActionCommand();
		}
	}
});
aBut2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
aBut2.setBackground(new Color(255, 153, 0));
aBut2.setBounds(10, 246, 33, 29);
contentPane.add(aBut2);
bBut2 = new JRadioButton("b");
bBut2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(bBut2.isSelected()) {
			aBut2.setSelected(false);
			cBut2.setSelected(false);
			dBut2.setSelected(false);
			
		}
	}
});
bBut2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
bBut2.setBackground(new Color(255, 153, 0));
bBut2.setBounds(88, 251, 45, 29);
contentPane.add(bBut2);
cBut2 = new JRadioButton("c");
cBut2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(cBut2.isSelected()) {
			bBut2.setSelected(false);
			aBut2.setSelected(false);
			dBut2.setSelected(false);
			
		}
	}
});
cBut2.setForeground(Color.BLACK);
cBut2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
cBut2.setBackground(new Color(255, 153, 0));
cBut2.setBounds(154, 251, 40, 29);
contentPane.add(cBut2);
dBut2 = new JRadioButton("d");
dBut2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(dBut2.isSelected()) {
			bBut2.setSelected(false);
			cBut2.setSelected(false);
			aBut2.setSelected(false);
			
		}
	}
});
dBut2.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
dBut2.setBackground(new Color(255, 153, 0));
dBut2.setBounds(224, 246, 40, 40);
contentPane.add(dBut2);
JLabel lblQuestion_1 = new JLabel("Question3:");
lblQuestion_1.setForeground(Color.WHITE);
lblQuestion_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
lblQuestion_1.setBounds(10, 276, 123, 29);
contentPane.add(lblQuestion_1);
quesF3 = new JTextField();
quesF3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		
	}
});
quesF3.setFont(new Font("Candara", Font.PLAIN, 14));
quesF3.setEditable(false);
quesF3.setColumns(10);
quesF3.setBackground(Color.WHITE);
quesF3.setBounds(10, 304, 507, 40);
contentPane.add(quesF3);
optionF3 = new JTextField();
optionF3.setEditable(false);
optionF3.setColumns(10);
optionF3.setBackground(Color.WHITE);
optionF3.setBounds(10, 343, 507, 40);
contentPane.add(optionF3);
aBut3 = new JRadioButton("a");
aBut3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(aBut3.isSelected()) {
			bBut3.setSelected(false);
			cBut3.setSelected(false);
			dBut3.setSelected(false);
			
		}
	}
});
aBut3.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
aBut3.setBackground(new Color(255, 153, 0));
aBut3.setBounds(10, 384, 33, 29);
contentPane.add(aBut3);
bBut3 = new JRadioButton("b");
bBut3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(bBut3.isSelected()) {
			aBut3.setSelected(false);
			cBut3.setSelected(false);
			dBut3.setSelected(false);
			
		}
	}
});
bBut3.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
bBut3.setBackground(new Color(255, 153, 0));
bBut3.setBounds(88, 384, 45, 29);
contentPane.add(bBut3);
cBut3 = new JRadioButton("c");
cBut3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(cBut3.isSelected()) {
			bBut3.setSelected(false);
			aBut3.setSelected(false);
			dBut3.setSelected(false);
			
		}
	}
});
cBut3.setForeground(Color.BLACK);
cBut3.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
cBut3.setBackground(new Color(255, 153, 0));
cBut3.setBounds(154, 384, 40, 29);
contentPane.add(cBut3);
dBut3 = new JRadioButton("d");
dBut3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(dBut3.isSelected()) {
			bBut3.setSelected(false);
			cBut3.setSelected(false);
			aBut3.setSelected(false);
			
		}
	}
});
dBut3.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
dBut3.setBackground(new Color(255, 153, 0));
dBut3.setBounds(224, 384, 40, 29);
contentPane.add(dBut3);
quesBut = new JButton("Qestions?");
quesBut.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		quesF1.setText(((InternationalAffairs)p).getQ1());
		quesF2.setText(((InternationalAffairs)p).getQ2());
		quesF3.setText(((InternationalAffairs)p).getQ3());
		optionF1.setText(((InternationalAffairs)p).getO1());
		optionF2.setText(((InternationalAffairs)p).getO2());
		optionF3.setText(((InternationalAffairs)p).getO3());
		
	}
});
quesBut.setBackground(Color.GREEN);
quesBut.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
quesBut.setBounds(208, 482, 123, 29);
contentPane.add(quesBut);
nameF = new JTextField();
nameF.addKeyListener(new KeyAdapter() {
	@Override
	public void keyReleased(KeyEvent e) {
		okBut.setEnabled(true);
	}
});
nameF.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
nameF.setBounds(112, 420, 306, 29);
contentPane.add(nameF);
nameF.setColumns(10);
okBut = new JButton("OK");
okBut.setEnabled(false);
okBut.addKeyListener(new KeyAdapter() {
	@Override
	public void keyPressed(KeyEvent e) {
		
	}
});
okBut.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
okBut.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		confirmBut.setEnabled(true);
		quesBut.setEnabled(false);
		nameOK=nameF.getText();
		p.setName(nameOK);
		if(aBut1.isSelected())
			ans1=aBut1.getActionCommand();
		if(bBut1.isSelected())
			ans1=bBut1.getActionCommand();
		if(cBut1.isSelected())
			ans1=cBut1.getActionCommand();
		if(dBut1.isSelected())
			ans1=dBut1.getActionCommand();
		if(aBut2.isSelected())
			ans2=aBut2.getActionCommand();
		if(bBut2.isSelected())
			ans2=bBut2.getActionCommand();
		if(cBut2.isSelected())
			ans2=cBut2.getActionCommand();
		if(dBut2.isSelected())
			ans2=dBut2.getActionCommand();
		if(aBut3.isSelected())
			ans3=aBut3.getActionCommand();
		if(bBut3.isSelected())
			ans3=bBut3.getActionCommand();
		if(cBut3.isSelected())
			ans3=cBut3.getActionCommand();
		if(dBut3.isSelected())
			ans3=dBut3.getActionCommand();
		
	}
});
okBut.setBackground(Color.RED);
okBut.setBounds(428, 420, 89, 29);
contentPane.add(okBut);
label = new JLabel("Enter name:");
label.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
label.setBounds(10, 420, 107, 29);
contentPane.add(label);
button = new JButton("Back");
button.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		Catagories.main();
		dispose();
	}
});
button.setFont(new Font("Segoe UI Black", Font.PLAIN, 16));
button.setBackground(Color.GREEN);
button.setBounds(71, 482, 123, 29);
contentPane.add(button);
}
}
