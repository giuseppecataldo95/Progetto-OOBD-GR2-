package Cliente;

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
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class CreaTesseraJFrame extends JFrame {

	private JPanel CreaTesseraPanel;
	private JTextField InserisciNomeTB;
	private JTextField InserisciCognomeTB;
	private JTextField InserisciLuogoNTB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreaTesseraJFrame frame = new CreaTesseraJFrame();
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
	public CreaTesseraJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		CreaTesseraPanel = new JPanel();
		CreaTesseraPanel.setBackground(SystemColor.menu);
		CreaTesseraPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(CreaTesseraPanel);
		CreaTesseraPanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 102, 0));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 0, 65, 563);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		CreaTesseraPanel.add(MenùLateraleTB);
		
		JButton ClienteButton = new JButton("");
		ClienteButton.setBackground(new Color(255, 102, 0));
		ClienteButton.setBorder(null);
		ClienteButton.setBorderPainted(false);
		ClienteButton.setFont(new Font("Arial", Font.PLAIN, 11));
		ClienteButton.setForeground(Color.BLACK);
		MenùLateraleTB.add(ClienteButton);
		ClienteButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\clientiii.png"));
		ClienteButton.setMaximumSize(new Dimension(65, 70));
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\cassaaaa.png"));
		VenditeButton.setBackground(new Color(255, 102, 0));
		VenditeButton.setFont(new Font("Arial", Font.PLAIN, 11));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(VenditeButton);
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\scatolaaaa.png"));
		MagazzinoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setBackground(new Color(255, 102, 0));
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(MagazzinoButton);
		
		JButton DipendenteButton = new JButton("");
		DipendenteButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\dipendentee.png"));
		DipendenteButton.setBackground(new Color(255, 102, 0));
		DipendenteButton.setFont(new Font("Arial", Font.PLAIN, 11));
		DipendenteButton.setBorderPainted(false);
		DipendenteButton.setBorder(null);
		DipendenteButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(DipendenteButton);
		
		Component verticalStrut = Box.createVerticalStrut(200);
		verticalStrut.setBackground(Color.LIGHT_GRAY);
		MenùLateraleTB.add(verticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\infoo.png"));
		InfoButton.setBackground(new Color(255, 102, 0));
		InfoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		InfoButton.setBorder(null);
		InfoButton.setBorderPainted(false);
		InfoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(InfoButton);
		

		JToolBar PercorsoTB = new JToolBar();
		PercorsoTB.setBorder(UIManager.getBorder("TextField.border"));
		PercorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		PercorsoTB.setFloatable(false);
		PercorsoTB.setBackground(Color.ORANGE);
		PercorsoTB.setMaximumSize(new Dimension(100, 100));
		PercorsoTB.setBounds(70, 5, 911, 19);
		CreaTesseraPanel.add(PercorsoTB);
		
		JButton ClientiPercorsoButton = new JButton("> Clienti");
		ClientiPercorsoButton.setForeground(Color.WHITE);
		ClientiPercorsoButton.setBorder(null);
		ClientiPercorsoButton.setBackground(Color.ORANGE);
		ClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(ClientiPercorsoButton);
		
		JButton CreaNuovaTesseraPercorsoButton = new JButton("> Crea Nuova Tessera");
		CreaNuovaTesseraPercorsoButton.setForeground(Color.WHITE);
		CreaNuovaTesseraPercorsoButton.setBorder(null);
		CreaNuovaTesseraPercorsoButton.setBackground(Color.ORANGE);
		CreaNuovaTesseraPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(CreaNuovaTesseraPercorsoButton);
		
		JLabel RegistrazioneCliente1LB = new JLabel("Benvenuto nella sezione dedicata all'inserimento di un nuovo Cliente!");
		RegistrazioneCliente1LB.setFont(new Font("Arial", Font.BOLD, 14));
		RegistrazioneCliente1LB.setHorizontalAlignment(SwingConstants.CENTER);
		RegistrazioneCliente1LB.setBounds(212, 34, 562, 74);
		CreaTesseraPanel.add(RegistrazioneCliente1LB);
		
		JLabel RegistrazioneCliente2LB = new JLabel("Compila i seguenti campi con le relative informazioni!");
		RegistrazioneCliente2LB.setFont(new Font("Arial", Font.PLAIN, 13));
		RegistrazioneCliente2LB.setBounds(334, 97, 318, 16);
		CreaTesseraPanel.add(RegistrazioneCliente2LB);
		
		JLabel InserisciNomeLB = new JLabel("Nome : ");
		InserisciNomeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciNomeLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciNomeLB.setBounds(129, 171, 150, 20);
		CreaTesseraPanel.add(InserisciNomeLB);
		
		JLabel InserisciCognomeLB = new JLabel("Cognome : ");
		InserisciCognomeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciCognomeLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciCognomeLB.setBounds(129, 222, 150, 20);
		CreaTesseraPanel.add(InserisciCognomeLB);
		
		JLabel SelezionaSessoLB = new JLabel("Sesso : ");
		SelezionaSessoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		SelezionaSessoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		SelezionaSessoLB.setBounds(129, 267, 150, 20);
		CreaTesseraPanel.add(SelezionaSessoLB);
		
		JLabel InserisciDataLB = new JLabel("Data Di Nascita : ");
		InserisciDataLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciDataLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciDataLB.setBounds(129, 317, 150, 20);
		CreaTesseraPanel.add(InserisciDataLB);
		
		JLabel InserisciLuogoNLB = new JLabel("Luogo Di Nascita :  ");
		InserisciLuogoNLB.setHorizontalAlignment(SwingConstants.RIGHT);
		InserisciLuogoNLB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciLuogoNLB.setBounds(129, 362, 152, 20);
		CreaTesseraPanel.add(InserisciLuogoNLB);
		
		InserisciNomeTB = new JTextField();
		InserisciNomeTB.setBounds(316, 172, 190, 19);
		CreaTesseraPanel.add(InserisciNomeTB);
		InserisciNomeTB.setColumns(10);
		
		InserisciCognomeTB = new JTextField();
		InserisciCognomeTB.setBounds(316, 223, 190, 19);
		CreaTesseraPanel.add(InserisciCognomeTB);
		InserisciCognomeTB.setColumns(10);
		
		JRadioButton SelezionaSessoMRB = new JRadioButton("M");
		SelezionaSessoMRB.setBorder(null);
		SelezionaSessoMRB.setBackground(SystemColor.menu);
		SelezionaSessoMRB.setBounds(316, 267, 50, 21);
		CreaTesseraPanel.add(SelezionaSessoMRB);
		
		JRadioButton SelezionaSessoFRB = new JRadioButton("F");
		SelezionaSessoFRB.setBounds(368, 267, 103, 21);
		CreaTesseraPanel.add(SelezionaSessoFRB);
		
		JComboBox InserisciGiornoCB = new JComboBox();
		InserisciGiornoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciGiornoCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		InserisciGiornoCB.setBounds(316, 317, 45, 21);
		CreaTesseraPanel.add(InserisciGiornoCB);
		
		JComboBox InserisciMeseCB = new JComboBox();
		InserisciMeseCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciMeseCB.setModel(new DefaultComboBoxModel(new String[] {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"}));
		InserisciMeseCB.setBounds(368, 317, 103, 21);
		CreaTesseraPanel.add(InserisciMeseCB);
		
		JComboBox InserisciAnnoCB = new JComboBox();
		InserisciAnnoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciAnnoCB.setModel(new DefaultComboBoxModel(new String[] {"1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004"}));
		InserisciAnnoCB.setBounds(481, 317, 66, 21);
		CreaTesseraPanel.add(InserisciAnnoCB);
		
		InserisciLuogoNTB = new JTextField();
		InserisciLuogoNTB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciLuogoNTB.setBounds(316, 362, 190, 19);
		CreaTesseraPanel.add(InserisciLuogoNTB);
		InserisciLuogoNTB.setColumns(10);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.setBackground(Color.ORANGE);
		IndietroButton.setForeground(Color.WHITE);
		IndietroButton.setFont(new Font("Arial", Font.PLAIN, 11));
		IndietroButton.setBounds(640, 484, 103, 31);
		CreaTesseraPanel.add(IndietroButton);
		
		JButton AvantiButton = new JButton("Avanti");
		AvantiButton.setBackground(Color.ORANGE);
		AvantiButton.setForeground(Color.WHITE);
		AvantiButton.setFont(new Font("Arial", Font.PLAIN, 11));
		AvantiButton.setBounds(799, 484, 103, 31);
		CreaTesseraPanel.add(AvantiButton);
		
	}
}
