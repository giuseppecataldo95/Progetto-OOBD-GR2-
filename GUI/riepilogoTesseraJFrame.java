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
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;


import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RiepilogoTesseraJFrame extends JFrame {


  
   private JPanel RiepilogoTesseraPanel;
   JTextField RiepilogoNomeTB;
	 JTextField RiepilogoCognomeTB;
	 JTextField RiepilogoSessoTB;
	 JTextField RiepilogoLuogoNTB;
	 JTextField RiepilogoGiornoNTB;
	 JTextField RiepilogoCFTB;
	 JTextField RiepilogoMeseNTB;
	 public JTextField RiepilogoAnnoNTB;

	
	
	

	public RiepilogoTesseraJFrame() {
	
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(150, 80, 1000, 600);

		RiepilogoTesseraPanel = new JPanel();
		RiepilogoTesseraPanel.setBackground(new Color(255, 228, 181));
		RiepilogoTesseraPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		RiepilogoTesseraPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(RiepilogoTesseraPanel);
		RiepilogoTesseraPanel.setLayout(null);
		
		
		JToolBar Men�LateraleTB = new JToolBar();
		Men�LateraleTB.setBorder(null);
		Men�LateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		Men�LateraleTB.setBorderPainted(false);
		Men�LateraleTB.setFloatable(false);
		Men�LateraleTB.setBackground(new Color(255, 153, 51));
		Men�LateraleTB.setMaximumSize(new Dimension(100, 100));
		Men�LateraleTB.setBounds(0, 0, 65, 574);
		Men�LateraleTB.setOrientation(SwingConstants.VERTICAL);
		RiepilogoTesseraPanel.add(Men�LateraleTB);
		
		JButton ClientiButton = new JButton("");
		ClientiButton.setFont(new Font("Arial", Font.PLAIN, 12));
		ClientiButton.setBackground(new Color(255, 153, 51));
		Men�LateraleTB.add(ClientiButton);
		ClientiButton.setBorder(null);
		ClientiButton.setBorderPainted(false);
		ClientiButton.setIcon(null);
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setFont(new Font("Arial", Font.PLAIN, 12));
		VenditeButton.setBackground(new Color(255, 153, 51));
		Men�LateraleTB.add(VenditeButton);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setBorder(null);
		VenditeButton.setIcon(null);
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		JButton DipendentiButton = new JButton("");
		DipendentiButton.setFont(new Font("Arial", Font.PLAIN, 12));
		DipendentiButton.setBackground(new Color(255, 153, 51));
		Men�LateraleTB.add(DipendentiButton);
		DipendentiButton.setBorderPainted(false);
		DipendentiButton.setBorder(null);
		DipendentiButton.setIcon(null);
		DipendentiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		Men�LateraleTB.add(MagazzinoButton);
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setIcon(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		
		
		Component verticalStrut = Box.createVerticalStrut(200);
		verticalStrut.setBackground(Color.LIGHT_GRAY);

		Men�LateraleTB.add(verticalStrut);
		
		
		JButton InfoButton = new JButton("");
		InfoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		InfoButton.setBackground(new Color(255, 153, 51));
		Men�LateraleTB.add(InfoButton);
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
		RiepilogoTesseraPanel.add(PercorsoTB);

		JButton ClientiPercorsoButton = new JButton("> Clienti");
		ClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(ClientiPercorsoButton);
		
		JButton CreaNuovaTesseraPercorsoButton = new JButton("> Nuova Tessera");
		CreaNuovaTesseraPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(CreaNuovaTesseraPercorsoButton);
		
		JButton RiepilogoNuovaTesseraPercorsoButton = new JButton("> Riepilogo Nuova Tessera");
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
		IndietroButton.setBounds(603, 491, 103, 31);
		RiepilogoTesseraPanel.add(IndietroButton);
		
		JButton AvantiButton = new JButton("Avanti");
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
}
