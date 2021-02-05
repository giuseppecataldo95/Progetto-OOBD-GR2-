package GUI.Cliente;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCliente;
import Controller.ControllerPrincipale;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreaTesseraJFrame extends JFrame {


	private JPanel CreaTesseraPanel;
	private	JTextField InserisciNomeTF;
	private	JTextField InserisciCognomeTF;
	private	JTextField InserisciLuogoNTF;
	private JComboBox  InserisciSessoCB;
	private JComboBox  InserisciGiornoCB;
	private JComboBox  InserisciMeseCB;
	private JComboBox  InserisciAnnoCB;	
	
	 

	private	ControllerCliente Controller;
	private ControllerPrincipale ControllerP;
	
	public CreaTesseraJFrame(ControllerCliente c, ControllerPrincipale c1) {
		
		Controller = c;
		ControllerP = c1;
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
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
		ClientiButton.setToolTipText("Clienti");
		ClientiButton.setBorder(null);
		ClientiButton.setBorderPainted(false);
		ClientiButton.setIcon(new ImageIcon(CreaTesseraJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.CreaTesseraMenùLateraleClientiBottonePremuto();

			}
		});
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setFont(new Font("Arial", Font.PLAIN, 12));
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorderPainted(false);
		VenditeButton.setBorder(null);
		VenditeButton.setIcon(new ImageIcon(CreaTesseraJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		VenditeButton.setToolTipText("Vendite");
		MenùLateraleTB.add(VenditeButton);
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.CreaTesseraMenùLateraleVenditeBottonePremuto();
				
			}
		});
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setToolTipText("Magazzino");
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setIcon(new ImageIcon(CreaTesseraJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(MagazzinoButton);
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.CreaTesseraMenùLateraleMagazzinoBottonePremuto();

			}
		});
		
		Component VerticalStrut = Box.createVerticalStrut(280);
		VerticalStrut.setBackground(Color.LIGHT_GRAY);
		MenùLateraleTB.add(VerticalStrut);

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
		ClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(ClientiPercorsoButton);
		ClientiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Controller.CreaNuovaTesseraClientiPercorsoBottonePremuto();
				
			}
		});
		
		JButton CreaNuovaTesseraPercorsoButton = new JButton("> Crea Nuova Tessera");
		CreaNuovaTesseraPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(CreaNuovaTesseraPercorsoButton);
		CreaNuovaTesseraPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Controller.CreaNuovaTesseraCreaNuovaTesseraPercorsoBottonePremuto();
				
			}
		});
		
		
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
		
		InserisciNomeTF = new JTextField();
		InserisciNomeTF.setBounds(316, 172, 190, 19);
		CreaTesseraPanel.add(InserisciNomeTF);
		InserisciNomeTF.setColumns(10);
		
		InserisciCognomeTF = new JTextField();
		InserisciCognomeTF.setBounds(316, 223, 190, 19);
		CreaTesseraPanel.add(InserisciCognomeTF);
		InserisciCognomeTF.setColumns(10);
		
		InserisciGiornoCB = new JComboBox();
		InserisciGiornoCB.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciGiornoCB.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
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
		
		InserisciLuogoNTF = new JTextField();
		InserisciLuogoNTF.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciLuogoNTF.setBounds(316, 362, 190, 19);
		CreaTesseraPanel.add(InserisciLuogoNTF);
		InserisciLuogoNTF.setColumns(10);
		

		InserisciSessoCB = new JComboBox();
		InserisciSessoCB.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		InserisciSessoCB.setBounds(316, 267, 41, 21);
		CreaTesseraPanel.add(InserisciSessoCB);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.setBounds(640, 484, 103, 31);
		CreaTesseraPanel.add(IndietroButton);
		IndietroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Controller.CreaNuovaTesseraIndietroBottonePremuto();
				
			}
		});
		
		JButton AvantiButton = new JButton("Avanti");	
		AvantiButton.setBounds(799, 484, 103, 31);
		CreaTesseraPanel.add(AvantiButton);
		AvantiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Controller.CreaNuovaTesseraAvantiBottonePremuto();
			}
		});
		
		
		
	}


	public String getNomeTF() {
		return InserisciNomeTF.getText();
	}


	public String getCognomeTF() {
		return InserisciCognomeTF.getText();
	}


	public String getLuogoNTF() {
		return InserisciLuogoNTF.getText();
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
