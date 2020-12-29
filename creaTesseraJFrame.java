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

public class creaTesseraJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField inserisciNomeTB;
	private JTextField inserisciCognomeTB;
	private JTextField inserisciLuogoNTB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					creaTesseraJFrame frame = new creaTesseraJFrame();
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
	public creaTesseraJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar menùLateraleTB = new JToolBar();
		menùLateraleTB.setBorder(null);
		menùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		menùLateraleTB.setBorderPainted(false);
		menùLateraleTB.setFloatable(false);
		menùLateraleTB.setBackground(Color.WHITE);
		menùLateraleTB.setMaximumSize(new Dimension(100, 100));
		menùLateraleTB.setBounds(5, 24, 55, 534);
		menùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		contentPane.add(menùLateraleTB);
		
		JButton clienteButton = new JButton("Clienti");
		clienteButton.setFont(new Font("Arial", Font.PLAIN, 11));
		clienteButton.setForeground(Color.BLACK);
		menùLateraleTB.add(clienteButton);
		clienteButton.setIcon(null);
		clienteButton.setMaximumSize(new Dimension(65, 70));
		
		JButton venditeButton = new JButton("Vendite");
		venditeButton.setFont(new Font("Arial", Font.PLAIN, 11));
		venditeButton.setBorder(null);
		venditeButton.setBorderPainted(false);
		venditeButton.setMaximumSize(new Dimension(65, 70));
		menùLateraleTB.add(venditeButton);
		
		JButton dipendenteButton = new JButton("Dipendenti");
		dipendenteButton.setFont(new Font("Arial", Font.PLAIN, 11));
		dipendenteButton.setBorderPainted(false);
		dipendenteButton.setBorder(null);
		dipendenteButton.setMaximumSize(new Dimension(65, 70));
		menùLateraleTB.add(dipendenteButton);
		
		JButton magazzinoButton = new JButton("Magazzino");
		magazzinoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		magazzinoButton.setBorderPainted(false);
		magazzinoButton.setBorder(null);
		magazzinoButton.setBackground(UIManager.getColor("ToolBar.dockingBackground"));
		magazzinoButton.setMaximumSize(new Dimension(65, 70));
		menùLateraleTB.add(magazzinoButton);
		
		Component verticalStrut = Box.createVerticalStrut(200);
		verticalStrut.setBackground(Color.LIGHT_GRAY);
		menùLateraleTB.add(verticalStrut);
		
		JButton infoButton = new JButton("Info");
		infoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		infoButton.setBorder(null);
		infoButton.setBorderPainted(false);
		infoButton.setMaximumSize(new Dimension(65, 70));
		menùLateraleTB.add(infoButton);
		

		JToolBar percorsoTB = new JToolBar();
		percorsoTB.setBorder(null);
		percorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		percorsoTB.setBorderPainted(false);
		percorsoTB.setFloatable(false);
		percorsoTB.setBackground(Color.WHITE);
		percorsoTB.setMaximumSize(new Dimension(100, 100));
		percorsoTB.setBounds(5, 5, 976, 19);
		contentPane.add(percorsoTB);
		
		JButton clientiPercorsoButton = new JButton("> Clienti");
		clientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(clientiPercorsoButton);
		
		JButton creaNuovaTesseraPercorsoButton = new JButton("> Crea Nuova Tessera");
		creaNuovaTesseraPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(creaNuovaTesseraPercorsoButton);
		
		JLabel registrazioneCliente1LB = new JLabel("Benvenuto nella sezione dedicata all'inserimento di un nuovo Cliente!");
		registrazioneCliente1LB.setFont(new Font("Arial", Font.BOLD, 14));
		registrazioneCliente1LB.setHorizontalAlignment(SwingConstants.CENTER);
		registrazioneCliente1LB.setBounds(212, 34, 562, 74);
		contentPane.add(registrazioneCliente1LB);
		
		JLabel registrazioneCliente2LB = new JLabel("Compila i seguenti campi con le relative informazioni!");
		registrazioneCliente2LB.setFont(new Font("Arial", Font.PLAIN, 13));
		registrazioneCliente2LB.setBounds(334, 97, 318, 16);
		contentPane.add(registrazioneCliente2LB);
		
		JLabel inserisciNomeLB = new JLabel("Nome : ");
		inserisciNomeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		inserisciNomeLB.setFont(new Font("Arial", Font.PLAIN, 12));
		inserisciNomeLB.setBounds(129, 171, 150, 20);
		contentPane.add(inserisciNomeLB);
		
		JLabel inserisciCognomeLB = new JLabel("Cognome : ");
		inserisciCognomeLB.setHorizontalAlignment(SwingConstants.RIGHT);
		inserisciCognomeLB.setFont(new Font("Arial", Font.PLAIN, 12));
		inserisciCognomeLB.setBounds(129, 222, 150, 20);
		contentPane.add(inserisciCognomeLB);
		
		JLabel selezionaSessoLB = new JLabel("Sesso : ");
		selezionaSessoLB.setHorizontalAlignment(SwingConstants.RIGHT);
		selezionaSessoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		selezionaSessoLB.setBounds(129, 267, 150, 20);
		contentPane.add(selezionaSessoLB);
		
		JLabel inserisciDataLB = new JLabel("Data Di Nascita : ");
		inserisciDataLB.setHorizontalAlignment(SwingConstants.RIGHT);
		inserisciDataLB.setFont(new Font("Arial", Font.PLAIN, 12));
		inserisciDataLB.setBounds(129, 317, 150, 20);
		contentPane.add(inserisciDataLB);
		
		JLabel inserisciLuogoNLB = new JLabel("Luogo Di Nascita :  ");
		inserisciLuogoNLB.setHorizontalAlignment(SwingConstants.RIGHT);
		inserisciLuogoNLB.setFont(new Font("Arial", Font.PLAIN, 12));
		inserisciLuogoNLB.setBounds(129, 362, 152, 20);
		contentPane.add(inserisciLuogoNLB);
		
		inserisciNomeTB = new JTextField();
		inserisciNomeTB.setBounds(316, 172, 190, 19);
		contentPane.add(inserisciNomeTB);
		inserisciNomeTB.setColumns(10);
		
		inserisciCognomeTB = new JTextField();
		inserisciCognomeTB.setBounds(316, 223, 190, 19);
		contentPane.add(inserisciCognomeTB);
		inserisciCognomeTB.setColumns(10);
		
		JRadioButton selezionaSessoMRB = new JRadioButton("M");
		selezionaSessoMRB.setBounds(316, 267, 50, 21);
		contentPane.add(selezionaSessoMRB);
		
		JRadioButton selezionaSessoFRB = new JRadioButton("F");
		selezionaSessoFRB.setBounds(368, 267, 103, 21);
		contentPane.add(selezionaSessoFRB);
		
		JComboBox inserisciGiornoCB = new JComboBox();
		inserisciGiornoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		inserisciGiornoCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		inserisciGiornoCB.setBounds(316, 317, 45, 21);
		contentPane.add(inserisciGiornoCB);
		
		JComboBox inserisciMeseCB = new JComboBox();
		inserisciMeseCB.setFont(new Font("Arial", Font.PLAIN, 12));
		inserisciMeseCB.setModel(new DefaultComboBoxModel(new String[] {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"}));
		inserisciMeseCB.setBounds(368, 317, 103, 21);
		contentPane.add(inserisciMeseCB);
		
		JComboBox inserisciAnnoCB = new JComboBox();
		inserisciAnnoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		inserisciAnnoCB.setModel(new DefaultComboBoxModel(new String[] {"1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004"}));
		inserisciAnnoCB.setBounds(481, 317, 66, 21);
		contentPane.add(inserisciAnnoCB);
		
		inserisciLuogoNTB = new JTextField();
		inserisciLuogoNTB.setFont(new Font("Arial", Font.PLAIN, 12));
		inserisciLuogoNTB.setBounds(316, 362, 190, 19);
		contentPane.add(inserisciLuogoNTB);
		inserisciLuogoNTB.setColumns(10);
		
		JButton indietroButton = new JButton("Indietro");
		indietroButton.setBounds(640, 484, 103, 31);
		contentPane.add(indietroButton);
		
		JButton avantiButton = new JButton("Avanti");
		avantiButton.setBounds(799, 484, 103, 31);
		contentPane.add(avantiButton);
		
	}
}
