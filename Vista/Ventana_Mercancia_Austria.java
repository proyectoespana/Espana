package Vista;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana_Mercancia_Austria {
	private JPanel panel;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JSlider barra1;
	private JSlider barra2;
	private JSlider barra3;
	private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;
	private JButton boton;
	private JFrame ventana;

	public Ventana_Mercancia_Austria() {
		ventana=new JFrame("Mercancia Austria");
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
		etiqueta1 = new JLabel("Arroz ------ 2500 Kg");
		etiqueta1.setBounds(105, 10, 129, 14);
		panel.add(etiqueta1);

		etiqueta2 = new JLabel("Algodon ------ 20000 Kg");
		etiqueta2.setBounds(105, 70, 129, 14);
		panel.add(etiqueta2);

		etiqueta3 = new JLabel("Uvas ------ 2500 Kg");
		etiqueta3.setBounds(105, 130, 129, 14);
		panel.add(etiqueta3);

	}


	public void colocarSliders() {

		barra1 = new JSlider();

		barra1.setBounds(70, 30, 170, 30);
		//		slider1.contains(0, 1000);
		barra1.setMaximum(2500);
		panel.add(barra1);

		barra2 = new JSlider();

		barra2.setBounds(70, 90, 170, 30);
		//		slider2.contains(0, 1000);
		barra2.setMaximum(2500);
		panel.add(barra2);

		barra3 = new JSlider();

		barra3.setBounds(70, 150, 170, 30);
		//		slider3.contains(0, 1000);
		barra3.setMaximum(2500);
		panel.add(barra3);

		barra1.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				texto1.setText(String.valueOf(source.getValue()));
			}
		});

		barra2.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				texto2.setText(String.valueOf(source.getValue()));
			}
		});

		barra3.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				texto3.setText(String.valueOf(source.getValue()));
			}
		});


	}

	public void colocarTexto() {
		texto1 = new JTextField();
		texto1.setBounds(270, 33, 50, 20);
		panel.add(texto1);

		texto2 = new JTextField();
		texto2.setBounds(270, 93, 50, 20);
		panel.add(texto2);

		texto3 = new JTextField();
		texto3.setBounds(270, 153, 50, 20);
		panel.add(texto3);
	}

	public void colocarBoton() {
		boton = new JButton("Comerciar");
		boton.setBounds(143, 200, 110, 40);
		panel.add(boton);
	}




}

/*
Panel panel_5 = new Panel();
panel_5.setLayout(null);
panel_5.setBounds(0, 0, 220, 185);
mnAustria.add(panel_5);

JLabel lblOro_3 = new JLabel("Arroz ------ 2500 Kg");
lblOro_3.setBounds(40, 0, 129, 14);
panel_5.add(lblOro_3);

JLabel lblMaiz_3 = new JLabel("Algodón ------ 20000 Kg");
lblMaiz_3.setBounds(40, 50, 129, 14);
panel_5.add(lblMaiz_3);

JLabel lblTomate_2 = new JLabel("Uvas ------ 61000 Kg");
lblTomate_2.setBounds(40, 100, 129, 14);
panel_5.add(lblTomate_2);

JSlider slider_7 = new JSlider();
slider_7.setBounds(10, 20, 140, 23);
panel_5.add(slider_7);

JSlider slider_8 = new JSlider();
slider_8.setBounds(10, 70, 140, 23);
panel_5.add(slider_8);

JSlider slider_9 = new JSlider();
slider_9.setBounds(10, 120, 140, 23);
panel_5.add(slider_9);

JTextField textPane_7 = new JTextField();
textPane_7.setBounds(160, 20, 40, 20);
panel_5.add(textPane_7);

JTextField textPane_8 = new JTextField();
textPane_8.setBounds(160, 70, 40, 20);
panel_5.add(textPane_8);

JTextField textPane_9 = new JTextField();
textPane_9.setBounds(160, 120, 40, 20);
panel_5.add(textPane_9);

JButton btnComerciar_3 = new JButton("Comerciar");
btnComerciar_3.setBounds(50, 148, 95, 23);
panel_5.add(btnComerciar_3);
 */