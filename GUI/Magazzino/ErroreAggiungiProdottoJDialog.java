package GUI.Magazzino;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerMagazzino;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ErroreAggiungiProdottoJDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ControllerMagazzino Controller;
	private JButton riprovaButton;
	
	public ErroreAggiungiProdottoJDialog(ControllerMagazzino c, JFrame FinestraDaCuiApro) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		Controller = c;
		setAlwaysOnTop(true);
		
		setBounds(500, 500, 372, 202);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
	
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				riprovaButton = new JButton("Riprova");
				riprovaButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Controller.RiprovaBottonePremuto(FinestraDaCuiApro);
					}
				});

				
				riprovaButton.setActionCommand("OK");
				buttonPane.add(riprovaButton);
				getRootPane().setDefaultButton(riprovaButton);
			}
		}
	}
	
	public void setError(String errore) {
		JLabel ErroreLB = new JLabel("<html>"+errore+"<html>");
		ErroreLB.setBounds(10, 11, 338, 58);
		ErroreLB.setFont(new Font("Arial", Font.PLAIN, 10));
		contentPanel.add(ErroreLB);
	}


	

}
