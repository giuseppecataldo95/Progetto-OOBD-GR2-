package GUI.Cliente;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCliente;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TesseraEliminataJDialog extends JDialog {

	private final JPanel TesseraEliminataPanel = new JPanel();
	private ControllerCliente ControllerC;
	
	public TesseraEliminataJDialog(ControllerCliente c) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		ControllerC = c;
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		TesseraEliminataPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(TesseraEliminataPanel, BorderLayout.CENTER);
		TesseraEliminataPanel.setLayout(null);
		
		JLabel TesseraEliminataLB = new JLabel("Tessera Eliminata con Successo");
		TesseraEliminataLB.setFont(new Font("Arial", Font.BOLD, 14));
		TesseraEliminataLB.setHorizontalAlignment(SwingConstants.CENTER);
		TesseraEliminataLB.setBounds(83, 48, 271, 46);
		TesseraEliminataPanel.add(TesseraEliminataLB);
		
		JButton OkButton = new JButton("OK");
		OkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				ControllerC.TesseraEliminataOKBottonePremuto();
				ControllerC.CompletaTabellaTessera();
				

				
			}
		});
		OkButton.setFont(new Font("Arial", Font.PLAIN, 12));
		OkButton.setBounds(178, 155, 85, 21);
		TesseraEliminataPanel.add(OkButton);
	}
}
