package GUI.Magazzino;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerMagazzino;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProdottoEliminatoJDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ControllerMagazzino ControllerM;
	
	public ProdottoEliminatoJDialog(ControllerMagazzino c, JFrame FinestraDaCuiApro) {
		ControllerM = c;
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel ProdottoEliminatoLB = new JLabel("Prodotto Eliminato con Successo");
		ProdottoEliminatoLB.setFont(new Font("Arial", Font.BOLD, 14));
		ProdottoEliminatoLB.setHorizontalAlignment(SwingConstants.CENTER);
		ProdottoEliminatoLB.setBounds(83, 48, 271, 46);
		contentPanel.add(ProdottoEliminatoLB);
		
		JButton OkButton = new JButton("OK");
		OkButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerM.ProdottoEliminatoOkBottonePremuto(FinestraDaCuiApro);
			}
		});
		OkButton.setFont(new Font("Arial", Font.PLAIN, 12));
		OkButton.setBounds(178, 155, 85, 21);
		contentPanel.add(OkButton);
	}
}
