package GUI.Cliente;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCliente;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DettagliClienteJDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField VisualizzaDettagliNTesseraTB;
	


	


	private ControllerCliente controller;

	
	public DettagliClienteJDialog(ControllerCliente c) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		controller = c;
		setBounds(100, 100, 450, 300);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inserisci il Numero della Tessera di cui vuoi \r\nvisualizzare i dettagli. ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));		
		lblNewLabel.setBounds(10, 10, 405, 62);
		contentPanel.add(lblNewLabel);
		
		
		JLabel NumeroTesseraVisualizzaDettagliLB = new JLabel("Numero Tessera : ");
		NumeroTesseraVisualizzaDettagliLB.setFont(new Font("Arial", Font.PLAIN, 12));
		NumeroTesseraVisualizzaDettagliLB.setHorizontalAlignment(SwingConstants.CENTER);
		NumeroTesseraVisualizzaDettagliLB.setBounds(58, 117, 131, 26);
		contentPanel.add(NumeroTesseraVisualizzaDettagliLB);
		
		
		VisualizzaDettagliNTesseraTB = new JTextField();
		VisualizzaDettagliNTesseraTB.setBounds(184, 121, 96, 19);
		contentPanel.add(VisualizzaDettagliNTesseraTB);
		VisualizzaDettagliNTesseraTB.setColumns(10);
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);			
		
		JButton VisualizzaDettagliAnnullaJButton = new JButton("Annulla");
		VisualizzaDettagliAnnullaJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					controller.VisualizzaDettagliJDialogAnnullaBottonePremuto();
					
					}
				});
				VisualizzaDettagliAnnullaJButton.setFont(new Font("Arial", Font.BOLD, 12));
				VisualizzaDettagliAnnullaJButton.setActionCommand("Cancel");
				buttonPane.add(VisualizzaDettagliAnnullaJButton);	
				
				JButton VisualizzaDettagliClienteDialogJButton = new JButton("Visualizza Dettagli");
				VisualizzaDettagliClienteDialogJButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
							
							
							
							controller.CercaClienteByNTessera();
								
						}
							
				});
				buttonPane.add(VisualizzaDettagliClienteDialogJButton);
	}
	
	public String getVisualizzaDettagliNTesseraTB()
	{
		
		
		return VisualizzaDettagliNTesseraTB.getText();
	}
	
}	
	
	

	

