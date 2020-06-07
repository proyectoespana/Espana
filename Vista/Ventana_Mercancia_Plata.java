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

public class Ventana_Mercancia_Plata {
	private JPanel panel;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JLabel etiqueta4;
	private JSlider barra1;
	private JSlider barra2;
	private JSlider barra3;
	private JSlider barra4;
	private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;
	private JTextField texto4;
	private JButton boton;
	private JFrame ventana;

	public Ventana_Mercancia_Plata() {
		ventana = new JFrame("Mercancia Plata");
		ventana.setSize(460, 370);
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
		etiqueta1 = new JLabel("Plata ------ 2500 Kg");
		etiqueta1.setBounds(105, 10, 129, 14);
		panel.add(etiqueta1);

		etiqueta2 = new JLabel("Tabaco ------ 20000 Kg");
		etiqueta2.setBounds(105, 70, 129, 14);
		panel.add(etiqueta2);

		etiqueta3 = new JLabel("Cafe ------ 2500 Kg");
		etiqueta3.setBounds(105, 130, 129, 14);
		panel.add(etiqueta3);

		etiqueta4 = new JLabel("Patata ------ 2500 Kg");
		etiqueta4.setBounds(105, 190, 129, 14);
		panel.add(etiqueta4);

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

		barra4=new JSlider();

		barra4.setBounds(70, 210, 170, 30);
		//		slider3.contains(0, 1000);
		barra4.setMaximum(2500);
		panel.add(barra4);


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

		barra4.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				texto4.setText(String.valueOf(source.getValue()));
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

		texto4=new JTextField();
		texto4.setBounds(270, 213, 50, 20);
		panel.add(texto4);
	}

	public void colocarBoton() {
		boton = new JButton("Comerciar");
		boton.setBounds(153, 265, 110, 40);
		panel.add(boton);
	}

}
/*


Panel panel_1 = new Panel();
panel_1.setLayout(null);
panel_1.setBounds(0, 0, 220, 230);
mnNewMenu_1.add(panel_1);

JLabel lblMaiz_4 = new JLabel("Maiz ------ 2500 Kg");
lblMaiz_4.setBounds(40, 0, 129, 14);
panel_1.add(lblMaiz_4);

JLabel lblOro_4 = new JLabel("Oro ------ 2000 Kg");
lblOro_4.setBounds(40, 50, 129, 14);
panel_1.add(lblOro_4);

JLabel lblCacao_1 = new JLabel("Cacao ------ 6100 Kg");
lblCacao_1.setBounds(40, 100, 129, 14);
panel_1.add(lblCacao_1);

JLabel lblTomate_11 = new JLabel("Tomate ------ 222 Kg");
lblTomate_11.setBounds(40, 146, 129, 14);
panel_1.add(lblTomate_11);

JSlider slider_10 = new JSlider();
slider_10.setBounds(10, 20, 140, 23);
panel_1.add(slider_10);

JSlider slider_11 = new JSlider();
slider_11.setBounds(10, 70, 140, 23);
panel_1.add(slider_11);

JSlider slider_12 = new JSlider();
slider_12.setBounds(10, 120, 140, 23);
panel_1.add(slider_12);

JSlider slider_13 = new JSlider();
slider_13.setBounds(10, 165, 140, 23);
panel_1.add(slider_13);

JTextField textPane_10 = new JTextField();
textPane_10.setBounds(160, 20, 40, 20);
panel_1.add(textPane_10);

JTextField textPane_11 = new JTextField();
textPane_11.setBounds(160, 70, 40, 20);
panel_1.add(textPane_11);

JTextField textPane_12 = new JTextField();
textPane_12.setBounds(160, 120, 40, 20);
panel_1.add(textPane_12);

JTextField textPane_13 = new JTextField();
textPane_13.setBounds(160, 165, 40, 20);
panel_1.add(textPane_13);

JButton btnComerciar_4 = new JButton("Comerciar");
btnComerciar_4.setBounds(50, 192, 95, 23);
panel_1.add(btnComerciar_4);
 */