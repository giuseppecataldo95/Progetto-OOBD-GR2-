package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FinestraPrincipaleJFrame extends JFrame {

	private JPanel FinestraPrincipalePanel;
	private JPanel ContainerBottoniPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinestraPrincipaleJFrame frame = new FinestraPrincipaleJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FinestraPrincipaleJFrame() {
		setTitle("ProgettoOOBD2020");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 80, 1000, 600);
		FinestraPrincipalePanel = new JPanel();
		FinestraPrincipalePanel.setBackground(new Color(255, 228, 181));
		FinestraPrincipalePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(FinestraPrincipalePanel);
		FinestraPrincipalePanel.setLayout(null);
		
		JLabel BenvenutoLB = new JLabel("Benvenuto/a,");
		BenvenutoLB.setFont(new Font("Arial", Font.BOLD, 40));
		BenvenutoLB.setBounds(365, 11, 260, 59);
		FinestraPrincipalePanel.add(BenvenutoLB);
		
		JLabel SelezionaLB = new JLabel("Seleziona l'area tematica:");
		SelezionaLB.setFont(new Font("Arial", Font.PLAIN, 30));
		SelezionaLB.setBounds(315, 81, 345, 36);
		FinestraPrincipalePanel.add(SelezionaLB);
		
		ContainerBottoniPanel = new JPanel();
		ContainerBottoniPanel.setBackground(new Color(255, 255, 153));
		ContainerBottoniPanel.setBorder(null);
		ContainerBottoniPanel.setBounds(10, 140, 966, 273);
		FinestraPrincipalePanel.add(ContainerBottoniPanel);
		ContainerBottoniPanel.setLayout(null);
		
		JButton ClientiButton = new JButton("Clienti");
		ClientiButton.setIconTextGap(10);
		ClientiButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		ClientiButton.setHorizontalTextPosition(SwingConstants.CENTER);
		ClientiButton.setFont(new Font("Arial", Font.PLAIN, 25));
		ClientiButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\clienti.png"));
		ClientiButton.setBackground(Color.WHITE);
		ClientiButton.setBounds(14, 11, 226, 251);
		ContainerBottoniPanel.add(ClientiButton);
		
		JButton VenditeButton = new JButton("Vendite");
		VenditeButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		VenditeButton.setIconTextGap(10);
		VenditeButton.setHorizontalTextPosition(SwingConstants.CENTER);
		VenditeButton.setFont(new Font("Arial", Font.PLAIN, 25));
		VenditeButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\cassa.png"));
		VenditeButton.setBackground(Color.WHITE);
		VenditeButton.setBounds(250, 11, 226, 251);
		ContainerBottoniPanel.add(VenditeButton);
		
		JButton MagazzinoButton = new JButton("Magazzino");
		MagazzinoButton.setHorizontalTextPosition(SwingConstants.CENTER);
		MagazzinoButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\scatola.png"));
		MagazzinoButton.setIconTextGap(10);
		MagazzinoButton.setFont(new Font("Arial", Font.PLAIN, 25));
		MagazzinoButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		MagazzinoButton.setActionCommand("Magazzino");
		MagazzinoButton.setBackground(Color.WHITE);
		MagazzinoButton.setBounds(490, 11, 226, 251);
		ContainerBottoniPanel.add(MagazzinoButton);
		
		JButton DipendentiButton = new JButton("Dipendenti");
		DipendentiButton.setFont(new Font("Arial", Font.PLAIN, 25));
		DipendentiButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		DipendentiButton.setIconTextGap(10);
		DipendentiButton.setIcon(new ImageIcon("C:\\Users\\enzos\\Desktop\\Progetto\\cartellino.png"));
		DipendentiButton.setHorizontalTextPosition(SwingConstants.CENTER);
		DipendentiButton.setBackground(Color.WHITE);
		DipendentiButton.setBounds(726, 11, 226, 251);
		ContainerBottoniPanel.add(DipendentiButton);
		
	}
}
