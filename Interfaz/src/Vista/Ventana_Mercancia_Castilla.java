package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
	private JFrame ventana;

	public Ventana_Mercancia_Castilla() {
		ventana = new JFrame("Mercancia Castilla");
		ventana.setSize(420, 320);
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
		etiqueta1 = new JLabel("Trigo ------ 2500 Kg");
		etiqueta1.setBounds(105, 10, 129, 14);
		panel.add(etiqueta1);

		etiqueta2 = new JLabel("Uvas ------ 20000 Kg");
		etiqueta2.setBounds(105, 70, 129, 14);
		panel.add(etiqueta2);

		etiqueta3 = new JLabel("Hierro ------ 2500 Kg");
		etiqueta3.setBounds(105, 130, 129, 14);
		panel.add(etiqueta3);

	}

	public void colocarSliders() {
		slider1 = new JSlider();
		slider1.setBounds(70, 30, 170, 30);
		//		slider1.contains(0, 1000);
		slider1.setMaximum(2500);
		panel.add(slider1);

		slider2 = new JSlider();

		slider2.setBounds(70, 90, 170, 30);
		//		slider2.contains(0, 1000);
		slider2.setMaximum(2500);
		panel.add(slider2);

		slider3 = new JSlider();

		slider3.setBounds(70, 150, 170, 30);
		//		slider3.contains(0, 1000);
		slider3.setMaximum(2500);
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
		panel.add(cajaTexto1);

		cajaTexto2 = new JTextField();
		cajaTexto2.setBounds(270, 93, 50, 20);
		panel.add(cajaTexto2);

		cajaTexto3 = new JTextField();
		cajaTexto3.setBounds(270, 153, 50, 20);
		panel.add(cajaTexto3);
	}

	public void colocarBoton() {
		boton = new JButton("Comerciar");
		boton.setBounds(143, 200, 110, 40);
		panel.add(boton);
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


