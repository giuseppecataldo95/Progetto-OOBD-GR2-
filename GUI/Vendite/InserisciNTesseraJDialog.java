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
import javax.swing.JTextField;

public class InserisciNTesseraJDialog extends JDialog {

	private final JPanel InserisciNTesseraPanel = new JPanel();
	private ControllerVendite Controller;
	private JButton GeneraButton;
	private final JButton IndietroButton = new JButton("Indietro");
	private JTextField InserisciNTesseraTB;
	
	public InserisciNTesseraJDialog(ControllerVendite c) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		Controller = c;
		setAlwaysOnTop(true);
		
		setBounds(500, 300, 372, 202);
		getContentPane().setLayout(new BorderLayout());
		InserisciNTesseraPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(InserisciNTesseraPanel, BorderLayout.CENTER);
		InserisciNTesseraPanel.setLayout(null);
		
		JLabel InserisciNTesseraLB = new JLabel("<html>Inserisci il numero della tessera a cui associare l'acquisto :<html>");
		InserisciNTesseraLB.setFont(new Font("Arial", Font.PLAIN, 14));
		InserisciNTesseraLB.setBounds(10, 11, 338, 76);
		InserisciNTesseraPanel.add(InserisciNTesseraLB);
		
		InserisciNTesseraTB = new JTextField();
		InserisciNTesseraTB.setBounds(108, 78, 138, 20);
		InserisciNTesseraPanel.add(InserisciNTesseraTB);
		InserisciNTesseraTB.setColumns(10);
	
		{
			JPanel ContainerPanel = new JPanel();
			ContainerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(ContainerPanel, BorderLayout.SOUTH);
			{
				GeneraButton = new JButton("Genera");
				GeneraButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Controller.InserisciNTesseraGeneraBottonePremuto();
					}
				});
				{
					IndietroButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Controller.InserisciNTesseraIndietroBottonePremuto();
						}
					});
					ContainerPanel.add(IndietroButton);
				}

				
				GeneraButton.setActionCommand("OK");
				ContainerPanel.add(GeneraButton);
				getRootPane().setDefaultButton(GeneraButton);
			}
		}
	}
	public String getNTessera() {
		return InserisciNTesseraTB.getText();
	}
}
