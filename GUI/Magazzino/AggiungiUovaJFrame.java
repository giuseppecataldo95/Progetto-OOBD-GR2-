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

public class AggiungiUovaJFrame extends JFrame {

	private JPanel AggiungiUovaPanel;
	private JTextField InserisciNPerConfezioneTF;
	private JTextField InserisciLottoTF;
	private JTextField InserisciProvenienzaTF;
	private JTextField InserisciValoreTF;
	private JTextField InserisciScorteTF;
	private JComboBox InserisciGiornoScadenzaCB;
	private JComboBox InserisciMeseScadenzaCB;
	private JComboBox InserisciAnnoScadenzaCB;
	private ControllerMagazzino ControllerM;
	private ControllerPrincipale ControllerP;

	/**
	 * Create the frame.
	 */
	public AggiungiUovaJFrame(ControllerMagazzino c, ControllerPrincipale cp) {
		ControllerM = c;
		ControllerP = cp;
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		AggiungiUovaPanel = new JPanel();
		AggiungiUovaPanel.setBackground(new Color(255, 228, 181));
		AggiungiUovaPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		AggiungiUovaPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(AggiungiUovaPanel);
		AggiungiUovaPanel.setLayout(null);
		
		JToolBar MenùLaterale = new JToolBar();
		MenùLaterale.setBackground(new Color(255, 153, 51));
		MenùLaterale.setBorder(null);
		MenùLaterale.setFloatable(false);
		MenùLaterale.setOrientation(SwingConstants.VERTICAL);
		MenùLaterale.setBounds(0, 0, 66, 563);
		AggiungiUovaPanel.add(MenùLaterale);
		
		
		JButton ClientiButton = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiUovaMenuLateraleClientiBottonePremuto();
			}
		});
		MenùLaterale.add(ClientiButton);
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		ClientiButton.setToolTipText("Clienti");
		ClientiButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiUovaMenuLateraleVenditeBottonePremuto();
			}
		});
		MenùLaterale.add(VenditeButton);
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setToolTipText("Vendite");
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton MagazzinoButton = new JButton("");
		MenùLaterale.add(MagazzinoButton);
		MagazzinoButton.setToolTipText("Magazzino");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.AggiungiUovaMenuLateraleMagazzinoBottonePremuto();
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
		AggiungiUovaPanel.add(PercorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Magazzino");
		MagazzinoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Uova_MagazzinoPercorsoBottonePremuto();
			}
		});
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(MagazzinoPercorsoButton);
		
		JButton AggiungiNuovoProdottoPercorsoButton = new JButton("> Aggiungi Nuovo Prodotto");
		AggiungiNuovoProdottoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Uova_AggiungiProdottoPercorsoBottonePremuto();
			}
		});
		AggiungiNuovoProdottoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(AggiungiNuovoProdottoPercorsoButton);
		
		JButton UovaPercorsoButton = new JButton("> Uova");
		UovaPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.Uova_UovaPercorsoBottonePremuto();
			}
		});
		UovaPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(UovaPercorsoButton);
		
		JLabel AggiungiUova1LB = new JLabel("Benvenuto\\a nella sezione dedicata all'aggiunta di un nuovo prodotto di tipo Uova!");
		AggiungiUova1LB.setFont(new Font("Arial", Font.BOLD, 14));
		AggiungiUova1LB.setHorizontalAlignment(SwingConstants.CENTER);
		AggiungiUova1LB.setBounds(181, 51, 641, 37);
		AggiungiUovaPanel.add(AggiungiUova1LB);
		
		JLabel AggiungiUova2LB = new JLabel("Compila i seguenti campi con le relative informazioni");
		AggiungiUova2LB.setFont(new Font("Arial", Font.PLAIN, 13));
		AggiungiUova2LB.setBounds(334, 97, 318, 16);
		AggiungiUovaPanel.add(AggiungiUova2LB);
		
		JLabel InserisciNperConfezioneLB = new JLabel("Numero per confezione : ");
		InserisciNperConfezioneLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciNperConfezioneLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciNperConfezioneLB.setBounds(129, 171, 150, 20);
		AggiungiUovaPanel.add(InserisciNperConfezioneLB);
		
		JLabel InserisciLottoLavorazioneLB = new JLabel("Lotto Lavorazione : ");
		InserisciLottoLavorazioneLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciLottoLavorazioneLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciLottoLavorazioneLB.setBounds(129, 222, 150, 20);
		AggiungiUovaPanel.add(InserisciLottoLavorazioneLB);
		
		JLabel InserisciValoreLB = new JLabel("Valore per unit\u00E0 : ");
		InserisciValoreLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciValoreLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciValoreLB.setBounds(129, 267, 150, 20);
		AggiungiUovaPanel.add(InserisciValoreLB);
		
		JLabel InserisciProvenienzaLB = new JLabel("Provenienza :");
		InserisciProvenienzaLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciProvenienzaLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciProvenienzaLB.setBounds(139, 349, 140, 20);
		AggiungiUovaPanel.add(InserisciProvenienzaLB);
		
		InserisciNPerConfezioneTF = new JTextField();
		InserisciNPerConfezioneTF.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciNPerConfezioneTF.setBounds(316, 172, 96, 19);
		AggiungiUovaPanel.add(InserisciNPerConfezioneTF);
		InserisciNPerConfezioneTF.setColumns(10);
		
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
		AggiungiUovaPanel.add(InserisciLottoTF);
		InserisciLottoTF.setColumns(10);
		
		InserisciProvenienzaTF = new JTextField();
		InserisciProvenienzaTF.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciProvenienzaTF.setBounds(316, 350, 190, 19);
		AggiungiUovaPanel.add(InserisciProvenienzaTF);
		InserisciProvenienzaTF.setColumns(10);
		
		InserisciValoreTF = new JTextField();
		InserisciValoreTF.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciValoreTF.setBounds(316, 267, 96, 20);
		AggiungiUovaPanel.add(InserisciValoreTF);
		InserisciValoreTF.setColumns(10);
		
		JLabel EuroLB = new JLabel("\u20AC");
		EuroLB.setFont(new Font("Arial", Font.ITALIC, 14));
		EuroLB.setBounds(422, 269, 8, 14);
		AggiungiUovaPanel.add(EuroLB);
		
		JLabel InserisciScorteLB = new JLabel("Scorte :");
		InserisciScorteLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciScorteLB.setBounds(234, 391, 45, 14);
		AggiungiUovaPanel.add(InserisciScorteLB);
		
		InserisciScorteTF = new JTextField();
		InserisciScorteTF.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciScorteTF.setColumns(10);
		InserisciScorteTF.setBounds(316, 389, 96, 20);
		AggiungiUovaPanel.add(InserisciScorteTF);
		
		JButton AggiungiProdottoButton = new JButton("Aggiungi Prodotto");
		AggiungiProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					ControllerM.UovaBottoneAvantiPremuto();
			}
		});
		AggiungiProdottoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		AggiungiProdottoButton.setBounds(799, 484, 137, 31);
		AggiungiUovaPanel.add(AggiungiProdottoButton);
		
		JLabel InserisciDataScadenzaLB = new JLabel("Data Scadenza : ");
		InserisciDataScadenzaLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciDataScadenzaLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciDataScadenzaLB.setBounds(129, 308, 150, 20);
		AggiungiUovaPanel.add(InserisciDataScadenzaLB);
		
		InserisciGiornoScadenzaCB = new JComboBox();
		InserisciGiornoScadenzaCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciGiornoScadenzaCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		InserisciGiornoScadenzaCB.setBounds(316, 308, 45, 21);
		AggiungiUovaPanel.add(InserisciGiornoScadenzaCB);
		
		InserisciMeseScadenzaCB = new JComboBox();
		InserisciMeseScadenzaCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciMeseScadenzaCB.setModel(new DefaultComboBoxModel(new String[] {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"}));
		InserisciMeseScadenzaCB.setBounds(371, 308, 103, 21);
		AggiungiUovaPanel.add(InserisciMeseScadenzaCB);
		
		InserisciAnnoScadenzaCB = new JComboBox();
		InserisciAnnoScadenzaCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciAnnoScadenzaCB.setModel(new DefaultComboBoxModel(new String[] {"2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		InserisciAnnoScadenzaCB.setBounds(484, 308, 66, 21);
		AggiungiUovaPanel.add(InserisciAnnoScadenzaCB);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.UovaBottoneIndietroPremuto();
			}
		});
		IndietroButton.setFont(new Font("Arial", Font.PLAIN, 11));
		IndietroButton.setBounds(652, 484, 137, 31);
		AggiungiUovaPanel.add(IndietroButton);
	}
	
	
	public String getInserisciNomeTF() {
		return InserisciNPerConfezioneTF.getText();
	}



	public String getInserisciValoreTF() {
		return InserisciValoreTF.getText();
	}


	public String getInserisciScorteTF() {
		return InserisciScorteTF.getText();
	}


	public String getInserisciGiornoScadenzaCB() {
		return InserisciGiornoScadenzaCB.getSelectedItem().toString();
	}


	public String getInserisciMeseScadenzaCB() {
		return InserisciMeseScadenzaCB.getSelectedItem().toString();
	}


	public String getInserisciAnnoScadenzaCB() {
		return InserisciAnnoScadenzaCB.getSelectedItem().toString();
	}
	
	public String getInserisciLottoTF() {
		return InserisciLottoTF.getText();
	}


	public String getInserisciProvenienzaTF() {
		return InserisciProvenienzaTF.getText();
	}
	
	public String getInserisciNPerConfezioneTF() {
		return InserisciNPerConfezioneTF.getText();
	}
}
