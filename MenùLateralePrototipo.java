import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.Dimension;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MenùLateralePrototipo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenùLateralePrototipo frame = new MenùLateralePrototipo();
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
	public MenùLateralePrototipo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBorder(null);
		toolBar.setAlignmentX(Component.LEFT_ALIGNMENT);
		toolBar.setBorderPainted(false);
		toolBar.setFloatable(false);
		toolBar.setBackground(Color.WHITE);
		toolBar.setMaximumSize(new Dimension(100, 100));
		toolBar.setBounds(0, 11, 65, 563);
		toolBar.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(toolBar);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(null);
		toolBar.add(btnNewButton_1);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\clientiii.png"));
		btnNewButton_1.setMaximumSize(new Dimension(65, 70));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\cassaaaa.png"));
		btnNewButton.setMaximumSize(new Dimension(65, 70));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\scatolaaaa.png"));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setMaximumSize(new Dimension(65, 70));
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\dipendentee.png"));
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(UIManager.getColor("ToolBar.dockingBackground"));
		btnNewButton_3.setMaximumSize(new Dimension(65, 70));
		toolBar.add(btnNewButton_3);
		
		Component verticalStrut = Box.createVerticalStrut(200);
		toolBar.add(verticalStrut);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\infoo.png"));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setMaximumSize(new Dimension(65, 70));
		toolBar.add(btnNewButton_4);
	}
}
