package GUI.Cliente;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerCliente;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormatoNTesseraErratoJDialog extends JDialog {

	private final JPanel FormatoNTesseraErratoPanel = new JPanel();
	private ControllerCliente ControllerC;
	
	public FormatoNTesseraErratoJDialog(ControllerCliente c) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		ControllerC = c;
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setBounds(100, 100, 272, 186);
		getContentPane().setLayout(new BorderLayout());
		FormatoNTesseraErratoPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(FormatoNTesseraErratoPanel, BorderLayout.CENTER);
		FormatoNTesseraErratoPanel.setLayout(null);
		{
			JLabel NumeroTesseraErratoLB = new JLabel("Numero Tessera Errato ");
			NumeroTesseraErratoLB.setHorizontalAlignment(SwingConstants.CENTER);
			NumeroTesseraErratoLB.setFont(new Font("Arial", Font.BOLD, 12));
			NumeroTesseraErratoLB.setBounds(54, 34, 153, 21);
			FormatoNTesseraErratoPanel.add(NumeroTesseraErratoLB);
		}
		{
			JButton NTesseraErratoRiprovaButton = new JButton("Riprova");
			NTesseraErratoRiprovaButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ControllerC.NTesseraErratoRiprovaBottonePremuto();
					
				}
			});
			NTesseraErratoRiprovaButton.setFont(new Font("Arial", Font.PLAIN, 12));
			NTesseraErratoRiprovaButton.setBounds(81, 86, 85, 21);
			FormatoNTesseraErratoPanel.add(NTesseraErratoRiprovaButton);
		}
	}

}
