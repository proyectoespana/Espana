package Vista;

import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana_Mercancia_Aragon {
	private JPanel panel;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JSlider barra1;
	private JSlider barra2;
	private JTextField texto1;
	private JTextField texto2;
	private JButton boton;
	private JFrame ventana;
	
	public Ventana_Mercancia_Aragon() {
		ventana=new JFrame("Mercancia Aragon");
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
	
	public void colocarTexto() {
		texto1 = new JTextField();
		texto1.setBounds(270, 63, 50, 20);
		panel.add(texto1);

		texto2 = new JTextField();
		texto2.setBounds(270, 133, 50, 20);
		panel.add(texto2);
	}

	public void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		ventana.setContentPane(panel);
	}

	public void colocarSliders() {

		barra1 = new JSlider();

		barra1.setBounds(70, 60, 170, 30);
		//		slider1.contains(0, 1000);
		barra1.setMaximum(2500);
		panel.add(barra1);

		barra2 = new JSlider();

		barra2.setBounds(70, 130, 170, 30);
		//		slider2.contains(0, 1000);
		barra2.setMaximum(2500);
		panel.add(barra2);

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
	}
	
	public void colocarEtiquetas() {
		etiqueta1 = new JLabel("Uvas ------ 2500 Kg");
		etiqueta1.setBounds(105, 40, 129, 14);
		panel.add(etiqueta1);
		
		etiqueta2 = new JLabel("Trigo ------ 20000 Kg");
		etiqueta2.setBounds(105, 110, 129, 14);
		panel.add(etiqueta2);
		
	}
	
	public void colocarBoton() {
		boton = new JButton("Comerciar");
		boton.setBounds(143, 200, 110, 40); //Cambiado a 143 (se ve mas centrado)
		panel.add(boton);
	}

}
/*
Panel panel_3 = new Panel();
panel_3.setLayout(null);
panel_3.setBounds(0, 0, 220, 185);
mnAragon_1.add(panel_3);

JLabel lblOro_1 = new JLabel("Uvas ------ 2500 Kg");
lblOro_1.setBounds(40, 0, 129, 14);
panel_3.add(lblOro_1);

JLabel lblMaiz_1 = new JLabel("Trigo ------ 20000 Kg");
lblMaiz_1.setBounds(40, 50, 129, 14);
panel_3.add(lblMaiz_1);

JSlider slider_3 = new JSlider();
slider_3.setBounds(10, 20, 140, 23);
panel_3.add(slider_3);

JSlider slider_4 = new JSlider();
slider_4.setBounds(10, 70, 140, 23);
panel_3.add(slider_4);

JTextField textPane_3 = new JTextField();
textPane_3.setBounds(160, 20, 40, 20);
panel_3.add(textPane_3);

JTextField textPane_4 = new JTextField();
textPane_4.setBounds(160, 70, 40, 20);
panel_3.add(textPane_4);

JButton btnComerciar_1 = new JButton("Comerciar");
btnComerciar_1.setBounds(50, 148, 95, 23);
panel_3.add(btnComerciar_1);*/
