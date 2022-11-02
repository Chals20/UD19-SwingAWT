package ejercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ejercicio1Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Ejercicio1Frame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		// Usamos Absolute Layout
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn = new JButton("Saludar");	// Boton con texto Saludar
		btn.setBounds(164, 120, 90, 25);
		contentPane.add(btn);

		textField = new JTextField();			// Campo de texto
		textField.setBounds(137, 89, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lbl = new JLabel("Escribe un nombre para saludar");	// Label
		lbl.setBounds(134, 58, 206, 20);
		contentPane.add(lbl);

		this.setVisible(true);

		btnListener(btn);	// Listener del botón

	}


	private void btnListener(JButton btn) {
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola " + textField.getText());	// Al apretar el boton, muestra un dialog
			}
		});
	}

}

