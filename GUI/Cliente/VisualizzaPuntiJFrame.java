package GUI.Cliente;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
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
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class VisualizzaPuntiJFrame extends JFrame {

	private JPanel VisualizzaPuntiPanel;
	private JTable Table;
	private TableRowSorter<DefaultTableModel> Sorter;
	private JTextField FilterText;
	private DefaultTableModel Model = new DefaultTableModel(new String[] { "Numero Tessera", "Codice Fiscale", "Punti Frutta", "Punti Verdura", "Punti Confezionati", "Punti Uova", "Punti Latticini", "Punti Farinacei"},0) {
		 public boolean isCellEditable(int row, int column) {
		       return false; //Tabella non modificabile
		    }
	};
	private ControllerCliente ControllerC;
	private ControllerPrincipale ControllerP;

	public VisualizzaPuntiJFrame(ControllerCliente c, ControllerPrincipale c1) {
		ControllerC = c;
		ControllerP = c1;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		VisualizzaPuntiPanel = new JPanel();
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		VisualizzaPuntiPanel.setBackground(new Color(255, 228, 181));
		VisualizzaPuntiPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		VisualizzaPuntiPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(VisualizzaPuntiPanel);
		VisualizzaPuntiPanel.setLayout(null);
		
		JToolBar MenùLateraleTB = new JToolBar();
		MenùLateraleTB.setBorder(null);
		MenùLateraleTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		MenùLateraleTB.setBorderPainted(false);
		MenùLateraleTB.setFloatable(false);
		MenùLateraleTB.setBackground(new Color(255, 153, 51));
		MenùLateraleTB.setMaximumSize(new Dimension(100, 100));
		MenùLateraleTB.setBounds(0, 0, 65, 563);
		MenùLateraleTB.setOrientation(SwingConstants.VERTICAL);
		VisualizzaPuntiPanel.add(MenùLateraleTB);
		
		JButton ClientiButton = new JButton("");
		ClientiButton.setBackground(new Color(255, 153, 51));
		ClientiButton.setBorderPainted(false);
		ClientiButton.setBorder(null);
		MenùLateraleTB.add(ClientiButton);
		ClientiButton.setIcon(new ImageIcon(VisualizzaPuntiJFrame.class.getResource("/Risorse/cliente.png")));
		ClientiButton.setMaximumSize(new Dimension(65, 70));
		ClientiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.VisualizzaPuntiMenuLateraleClientiBottonePremuto();
				
			}
		});
		
		JButton VenditeButton = new JButton("");
		VenditeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.VisualizzaPuntiMenùLateraleVenditeBottonePremuto();
				
			}
		});
		VenditeButton.setBackground(new Color(255, 153, 51));
		VenditeButton.setBorder(null);
		VenditeButton.setBorderPainted(false);
		VenditeButton.setIcon(new ImageIcon(VisualizzaPuntiJFrame.class.getResource("/Risorse/vendite-menu.png")));
		VenditeButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(VenditeButton);
		
		JButton MagazzinoButton = new JButton("");
		MagazzinoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerP.VisualizzaPuntiMenuLateraleMagazzinoBottonePremuto();
				
			}
		});
		MagazzinoButton.setBackground(new Color(255, 153, 51));
		MagazzinoButton.setIcon(new ImageIcon(VisualizzaPuntiJFrame.class.getResource("/Risorse/magazzino.png")));
		MagazzinoButton.setBorderPainted(false);
		MagazzinoButton.setBorder(null);
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
		VisualizzaPuntiPanel.add(PercorsoTB);
		
		JButton ClientiPercorsoButton = new JButton("> Clienti");
		ClientiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerC.VisualizzaPuntiClientiPercorsoBottonePremuto();
				
			}
		});
		ClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(ClientiPercorsoButton);
		
		JButton VisualizzaClientiPercorsoButton = new JButton("> Visualizza Clienti");
		VisualizzaClientiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerC.VisualizzaPuntiVisualizzaClientiPercorsoBottonePremuto();
				ControllerC.CompletaTabellaTessera();
			}
		});
		VisualizzaClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VisualizzaClientiPercorsoButton);
		
		JButton VisualizzaPuntiJButton = new JButton("> Visualizza Punti");
		VisualizzaPuntiJButton.setFont(new Font("Arial", Font.PLAIN, 11));
		PercorsoTB.add(VisualizzaPuntiJButton);
		VisualizzaPuntiJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerC.VisualizzaPuntiVisualizzaPuntiPercorsoBottonePremuto();
				ControllerC.CompletaTabellaPunti();
			}
		});
		
		JScrollPane ScrollPane = new JScrollPane();
		ScrollPane.setBounds(91, 125, 770, 367);
		VisualizzaPuntiPanel.add(ScrollPane);
		Table = new JTable(Model);
		Table.setFont(new Font("Arial", Font.PLAIN, 11));
		Sorter = new TableRowSorter<DefaultTableModel>(Model);
		Table.setRowSelectionAllowed(false);
		Table.setBackground(new Color(255, 204, 153));
		Table.setAutoCreateRowSorter(true);
		Table.setRowSorter(Sorter);
		Table.getTableHeader().setReorderingAllowed(false);
		ScrollPane.setViewportView(Table);
		
		FilterText = new JTextField();
		FilterText.setBounds(269, 73, 157, 20);
		VisualizzaPuntiPanel.add(FilterText);
		FilterText.setColumns(10);
		
		JLabel CercaLB = new JLabel("Cerca per n\u00B0 Tessera : ");
		CercaLB.setFont(new Font("Arial", Font.PLAIN, 12));
		CercaLB.setHorizontalAlignment(SwingConstants.CENTER);
		CercaLB.setBounds(126, 76, 140, 13);
		VisualizzaPuntiPanel.add(CercaLB);
		FilterText.getDocument().addDocumentListener(
                new DocumentListener() {
                    public void changedUpdate(DocumentEvent e) {
                        newFilter();
                    }
                    public void insertUpdate(DocumentEvent e) {
                        newFilter();
                    }
                    public void removeUpdate(DocumentEvent e) {
                        newFilter();
                    }
                });
		
	}
	
	public void setRigheTabella(int NTessera, String CF, float PuntiFrutta, float PuntiVerdura, float PuntiConfezionati, float PuntiUova, float PuntiFarinacei, float PuntiLatticini ){
		Model.addRow(new Object[] {NTessera, CF, PuntiFrutta, PuntiVerdura, PuntiConfezionati, PuntiUova, PuntiFarinacei, PuntiLatticini});
		
		}
	
	private void newFilter() {
	    RowFilter<DefaultTableModel, Object> rf = null;
	    try {
	        rf = RowFilter.regexFilter(FilterText.getText().toUpperCase(),0);
	    } catch (java.util.regex.PatternSyntaxException e) {
	        return;
	    }
	    Sorter.setRowFilter(rf);
	}
}
