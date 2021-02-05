package GUI.Cliente;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCliente;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ErroreRicercaClienteByNTesseraJDialog extends JDialog {

	private final JPanel ErroreRicercaClientePanel = new JPanel();
	private ControllerCliente ControllerC;
	
	public ErroreRicercaClienteByNTesseraJDialog(ControllerCliente c) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		ControllerC = c;
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setBounds(100, 100, 375, 181);
		getContentPane().setLayout(new BorderLayout());
		ErroreRicercaClientePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(ErroreRicercaClientePanel, BorderLayout.CENTER);
		ErroreRicercaClientePanel.setLayout(null);
		
		JButton RiprovaJButton = new JButton("Riprova");
		RiprovaJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		
				ControllerC.ErroreRicercaClienteRiprovaBottonePremuto();		

			
				
			}
		});
		RiprovaJButton.setActionCommand("Cancel");
		RiprovaJButton.setBounds(127, 80, 107, 21);
		ErroreRicercaClientePanel.add(RiprovaJButton);
		
		JLabel ErroreRicercaClienteLB = new JLabel("Il numero della Tessera inserito non \u00E8 stato trovato \r\n");
		ErroreRicercaClienteLB.setHorizontalAlignment(SwingConstants.CENTER);
		ErroreRicercaClienteLB.setFont(new Font("Arial", Font.BOLD, 13));
		ErroreRicercaClienteLB.setBounds(3, 25, 355, 28);
		ErroreRicercaClientePanel.add(ErroreRicercaClienteLB);
		
		JLabel ErroreRicercaClienteLB1 = new JLabel("oppure non \u00E8 corretto.");
		ErroreRicercaClienteLB1.setFont(new Font("Arial", Font.BOLD, 13));
		ErroreRicercaClienteLB1.setHorizontalAlignment(SwingConstants.CENTER);
		ErroreRicercaClienteLB1.setBounds(105, 49, 151, 21);
		ErroreRicercaClientePanel.add(ErroreRicercaClienteLB1);
	}
}
