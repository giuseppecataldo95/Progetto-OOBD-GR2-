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


public class AggiungiVerduraJFrame extends JFrame {

	private JPanel AggiungiVerduraPanel;
	private JTextField InserisciNomeTF;
	private JTextField InserisciLottoTF;
	private JTextField InserisciProvenienzaTF;
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
	public AggiungiVerduraJFrame(ControllerMagazzino c, ControllerPrincipale cp) {
		ControllerM = c;
		ControllerP = cp;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		AggiungiVerduraPanel = new JPanel();
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		AggiungiVerduraPanel.setBackground(new Color(255, 228, 181));
		AggiungiVerduraPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		AggiungiVerduraPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(AggiungiVerduraPanel);
		AggiungiVerduraPanel.setLayout(null);
		
		JToolBar MenùLaterale = new JToolBar();
		MenùLaterale.setBackground(new Color(255, 153, 51));
		MenùLaterale.setBorder(null);
		MenùLaterale.setFloatable(false);
		MenùLaterale.setOrientation(SwingConstants.VERTICAL);
		MenùLaterale.setBounds(0, 0, 66, 563);
		AggiungiVerduraPanel.add(MenùLaterale);
		
		
		JButton ClientiButton = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiVerduraMenuLateraleClientiBottonePremuto();
			}
		});
		MenùLaterale.add(ClientiButton);
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		ClientiButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiVerduraMenuLateraleVenditeBottonePremuto();
			}
		});
		MenùLaterale.add(VenditeButton);
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton MagazzinoButton = new JButton("");
		MenùLaterale.add(MagazzinoButton);
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiVerduraMenuLateraleMagazzinoBottonePremuto();
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
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
		AggiungiVerduraPanel.add(PercorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Magazzino");
		MagazzinoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Verdura_MagazzinoPercorsoBottonePremuto();
			}
		});
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(MagazzinoPercorsoButton);
		
		JButton AggiungiNuovoProdottoPercorsoButton = new JButton("> Aggiungi Nuovo Prodotto");
		AggiungiNuovoProdottoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Verdura_AggiungiProdottoPercorsoBottonePremuto();
			}
		});
		AggiungiNuovoProdottoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(AggiungiNuovoProdottoPercorsoButton);
		
		JButton VerduraPercorsoButton = new JButton("> Verdura");
		VerduraPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Verdura_VerduraPercorsoBottonePremuto();
			}
		});
		VerduraPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VerduraPercorsoButton);
		
		JLabel AggiungiVerdura1LB = new JLabel("Benvenuto\\a nella sezione dedicata all'aggiunta di un nuovo prodotto di tipo Verdura!");
		AggiungiVerdura1LB.setFont(new Font("Arial", Font.BOLD, 14));
		AggiungiVerdura1LB.setHorizontalAlignment(SwingConstants.CENTER);
		AggiungiVerdura1LB.setBounds(181, 51, 641, 37);
		AggiungiVerduraPanel.add(AggiungiVerdura1LB);
		
		JLabel AggiungiVerdura2LB = new JLabel("Compila i seguenti campi con le relative informazioni");
		AggiungiVerdura2LB.setFont(new Font("Arial", Font.PLAIN, 13));
		AggiungiVerdura2LB.setBounds(334, 97, 318, 16);
		AggiungiVerduraPanel.add(AggiungiVerdura2LB);
		
		JLabel InserisciNomeLB = new JLabel("Nome : ");
		InserisciNomeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciNomeLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciNomeLB.setBounds(129, 171, 150, 20);
		AggiungiVerduraPanel.add(InserisciNomeLB);
		
		JLabel InserisciLottoLB = new JLabel("Lotto lavorazione : ");
		InserisciLottoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciLottoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciLottoLB.setBounds(129, 222, 150, 20);
		AggiungiVerduraPanel.add(InserisciLottoLB);
		
		JLabel InserisciValoreLB = new JLabel("Valore al kg : ");
		InserisciValoreLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciValoreLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciValoreLB.setBounds(129, 267, 150, 20);
		AggiungiVerduraPanel.add(InserisciValoreLB);
		
		JLabel InserisciDataRaccoltaLB = new JLabel("Data Raccolta : ");
		InserisciDataRaccoltaLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciDataRaccoltaLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciDataRaccoltaLB.setBounds(129, 317, 150, 20);
		AggiungiVerduraPanel.add(InserisciDataRaccoltaLB);
		
		JLabel InserisciProvenienzaLB = new JLabel("Provenienza :");
		InserisciProvenienzaLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciProvenienzaLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciProvenienzaLB.setBounds(181, 362, 96, 20);
		AggiungiVerduraPanel.add(InserisciProvenienzaLB);
		
		InserisciNomeTF = new JTextField();
		InserisciNomeTF.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciNomeTF.setBounds(316, 172, 190, 19);
		AggiungiVerduraPanel.add(InserisciNomeTF);
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
		AggiungiVerduraPanel.add(InserisciLottoTF);
		InserisciLottoTF.setColumns(10);
		
		InserisciGiornoCB = new JComboBox();
		InserisciGiornoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciGiornoCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		InserisciGiornoCB.setBounds(316, 317, 45, 21);
		AggiungiVerduraPanel.add(InserisciGiornoCB);
		
		InserisciMeseCB = new JComboBox();
		InserisciMeseCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciMeseCB.setModel(new DefaultComboBoxModel(new String[] {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"}));
		InserisciMeseCB.setBounds(368, 317, 103, 21);
		AggiungiVerduraPanel.add(InserisciMeseCB);
		
		
		
		InserisciAnnoCB = new JComboBox();
		InserisciAnnoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciAnnoCB.setModel(new DefaultComboBoxModel(new String[] {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"}));
		InserisciAnnoCB.setBounds(481, 317, 66, 21);
		AggiungiVerduraPanel.add(InserisciAnnoCB);
		
		InserisciProvenienzaTF = new JTextField();
		InserisciProvenienzaTF.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciProvenienzaTF.setBounds(316, 362, 190, 19);
		AggiungiVerduraPanel.add(InserisciProvenienzaTF);
		InserisciProvenienzaTF.setColumns(10);
		
		InserisciValorekgTF = new JTextField();
		InserisciValorekgTF.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciValorekgTF.setBounds(316, 267, 96, 20);
		AggiungiVerduraPanel.add(InserisciValorekgTF);
		InserisciValorekgTF.setColumns(10);
		
		JLabel EuroLB = new JLabel("\u20AC");
		EuroLB.setFont(new Font("Arial", Font.ITALIC, 14));
		EuroLB.setBounds(422, 269, 8, 14);
		AggiungiVerduraPanel.add(EuroLB);
		
		JLabel InserisciScorteLB = new JLabel("Scorte :");
		InserisciScorteLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciScorteLB.setBounds(234, 405, 45, 14);
		AggiungiVerduraPanel.add(InserisciScorteLB);
		
		InserisciScorteTF = new JTextField();
		InserisciScorteTF.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciScorteTF.setColumns(10);
		InserisciScorteTF.setBounds(316, 402, 96, 20);
		AggiungiVerduraPanel.add(InserisciScorteTF);
		
		JLabel KgLB = new JLabel("Kg");
		KgLB.setFont(new Font("Arial", Font.ITALIC, 14));
		KgLB.setBounds(422, 405, 27, 17);
		AggiungiVerduraPanel.add(KgLB);
		
		JButton AggiungiProdottoButton = new JButton("Aggiungi Prodotto");
		AggiungiProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerM.VerduraBottoneAvantiPremuto();
			}
		});
		AggiungiProdottoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		AggiungiProdottoButton.setBounds(799, 484, 137, 31);
		AggiungiVerduraPanel.add(AggiungiProdottoButton);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VerduraBottoneIndietroPremuto();
			}
		});
		IndietroButton.setFont(new Font("Arial", Font.PLAIN, 11));
		IndietroButton.setBounds(652, 484, 137, 31);
		AggiungiVerduraPanel.add(IndietroButton);
	}
	
	public String getInserisciNomeTF() {
		return InserisciNomeTF.getText();
	}

	public String getInserisciLottoTF() {
		return InserisciLottoTF.getText();
	}


	public String getInserisciProvenienzaTF() {
		return InserisciProvenienzaTF.getText();
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
