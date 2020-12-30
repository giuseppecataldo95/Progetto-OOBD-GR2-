package Cliente;
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
import java.awt.Font;
import javax.swing.JLabel;

public class ClientiJFrame extends JFrame {

	private JPanel ClientiPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientiJFrame frame = new ClientiJFrame();
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
	public ClientiJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		ClientiPanel = new JPanel();
		ClientiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ClientiPanel);
		ClientiPanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 102, 0));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 11, 65, 563);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		ClientiPanel.add(MenùLateraleTB);
		
		JButton ClienteButton = new JButton("");
		ClienteButton.setBackground(new Color(255, 102, 0));
		ClienteButton.setForeground(Color.BLACK);
		MenùLateraleTB.add(ClienteButton);
		ClienteButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\clientiii.png"));
		ClienteButton.setMaximumSize(new Dimension(65, 70));
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setBackground(new Color(255, 102, 0));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\cassaaaa.png"));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(VenditeButton);
		
		JButton DipendenteButton = new JButton("");
		DipendenteButton.setBackground(new Color(255, 102, 0));
		DipendenteButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\scatolaaaa.png"));
		DipendenteButton.setBorderPainted(false);
		DipendenteButton.setBorder(null);
		DipendenteButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(DipendenteButton);
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\dipendentee.png"));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setBackground(new Color(255, 102, 0));
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(MagazzinoButton);
		
		Component verticalStrut = Box.createVerticalStrut(200);
		verticalStrut.setBackground(Color.LIGHT_GRAY);
		MenùLateraleTB.add(verticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setBackground(new Color(255, 102, 0));
		InfoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\infoo.png"));
		InfoButton.setBorder(null);
		InfoButton.setBorderPainted(false);
		InfoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(InfoButton);
		
		JButton CreaTesseraButton = new JButton("Crea Nuova Tessera");
		CreaTesseraButton.setForeground(Color.BLACK);
		CreaTesseraButton.setBackground(Color.YELLOW);
		CreaTesseraButton.setFont(new Font("Arial", Font.PLAIN, 14));
		CreaTesseraButton.setBounds(315, 228, 183, 102);
		ClientiPanel.add(CreaTesseraButton);
		
		JButton VisualizzaClientiButton = new JButton("Visualizza Clienti");
		VisualizzaClientiButton.setForeground(Color.BLACK);
		VisualizzaClientiButton.setBackground(Color.YELLOW);
		VisualizzaClientiButton.setFont(new Font("Arial", Font.PLAIN, 14));
		VisualizzaClientiButton.setBounds(534, 228, 183, 102);
		ClientiPanel.add(VisualizzaClientiButton);
		
		JLabel SelezionaLB = new JLabel("Seleziona l'operazione da compiere:");
		SelezionaLB.setFont(new Font("Arial", Font.PLAIN, 22));
		SelezionaLB.setBounds(348, 115, 350, 102);
		ClientiPanel.add(SelezionaLB);
	}
}
