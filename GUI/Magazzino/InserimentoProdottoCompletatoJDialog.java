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
import javax.swing.SwingConstants;

public class InserimentoProdottoCompletatoJDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ControllerMagazzino Controller;
	private JButton OkButton;
	
	public InserimentoProdottoCompletatoJDialog(ControllerMagazzino c, JFrame FinestraDaCuiApro) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		Controller = c;
		setAlwaysOnTop(true);
		
		setBounds(500, 500, 372, 202);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblIlProdotto = new JLabel("Il Prodotto \u00E8 stato inserito con successo!");
		lblIlProdotto.setHorizontalAlignment(SwingConstants.CENTER);
		lblIlProdotto.setFont(new Font("Arial", Font.BOLD, 14));
		lblIlProdotto.setBounds(0, 39, 361, 47);
		contentPanel.add(lblIlProdotto);
	
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				OkButton = new JButton("Ok");
				OkButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Controller.InserimentoCompletatoOkBottonePremuto(FinestraDaCuiApro);
					}
				});

				
				OkButton.setActionCommand("OK");
				buttonPane.add(OkButton);
				getRootPane().setDefaultButton(OkButton);
			}
		}
	}
	
	
}
