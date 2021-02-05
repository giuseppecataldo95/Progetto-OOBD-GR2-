package GUI.Magazzino;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.ControllerMagazzino;
import Controller.ControllerPrincipale;

public class AggiungiFarinaceiJFrame extends JFrame {

	private JPanel AggiungiFarinaceiPanel;
	private JTextField InserisciNomeTF;
	private JTextField InserisciLottoTF;
	private JTextField InserisciValorekgTF;
	private JTextField InserisciScorteTF;
	private JComboBox InserisciGiornoCB;
	private JComboBox InserisciMeseCB;
	private JComboBox InserisciAnnoCB;
	private ControllerMagazzino ControllerM;
	private ControllerPrincipale ControllerP;



	/**
	 * Create the frame.
	 */
	public AggiungiFarinaceiJFrame(ControllerMagazzino c, ControllerPrincipale c1) {
		ControllerM = c;
		ControllerP = c1;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		AggiungiFarinaceiPanel = new JPanel();
		AggiungiFarinaceiPanel.setBackground(new Color(255, 228, 181));
		AggiungiFarinaceiPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		AggiungiFarinaceiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(AggiungiFarinaceiPanel);
		AggiungiFarinaceiPanel.setLayout(null);
		
		JToolBar MenùLaterale = new JToolBar();
		MenùLaterale.setBackground(new Color(255, 153, 51));
		MenùLaterale.setBorder(null);
		MenùLaterale.setFloatable(false);
		MenùLaterale.setOrientation(SwingConstants.VERTICAL);
		MenùLaterale.setBounds(0, 0, 66, 563);
		AggiungiFarinaceiPanel.add(MenùLaterale);
		
		
		JButton ClientiButton  = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiFarinaceiMenuLateraleClientiBottonePremuto();
			}
		});
		MenùLaterale.add(ClientiButton);
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setToolTipText("Clienti");
		ClientiButton.setBorder(null);
		ClientiButton.setIcon(new ImageIcon(AggiungiFarinaceiJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiFarinaceiMenuLateraleVenditeBottonePremuto();
			}
		});
		MenùLaterale.add(VenditeButton);
		VenditeButton.setToolTipText("Vendite");
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(AggiungiFarinaceiJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton MagazzinoButton = new JButton("");
		MenùLaterale.add(MagazzinoButton);
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiFarinaceiMenuLateraleMagazzinoBottonePremuto();
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(AggiungiFarinaceiJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setToolTipText("Magazzino");
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		
		Component VerticalStrut = Box.createVerticalStrut(280);
		MenùLaterale.add(VerticalStrut);
		VerticalStrut.setMaximumSize(new Dimension(32767, 300));
	
		
		JToolBar PercorsoTB = new JToolBar();
		PercorsoTB.setBorder(null);
		PercorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		PercorsoTB.setBorderPainted(false);
		PercorsoTB.setFloatable(false);
		PercorsoTB.setBackground(new Color(255, 204, 153));
		PercorsoTB.setMaximumSize(new Dimension(100, 100));
		PercorsoTB.setBounds(65, 0, 976, 30);
		AggiungiFarinaceiPanel.add(PercorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Magazzino");
		MagazzinoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Farinacei_MagazzinoPercorsoBottonePremuto();
			}
		});
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(MagazzinoPercorsoButton);
		
		JButton AggiungiNuovoProdottoPercorsoButton = new JButton("> Aggiungi Nuovo Prodotto");
		AggiungiNuovoProdottoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Farinacei_AggiungiProdottoPercorsoBottonePremuto();
			}
		});
		AggiungiNuovoProdottoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(AggiungiNuovoProdottoPercorsoButton);
		
		JButton FarinaceiPercorsoButton = new JButton("> Farinacei");
		FarinaceiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Farinacei_FarinaceiPercorsoBottonePremuto();
			}
		});
		FarinaceiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(FarinaceiPercorsoButton);
		
		JLabel AggiungiFarinacei1LB = new JLabel("Benvenuto\\a nella sezione dedicata all'aggiunta di un nuovo prodotto di tipo Farinaceo!");
		AggiungiFarinacei1LB.setFont(new Font("Arial", Font.BOLD, 14));
		AggiungiFarinacei1LB.setHorizontalAlignment(SwingConstants.CENTER);
		AggiungiFarinacei1LB.setBounds(181, 51, 641, 37);
		AggiungiFarinaceiPanel.add(AggiungiFarinacei1LB);
		
		JLabel AggiungiFarinacei2LB = new JLabel("Compila i seguenti campi con le relative informazioni");
		AggiungiFarinacei2LB.setFont(new Font("Arial", Font.PLAIN, 13));
		AggiungiFarinacei2LB.setBounds(334, 97, 318, 16);
		AggiungiFarinaceiPanel.add(AggiungiFarinacei2LB);
		
		JLabel InserisciNomeLB = new JLabel("Nome : ");
		InserisciNomeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciNomeLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciNomeLB.setBounds(129, 171, 150, 20);
		AggiungiFarinaceiPanel.add(InserisciNomeLB);
		
		JLabel InserisciLottoLB = new JLabel("Lotto lavorazione : ");
		InserisciLottoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciLottoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciLottoLB.setBounds(129, 222, 150, 20);
		AggiungiFarinaceiPanel.add(InserisciLottoLB);
		
		JLabel InserisciValoreLB = new JLabel("Valore al kg : ");
		InserisciValoreLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciValoreLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciValoreLB.setBounds(129, 267, 150, 20);
		AggiungiFarinaceiPanel.add(InserisciValoreLB);
		
		JLabel InserisciDataScadenzaLB = new JLabel("Data Scadenza : ");
		InserisciDataScadenzaLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciDataScadenzaLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciDataScadenzaLB.setBounds(129, 317, 150, 20);
		AggiungiFarinaceiPanel.add(InserisciDataScadenzaLB);
		
		InserisciNomeTF = new JTextField();
		InserisciNomeTF.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciNomeTF.setBounds(316, 172, 190, 19);
		AggiungiFarinaceiPanel.add(InserisciNomeTF);
		InserisciNomeTF.setColumns(10);
		
		InserisciLottoTF = new JTextField();
		InserisciLottoTF.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        if(InserisciLottoTF.getText().length()>=8&&!(evt.getKeyChar()==KeyEvent.VK_DELETE||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
		            getToolkit().beep();
		            evt.consume();
		         }
		     }
		});
		InserisciLottoTF.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciLottoTF.setBounds(316, 223, 190, 19);
		AggiungiFarinaceiPanel.add(InserisciLottoTF);
		InserisciLottoTF.setColumns(10);
		
		InserisciGiornoCB = new JComboBox();
		InserisciGiornoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciGiornoCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		InserisciGiornoCB.setBounds(316, 317, 45, 21);
		AggiungiFarinaceiPanel.add(InserisciGiornoCB);
		
		InserisciMeseCB = new JComboBox();
		InserisciMeseCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciMeseCB.setModel(new DefaultComboBoxModel(new String[] {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"}));
		InserisciMeseCB.setBounds(368, 317, 103, 21);
		AggiungiFarinaceiPanel.add(InserisciMeseCB);
		
		
		
		InserisciAnnoCB = new JComboBox();
		InserisciAnnoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciAnnoCB.setModel(new DefaultComboBoxModel(new String[] {"2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		InserisciAnnoCB.setBounds(481, 317, 66, 21);
		AggiungiFarinaceiPanel.add(InserisciAnnoCB);
		
		InserisciValorekgTF = new JTextField();
		InserisciValorekgTF.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciValorekgTF.setBounds(316, 267, 96, 20);
		AggiungiFarinaceiPanel.add(InserisciValorekgTF);
		InserisciValorekgTF.setColumns(10);
		
		JLabel EuroLB = new JLabel("\u20AC");
		EuroLB.setFont(new Font("Arial", Font.ITALIC, 14));
		EuroLB.setBounds(422, 269, 8, 14);
		AggiungiFarinaceiPanel.add(EuroLB);
		
		JLabel InserisciScorteLB = new JLabel("Scorte :");
		InserisciScorteLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciScorteLB.setBounds(234, 366, 45, 14);
		AggiungiFarinaceiPanel.add(InserisciScorteLB);
		
		InserisciScorteTF = new JTextField();
		InserisciScorteTF.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciScorteTF.setColumns(10);
		InserisciScorteTF.setBounds(316, 364, 96, 20);
		AggiungiFarinaceiPanel.add(InserisciScorteTF);
		
		JLabel KgLB = new JLabel("Kg");
		KgLB.setFont(new Font("Arial", Font.ITALIC, 14));
		KgLB.setBounds(422, 364, 27, 17);
		AggiungiFarinaceiPanel.add(KgLB);
		
		JButton AggiungiProdottoButton = new JButton("Aggiungi Prodotto");
		AggiungiProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					ControllerM.FarinaceiBottoneAvantiPremuto();
				
			}
		});
		AggiungiProdottoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		AggiungiProdottoButton.setBounds(799, 484, 137, 31);
		AggiungiFarinaceiPanel.add(AggiungiProdottoButton);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.FarinaceiBottoneIndietroPremuto();
			}
		});
		IndietroButton.setFont(new Font("Arial", Font.PLAIN, 11));
		IndietroButton.setBounds(652, 484, 137, 31);
		AggiungiFarinaceiPanel.add(IndietroButton);
	}

	public String getInserisciNomeTF() {
		return InserisciNomeTF.getText();
	}

	public String getInserisciLottoTF() {
		return InserisciLottoTF.getText();
	}

	public String getInserisciValorekgTF() {
		return InserisciValorekgTF.getText();
	}

	public String getInserisciScorteTF() {
		return InserisciScorteTF.getText();
	}
	
	public String getInserisciGiornoCB() {
		return InserisciGiornoCB.getSelectedItem().toString();
	}



	public String getInserisciMeseCB() {
		return InserisciMeseCB.getSelectedItem().toString();
	}



	public String getInserisciAnnoCB() {
		return InserisciAnnoCB.getSelectedItem().toString();
	}



}
