package quiz;
import java.awt.BorderLayout;
import java.awt.Color;
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

public class Help_frame extends JFrame {

	private JPanel contentPane;

	 private Image img = new ImageIcon(Help_frame.class.getResource("icons/help.png")).getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help_frame frame = new Help_frame();
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
	public Help_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setBounds(100, 100, 718, 542);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Exit = new JLabel("X");
		Exit.setBackground(new Color(255, 255, 255));
		Exit.setFont(new Font("Comic Sans MS", Font.BOLD, 21));
		Exit.setForeground(new Color(255, 255, 255));
		Exit.setBounds(685, 0, 33, 56);
		contentPane.add(Exit);
		
		JLabel lblNewLabel = new JLabel("\u039F\u03B4\u03B7\u03B3\u03AF\u03B5\u03C2 \u03A7\u03C1\u03AE\u03C3\u03B7\u03C2");
		lblNewLabel.setForeground(new Color(153, 255, 153));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 34));
		lblNewLabel.setBounds(77, 22, 300, 84);
		contentPane.add(lblNewLabel);
		
		JLabel imglbl = new JLabel("");
		imglbl.setBounds(10, 11, 67, 84);
		contentPane.add(imglbl);
		imglbl.setIcon(new ImageIcon(img));
		
		
		Exit.addMouseListener(new MouseAdapter() {
		     @Override
		     public void mouseClicked(MouseEvent arg0) {
		    	 if(JOptionPane.showConfirmDialog(null, "Είστε σίγουροι πως θέλετε να κλείσετε αυτό το παράθυρο?", "Κλείσιμο", JOptionPane.YES_NO_OPTION) == 0) {
		    		Help_frame.this.dispose(); 
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
