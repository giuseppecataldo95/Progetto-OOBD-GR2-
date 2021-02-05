package GUI.Magazzino;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Controller.ControllerMagazzino;
import Controller.ControllerPrincipale;

import javax.swing.JToolBar;
import javax.swing.RowFilter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;

import java.awt.Dimension;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Date;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JScrollPane;

public class VisualizzaFarinaceiJFrame extends JFrame {

	private JPanel VisualizzaProdottiPanel;
	private ControllerMagazzino ControllerM;
	private ControllerPrincipale ControllerP;
	private JTable ProdottiTable;
	private DefaultTableModel Model = new DefaultTableModel(new String[] {"ID Prodotto", "Nome", "Lotto Lavorazione", "Data Scadenza", "Valore al kg", "Scorte in kg"},0){
		 public boolean isCellEditable(int row, int column) {
		       return false; //Tabella non modificabile
		    }
	};
	private TableRowSorter<DefaultTableModel> Sorter;
	private JTextField FiltraPerTB;
	

	/**
	 * Create the frame.
	 */
	public VisualizzaFarinaceiJFrame(ControllerMagazzino c, ControllerPrincipale cp) {
		ControllerM = c;
		ControllerP = cp;
		setTitle("ProgettoOOBD2020");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		VisualizzaProdottiPanel = new JPanel();
		VisualizzaProdottiPanel.setBackground(new Color(255, 228, 181));
		VisualizzaProdottiPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		VisualizzaProdottiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(VisualizzaProdottiPanel);
		VisualizzaProdottiPanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		MenùLateraleTB.setBounds(0, 0, 66, 563);
		VisualizzaProdottiPanel.add(MenùLateraleTB);
		
		
		JButton ClientiButton = new JButton("");
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.VisualizzaFarinaceiMenuLateraleClientiBottonePremuto();
			}
		});
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		ClientiButton.setToolTipText("Clienti");
		ClientiButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.VisualizzaFarinaceiMenuLateraleVenditeBottonePremuto();
			}
		});
		MenùLateraleTB.add(VenditeButton);
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setToolTipText("Vendite");
		VenditeButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		
		
		JButton MagazzinoButton = new JButton("");
		MenùLateraleTB.add(MagazzinoButton);
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerP.VisualizzaFarinaceiMenuLateraleMagazzinoBottonePremuto();
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(AggiungiLatticiniJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setToolTipText("Magazzino");
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		
		Component VerticalStrut = Box.createVerticalStrut(280);
		MenùLateraleTB.add(VerticalStrut);
		VerticalStrut.setMaximumSize(new Dimension(32767, 300));
		
		JToolBar PercorsoTB = new JToolBar();
		PercorsoTB.setBorder(null);
		PercorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		PercorsoTB.setBorderPainted(false);
		PercorsoTB.setFloatable(false);
		PercorsoTB.setBackground(new Color(255, 204, 153));
		PercorsoTB.setMaximumSize(new Dimension(100, 100));
		PercorsoTB.setBounds(65, 0, 976, 30);
		VisualizzaProdottiPanel.add(PercorsoTB);
		
		JButton MagazzinoPercorsoButton = new JButton("> Magazzino");
		MagazzinoPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VisualizzaFarinacei_MagazzinoPercorsoBottonePremuto();
			}
		});
		MagazzinoPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(MagazzinoPercorsoButton);
		
		JButton VisualizzaProdottiPercorsoButton = new JButton("> Visualizza Prodotti");
		VisualizzaProdottiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VisualizzaFarinacei_VisualizzaProdottoPercorsoBottonePremuto();
			}
		});
		VisualizzaProdottiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VisualizzaProdottiPercorsoButton);
		
		JButton VisualizzaFarinaceiPercorsoButton = new JButton("> Visualizza Farinacei");
		VisualizzaFarinaceiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VisualizzaFarinacei_VisualizzaFarinaceiPercorsoBottonePremuto();
				ControllerM.CompletaTabellaFarinacei();
			}
		});
		VisualizzaFarinaceiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VisualizzaFarinaceiPercorsoButton);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VisualizzaFarinaceiBottoneIndietroPremuto();
			}
		});
		IndietroButton.setFont(new Font("Arial", Font.PLAIN, 11));
		IndietroButton.setBounds(852, 521, 110, 31);
		VisualizzaProdottiPanel.add(IndietroButton);
		
		JScrollPane TabellaPanel = new JScrollPane();
		TabellaPanel.setBounds(95, 85, 789, 419);
		VisualizzaProdottiPanel.add(TabellaPanel);
		ProdottiTable = new JTable(Model);
		ProdottiTable.setFont(new Font("Arial", Font.PLAIN, 11));
		Sorter = new TableRowSorter<DefaultTableModel>(Model);
		ProdottiTable.setRowSelectionAllowed(false);
		ProdottiTable.setBackground(new Color(255, 204, 153));
		ProdottiTable.setAutoCreateRowSorter(true);
		ProdottiTable.setRowSorter(Sorter);
		ProdottiTable.getTableHeader().setReorderingAllowed(false);
		TabellaPanel.setViewportView(ProdottiTable);
		
		FiltraPerTB = new JTextField();
		FiltraPerTB.setBounds(412, 41, 256, 20);
		VisualizzaProdottiPanel.add(FiltraPerTB);
		FiltraPerTB.setColumns(10);
		
		JComboBox FiltraPerCB = new JComboBox();
		FiltraPerCB.setModel(new DefaultComboBoxModel(new String[] {"ID Prodotto", "Nome", "Lotto Lavorazione", "Data Raccolta", "Valore", "Scorte (kg)"}));
		FiltraPerCB.setSelectedIndex(0);
		FiltraPerCB.setBounds(283, 40, 119, 22);
		VisualizzaProdottiPanel.add(FiltraPerCB);
		
		JLabel FiltraPerLB = new JLabel("Filtra per:");
		FiltraPerLB.setFont(new Font("Arial", Font.PLAIN, 13));
		FiltraPerLB.setBounds(219, 41, 65, 20);
		VisualizzaProdottiPanel.add(FiltraPerLB);
		
		JButton EliminaButton = new JButton("Elimina");
		EliminaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.VisualizzaFarinaceiEliminaBottonePremuto();
			}
		});
		EliminaButton.setFont(new Font("Arial", Font.PLAIN, 11));
		EliminaButton.setBounds(894, 82, 82, 30);
		VisualizzaProdottiPanel.add(EliminaButton);
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
	
	public void setRigheTabella(int ID_Prodotto, String Nome, String Lotto, Date Data, float Valore, float Peso) {
		Model.addRow(new Object[]{ID_Prodotto, Nome, Lotto, Data, Valore, Peso});
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
