package GUI.Vendite;

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
import Controller.ControllerVendite;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Date;
import java.awt.event.ActionEvent;

public class VisualizzaFattureJFrame extends JFrame {

	private JPanel VisualizzaFatturePanel;
	private ControllerVendite ControllerV;
	private ControllerPrincipale ControllerP;
	private JTable Table;
	private TableRowSorter<DefaultTableModel> Sorter;
	private JTextField FilterText;
	private JTextField FiltraPerTF;
	private static DefaultTableModel Model = new DefaultTableModel(new String[] { "Numero Tessera", "ID Fattura", "Prezzo Totale", "PuntiTotali", "Data di Emissione"},0) {
		 public boolean isCellEditable(int row, int column) {
		       return false; //Tabella non modificabile
		    }
	};


	public VisualizzaFattureJFrame(ControllerVendite c, ControllerPrincipale c1) {
		ControllerV = c;
		ControllerP = c1;
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		VisualizzaFatturePanel = new JPanel();
		VisualizzaFatturePanel.setBackground(new Color(255, 228, 181));
		VisualizzaFatturePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		VisualizzaFatturePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(VisualizzaFatturePanel);
		VisualizzaFatturePanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 0, 65, 563);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		VisualizzaFatturePanel.add(MenùLateraleTB);
		
		JButton ClientiButton = new JButton("");
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		ClientiButton.setToolTipText("Clienti");
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon(VisualizzaFattureJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ControllerP.VisualizzaFattureMenùLateraleClientiBottonePremuto();
				
			}
		});
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.VisualizzaFattureMenùLateraleVenditeBottonePremuto();
				
			}
		});
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setToolTipText("Vendite");
		VenditeButton.setIcon(new ImageIcon(VisualizzaFattureJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(VenditeButton);
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ControllerP.VisualizzaFattureMenùLateraleVenditeBottonePremuto();
				
			}
		});
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(VisualizzaFattureJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setToolTipText("Magazzino");
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(MagazzinoButton);
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ControllerP.VisualizzaFattureMenùLateraleMagazzinoBottonePremuto();
				
			}
		});
		
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
		VisualizzaFatturePanel.add(PercorsoTB);
		
		JButton VenditePercorsoButton = new JButton("> Vendite");
		VenditePercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerV.VisualizzaFatturePercorsoVenditeBottonePremuto();
				
			}
		});
		VenditePercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VenditePercorsoButton);
		
		JButton VisualizzaVenditePercorsoButton = new JButton("> Visualizza Vendite");
		VisualizzaVenditePercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerV.VisualizzaFatturePercorsoVisualizzaVenditeBottonePremuto();
				
				
			}
		});
		VisualizzaVenditePercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VisualizzaVenditePercorsoButton);
		
		JScrollPane ScrollPane = new JScrollPane();
		ScrollPane.setBounds(97, 125, 722, 367);
		VisualizzaFatturePanel.add(ScrollPane);
		Table = new JTable(Model);
		Table.setFont(new Font("Arial", Font.PLAIN, 11));
		Sorter = new TableRowSorter<DefaultTableModel>(Model);
		Table.setRowSelectionAllowed(false);
		Table.setBackground(new Color(255, 204, 153));
		Table.setAutoCreateRowSorter(true);
		Table.setRowSorter(Sorter);
		Table.getTableHeader().setReorderingAllowed(false);
		ScrollPane.setViewportView(Table);
		
		FiltraPerTF = new JTextField();
		FiltraPerTF.setBounds(412, 41, 256, 20);
		VisualizzaFatturePanel.add(FiltraPerTF);
		FiltraPerTF.setColumns(10);
		
		JComboBox FiltraPerCB = new JComboBox();
		FiltraPerCB.setModel(new DefaultComboBoxModel(new String[] {"Numero Tessera","ID Fattura", "Prezzo Totale", "PuntiTotali", "Data di Emissione"}));
		FiltraPerCB.setSelectedIndex(0);	
		FiltraPerCB.setBounds(271, 40, 131, 22);
		VisualizzaFatturePanel.add(FiltraPerCB);
		
		
		JLabel FiltraPerLB = new JLabel("Filtra per:");
		FiltraPerLB.setFont(new Font("Arial", Font.PLAIN, 13));
		FiltraPerLB.setBounds(207, 41, 65, 20);
		VisualizzaFatturePanel.add(FiltraPerLB);
		
		JButton DettagliClienteJButton = new JButton("Dettagli Carrello");
		DettagliClienteJButton.setBounds(858, 125, 118, 35);
		VisualizzaFatturePanel.add(DettagliClienteJButton);
		DettagliClienteJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerV.VisualizzaFattureDettagliCarrelloBottonePremuto();

			}
		});
		DettagliClienteJButton.setFont(new Font("Arial", Font.PLAIN, 11));
		DettagliClienteJButton.setBackground(new Color(255, 140, 0));
		FiltraPerCB.addItemListener(new ItemListener() {
			public void itemStateChanged (ItemEvent ie) {
				if(ie.getStateChange() == ItemEvent.SELECTED) {
				      FiltraPerTF.setText("");
				   }
			}
			
		});
		FiltraPerTF.getDocument().addDocumentListener(
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
	
	
	
	public void setRigheTabella(int NTessera, int IDFattura, float PrezzoTotale, float PuntiTotali, Date DataEmissione){
		Model.addRow(new Object[] {NTessera, IDFattura, PrezzoTotale, PuntiTotali, DataEmissione});
		
		}
	
	private void newFilter(int IndiceColonna) {
	    RowFilter<DefaultTableModel, Object> rf = null;
	    try {
	        rf = RowFilter.regexFilter(FiltraPerTF.getText().toUpperCase(),IndiceColonna);
	    } catch (java.util.regex.PatternSyntaxException e) {
	        return;
	    }
	    Sorter.setRowFilter(rf);
	}
	
	public void PulisciDatiTabella() {
		
		int count = Model.getRowCount();
		if(Model.getRowCount()>0) {
			for(int i=0; i < count; i++) {
				Model.removeRow(0);
			}
		}
	}
}