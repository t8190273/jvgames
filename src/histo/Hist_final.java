package histo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import quiz.ChoiceMenu;

public class Hist_final extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hist_final frame = new Hist_final();
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
	public Hist_final() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setBounds(100, 100, 906, 658);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Exit = new JLabel("X");
		Exit.setBounds(878, 11, 27, 39);
		Exit.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		Exit.setForeground(new Color(255, 255, 255));
		contentPane.add(Exit);
		
		JLabel lblNewLabel = new JLabel("\u039F\u03BB\u03BF\u03BA\u03BB\u03B7\u03C1\u03CE\u03C3\u03B1\u03C4\u03B5 \u03C4\u03B7\u03BD \u03BA\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1 \u039C\u03C5\u03B8\u03BF\u03BB\u03BF\u03B3\u03AF\u03B1\u03C2! \u03A0\u03B1\u03C1\u03B1\u03BA\u03AC\u03C4\u03C9 \u03B5\u03AF\u03BD\u03B1\u03B9 \u03C4\u03B1 \u03B1\u03C0\u03BF\u03C4\u03B5\u03BB\u03AD\u03C3\u03BC\u03B1\u03C4\u03B1 \u03C3\u03B1\u03C2.");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
		lblNewLabel.setBounds(43, 79, 853, 86);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE \u03C3\u03C4\u03B7\u03BD \u03B1\u03C1\u03C7\u03B9\u03BA\u03AE\r\n");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				ChoiceMenu c = new ChoiceMenu();
				c.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(678, 560, 218, 59);
		contentPane.add(btnNewButton);
		Exit.addMouseListener(new MouseAdapter() {
		     @Override
		     public void mouseClicked(MouseEvent arg0) {
		    	 if(JOptionPane.showConfirmDialog(null, "\u0395\u03AF\u03C3\u03C4\u03B5 \u03C3\u03AF\u03B3\u03BF\u03C5\u03C1\u03BF\u03B9 \u03C0\u03C9\u03C2 \u03B8\u03AD\u03BB\u03B5\u03C4\u03B5 \u03BD\u03B1 \u03BA\u03BB\u03B5\u03AF\u03C3\u03B5\u03C4\u03B5 \u03C4\u03B7\u03BD \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE?", "\u039A\u03BB\u03B5\u03AF\u03C3\u03B9\u03BC\u03BF", JOptionPane.YES_NO_OPTION) == 0) {
		    		dispose(); 
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
