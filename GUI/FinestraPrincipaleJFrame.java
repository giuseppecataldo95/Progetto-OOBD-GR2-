package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCliente;
import Controller.ControllerMagazzino;
import Controller.ControllerPrincipale;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;

public class FinestraPrincipaleJFrame extends JFrame {

	private JPanel FinestraPrincipalePanel;
	private JPanel ContainerBottoniPanel;
	private ControllerPrincipale Controller;
	
	public FinestraPrincipaleJFrame(ControllerPrincipale P) {
		Controller = P;
		setTitle("ProgettoOOBD2020");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		FinestraPrincipalePanel = new JPanel();
		FinestraPrincipalePanel.setBackground(new Color(255, 228, 181));
		FinestraPrincipalePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(FinestraPrincipalePanel);
		FinestraPrincipalePanel.setLayout(null);
		
		JLabel BenvenutoLB = new JLabel("Benvenuto/a,");
		BenvenutoLB.setFont(new Font("Arial", Font.BOLD, 40));
		BenvenutoLB.setBounds(367, 26, 260, 59);
		FinestraPrincipalePanel.add(BenvenutoLB);
		
		JLabel SelezionaLB = new JLabel("Seleziona l'area tematica:");
		SelezionaLB.setFont(new Font("Arial", Font.PLAIN, 30));
		SelezionaLB.setBounds(321, 74, 394, 36);
		FinestraPrincipalePanel.add(SelezionaLB);
		
		ContainerBottoniPanel = new JPanel();
		ContainerBottoniPanel.setBackground(new Color(255, 204, 153));
		ContainerBottoniPanel.setBorder(null);
		ContainerBottoniPanel.setBounds(50, 143, 878, 273);
		FinestraPrincipalePanel.add(ContainerBottoniPanel);
		ContainerBottoniPanel.setLayout(new BoxLayout(ContainerBottoniPanel, BoxLayout.X_AXIS));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(140, 32767));
		ContainerBottoniPanel.add(horizontalStrut);
		
		JButton ClientiButton = new JButton("Clienti");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			
			{
				
				Controller.FinestraPrincipaleClientiBottonePremuto();
				
			}
			
		});
		ClientiButton.setMaximumSize(new Dimension(170, 150));
		ClientiButton.setIconTextGap(10);
		ClientiButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		ClientiButton.setHorizontalTextPosition(SwingConstants.CENTER);
		ClientiButton.setFont(new Font("Arial", Font.PLAIN, 25));
		ClientiButton.setIcon(new ImageIcon(FinestraPrincipaleJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setBackground(new Color(255, 255, 153));
		ContainerBottoniPanel.add(ClientiButton);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(100, 0));
		horizontalStrut_1.setMaximumSize(new Dimension(50, 32767));
		ContainerBottoniPanel.add(horizontalStrut_1);
		
		JButton VenditeButton = new JButton("Vendite");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Controller.FinestraPrincipaleVenduteBottonePremuto();
				
			}
		});
		VenditeButton.setMaximumSize(new Dimension(170, 150));
		VenditeButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		VenditeButton.setIconTextGap(10);
		VenditeButton.setHorizontalTextPosition(SwingConstants.CENTER);
		VenditeButton.setFont(new Font("Arial", Font.PLAIN, 25));
		VenditeButton.setIcon(new ImageIcon(FinestraPrincipaleJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setBackground(new Color(255, 255, 153));
		ContainerBottoniPanel.add(VenditeButton);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(100, 0));
		horizontalStrut_2.setMaximumSize(new Dimension(50, 32767));
		ContainerBottoniPanel.add(horizontalStrut_2);
		
		JButton MagazzinoButton = new JButton("Magazzino");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.FinestraPrincipaleMagazzinoBottonePremuto();
			}
		});
		MagazzinoButton.setMaximumSize(new Dimension(170, 150));
		MagazzinoButton.setHorizontalTextPosition(SwingConstants.CENTER);
		MagazzinoButton.setIcon(new ImageIcon(FinestraPrincipaleJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setIconTextGap(10);
		MagazzinoButton.setFont(new Font("Arial", Font.PLAIN, 25));
		MagazzinoButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		MagazzinoButton.setActionCommand("Magazzino");
		MagazzinoButton.setBackground(new Color(255, 255, 153));
		ContainerBottoniPanel.add(MagazzinoButton);
		
	}
}
