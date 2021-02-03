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

public class SalvataggioCarrelloJDialog extends JDialog {

	private final JPanel SalvataggioPanel = new JPanel();
	private ControllerVendite Controller;
	private JButton AvantiButton;
	private final JButton IndietroButton = new JButton("Indietro");
	
	public SalvataggioCarrelloJDialog(ControllerVendite c) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		Controller = c;
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setBounds(500, 500, 372, 202);
		getContentPane().setLayout(new BorderLayout());
		SalvataggioPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(SalvataggioPanel, BorderLayout.CENTER);
		SalvataggioPanel.setLayout(null);
		
		JLabel SalvataggioLB = new JLabel("<html>Tutti i dati del carrello verranno persi. Sei sicuro di voler continuare?<html>");
		SalvataggioLB.setFont(new Font("Arial", Font.PLAIN, 13));
		SalvataggioLB.setBounds(10, 11, 338, 110);
		SalvataggioPanel.add(SalvataggioLB);
	
		{
			JPanel ContainerPanel = new JPanel();
			ContainerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(ContainerPanel, BorderLayout.SOUTH);
			{
				AvantiButton = new JButton("Avanti");
				AvantiButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Controller.SalvataggioBottoneAvantiPremuto();
					}
				});
				{
					IndietroButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Controller.SalvataggioBottoneIndietroPremuto();
						}
					});
					ContainerPanel.add(IndietroButton);
				}

				
				AvantiButton.setActionCommand("OK");
				ContainerPanel.add(AvantiButton);
				getRootPane().setDefaultButton(AvantiButton);
			}
		}
	}
	
}
