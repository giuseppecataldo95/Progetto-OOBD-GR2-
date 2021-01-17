package GUI.Magazzino;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Controller.ControllerMagazzino;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminaProdottoByIDJDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ControllerMagazzino ControllerM;
	private JTextField IDProdottoDaEliminareTB;
	
	
	
	public EliminaProdottoByIDJDialog(ControllerMagazzino c, JFrame FinestraDaCuiApro) 
	{
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		ControllerM = c;
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel EliminaProdottoLB = new JLabel("Inserisci l'ID del Prodotto da Eliminare");
		EliminaProdottoLB.setFont(new Font("Arial", Font.BOLD, 14));
		EliminaProdottoLB.setHorizontalAlignment(SwingConstants.CENTER);
		EliminaProdottoLB.setBounds(49, 49, 340, 25);
		contentPanel.add(EliminaProdottoLB);
		
		JLabel IDProdottoLB = new JLabel("ID Prodotto : ");
		IDProdottoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		IDProdottoLB.setBounds(133, 110, 77, 25);
		contentPanel.add(IDProdottoLB);
		
		IDProdottoDaEliminareTB = new JTextField();
		IDProdottoDaEliminareTB.setFont(new Font("Arial", Font.PLAIN, 12));
		IDProdottoDaEliminareTB.setBounds(215, 111, 61, 22);
		contentPanel.add(IDProdottoDaEliminareTB);
		IDProdottoDaEliminareTB.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton EliminaButton = new JButton("Elimina Prodotto");
				EliminaButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ControllerM.EliminaBottonePremuto(FinestraDaCuiApro);
					}
				});
				
				JButton IndietroButton = new JButton("Indietro");
				IndietroButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ControllerM.EliminaIndietroBottonePremuto(FinestraDaCuiApro);
					}
				});
				IndietroButton.setActionCommand("OK");
				buttonPane.add(IndietroButton);
				EliminaButton.setActionCommand("OK");
				buttonPane.add(EliminaButton);
				getRootPane().setDefaultButton(EliminaButton);
			}
			{
				
			}
		}
	}
	
	public String getIDProdottoDaEliminare() {
		return IDProdottoDaEliminareTB.getText();
	}
}
