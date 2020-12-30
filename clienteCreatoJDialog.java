package Cliente;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class clienteCreatoJDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	ControllerClienti controller = new ControllerClienti();


	public clienteCreatoJDialog(ControllerClienti c) {
		controller = c;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Torna al Men\u00F9 Principale");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				controller.pressClientiPercorso();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton.setBounds(207, 211, 192, 21);
		contentPanel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Il Cliente \u00E8 stato inserito!");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(82, 73, 240, 37);
		contentPanel.add(lblNewLabel);
	}
}
