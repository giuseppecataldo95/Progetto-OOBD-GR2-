package GUI.Vendite;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Controller.ControllerCliente;
import Controller.ControllerPrincipale;
import Controller.ControllerVendite;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class CreaCarrelloJFrame extends JFrame {


	private JPanel CreaCarrelloPanel;
	
	 

	private	ControllerVendite ControllerV;
	private ControllerPrincipale ControllerP;
	private JTable ProdottiTable;
	private JComboBox<String> FiltraPerCB = new JComboBox<String>();
	private DefaultTableModel TableModel;
	private DefaultComboBoxModel<String> CBModel;
	private TableRowSorter<DefaultTableModel> Sorter;
	private JTextField FiltraPerTB = new JTextField();
	private JTextField InserisciIDProdottoTF;
	private JComboBox<String> SelezionaCategoriaCB;
	private JTextField InserisciScorteTB;
	private Timer TimerErrore;
	private Timer TimerProdottoAggiunto;
	private JLabel ProdottoAggiuntoLB;
	private JLabel ErroreLB;
	private JButton VisualizzaCarrelloButton;

	
	
	
	public CreaCarrelloJFrame(ControllerVendite v, ControllerPrincipale p) {
		ControllerV = v;
		ControllerP = p;
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		setTitle("ProgettoOOBD2020");
		CreaCarrelloPanel = new JPanel();
		CreaCarrelloPanel.setFont(new Font("Arial", Font.BOLD, 11));
		CreaCarrelloPanel.setBackground(new Color(255, 228, 181));
		CreaCarrelloPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		CreaCarrelloPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(CreaCarrelloPanel);
		CreaCarrelloPanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 0, 65, 574);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		CreaCarrelloPanel.add(MenùLateraleTB);
		
		JButton ClientiButton = new JButton("");
		ClientiButton.setFont(new Font("Arial", Font.PLAIN, 12));
		ClientiButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setBorder(null);
		ClientiButton.setToolTipText("Clienti");
		ClientiButton.setBorderPainted(false);
		ClientiButton.setIcon(new ImageIcon(CreaCarrelloJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		ClientiButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ControllerP.CreaCarrelloMenùLateraleClientiBottonePremuto();
		}
	});
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.CreaCarrelloMenùLateraleVenditeBottonePremuto();
				
			}
		});
		VenditeButton.setFont(new Font("Arial", Font.PLAIN, 12));
		VenditeButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(VenditeButton);
		VenditeButton.setToolTipText("Vendite");
		VenditeButton.setBorderPainted(false);
		VenditeButton.setBorder(null);
		VenditeButton.setIcon(new ImageIcon(CreaCarrelloJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.setFont(new Font("Arial", Font.PLAIN, 12));
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.add(MagazzinoButton);
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setToolTipText("Magazzino");
		MagazzinoButton.setIcon(new ImageIcon(CreaCarrelloJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.CreaCarrelloMenùLateraleMagazzinoBottonePremuto();
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
		CreaCarrelloPanel.add(PercorsoTB);
		
		JButton VenditePercorsoButton = new JButton("> Vendite");
		VenditePercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerV.CreaCarrello_VenditePercorsoBottonePremuto();
				
			}
		});
		VenditePercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VenditePercorsoButton);
		
		JButton CreaNuovoCarrelloButton = new JButton("> Crea Nuovo Carrello");
		CreaNuovoCarrelloButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerV.CreaCarrello_CreaCarrelloPercorsoBottonePremuto();
				
			}
		});
		CreaNuovoCarrelloButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(CreaNuovoCarrelloButton);
		
		JLabel CreazioneCarrello1LB = new JLabel("Benvenuto nella sezione dedicata alla creazione di un nuovo carrello!");
		CreazioneCarrello1LB.setFont(new Font("Arial", Font.BOLD, 14));
		CreazioneCarrello1LB.setHorizontalAlignment(SwingConstants.CENTER);
		CreazioneCarrello1LB.setBounds(212, 41, 562, 45);
		CreaCarrelloPanel.add(CreazioneCarrello1LB);
		
		JLabel CreazioneCarrello2LB = new JLabel("Seleziona il tipo di prodotto da inserire nel carrello:");
		CreazioneCarrello2LB.setFont(new Font("Arial", Font.PLAIN, 13));
		CreazioneCarrello2LB.setBounds(95, 99, 301, 16);
		CreaCarrelloPanel.add(CreazioneCarrello2LB);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerV.CreaCarrelloIndietroBottonePremuto();
				
			}
		});
		IndietroButton.setBounds(749, 521, 103, 31);
		CreaCarrelloPanel.add(IndietroButton);
		
		VisualizzaCarrelloButton = new JButton("Carrello");	
		VisualizzaCarrelloButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerV.CreaCarrelloVisualizzaCarrelloBottonePremuto();
				
				
			}
		});
		VisualizzaCarrelloButton.setBounds(862, 521, 114, 31);
		CreaCarrelloPanel.add(VisualizzaCarrelloButton);
		
		JScrollPane TabellaPanel = new JScrollPane();
		TabellaPanel.setVisible(false);
		TabellaPanel.setBounds(95, 125, 716, 379);
		CreaCarrelloPanel.add(TabellaPanel);
		
		
		SelezionaCategoriaCB = new JComboBox<String>();
		SelezionaCategoriaCB.setModel(new DefaultComboBoxModel<String>(new String[] {"Frutta", "Verdura", "Latticini", "Uova", "Farinacei", "Confezionati"}));
		SelezionaCategoriaCB.setBounds(392, 97, 139, 22);
		SelezionaCategoriaCB.setSelectedIndex(-1);
		CreaCarrelloPanel.add(SelezionaCategoriaCB);
		
		JPanel FiltraPanel = new JPanel();
		FiltraPanel.setVisible(false);
		FiltraPanel.setBorder(null);
		FiltraPanel.setBackground(new Color(255, 228, 181));
		FiltraPanel.setBounds(563, 89, 413, 30);
		CreaCarrelloPanel.add(FiltraPanel);
		
		JLabel FiltraPerLB = new JLabel("Filtra per:");
		FiltraPerLB.setFont(new Font("Arial", Font.PLAIN, 13));
		FiltraPerLB.setBounds(685, 97, 65, 20);
		FiltraPanel.add(FiltraPerLB);
		
		JPanel AggiungiPanel = new JPanel();
		AggiungiPanel.setBackground(new Color(255, 228, 181));
		AggiungiPanel.setVisible(false);
		AggiungiPanel.setBorder(null);
		AggiungiPanel.setBounds(821, 218, 156, 196);
		CreaCarrelloPanel.add(AggiungiPanel);
		AggiungiPanel.setLayout(null);
		
		JLabel Aggiungi1LB = new JLabel("Inserisci l'ID del prodotto da");
		Aggiungi1LB.setBounds(1, 11, 154, 14);
		AggiungiPanel.add(Aggiungi1LB);
		Aggiungi1LB.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel Aggiungi2LB = new JLabel("aggiungere al Carrello:");
		Aggiungi2LB.setBounds(20, 24, 131, 14);
		AggiungiPanel.add(Aggiungi2LB);
		Aggiungi2LB.setFont(new Font("Arial", Font.PLAIN, 12));
		
		InserisciIDProdottoTF = new JTextField();
		InserisciIDProdottoTF.setForeground(new Color(0, 0, 0));
		InserisciIDProdottoTF.setBounds(30, 40, 96, 20);
		AggiungiPanel.add(InserisciIDProdottoTF);
		InserisciIDProdottoTF.setColumns(10);
		
		ProdottoAggiuntoLB = new JLabel("Prodotto aggiunto al Carrello");
		ProdottoAggiuntoLB.setForeground(new Color(50, 205, 50));
		ProdottoAggiuntoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		ProdottoAggiuntoLB.setBounds(821, 415, 165, 30);
		ProdottoAggiuntoLB.setVisible(false);
		CreaCarrelloPanel.add(ProdottoAggiuntoLB);
		
		ErroreLB = new JLabel("");
		ErroreLB.setForeground(new Color(255, 0, 0));
		ErroreLB.setFont(new Font("Arial", Font.PLAIN, 12));
		ErroreLB.setBounds(821, 415, 155, 89);
		ErroreLB.setVisible(false);
		CreaCarrelloPanel.add(ErroreLB);
		
		TimerProdottoAggiunto = new Timer(5000, new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				ProdottoAggiuntoLB.setVisible(false);
			}
		});
		TimerProdottoAggiunto.setRepeats(false);
		
		TimerErrore = new Timer(5000, new ActionListener() {

			@Override
		public void actionPerformed(ActionEvent e) {
				ErroreLB.setVisible(false);
			}
		});
		TimerErrore.setRepeats(false);
		
		
		JButton AggiungiButton = new JButton("+");
		AggiungiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerV.AggiungiAlCarrello();
			}
		});
		AggiungiButton.setBounds(55, 126, 41, 23);
		AggiungiPanel.add(AggiungiButton);
		
		JLabel Specifica1LB = new JLabel("*SPECIFICA IL TIPO DI PRODOTTO DA ");
		Specifica1LB.setFont(new Font("Arial", Font.PLAIN, 8));
		Specifica1LB.setBounds(1, 160, 154, 14);
		AggiungiPanel.add(Specifica1LB);
		
		JLabel Specifica2LB = new JLabel("AGGIUNGERE AL CARRELLO");
		Specifica2LB.setFont(new Font("Arial", Font.PLAIN, 8));
		Specifica2LB.setBounds(20, 169, 110, 10);
		AggiungiPanel.add(Specifica2LB);
		
		JLabel Specifica3LB = new JLabel("IN ALTO A SINISTRA");
		Specifica3LB.setForeground(new Color(255, 0, 0));
		Specifica3LB.setFont(new Font("Arial", Font.PLAIN, 8));
		Specifica3LB.setBounds(40, 176, 86, 10);
		AggiungiPanel.add(Specifica3LB);
		
		JLabel Aggiungi3LB = new JLabel("Inserisci il numero di unit\u00E0");
		Aggiungi3LB.setFont(new Font("Arial", Font.PLAIN, 12));
		Aggiungi3LB.setBounds(1, 71, 154, 14);
		AggiungiPanel.add(Aggiungi3LB);
		
		JLabel Aggiungi4LB = new JLabel("o i kg del prodotto da");
		Aggiungi4LB.setFont(new Font("Arial", Font.PLAIN, 12));
		Aggiungi4LB.setBounds(1, 82, 117, 14);
		AggiungiPanel.add(Aggiungi4LB);
		
		JLabel Aggiungi5LB = new JLabel("vendere:");
		Aggiungi5LB.setFont(new Font("Arial", Font.PLAIN, 12));
		Aggiungi5LB.setBounds(1, 96, 52, 14);
		AggiungiPanel.add(Aggiungi5LB);
		
		InserisciScorteTB = new JTextField();
		InserisciScorteTB.setForeground(Color.BLACK);
		InserisciScorteTB.setColumns(10);
		InserisciScorteTB.setBounds(50, 96, 76, 20);
		AggiungiPanel.add(InserisciScorteTB);
		
		
		
		FiltraPerTB = new JTextField();
		FiltraPerTB.setColumns(10);
		
		FiltraPerTB.getDocument().addDocumentListener(
                new DocumentListener() {
                    public void changedUpdate(DocumentEvent e) {
                    	newFilter(FiltraPerCB.getSelectedIndex());
                    }
                    public void insertUpdate(DocumentEvent e) {
                        newFilter(FiltraPerCB.getSelectedIndex());
                    }
                    public void removeUpdate(DocumentEvent e) {
                        newFilter(FiltraPerCB.getSelectedIndex());
                    }
                });
		
		SelezionaCategoriaCB.addItemListener(new ItemListener() {
			public void itemStateChanged (ItemEvent ie) {
				if(ie.getStateChange() == ItemEvent.SELECTED) {
					switch(SelezionaCategoriaCB.getSelectedIndex()) {
					case 0:
						TableModel = new DefaultTableModel(new String[] {"ID Prodotto", "Nome", "Provenienza", "Lotto Lavorazione", "Data Raccolta", "Valore al kg", "Scorte in kg"},0){
							 public boolean isCellEditable(int row, int column) {
							       return false; //Tabella non modificabile
							       }
							 
						};
						CBModel = new DefaultComboBoxModel<String>(new String[] {"ID Prodotto", "Nome", "Provenienza", "Lotto Lavorazione", "Data", "Valore", "Scorte (kg)"});
						FiltraPerCB.setModel(CBModel);
						ControllerV.CompletaTabellaFrutta();
						break;
					case 1: 
						TableModel = new DefaultTableModel(new String[] {"ID Prodotto", "Nome", "Provenienza", "Lotto Lavorazione", "Data Raccolta", "Valore al kg", "Scorte in kg"},0){
							 public boolean isCellEditable(int row, int column) {
							       return false; //Tabella non modificabile
							       }
						};
						CBModel = new DefaultComboBoxModel<String>(new String[] {"ID Prodotto", "Nome", "Provenienza", "Lotto Lavorazione", "Data Raccolta", "Valore", "Scorte (kg)"});
						FiltraPerCB.setModel(CBModel);
						ControllerV.CompletaTabellaVerdura();
						break;
					case 2: 
						TableModel = new DefaultTableModel(new String[] {"ID Prodotto", "Nome", "Paese Mungitura", "Paese Lavorazione", "Data Mungitura", "Data Scadenza", "Valore al kg", "Scorte in kg"},0){
							 public boolean isCellEditable(int row, int column) {
							       return false; //Tabella non modificabile
							       }
					    };
					    CBModel = new DefaultComboBoxModel<String>(new String[] {"ID Prodotto", "Nome", "Paese Mungitura", "Paese Lavorazione", "Data Mungitura", "Data Scadenza", "Valore", "Scorte (kg)"}); 
					    FiltraPerCB.setModel(CBModel);
					    ControllerV.CompletaTabellaLatticini();
						break;
					case 3:
						TableModel = new DefaultTableModel(new String[] {"ID Prodotto", "N. In Singola Confezione", "Provenienza", "Lotto Lavorazione", "Data Scadenza", "Valore unitario", "Scorte"},0){
							 public boolean isCellEditable(int row, int column) {
							       return false; //Tabella non modificabile
							 	   }
						};
						CBModel = new DefaultComboBoxModel<String>(new String[] {"ID Prodotto", "N per Confezione", "Provenienza", "Lotto Lavorazione ", "Data Scadenza ", "Valore", "Scorte (n)"});
						FiltraPerCB.setModel(CBModel);
						ControllerV.CompletaTabellaUova();
						break;
					case 4:
						TableModel = new DefaultTableModel(new String[] {"ID Prodotto", "Nome", "Lotto Lavorazione", "Data Scadenza", "Valore al kg", "Scorte in kg"},0){
							 public boolean isCellEditable(int row, int column) {
							       return false; //Tabella non modificabile
							 	   }
						};
						CBModel = new DefaultComboBoxModel<String>(new String[] {"ID Prodotto", "Nome", "Lotto Lavorazione", "Data Raccolta", "Valore", "Scorte (kg)"});
						FiltraPerCB.setModel(CBModel);
						ControllerV.CompletaTabellaFarinacei();
						break;
					case 5: 
						TableModel = new DefaultTableModel(new String[] {"ID Prodotto", "Nome", "Marca", "Lotto Lavorazione", "Data Scadenza", "Modalità Conservazione", "Peso", "Valore unitario", "Scorte"},0) {
							 public boolean isCellEditable(int row, int column) {
							       return false; //Tabella non modificabile 
							       }
						};
						CBModel = new DefaultComboBoxModel<String>(new String[] {"ID Prodotto", "Nome", "Marca", "Lotto", "Data Scadenza", "Mod. Conservazione", "Peso", "Valore", "Scorte (n)"});
						FiltraPerCB.setModel(CBModel);
						ControllerV.CompletaTabellaConfezionati();
						break;
				    }
					ProdottiTable = new JTable(TableModel);
					ProdottiTable.setFont(new Font("Arial", Font.PLAIN, 11));
					ProdottiTable.setRowSelectionAllowed(false);
					ProdottiTable.setBackground(new Color(255, 204, 153));
					ProdottiTable.setAutoCreateRowSorter(true);
					Sorter = new TableRowSorter<DefaultTableModel>(TableModel);
					ProdottiTable.setRowSorter(Sorter);
					ProdottiTable.getTableHeader().setReorderingAllowed(false);
					TabellaPanel.setViewportView(ProdottiTable);
					TabellaPanel.setVisible(true);
					
					FiltraPerCB.setSelectedIndex(0);
					FiltraPanel.add(FiltraPerCB);
					
					FiltraPanel.add(FiltraPerTB);
					
					FiltraPanel.setVisible(true);
					AggiungiPanel.setVisible(true);
				 }
			}
			
		});
		
		
		
	}
	
	public void setRigheTabellaUova(int ID_Prodotto, int NinConfezione, String Provenienza, String Lotto, Date Data, float Valore, int Scorte) {
		TableModel.addRow(new Object[]{ID_Prodotto, NinConfezione, Provenienza, Lotto, Data, Valore, Scorte});
		}
	
	public void setRigheTabellaFrutta(int ID_Prodotto, String Nome, String Provenienza, String Lotto, Date Data, float Valore, float Peso) {
		TableModel.addRow(new Object[]{ID_Prodotto, Nome, Provenienza, Lotto, Data, Valore, Peso});
		}
	
	public void setRigheTabellaConfezionati(int ID_Prodotto, String Nome, String Marca, String Lotto, Date Data, String ModConservazione, float Peso, float Valore, int Scorte ) {
		TableModel.addRow(new Object[]{ID_Prodotto, Nome, Marca, Lotto, Data, ModConservazione, Peso, Valore, Scorte});
		}
	
	public void setRigheTabellaFarinacei(int ID_Prodotto, String Nome, String Lotto, Date Data, float Valore, float Peso) {
		TableModel.addRow(new Object[]{ID_Prodotto, Nome, Lotto, Data, Valore, Peso});
		}
	
	public void setRigheTabellaLatticini(int ID_Prodotto, String Nome, String PaeseMungitura, String PaeseLavorazione, Date DataMungitura, Date DataScadenza, float Valore, float Peso) {
		TableModel.addRow(new Object[]{ID_Prodotto, Nome, PaeseMungitura, PaeseLavorazione, DataMungitura, DataScadenza, Valore, Peso});
		}
	
	public void setRigheTabellaVerdura(int ID_Prodotto, String Nome, String Provenienza, String Lotto, Date Data, float Valore, float Peso) {
		TableModel.addRow(new Object[]{ID_Prodotto, Nome, Provenienza, Lotto, Data, Valore, Peso});
		}
	
	private void newFilter(int IndiceColonna) {
	    RowFilter<DefaultTableModel, Object> rf = null;
	    try {
	        rf = RowFilter.regexFilter(FiltraPerTB.getText().toUpperCase(),IndiceColonna);
	    } catch (java.util.regex.PatternSyntaxException e) {
	        return;
	    }
	    Sorter.setRowFilter(rf);
	}
	 public String getCategoria() {
		 return SelezionaCategoriaCB.getSelectedItem().toString();
	 }
	 
	 public String getIDProdotto() {
		 return InserisciIDProdottoTF.getText();
	 }
	 
	 public String getQuantità() {
		 return InserisciScorteTB.getText();
	 }
	 
	 public void ProdottoAggiunto() {
		 ProdottoAggiuntoLB.setVisible(true);
		 
		 TimerProdottoAggiunto.start();
	 }
	 
	 public void ErroreProdottoAggiunto(String Errore) {
		 ErroreLB.setText(Errore);
		 ErroreLB.setVisible(true);
		 TimerErrore.start();
	 }
	 
	 public void DisabilitaBottoneVisualizzaCarrello() {
		 VisualizzaCarrelloButton.setVisible(false);
	 }
	 
	 public void AbilitaBottoneVisualizzaCarrello() {
		 VisualizzaCarrelloButton.setVisible(true);
	 }
}
