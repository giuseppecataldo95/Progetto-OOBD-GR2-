package GUI.Vendite;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerVendite;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IDFatturaNonTrovatoJDialog extends JDialog {

	private final JPanel IDFatturaNonTrovatoPanel = new JPanel();
	private ControllerVendite ControllerV;

	public IDFatturaNonTrovatoJDialog(ControllerVendite ControllerVendite) {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		ControllerV = ControllerVendite;
		setBounds(100, 100, 450, 229);
		getContentPane().setLayout(new BorderLayout());
		IDFatturaNonTrovatoPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(IDFatturaNonTrovatoPanel, BorderLayout.CENTER);
		IDFatturaNonTrovatoPanel.setLayout(null);
		setResizable(false);
		setTitle("ProgettoOOBD2020");
		JLabel TesseraNonCorrettaLB = new JLabel("Il numero della fattura inserito non \u00E8 corretto");
		TesseraNonCorrettaLB.setFont(new Font("Tahoma", Font.BOLD, 14));
		TesseraNonCorrettaLB.setHorizontalAlignment(SwingConstants.CENTER);
		TesseraNonCorrettaLB.setBounds(42, 29, 352, 37);
		IDFatturaNonTrovatoPanel.add(TesseraNonCorrettaLB);
		
		JButton RiprovaButton = new JButton("Riprova");
		RiprovaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ControllerV.IDFatturaNonTrovatoRiprovaBottonePremuto();
				
			}
		});
		RiprovaButton.setBounds(175, 126, 85, 21);
		IDFatturaNonTrovatoPanel.add(RiprovaButton);
	}
}
