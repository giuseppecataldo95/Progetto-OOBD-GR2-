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

	private final JPanel InserimentoProdottoCompletatoPanel = new JPanel();
	private ControllerMagazzino Controller;
	private JButton OkButton;
	
	public InserimentoProdottoCompletatoJDialog(ControllerMagazzino c, JFrame FinestraDaCuiApro) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		Controller = c;
		setAlwaysOnTop(true);
		
		setBounds(500, 500, 372, 202);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		getContentPane().setLayout(new BorderLayout());
		InserimentoProdottoCompletatoPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(InserimentoProdottoCompletatoPanel, BorderLayout.CENTER);
		InserimentoProdottoCompletatoPanel.setLayout(null);
		
		JLabel InserimentoCompletatoLB = new JLabel("Il Prodotto \u00E8 stato inserito con successo!");
		InserimentoCompletatoLB.setHorizontalAlignment(SwingConstants.CENTER);
		InserimentoCompletatoLB.setFont(new Font("Arial", Font.BOLD, 14));
		InserimentoCompletatoLB.setBounds(0, 39, 361, 47);
		InserimentoProdottoCompletatoPanel.add(InserimentoCompletatoLB);
	
		{
			JPanel BottoniPanel = new JPanel();
			BottoniPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(BottoniPanel, BorderLayout.SOUTH);
			{
				OkButton = new JButton("Ok");
				OkButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Controller.InserimentoCompletatoOkBottonePremuto(FinestraDaCuiApro);
					}
				});

				
				OkButton.setActionCommand("OK");
				BottoniPanel.add(OkButton);
				getRootPane().setDefaultButton(OkButton);
			}
		}
	}
	
	
}
