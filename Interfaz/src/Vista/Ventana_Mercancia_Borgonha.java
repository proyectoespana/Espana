package Vista;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ventana_Mercancia_Borgonha {
	private JPanel panel;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JSlider barra1;
	private JSlider barra2;
	private JTextField texto1;
	private JTextField texto2;
	private JButton boton;
	private JFrame ventana;

	public Ventana_Mercancia_Borgonha() {
		ventana=new JFrame("Mercancia Borgoña");
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
		etiqueta1 = new JLabel("Hierro ------ 2500 Kg");
		etiqueta1.setBounds(105, 40, 129, 14);
		panel.add(etiqueta1);
		
		etiqueta2 = new JLabel("Arroz ------ 20000 Kg");
		etiqueta2.setBounds(105, 110, 129, 14);
		panel.add(etiqueta2);
		
	}
	
	public void colocarBoton() {
		boton = new JButton("Comerciar");
		boton.setBounds(143, 200, 110, 40); //Cambiado a 143 (se ve mas centrado)
		panel.add(boton);
	}

}

