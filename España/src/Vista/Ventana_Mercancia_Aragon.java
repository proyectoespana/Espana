package Vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Clases.ProductoNombre;
import Main.PanelControl;

public class Ventana_Mercancia_Aragon {
	private JPanel panel;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JSlider slider1;
	private JSlider slider2;
	private JTextField cajaTexto1;
	private JTextField cajaTexto2;
	private JButton boton;
	private JButton boton2;
	private JFrame ventana;
	private PanelControl control;

	public Ventana_Mercancia_Aragon(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Mercancia Aragon");
		ventana.setSize(565, 190);
		ventana.setResizable(false);
		iniciarComponentes();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}


	public void iniciarComponentes() {
		colocarPanel();
		colocarEtiquetas();
		colocarSliders();
		colocarTexto();
		colocarBoton();
	}

	public void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		ventana.setContentPane(panel);
	}

	public void colocarEtiquetas() {
		//trigo ------ x Kg
		etiqueta1 = new JLabel(control.getEspana().getAragon().getRecoleccionUvas().getNombre()+" "+control.getEspana().getAragon().getRecoleccionUvas().getCantidad()+" kg");
		etiqueta1.setBounds(105, 10, 129, 14);
		panel.add(etiqueta1);
		//Uvas ------ x Kg
		etiqueta2 = new JLabel(control.getEspana().getAragon().getRecoleccionTrigo().getNombre()+" "+control.getEspana().getAragon().getRecoleccionTrigo().getCantidad()+" kg");
		etiqueta2.setBounds(105, 70, 129, 14);
		panel.add(etiqueta2);

	}

	public void colocarSliders() {
		slider1 = new JSlider();
		slider1.setBounds(70, 30, 170, 30);
		//		slider1.contains(0, 1000);
		slider1.setMaximum(control.getEspana().getAragon().getRecoleccionUvas().getCantidad());
		panel.add(slider1);

		slider2 = new JSlider();

		slider2.setBounds(70, 90, 170, 30);
		//		slider2.contains(0, 1000);
		slider2.setMaximum(control.getEspana().getAragon().getRecoleccionTrigo().getCantidad());
		panel.add(slider2);


		slider1.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				cajaTexto1.setText(String.valueOf(source.getValue()));
			}
		});

		slider2.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				cajaTexto2.setText(String.valueOf(source.getValue()));
			}
		});



	}

	public void colocarTexto() {
		cajaTexto1 = new JTextField();
		cajaTexto1.setBounds(270, 33, 50, 20);
		cajaTexto1.setEditable(false);
		panel.add(cajaTexto1);

		cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(270, 93, 50, 20);
		cajaTexto2.setEditable(false);
		panel.add(cajaTexto2);

	}

	public void colocarBoton() {
		boton = new JButton("Mercancia Uvas");
		boton.setBounds(350, 20, 150, 40);
		panel.add(boton);

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto1.getText().equals("0") && !cajaTexto1.getText().equals("")) {
						if(Integer.parseInt(cajaTexto1.getText())>(control.getEspana().getAragon().getRecoleccionUvas().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getAragon(), Integer.parseInt(cajaTexto1.getText()), ProductoNombre.Uvas);
							etiqueta1.setText(control.getEspana().getAragon().getRecoleccionUvas().getNombre()+"."+control.getEspana().getAragon().getRecoleccionUvas().getCantidad()+" kg.");
							slider1.setMaximum(control.getEspana().getAragon().getRecoleccionUvas().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getAragon().getRecoleccionUvas().getCantidad()*50)/100+"");
						}
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		};
		boton.addActionListener(listener);

		boton2 = new JButton("Mercancia Trigo");
		boton2.setBounds(350, 80, 150, 40);
		panel.add(boton2);

		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto2.getText().equals("0") && !cajaTexto2.getText().equals("")) {
						if(Integer.parseInt(cajaTexto2.getText())>(control.getEspana().getAragon().getRecoleccionTrigo().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getAragon(), Integer.parseInt(cajaTexto2.getText()), ProductoNombre.Trigo);
							etiqueta2.setText(control.getEspana().getAragon().getRecoleccionTrigo().getNombre()+"."+control.getEspana().getAragon().getRecoleccionTrigo().getCantidad()+" kg.");
							slider2.setMaximum(control.getEspana().getAragon().getRecoleccionTrigo().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getAragon().getRecoleccionTrigo().getCantidad()*50)/100+"");
						}
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		};

		boton2.addActionListener(listener2);


	}

}
