package GUI.Cliente;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Controller.ControllerCliente;
import Controller.ControllerPrincipale;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class VisualizzaClientiJFrame extends JFrame {

	private JPanel VisualizzaClientiPanel;
	
	private JTable Table;
	private TableRowSorter<DefaultTableModel> Sorter;
	private JTextField FilterText;
	private JTextField FiltraPerTB;
	private DefaultTableModel Model = new DefaultTableModel(new String[] { "Numero Tessera", "Nome", "Cognome", "Codice Fiscale", "PuntiTotali", "Data di Rilascio", "Data di Scadenza"},0) {
		 public boolean isCellEditable(int row, int column) {
		       return false; //Tabella non modificabile
		    }
	};
	private ControllerCliente ControllerC;
	private ControllerPrincipale ControllerP;


	public VisualizzaClientiJFrame(ControllerCliente c, ControllerPrincipale c1) {
		ControllerC = c;
		ControllerP = c1;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		VisualizzaClientiPanel = new JPanel();
		VisualizzaClientiPanel.setBackground(new Color(255, 228, 181));
		VisualizzaClientiPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		VisualizzaClientiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(VisualizzaClientiPanel);
		VisualizzaClientiPanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 0, 65, 563);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		VisualizzaClientiPanel.add(MenùLateraleTB);
		
		JButton ClientiButton = new JButton("");
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		ClientiButton.setToolTipText("Clienti");
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon(VisualizzaClientiJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.VisualizzaClientiMenuLateraleClientiBottonePremuto();
				
			}
		});
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.VisualizzaClientiMenùLateraleVenditeBottonePremuto();
				
			}
		});
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setToolTipText("Vendite");
		VenditeButton.setIcon(new ImageIcon(VisualizzaClientiJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(VenditeButton);
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.VisualizzaClientiMenuLateraleMagazzinoBottonePremuto();
				
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(VisualizzaClientiJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setToolTipText("Magazzin");
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(MagazzinoButton);
		
		Component VerticalStrut = Box.createVerticalStrut(280);
		MenùLateraleTB.add(VerticalStrut);
		
		JToolBar PercorsoTB = new JToolBar();
		PercorsoTB.setBorder(null);
		PercorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		PercorsoTB.setBorderPainted(false);
		PercorsoTB.setFloatable(false);
		PercorsoTB.setBackground(new Color(255, 204, 153));
		PercorsoTB.setMaximumSize(new Dimension(100, 100));
		PercorsoTB.setBounds(65, 0, 976, 30);
		VisualizzaClientiPanel.add(PercorsoTB);
		
		JButton ClientiPercorsoButton = new JButton("> Clienti");
		ClientiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerC.VisualizzaClientiClientiPercorsoBottonePremuto();
				
			}
		});
		ClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(ClientiPercorsoButton);
		
		JButton VisualizzaClientiPercorsoButton = new JButton("> Visualizza Clienti");
		VisualizzaClientiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ControllerC.VisualizzaClientiVisualizzaClientiPercorsoBottonePremuto();
				ControllerC.CompletaTabellaTessera();
			}
		});
		VisualizzaClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VisualizzaClientiPercorsoButton);
		
		JScrollPane ScrollPane = new JScrollPane();
		ScrollPane.setBounds(91, 125, 770, 367);
		VisualizzaClientiPanel.add(ScrollPane);
		Table = new JTable(Model);
		Table.setFont(new Font("Arial", Font.PLAIN, 11));
		Sorter = new TableRowSorter<DefaultTableModel>(Model);
		Table.setRowSelectionAllowed(false);
		Table.setBackground(new Color(255, 204, 153));
		Table.setAutoCreateRowSorter(true);
		Table.setRowSorter(Sorter);
		Table.getTableHeader().setReorderingAllowed(false);
		ScrollPane.setViewportView(Table);
		
		JToolBar OperazioniSuTesseraTB = new JToolBar();
		OperazioniSuTesseraTB.setRollover(true);
		OperazioniSuTesseraTB.setFloatable(false);
		OperazioniSuTesseraTB.setBackground(new Color(255, 140, 0));
		OperazioniSuTesseraTB.setOrientation(SwingConstants.VERTICAL);
		OperazioniSuTesseraTB.setBounds(871, 125, 105, 118);
		VisualizzaClientiPanel.add(OperazioniSuTesseraTB);
		
		JButton VisualizzaDettagliClienteJButton = new JButton("Dettagli Cliente");
		VisualizzaDettagliClienteJButton.setBackground(new Color(255, 140, 0));
		VisualizzaDettagliClienteJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerC.ApriDettagliClienteJDialog();
				
				
			}
		});
		
		JButton EliminaTesseraJButton = new JButton("Elimina Tessera");
		OperazioniSuTesseraTB.add(EliminaTesseraJButton);
		EliminaTesseraJButton.setBackground(new Color(255, 140, 0));
		EliminaTesseraJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerC.ApriEliminaTesseraByNTessera();
				
			}
		});
		EliminaTesseraJButton.setFont(new Font("Arial", Font.PLAIN, 11));
		
		Component VerticalStrut_1 = Box.createVerticalStrut(20);
		OperazioniSuTesseraTB.add(VerticalStrut_1);
		VisualizzaDettagliClienteJButton.setFont(new Font("Arial", Font.PLAIN, 11));
		OperazioniSuTesseraTB.add(VisualizzaDettagliClienteJButton);
		
		JButton VisualizzaPuntiPerClienteJButton = new JButton("Visualizza Punti");
		VisualizzaPuntiPerClienteJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ControllerC.VisualizzaClientiVisualizzaPuntiBottonePremuto();
				ControllerC.CompletaTabellaPunti();
			}
		});
		
		Component VerticalStrut_2 = Box.createVerticalStrut(20);
		OperazioniSuTesseraTB.add(VerticalStrut_2);
		VisualizzaPuntiPerClienteJButton.setFont(new Font("Arial", Font.PLAIN, 11));
		VisualizzaPuntiPerClienteJButton.setBackground(new Color(255, 140, 0));
		OperazioniSuTesseraTB.add(VisualizzaPuntiPerClienteJButton);
		
		FiltraPerTB = new JTextField();
		FiltraPerTB.setBounds(412, 41, 256, 20);
		VisualizzaClientiPanel.add(FiltraPerTB);
		FiltraPerTB.setColumns(10);
		
		JComboBox FiltraPerCB = new JComboBox();
		FiltraPerCB.setModel(new DefaultComboBoxModel(new String[] {"Numero Tessera", "Nome", "Cognome", "Codice Fiscale", "Punti Totali", "Data Rilascio", "Data Scadenza"}));
		FiltraPerCB.setSelectedIndex(0);
		FiltraPerCB.setBounds(271, 40, 131, 22);
		VisualizzaClientiPanel.add(FiltraPerCB);
		
		
		JLabel FiltraPerLB = new JLabel("Filtra per:");
		FiltraPerLB.setFont(new Font("Arial", Font.PLAIN, 13));
		FiltraPerLB.setBounds(207, 41, 65, 20);
		VisualizzaClientiPanel.add(FiltraPerLB);
		FiltraPerCB.addItemListener(new ItemListener() {
			public void itemStateChanged (ItemEvent ie) {
				if(ie.getStateChange() == ItemEvent.SELECTED) {
				      FiltraPerTB.setText("");
				   }
			}
			
		});
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


	}
	
	
	
	public void setRigheTabella(int NTessera, String Nome,String Cognome,String CF, float PuntiTotali, Date DataRilascio, Date DataScadenza ){
		Model.addRow(new Object[] {NTessera, Nome, Cognome, CF, PuntiTotali, DataRilascio, DataScadenza});
		
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
}
