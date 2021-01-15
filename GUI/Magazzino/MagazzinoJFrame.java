package GUI.Magazzino;

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
import Controller.ControllerPrincipale;
import GUI.Cliente.ClientiJFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class MagazzinoJFrame extends JFrame {

	private JPanel MagazzinoPanel;
	private ControllerMagazzino Controller;
	private ControllerPrincipale ControllerP;
	private JButton MagazzinoButton;

	
	public  MagazzinoJFrame(ControllerMagazzino c, ControllerPrincipale c1) {
		Controller = c;
		ControllerP = c1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		setResizable(false);
		MagazzinoPanel = new JPanel();
		MagazzinoPanel.setBackground(new Color(255, 222, 173));
		MagazzinoPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		MagazzinoPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MagazzinoPanel);
		
		JPanel ContainerPanel = new JPanel();
		ContainerPanel.setBackground(new Color(255, 228, 181));
		ContainerPanel.setMinimumSize(new Dimension(310, 189));
		ContainerPanel.setBounds(0, 50, 985, 512);
		MagazzinoPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 153));
		MagazzinoPanel.add(panel);
		panel.setLayout(null);
		panel.add(ContainerPanel);
		ContainerPanel.setLayout(null);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(0, 200, 200, 112);
		horizontalStrut.setPreferredSize(new Dimension(200, 0));
		horizontalStrut.setMinimumSize(new Dimension(150, 0));
		horizontalStrut.setMaximumSize(new Dimension(300, 32767));
		ContainerPanel.add(horizontalStrut);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setBounds(0, 0, 985, 200);
		verticalStrut_1.setPreferredSize(new Dimension(0, 200));
		ContainerPanel.add(verticalStrut_1);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(785, 200, 200, 112);
		horizontalStrut_1.setPreferredSize(new Dimension(200, 0));
		ContainerPanel.add(horizontalStrut_1);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalStrut_2.setBounds(0, 312, 985, 200);
		verticalStrut_2.setPreferredSize(new Dimension(0, 200));
		ContainerPanel.add(verticalStrut_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(200, 200, 585, 112);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(255, 228, 181));
		ContainerPanel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton AggiungiProdottoButton = new JButton("Aggiungi Nuovo Prodotto");
		AggiungiProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraAggiungiProdotto();
			}
		});
		AggiungiProdottoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AggiungiProdottoButton.setBackground(new Color(255, 204, 153));
		AggiungiProdottoButton.setMaximumSize(new Dimension(186, 102));
		AggiungiProdottoButton.setPreferredSize(new Dimension(186, 102));
		panel_1.add(AggiungiProdottoButton, BorderLayout.WEST);
		
		JButton VisualizzaProdottoButton = new JButton("Visualizza Prodotti");
		VisualizzaProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.MostraFinestraVisualizzaProdotto();
			}
		});
		VisualizzaProdottoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		VisualizzaProdottoButton.setBackground(new Color(255, 204, 153));
		VisualizzaProdottoButton.setMaximumSize(new Dimension(186, 102));
		VisualizzaProdottoButton.setPreferredSize(new Dimension(186, 23));
		panel_1.add(VisualizzaProdottoButton, BorderLayout.EAST);
		
		JLabel lblNewLabel = new JLabel("Sezione Magazzino");
		lblNewLabel.setBounds(0, 0, 985, 50);
		lblNewLabel.setPreferredSize(new Dimension(90, 50));
		lblNewLabel.setMinimumSize(new Dimension(90, 50));
		lblNewLabel.setMaximumSize(new Dimension(90, 50));
		lblNewLabel.setBackground(new Color(255, 204, 153));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MagazzinoPanel.add(MenùLateraleTB, BorderLayout.WEST);
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

