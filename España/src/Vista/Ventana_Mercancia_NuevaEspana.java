package Vista;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Clases.ProductoNombre;
import Main.PanelControl;
/**
 * 
 * @author Grupo
 *
 */
public class Ventana_Mercancia_NuevaEspana {
	/**
	 * declaramos el panel donde se guardarán los diferentes elementos
	 */
	private JPanel panel;
	/**
	 * declaramos la etiqueta numero 1 donde se pondrá información en ella
	 */
	private JLabel etiqueta1;
	/**
	 * declaramos la etiqueta numero 2 donde se pondrá información en ella
	 */
	private JLabel etiqueta2;
	/**
	 * declaramos la etiqueta numero 3 donde se pondrá información en ella
	 */
	private JLabel etiqueta3;
	/**
	 * declaramos la etiqueta numero 4 donde se pondrá información en ella
	 */
	private JLabel etiqueta4;
	/**
	 * declaramos un deslizador para moverlo a nuestro gusto para poder añadir datos
	 */
	private JSlider slider1;
	/**
	 * declaramos un deslizador para moverlo a nuestro gusto para poder añadir datos
	 */
	private JSlider slider2;
	/**
	 * declaramos un deslizador para moverlo a nuestro gusto para poder añadir datos
	 */
	private JSlider slider3;
	/**
	 * declaramos un deslizador para moverlo a nuestro gusto para poder añadir datos
	 */
	private JSlider slider4;
	/**
	 * declaramos un elemento para utilizarlo para la captura de datos
	 */
	private JTextField cajaTexto1;
	/**
	 * declaramos un segundo elemento para utilizarlo para la captura de datos
	 */
	private JTextField cajaTexto2;
	/**
	 * declaramos un segundo elemento para utilizarlo para la captura de datos
	 */
	private JTextField cajaTexto3;
	/**
	 * declaramos un segundo elemento para utilizarlo para la captura de datos
	 */
	private JTextField cajaTexto4;
	/**
	 * declaramos un boton
	 */
	private JButton boton;
	/**
	 * declaramos un segundo boton
	 */
	private JButton boton2;
	/**
	 * declaramos un tercero boton
	 */
	private JButton boton3;
	/**
	 * declaramos un cuarto boton
	 */
	private JButton boton4;
	/**
	 * declaramos la ventana donde se encontrarán todos los elementos que contiene el panel
	 */
	private JFrame ventana;
	/**
	 * declaramos un atributo de tipo PanelControl que se encargará de administrar los datos
	 */
	private PanelControl control;

	/**
	 * Constructor de la clase
	 * @param control de tipo PanelControl que administra los datos 
	 */
	public Ventana_Mercancia_NuevaEspana(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Mercancia Nueva España");
		ventana.setSize(565, 300);
		iniciarComponentes();
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	/**
	 * Método que se encarga de iniciar los diferentes componentes que se pondrán en la ventana
	 */
	public void iniciarComponentes() {
		colocarPanel();
		colocarEtiquetas();
		colocarSliders();
		colocarTexto();
		colocarBoton();
	}

	/**
	 * Método que se encarga de inicializar el panel
	 */
	public void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		ventana.setContentPane(panel);
	}
	
	/**
	 * Método que se encarga de inicializar las etiquetas y de añadirlas al panel
	 * En este caso añade métodos recolección Oro, recolección Maíz, recolección Tomate y recolección Trigo
	 */
	public void colocarEtiquetas() {
		//oro
		etiqueta1 = new JLabel(control.getEspana().getNuevaEspaña().getRecoleccionOro().getNombre()+" "+control.getEspana().getNuevaEspaña().getRecoleccionOro().getCantidad()+" kg");
		etiqueta1.setBounds(105, 10, 129, 14);
		panel.add(etiqueta1);
		//Maiz
		etiqueta2 = new JLabel(control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getNombre()+" "+control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getCantidad()+" kg");
		etiqueta2.setBounds(105, 70, 129, 14);
		panel.add(etiqueta2);
		//tomate
		etiqueta3 = new JLabel(control.getEspana().getNuevaEspaña().getRecoleccionTomate().getNombre()+" "+control.getEspana().getNuevaEspaña().getRecoleccionTomate().getCantidad()+" kg");
		etiqueta3.setBounds(105, 130, 129, 14);
		panel.add(etiqueta3);
		//trigo
		etiqueta4 = new JLabel(control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getNombre()+" "+control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getCantidad()+" kg");
		etiqueta4.setBounds(105, 190, 129, 14);
		panel.add(etiqueta4);

	}
	
	/**
	 * Método que se encargar de inicializar los deslizadores y que a la hora de seleccionar un valor se reproduzca en la caja de texto
	 * mediante el método stateChanged
	 */
	public void colocarSliders() {
		slider1 = new JSlider();
		slider1.setBounds(70, 30, 170, 30);
		//		slider1.contains(0, 1000);
		slider1.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionOro().getCantidad());
		panel.add(slider1);

		slider2 = new JSlider();

		slider2.setBounds(70, 90, 170, 30);
		//		slider2.contains(0, 1000);
		slider2.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getCantidad());
		panel.add(slider2);

		slider3 = new JSlider();

		slider3.setBounds(70, 150, 170, 30);
		//		slider3.contains(0, 1000);
		slider3.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionTomate().getCantidad());
		panel.add(slider3);

		slider4=new JSlider();

		slider4.setBounds(70, 210, 170, 30);
		//		slider3.contains(0, 1000);
		slider4.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getCantidad());
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
	
	/**
	 * Método para iniclializar las cajas de texto 
	 */
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

		cajaTexto4=new JTextField();
		cajaTexto4.setBounds(270, 213, 50, 20);
		cajaTexto4.setEditable(false);
		panel.add(cajaTexto4);
	}

	/**
	 * Método para mandar crear las mercancias con la cantidad seleccionada y en el caso que al crear la mercancia sea menor a lo provisto
	 * aparece una ventana emergente como aviso que hay que crear la mercancia junto con una cantidad adecuada
	 */
	public void colocarBoton() {
		boton = new JButton("Mercancia Oro");
		boton.setBounds(350, 20, 150, 40);
		panel.add(boton);

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto1.getText().equals("0") && !cajaTexto1.getText().equals("")) {
						if(Integer.parseInt(cajaTexto1.getText())>(control.getEspana().getNuevaEspaña().getRecoleccionOro().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getNuevaEspaña(), Integer.parseInt(cajaTexto1.getText()), ProductoNombre.Oro);
							etiqueta1.setText(control.getEspana().getNuevaEspaña().getRecoleccionOro().getNombre()+" "+control.getEspana().getNuevaEspaña().getRecoleccionOro().getCantidad()+" kg");
							slider1.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionOro().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tiene que crear una mercancia superior a "+(control.getEspana().getNuevaEspaña().getRecoleccionOro().getCantidad()*50)/100+"");
						}
						
					}
				
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		};
		boton.addActionListener(listener);
		
		boton2 = new JButton("Mercancia Maiz");
		boton2.setBounds(350, 80, 150, 40);
		panel.add(boton2);

		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto2.getText().equals("0") && !cajaTexto2.getText().equals("")) {
						if(Integer.parseInt(cajaTexto2.getText())>(control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getNuevaEspaña(), Integer.parseInt(cajaTexto2.getText()), ProductoNombre.Maiz);
							etiqueta2.setText(control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getNombre()+" "+control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getCantidad()+" kg");
							slider2.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tiene que crear una mercancia superior a "+(control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getCantidad()*50)/100+"");
						}
					
					}
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		};
		
		boton2.addActionListener(listener2);
		
		boton3 = new JButton("Mercancia Tomate");
		boton3.setBounds(350, 140, 150, 40);
		panel.add(boton3);

		ActionListener listener3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto3.getText().equals("0") && !cajaTexto3.getText().equals("")) {
						if(Integer.parseInt(cajaTexto3.getText())>(control.getEspana().getNuevaEspaña().getRecoleccionTomate().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getNuevaEspaña(), Integer.parseInt(cajaTexto3.getText()), ProductoNombre.Tomate);
							etiqueta3.setText(control.getEspana().getNuevaEspaña().getRecoleccionTomate().getNombre()+" "+control.getEspana().getNuevaEspaña().getRecoleccionTomate().getCantidad()+" kg");
							slider3.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionTomate().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tiene que crear una mercancia superior a "+(control.getEspana().getNuevaEspaña().getRecoleccionTomate().getCantidad()*50)/100+"");
						}
					}
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		};
		
		boton3.addActionListener(listener3);
		
		boton4 = new JButton("Mercancia Trigo");
		boton4.setBounds(350, 200, 150, 40);
		panel.add(boton4);
		
		ActionListener listener4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!cajaTexto4.getText().equals("0") && !cajaTexto4.getText().equals("")) {
						if(Integer.parseInt(cajaTexto4.getText())>(control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getNuevaEspaña(), Integer.parseInt(cajaTexto4.getText()), ProductoNombre.Trigo);
							etiqueta4.setText(control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getNombre()+" "+control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getCantidad()+" kg");
							slider4.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tiene que crear una mercancia superior a "+(control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getCantidad()*50)/100+"");
						}
					}
			
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		};
		
		boton4.addActionListener(listener4);
	}

}

