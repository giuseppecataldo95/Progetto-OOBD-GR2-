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

public class VisualizzaPuntiJFrame extends JFrame {

	private JPanel VisualizzaPuntiPanel;
	ControllerCliente controller;
	ControllerPrincipale ControllerP;
	private JTable table;
	private TableRowSorter<DefaultTableModel> sorter;
	private JTextField filterText;
	private DefaultTableModel Model = new DefaultTableModel(new String[] { "Numero Tessera", "Codice Fiscale", "Punti Frutta", "Punti Verdura", "Punti Confezionati", "Punti Uova", "Punti Latticini", "Punti Farinacei"},0) {
		 public boolean isCellEditable(int row, int column) {
		       return false; //Tabella non modificabile
		    }
	};


	public VisualizzaPuntiJFrame(ControllerCliente c, ControllerPrincipale c1) {
		controller = c;
		ControllerP = c1;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		VisualizzaPuntiPanel = new JPanel();
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
		
		Component verticalStrut = Box.createVerticalStrut(280);
		MenùLateraleTB.add(verticalStrut);
		
		JButton InfoButton = new JButton("");
		InfoButton.setBackground(new Color(255, 153, 51));
		InfoButton.setIcon(new ImageIcon(VisualizzaPuntiJFrame.class.getResource("/Risorse/info-menu.png")));
		InfoButton.setBorder(null);
		InfoButton.setBorderPainted(false);
		InfoButton.setMaximumSize(new Dimension(65, 70));
		MenùLateraleTB.add(InfoButton);
		
		JToolBar percorsoTB = new JToolBar();
		percorsoTB.setBorder(null);
		percorsoTB.setAlignmentX(Component.LEFT_ALIGNMENT);
		percorsoTB.setBorderPainted(false);
		percorsoTB.setFloatable(false);
		percorsoTB.setBackground(new Color(255, 204, 153));
		percorsoTB.setMaximumSize(new Dimension(100, 100));
		percorsoTB.setBounds(65, 0, 976, 30);
		VisualizzaPuntiPanel.add(percorsoTB);
		
		JButton ClientiPercorsoButton = new JButton("> Clienti");
		ClientiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controller.VisualizzaPuntiClientiPercorsoButtonPressed();
				
			}
		});
		ClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(ClientiPercorsoButton);
		
		JButton VisualizzaClientiPercorsoButton = new JButton("> Visualizza Clienti");
		VisualizzaClientiPercorsoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controller.VisualizzaPuntiVisualizzaClientiPercorsoButtonPressed();
				controller.CompletaTabellaTessera();
			}
		});
		VisualizzaClientiPercorsoButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(VisualizzaClientiPercorsoButton);
		
		JButton VisualizzaPuntiJButton = new JButton("> Visualizza Punti");
		VisualizzaPuntiJButton.setFont(new Font("Arial", Font.PLAIN, 11));
		percorsoTB.add(VisualizzaPuntiJButton);
		VisualizzaPuntiJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controller.VisualizzaPuntiVisualizzaPuntiPercorsoButtonPressed();
				controller.CompletaTabellaPunti();
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(91, 125, 770, 367);
		VisualizzaPuntiPanel.add(scrollPane);
		table = new JTable(Model);
		table.setFont(new Font("Arial", Font.PLAIN, 11));
		sorter = new TableRowSorter<DefaultTableModel>(Model);
		table.setRowSelectionAllowed(false);
		table.setBackground(new Color(255, 204, 153));
		table.setAutoCreateRowSorter(true);
		table.setRowSorter(sorter);
		table.getTableHeader().setReorderingAllowed(false);
		scrollPane.setViewportView(table);
		
		
		
		
		filterText = new JTextField();
		filterText.setBounds(200, 73, 391, 20);
		VisualizzaPuntiPanel.add(filterText);
		filterText.setColumns(10);
		filterText.getDocument().addDocumentListener(
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
	
	public void setRigheTabella(int NTessera, String CF, int PuntiFrutta, int PuntiVerdura, int PuntiConfezionati, int PuntiUova, int PuntiFarinacei, int PuntiLatticini ){
		Model.addRow(new Object[] {NTessera, CF, PuntiFrutta, PuntiVerdura, PuntiConfezionati, PuntiUova, PuntiFarinacei, PuntiLatticini});
		
		}
	
	private void newFilter() {
	    RowFilter<DefaultTableModel, Object> rf = null;
	    try {
	        rf = RowFilter.regexFilter(filterText.getText().toUpperCase(),0);
	    } catch (java.util.regex.PatternSyntaxException e) {
	        return;
	    }
	    sorter.setRowFilter(rf);
	}
}
