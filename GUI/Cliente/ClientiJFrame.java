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
	private JButton MagazzinoButton;
	private ControllerPrincipale ControllerP;
	
	
	
	public  ClientiJFrame(ControllerCliente CC, ControllerPrincipale CP) {
		ControllerC = CC;
		ControllerP = CP;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		setResizable(false);
		ClientiPanel = new JPanel();
		ClientiPanel.setBackground(new Color(255, 222, 173));
		ClientiPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		ClientiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ClientiPanel);
		
		JPanel ContainerPanel = new JPanel();
		ContainerPanel.setBackground(new Color(255, 228, 181));
		ContainerPanel.setMinimumSize(new Dimension(310, 189));
		ContainerPanel.setBounds(290, 219, 490, 108);
		ClientiPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 153));
		ClientiPanel.add(panel);
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
		
		JButton AggiungiTesseraButton = new JButton("Aggiungi Nuova Tessera");
		AggiungiTesseraButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				ControllerC.ClientiCreaNuovaTesseraButtonPressed();
			}
		});
		AggiungiTesseraButton.setFont(new Font("Arial", Font.BOLD, 12));
		AggiungiTesseraButton.setBackground(new Color(255, 204, 153));
		AggiungiTesseraButton.setMaximumSize(new Dimension(186, 102));
		AggiungiTesseraButton.setPreferredSize(new Dimension(186, 102));
		panel_1.add(AggiungiTesseraButton, BorderLayout.WEST);
		
		JButton VisualizzaClientiButton = new JButton("Visualizza Clienti");
		VisualizzaClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerC.ClientiVisualizzaClientiButtonPressed();
				ControllerC.PopolaComuni();

				ControllerC.CompletaTabellaTessera();
				

				
			}
		});
		VisualizzaClientiButton.setFont(new Font("Arial", Font.BOLD, 12));
		VisualizzaClientiButton.setBackground(new Color(255, 204, 153));
		VisualizzaClientiButton.setMaximumSize(new Dimension(186, 102));
		VisualizzaClientiButton.setPreferredSize(new Dimension(186, 23));
		panel_1.add(VisualizzaClientiButton, BorderLayout.EAST);
		
		JLabel lblNewLabel = new JLabel("Sezione Clienti");
		lblNewLabel.setPreferredSize(new Dimension(90, 50));
		lblNewLabel.setMinimumSize(new Dimension(90, 50));
		lblNewLabel.setMaximumSize(new Dimension(90, 50));
		lblNewLabel.setBackground(new Color(255, 204, 153));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
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
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.ClientiMenuLateraleClientiBottonePremuto();
				
				
			}
		});
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(VenditeButton);
		
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.ClientiMenuLateraleMagazzinoButtonPressed();
				
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(MagazzinoButton);
		
		Component verticalStrut = Box.createVerticalStrut(280);
		verticalStrut.setMaximumSize(new Dimension(32767, 300));
		MenùLateraleTB.add(verticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setBackground(new Color(255, 153, 51));
		InfoButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/info-menu.png")));
		InfoButton.setBorder(null);
		InfoButton.setBorderPainted(false);
		InfoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(InfoButton);
	}
}
