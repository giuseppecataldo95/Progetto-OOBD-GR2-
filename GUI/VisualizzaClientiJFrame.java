package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCliente;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VisualizzaClientiJFrame extends JFrame {

	private JPanel VisualizzaClientiPanel;

	ControllerCliente controller;

	public VisualizzaClientiJFrame(ControllerCliente c) {
		controller = c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		VisualizzaClientiPanel = new JPanel();
		VisualizzaClientiPanel.setBackground(new Color(255, 228, 181));
		VisualizzaClientiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		VisualizzaClientiPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(VisualizzaClientiPanel);
	
		

	JToolBar MenùLateraleTB = new JToolBar();
	MenùLateraleTB.setBorder(null);
	MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
	MenùLateraleTB.setBorderPainted(false);
	MenùLateraleTB.setFloatable(false);
	MenùLateraleTB.setBackground(new Color(255, 153, 51));
	MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
	MenùLateraleTB.setBounds(0, 0, 65, 574);
	MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
	VisualizzaClientiPanel.add(MenùLateraleTB);
	
	JButton ClientiButton = new JButton("");
	ClientiButton.setFont(new Font("Arial", Font.PLAIN, 12));
	ClientiButton.setBackground(new Color(255, 153, 51));
	MenùLateraleTB.add(ClientiButton);
	ClientiButton.setBorder(null);
	ClientiButton.setBorderPainted(false);
	ClientiButton.setIcon(null);
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

	JToolBar PercorsoTB = new JToolBar();
	PercorsoTB.setBorder(null);
	PercorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
	PercorsoTB.setBorderPainted(false);
	PercorsoTB.setFloatable(false);
	PercorsoTB.setBackground(new Color(255, 204, 153));
	PercorsoTB.setMaximumSize(new Dimension(100, 100));
	PercorsoTB.setBounds(65, 0, 976, 30);
	VisualizzaClientiPanel.add(PercorsoTB, BorderLayout.NORTH);
	
	JButton ClientiPercorsoButton = new JButton("> Clienti");
	ClientiPercorsoButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			controller.VisualizzaClientiClientiPercorsoButtonPressed();
			
		}
	});
	ClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
	PercorsoTB.add(ClientiPercorsoButton);
	
	JButton VisualizzaClientiPercorsoButton = new JButton("> Visualizza Clienti");
	VisualizzaClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
	PercorsoTB.add(VisualizzaClientiPercorsoButton);
	
	}
}
