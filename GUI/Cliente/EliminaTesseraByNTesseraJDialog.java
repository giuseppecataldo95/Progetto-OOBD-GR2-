package GUI.Cliente;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCliente;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminaTesseraByNTesseraJDialog extends JDialog {

	private final JPanel EliminaTesseraPanel = new JPanel();
	private ControllerCliente ControllerC;
	private JTextField NTesseraDaEliminareTF;
	
	
	
	public EliminaTesseraByNTesseraJDialog(ControllerCliente c) 
	{
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		ControllerC = c;
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		EliminaTesseraPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(EliminaTesseraPanel, BorderLayout.CENTER);
		EliminaTesseraPanel.setLayout(null);
		
		JLabel EliminaTesseraLB = new JLabel("Inserisci il Numero della Tessera da Eliminare!");
		EliminaTesseraLB.setFont(new Font("Arial", Font.BOLD, 14));
		EliminaTesseraLB.setHorizontalAlignment(SwingConstants.CENTER);
		EliminaTesseraLB.setBounds(48, 29, 340, 25);
		EliminaTesseraPanel.add(EliminaTesseraLB);
		
		JLabel NumeroTesseraEliminaTesseraLB = new JLabel("Numero Tessera : ");
		NumeroTesseraEliminaTesseraLB.setFont(new Font("Arial", Font.PLAIN, 12));
		NumeroTesseraEliminaTesseraLB.setBounds(98, 111, 107, 25);
		EliminaTesseraPanel.add(NumeroTesseraEliminaTesseraLB);
		
		NTesseraDaEliminareTF = new JTextField();
		NTesseraDaEliminareTF.setFont(new Font("Arial", Font.PLAIN, 12));
		NTesseraDaEliminareTF.setBounds(215, 111, 61, 22);
		EliminaTesseraPanel.add(NTesseraDaEliminareTF);
		NTesseraDaEliminareTF.setColumns(10);
		{
			JPanel ContainerPanel = new JPanel();
			ContainerPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(ContainerPanel, BorderLayout.SOUTH);
			{
				JButton OkButton = new JButton("Elimina Tessera");
				OkButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						ControllerC.EliminaTesseraByNTessera();
						
					}
				});
				
				JButton IndietroButton = new JButton("Indietro");
				IndietroButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						ControllerC.EliminaTesseraIndietroBottonePremuto();
						
					}
				});
				ContainerPanel.add(IndietroButton);
				OkButton.setActionCommand("OK");
				ContainerPanel.add(OkButton);
				getRootPane().setDefaultButton(OkButton);
			}
			{
				
			}
		}
	}



	public String getNTesseraDaEliminareTF() {
		return NTesseraDaEliminareTF.getText();
	}



	


	



	



	



	
}
