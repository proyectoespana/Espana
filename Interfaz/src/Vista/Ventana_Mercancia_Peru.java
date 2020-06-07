package Vista;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana_Mercancia_Peru {
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

	public Ventana_Mercancia_Peru() {
		ventana = new JFrame("Mercancia Peru");
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
		etiqueta1 = new JLabel("Oro ------ 2500 Kg");
		etiqueta1.setBounds(105, 10, 129, 14);
		panel.add(etiqueta1);

		etiqueta2 = new JLabel("Maiz ------ 20000 Kg");
		etiqueta2.setBounds(105, 70, 129, 14);
		panel.add(etiqueta2);

		etiqueta3 = new JLabel("Tomate ------ 2500 Kg");
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

Panel panel_1_2 = new Panel();
panel_1_2.setLayout(null);
panel_1_2.setBounds(0, 0, 220, 230);
mnNewMenu_3.add(panel_1_2);

JLabel lblOro_4_2 = new JLabel("Oro ------ 2500 Kg");
lblOro_4_2.setBounds(40, 0, 129, 14);
panel_1_2.add(lblOro_4_2);

JLabel lblMaiz_4_2 = new JLabel("Maiz ------ 2000 Kg");
lblMaiz_4_2.setBounds(40, 50, 129, 14);
panel_1_2.add(lblMaiz_4_2);

JLabel lblTomate_1_2 = new JLabel("Tomate ------ 6100 Kg");
lblTomate_1_2.setBounds(40, 100, 129, 14);
panel_1_2.add(lblTomate_1_2);

JLabel lblTomate_11_2 = new JLabel("Patata ------ 222 Kg");
lblTomate_11_2.setBounds(40, 146, 129, 14);
panel_1_2.add(lblTomate_11_2);

JSlider slider_18 = new JSlider();
slider_18.setBounds(10, 20, 140, 23);
panel_1_2.add(slider_18);

JSlider slider_19 = new JSlider();
slider_19.setBounds(10, 70, 140, 23);
panel_1_2.add(slider_19);

JSlider slider_20 = new JSlider();
slider_20.setBounds(10, 120, 140, 23);
panel_1_2.add(slider_20);

JSlider slider_21 = new JSlider();
slider_21.setBounds(10, 165, 140, 23);
panel_1_2.add(slider_21);

JTextPane textPane_18= new JTextPane();
textPane_18.setBounds(160, 20, 40, 20);
panel_1_2.add(textPane_18);

JTextField textPane_19 = new JTextField();
textPane_19.setBounds(160, 70, 40, 20);
panel_1_2.add(textPane_19);

JTextField textPane_20 = new JTextField();
textPane_20.setBounds(160, 120, 40, 20);
panel_1_2.add(textPane_20);

JTextField textPane_21 = new JTextField();
textPane_21.setBounds(160, 165, 40, 20);
panel_1_2.add(textPane_21);

JButton btnComerciar_4_2 = new JButton("Comerciar");
btnComerciar_4_2.setBounds(50, 192, 95, 23);
panel_1_2.add(btnComerciar_4_2);*/