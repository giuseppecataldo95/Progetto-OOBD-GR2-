package GUI.Cliente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCliente;

public class VisualizzaDettagliClienteJFrame extends JFrame {

	private JPanel VisualizzaDettagliClientePanel;
	private ControllerCliente controller;
	public JTextField RiepilogoNomeTB;
	private JTextField RiepilogoCognomeTB;
	private JTextField RiepilogoSessoTB;
	private JTextField RiepilogoLuogoNTB;
	private JTextField RiepilogoGiornoNTB;
	

	private JTextField RiepilogoCFTB;
	private JTextField RiepilogoMeseNTB;
	private JTextField RiepilogoAnnoNTB;
	
	public VisualizzaDettagliClienteJFrame(ControllerCliente c) {
		controller = c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		VisualizzaDettagliClientePanel = new JPanel();
		VisualizzaDettagliClientePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		VisualizzaDettagliClientePanel.setLayout(new BorderLayout(0, 0));
		setContentPane(VisualizzaDettagliClientePanel);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 0, 65, 574);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		VisualizzaDettagliClientePanel.add(MenùLateraleTB);
		
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
		
		
		Component verticalStrut = Box.createVerticalStrut(200);
		verticalStrut.setBackground(Color.LIGHT_GRAY);

		MenùLateraleTB.add(verticalStrut);
		
		
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
		VisualizzaDettagliClientePanel.add(PercorsoTB);

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
				
				setVisible(false);
				controller.RiepilogoTesseraNuovaTesseraPercorsoButtonPressed();
				
			}
		});
		CreaNuovaTesseraPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(CreaNuovaTesseraPercorsoButton);
		
		JButton RiepilogoNuovaTesseraPercorsoButton = new JButton("> Riepilogo Nuova Tessera");
		RiepilogoNuovaTesseraPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(RiepilogoNuovaTesseraPercorsoButton);
		
		JLabel Riepilogo1LB = new JLabel("Questi sono i dettagli del Cliente!");
		Riepilogo1LB.setHorizontalAlignment(SwingConstants.CENTER);
		Riepilogo1LB.setFont(new Font("Arial", Font.BOLD, 14));
		Riepilogo1LB.setBounds(279, 54, 416, 48);
		VisualizzaDettagliClientePanel.add(Riepilogo1LB);
		
		
		
		JLabel NomeInseritoLB = new JLabel("Nome :  ");
		NomeInseritoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		NomeInseritoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		NomeInseritoLB.setBounds(173, 181, 176, 13);
		VisualizzaDettagliClientePanel.add(NomeInseritoLB);
		
		JLabel CognomeInseritoLB = new JLabel("Cognome :  ");
		CognomeInseritoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		CognomeInseritoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		CognomeInseritoLB.setBounds(173, 236, 176, 13);
		VisualizzaDettagliClientePanel.add(CognomeInseritoLB);
		
		JLabel SessoInseritoLB = new JLabel("Sesso :  ");
		SessoInseritoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		SessoInseritoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		SessoInseritoLB.setBounds(173, 291, 176, 13);
		VisualizzaDettagliClientePanel.add(SessoInseritoLB);
		
		JLabel LuogoNInseritoLB = new JLabel("Luogo di nascita :   ");
		LuogoNInseritoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		LuogoNInseritoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		LuogoNInseritoLB.setBounds(173, 347, 176, 13);
		VisualizzaDettagliClientePanel.add(LuogoNInseritoLB);
		
		JLabel DataInseritaLB = new JLabel("Data di nascita :   ");
		DataInseritaLB.setHorizontalAlignment(SwingConstants.RIGHT);
		DataInseritaLB.setFont(new Font("Arial", Font.PLAIN, 12));
		DataInseritaLB.setBounds(173, 393, 176, 13);
		VisualizzaDettagliClientePanel.add(DataInseritaLB);

		
		JLabel CodFiscaleLB = new JLabel("Codice Fiscale : ");
		CodFiscaleLB.setHorizontalAlignment(SwingConstants.RIGHT);
		CodFiscaleLB.setFont(new Font("Arial", Font.PLAIN, 12));
		CodFiscaleLB.setBounds(173, 442, 176, 13);

		VisualizzaDettagliClientePanel.add(CodFiscaleLB);
		
		
		
		
		JButton VisualizzaDettagliClienteAvantiButton = new JButton("Avanti");
		VisualizzaDettagliClienteAvantiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
						
				
					
				
			}
		});
		VisualizzaDettagliClienteAvantiButton.setBounds(808, 491, 103, 31);
		VisualizzaDettagliClientePanel.add(VisualizzaDettagliClienteAvantiButton);
		
		RiepilogoNomeTB = new JTextField();
		RiepilogoNomeTB.setEditable(false);
		RiepilogoNomeTB.setBounds(399, 178, 215, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoNomeTB);
		RiepilogoNomeTB.setColumns(10);
		
		RiepilogoCognomeTB = new JTextField();
		RiepilogoCognomeTB.setEditable(false);
		RiepilogoCognomeTB.setColumns(10);
		RiepilogoCognomeTB.setBounds(399, 233, 215, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoCognomeTB);
		
		RiepilogoSessoTB = new JTextField();
		RiepilogoSessoTB.setEditable(false);
		RiepilogoSessoTB.setColumns(10);
		RiepilogoSessoTB.setBounds(399, 288, 215, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoSessoTB);
		
		RiepilogoLuogoNTB = new JTextField();
		RiepilogoLuogoNTB.setEditable(false);
		RiepilogoLuogoNTB.setColumns(10);
		RiepilogoLuogoNTB.setBounds(399, 344, 215, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoLuogoNTB);
		
		RiepilogoGiornoNTB = new JTextField();
		RiepilogoGiornoNTB.setEditable(false);
		RiepilogoGiornoNTB.setColumns(10);
		RiepilogoGiornoNTB.setBounds(399, 390, 35, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoGiornoNTB);
		
		RiepilogoCFTB = new JTextField();
		RiepilogoCFTB.setEditable(false);
		RiepilogoCFTB.setColumns(10);
		RiepilogoCFTB.setBounds(399, 439, 215, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoCFTB);
		
		RiepilogoMeseNTB = new JTextField();
		RiepilogoMeseNTB.setEditable(false);
		RiepilogoMeseNTB.setColumns(10);
		RiepilogoMeseNTB.setBounds(454, 390, 107, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoMeseNTB);
		
		RiepilogoAnnoNTB = new JTextField();
		RiepilogoAnnoNTB.setEditable(false);
		RiepilogoAnnoNTB.setColumns(10);
		RiepilogoAnnoNTB.setBounds(581, 390, 65, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoAnnoNTB);
		
		JLabel SlashData1 = new JLabel("/");
		SlashData1.setBounds(444, 393, 28, 13);
		VisualizzaDettagliClientePanel.add(SlashData1);
		
		JLabel SlashData2 = new JLabel("/");
		SlashData2.setBounds(571, 393, 28, 13);
		VisualizzaDettagliClientePanel.add(SlashData2);
	}

	public JTextField getRiepilogoNomeTB() {
		return RiepilogoNomeTB;
	}

	public void setRiepilogoNomeTB(JTextField riepilogoNomeTB) {
		RiepilogoNomeTB = riepilogoNomeTB;
	}

	public JTextField getRiepilogoCognomeTB() {
		return RiepilogoCognomeTB;
	}

	public void setRiepilogoCognomeTB(JTextField riepilogoCognomeTB) {
		RiepilogoCognomeTB = riepilogoCognomeTB;
	}

	public JTextField getRiepilogoSessoTB() {
		return RiepilogoSessoTB;
	}

	public void setRiepilogoSessoTB(JTextField riepilogoSessoTB) {
		RiepilogoSessoTB = riepilogoSessoTB;
	}

	public JTextField getRiepilogoLuogoNTB() {
		return RiepilogoLuogoNTB;
	}

	public void setRiepilogoLuogoNTB(JTextField riepilogoLuogoNTB) {
		RiepilogoLuogoNTB = riepilogoLuogoNTB;
	}

	public JTextField getRiepilogoCFTB() {
		return RiepilogoCFTB;
	}

	public void setRiepilogoCFTB(JTextField riepilogoCFTB) {
		RiepilogoCFTB = riepilogoCFTB;
	}

	public JTextField getRiepilogoMeseNTB() {
		return RiepilogoMeseNTB;
	}

	public void setRiepilogoMeseNTB(JTextField riepilogoMeseNTB) {
		RiepilogoMeseNTB = riepilogoMeseNTB;
	}

	public JTextField getRiepilogoAnnoNTB() {
		return RiepilogoAnnoNTB;
	}

	public void setRiepilogoAnnoNTB(JTextField riepilogoAnnoNTB) {
		RiepilogoAnnoNTB = riepilogoAnnoNTB;
	}


}


