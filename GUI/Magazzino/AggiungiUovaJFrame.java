package GUI.Magazzino;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

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
import GUI.Cliente.ClientiJFrame;

public class AggiungiUovaJFrame extends JFrame {

	private JPanel AggiungiUovaPanel;
	private JTextField InserisciNPerConfezioneTB;
	private JTextField InserisciLottoTB;
	private JTextField InserisciProvenienzaTB;
	private JTextField InserisciValoreTB;
	private JTextField InserisciScorteTB;
	private JComboBox InserisciGiornoScadenzaCB;
	private JComboBox InserisciMeseScadenzaCB;
	private JComboBox InserisciAnnoScadenzaCB;
	private ControllerMagazzino Controller;

	/**
	 * Create the frame.
	 */
	public AggiungiUovaJFrame(ControllerMagazzino c) {
		Controller = c;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		AggiungiUovaPanel = new JPanel();
		AggiungiUovaPanel.setBackground(new Color(255, 228, 181));
		AggiungiUovaPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		AggiungiUovaPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(AggiungiUovaPanel);
		AggiungiUovaPanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		AggiungiUovaPanel.add(MenùLateraleTB, BorderLayout.WEST);
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		
		
		JButton ClientiButton = new JButton("");
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(VenditeButton);
		
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(MagazzinoButton);
		
		Component verticalStrut = Box.createVerticalStrut(280);
		verticalStrut.setMaximumSize(new Dimension(32767, 300));
		MenùLateraleTB.add(verticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setBackground(new Color(255, 153, 51));
		InfoButton.setIcon(new ImageIcon(ClientiJFrame.class.getResource("/Risorse/info-menu.png")));
		InfoButton.setBorder(null);
		InfoButton.setBorderPainted(false);
		InfoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(InfoButton);
		
		JToolBar percorsoTB = new JToolBar();
		percorsoTB.setBorder(null);
		percorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		percorsoTB.setBorderPainted(false);
		percorsoTB.setFloatable(false);
		percorsoTB.setBackground(new Color(255, 204, 153));
		percorsoTB.setMaximumSize(new Dimension(100, 100));
		percorsoTB.setBounds(65, 0, 976, 30);
		AggiungiUovaPanel.add(percorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Magazzino");
		MagazzinoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.Uova_MagazzinoPercorsoBottonePremuto();
			}
		});
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(MagazzinoPercorsoButton);
		
		JButton AggiungiNuovoProdottoPercorsoButton = new JButton("> Aggiungi Nuovo Prodotto");
		AggiungiNuovoProdottoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.Uova_AggiungiProdottoPercorsoBottonePremuto();
			}
		});
		AggiungiNuovoProdottoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(AggiungiNuovoProdottoPercorsoButton);
		
		JButton UovaPercorsoButton = new JButton("> Uova");
		UovaPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.Uova_UovaPercorsoBottonePremuto();
			}
		});
		UovaPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(UovaPercorsoButton);
		
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
		
		InserisciNPerConfezioneTB = new JTextField();
		InserisciNPerConfezioneTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciNPerConfezioneTB.setBounds(316, 172, 96, 19);
		AggiungiUovaPanel.add(InserisciNPerConfezioneTB);
		InserisciNPerConfezioneTB.setColumns(10);
		
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
		InserisciLottoTB.setBounds(316, 223, 190, 19);
		AggiungiUovaPanel.add(InserisciLottoTB);
		InserisciLottoTB.setColumns(10);
		
		InserisciProvenienzaTB = new JTextField();
		InserisciProvenienzaTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciProvenienzaTB.setBounds(316, 350, 190, 19);
		AggiungiUovaPanel.add(InserisciProvenienzaTB);
		InserisciProvenienzaTB.setColumns(10);
		
		InserisciValoreTB = new JTextField();
		InserisciValoreTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciValoreTB.setBounds(316, 267, 96, 20);
		AggiungiUovaPanel.add(InserisciValoreTB);
		InserisciValoreTB.setColumns(10);
		
		JLabel EuroLB = new JLabel("\u20AC");
		EuroLB.setFont(new Font("Arial", Font.ITALIC, 14));
		EuroLB.setBounds(422, 269, 8, 14);
		AggiungiUovaPanel.add(EuroLB);
		
		JLabel InserisciScorteLB = new JLabel("Scorte :");
		InserisciScorteLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciScorteLB.setBounds(234, 391, 45, 14);
		AggiungiUovaPanel.add(InserisciScorteLB);
		
		InserisciScorteTB = new JTextField();
		InserisciScorteTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciScorteTB.setColumns(10);
		InserisciScorteTB.setBounds(316, 389, 96, 20);
		AggiungiUovaPanel.add(InserisciScorteTB);
		
		JButton AggiungiProdottoButton = new JButton("Aggiungi Prodotto");
		AggiungiProdottoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					Controller.UovaBottoneAvantiPremuto();
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
				Controller.UovaBottoneIndietroPremuto();
			}
		});
		IndietroButton.setFont(new Font("Arial", Font.PLAIN, 11));
		IndietroButton.setBounds(652, 484, 137, 31);
		AggiungiUovaPanel.add(IndietroButton);
	}
	
	
	public String getInserisciNomeTB() {
		return InserisciNPerConfezioneTB.getText();
	}



	public String getInserisciValoreTB() {
		return InserisciValoreTB.getText();
	}


	public String getInserisciScorteTB() {
		return InserisciScorteTB.getText();
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
	
	public String getInserisciLottoTB() {
		return InserisciLottoTB.getText();
	}


	public String getInserisciProvenienzaTB() {
		return InserisciProvenienzaTB.getText();
	}
	
	public String getInserisciNPerConfezione() {
		return InserisciNPerConfezioneTB.getText();
	}
}
