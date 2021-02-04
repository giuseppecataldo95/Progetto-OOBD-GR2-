package GUI.Cliente;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCliente;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ErroreTesseraJDialog extends JDialog {

	private final JPanel ErroreTesseraPanel = new JPanel();
	private ControllerCliente ControllerC;
	
	public ErroreTesseraJDialog(ControllerCliente c) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		ControllerC = c;
		setAlwaysOnTop(true);
		
		setBounds(500, 500, 300, 150);
		getContentPane().setLayout(new BorderLayout());
		ErroreTesseraPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(ErroreTesseraPanel, BorderLayout.CENTER);
		ErroreTesseraPanel.setLayout(null);
		
			JLabel ErroreLB = new JLabel("Errore nell'inserimento dei dati!");
			ErroreLB.setBounds(10, 10, 266, 62);
			ErroreTesseraPanel.add(ErroreLB);
		
		
			JPanel ErroreTesseraBottoniPanel = new JPanel();
			ErroreTesseraBottoniPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(ErroreTesseraBottoniPanel, BorderLayout.SOUTH);
			
				JButton RiprovaButton = new JButton("Riprova");
				RiprovaButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					
					{
						ControllerC.ErroreTesseraRiprovaBottonePremuto();
						
					}
				});
				
				RiprovaButton.setActionCommand("OK");
				ErroreTesseraBottoniPanel.add(RiprovaButton);
				getRootPane().setDefaultButton(RiprovaButton);
			}
		
	

}
