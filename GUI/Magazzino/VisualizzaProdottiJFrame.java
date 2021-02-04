package GUI.Magazzino;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerMagazzino;
import Controller.ControllerPrincipale;

import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VisualizzaProdottiJFrame extends JFrame {

	private JPanel VisualizzaProdottiPanel;
	private ControllerMagazzino ControllerM;
	private ControllerPrincipale ControllerP;

	/**
	 * Create the frame.
	 */
	public VisualizzaProdottiJFrame(ControllerMagazzino c, ControllerPrincipale cp) {
		ControllerM = c;
		ControllerP = cp;
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		VisualizzaProdottiPanel = new JPanel();
		VisualizzaProdottiPanel.setBackground(new Color(255, 228, 181));
		VisualizzaProdottiPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		VisualizzaProdottiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(VisualizzaProdottiPanel);
		VisualizzaProdottiPanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		MenùLateraleTB.setBounds(0, 0, 66, 563);
		VisualizzaProdottiPanel.add(MenùLateraleTB);
		
		
		JButton ClientiButton = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.VisualizzaProdottiMenuLateraleClientiBottonePremuto();
			}
		});
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		ClientiButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.VisualizzaProdottiMenuLateraleVenditeBottonePremuto();
			}
		});
		MenùLateraleTB.add(VenditeButton);
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton MagazzinoButton = new JButton("");
		MenùLateraleTB.add(MagazzinoButton);
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.VisualizzaProdottiMenuLateraleMagazzinoBottonePremuto();
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		
		Component VerticalStrut = Box.createVerticalStrut(280);
		MenùLateraleTB.add(VerticalStrut);
		VerticalStrut.setMaximumSize(new Dimension(32767, 300));
		
		JToolBar PercorsoTB = new JToolBar();
		PercorsoTB.setBorder(null);
		PercorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		PercorsoTB.setBorderPainted(false);
		PercorsoTB.setFloatable(false);
		PercorsoTB.setBackground(new Color(255, 204, 153));
		PercorsoTB.setMaximumSize(new Dimension(100, 100));
		PercorsoTB.setBounds(65, 0, 976, 30);
		VisualizzaProdottiPanel.add(PercorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Magazzino");
		MagazzinoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VisualizzaProdotti_MagazzinoPercorsoBottonePremuto();
			}
		});
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(MagazzinoPercorsoButton);
		
		JButton VisualizzaProdottiPercorsoButton = new JButton("> Visualizza Prodotti");
		VisualizzaProdottiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VisualizzaProdotti_VisualizzaProdottiPercorsoBottonePremuto();
			}
		});
		VisualizzaProdottiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VisualizzaProdottiPercorsoButton);
		
		JPanel ContainerPanel = new JPanel();
		ContainerPanel.setBackground(new Color(255, 204, 153));
		ContainerPanel.setBounds(186, 127, 663, 318);
		VisualizzaProdottiPanel.add(ContainerPanel);
		ContainerPanel.setLayout(null);
		
		JButton FruttaButton = new JButton("Frutta");
		FruttaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraVisualizzaFrutta();
				ControllerM.CompletaTabellaFrutta();
			}
		});
		FruttaButton.setBounds(10, 11, 213, 145);
		ContainerPanel.add(FruttaButton);
		
		JButton VerduraButton = new JButton("Verdura");
		VerduraButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraVisualizzaVerdura();
				ControllerM.CompletaTabellaVerdura();
				
			}
		});
		VerduraButton.setBounds(223, 11, 213, 145);
		ContainerPanel.add(VerduraButton);
		
		JButton LatticiniButton = new JButton("Latticini");
		LatticiniButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraVisualizzaLatticini();
				ControllerM.CompletaTabellaLatticini();
				
			}
		});
		LatticiniButton.setBounds(436, 11, 213, 145);
		ContainerPanel.add(LatticiniButton);
		
		JButton FarinaceiButton = new JButton("Farinacei");
		FarinaceiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraVisualizzaFarinacei();
				ControllerM.CompletaTabellaFarinacei();
				
			}
		});
		FarinaceiButton.setBounds(10, 162, 213, 145);
		ContainerPanel.add(FarinaceiButton);
		
		JButton ConfezionatiButton = new JButton("Confezionati");
		ConfezionatiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraVisualizzaConfezionati();
				ControllerM.CompletaTabellaConfezionati();
				
			}
		});
		ConfezionatiButton.setBounds(223, 162, 213, 145);
		ContainerPanel.add(ConfezionatiButton);
		
		JButton UovaButton = new JButton("Uova");
		UovaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraVisualizzaUova();
				ControllerM.CompletaTabellaUova();
				
			}
		});
		UovaButton.setBounds(436, 162, 213, 145);
		ContainerPanel.add(UovaButton);
		
		JLabel SelezionaCategoriaLB = new JLabel("Seleziona la categoria di cui vuoi visualizzare i prodotti");
		SelezionaCategoriaLB.setFont(new Font("Arial", Font.BOLD, 20));
		SelezionaCategoriaLB.setBounds(255, 62, 612, 66);
		VisualizzaProdottiPanel.add(SelezionaCategoriaLB);
	}
}
