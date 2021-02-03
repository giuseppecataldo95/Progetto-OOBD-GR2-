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

public class IDFatturaRicercaCarrelloJDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField IDFatturaTB;
	private ControllerVendite ControllerV;
	
	
	


	public IDFatturaRicercaCarrelloJDialog(ControllerVendite cv) {
		
		ControllerV = cv;
		
		setBounds(100, 100, 306, 211);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inserisci L' ID Fattura");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(3, 26, 286, 33);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID Fattura : ");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(80, 87, 79, 22);
		contentPanel.add(lblNewLabel_1);
		
		IDFatturaTB = new JTextField();
		IDFatturaTB.setBounds(159, 89, 55, 19);
		contentPanel.add(IDFatturaTB);
		IDFatturaTB.setColumns(10);
		
		JButton AvantiButton = new JButton("Avanti");
		AvantiButton.setFont(new Font("Arial", Font.PLAIN, 12));
		AvantiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerV.CompletaTabellaDettagliFattura();
				
				
			}
		});
		AvantiButton.setBounds(197, 143, 85, 21);
		contentPanel.add(AvantiButton);
	}
	
	public String getIDFatturaTB() {
		return IDFatturaTB.getText();
	}


	public void setIDCarrelloTB(JTextField iDFatturaTB) {
		IDFatturaTB = iDFatturaTB;
	}
}
