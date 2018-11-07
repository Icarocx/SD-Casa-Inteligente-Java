package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaAdicionar {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdicionar window = new TelaAdicionar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAdicionar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblTelaAdd = new JLabel("Tela ADD");
		lblTelaAdd.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblTelaAdd, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNome = new JLabel("Nome Componente:");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNome);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setToolTipText("digite..");
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUrlconeComponente = new JLabel("URL \u00CDcone Componente: ");
		lblUrlconeComponente.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblUrlconeComponente);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setToolTipText("digite...");
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("OK!");
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		frame.setVisible(true);
	}

}
