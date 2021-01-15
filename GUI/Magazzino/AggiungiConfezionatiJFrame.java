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

public class AggiungiConfezionatiJFrame extends JFrame {

	private JPanel AggiungiConfezionatiPanel;
	private JTextField InserisciNomeTB;
	private JTextField InserisciLottoTB;
	private JTextField InserisciValorekgTB;
	private JTextField InserisciScorteTB;
	private JTextField InserisciModConservazioneTB;
	private JTextField InserisciMarcaTB;
	private ControllerMagazzino ControllerM;
	private JComboBox InserisciGiornoCB;
	private JComboBox InserisciMeseCB;
	private JComboBox InserisciAnnoCB;
	private JTextField InserisciPesoConfezioneTB;
	private ControllerPrincipale ControllerP;
	

	/**
	 * Create the frame.
	 */
	public AggiungiConfezionatiJFrame(ControllerMagazzino c, ControllerPrincipale cp) {
		ControllerM = c;
		ControllerP = cp;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		AggiungiConfezionatiPanel = new JPanel();
		AggiungiConfezionatiPanel.setBackground(new Color(255, 228, 181));
		AggiungiConfezionatiPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		AggiungiConfezionatiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(AggiungiConfezionatiPanel);
		AggiungiConfezionatiPanel.setLayout(null);
	
		
		JToolBar percorsoTB = new JToolBar();
		percorsoTB.setBorder(null);
		percorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		percorsoTB.setBorderPainted(false);
		percorsoTB.setFloatable(false);
		percorsoTB.setBackground(new Color(255, 204, 153));
		percorsoTB.setMaximumSize(new Dimension(100, 100));
		percorsoTB.setBounds(65, 0, 976, 30);
		AggiungiConfezionatiPanel.add(percorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Magazzino");
		MagazzinoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Confezionati_MagazzinoPercorsoBottonePremuto();
			}
		});
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(MagazzinoPercorsoButton);
		
		JButton AggiungiNuovoProdottoPercorsoButton = new JButton("> Aggiungi Nuovo Prodotto");
		AggiungiNuovoProdottoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Confezionati_AggiungiProdottoPercorsoBottonePremuto();
			}
		});
		AggiungiNuovoProdottoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(AggiungiNuovoProdottoPercorsoButton);
		
		JButton ConfezionatiPercorsoButton = new JButton("> Confezionati");
		ConfezionatiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Confezionati_ConfezionatiPercorsoBottonePremuto();
			}
		});
		ConfezionatiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(ConfezionatiPercorsoButton);
		
		JLabel AggiungiConfezionati1LB = new JLabel("Benvenuto\\a nella sezione dedicata all'aggiunta di un nuovo prodotto di tipo Confezionato!");
		AggiungiConfezionati1LB.setFont(new Font("Arial", Font.BOLD, 14));
		AggiungiConfezionati1LB.setHorizontalAlignment(SwingConstants.CENTER);
		AggiungiConfezionati1LB.setBounds(169, 49, 693, 37);
		AggiungiConfezionatiPanel.add(AggiungiConfezionati1LB);
		
		JLabel AggiungiConfezionati2LB = new JLabel("Compila i seguenti campi con le relative informazioni");
		AggiungiConfezionati2LB.setFont(new Font("Arial", Font.PLAIN, 13));
		AggiungiConfezionati2LB.setBounds(334, 97, 318, 16);
		AggiungiConfezionatiPanel.add(AggiungiConfezionati2LB);
		
		JLabel InserisciNomeLB = new JLabel("Nome : ");
		InserisciNomeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciNomeLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciNomeLB.setBounds(129, 171, 150, 20);
		AggiungiConfezionatiPanel.add(InserisciNomeLB);
		
		JLabel InserisciLottoLB = new JLabel("Lotto lavorazione : ");
		InserisciLottoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciLottoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciLottoLB.setBounds(129, 202, 150, 20);
		AggiungiConfezionatiPanel.add(InserisciLottoLB);
		
		JLabel InserisciValoreLB = new JLabel("Valore per unit\u00E0 : ");
		InserisciValoreLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciValoreLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciValoreLB.setBounds(129, 233, 150, 20);
		AggiungiConfezionatiPanel.add(InserisciValoreLB);
		
		JLabel InserisciDataScadenzaLB = new JLabel("Data Scadenza : ");
		InserisciDataScadenzaLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciDataScadenzaLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciDataScadenzaLB.setBounds(129, 264, 150, 20);
		AggiungiConfezionatiPanel.add(InserisciDataScadenzaLB);
		
		InserisciNomeTB = new JTextField();
		InserisciNomeTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciNomeTB.setBounds(316, 172, 190, 19);
		AggiungiConfezionatiPanel.add(InserisciNomeTB);
		InserisciNomeTB.setColumns(10);
		
		InserisciLottoTB = new JTextField();
		InserisciLottoTB.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyTyped(java.awt.event.KeyEvent evt) {
		        if(InserisciLottoTB.getText().length()>=8&&!(evt.getKeyChar()==KeyEvent.VK_DELETE||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)) {
		            getToolkit().beep();
		            evt.consume();
		         }
		     }
		});
		InserisciLottoTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciLottoTB.setBounds(316, 203, 190, 19);
		AggiungiConfezionatiPanel.add(InserisciLottoTB);
		InserisciLottoTB.setColumns(10);
		
		InserisciGiornoCB = new JComboBox();
		InserisciGiornoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciGiornoCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		InserisciGiornoCB.setBounds(316, 264, 45, 21);
		AggiungiConfezionatiPanel.add(InserisciGiornoCB);
		
		InserisciMeseCB = new JComboBox();
		InserisciMeseCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciMeseCB.setModel(new DefaultComboBoxModel(new String[] {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"}));
		InserisciMeseCB.setBounds(371, 264, 103, 21);
		AggiungiConfezionatiPanel.add(InserisciMeseCB);
		
		
		
		InserisciAnnoCB = new JComboBox();
		InserisciAnnoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciAnnoCB.setModel(new DefaultComboBoxModel(new String[] {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"}));
		InserisciAnnoCB.setBounds(484, 264, 66, 21);
		AggiungiConfezionatiPanel.add(InserisciAnnoCB);
		
		InserisciValorekgTB = new JTextField();
		InserisciValorekgTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciValorekgTB.setBounds(316, 234, 96, 20);
		AggiungiConfezionatiPanel.add(InserisciValorekgTB);
		InserisciValorekgTB.setColumns(10);
		
		JLabel EuroLB = new JLabel("\u20AC");
		EuroLB.setFont(new Font("Arial", Font.ITALIC, 14));
		EuroLB.setBounds(422, 233, 8, 20);
		AggiungiConfezionatiPanel.add(EuroLB);
		
		JLabel InserisciScorteLB = new JLabel("Scorte :");
		InserisciScorteLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciScorteLB.setBounds(234, 298, 45, 14);
		AggiungiConfezionatiPanel.add(InserisciScorteLB);
		
		InserisciScorteTB = new JTextField();
		InserisciScorteTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciScorteTB.setColumns(10);
		InserisciScorteTB.setBounds(316, 296, 96, 20);
		AggiungiConfezionatiPanel.add(InserisciScorteTB);
		
		JButton AggiungiProdottoButton = new JButton("Aggiungi Prodotto");
		AggiungiProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.ConfezionatiBottoneAvantiPremuto();
			}
		});
		AggiungiProdottoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		AggiungiProdottoButton.setBounds(799, 484, 137, 31);
		AggiungiConfezionatiPanel.add(AggiungiProdottoButton);
		
		JLabel InserisciModConservazioneLB = new JLabel("Modalit\u00E0 conservazione : ");
		InserisciModConservazioneLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciModConservazioneLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciModConservazioneLB.setBounds(129, 326, 150, 20);
		AggiungiConfezionatiPanel.add(InserisciModConservazioneLB);
		
		InserisciModConservazioneTB = new JTextField();
		InserisciModConservazioneTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciModConservazioneTB.setColumns(10);
		InserisciModConservazioneTB.setBounds(316, 327, 190, 19);
		AggiungiConfezionatiPanel.add(InserisciModConservazioneTB);
		
		JLabel InserisciMarcaLB = new JLabel("Marca :");
		InserisciMarcaLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciMarcaLB.setBounds(234, 359, 45, 14);
		AggiungiConfezionatiPanel.add(InserisciMarcaLB);
		
		InserisciMarcaTB = new JTextField();
		InserisciMarcaTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciMarcaTB.setColumns(10);
		InserisciMarcaTB.setBounds(316, 357, 190, 19);
		AggiungiConfezionatiPanel.add(InserisciMarcaTB);
		
		JLabel lnserisciPesoConfezioneLB = new JLabel("Peso Confezione :");
		lnserisciPesoConfezioneLB.setFont(new Font("Arial", Font.PLAIN, 12));
		lnserisciPesoConfezioneLB.setBounds(176, 391, 103, 14);
		AggiungiConfezionatiPanel.add(lnserisciPesoConfezioneLB);
		
		InserisciPesoConfezioneTB = new JTextField();
		InserisciPesoConfezioneTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciPesoConfezioneTB.setColumns(10);
		InserisciPesoConfezioneTB.setBounds(316, 388, 96, 20);
		AggiungiConfezionatiPanel.add(InserisciPesoConfezioneTB);
		
		JLabel KgLB = new JLabel("Kg");
		KgLB.setFont(new Font("Arial", Font.ITALIC, 14));
		KgLB.setBounds(422, 296, 27, 20);
		AggiungiConfezionatiPanel.add(KgLB);
		
		JLabel KgLB_1 = new JLabel("Kg");
		KgLB_1.setFont(new Font("Arial", Font.ITALIC, 14));
		KgLB_1.setBounds(422, 387, 27, 20);
		AggiungiConfezionatiPanel.add(KgLB_1);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.ConfezionatiBottoneIndietroPremuto();
			}
		});
		IndietroButton.setFont(new Font("Arial", Font.PLAIN, 11));
		IndietroButton.setBounds(652, 484, 137, 31);
		AggiungiConfezionatiPanel.add(IndietroButton);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(new Color(255, 153, 51));
		toolBar.setBorder(null);
		toolBar.setFloatable(false);
		toolBar.setOrientation(SwingConstants.VERTICAL);
		toolBar.setBounds(0, 0, 66, 563);
		AggiungiConfezionatiPanel.add(toolBar);
		
		
		JButton ClientiButton = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiConfezionatiMenuLateraleClientiBottonePremuto();
			}
		});
		toolBar.add(ClientiButton);
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		ClientiButton.setIcon(new ImageIcon(AggiungiConfezionatiJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		toolBar.add(VenditeButton);
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(AggiungiConfezionatiJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton MagazzinoButton = new JButton("");
		toolBar.add(MagazzinoButton);
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiConfezionatiMenuLateraleMagazzinoBottonePremuto();
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(AggiungiConfezionatiJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		
		Component verticalStrut = Box.createVerticalStrut(280);
		toolBar.add(verticalStrut);
		verticalStrut.setMaximumSize(new Dimension(32767, 300));
		
		JButton InfoButton = new JButton("");
		toolBar.add(InfoButton);
		InfoButton.setBackground(new Color(255, 153, 51));
		InfoButton.setIcon(new ImageIcon(AggiungiConfezionatiJFrame.class.getResource("/Risorse/info-menu.png")));
		InfoButton.setBorder(null);
		InfoButton.setBorderPainted(false);
		InfoButton.setMaximumSize(new Dimension(65, 70));
	}



	public String getInserisciNomeTB() {
		return InserisciNomeTB.getText();
	}



	public String getInserisciLottoTB() {
		return InserisciLottoTB.getText();
	}



	public String getInserisciValorekgTB() {
		return InserisciValorekgTB.getText();
	}



	public String getInserisciScorteTB() {
		return InserisciScorteTB.getText();
	}



	public String getInserisciModConservazioneTB() {
		return InserisciModConservazioneTB.getText();
	}



	public String getInserisciMarcaTB() {
		return InserisciMarcaTB.getText();
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
	
	public String getInserisciPesoConfezioneTB() {
		return InserisciPesoConfezioneTB.getText();
	}
}
