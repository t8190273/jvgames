package quiz;
import domain.User;
import service.ScoreboardService;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Start extends JFrame {

	private ScoreboardService scoreboardService = new ScoreboardService("scores.csv");
	private User activeUser;
	private Image startimg = new ImageIcon(getClass().getResource("icons/startbutton.png")).getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
	private Image startimg1 = new ImageIcon(getClass().getResource("icons/start-button(2).png")).getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
	private Image startimg2 = new ImageIcon(getClass().getResource("icons/start-button1.png")).getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
	
	
	private JPanel contentPane;
	private JTextField textField;
	JLabel lblNewLabel = new JLabel("JVGame");
	int a = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
					frame.setVisible(true);
					frame.requestFocusInWindow();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 472);
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent j) {
				if (j.getSource() == textField) {
					textField.getText();
					a++;
				}
			}
		});
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			if(textField.getText().equals("Type your name here")) {
				textField.setText("");
			}
			else {
				textField.selectAll();
			}
			}
			@Override
			public void focusLost(FocusEvent e) {
			if(textField.getText().equals(""))
				textField.setText("Type your name here");
			textField.setAlignmentX(Component.RIGHT_ALIGNMENT);
			}
		});
		textField.setBorder(null);
		textField.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));

		textField.setForeground(new Color(124, 252, 0));
		textField.setBackground(new Color(0, 0, 0));
		textField.setBounds(168, 172, 344, 78);
		contentPane.add(textField);
		textField.setText("Type your name here");
		textField.setHorizontalAlignment(JTextField.CENTER);
		textField.setAlignmentX(Component.RIGHT_ALIGNMENT);
		textField.setColumns(10);
		
		JLabel Exit = new JLabel("X");
		Exit.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		Exit.setForeground(new Color(255, 255, 255));
		Exit.setBounds(658, 0, 30, 46);
		contentPane.add(Exit);
		
		JButton btnNewButton =new JButton("");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon(startimg));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					activeUser = scoreboardService.addUser(textField.getText());
					if (activeUser == null) {
						activeUser = scoreboardService.getUserByUsername(textField.getText());
					}
					if (activeUser == null) {
						{
							JOptionPane.showMessageDialog(null, "\u0391\u03C0\u03BF\u03C4\u03C5\u03C7\u03AF\u03B1 \u03B4\u03B7\u03BC\u03B9\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1\u03C2 \u03C7\u03C1\u03AE\u03C3\u03C4\u03B7!");
							Start.this.dispose();
						}
					}
				} catch (Exception exception) {
					exception.printStackTrace();
				}
				 btnNewButton.setIcon(new ImageIcon(startimg1));
				if(a >= 1) {
				    dispose();
				    ChoiceMenu cframe = new ChoiceMenu(scoreboardService, activeUser);
			        cframe.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "\u03A0\u03B1\u03C1\u03B1\u03BA\u03B1\u03BB\u03CE \u03B5\u03B9\u03C3\u03AC\u03B3\u03B5\u03C4\u03B5 \u03BA\u03AC\u03C0\u03BF\u03B9\u03BF \u03CC\u03BD\u03BF\u03BC\u03B1.");
					}
			}
			 @Override
		     public void mouseEntered(MouseEvent e) {
				 btnNewButton.setIcon(new ImageIcon(startimg2));
		     }
		     
		     @Override
		     public void mouseExited(MouseEvent arg0) {
		    	 btnNewButton.setIcon(new ImageIcon(startimg));
		     }
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(124, 252, 0));
		btnNewButton.setBackground(new Color(0, 51, 102));
		btnNewButton.setBounds(278, 288, 117, 118);
		contentPane.add(btnNewButton);
		
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 48));
		lblNewLabel.setBounds(251, 11, 224, 118);
		contentPane.add(lblNewLabel);
		
		
		Exit.addMouseListener(new MouseAdapter() {
		     @Override
		     public void mouseClicked(MouseEvent arg0) {
		    	 if(JOptionPane.showConfirmDialog(null, "\u0395\u03AF\u03C3\u03C4\u03B5 \u03C3\u03AF\u03B3\u03BF\u03C5\u03C1\u03BF\u03B9 \u03C0\u03C9\u03C2 \u03B8\u03AD\u03BB\u03B5\u03C4\u03B5 \u03BD\u03B1 \u03BA\u03BB\u03B5\u03AF\u03C3\u03B5\u03C4\u03B5 \u03C4\u03B7\u03BD \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE?", "\u039A\u03BB\u03B5\u03AF\u03C3\u03B9\u03BC\u03BF", JOptionPane.YES_NO_OPTION) == 0) {
		    		Start.this.dispose(); 
		    	 }
		}
		     @Override
		     public void mouseEntered(MouseEvent arg0) {
		    	 Exit.setForeground(Color.RED);
		     }
		     
		     @Override
		     public void mouseExited(MouseEvent arg0) {
		    	 Exit.setForeground(Color.WHITE);
		     }
	});
	}
}
