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

public class riepilogoTesseraJFrame extends JFrame {

	private JPanel contentPane;
	
	 JTextField riepilogoNomeTB;
	 JTextField riepilogoCognomeTB;
	 JTextField riepilogoSessoTB;
	 JTextField riepilogoLuogoNTB;
	 JTextField riepilogoGiornoNTB;
	 JTextField riepilogoCFTB;
	 JTextField riepilogoMeseNTB;
	 public JTextField riepilogoAnnoNTB;
	
	
	

	public riepilogoTesseraJFrame() {
	
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
		toolBar.setBounds(0, 0, 65, 574);
		toolBar.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(toolBar);
		
		JButton clienteButton = new JButton("Clienti");
		clienteButton.setFont(new Font("Arial", Font.PLAIN, 12));
		clienteButton.setForeground(Color.BLACK);
		toolBar.add(clienteButton);
		clienteButton.setIcon(null);
		clienteButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton venditeButton = new JButton("Vendite");
		venditeButton.setFont(new Font("Arial", Font.PLAIN, 12));
		venditeButton.setForeground(Color.BLACK);
		toolBar.add(venditeButton);
		venditeButton.setIcon(null);
		venditeButton.setMaximumSize(new Dimension(65, 70));
		
		JButton dipendentiButton = new JButton("Dipendenti");
		dipendentiButton.setFont(new Font("Arial", Font.PLAIN, 12));
		dipendentiButton.setForeground(Color.BLACK);
		toolBar.add(dipendentiButton);
		dipendentiButton.setIcon(null);
		dipendentiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton magazzinoButton = new JButton("Magazzino");
		magazzinoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		magazzinoButton.setForeground(Color.BLACK);
		toolBar.add(magazzinoButton);
		magazzinoButton.setIcon(null);
		magazzinoButton.setMaximumSize(new Dimension(65, 70));
		
		
		Component verticalStrut = Box.createVerticalStrut(200);
		verticalStrut.setBackground(Color.LIGHT_GRAY);
		toolBar.add(verticalStrut);
		
		
		JButton infoButton = new JButton("Info");
		infoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		infoButton.setForeground(Color.BLACK);
		toolBar.add(infoButton);
		infoButton.setIcon(null);
		infoButton.setMaximumSize(new Dimension(65, 70));
		

		JToolBar percorsoTB = new JToolBar();
		percorsoTB.setBorder(null);
		percorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		percorsoTB.setBorderPainted(false);
		percorsoTB.setFloatable(false);
		percorsoTB.setBackground(Color.WHITE);
		percorsoTB.setMaximumSize(new Dimension(100, 100));
		percorsoTB.setBounds(75, 5, 906, 19);
		contentPane.add(percorsoTB);

		JButton clientiPercorsoButton = new JButton("> Clienti");
		
			
		clientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		percorsoTB.add(clientiPercorsoButton);
		
		JButton creaNuovaTesseraPercorsoButton = new JButton("> Nuova Tessera");
		creaNuovaTesseraPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		percorsoTB.add(creaNuovaTesseraPercorsoButton);
		
		JButton riepilogoNuovaTesseraPercorsoButton = new JButton("> Riepilogo Nuova Tessera");
		riepilogoNuovaTesseraPercorsoButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
	
		creaNuovaTesseraPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		percorsoTB.add(riepilogoNuovaTesseraPercorsoButton);
		
		JLabel riepilogo1LB = new JLabel("Questo \u00E8 il riepilogo delle informazione del Cliente!");
		riepilogo1LB.setHorizontalAlignment(SwingConstants.CENTER);
		riepilogo1LB.setFont(new Font("Arial", Font.BOLD, 14));
		riepilogo1LB.setBounds(279, 54, 416, 48);
		contentPane.add(riepilogo1LB);
		
		JLabel riepilogo2LB = new JLabel("Controlla attentamente i dati inseriti!");
		riepilogo2LB.setFont(new Font("Tahoma", Font.PLAIN, 12));
		riepilogo2LB.setBounds(372, 112, 268, 13);
		contentPane.add(riepilogo2LB);
		
		JLabel nomeInseritoLB = new JLabel("Nome Inserito:  ");
		nomeInseritoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		nomeInseritoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		nomeInseritoLB.setBounds(173, 181, 176, 13);
		contentPane.add(nomeInseritoLB);
		
		JLabel cognomeInseritoLB = new JLabel("Cognome Inserito:  ");
		cognomeInseritoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		cognomeInseritoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		cognomeInseritoLB.setBounds(173, 236, 176, 13);
		contentPane.add(cognomeInseritoLB);
		
		JLabel sessoInseritoLB = new JLabel("Sesso Inserito:  ");
		sessoInseritoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		sessoInseritoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		sessoInseritoLB.setBounds(173, 291, 176, 13);
		contentPane.add(sessoInseritoLB);
		
		JLabel luogoNInseritoLB = new JLabel("Luogo di nascita Inserito:   ");
		luogoNInseritoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		luogoNInseritoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		luogoNInseritoLB.setBounds(173, 347, 176, 13);
		contentPane.add(luogoNInseritoLB);
		
		JLabel DataInseritoLB_1 = new JLabel("Data di nascita Inserita:   ");
		DataInseritoLB_1.setHorizontalAlignment(SwingConstants.RIGHT);
		DataInseritoLB_1.setFont(new Font("Arial", Font.PLAIN, 12));
		DataInseritoLB_1.setBounds(173, 393, 176, 13);
		contentPane.add(DataInseritoLB_1);
		
		JLabel CodFiscaleLB = new JLabel("Codice Fiscale Calcolato: ");
		CodFiscaleLB.setHorizontalAlignment(SwingConstants.RIGHT);
		CodFiscaleLB.setFont(new Font("Arial", Font.PLAIN, 12));
		CodFiscaleLB.setBounds(173, 442, 176, 13);
		contentPane.add(CodFiscaleLB);
		
		JButton indietroButton = new JButton("Indietro");
		indietroButton.setBounds(603, 491, 103, 31);
		contentPane.add(indietroButton);
		
		JButton avantiButton = new JButton("Avanti");
		
		
		avantiButton.setBounds(808, 491, 103, 31);
		contentPane.add(avantiButton);
		
		riepilogoNomeTB = new JTextField();
		riepilogoNomeTB.setEditable(false);
		riepilogoNomeTB.setBounds(399, 178, 215, 19);
		contentPane.add(riepilogoNomeTB);
		riepilogoNomeTB.setColumns(10);
		
		riepilogoCognomeTB = new JTextField();
		riepilogoCognomeTB.setEditable(false);
		riepilogoCognomeTB.setColumns(10);
		riepilogoCognomeTB.setBounds(399, 233, 215, 19);
		contentPane.add(riepilogoCognomeTB);
		
		riepilogoSessoTB = new JTextField();
		riepilogoSessoTB.setEditable(false);
		riepilogoSessoTB.setColumns(10);
		riepilogoSessoTB.setBounds(399, 288, 215, 19);
		contentPane.add(riepilogoSessoTB);
		
		riepilogoLuogoNTB = new JTextField();
		riepilogoLuogoNTB.setEditable(false);
		riepilogoLuogoNTB.setColumns(10);
		riepilogoLuogoNTB.setBounds(399, 344, 215, 19);
		contentPane.add(riepilogoLuogoNTB);
		
		riepilogoGiornoNTB = new JTextField();
		riepilogoGiornoNTB.setEditable(false);
		riepilogoGiornoNTB.setColumns(10);
		riepilogoGiornoNTB.setBounds(399, 390, 35, 19);
		contentPane.add(riepilogoGiornoNTB);
		
		riepilogoCFTB = new JTextField();
		riepilogoCFTB.setEditable(false);
		riepilogoCFTB.setColumns(10);
		riepilogoCFTB.setBounds(399, 439, 215, 19);
		contentPane.add(riepilogoCFTB);
		
		setRiepilogoMeseNTB(new JTextField());
		riepilogoMeseNTB.setEditable(false);
		riepilogoMeseNTB.setColumns(10);
		riepilogoMeseNTB.setBounds(454, 390, 107, 19);
		contentPane.add(riepilogoMeseNTB);
		
		riepilogoAnnoNTB = new JTextField();
		riepilogoAnnoNTB.setEditable(false);
		riepilogoAnnoNTB.setColumns(10);
		riepilogoAnnoNTB.setBounds(581, 390, 65, 19);
		contentPane.add(riepilogoAnnoNTB);
		
		JLabel lblNewLabel = new JLabel("/");
		lblNewLabel.setBounds(444, 393, 28, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setBounds(571, 393, 28, 13);
		contentPane.add(lblNewLabel_1);
	}




	public void setRiepilogoMeseNTB(JTextField riepilogoMeseNTB) {
		this.riepilogoMeseNTB = riepilogoMeseNTB;
	}
}
