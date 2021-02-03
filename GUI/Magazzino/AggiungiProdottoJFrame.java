package GUI.Magazzino;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerMagazzino;
import Controller.ControllerPrincipale;
import Controller.ControllerVendite;

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

public class AggiungiProdottoJFrame extends JFrame {

	private JPanel AggiungiNuovoProdottoPanel;
	private ControllerMagazzino ControllerM;
	private ControllerPrincipale ControllerP;

	/**
	 * Create the frame.
	 */
	public AggiungiProdottoJFrame(ControllerMagazzino c, ControllerPrincipale cp) {
		ControllerM = c;
		ControllerP = cp;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		AggiungiNuovoProdottoPanel = new JPanel();
		AggiungiNuovoProdottoPanel.setBackground(new Color(255, 228, 181));
		AggiungiNuovoProdottoPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		AggiungiNuovoProdottoPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(AggiungiNuovoProdottoPanel);
		AggiungiNuovoProdottoPanel.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(new Color(255, 153, 51));
		toolBar.setBorder(null);
		toolBar.setFloatable(false);
		toolBar.setOrientation(SwingConstants.VERTICAL);
		toolBar.setBounds(0, 0, 66, 563);
		AggiungiNuovoProdottoPanel.add(toolBar);
		
		
		JButton ClientiButton = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiProdottoMenuLateraleClientiBottonePremuto();
			}
		});
		toolBar.add(ClientiButton);
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		ClientiButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiProdottoMenuLateraleVenditeBottonePremuto();
			}
		});
		toolBar.add(VenditeButton);
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton MagazzinoButton = new JButton("");
		toolBar.add(MagazzinoButton);
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiProdottoMenuLateraleMagazzinoBottonePremuto();
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		
		Component verticalStrut = Box.createVerticalStrut(280);
		toolBar.add(verticalStrut);
		verticalStrut.setMaximumSize(new Dimension(32767, 300));
		
		JToolBar percorsoTB = new JToolBar();
		percorsoTB.setBorder(null);
		percorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		percorsoTB.setBorderPainted(false);
		percorsoTB.setFloatable(false);
		percorsoTB.setBackground(new Color(255, 204, 153));
		percorsoTB.setMaximumSize(new Dimension(100, 100));
		percorsoTB.setBounds(65, 0, 976, 30);
		AggiungiNuovoProdottoPanel.add(percorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Magazzino");
		MagazzinoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.AggiungiProdotto_MagazzinoPercorsoBottonePremuto();
			}
		});
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(MagazzinoPercorsoButton);
		
		JButton AggiungiNuovoProdottoPercorsoButton = new JButton("> Aggiungi Nuovo Prodotto");
		AggiungiNuovoProdottoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.AggiungiProdotto_AggiungiProdottoPercorsoBottonePremuto();
			}
		});
		AggiungiNuovoProdottoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(AggiungiNuovoProdottoPercorsoButton);
		
		JPanel ContainerPanel = new JPanel();
		ContainerPanel.setBackground(new Color(255, 204, 153));
		ContainerPanel.setBounds(186, 127, 663, 318);
		AggiungiNuovoProdottoPanel.add(ContainerPanel);
		ContainerPanel.setLayout(null);
		
		JButton FruttaButton = new JButton("Frutta");
		FruttaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraFrutta();
			}
		});
		FruttaButton.setBounds(10, 11, 213, 145);
		ContainerPanel.add(FruttaButton);
		
		JButton VerduraButton = new JButton("Verdura");
		VerduraButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraVerdura();
			}
		});
		
		VerduraButton.setBounds(223, 11, 213, 145);
		ContainerPanel.add(VerduraButton);
		
		JButton LatticiniButton = new JButton("Farinacei");
		LatticiniButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraFarinacei();
			}
		});
		LatticiniButton.setBounds(10, 162, 213, 145);
		ContainerPanel.add(LatticiniButton);
		
		JButton FarinaceiButton = new JButton("Latticini");
		FarinaceiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraLatticini();
			}
		});
		FarinaceiButton.setBounds(436, 11, 213, 145);
		ContainerPanel.add(FarinaceiButton);
		
		JButton ConfezionatiButton = new JButton("Confezionati");
		ConfezionatiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraConfezionati();
			}
		});
		ConfezionatiButton.setBounds(223, 162, 213, 145);
		ContainerPanel.add(ConfezionatiButton);
		
		JButton UovaButton = new JButton("Uova");
		UovaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.MostraFinestraUova();
			}
		});
		
		UovaButton.setBounds(436, 162, 213, 145);
		ContainerPanel.add(UovaButton);
		
		JLabel SelezionaCategoriaLB = new JLabel("Seleziona la categoria in cui vuoi inserire un nuovo prodotto");
		SelezionaCategoriaLB.setFont(new Font("Arial", Font.BOLD, 20));
		SelezionaCategoriaLB.setBounds(229, 61, 685, 66);
		AggiungiNuovoProdottoPanel.add(SelezionaCategoriaLB);
	}
}
