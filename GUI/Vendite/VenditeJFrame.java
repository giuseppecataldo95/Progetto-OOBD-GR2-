package GUI.Vendite;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCliente;
import Controller.ControllerPrincipale;
import Controller.ControllerVendite;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class VenditeJFrame extends JFrame {

	private JPanel VenditePanel;
	private JButton MagazzinoButton;
	private ControllerPrincipale ControllerP;
	private ControllerVendite ControllerV;

	
	
	
	public  VenditeJFrame(ControllerVendite CV, ControllerPrincipale CP) {
		ControllerV = CV;
		ControllerP = CP;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		setResizable(false);
		VenditePanel = new JPanel();
		VenditePanel.setBackground(new Color(255, 222, 173));
		VenditePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		VenditePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(VenditePanel);
		
		JPanel ContainerPanel = new JPanel();
		ContainerPanel.setBackground(new Color(255, 228, 181));
		ContainerPanel.setMinimumSize(new Dimension(310, 189));
		ContainerPanel.setBounds(290, 219, 490, 108);
		VenditePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 153));
		VenditePanel.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		panel.add(ContainerPanel, BorderLayout.CENTER);
		ContainerPanel.setLayout(new BorderLayout(0, 0));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(200, 0));
		horizontalStrut.setMinimumSize(new Dimension(150, 0));
		horizontalStrut.setMaximumSize(new Dimension(300, 32767));
		ContainerPanel.add(horizontalStrut, BorderLayout.WEST);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 200));
		ContainerPanel.add(verticalStrut_1, BorderLayout.NORTH);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(200, 0));
		ContainerPanel.add(horizontalStrut_1, BorderLayout.EAST);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setPreferredSize(new Dimension(0, 200));
		ContainerPanel.add(verticalStrut_2, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(255, 228, 181));
		ContainerPanel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton CreaNuovoCarrelloJButton = new JButton("Crea Nuovo Carrello");
		CreaNuovoCarrelloJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerV.CreaCarrello();
				ControllerV.VenditeCreaCarrelloBottonePremuto();
			}
		});
		CreaNuovoCarrelloJButton.setFont(new Font("Arial", Font.BOLD, 12));
		CreaNuovoCarrelloJButton.setBackground(new Color(255, 204, 153));
		CreaNuovoCarrelloJButton.setMaximumSize(new Dimension(186, 102));
		CreaNuovoCarrelloJButton.setPreferredSize(new Dimension(186, 102));
		panel_1.add(CreaNuovoCarrelloJButton, BorderLayout.WEST);
		
		JButton VisualizzaCronologiaVenditeJButton = new JButton(" Cronologia Vendite");
		VisualizzaCronologiaVenditeJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerV.VenditeCronologiaVenditeBottonePremuto();
			}
		});
		VisualizzaCronologiaVenditeJButton.setFont(new Font("Arial", Font.BOLD, 12));
		VisualizzaCronologiaVenditeJButton.setBackground(new Color(255, 204, 153));
		VisualizzaCronologiaVenditeJButton.setMaximumSize(new Dimension(186, 102));
		VisualizzaCronologiaVenditeJButton.setPreferredSize(new Dimension(186, 23));
		panel_1.add(VisualizzaCronologiaVenditeJButton, BorderLayout.EAST);
		
		JLabel SezioneVenditeLB = new JLabel("Sezione Vendite");
		SezioneVenditeLB.setPreferredSize(new Dimension(90, 50));
		SezioneVenditeLB.setMinimumSize(new Dimension(90, 50));
		SezioneVenditeLB.setMaximumSize(new Dimension(90, 50));
		SezioneVenditeLB.setBackground(new Color(255, 204, 153));
		SezioneVenditeLB.setFont(new Font("Arial", Font.PLAIN, 22));
		SezioneVenditeLB.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(SezioneVenditeLB, BorderLayout.NORTH);
		
		JToolBar MenùLateraleTB = new JToolBar();
		VenditePanel.add(MenùLateraleTB, BorderLayout.WEST);
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		
		
		JButton ClientiButton = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.VenditeMenùLateraleClientiBottonePremuto();
				
			}
		});
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon(VenditeJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.VenditeMenùLateraleVenditeBottonePremuto();
				
			}
		});
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(VenditeJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(VenditeButton);
		
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.VenditeMenùLateraleMagazzinoBottonePremuto();
				
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(VenditeJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(MagazzinoButton);
		
		Component verticalStrut = Box.createVerticalStrut(280);
		verticalStrut.setMaximumSize(new Dimension(32767, 300));
		MenùLateraleTB.add(verticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setBackground(new Color(255, 153, 51));
		InfoButton.setIcon(new ImageIcon(VenditeJFrame.class.getResource("/Risorse/info-menu.png")));
		InfoButton.setBorder(null);
		InfoButton.setBorderPainted(false);
		InfoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(InfoButton);
	}
}
