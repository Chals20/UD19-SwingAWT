package ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ejercicio4Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField campoTexto;
	private JTextField campoTexto2;
	private JTextField resultTexto;

	/**
	 * Create the frame.
	 */
	public Ejercicio4Frame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		campoTexto = new JTextField();
		campoTexto.setBounds(10, 34, 86, 20);
		contentPane.add(campoTexto);
		campoTexto.setColumns(10);

		campoTexto2 = new JTextField();
		campoTexto2.setBounds(125, 34, 86, 20);
		contentPane.add(campoTexto2);
		campoTexto2.setColumns(10);

		resultTexto = new JTextField();
		resultTexto.setEditable(false);
		resultTexto.setBounds(256, 34, 86, 20);
		contentPane.add(resultTexto);
		resultTexto.setColumns(10);

		JButton btnSuma = new JButton("Suma");
		btnSuma.setBounds(10, 88, 89, 23);
		contentPane.add(btnSuma);

		JButton btnResta = new JButton("Resta");
		btnResta.setBounds(125, 88, 89, 23);
		contentPane.add(btnResta);

		JButton btnMul = new JButton("Multipliación");
		btnMul.setBounds(10, 122, 89, 23);
		contentPane.add(btnMul);

		JButton btnDiv = new JButton("División");
		btnDiv.setBounds(125, 122, 89, 23);
		contentPane.add(btnDiv);

		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(256, 104, 89, 23);
		contentPane.add(btnSalir);

		JLabel lbl = new JLabel("=");
		lbl.setBounds(231, 37, 15, 14);
		contentPane.add(lbl);

		JLabel lbl1 = new JLabel("Operaciones");
		lbl1.setBounds(78, 63, 86, 14);
		contentPane.add(lbl1);

		JLabel lbl2 = new JLabel("Valores");
		lbl2.setBounds(88, 9, 86, 14);
		contentPane.add(lbl2);

		JLabel lblOp = new JLabel("");
		lblOp.setBounds(106, 37, 15, 14);
		contentPane.add(lblOp);

		this.setVisible(true);

		btnSumar(btnSuma, lblOp);
		btnRestar(btnResta, lblOp);
		btnMultiplicar(btnMul, lblOp);
		btnDividir(btnDiv, lblOp);
		btnSalir(btnSalir);
	}


	private void btnSumar(JButton btn, JLabel op) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {	//try-catch para controlar Excepciones
					
					double valor1 = Double.parseDouble(campoTexto.getText());
					double valor2 = Double.parseDouble(campoTexto2.getText());

					op.setText("+");	//seteamos el texto de la operacion a +
					
					double resultado = valor1 + valor2;
					resultado = Math.round(resultado * 100.0) / 100.0;	//redondear resultado
					resultTexto.setText(String.valueOf(resultado));
				} catch (NullPointerException | NumberFormatException ex1) {
					System.out.println("Introduce un valor correcto");
				}

			}
		});
	}

	private void btnRestar(JButton btn, JLabel op) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					double valor1 = Double.parseDouble(campoTexto.getText());
					double valor2 = Double.parseDouble(campoTexto2.getText());

					op.setText("-");

					double resultado = valor1 - valor2;
					resultado = Math.round(resultado * 100.0) / 100.0;
					resultTexto.setText(String.valueOf(resultado));
				} catch (NullPointerException | NumberFormatException ex1) {
					System.out.println("Introduce un valor correcto");
				}
			}
		});
	}

	// Asignar un Listener al botón de Multiplicación
	private void btnMultiplicar(JButton btn, JLabel op) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					double valor1 = Double.parseDouble(campoTexto.getText());
					double valor2 = Double.parseDouble(campoTexto2.getText());

					op.setText("*");

					double resultado = valor1 * valor2;
					resultado = Math.round(resultado * 100.0) / 100.0;
					resultTexto.setText(String.valueOf(resultado));
				} catch (NullPointerException | NumberFormatException ex1) {
					System.out.println("Introduce un valor correcto");
				}

			}
		});
	}

	// Asignar un Listener al botón de División
	private void btnDividir(JButton btn, JLabel op) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					double valor1 = Double.parseDouble(campoTexto.getText());
					double valor2 = Double.parseDouble(campoTexto2.getText());

					op.setText("/");

					double resultado = valor1 / valor2;
					resultado = Math.round(resultado * 100.0) / 100.0;
					resultTexto.setText(String.valueOf(resultado));
				} catch (NullPointerException | NumberFormatException ex1) {
					System.out.println("Introduce un valor correcto");
				}

			}
		});
	}

	private void btnSalir(JButton btn) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);//Salir
			}
		});
	}
}
