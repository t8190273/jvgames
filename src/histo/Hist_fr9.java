package histo;

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

public class Hist_fr9 extends JFrame {

	private JLabel lbl_q1;
    private JLabel lbl_question;
	
	//radio btn//
			JRadioButton btna, btnb, btnc, btnd;
			//omada btn//
			ButtonGroup bg;
			//apanthseis- sunolo 4//
			String ap1[] = {"\u03B1) \u03BF \u0399\u03BF\u03C5\u03C3\u03C4\u03B9\u03BD\u03B9\u03B1\u03BD\u03CC\u03C2"};
		    String ap2[] = {"\u03B2) \u03BF \u039C\u03AD\u03B3\u03B1\u03C2 \u039A\u03C9\u03BD\u03C3\u03C4\u03B1\u03BD\u03C4\u03AF\u03BD\u03BF\u03C2"}; /*Swsto*/
		    String ap3[] = {"\u03B3) \u03BF \u0397\u03C1\u03AC\u03BA\u03BB\u03B5\u03B9\u03BF\u03C2"};
		    String ap4[] = {"\u03B4) \u03BF \u039B\u03AD\u03C9\u03BD \u0393"};
		
		
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
					Hist_fr9 frame = new Hist_fr9();
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
	public Hist_fr9() {
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
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(new Color(153, 51, 102));
		panel.setBounds(22, 97, 883, 505);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//ButtonGroup Initialization//
	     bg = new ButtonGroup();
	     
	     //JRadioButton Initializations//
	     btna = new JRadioButton(ap1[0]);
	     btna.setForeground(new Color(255, 255, 255));
	     btna.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
	     btna.setBackground(new Color(153, 51, 102));
	     btna.setBounds(91, 217, 169, 49);
	     panel.add(btna);
	     
	     btnb = new JRadioButton(ap2[0]);
	     btnb.setForeground(new Color(255, 255, 255));
	     btnb.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
	     btnb.setBackground(new Color(153, 51, 102));
	     btnb.setBounds(91, 333, 224, 49);
	     panel.add(btnb);
	     
	     btnc = new JRadioButton(ap3[0]);
	     btnc.setForeground(new Color(255, 255, 255));
	     btnc.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
	     btnc.setBackground(new Color(153, 51, 102));
	     btnc.setBounds(415, 217, 169, 49);
	     panel.add(btnc);
	     
	     btnd = new JRadioButton(ap4[0]);
	     btnd.setBorder(new CompoundBorder(new LineBorder(new Color(102, 153, 153), 3, true), UIManager.getBorder("CheckBoxMenuItem.border")));
	     btnd.setForeground(new Color(255, 255, 255));
	     btnd.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
	     btnd.setBackground(new Color(153, 51, 102));
	     btnd.setBounds(415, 333, 169, 49);
	     panel.add(btnd);
	     
	     bg.add(btna);
	     bg.add(btnb);
	     bg.add(btnc);
	     bg.add(btnd);
	   
	     lbl_q1 = new JLabel("\u0395\u03C1\u03CE\u03C4\u03B7\u03C3\u03B7 9");
	     lbl_q1.setForeground(new Color(102, 255, 153));
	     lbl_q1.setFont(new Font("Mistral", Font.BOLD, 46));
	     lbl_q1.setBounds(26, 37, 192, 61);
	     panel.add(lbl_q1);
	     
	     lbl_question = new JLabel("\u03A0\u03BF\u03B9\u03BF\u03C2 \u03B1\u03C5\u03C4\u03BF\u03BA\u03C1\u03AC\u03C4\u03BF\u03C1\u03B1\u03C2 \u03BC\u03B5\u03C4\u03AD\u03C6\u03B5\u03C1\u03B5 \u03C4\u03B7 \u03C0\u03C1\u03C9\u03C4\u03B5\u03CD\u03BF\u03C5\u03C3\u03B1 \u03B1\u03C0\u03CC \u03C4\u03B7 \u03A1\u03CE\u03BC\u03B7 \u03C3\u03C4\u03B7 \u039D\u03AD\u03B1 \u03A1\u03CE\u03BC\u03B7 (\u0392\u03C5\u03B6\u03AC\u03BD\u03C4\u03B9\u03BF);");
	     lbl_question.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
	     lbl_question.setForeground(new Color(102, 255, 255));
	     lbl_question.setBounds(10, 109, 873, 70);
	     panel.add(lbl_question);
	     
	     JButton next_btn = new JButton("\u0395\u03C0\u03CC\u03BC\u03B5\u03BD\u03BF");
	     next_btn.addMouseListener(new MouseAdapter() {
	     	@Override
	     	public void mouseClicked(MouseEvent e) {
	     		score++;
				count++;
				c++;
				if (btna.isSelected() || btnb.isSelected() || btnc.isSelected() || btnd.isSelected()) {
				dispose();
				Hist_fr10 frame1 = new Hist_fr10();
				frame1.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "\u03A0\u03B1\u03C1\u03B1\u03BA\u03B1\u03BB\u03CE \u03B5\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03BC\u03B9\u03B1 \u03B1\u03C0\u03CC \u03C4\u03B9\u03C2 \u03C0\u03C1\u03BF\u03C4\u03B5\u03B9\u03BD\u03CC\u03BC\u03B5\u03BD\u03B5\u03C2 \u03B1\u03C0\u03B1\u03BD\u03C4\u03AE\u03C3\u03B5\u03B9\u03C2");
				}
	     	}
	     });
	     next_btn.setBorder(new LineBorder(new Color(51, 0, 51), 4, true));
	     next_btn.setBackground(new Color(153, 51, 102));
	     next_btn.setForeground(Color.GRAY);
	     next_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
	     next_btn.setBounds(689, 604, 113, 43);
	     contentPane.add(next_btn);
	     
	

		
		JLabel lbl_title = new JLabel("\u0393\u03B5\u03C9\u03B3\u03C1\u03B1\u03C6\u03AF\u03B1");
		lbl_title.setVerticalTextPosition(SwingConstants.TOP);
		lbl_title.setVerticalAlignment(SwingConstants.TOP);
		lbl_title.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_title.setFont(new Font("Comic Sans MS", Font.BOLD, 39));
		lbl_title.setForeground(new Color(51, 0, 0));
		lbl_title.setBounds(64, 21, 203, 65);
		contentPane.add(lbl_title);
		
		Exit.addMouseListener(new MouseAdapter() {
		     @Override
		     public void mouseClicked(MouseEvent arg0) {
		    	 if(JOptionPane.showConfirmDialog(null, "\u0395\u03AF\u03C3\u03C4\u03B5 \u03C3\u03AF\u03B3\u03BF\u03C5\u03C1\u03BF\u03B9 \u03C0\u03C9\u03C2 \u03B8\u03AD\u03BB\u03B5\u03C4\u03B5 \u03BD\u03B1 \u03BA\u03BB\u03B5\u03AF\u03C3\u03B5\u03C4\u03B5 \u03C4\u03B7\u03BD \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE?", "\u039A\u03BB\u03B5\u03AF\u03C3\u03B9\u03BC\u03BF", JOptionPane.YES_NO_OPTION) == 0) {
		    		Hist_fr9.this.dispose(); 
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
