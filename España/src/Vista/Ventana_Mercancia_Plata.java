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

public class Ventana_Mercancia_Plata {

	private JPanel panel;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JLabel etiqueta4;
	private JSlider slider1;
	private JSlider slider2;
	private JSlider slider3;
	private JSlider slider4;
	private JTextField cajaTexto1;
	private JTextField cajaTexto2;
	private JTextField cajaTexto3;
	private JTextField cajaTexto4;
	private JButton boton;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JFrame ventana;
	private PanelControl control;

	public Ventana_Mercancia_Plata(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Mercancia Plata");
		ventana.setSize(565, 300);
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
		//Plata ------ x Kg
		etiqueta1 = new JLabel(control.getEspana().getPlata().getRecoleccionPlata().getNombre()+" "+control.getEspana().getPlata().getRecoleccionPlata().getCantidad()+" kg");
		etiqueta1.setBounds(105, 10, 129, 14);
		panel.add(etiqueta1);
		//Tabaco ------ x Kg
		etiqueta2 = new JLabel(control.getEspana().getPlata().getRecoleccionTabaco().getNombre()+" "+control.getEspana().getPlata().getRecoleccionTabaco().getCantidad()+" kg");
		etiqueta2.setBounds(105, 70, 129, 14);
		panel.add(etiqueta2);
		//Cafe ------ x Kg
		etiqueta3 = new JLabel(control.getEspana().getPlata().getRecoleccionCafe().getNombre()+" "+control.getEspana().getPlata().getRecoleccionCafe().getCantidad()+" kg");
		etiqueta3.setBounds(105, 130, 129, 14);
		panel.add(etiqueta3);
		//Patata
		etiqueta4 = new JLabel(control.getEspana().getPlata().getRecoleccionPatata().getNombre()+" "+control.getEspana().getPlata().getRecoleccionPatata().getCantidad()+" kg");
		etiqueta4.setBounds(105, 190, 129, 14);
		panel.add(etiqueta4);

	}

	public void colocarSliders() {
		slider1 = new JSlider();
		slider1.setBounds(70, 30, 170, 30);
		//		slider1.contains(0, 1000);
		slider1.setMaximum(control.getEspana().getPlata().getRecoleccionPlata().getCantidad());
		panel.add(slider1);

		slider2 = new JSlider();

		slider2.setBounds(70, 90, 170, 30);
		//		slider2.contains(0, 1000);
		slider2.setMaximum(control.getEspana().getPlata().getRecoleccionTabaco().getCantidad());
		panel.add(slider2);

		slider3 = new JSlider();

		slider3.setBounds(70, 150, 170, 30);
		//		slider3.contains(0, 1000);
		slider3.setMaximum(control.getEspana().getPlata().getRecoleccionCafe().getCantidad());
		panel.add(slider3);
		
		slider4 = new JSlider();

		slider4.setBounds(70, 210, 170, 30);
		//		slider3.contains(0, 1000);
		slider4.setMaximum(control.getEspana().getPlata().getRecoleccionPatata().getCantidad());
		panel.add(slider4);

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
		
		slider4.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();

				cajaTexto4.setText(String.valueOf(source.getValue()));

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
		
		cajaTexto4 = new JTextField();
		cajaTexto4.setBounds(270, 213, 50, 20);
		cajaTexto4.setEditable(false);
		panel.add(cajaTexto4);
	}

	public void colocarBoton() {
		boton = new JButton("Mercancia Plata");
		boton.setBounds(350, 20, 150, 40);
		panel.add(boton);

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto1.getText().equals("0") && !cajaTexto1.getText().equals("")) {
						if(Integer.parseInt(cajaTexto1.getText())>(control.getEspana().getPlata().getRecoleccionPlata().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getPlata(), Integer.parseInt(cajaTexto1.getText()), ProductoNombre.Plata);
							etiqueta1.setText(control.getEspana().getPlata().getRecoleccionPlata().getNombre()+" "+control.getEspana().getPlata().getRecoleccionPlata().getCantidad()+" kg");
							slider1.setMaximum(control.getEspana().getPlata().getRecoleccionPlata().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getPlata().getRecoleccionPlata().getCantidad()*50)/100+"");
						}		
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		boton.addActionListener(listener);
		
		boton2 = new JButton("Mercancia Tabaco");
		boton2.setBounds(350, 80, 150, 40);
		panel.add(boton2);

		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto2.getText().equals("0") && !cajaTexto2.getText().equals("")) {
						if(Integer.parseInt(cajaTexto2.getText())>(control.getEspana().getPlata().getRecoleccionTabaco().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getPlata(), Integer.parseInt(cajaTexto2.getText()), ProductoNombre.Tabaco);
							etiqueta2.setText(control.getEspana().getPlata().getRecoleccionTabaco().getNombre()+" "+control.getEspana().getPlata().getRecoleccionTabaco().getCantidad()+" kg");
							slider2.setMaximum(control.getEspana().getPlata().getRecoleccionTabaco().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getPlata().getRecoleccionTabaco().getCantidad()*50)/100+"");
						}
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		
		boton2.addActionListener(listener2);
		
		boton3 = new JButton("Mercancia Cafe");
		boton3.setBounds(350, 140, 150, 40);
		panel.add(boton3);

		ActionListener listener3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto3.getText().equals("0") && !cajaTexto3.getText().equals("")) {
						if(Integer.parseInt(cajaTexto3.getText())>(control.getEspana().getPlata().getRecoleccionCafe().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getPlata(), Integer.parseInt(cajaTexto3.getText()), ProductoNombre.Cafe);
							etiqueta3.setText(control.getEspana().getPlata().getRecoleccionCafe().getNombre()+" "+control.getEspana().getPlata().getRecoleccionCafe().getCantidad()+" kg");
							slider3.setMaximum(control.getEspana().getPlata().getRecoleccionCafe().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getPlata().getRecoleccionCafe().getCantidad()*50)/100+"");
						}
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		
		boton3.addActionListener(listener3);
		
		boton4 = new JButton("Mercancia Patata");
		boton4.setBounds(350, 200, 150, 40);
		panel.add(boton4);

		ActionListener listener4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto4.getText().equals("0") && !cajaTexto4.getText().equals("")) {
						if(Integer.parseInt(cajaTexto4.getText())>(control.getEspana().getPlata().getRecoleccionPatata().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getPlata(), Integer.parseInt(cajaTexto4.getText()), ProductoNombre.Patata);
							etiqueta4.setText(control.getEspana().getPlata().getRecoleccionPatata().getNombre()+" "+control.getEspana().getPlata().getRecoleccionPatata().getCantidad()+" kg");
							slider4.setMaximum(control.getEspana().getPlata().getRecoleccionPatata().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getPlata().getRecoleccionPatata().getCantidad()*50)/100+"");
						}
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		
		boton4.addActionListener(listener4);

	}
}

