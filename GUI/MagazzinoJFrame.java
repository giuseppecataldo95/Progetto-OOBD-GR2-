package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.ControllerMagazzino;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class MagazzinoJFrame extends JFrame {

	private JPanel MagazzinoPanel;
	private ControllerMagazzino Controller;
	private JButton MagazzinoButton;

	/**
	 * Create the frame.
	 */
	public  MagazzinoJFrame(ControllerMagazzino c) {
		Controller = c;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		MagazzinoPanel = new JPanel();
		MagazzinoPanel.setBackground(new Color(255, 222, 173));
		MagazzinoPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		MagazzinoPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MagazzinoPanel);
		MagazzinoPanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 0, 65, 563);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		MagazzinoPanel.add(MenùLateraleTB);
		
		JButton ClientiButton = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraClientidaMagazzino();
			}
		});
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\clientiii.png"));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\cassaaaa.png"));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(VenditeButton);
		
		MagazzinoButton = new JButton("");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\scatolaaaa.png"));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(MagazzinoButton);
		
		JButton DipendentiButton = new JButton("");
		DipendentiButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\dipendentee.png"));
		DipendentiButton.setBorderPainted(false);
		DipendentiButton.setBorder(null);
		DipendentiButton.setBackground(new Color(255, 153, 51));
		DipendentiButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(DipendentiButton);
		
		Component verticalStrut = Box.createVerticalStrut(200);
		MenùLateraleTB.add(verticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setBackground(new Color(255, 153, 51));
		InfoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\infoo.png"));
		InfoButton.setBorder(null);
		InfoButton.setBorderPainted(false);
		InfoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(InfoButton);
		
		JPanel ContainerPanel = new JPanel();
		ContainerPanel.setBackground(new Color(255, 228, 181));
		ContainerPanel.setMinimumSize(new Dimension(310, 189));
		ContainerPanel.setBounds(290, 219, 490, 108);
		MagazzinoPanel.add(ContainerPanel);
		ContainerPanel.setLayout(new BoxLayout(ContainerPanel, BoxLayout.X_AXIS));
		
		JButton AggiungiNuovoProdottoButton = new JButton("Aggiungi nuovo prodotto");
		AggiungiNuovoProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraAggiungiProdotto();
				
			}
		});
		AggiungiNuovoProdottoButton.setMaximumSize(new Dimension(310, 189));
		ContainerPanel.add(AggiungiNuovoProdottoButton);
		
		Component horizontalStrut = Box.createHorizontalStrut(40);
		ContainerPanel.add(horizontalStrut);
		
		JButton VisualizzaProdottiButton = new JButton("Visualizza prodotti");
		VisualizzaProdottiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraVisualizzaProdotto();
				
			}
		});
		VisualizzaProdottiButton.setMaximumSize(new Dimension(310, 189));
		VisualizzaProdottiButton.setMinimumSize(new Dimension(310, 189));
		ContainerPanel.add(VisualizzaProdottiButton);
	}
}
