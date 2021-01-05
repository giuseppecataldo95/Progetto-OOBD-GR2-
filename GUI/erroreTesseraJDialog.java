package GUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ErroreTesseraJDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	
	public ErroreTesseraJDialog() {
		setAlwaysOnTop(true);
		
		setBounds(500, 500, 300, 150);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel erroreLB = new JLabel("Errore nell'inserimento dei dati!");
			erroreLB.setBounds(10, 10, 266, 62);
			contentPanel.add(erroreLB);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton riprovaButton = new JButton("Riprova");
				
				riprovaButton.setActionCommand("OK");
				buttonPane.add(riprovaButton);
				getRootPane().setDefaultButton(riprovaButton);
			}
		}
	}

}
