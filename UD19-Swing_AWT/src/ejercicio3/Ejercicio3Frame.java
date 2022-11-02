package ejercicio3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;

public class Ejercicio3Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ejercicio3Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 344, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtn = new JRadioButton("Windows");		//Radio Button con 3 opciones (Windows, Linux y Mac)
		rdbtn.setBounds(21, 32, 109, 23);
		contentPane.add(rdbtn);
		rdbtn.setActionCommand("Windows");
		
		JRadioButton rdbtn1 = new JRadioButton("Linux");
		rdbtn1.setBounds(21, 58, 109, 23);
		contentPane.add(rdbtn1);
		rdbtn1.setActionCommand("Linux");
		
		JRadioButton rdbtn2 = new JRadioButton("Mac");
		rdbtn2.setBounds(21, 84, 109, 23);
		contentPane.add(rdbtn2);
		rdbtn2.setActionCommand("Mac");
		

		ButtonGroup bgroup = new ButtonGroup();		//Agrupamos el Radio Button para que el usuario solo pueda escoger 1
		bgroup.add(rdbtn);
		bgroup.add(rdbtn1);
		bgroup.add(rdbtn2);
		
		JCheckBox cb = new JCheckBox("Programación");	//ChechBox con 3 opciones
		cb.setBounds(201, 32, 119, 23);
		contentPane.add(cb);
		
		JCheckBox cb1 = new JCheckBox("Diseño Gráfico");
		cb1.setBounds(201, 58, 119, 23);
		contentPane.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("Administración");
		cb2.setBounds(201, 84, 119, 23);
		contentPane.add(cb2);
		
		JSlider slider = new JSlider();			// Slider
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(52, 152, 200, 26);
		contentPane.add(slider);
		
		JLabel lbl = new JLabel("Sistema Operativo");
		lbl.setBounds(10, 11, 109, 14);
		contentPane.add(lbl);
		
		JLabel lbl1 = new JLabel("Especialidad");
		lbl1.setBounds(222, 11, 74, 14);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("Horas dedicadas en el ordenador");
		lbl2.setBounds(79, 127, 196, 14);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("  0");
		lbl3.setBounds(62, 179, 15, 14);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("10");
		lbl4.setBounds(237, 179, 15, 14);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel(" 5");
		lbl5.setBounds(145, 179, 15, 14);
		contentPane.add(lbl5);

		JButton btn = new JButton("Mostrar");
		btn.setBounds(110, 214, 89, 23);
		contentPane.add(btn);

		this.setVisible(true);

		btnListener(btn, bgroup, cb, cb1, cb2, slider);
	}
	
		private void btnListener(JButton btn, ButtonGroup bg, JCheckBox cb, JCheckBox cb1, JCheckBox cb2, JSlider sl) {
			btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){  
					
					JOptionPane.showMessageDialog(null, "Sistema Operativo: "+bg.getSelection().getActionCommand()
							+"\nEspecialidad: "+especialidades(cb, cb1, cb2)
							+"\nHoras Ordenador: " +sl.getValue());
		        }  	
			});
		}
		
		// Concatenamos los CheckBoxs en caso que hayan sido seleccionados 
		private String especialidades(JCheckBox cb, JCheckBox cb1, JCheckBox cb2) {
			String esp = "";
			
			if(cb.isSelected()) {
				esp += cb.getText()+" ";
			}
			if(cb1.isSelected()) {
				esp += cb1.getText()+" ";
			}
			if(cb2.isSelected()) {
				esp += cb2.getText()+" ";
			}
			
			return esp;
		}

}
