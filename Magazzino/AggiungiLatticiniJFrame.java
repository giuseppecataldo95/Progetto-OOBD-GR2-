package Magazzino;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class AggiungiLatticiniJFrame extends JFrame {

	private JPanel AggiungiLatticiniPanel;
	private JTextField InserisciNomeTB;
	private JTextField InserisciLottoTB;
	private JTextField InserisciProvenienzaTB;
	private JTextField InserisciValorekgTB;
	private JTextField InserisciScorteTB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AggiungiLatticiniJFrame frame = new AggiungiLatticiniJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AggiungiLatticiniJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		AggiungiLatticiniPanel = new JPanel();
		AggiungiLatticiniPanel.setBackground(new Color(255, 228, 181));
		AggiungiLatticiniPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		AggiungiLatticiniPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(AggiungiLatticiniPanel);
		AggiungiLatticiniPanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 0, 65, 563);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		AggiungiLatticiniPanel.add(MenùLateraleTB);
		
		JButton ClientiButton = new JButton("");
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\clientiii.png"));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\cassaaaa.png"));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(VenditeButton);
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\scatolaaaa.png"));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(MagazzinoButton);
		
		JButton DipendentiButton = new JButton("");
		DipendentiButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\dipendentee.png"));
		DipendentiButton.setBorderPainted(false);
		DipendentiButton.setBorder(null);
		DipendentiButton.setBackground(new Color(255, 153, 51));
		DipendentiButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(DipendentiButton);
		
		Component verticalStrut = Box.createVerticalStrut(200);
		MenùLateraleTB.add(verticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setBackground(new Color(255, 153, 51));
		InfoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\infoo.png"));
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
		AggiungiLatticiniPanel.add(percorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Magazzino");
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(MagazzinoPercorsoButton);
		
		JButton AggiungiNuovoProdottoPercorsoButton = new JButton("> Aggiungi Nuovo Prodotto");
		AggiungiNuovoProdottoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(AggiungiNuovoProdottoPercorsoButton);
		
		JButton LatticiniPercorsoButton = new JButton("> Latticini");
		LatticiniPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(LatticiniPercorsoButton);
		
		JLabel AggiungiLatticini1LB = new JLabel("Benvenuto\\a nella sezione dedicata all'aggiunta di un nuovo prodotto di tipo Latticino!");
		AggiungiLatticini1LB.setFont(new Font("Arial", Font.BOLD, 14));
		AggiungiLatticini1LB.setHorizontalAlignment(SwingConstants.CENTER);
		AggiungiLatticini1LB.setBounds(181, 51, 641, 37);
		AggiungiLatticiniPanel.add(AggiungiLatticini1LB);
		
		JLabel AggiungiLatticini2LB = new JLabel("Compila i seguenti campi con le relative informazioni");
		AggiungiLatticini2LB.setFont(new Font("Arial", Font.PLAIN, 13));
		AggiungiLatticini2LB.setBounds(334, 97, 318, 16);
		AggiungiLatticiniPanel.add(AggiungiLatticini2LB);
		
		JLabel InserisciNomeLB = new JLabel("Nome : ");
		InserisciNomeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciNomeLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciNomeLB.setBounds(129, 171, 150, 20);
		AggiungiLatticiniPanel.add(InserisciNomeLB);
		
		JLabel InserisciPaeseLavorazioneLB = new JLabel("Paese Lavorazione : ");
		InserisciPaeseLavorazioneLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciPaeseLavorazioneLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciPaeseLavorazioneLB.setBounds(129, 222, 150, 20);
		AggiungiLatticiniPanel.add(InserisciPaeseLavorazioneLB);
		
		JLabel InserisciValoreLB = new JLabel("Valore al kg : ");
		InserisciValoreLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciValoreLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciValoreLB.setBounds(129, 267, 150, 20);
		AggiungiLatticiniPanel.add(InserisciValoreLB);
		
		JLabel InserisciDataMungituraLB = new JLabel("Data Mungitura : ");
		InserisciDataMungituraLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciDataMungituraLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciDataMungituraLB.setBounds(129, 317, 150, 20);
		AggiungiLatticiniPanel.add(InserisciDataMungituraLB);
		
		JLabel InserisciPaeseMungituraLB = new JLabel("Paese Mungitura :");
		InserisciPaeseMungituraLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciPaeseMungituraLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciPaeseMungituraLB.setBounds(139, 398, 140, 20);
		AggiungiLatticiniPanel.add(InserisciPaeseMungituraLB);
		
		InserisciNomeTB = new JTextField();
		InserisciNomeTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciNomeTB.setBounds(316, 172, 190, 19);
		AggiungiLatticiniPanel.add(InserisciNomeTB);
		InserisciNomeTB.setColumns(10);
		
		InserisciLottoTB = new JTextField();
		InserisciLottoTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciLottoTB.setBounds(316, 223, 190, 19);
		AggiungiLatticiniPanel.add(InserisciLottoTB);
		InserisciLottoTB.setColumns(10);
		

		final JComboBox InserisciGiornoMungituraCB = new JComboBox();
		InserisciGiornoMungituraCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciGiornoMungituraCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		InserisciGiornoMungituraCB.setBounds(316, 317, 45, 21);
		AggiungiLatticiniPanel.add(InserisciGiornoMungituraCB);

		
		final JComboBox InserisciMeseMungituraCB = new JComboBox();
		InserisciMeseMungituraCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciMeseMungituraCB.setModel(new DefaultComboBoxModel(new String[] {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"}));
		InserisciMeseMungituraCB.setBounds(368, 317, 103, 21);
		AggiungiLatticiniPanel.add(InserisciMeseMungituraCB);
		
		
		
		final JComboBox InserisciAnnoMungituraCB = new JComboBox();
		InserisciAnnoMungituraCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciAnnoMungituraCB.setModel(new DefaultComboBoxModel(new String[] {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"}));
		InserisciAnnoMungituraCB.setBounds(481, 317, 66, 21);
		AggiungiLatticiniPanel.add(InserisciAnnoMungituraCB);
		
		InserisciProvenienzaTB = new JTextField();
		InserisciProvenienzaTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciProvenienzaTB.setBounds(316, 399, 190, 19);
		AggiungiLatticiniPanel.add(InserisciProvenienzaTB);
		InserisciProvenienzaTB.setColumns(10);
		
		InserisciValorekgTB = new JTextField();
		InserisciValorekgTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciValorekgTB.setBounds(316, 267, 96, 20);
		AggiungiLatticiniPanel.add(InserisciValorekgTB);
		InserisciValorekgTB.setColumns(10);
		
		JLabel EuroLB = new JLabel("\u20AC");
		EuroLB.setFont(new Font("Arial", Font.ITALIC, 14));
		EuroLB.setBounds(422, 269, 8, 14);
		AggiungiLatticiniPanel.add(EuroLB);
		
		JLabel InserisciScorteLB = new JLabel("Scorte :");
		InserisciScorteLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciScorteLB.setBounds(234, 441, 45, 14);
		AggiungiLatticiniPanel.add(InserisciScorteLB);
		
		InserisciScorteTB = new JTextField();
		InserisciScorteTB.setFont(new Font("Arial", Font.PLAIN, 11));
		InserisciScorteTB.setColumns(10);
		InserisciScorteTB.setBounds(316, 439, 96, 20);
		AggiungiLatticiniPanel.add(InserisciScorteTB);
		
		JLabel KgLB = new JLabel("Kg");
		KgLB.setFont(new Font("Arial", Font.ITALIC, 14));
		KgLB.setBounds(422, 437, 27, 20);
		AggiungiLatticiniPanel.add(KgLB);
		

		JButton AggiungiProdottoButton = new JButton("Aggiungi Prodotto");
		AggiungiProdottoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		AggiungiProdottoButton.setBounds(799, 484, 119, 31);
		AggiungiLatticiniPanel.add(AggiungiProdottoButton);

		
		JLabel InserisciDataScadenzaLB = new JLabel("Data Scadenza : ");
		InserisciDataScadenzaLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciDataScadenzaLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciDataScadenzaLB.setBounds(129, 359, 150, 20);
		AggiungiLatticiniPanel.add(InserisciDataScadenzaLB);
		

		JComboBox InserisciGiornoScadenzaCB = new JComboBox();
		InserisciGiornoScadenzaCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciGiornoScadenzaCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		InserisciGiornoScadenzaCB.setBounds(316, 358, 45, 21);
		AggiungiLatticiniPanel.add(InserisciGiornoScadenzaCB);

		
		
		JComboBox InserisciScadenzaCB = new JComboBox();
		InserisciScadenzaCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciScadenzaCB.setModel(new DefaultComboBoxModel(new String[] {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"}));
		InserisciScadenzaCB.setBounds(368, 358, 103, 21);
		AggiungiLatticiniPanel.add(InserisciScadenzaCB);
		
		JComboBox InserisciAnnoScadenzaCB = new JComboBox();
		InserisciAnnoScadenzaCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciAnnoScadenzaCB.setModel(new DefaultComboBoxModel(new String[] {"2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		InserisciAnnoScadenzaCB.setBounds(481, 358, 66, 21);
		AggiungiLatticiniPanel.add(InserisciAnnoScadenzaCB);
	}
}
