package ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ejercicio2Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public Ejercicio2Frame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 201);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("Escribe el título de una pelicula");
		lbl1.setBounds(10, 39, 185, 14);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Peliculas");
		lbl2.setBounds(272, 39, 56, 14);
		contentPane.add(lbl2);
		
		textField = new JTextField();
		textField.setBounds(20, 64, 130, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("Añadir");
		btn.setBounds(30, 95, 103, 23);
		contentPane.add(btn);
		
		JComboBox<Object> comboBox = new JComboBox<>();		// ComboBox
		comboBox.setBounds(240, 63, 113, 22);
		contentPane.add(comboBox);
		
		this.setVisible(true);
		
		btnListener(btn, comboBox);
		
	}
	
		private void btnListener(JButton btn, JComboBox<Object> box) {
			
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){  
					box.addItem(textField.getText());
		        }  	
			});
		}

}
