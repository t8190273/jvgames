package geo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Geo_fr6 extends JFrame {

	private JLabel lbl_q1;
    private JLabel lblNewLabel;
	
	//radio btn//
		JRadioButton btna, btnb, btnc, btnd;
		//omada btn//
		ButtonGroup bg;
		//apanthseis- sunolo 4//
		String ap1[] = {"α) Σερρών"};
	    String ap2[] = {"β) Αιτωλοακαρνανίας "};/*Swsto*/
	    String ap3[] = {"γ) Αλεξανδρούπολης  "};
	    String ap4[] = {"δ) Ιωαννίνων"};
	
	
	private static int score=0;
	private int count=0;
	private int c=0;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Geo_fr6 frame = new Geo_fr6();
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
	public Geo_fr6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setBounds(100, 100, 906, 658);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Exit = new JLabel("X");
		Exit.setBounds(878, 11, 27, 39);
		Exit.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		Exit.setForeground(new Color(255, 255, 255));
		contentPane.add(Exit);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(new Color(153, 255, 153));
		panel.setBounds(22, 97, 883, 505);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//ButtonGroup Initialization//
	     bg = new ButtonGroup();
	     
	     //JRadioButton Initializations//
	     btna = new JRadioButton(ap1[0]);
	     btna.setForeground(new Color(0, 0, 0));
	     btna.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
	     btna.setBackground(new Color(153, 255, 153));
	     btna.setBounds(91, 217, 169, 49);
	     panel.add(btna);
	     
	     btnb = new JRadioButton(ap2[0]);
	     btnb.setForeground(new Color(0, 0, 0));
	     btnb.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
	     btnb.setBackground(new Color(153, 255, 153));
	     btnb.setBounds(91, 333, 193, 49);
	     panel.add(btnb);
	     
	     btnc = new JRadioButton(ap3[0]);
	     btnc.setForeground(new Color(0, 0, 0));
	     btnc.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
	     btnc.setBackground(new Color(153, 255, 153));
	     btnc.setBounds(415, 217, 193, 49);
	     panel.add(btnc);
	     
	     btnd = new JRadioButton(ap4[0]);
	     btnd.setBorder(new CompoundBorder(new LineBorder(new Color(102, 153, 153), 3, true), UIManager.getBorder("CheckBoxMenuItem.border")));
	     btnd.setForeground(new Color(0, 0, 0));
	     btnd.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
	     btnd.setBackground(new Color(153, 255, 153));
	     btnd.setBounds(415, 333, 169, 49);
	     panel.add(btnd);
	     
	     bg.add(btna);
	     bg.add(btnb);
	     bg.add(btnc);
	     bg.add(btnd);
	     
	     lbl_q1 = new JLabel("Ερώτηση 6");
	     lbl_q1.setForeground(new Color(204, 51, 51));
	     lbl_q1.setFont(new Font("Mistral", Font.BOLD, 46));
	     lbl_q1.setBounds(26, 37, 192, 61);
	     panel.add(lbl_q1);
	     
	     lblNewLabel = new JLabel(" Ο μεγαλύτερος Νομός σε έκταση της Ελλάδας είναι:");
	     lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
	     lblNewLabel.setForeground(new Color(0, 0, 102));
	     lblNewLabel.setBounds(38, 109, 652, 70);
	     panel.add(lblNewLabel);
	     
	     JButton next_btn = new JButton("Επόμενο");
	     next_btn.addMouseListener(new MouseAdapter() {
	     	@Override
	     	public void mouseClicked(MouseEvent e) {
	     		score++;
				count++;
				c++;
				if (btna.isSelected() || btnb.isSelected() || btnc.isSelected() || btnd.isSelected()) {
				dispose();
				Geo_fr7 frame1 = new Geo_fr7();
				frame1.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Παρακαλώ επιλέξτε μια από τις προτεινόμενες απαντήσεις");
				}
	     	}
	     });
	     next_btn.setBorder(new LineBorder(new Color(0, 0, 51), 4, true));
	     next_btn.setBackground(new Color(255, 255, 255));
	     next_btn.setForeground(Color.GRAY);
	     next_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
	     next_btn.setBounds(689, 604, 113, 43);
	     contentPane.add(next_btn);
	     
	

		
		JLabel lbl_title = new JLabel("\u0393\u03B5\u03C9\u03B3\u03C1\u03B1\u03C6\u03AF\u03B1");
		lbl_title.setVerticalTextPosition(SwingConstants.TOP);
		lbl_title.setVerticalAlignment(SwingConstants.TOP);
		lbl_title.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_title.setFont(new Font("Comic Sans MS", Font.BOLD, 39));
		lbl_title.setForeground(new Color(102, 51, 102));
		lbl_title.setBounds(64, 21, 203, 65);
		contentPane.add(lbl_title);
		
		Exit.addMouseListener(new MouseAdapter() {
		     @Override
		     public void mouseClicked(MouseEvent arg0) {
		    	 if(JOptionPane.showConfirmDialog(null, "Είστε σίγουροι πως θέλετε να κλείσετε την εφαρμογή?", "Κλείσιμο", JOptionPane.YES_NO_OPTION) == 0) {
		    		Geo_fr6.this.dispose(); 
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

