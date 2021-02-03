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
import javax.swing.SwingConstants;

public class GenerazioneFatturaCompletataJDialog extends JDialog {

	private final JPanel FatturaPanel = new JPanel();
	private ControllerVendite Controller;
	private JButton OkButton;
	
	public GenerazioneFatturaCompletataJDialog(ControllerVendite v) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		Controller = v;
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setBounds(500, 500, 372, 202);
		getContentPane().setLayout(new BorderLayout());
		FatturaPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(FatturaPanel, BorderLayout.CENTER);
		FatturaPanel.setLayout(null);
		
		JLabel FatturaLB = new JLabel("Generazione Fattura completata!");
		FatturaLB.setHorizontalAlignment(SwingConstants.CENTER);
		FatturaLB.setFont(new Font("Arial", Font.BOLD, 14));
		FatturaLB.setBounds(0, 39, 361, 47);
		FatturaPanel.add(FatturaLB);
	
		{
			JPanel ContainerPanel = new JPanel();
			ContainerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(ContainerPanel, BorderLayout.SOUTH);
			{
				OkButton = new JButton("Ok");
				OkButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Controller.GenerazioneFatturaCompletataOkBottonePremuto();
					}
				});

				
				OkButton.setActionCommand("OK");
				ContainerPanel.add(OkButton);
				getRootPane().setDefaultButton(OkButton);
			}
		}
	}
	
	
}
