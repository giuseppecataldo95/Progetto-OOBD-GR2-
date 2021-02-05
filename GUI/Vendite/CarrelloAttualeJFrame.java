package GUI.Vendite;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import Controller.ControllerCliente;
import Controller.ControllerPrincipale;
import Controller.ControllerVendite;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;

public class CarrelloAttualeJFrame extends JFrame {

	private JPanel VenditePanel;
	private ControllerVendite ControllerV;
	private DefaultTableModel ModelKG = new DefaultTableModel(new String[] {"ID Prodotto", "Quantità (kg)"},0)
	{
		 public boolean isCellEditable(int row, int column) {
		       return false; //Tabella non modificabile
		    }
		 
	};
	
	private DefaultTableModel ModelN = new DefaultTableModel(new String[] {"ID Prodotto", "Quantità (n)"},0)
	{
		 public boolean isCellEditable(int row, int column) {
		       return false; //Tabella non modificabile
		    }
		 
	};
	private JTable ProdottiKGTable;
	private JTable ProdottiNTable;
	private JLabel PrezzoParzialeLB;
	private JLabel PuntiParzialiLB;

	
	
	
	public  CarrelloAttualeJFrame(ControllerVendite CV) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ControllerV = CV;
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setBounds(150, 80, 500, 532);
		setResizable(false);
		VenditePanel = new JPanel();
		VenditePanel.setBackground(new Color(255, 222, 173));
		VenditePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		VenditePanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(VenditePanel);
		VenditePanel.setLayout(null);
		
		JLabel PrezzoLB = new JLabel("Prezzo :");
		PrezzoLB.setFont(new Font("Arial", Font.PLAIN, 13));
		PrezzoLB.setBounds(342, 385, 54, 14);
		VenditePanel.add(PrezzoLB);
		
		JLabel PuntiLB = new JLabel("Punti :");
		PuntiLB.setFont(new Font("Arial", Font.PLAIN, 13));
		PuntiLB.setBounds(352, 410, 47, 14);
		VenditePanel.add(PuntiLB);
		
		JScrollPane TabellaKGPanel = new JScrollPane();
		TabellaKGPanel.setBounds(0, 0, 486, 187);
		TabellaKGPanel.setBackground(new Color(255, 222, 173));
		TabellaKGPanel.setBorder(null);
		VenditePanel.add(TabellaKGPanel);
		
		ProdottiKGTable = new JTable(ModelKG);
		ProdottiKGTable.setFont(new Font("Arial", Font.PLAIN, 11));
		ProdottiKGTable.setRowSelectionAllowed(false);
		ProdottiKGTable.setBackground(new Color(255, 204, 153));
		ProdottiKGTable.setAutoCreateRowSorter(true);
		ProdottiKGTable.getTableHeader().setReorderingAllowed(false);
		TabellaKGPanel.setViewportView(ProdottiKGTable);
		
		JScrollPane TabellaNPanel = new JScrollPane();
		TabellaNPanel.setBounds(0, 187, 486, 187);
		TabellaNPanel.setBackground(new Color(255, 222, 173));
		TabellaNPanel.setBorder(null);
		VenditePanel.add(TabellaNPanel);
		
		ProdottiNTable = new JTable(ModelN);
		ProdottiNTable.setFont(new Font("Arial", Font.PLAIN, 11));
		ProdottiNTable.setRowSelectionAllowed(false);
		ProdottiNTable.setBackground(new Color(255, 204, 153));
		ProdottiNTable.setAutoCreateRowSorter(true);
		ProdottiNTable.getTableHeader().setReorderingAllowed(false);
		TabellaNPanel.setViewportView(ProdottiNTable);
		
		JButton AggiornaButton = new JButton("Aggiorna");
		AggiornaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerV.CarrelloAttualeAggiornaBottonePremuto();
				ControllerV.CompletaTabellaCarrelloKG();
				ControllerV.CompletaTabellaCarrelloN();
				ControllerV.setPuntiEPrezzo();
			}
		});
		AggiornaButton.setBounds(248, 461, 89, 23);
		VenditePanel.add(AggiornaButton);
		
		JButton FatturaButton = new JButton("Genera Fattura");
		FatturaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerV.CarrelloAttualeGeneraFatturaBottonePremuto();
			}
		});
		FatturaButton.setBounds(342, 461, 138, 23);
		VenditePanel.add(FatturaButton);
		
		PrezzoParzialeLB = new JLabel("");
		PrezzoParzialeLB.setFont(new Font("Arial", Font.BOLD, 13));
		PrezzoParzialeLB.setBounds(406, 385, 54, 14);
		VenditePanel.add(PrezzoParzialeLB);
		
		PuntiParzialiLB = new JLabel("");
		PuntiParzialiLB.setFont(new Font("Arial", Font.BOLD, 13));
		PuntiParzialiLB.setBounds(406, 410, 54, 14);
		VenditePanel.add(PuntiParzialiLB);
	}
	
	public void setRigheTabellaKG(int ID_Prodotto, float Quantità) {
		ModelKG.addRow(new Object[]{ID_Prodotto, Quantità});
		}
	
	public void setRigheTabellaN(int ID_Prodotto, int Quantità) {
		ModelN.addRow(new Object[]{ID_Prodotto, Quantità});
		}
	
	public void setPuntiParziali(float Punti) {
		PuntiParzialiLB.setText(String.valueOf(Punti));
	}
	
	public void setPrezzoParziale(float Prezzo) {
		PrezzoParzialeLB.setText(String.valueOf(Prezzo)+"€");
	}
}
