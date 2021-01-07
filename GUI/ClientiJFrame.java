package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCliente;

import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import java.awt.Dimension;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class ClientiJFrame extends JFrame {

	private JPanel ClientiPanel;
	
	ControllerCliente controller;

	
	public ClientiJFrame(ControllerCliente c)  {
		controller =c;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		ClientiPanel = new JPanel();
		ClientiPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		ClientiPanel.setBackground(new Color(255, 228, 181));
		ClientiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ClientiPanel);
		ClientiPanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 0, 65, 574);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		ClientiPanel.add(MenùLateraleTB);
		
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

		
		JButton CreaTesseraButton = new JButton("Crea Nuova Tessera");
		CreaTesseraButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
					controller.ClientiCreaNuovaTesseraButtonPressed();
				
			}
		});
		CreaTesseraButton.setFont(new Font("Arial", Font.PLAIN, 14));
		CreaTesseraButton.setBounds(315, 228, 183, 102);
		ClientiPanel.add(CreaTesseraButton);
		
		JButton VisualizzaClientiButton = new JButton("Visualizza Clienti");
		VisualizzaClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				controller.ClientiVisualizzaClientiButtonPressed();
				
			}
		});
		VisualizzaClientiButton.setFont(new Font("Arial", Font.PLAIN, 14));
		VisualizzaClientiButton.setBounds(534, 228, 183, 102);
		ClientiPanel.add(VisualizzaClientiButton);
		
		JLabel ClientiLB = new JLabel("Benvenuto nella sezione dedicata ai clienti!");
		ClientiLB.setFont(new Font("Arial", Font.PLAIN, 18));
		ClientiLB.setBounds(352, 76, 345, 26);
		ClientiPanel.add(ClientiLB);

	}
}

