package quiz;

import domain.User;
import service.ScoreboardService;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class ChoiceMenu extends ScoreboardJFrame {

	private Image questimg = new ImageIcon(ChoiceMenu.class.getResource("icons/question.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image questimg1 = new ImageIcon(ChoiceMenu.class.getResource("icons/question1.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image questimg2 = new ImageIcon(ChoiceMenu.class.getResource("icons/question2.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image myth1img = new ImageIcon(ChoiceMenu.class.getResource("icons/mythology.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image myth2img = new ImageIcon(ChoiceMenu.class.getResource("icons/mythology(1).png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image myth3img = new ImageIcon(ChoiceMenu.class.getResource("icons/minotaur.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image myth4img = new ImageIcon(ChoiceMenu.class.getResource("icons/trojan-horse.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image myth5img = new ImageIcon(ChoiceMenu.class.getResource("icons/trident.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image hist1img = new ImageIcon(ChoiceMenu.class.getResource("icons/history.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image hist2img = new ImageIcon(ChoiceMenu.class.getResource("icons/history(1).png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image hist3img = new ImageIcon(ChoiceMenu.class.getResource("icons/antiquee.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image geo1img = new ImageIcon(ChoiceMenu.class.getResource("icons/geographyy.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image geo2img = new ImageIcon(ChoiceMenu.class.getResource("icons/planet-earth.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image geo3img = new ImageIcon(ChoiceMenu.class.getResource("icons/greecee.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image geo4img = new ImageIcon(ChoiceMenu.class.getResource("icons/mountain.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image cul1img = new ImageIcon(ChoiceMenu.class.getResource("icons/greece1.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image cul2img = new ImageIcon(ChoiceMenu.class.getResource("icons/olympic.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image cul3img = new ImageIcon(ChoiceMenu.class.getResource("icons/olympus.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image cul4img = new ImageIcon(ChoiceMenu.class.getResource("icons/parthenon.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	private Image cul5img = new ImageIcon(ChoiceMenu.class.getResource("icons/vase.png")).getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
	
	private JPanel contentPane;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ChoiceMenu frame = new ChoiceMenu();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public ChoiceMenu(ScoreboardService scoreboardService, User user) {
		super(scoreboardService,user);
		setBackground(new Color(0, 51, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setBounds(100, 100, 868, 675);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 51));
		contentPane.setBorder(new LineBorder(new Color(204, 204, 51), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel Exit = new JLabel("X");
		Exit.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		Exit.setForeground(new Color(255, 255, 255));
		Exit.setBounds(830, 0, 38, 57);
		contentPane.add(Exit);
		
		JLabel questionimg = new JLabel("");
		questionimg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Help_frame hframe = new Help_frame();
		        hframe.setVisible(true);
		        questionimg.setIcon(new ImageIcon(questimg2));
			}
			@Override
			public void mouseEntered(MouseEvent e) {			
				questionimg.setIcon(new ImageIcon(questimg1));
			}	     
			
			@Override
			public void mouseExited(MouseEvent e) {
				questionimg.setIcon(new ImageIcon(questimg));
			}
		});
		questionimg.setBounds(10, 591, 95, 84);
		contentPane.add(questionimg);
		questionimg.setIcon(new ImageIcon(questimg));
		
		JLabel lblNewLabel = new JLabel("JVGame");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel.setBounds(719, 625, 95, 50);
		contentPane.add(lblNewLabel);
		
		JPanel mythpanel = new JPanel();
		mythpanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {			
			mythpanel.setBackground(new Color(51, 102, 204));
			}	     
			
			@Override
			public void mouseExited(MouseEvent e) {
				mythpanel.setBackground(new Color(153, 255, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				mythpanel.setBackground(new Color(0, 0, 102));
				dispose();
				Mythology_frame mframe= new Mythology_frame(scoreboardService, user);
				mframe.setVisible(true);
			}
		});
		mythpanel.setBorder(new LineBorder(new Color(0, 0, 153), 3, true));
		mythpanel.setBackground(new Color(153, 255, 255));
		mythpanel.setForeground(new Color(0, 51, 102));
		mythpanel.setBounds(126, 101, 249, 203);
		contentPane.add(mythpanel);
		mythpanel.setLayout(null);
		
		JLabel mythtitle = new JLabel("Mythology");
		mythtitle.setForeground(new Color(204, 204, 0));
		mythtitle.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		mythtitle.setBounds(79, 78, 117, 31);
		mythpanel.add(mythtitle);
		
		JLabel mythlbl1 = new JLabel("");
		mythlbl1.setBounds(29, 47, 62, 62);
		mythpanel.add(mythlbl1);
		mythlbl1.setIcon(new ImageIcon(myth1img));
		
		JLabel mythlbl2 = new JLabel("");
		mythlbl2.setBounds(155, 126, 62, 62);
		mythpanel.add(mythlbl2);
		mythlbl2.setIcon(new ImageIcon(myth2img));
		
		JLabel mythlbl3 = new JLabel("");
		mythlbl3.setBounds(53, 141, 62, 62);
		mythpanel.add(mythlbl3);
		mythlbl3.setIcon(new ImageIcon(myth3img));
		
		JLabel mythlbl4 = new JLabel("");
		mythlbl4.setBounds(187, 24, 62, 62);
		mythpanel.add(mythlbl4);
		mythlbl4.setIcon(new ImageIcon(myth4img));
		
		JLabel mythlbl5 = new JLabel("");
		mythlbl5.setBounds(123, 11, 50, 55);
		mythpanel.add(mythlbl5);
		mythlbl5.setIcon(new ImageIcon(myth5img));
		
		JPanel historypanel = new JPanel();
		historypanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {			
				historypanel.setBackground(new Color(153, 51, 153));
			}	     
			
			@Override
			public void mouseExited(MouseEvent e) {
				historypanel.setBackground(new Color(153, 102, 153));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				historypanel.setBackground(new Color(102, 0, 0));
				dispose();
				History_frame hframe= new History_frame(scoreboardService, user);
				hframe.setVisible(true);
			}
		});
		historypanel.setLayout(null);
		historypanel.setForeground(new Color(0, 51, 102));
		historypanel.setBorder(new LineBorder(new Color(51, 0, 0), 3, true));
		historypanel.setBackground(new Color(153, 102, 153));
		historypanel.setBounds(519, 101, 249, 203);
		contentPane.add(historypanel);
		
		JLabel historytitle = new JLabel("History");
		historytitle.setForeground(new Color(204, 51, 51));
		historytitle.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		historytitle.setBounds(87, 84, 117, 31);
		historypanel.add(historytitle);
		
		JLabel histlbl1 = new JLabel("");
		histlbl1.setBounds(38, 69, 62, 62);
		historypanel.add(histlbl1);
		histlbl1.setIcon(new ImageIcon(hist1img));
		
		JLabel histlbl2 = new JLabel("");
		histlbl2.setBounds(162, 23, 62, 62);
		historypanel.add(histlbl2);
		histlbl2.setIcon(new ImageIcon(hist2img));
		
		JLabel histlbl3 = new JLabel("");
		histlbl3.setBounds(142, 141, 62, 62);
		historypanel.add(histlbl3);
		histlbl3.setIcon(new ImageIcon(hist3img));
		
		JLabel histlbl4 = new JLabel("");
		histlbl4.setBounds(142, 11, 62, 62);
		historypanel.add(histlbl4);
		
		JPanel geographypanel = new JPanel();
		geographypanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {			
				geographypanel.setBackground(new Color(0, 102, 51));
			}	     
			
			@Override
			public void mouseExited(MouseEvent e) {
				geographypanel.setBackground(new Color(51, 153, 102));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				geographypanel.setBackground(new Color(0, 51, 0));
				dispose();
				Geography_frame gframe= new Geography_frame(scoreboardService, user);
				gframe.setVisible(true);
			}
		});
		geographypanel.setLayout(null);
		geographypanel.setForeground(new Color(0, 51, 102));
		geographypanel.setBorder(new LineBorder(new Color(102, 51, 0), 3, true));
		geographypanel.setBackground(new Color(51, 153, 102));
		geographypanel.setBounds(126, 377, 249, 203);
		contentPane.add(geographypanel);
		
		JLabel geotitle = new JLabel("Geography");
		geotitle.setForeground(new Color(51, 102, 255));
		geotitle.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		geotitle.setBounds(80, 100, 117, 31);
		geographypanel.add(geotitle);
		
		JLabel geolbl1 = new JLabel("");
		geolbl1.setBounds(80, 11, 62, 62);
		geographypanel.add(geolbl1);
		geolbl1.setIcon(new ImageIcon(geo1img));
		
		JLabel geolbl2 = new JLabel("");
		geolbl2.setBounds(22, 76, 62, 62);
		geographypanel.add(geolbl2);
		geolbl2.setIcon(new ImageIcon(geo2img));
		
		JLabel geolbl3 = new JLabel("");
		geolbl3.setBounds(177, 44, 62, 62);
		geographypanel.add(geolbl3);
		geolbl3.setIcon(new ImageIcon(geo3img));
		
		JLabel geolbl4 = new JLabel("");
		geolbl4.setBounds(136, 141, 62, 62);
		geographypanel.add(geolbl4);
		geolbl4.setIcon(new ImageIcon(geo4img));
		
		JPanel culturepanel = new JPanel();
		culturepanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {			
				culturepanel.setBackground(new Color(0, 0, 153));
			}	     
			
			@Override
			public void mouseExited(MouseEvent e) {
				culturepanel.setBackground(new Color(0, 102, 255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				culturepanel.setBackground(new Color(51, 102, 153));
				dispose();
				Culture_frame cframe= new Culture_frame(scoreboardService, user);
				cframe.setVisible(true);
			}
		});
		culturepanel.setLayout(null);
		culturepanel.setForeground(new Color(0, 51, 102));
		culturepanel.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		culturepanel.setBackground(new Color(0, 102, 255));
		culturepanel.setBounds(519, 377, 249, 203);
		contentPane.add(culturepanel);
		
		JLabel culturetitle =  new JLabel("Culture");
		culturetitle.setForeground(new Color(51, 51, 153));
		culturetitle.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		culturetitle.setBounds(90, 75, 103, 31);
		culturepanel.add(culturetitle);
		
		JLabel cullbl1 = new JLabel("");
		cullbl1.setBounds(10, -8, 62, 73);
		culturepanel.add(cullbl1);
		cullbl1.setIcon(new ImageIcon(cul1img));
		
		JLabel cullbl2 = new JLabel("");
		cullbl2.setBounds(152, 11, 62, 62);
		culturepanel.add(cullbl2);
		cullbl2.setIcon(new ImageIcon(cul2img));
		
		JLabel cullbl3 = new JLabel("");
		cullbl3.setBounds(177, 106, 62, 62);
		culturepanel.add(cullbl3);
		cullbl3.setIcon(new ImageIcon(cul3img));
		
		JLabel cullbl4 = new JLabel("");
		cullbl4.setBounds(20, 75, 62, 62);
		culturepanel.add(cullbl4);
		cullbl4.setIcon(new ImageIcon(cul4img));
		
		JLabel cullbl5 = new JLabel("");
		cullbl5.setBounds(90, 141, 62, 62);
		culturepanel.add(cullbl5);
		cullbl5.setIcon(new ImageIcon(cul5img));
		
		
		Exit.addMouseListener(new MouseAdapter() {
		     @Override
		     public void mouseClicked(MouseEvent arg0) {
		    	 if(JOptionPane.showConfirmDialog(null, "\u0395\u03AF\u03C3\u03C4\u03B5 \u03C3\u03AF\u03B3\u03BF\u03C5\u03C1\u03BF\u03B9 \u03C0\u03C9\u03C2 \u03B8\u03AD\u03BB\u03B5\u03C4\u03B5 \u03BD\u03B1 \u03BA\u03BB\u03B5\u03AF\u03C3\u03B5\u03C4\u03B5 \u03C4\u03B7\u03BD \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE?", "\u039A\u03BB\u03B5\u03AF\u03C3\u03B9\u03BC\u03BF", JOptionPane.YES_NO_OPTION) == 0) {
		    		ChoiceMenu.this.dispose(); 
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
