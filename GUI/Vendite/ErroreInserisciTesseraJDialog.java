package GUI.Vendite;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerMagazzino;
import Controller.ControllerVendite;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ErroreInserisciTesseraJDialog extends JDialog {

	private final JPanel ErroreInserisciTesseraPanel = new JPanel();
	private ControllerVendite Controller;
	private JButton RiprovaButton;
	
	public ErroreInserisciTesseraJDialog(ControllerVendite v) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		Controller = v;
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setBounds(300, 300, 372, 202);
		getContentPane().setLayout(new BorderLayout());
		ErroreInserisciTesseraPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(ErroreInserisciTesseraPanel, BorderLayout.CENTER);
		ErroreInserisciTesseraPanel.setLayout(null);
	
		{
			JPanel BottoniPanel = new JPanel();
			BottoniPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(BottoniPanel, BorderLayout.SOUTH);
			{
				RiprovaButton = new JButton("Riprova");
				RiprovaButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Controller.ErroreTesseraRiprovaBottonePremuto();
					}
				});

				
				RiprovaButton.setActionCommand("OK");
				BottoniPanel.add(RiprovaButton);
				getRootPane().setDefaultButton(RiprovaButton);
			}
		}
	}
	
	public void setError(String errore) {
		JLabel ErroreLB = new JLabel("<html>"+errore+"<html>");
		ErroreLB.setBounds(10, 11, 338, 58);
		ErroreLB.setFont(new Font("Arial", Font.PLAIN, 10));
		ErroreInserisciTesseraPanel.add(ErroreLB);
	}


	

}
