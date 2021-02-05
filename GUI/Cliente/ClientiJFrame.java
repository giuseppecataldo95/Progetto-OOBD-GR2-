package GUI.Cliente;

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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class ClientiJFrame extends JFrame {

	private JPanel ClientiPanel;
	private ControllerCliente ControllerC;
	private ControllerPrincipale ControllerP;
	
	
	
	public  ClientiJFrame(ControllerCliente CC, ControllerPrincipale CP) {
		ControllerC = CC;
		ControllerP = CP;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		ClientiPanel = new JPanel();
		ClientiPanel.setBackground(new Color(255, 222, 173));
		ClientiPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		ClientiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ClientiPanel);
		
		JPanel CentralPanel = new JPanel();
		CentralPanel.setBackground(new Color(255, 228, 181));
		CentralPanel.setMinimumSize(new Dimension(310, 189));
		CentralPanel.setBounds(290, 219, 490, 108);
		ClientiPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel CentralePanel = new JPanel();
		CentralePanel.setBackground(new Color(255, 204, 153));
		ClientiPanel.add(CentralePanel);
		CentralePanel.setLayout(new BorderLayout(0, 0));
		CentralePanel.add(CentralPanel, BorderLayout.CENTER);
		CentralPanel.setLayout(new BorderLayout(0, 0));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(200, 0));
		horizontalStrut.setMinimumSize(new Dimension(150, 0));
		horizontalStrut.setMaximumSize(new Dimension(300, 32767));
		CentralPanel.add(horizontalStrut, BorderLayout.WEST);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setPreferredSize(new Dimension(0, 200));
		CentralPanel.add(verticalStrut, BorderLayout.NORTH);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(200, 0));
		CentralPanel.add(horizontalStrut_1, BorderLayout.EAST);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 200));
		CentralPanel.add(verticalStrut_1, BorderLayout.SOUTH);
		
		JPanel ContainerPanel = new JPanel();
		ContainerPanel.setBorder(null);
		ContainerPanel.setBackground(new Color(255, 228, 181));
		CentralPanel.add(ContainerPanel, BorderLayout.CENTER);
		ContainerPanel.setLayout(new BorderLayout(0, 0));
		
		JButton AggiungiTesseraButton = new JButton("Aggiungi Nuova Tessera");
		AggiungiTesseraButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerC.ClientiCreaNuovaTesseraBottonePremuto();
			}
		});
		AggiungiTesseraButton.setFont(new Font("Arial", Font.BOLD, 12));
		AggiungiTesseraButton.setBackground(new Color(255, 204, 153));
		AggiungiTesseraButton.setMaximumSize(new Dimension(186, 102));
		AggiungiTesseraButton.setPreferredSize(new Dimension(186, 102));
		ContainerPanel.add(AggiungiTesseraButton, BorderLayout.WEST);
		
		JButton VisualizzaClientiButton = new JButton("Visualizza Clienti");
		VisualizzaClientiButton.setFont(new Font("Arial", Font.BOLD, 12));
		VisualizzaClientiButton.setBackground(new Color(255, 204, 153));
		VisualizzaClientiButton.setMaximumSize(new Dimension(186, 102));
		VisualizzaClientiButton.setPreferredSize(new Dimension(186, 23));
		ContainerPanel.add(VisualizzaClientiButton, BorderLayout.EAST);
		VisualizzaClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerC.ClientiVisualizzaClientiBottonePremuto();
				ControllerC.CompletaTabellaTessera();
			}
		});
		
		JLabel ClientiLB = new JLabel("Sezione Clienti");
		ClientiLB.setPreferredSize(new Dimension(90, 50));
		ClientiLB.setMinimumSize(new Dimension(90, 50));
		ClientiLB.setMaximumSize(new Dimension(90, 50));
		ClientiLB.setBackground(new Color(255, 204, 153));
		ClientiLB.setFont(new Font("Arial", Font.PLAIN, 22));
		ClientiLB.setHorizontalAlignment(SwingConstants.CENTER);
		CentralePanel.add(ClientiLB, BorderLayout.NORTH);
		
		JToolBar MenùLateraleTB = new JToolBar();
		ClientiPanel.add(MenùLateraleTB, BorderLayout.WEST);
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		
		
		JButton ClientiButton = new JButton("");
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		ClientiButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setToolTipText("Clienti");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.ClientiMenuLateraleClientiBottonePremuto();
				
				
			}
		});
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		VenditeButton.setToolTipText("Vendite");
		MenùLateraleTB.add(VenditeButton);
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.ClientiMenuLateraleVenditeBottonoPremuto();
				
			}
		});
		
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MagazzinoButton.setToolTipText("Magazzino");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.ClientiMenuLateraleMagazzinoBottonePremuto();
				
			}
		});
		MenùLateraleTB.add(MagazzinoButton);
	}
}
