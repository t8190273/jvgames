package cultu;

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

import domain.User;
import quiz.Culture_frame;
import quiz.ScoreboardJFrame;
import service.ScoreboardService;

public class Cultu_fr4 extends ScoreboardJFrame {

	private JLabel lbl_q1;
	private JLabel lbl_question;
	private final static Integer qID = 3;

	// radio btn//
	JRadioButton btna, btnb, btnc, btnd;
	// omada btn//
	ButtonGroup bg;
	// apanthseis- sunolo 4//
	String ap1[] = { "\u{391}. \u{3CC}\u{3BB}\u{3C9}\u{3BD} \u{3C4}\u{3C9}\u{3BD}
	\u{3B1}\u{3BD}\u{3B8}\u{3C1}\u{3CE}\u{3C0}\u{3C9}\u{3BD}" };
	String ap2[] = { "\u{392}. \u{3C4}\u{3C9}\u{3BD} \u{3B3}\u{3C1}\u{3B1}\u{3C6}\u{3AD}\u{3C9}\u{3BD}
	\u{3C0}\u{3BF}\u{3C5}
	\u{3B5}\u{3C1}\u{3B3}\u{3AC}\u{3B6}\u{3BF}\u{3BD}\u{3C4}\u{3B1}\u{3BD}
	\u{3C3}\u{3C4}\u{3B1} \u{3B1}\u{3BD}\u{3AC}\u{3BA}\u{3C4}\u{3BF}\u{3C1}\u{3B1}" }; /**swsto */
	String ap3[] = { "\u03B3)" };
	String ap4[] = {"\u{39A}\u{3B1}\u{3 BD}\u{3 AD}\u{3 BD}\u{3 B1}\u{391}\u{3 C0}\u{3 CC}\u{3 C4}\u{3 B1}\u{3 C0}\u{3 B1}\u{3 C1}\u{3 B1}\u{3 C0}\u{3 AC}\u{3 BD}\u{3 C9}"};

	private static int score = 0;
	private int count = 0;
	private int c = 0;

	private JPanel contentPane;

	// /**
	// * Launch the application.
	// */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// Cultu_fr4 frame = new Cultu_fr4();
	// frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the frame.
	 */
	public Cultu_fr4(ScoreboardService scoreboardService, User user) {
		super(scoreboardService, user);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setBounds(100, 100, 906, 658);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 255));
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
		panel.setBackground(new Color(102, 255, 255));
		panel.setBounds(22, 97, 883, 505);
		contentPane.add(panel);
		panel.setLayout(null);

		// ButtonGroup Initialization//
		bg = new ButtonGroup();

		// JRadioButton Initializations//
		btna = new JRadioButton(ap1[0]);
		btna.setForeground(new Color(0, 0, 0));
		btna.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btna.setBackground(new Color(102, 255, 255));
		btna.setBounds(91, 217, 169, 49);
		panel.add(btna);

		btnb = new JRadioButton(ap2[0]);
		btnb.setForeground(new Color(0, 0, 0));
		btnb.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnb.setBackground(new Color(102, 255, 255));
		btnb.setBounds(91, 333, 169, 49);
		panel.add(btnb);

		btnc = new JRadioButton(ap3[0]);
		btnc.setForeground(new Color(0, 0, 0));
		btnc.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnc.setBackground(new Color(102, 255, 255));
		btnc.setBounds(415, 217, 169, 49);
		panel.add(btnc);

		btnd = new JRadioButton(ap4[0]);
		btnd.setBorder(new CompoundBorder(new LineBorder(new Color(102, 153, 153), 3, true),
				UIManager.getBorder("CheckBoxMenuItem.border")));
		btnd.setForeground(new Color(0, 0, 0));
		btnd.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		btnd.setBackground(new Color(102, 255, 255));
		btnd.setBounds(415, 333, 169, 49);
		panel.add(btnd);

		lbl_q1 = new JLabel("\u0395\u03C1\u03CE\u03C4\u03B7\u03C3\u03B7 4");
		lbl_q1.setForeground(new Color(0, 51, 102));
		lbl_q1.setFont(new Font("Mistral", Font.BOLD, 46));
		lbl_q1.setBounds(26, 37, 192, 61);
		panel.add(lbl_q1);

		// Erwthsh//
		lbl_question = new JLabel("\u{397} \u{3B3}\u{3C1}\u{3B1}\u{3C6}\u{3AE} \u{3C4}\u{3C9}\u{3BD}
		\u{39C}\u{3C5}\u{3BA}\u{3B7}\u{3BD}\u{3B1}\u{3AF}\u{3C9}\u{3BD}
		\u{3AE}\u{3C4}\u{3B1}\u{3BD} \u{3BA}\u{3C4}\u{3AE}\u{3BC}\u{3B1}");
		lbl_question.setFont(new Font("Comic Sans MS", Font.PLAIN, 23));
		lbl_question.setForeground(new Color(51, 51, 51));
		lbl_question.setBounds(38, 109, 652, 70);
		panel.add(lbl_question);

		JButton next_btn = new JButton("\u0395\u03C0\u03CC\u03BC\u03B5\u03BD\u03BF");
		next_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btnc.isSelected()) {
					scoreboardService.updateQuestion(user.getUsername(), qID, true);
				} else {
					scoreboardService.updateQuestion(user.getUsername(), qID, false);
				}
				count++;
				c++;
				if (btna.isSelected() || btnb.isSelected() || btnc.isSelected() || btnd.isSelected()) {
					dispose();
					Cultu_fr5 frame1 = new Cultu_fr5(scoreboardService, user);
					frame1.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null,
							"\u03A0\u03B1\u03C1\u03B1\u03BA\u03B1\u03BB\u03CE \u03B5\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03BC\u03B9\u03B1 \u03B1\u03C0\u03CC \u03C4\u03B9\u03C2 \u03C0\u03C1\u03BF\u03C4\u03B5\u03B9\u03BD\u03CC\u03BC\u03B5\u03BD\u03B5\u03C2 \u03B1\u03C0\u03B1\u03BD\u03C4\u03AE\u03C3\u03B5\u03B9\u03C2");
				}
			}
		});
		next_btn.setBorder(new LineBorder(new Color(0, 51, 51), 4, true));
		next_btn.setBackground(new Color(102, 255, 255));
		next_btn.setForeground(Color.GRAY);
		next_btn.setFont(new Font("Tahoma", Font.BOLD, 15));
		next_btn.setBounds(689, 604, 113, 43);
		contentPane.add(next_btn);

		JLabel lbl_title = new JLabel("\u03A0\u03BF\u03BB\u03B9\u03C4\u03B9\u03C3\u03BC\u03CC\u03C2");
		lbl_title.setVerticalTextPosition(SwingConstants.TOP);
		lbl_title.setVerticalAlignment(SwingConstants.TOP);
		lbl_title.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_title.setFont(new Font("Comic Sans MS", Font.BOLD, 39));
		lbl_title.setForeground(new Color(102, 0, 153));
		lbl_title.setBounds(64, 21, 203, 65);
		contentPane.add(lbl_title);

		Exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (JOptionPane.showConfirmDialog(null,
						"\u0395\u03AF\u03C3\u03C4\u03B5 \u03C3\u03AF\u03B3\u03BF\u03C5\u03C1\u03BF\u03B9 \u03C0\u03C9\u03C2 \u03B8\u03AD\u03BB\u03B5\u03C4\u03B5 \u03BD\u03B1 \u03BA\u03BB\u03B5\u03AF\u03C3\u03B5\u03C4\u03B5 \u03C4\u03B7\u03BD \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE",
						"\u039A\u03BB\u03B5\u03AF\u03C3\u03B9\u03BC\u03BF", JOptionPane.YES_NO_OPTION) == 0) {
					Cultu_fr4.this.dispose();
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
