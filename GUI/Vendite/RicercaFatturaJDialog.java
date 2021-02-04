package GUI.Vendite;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerVendite;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RicercaFatturaJDialog extends JDialog {

	private final JPanel RicercaFatturaPanel = new JPanel();
	private JTextField IDFatturaTB;
	private ControllerVendite ControllerV;
	
	
	


	public RicercaFatturaJDialog(ControllerVendite cv) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		ControllerV = cv;
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setBounds(100, 100, 306, 211);
		getContentPane().setLayout(new BorderLayout());
		RicercaFatturaPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(RicercaFatturaPanel, BorderLayout.CENTER);
		RicercaFatturaPanel.setLayout(null);
		
		JLabel InserisciIDFatturaLB1 = new JLabel("Inserisci L' ID Fattura");
		InserisciIDFatturaLB1.setHorizontalAlignment(SwingConstants.CENTER);
		InserisciIDFatturaLB1.setFont(new Font("Arial", Font.BOLD, 12));
		InserisciIDFatturaLB1.setBounds(3, 26, 286, 33);
		RicercaFatturaPanel.add(InserisciIDFatturaLB1);
		
		JLabel InserisciIDFatturaLB2 = new JLabel("ID Fattura : ");
		InserisciIDFatturaLB2.setFont(new Font("Arial", Font.PLAIN, 12));
		InserisciIDFatturaLB2.setHorizontalAlignment(SwingConstants.CENTER);
		InserisciIDFatturaLB2.setBounds(80, 87, 79, 22);
		RicercaFatturaPanel.add(InserisciIDFatturaLB2);
		
		IDFatturaTB = new JTextField();
		IDFatturaTB.setBounds(159, 89, 55, 19);
		RicercaFatturaPanel.add(IDFatturaTB);
		IDFatturaTB.setColumns(10);
		
		JButton AvantiButton = new JButton("Avanti");
		AvantiButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AvantiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerV.CompletaTabellaDettagliFattura();
				
				
			}
		});
		AvantiButton.setBounds(197, 143, 85, 21);
		RicercaFatturaPanel.add(AvantiButton);
		
		JButton IndietroButton = new JButton("Indietro");
		IndietroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerV.RicercaFatturaIndietroBottonePremuto();
				
			}
		});
		IndietroButton.setFont(new Font("Arial", Font.PLAIN, 12));
		IndietroButton.setBounds(100, 143, 85, 21);
		RicercaFatturaPanel.add(IndietroButton);
	}
	
	public String getIDFatturaTF() {
		return IDFatturaTB.getText();
	}


	public void setIDCarrelloTF(JTextField iDFatturaTB) {
		IDFatturaTB = iDFatturaTB;
	}
}
