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
import Controller.ControllerPrincipale;

import javax.swing.ImageIcon;

public class VisualizzaDettagliClienteJFrame extends JFrame {

	private JPanel VisualizzaDettagliClientePanel;
	public JTextField RiepilogoNomeTF;
	public JTextField RiepilogoCognomeTF;
	public JTextField RiepilogoSessoTF;
	public JTextField RiepilogoLuogoNTF;
	private JTextField RiepilogoGiornoNTF;
	public JTextField RiepilogoCFTF;
	private JTextField RiepilogoMeseNTF;
	private JTextField RiepilogoAnnoNTF;
	private JTextField RiepilogoDataNTF;
	private ControllerPrincipale ControllerP;
	private ControllerCliente ControllerC;

	
	

	public VisualizzaDettagliClienteJFrame(ControllerCliente c, ControllerPrincipale c1) {
		ControllerC = c;
		ControllerP = c1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setBounds(150, 80, 1000, 600);
		VisualizzaDettagliClientePanel = new JPanel();
		VisualizzaDettagliClientePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(VisualizzaDettagliClientePanel);
		VisualizzaDettagliClientePanel.setLayout(null);
		
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
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.VisualizzaDettagliClienteMenùLateraleClientiBottonePremuto();
			}
		});
		ClientiButton.setFont(new Font("Arial", Font.PLAIN, 12));
		ClientiButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setBorder(null);
		ClientiButton.setBorderPainted(false);
		ClientiButton.setIcon(new ImageIcon(VisualizzaDettagliClienteJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.VisualizzaDettagliClienteMenùLateraleVenditeBottonePremuto();
				
			}
		});
		VenditeButton.setFont(new Font("Arial", Font.PLAIN, 12));
		VenditeButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(VenditeButton);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setBorder(null);
		VenditeButton.setIcon(new ImageIcon(VisualizzaDettagliClienteJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.VisualizzaDettagliClienteMenùLateraleMagazzinoBottonePremuto();
			}
		});
		MagazzinoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(MagazzinoButton);
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setIcon(new ImageIcon(VisualizzaDettagliClienteJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		
		
		Component verticalStrut = Box.createVerticalStrut(280);
		verticalStrut.setBackground(Color.LIGHT_GRAY);

		MenùLateraleTB.add(verticalStrut);
		

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
				
				
				ControllerC.VisualizzaDettagliClienteClientiPercorsoBottonePremuto();
				
			}
		});
		ClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(ClientiPercorsoButton);
		
		JButton VisualizzaClientiPercorsoButton = new JButton("> Visualizza Clienti");
		VisualizzaClientiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerC.VisualizzaDettagliClienteVisualizzaClientiPercorsoBottonePremuto();
				
			}
		});
		VisualizzaClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VisualizzaClientiPercorsoButton);
		
		JButton RiepilogoTesseraPercorsoButton = new JButton("> Riepilogo Tessera");
		RiepilogoTesseraPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ControllerC.VisualizzaDettagliClienteVisualizzaDettagliClientePercorsoBottonePremuto();	
			}
		});
		RiepilogoTesseraPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(RiepilogoTesseraPercorsoButton);
		
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
		
		JButton VisualizzaDettagliClienteChiudiButton = new JButton("Chiudi");
		VisualizzaDettagliClienteChiudiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						
						ControllerC.VisualizzaDettagliClienteChiudiBottonePremuto();
						ControllerC.CompletaTabellaTessera();
					
				
			}
		});
		VisualizzaDettagliClienteChiudiButton.setBounds(808, 491, 103, 31);
		VisualizzaDettagliClientePanel.add(VisualizzaDettagliClienteChiudiButton);
		
		RiepilogoNomeTF = new JTextField();
		RiepilogoNomeTF.setEditable(false);
		RiepilogoNomeTF.setBounds(399, 178, 215, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoNomeTF);
		RiepilogoNomeTF.setColumns(10);
		
		RiepilogoCognomeTF = new JTextField();
		RiepilogoCognomeTF.setEditable(false);
		RiepilogoCognomeTF.setColumns(10);
		RiepilogoCognomeTF.setBounds(399, 233, 215, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoCognomeTF);
		
		RiepilogoSessoTF = new JTextField();
		RiepilogoSessoTF.setEditable(false);
		RiepilogoSessoTF.setColumns(10);
		RiepilogoSessoTF.setBounds(399, 288, 59, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoSessoTF);
		
		RiepilogoLuogoNTF = new JTextField();
		RiepilogoLuogoNTF.setEditable(false);
		RiepilogoLuogoNTF.setColumns(10);
		RiepilogoLuogoNTF.setBounds(399, 344, 215, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoLuogoNTF);
		
		RiepilogoDataNTF = new JTextField();
		RiepilogoDataNTF.setEditable(false);
		RiepilogoDataNTF.setColumns(10);
		RiepilogoDataNTF.setBounds(399, 390, 108, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoDataNTF);
		
		RiepilogoCFTF = new JTextField();
		RiepilogoCFTF.setEditable(false);
		RiepilogoCFTF.setColumns(10);
		RiepilogoCFTF.setBounds(399, 439, 215, 19);
		VisualizzaDettagliClientePanel.add(RiepilogoCFTF);
	
		
	}

	public JTextField getRiepilogoNomeTF() {
		return RiepilogoNomeTF;
	}

	public void setRiepilogoNomeTF(JTextField riepilogoNomeTB) {
		RiepilogoNomeTF = riepilogoNomeTB;
	}

	public JTextField getRiepilogoCognomeTF() {
		return RiepilogoCognomeTF;
	}

	public void setRiepilogoCognomeTF(JTextField riepilogoCognomeTB) {
		RiepilogoCognomeTF = riepilogoCognomeTB;
	}

	public JTextField getRiepilogoSessoTF() {
		return RiepilogoSessoTF;
	}

	public void setRiepilogoSessoTF(JTextField riepilogoSessoTB) {
		RiepilogoSessoTF = riepilogoSessoTB;
	}

	public JTextField getRiepilogoLuogoNTF() {
		return RiepilogoLuogoNTF;
	}

	public void setRiepilogoLuogoNTF(JTextField riepilogoLuogoNTB) {
		RiepilogoLuogoNTF = riepilogoLuogoNTB;
	}

	public JTextField getRiepilogoCFTF() {
		return RiepilogoCFTF;
	}

	public void setRiepilogoCFTF(JTextField riepilogoCFTB) {
		RiepilogoCFTF = riepilogoCFTB;
	}

	public JTextField getRiepilogoMeseNTF() {
		return RiepilogoMeseNTF;
	}

	public void setRiepilogoMeseNTF(JTextField riepilogoMeseNTB) {
		RiepilogoMeseNTF = riepilogoMeseNTB;
	}

	public JTextField getRiepilogoAnnoNTF() {
		return RiepilogoAnnoNTF;
	}

	public void setRiepilogoAnnoNTF(JTextField riepilogoAnnoNTB) {
		RiepilogoAnnoNTF = riepilogoAnnoNTB;
	}

	public JTextField getRiepilogoDataNTF() {
		return RiepilogoDataNTF;
	}

	public void setRiepilogoDataNTF(String riepilogoDataNTB) {
		RiepilogoDataNTF.setText(riepilogoDataNTB);
	}

}


