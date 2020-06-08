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

public class Ventana_Mercancia_Castilla {

	private JPanel panel;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JSlider slider1;
	private JSlider slider2;
	private JSlider slider3;
	private JTextField cajaTexto1;
	private JTextField cajaTexto2;
	private JTextField cajaTexto3;
	private JButton boton;
	private JButton boton2;
	private JButton boton3;
	private JFrame ventana;
	private PanelControl control;

	public Ventana_Mercancia_Castilla(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Mercancia Castilla");
		ventana.setSize(565, 250);
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
		etiqueta1 = new JLabel(control.getEspana().getCastilla().getRecoleccionTrigo().getNombre()+" "+control.getEspana().getCastilla().getRecoleccionTrigo().getCantidad()+" kg");
		etiqueta1.setBounds(105, 10, 129, 14);
		panel.add(etiqueta1);
		//Uvas ------ x Kg
		etiqueta2 = new JLabel(control.getEspana().getCastilla().getRecoleccionUvas().getNombre()+" "+control.getEspana().getCastilla().getRecoleccionUvas().getCantidad()+" kg");
		etiqueta2.setBounds(105, 70, 129, 14);
		panel.add(etiqueta2);
		//Hierro ------ x Kg
		etiqueta3 = new JLabel(control.getEspana().getCastilla().getRecoleccionHierro().getNombre()+" "+control.getEspana().getCastilla().getRecoleccionHierro().getCantidad()+" kg");
		etiqueta3.setBounds(105, 130, 129, 14);
		panel.add(etiqueta3);

	}

	public void colocarSliders() {
		slider1 = new JSlider();
		slider1.setBounds(70, 30, 170, 30);
		//		slider1.contains(0, 1000);
		slider1.setMaximum(control.getEspana().getCastilla().getRecoleccionTrigo().getCantidad());
		panel.add(slider1);

		slider2 = new JSlider();

		slider2.setBounds(70, 90, 170, 30);
		//		slider2.contains(0, 1000);
		slider2.setMaximum(control.getEspana().getCastilla().getRecoleccionUvas().getCantidad());
		panel.add(slider2);

		slider3 = new JSlider();

		slider3.setBounds(70, 150, 170, 30);
		//		slider3.contains(0, 1000);
		slider3.setMaximum(control.getEspana().getCastilla().getRecoleccionHierro().getCantidad());
		panel.add(slider3);

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

		slider3.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();

				cajaTexto3.setText(String.valueOf(source.getValue()));

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

		cajaTexto3 = new JTextField();
		cajaTexto3.setBounds(270, 153, 50, 20);
		cajaTexto3.setEditable(false);
		panel.add(cajaTexto3);
	}

	public void colocarBoton() {
		boton = new JButton("Mercancia Trigo");
		boton.setBounds(350, 20, 150, 40);
		panel.add(boton);

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto1.getText().equals("0") && !cajaTexto1.getText().equals("")) {
						if(Integer.parseInt(cajaTexto1.getText())>(control.getEspana().getCastilla().getRecoleccionTrigo().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getCastilla(), Integer.parseInt(cajaTexto1.getText()), ProductoNombre.Trigo);
							etiqueta1.setText(control.getEspana().getCastilla().getRecoleccionTrigo().getNombre()+" "+control.getEspana().getCastilla().getRecoleccionTrigo().getCantidad()+" kg");
							slider1.setMaximum(control.getEspana().getCastilla().getRecoleccionTrigo().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getCastilla().getRecoleccionTrigo().getCantidad()*50)/100+"");
						}
						
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		boton.addActionListener(listener);

		boton2 = new JButton("Mercancia Uvas");
		boton2.setBounds(350, 80, 150, 40);
		panel.add(boton2);

		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto2.getText().equals("0") && !cajaTexto2.getText().equals("")) {
						if(Integer.parseInt(cajaTexto2.getText())>(control.getEspana().getCastilla().getRecoleccionUvas().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getCastilla(), Integer.parseInt(cajaTexto2.getText()), ProductoNombre.Uvas);
							etiqueta2.setText(control.getEspana().getCastilla().getRecoleccionUvas().getNombre()+" "+control.getEspana().getCastilla().getRecoleccionUvas().getCantidad()+" kg");
							slider2.setMaximum(control.getEspana().getCastilla().getRecoleccionUvas().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getCastilla().getRecoleccionUvas().getCantidad()*50)/100+"");
						}
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};

		boton2.addActionListener(listener2);

		boton3 = new JButton("Mercancia Hierro");
		boton3.setBounds(350, 140, 150, 40);
		panel.add(boton3);

		ActionListener listener3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto3.getText().equals("0") && !cajaTexto3.getText().equals("")) {
						if(Integer.parseInt(cajaTexto3.getText())>(control.getEspana().getCastilla().getRecoleccionHierro().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getCastilla(), Integer.parseInt(cajaTexto3.getText()), ProductoNombre.Hierro);
							etiqueta3.setText(control.getEspana().getCastilla().getRecoleccionHierro().getNombre()+" "+control.getEspana().getCastilla().getRecoleccionHierro().getCantidad()+" kg");
							slider3.setMaximum(control.getEspana().getCastilla().getRecoleccionHierro().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getCastilla().getRecoleccionHierro().getCantidad()*50)/100+"");
						}
					
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};

		boton3.addActionListener(listener3);

	}
}



//JSlider slider = new JSlider();
//slider.setPaintLabels(true);
//slider.setPaintTicks(true);
//slider.setMaximum(2500);
//slider.setBounds(10, 20, 140, 23);
//slider.contains(0, 1000);
//panel.add(slider);

//


