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
		setResizable(false);
		setTitle("ProgettoOOBD2020");
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
		
		JPanel Panel = new JPanel();
		Panel.setBackground(new Color(255, 204, 153));
		VenditePanel.add(Panel);
		Panel.setLayout(new BorderLayout(0, 0));
		Panel.add(ContainerPanel, BorderLayout.CENTER);
		ContainerPanel.setLayout(new BorderLayout(0, 0));
		
		Component HorizontalStrut = Box.createHorizontalStrut(20);
		HorizontalStrut.setPreferredSize(new Dimension(200, 0));
		HorizontalStrut.setMinimumSize(new Dimension(150, 0));
		HorizontalStrut.setMaximumSize(new Dimension(300, 32767));
		ContainerPanel.add(HorizontalStrut, BorderLayout.WEST);
		
		Component VerticalStrut_1 = Box.createVerticalStrut(20);
		VerticalStrut_1.setPreferredSize(new Dimension(0, 200));
		ContainerPanel.add(VerticalStrut_1, BorderLayout.NORTH);
		
		Component HorizontalStrut_1 = Box.createHorizontalStrut(20);
		HorizontalStrut_1.setPreferredSize(new Dimension(200, 0));
		ContainerPanel.add(HorizontalStrut_1, BorderLayout.EAST);
		
		Component VerticalStrut_2 = Box.createVerticalStrut(20);
		VerticalStrut_2.setPreferredSize(new Dimension(0, 200));
		ContainerPanel.add(VerticalStrut_2, BorderLayout.SOUTH);
		
		JPanel Panel_1 = new JPanel();
		Panel_1.setBorder(null);
		Panel_1.setBackground(new Color(255, 228, 181));
		ContainerPanel.add(Panel_1, BorderLayout.CENTER);
		Panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton CreaNuovoCarrelloJButton = new JButton("Crea Nuovo Carrello");
		CreaNuovoCarrelloJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerV.VenditeCreaCarrelloBottonePremuto();
			}
		});
		CreaNuovoCarrelloJButton.setFont(new Font("Arial", Font.BOLD, 12));
		CreaNuovoCarrelloJButton.setBackground(new Color(255, 204, 153));
		CreaNuovoCarrelloJButton.setMaximumSize(new Dimension(186, 102));
		CreaNuovoCarrelloJButton.setPreferredSize(new Dimension(186, 102));
		Panel_1.add(CreaNuovoCarrelloJButton, BorderLayout.WEST);
		
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
		Panel_1.add(VisualizzaCronologiaVenditeJButton, BorderLayout.EAST);
		
		JLabel SezioneVenditeLB = new JLabel("Sezione Vendite");
		SezioneVenditeLB.setPreferredSize(new Dimension(90, 50));
		SezioneVenditeLB.setMinimumSize(new Dimension(90, 50));
		SezioneVenditeLB.setMaximumSize(new Dimension(90, 50));
		SezioneVenditeLB.setBackground(new Color(255, 204, 153));
		SezioneVenditeLB.setFont(new Font("Arial", Font.PLAIN, 22));
		SezioneVenditeLB.setHorizontalAlignment(SwingConstants.CENTER);
		Panel.add(SezioneVenditeLB, BorderLayout.NORTH);
		
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
		
		Component VerticalStrut = Box.createVerticalStrut(280);
		VerticalStrut.setMaximumSize(new Dimension(32767, 300));
		MenùLateraleTB.add(VerticalStrut);
	}
}
