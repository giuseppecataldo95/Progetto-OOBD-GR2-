package GUI.Cliente;

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

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RiepilogoTesseraJFrame extends JFrame {


  
		public JPanel RiepilogoTesseraPanel;
		public JTextField RiepilogoNomeTB;
		public JTextField RiepilogoCognomeTB;
		public JTextField RiepilogoSessoTB;
		public JTextField RiepilogoLuogoNTB;
		public JTextField RiepilogoGiornoNTB;
		public JTextField RiepilogoCFTB;
		public JTextField RiepilogoMeseNTB;
		public JTextField RiepilogoAnnoNTB;
		ControllerCliente controller;
		private ControllerPrincipale ControllerP;
	

	public RiepilogoTesseraJFrame(ControllerCliente c, ControllerPrincipale c1) {
		ControllerP = c1;
		controller = c;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(150, 80, 1000, 600);

		RiepilogoTesseraPanel = new JPanel();
		RiepilogoTesseraPanel.setBackground(new Color(255, 228, 181));
		RiepilogoTesseraPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		RiepilogoTesseraPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(RiepilogoTesseraPanel);
		RiepilogoTesseraPanel.setLayout(null);
		
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 0, 65, 574);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		RiepilogoTesseraPanel.add(MenùLateraleTB);
		
		JButton ClientiButton = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.RiepilogoTesseraMenuLateraleClientiButtonPressed();
				
			}
		});
		ClientiButton.setFont(new Font("Arial", Font.PLAIN, 12));
		ClientiButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setBorder(null);
		ClientiButton.setBorderPainted(false);
		ClientiButton.setIcon(new ImageIcon(RiepilogoTesseraJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.RiepilogoTesseraMenùLateraleVenditeBottonePremuto();
				
			}
		});
		VenditeButton.setFont(new Font("Arial", Font.PLAIN, 12));
		VenditeButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(VenditeButton);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setBorder(null);
		VenditeButton.setIcon(new ImageIcon(RiepilogoTesseraJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(MagazzinoButton);
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setIcon(new ImageIcon(RiepilogoTesseraJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.RiepilogoTesseraMenuLateraleMagazzinoButtonPressed();
				
			}
		});
		
		Component verticalStrut = Box.createVerticalStrut(280);
		verticalStrut.setBackground(Color.LIGHT_GRAY);

		MenùLateraleTB.add(verticalStrut);
		
		
		JButton InfoButton = new JButton("");
		InfoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		InfoButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(InfoButton);
		InfoButton.setBorderPainted(false);
		InfoButton.setBorder(null);
		InfoButton.setIcon(new ImageIcon(RiepilogoTesseraJFrame.class.getResource("/Risorse/info-menu.png")));
		InfoButton.setMaximumSize(new Dimension(65, 70));
		

		JToolBar PercorsoTB = new JToolBar();
		PercorsoTB.setBorder(null);
		PercorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		PercorsoTB.setBorderPainted(false);
		PercorsoTB.setFloatable(false);
		PercorsoTB.setBackground(new Color(255, 204, 153));
		PercorsoTB.setMaximumSize(new Dimension(100, 100));
		PercorsoTB.setBounds(65, 0, 976, 30);
		RiepilogoTesseraPanel.add(PercorsoTB);

		JButton ClientiPercorsoButton = new JButton("> Clienti");
		ClientiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				controller.CreaNuovaTesseraClientiPercorsoButtonPressed();
				
			}
		});
		ClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(ClientiPercorsoButton);
		
		JButton CreaNuovaTesseraPercorsoButton = new JButton("> Nuova Tessera");
		CreaNuovaTesseraPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.RiepilogoTesseraNuovaTesseraPercorsoButtonPressed();
				
			}
		});
		CreaNuovaTesseraPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(CreaNuovaTesseraPercorsoButton);
		
		JButton RiepilogoNuovaTesseraPercorsoButton = new JButton("> Riepilogo Nuova Tessera");
		RiepilogoNuovaTesseraPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				controller.RiepilogoTesseraRiepilogoTesseraPercorsoButtonPressed();
				
			}
		});
		RiepilogoNuovaTesseraPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(RiepilogoNuovaTesseraPercorsoButton);
		
		JLabel Riepilogo1LB = new JLabel("Questo \u00E8 il riepilogo delle informazione del Cliente!");
		Riepilogo1LB.setHorizontalAlignment(SwingConstants.CENTER);
		Riepilogo1LB.setFont(new Font("Arial", Font.BOLD, 14));
		Riepilogo1LB.setBounds(279, 54, 416, 48);
		RiepilogoTesseraPanel.add(Riepilogo1LB);
		
		JLabel Riepilogo2LB = new JLabel("Controlla attentamente i dati inseriti!");
		Riepilogo2LB.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Riepilogo2LB.setBounds(372, 112, 268, 13);
		RiepilogoTesseraPanel.add(Riepilogo2LB);
		
		JLabel NomeInseritoLB = new JLabel("Nome Inserito:  ");
		NomeInseritoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		NomeInseritoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		NomeInseritoLB.setBounds(173, 181, 176, 13);
		RiepilogoTesseraPanel.add(NomeInseritoLB);
		
		JLabel CognomeInseritoLB = new JLabel("Cognome Inserito:  ");
		CognomeInseritoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		CognomeInseritoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		CognomeInseritoLB.setBounds(173, 236, 176, 13);
		RiepilogoTesseraPanel.add(CognomeInseritoLB);
		
		JLabel SessoInseritoLB = new JLabel("Sesso Inserito:  ");
		SessoInseritoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		SessoInseritoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		SessoInseritoLB.setBounds(173, 291, 176, 13);
		RiepilogoTesseraPanel.add(SessoInseritoLB);
		
		JLabel LuogoNInseritoLB = new JLabel("Luogo di nascita Inserito:   ");
		LuogoNInseritoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		LuogoNInseritoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		LuogoNInseritoLB.setBounds(173, 347, 176, 13);
		RiepilogoTesseraPanel.add(LuogoNInseritoLB);
		
		JLabel DataInseritaLB = new JLabel("Data di nascita Inserita:   ");
		DataInseritaLB.setHorizontalAlignment(SwingConstants.RIGHT);
		DataInseritaLB.setFont(new Font("Arial", Font.PLAIN, 12));
		DataInseritaLB.setBounds(173, 393, 176, 13);
		RiepilogoTesseraPanel.add(DataInseritaLB);

		
		JLabel CodFiscaleLB = new JLabel("Codice Fiscale Calcolato: ");
		CodFiscaleLB.setHorizontalAlignment(SwingConstants.RIGHT);
		CodFiscaleLB.setFont(new Font("Arial", Font.PLAIN, 12));
		CodFiscaleLB.setBounds(173, 442, 176, 13);

		RiepilogoTesseraPanel.add(CodFiscaleLB);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controller.RiepilogoTesseraIndietroButtonPressed();
				
				
			}
		});
		IndietroButton.setBounds(603, 491, 103, 31);
		RiepilogoTesseraPanel.add(IndietroButton);
		
		JButton AvantiButton = new JButton("Avanti");
		AvantiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					controller.RiepilogoTesseraAvantiButtonPressed();
						
				
					
				
			}
		});
		AvantiButton.setBounds(808, 491, 103, 31);
		RiepilogoTesseraPanel.add(AvantiButton);
		
		RiepilogoNomeTB = new JTextField();
		RiepilogoNomeTB.setEditable(false);
		RiepilogoNomeTB.setBounds(399, 178, 215, 19);
		RiepilogoTesseraPanel.add(RiepilogoNomeTB);
		RiepilogoNomeTB.setColumns(10);
		
		RiepilogoCognomeTB = new JTextField();
		RiepilogoCognomeTB.setEditable(false);
		RiepilogoCognomeTB.setColumns(10);
		RiepilogoCognomeTB.setBounds(399, 233, 215, 19);
		RiepilogoTesseraPanel.add(RiepilogoCognomeTB);
		
		RiepilogoSessoTB = new JTextField();
		RiepilogoSessoTB.setEditable(false);
		RiepilogoSessoTB.setColumns(10);
		RiepilogoSessoTB.setBounds(399, 288, 215, 19);
		RiepilogoTesseraPanel.add(RiepilogoSessoTB);
		
		RiepilogoLuogoNTB = new JTextField();
		RiepilogoLuogoNTB.setEditable(false);
		RiepilogoLuogoNTB.setColumns(10);
		RiepilogoLuogoNTB.setBounds(399, 344, 215, 19);
		RiepilogoTesseraPanel.add(RiepilogoLuogoNTB);
		
		RiepilogoGiornoNTB = new JTextField();
		RiepilogoGiornoNTB.setEditable(false);
		RiepilogoGiornoNTB.setColumns(10);
		RiepilogoGiornoNTB.setBounds(399, 390, 35, 19);
		RiepilogoTesseraPanel.add(RiepilogoGiornoNTB);
		
		RiepilogoCFTB = new JTextField();
		RiepilogoCFTB.setEditable(false);
		RiepilogoCFTB.setColumns(10);
		RiepilogoCFTB.setBounds(399, 439, 215, 19);
		RiepilogoTesseraPanel.add(RiepilogoCFTB);
		
		RiepilogoMeseNTB = new JTextField();
		RiepilogoMeseNTB.setEditable(false);
		RiepilogoMeseNTB.setColumns(10);
		RiepilogoMeseNTB.setBounds(454, 390, 107, 19);
		RiepilogoTesseraPanel.add(RiepilogoMeseNTB);
		
		RiepilogoAnnoNTB = new JTextField();
		RiepilogoAnnoNTB.setEditable(false);
		RiepilogoAnnoNTB.setColumns(10);
		RiepilogoAnnoNTB.setBounds(581, 390, 65, 19);
		RiepilogoTesseraPanel.add(RiepilogoAnnoNTB);
		
		JLabel SlashData1 = new JLabel("/");
		SlashData1.setBounds(444, 393, 28, 13);
		RiepilogoTesseraPanel.add(SlashData1);
		
		JLabel SlashData2 = new JLabel("/");
		SlashData2.setBounds(571, 393, 28, 13);
		RiepilogoTesseraPanel.add(SlashData2);
	}



	public String getRiepilogoNomeTB() {
		return RiepilogoNomeTB.getText();
	}



	public String getRiepilogoCognomeTB() {
		return RiepilogoCognomeTB.getText();
	}



	public String getRiepilogoSessoTB() {
		return RiepilogoSessoTB.getText();
	}



	public String getRiepilogoLuogoNTB() {
		return RiepilogoLuogoNTB.getText();
	}



	public String getRiepilogoGiornoNTB() {
		return RiepilogoGiornoNTB.getText();
	}



	public String getRiepilogoCFTB() {
		return RiepilogoCFTB.getText();
	}



	public String getRiepilogoMeseNTB() {
		return RiepilogoMeseNTB.getText();
	}



	public String getRiepilogoAnnoNTB() {
		return RiepilogoAnnoNTB.getText();
	}



	public void setRiepilogoNomeTB(String riepilogoNomeTB) {
		RiepilogoNomeTB.setText(riepilogoNomeTB);
	}



	public void setRiepilogoCognomeTB(String riepilogoCognomeTB) {
		RiepilogoCognomeTB.setText(riepilogoCognomeTB);
	}



	public void setRiepilogoSessoTB(String riepilogoSessoTB) {
		RiepilogoSessoTB.setText(riepilogoSessoTB);
	}



	public void setRiepilogoLuogoNTB(String riepilogoLuogoNTB) {
		RiepilogoLuogoNTB.setText(riepilogoLuogoNTB);
	}



	public void setRiepilogoGiornoNTB(String riepilogoGiornoNTB) {
		RiepilogoGiornoNTB.setText(riepilogoGiornoNTB);
	}



	public void setRiepilogoCFTB(String riepilogoCFTB) {
		RiepilogoCFTB.setText(riepilogoCFTB);
	}



	public void setRiepilogoMeseNTB(String riepilogoMeseNTB) {
		RiepilogoMeseNTB.setText(riepilogoMeseNTB);
	}



	public void setRiepilogoAnnoNTB(String riepilogoAnnoNTB) {
		RiepilogoAnnoNTB.setText(riepilogoAnnoNTB);
	}




	
	
}
