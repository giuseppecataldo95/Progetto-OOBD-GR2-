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

	private final JPanel EliminaProdottoByIDPanel = new JPanel();
	private ControllerMagazzino ControllerM;
	private JTextField IDProdottoDaEliminareTF;
	
	
	
	public EliminaProdottoByIDJDialog(ControllerMagazzino c, JFrame FinestraDaCuiApro) 
	{
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		ControllerM = c;
		
		setBounds(100, 100, 450, 300);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		getContentPane().setLayout(new BorderLayout());
		EliminaProdottoByIDPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(EliminaProdottoByIDPanel, BorderLayout.CENTER);
		EliminaProdottoByIDPanel.setLayout(null);
		
		JLabel EliminaProdottoLB = new JLabel("Inserisci l'ID del Prodotto da Eliminare");
		EliminaProdottoLB.setFont(new Font("Arial", Font.BOLD, 14));
		EliminaProdottoLB.setHorizontalAlignment(SwingConstants.CENTER);
		EliminaProdottoLB.setBounds(49, 49, 340, 25);
		EliminaProdottoByIDPanel.add(EliminaProdottoLB);
		
		JLabel IDProdottoLB = new JLabel("ID Prodotto : ");
		IDProdottoLB.setFont(new Font("Arial", Font.PLAIN, 12));
		IDProdottoLB.setBounds(133, 110, 77, 25);
		EliminaProdottoByIDPanel.add(IDProdottoLB);
		
		IDProdottoDaEliminareTF = new JTextField();
		IDProdottoDaEliminareTF.setFont(new Font("Arial", Font.PLAIN, 12));
		IDProdottoDaEliminareTF.setBounds(215, 111, 61, 22);
		EliminaProdottoByIDPanel.add(IDProdottoDaEliminareTF);
		IDProdottoDaEliminareTF.setColumns(10);
		{
			JPanel BottoniPanel = new JPanel();
			BottoniPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(BottoniPanel, BorderLayout.SOUTH);
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
				BottoniPanel.add(IndietroButton);
				EliminaButton.setActionCommand("OK");
				BottoniPanel.add(EliminaButton);
				getRootPane().setDefaultButton(EliminaButton);
			}
			{
				
			}
		}
	}
	
	public String getIDProdottoDaEliminareTF() {
		return IDProdottoDaEliminareTF.getText();
	}
}
