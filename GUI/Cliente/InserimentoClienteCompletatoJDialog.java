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

public class InserimentoClienteCompletatoJDialog extends JDialog {

	private final JPanel InserimentoClientePanel = new JPanel();
	private ControllerCliente ControllerC;

	
	public InserimentoClienteCompletatoJDialog(ControllerCliente c)
	
	{
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		ControllerC = c;
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		InserimentoClientePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(InserimentoClientePanel, BorderLayout.CENTER);
		InserimentoClientePanel.setLayout(null);
		
		JButton OKInserimentoCompletatoButton = new JButton("OK");
		OKInserimentoCompletatoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			
			{				
				
				ControllerC.MostraFinestraClientiDaInserimentoClienteCompletato();
			}
			
		});
		OKInserimentoCompletatoButton.setBounds(170, 162, 106, 36);
		InserimentoClientePanel.add(OKInserimentoCompletatoButton);
		
		JLabel InserimentoLB = new JLabel("Il Cliente \u00E8 stato inserito con successo!");
		InserimentoLB.setHorizontalAlignment(SwingConstants.CENTER);
		InserimentoLB.setFont(new Font("Arial", Font.BOLD, 14));
		InserimentoLB.setBounds(39, 56, 361, 47);
		InserimentoClientePanel.add(InserimentoLB);
	}
}
