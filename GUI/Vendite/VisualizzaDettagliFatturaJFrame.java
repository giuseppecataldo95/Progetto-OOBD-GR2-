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

public class VisualizzaDettagliFatturaJFrame extends JFrame {

	private JPanel VisualizzaFatturePanel;
	private ControllerVendite ControllerV;
	private ControllerPrincipale ControllerP;
	private JTable Table;
	private TableRowSorter<DefaultTableModel> Sorter;
	private JTextField FilterText;
	private static DefaultTableModel Model = new DefaultTableModel(new String[] { "Punti Frutta", "Punti Verdura", "Punti Confezionati", "Punti Farinacei", "Punti Uova", "Punti Latticini", },0) {
		 public boolean isCellEditable(int row, int column) {
		       return false; //Tabella non modificabile
		    }
	};


	public VisualizzaDettagliFatturaJFrame(ControllerVendite c, ControllerPrincipale c1) {
		ControllerV = c;
		ControllerP = c1;
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		setTitle("ProgettoOOBD2020");
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
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon(VisualizzaDettagliFatturaJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ControllerP.VisualizzaDettagliFatturaMenùLateraleClientiBottonePremuto();
				
			}
		});
		
		JButton VenditeButton = new JButton("");
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(VisualizzaDettagliFatturaJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(VenditeButton);
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ControllerP.VisualizzaDettagliFatturaMenùLateraleVenditeBottonePremuto();
				
			}
		});
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(VisualizzaDettagliFatturaJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
		MagazzinoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(MagazzinoButton);
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ControllerP.VisualizzaDettagliFatturaMenùLateraleMagazzinoBottonePremuto();
				
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
				
				ControllerV.VisualizzaDettagliFatturaVenditePercorsoBottonePremuto();
				
			}
		});
		VenditePercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VenditePercorsoButton);
		
		JButton VisualizzaVenditePercorsoButton = new JButton("> Visualizza Vendite");
		VisualizzaVenditePercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ControllerV.VisualizzaDettagliFatturaVisualizzaFatturePercorsoBottonePremuto();
				
				
			}
		});
		VisualizzaVenditePercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VisualizzaVenditePercorsoButton);
		
		JButton VisualizzaDettagliPercorsoButton = new JButton("> Visualizza Dettagli Fattura");
		VisualizzaDettagliPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerV.VisualizzaDettagliFatturaVisualizzaDettagliPercorsoBottonePremuto();
				
			}
		});
		VisualizzaDettagliPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VisualizzaDettagliPercorsoButton);
		
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
		
		JLabel PuntiLB = new JLabel("Ecco l'elenco dei punti associati alla Fattura Ricercata");
		PuntiLB.setHorizontalAlignment(SwingConstants.CENTER);
		PuntiLB.setFont(new Font("Arial", Font.BOLD, 14));
		PuntiLB.setBounds(284, 55, 416, 30);
		VisualizzaFatturePanel.add(PuntiLB);


	}
	
	
	
	public void setRigheTabella(float PuntiFrutta, float PuntiVerdura, float PuntiConfezionati, float PuntiFarinacei, float PuntiUova, float PuntiLatticini){
		Model.addRow(new Object[] {PuntiFrutta, PuntiVerdura, PuntiConfezionati, PuntiFarinacei, PuntiUova, PuntiLatticini});
		
		}
	
	
}
