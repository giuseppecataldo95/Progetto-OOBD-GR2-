package GUI.Cliente;

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

import Controller.ControllerCliente;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreaTesseraJFrame extends JFrame {


	private JPanel CreaTesseraPanel;
	private	JTextField InserisciNomeTB;
	private	JTextField InserisciCognomeTB;
	private	JTextField InserisciLuogoNTB;
	private JComboBox  InserisciSessoCB;
	private JComboBox  InserisciGiornoCB;
	private JComboBox  InserisciMeseCB;
	private JComboBox  InserisciAnnoCB;	
	
	 

	ControllerCliente Controller;

	
	public CreaTesseraJFrame(ControllerCliente c) {
		
		Controller = c;
		
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		CreaTesseraPanel = new JPanel();
		CreaTesseraPanel.setBackground(new Color(255, 228, 181));
		CreaTesseraPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		CreaTesseraPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(CreaTesseraPanel);
		CreaTesseraPanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 0, 65, 574);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		CreaTesseraPanel.add(MenùLateraleTB);
		
		JButton ClientiButton = new JButton("");
		ClientiButton.setFont(new Font("Arial", Font.PLAIN, 12));
		ClientiButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setBorder(null);
		ClientiButton.setBorderPainted(false);
		ClientiButton.setIcon(null);
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setFont(new Font("Arial", Font.PLAIN, 12));
		VenditeButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(VenditeButton);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setBorder(null);
		VenditeButton.setIcon(null);
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		JButton DipendentiButton = new JButton("");
		DipendentiButton.setFont(new Font("Arial", Font.PLAIN, 12));
		DipendentiButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(DipendentiButton);
		DipendentiButton.setBorderPainted(false);
		DipendentiButton.setBorder(null);
		DipendentiButton.setIcon(null);
		DipendentiButton.setMaximumSize(new Dimension(65, 70));
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(MagazzinoButton);
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setIcon(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		
		Component VerticalStrut = Box.createVerticalStrut(200);
		VerticalStrut.setBackground(Color.LIGHT_GRAY);
		MenùLateraleTB.add(VerticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		InfoButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(InfoButton);
		InfoButton.setBorderPainted(false);
		InfoButton.setBorder(null);
		InfoButton.setIcon(null);
		InfoButton.setMaximumSize(new Dimension(65, 70));

		JToolBar PercorsoTB = new JToolBar();
		PercorsoTB.setBorder(null);
		PercorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		PercorsoTB.setBorderPainted(false);
		PercorsoTB.setFloatable(false);
		PercorsoTB.setBackground(new Color(255, 204, 153));
		PercorsoTB.setMaximumSize(new Dimension(100, 100));
		PercorsoTB.setBounds(65, 0, 976, 30);
		CreaTesseraPanel.add(PercorsoTB);
		
		JButton ClientiPercorsoButton = new JButton("> Clienti");
		ClientiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Controller.CreaNuovaTesseraClientiPercorsoButtonPressed();
				
			}
		});
		ClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(ClientiPercorsoButton);
		
		JButton CreaNuovaTesseraPercorsoButton = new JButton("> Crea Nuova Tessera");
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
		
		InserisciGiornoCB = new JComboBox();
		InserisciGiornoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciGiornoCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		InserisciGiornoCB.setBounds(316, 317, 45, 21);
		CreaTesseraPanel.add(InserisciGiornoCB);
		
		InserisciMeseCB = new JComboBox();
		InserisciMeseCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciMeseCB.setModel(new DefaultComboBoxModel(new String[] {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO", "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"}));
		InserisciMeseCB.setBounds(368, 317, 103, 21);
		CreaTesseraPanel.add(InserisciMeseCB);
		
		InserisciAnnoCB = new JComboBox();
		InserisciAnnoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciAnnoCB.setModel(new DefaultComboBoxModel(new String[] {"1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004"}));
		InserisciAnnoCB.setBounds(481, 317, 66, 21);
		CreaTesseraPanel.add(InserisciAnnoCB);
		
		InserisciLuogoNTB = new JTextField();
		InserisciLuogoNTB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciLuogoNTB.setBounds(316, 362, 190, 19);
		CreaTesseraPanel.add(InserisciLuogoNTB);
		InserisciLuogoNTB.setColumns(10);
		

		InserisciSessoCB = new JComboBox();
		InserisciSessoCB.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		InserisciSessoCB.setBounds(316, 267, 41, 21);
		CreaTesseraPanel.add(InserisciSessoCB);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Controller.CreaNuovaTesseraIndietroButtonPressed();
				
			}
		});
		IndietroButton.setBounds(640, 484, 103, 31);
		CreaTesseraPanel.add(IndietroButton);
		
		JButton AvantiButton = new JButton("Avanti");	
		AvantiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
				Controller.CreaNuovaTesseraAvantiButtonPressed();
			}
		});
		AvantiButton.setBounds(799, 484, 103, 31);
		CreaTesseraPanel.add(AvantiButton);
		
		
		
	}


	public String getNomeTB() {
		return InserisciNomeTB.getText();
	}


	public String getCognomeTB() {
		return InserisciCognomeTB.getText();
	}


	public String getLuogoNTB() {
		return InserisciLuogoNTB.getText();
	}


	public String getSessoCB() {
		return InserisciSessoCB.getSelectedItem().toString();
	}


	public String getGiornoCB() {
		return InserisciGiornoCB.getSelectedItem().toString();
	}


	public String getMeseCB() {
		return InserisciMeseCB.getSelectedItem().toString();
	}


	public String getAnnoCB() {
		return InserisciAnnoCB.getSelectedItem().toString();
	}


	
	
	
}
