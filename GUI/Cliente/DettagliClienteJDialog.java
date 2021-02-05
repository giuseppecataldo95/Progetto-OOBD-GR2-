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

	private final JPanel DettagliPanel = new JPanel();
	private JTextField VisualizzaDettagliNTesseraTF;
	


	


	private ControllerCliente ControllerC;

	
	public DettagliClienteJDialog(ControllerCliente c) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		ControllerC = c;
		setBounds(100, 100, 450, 300);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		getContentPane().setLayout(new BorderLayout());
		DettagliPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(DettagliPanel, BorderLayout.CENTER);
		DettagliPanel.setLayout(null);
		
		JLabel InserisciNumeroLB = new JLabel("Inserisci il Numero della Tessera di cui vuoi \r\nvisualizzare i dettagli. ");
		InserisciNumeroLB.setHorizontalAlignment(SwingConstants.CENTER);
		InserisciNumeroLB.setFont(new Font("Arial", Font.BOLD, 12));		
		InserisciNumeroLB.setBounds(10, 10, 405, 62);
		DettagliPanel.add(InserisciNumeroLB);
		
		
		JLabel NumeroTesseraVisualizzaDettagliLB = new JLabel("Numero Tessera : ");
		NumeroTesseraVisualizzaDettagliLB.setFont(new Font("Arial", Font.PLAIN, 12));
		NumeroTesseraVisualizzaDettagliLB.setHorizontalAlignment(SwingConstants.CENTER);
		NumeroTesseraVisualizzaDettagliLB.setBounds(58, 117, 131, 26);
		DettagliPanel.add(NumeroTesseraVisualizzaDettagliLB);
		
		
		VisualizzaDettagliNTesseraTF = new JTextField();
		VisualizzaDettagliNTesseraTF.setBounds(184, 121, 96, 19);
		DettagliPanel.add(VisualizzaDettagliNTesseraTF);
		VisualizzaDettagliNTesseraTF.setColumns(10);
		
		JPanel ContainerPanel = new JPanel();
		ContainerPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(ContainerPanel, BorderLayout.SOUTH);			
		
		JButton VisualizzaDettagliAnnullaButton = new JButton("Annulla");
		VisualizzaDettagliAnnullaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					ControllerC.VisualizzaDettagliJDialogAnnullaBottonePremuto();
					
					}
				});
				VisualizzaDettagliAnnullaButton.setFont(new Font("Arial", Font.BOLD, 12));
				VisualizzaDettagliAnnullaButton.setActionCommand("Cancel");
				ContainerPanel.add(VisualizzaDettagliAnnullaButton);	
				
				JButton VisualizzaDettagliClienteButton = new JButton("Visualizza Dettagli");
				VisualizzaDettagliClienteButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
							
							
							
							ControllerC.CercaClienteByNTessera();
								
						}
							
				});
				ContainerPanel.add(VisualizzaDettagliClienteButton);
	}
	
	public String getVisualizzaDettagliNTesseraTF()
	{
		
		
		return VisualizzaDettagliNTesseraTF.getText();
	}
	
}	
	
	

	

