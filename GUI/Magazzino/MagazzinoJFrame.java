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
	private JButton MagazzinoButton;

	
	public  MagazzinoJFrame(ControllerMagazzino c) {
		Controller = c;
		
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
		ContainerPanel.setBounds(290, 219, 490, 108);
		MagazzinoPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 153));
		MagazzinoPanel.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		panel.add(ContainerPanel, BorderLayout.CENTER);
		ContainerPanel.setLayout(new BorderLayout(0, 0));
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 0, 65, 574);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		MagazzinoPanel.add(MenùLateraleTB, BorderLayout.WEST);
		
		JButton ClientiButton = new JButton("");
		ClientiButton.setFont(new Font("Arial", Font.PLAIN, 12));
		ClientiButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setBorder(null);
		ClientiButton.setBorderPainted(false);
		ClientiButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\clientiii.png"));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setFont(new Font("Arial", Font.PLAIN, 12));
		VenditeButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(VenditeButton);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setBorder(null);
		VenditeButton.setIcon(null);
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		JButton DipendentiButton = new JButton("");
		DipendentiButton.setFont(new Font("Arial", Font.PLAIN, 12));
		DipendentiButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(DipendentiButton);
		DipendentiButton.setBorderPainted(false);
		DipendentiButton.setBorder(null);
		DipendentiButton.setIcon(null);
		DipendentiButton.setMaximumSize(new Dimension(65, 70));
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(MagazzinoButton);
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setIcon(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		
		Component VerticalStrut = Box.createVerticalStrut(200);
		VerticalStrut.setBackground(Color.LIGHT_GRAY);
		MenùLateraleTB.add(VerticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		InfoButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(InfoButton);
		InfoButton.setBorderPainted(false);
		InfoButton.setBorder(null);
		InfoButton.setIcon(null);
		InfoButton.setMaximumSize(new Dimension(65, 70));
		
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
		lblNewLabel.setPreferredSize(new Dimension(90, 50));
		lblNewLabel.setMinimumSize(new Dimension(90, 50));
		lblNewLabel.setMaximumSize(new Dimension(90, 50));
		lblNewLabel.setBackground(new Color(255, 204, 153));
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		
	}
}
