package Cliente;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class clientiJFrame extends JFrame {

	private JPanel contentPane;
	ControllerClienti controller;
	
	public clientiJFrame(ControllerClienti c) {
		controller = c;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBorder(null);
		toolBar.setAlignmentX(Component.LEFT_ALIGNMENT);
		toolBar.setBorderPainted(false);
		toolBar.setFloatable(false);
		toolBar.setBackground(Color.WHITE);
		toolBar.setMaximumSize(new Dimension(100, 100));
		toolBar.setBounds(0, 11, 65, 563);
		toolBar.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(toolBar);
		
		JButton clienteButton = new JButton("Clienti");
		clienteButton.setForeground(Color.BLACK);
		toolBar.add(clienteButton);
		clienteButton.setIcon(null);
		clienteButton.setMaximumSize(new Dimension(65, 70));
		
		JButton venditeButton = new JButton("Vendite");
		venditeButton.setBorder(null);
		venditeButton.setBorderPainted(false);
		venditeButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\cassaaaa.png"));
		venditeButton.setMaximumSize(new Dimension(65, 70));
		toolBar.add(venditeButton);
		
		JButton dipendenteButton = new JButton("Dipendenti");
		dipendenteButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\scatolaaaa.png"));
		dipendenteButton.setBorderPainted(false);
		dipendenteButton.setBorder(null);
		dipendenteButton.setMaximumSize(new Dimension(65, 70));
		toolBar.add(dipendenteButton);
		
		JButton magazzinoButton = new JButton("Magazzino");
		magazzinoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\dipendentee.png"));
		magazzinoButton.setBorderPainted(false);
		magazzinoButton.setBorder(null);
		magazzinoButton.setBackground(UIManager.getColor("ToolBar.dockingBackground"));
		magazzinoButton.setMaximumSize(new Dimension(65, 70));
		toolBar.add(magazzinoButton);
		
		Component verticalStrut = Box.createVerticalStrut(200);
		verticalStrut.setBackground(Color.LIGHT_GRAY);
		toolBar.add(verticalStrut);
		
		JButton infoButton = new JButton("Info");
		infoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\infoo.png"));
		infoButton.setBorder(null);
		infoButton.setBorderPainted(false);
		infoButton.setMaximumSize(new Dimension(65, 70));
		toolBar.add(infoButton);
		
		JButton creaTesseraButton = new JButton("Crea Nuova Tessera");
		creaTesseraButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				controller.pressNuovaTesseraButton();
				
			}
		});
		creaTesseraButton.setFont(new Font("Arial", Font.PLAIN, 14));
		creaTesseraButton.setBounds(315, 228, 183, 102);
		contentPane.add(creaTesseraButton);
		
		JButton visualizzaClientiButton = new JButton("Visualizza Clienti");
		visualizzaClientiButton.setFont(new Font("Arial", Font.PLAIN, 14));
		visualizzaClientiButton.setBounds(534, 228, 183, 102);
		contentPane.add(visualizzaClientiButton);
	}
}
