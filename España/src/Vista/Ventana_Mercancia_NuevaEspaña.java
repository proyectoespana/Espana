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

public class Ventana_Mercancia_NuevaEspaña {
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
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JFrame ventana;
	private PanelControl control;
	
	public Ventana_Mercancia_NuevaEspaña(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Mercancia Nueva España");
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
	
	public void colocarSliders() {
		barra1 = new JSlider();
		barra1.setBounds(70, 30, 170, 30);
		//		slider1.contains(0, 1000);
		barra1.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionOro().getCantidad());
		panel.add(barra1);

		barra2 = new JSlider();

		barra2.setBounds(70, 90, 170, 30);
		//		slider2.contains(0, 1000);
		barra2.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getCantidad());
		panel.add(barra2);

		barra3 = new JSlider();

		barra3.setBounds(70, 150, 170, 30);
		//		slider3.contains(0, 1000);
		barra3.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionTomate().getCantidad());
		panel.add(barra3);

		barra4=new JSlider();

		barra4.setBounds(70, 210, 170, 30);
		//		slider3.contains(0, 1000);
		barra4.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getCantidad());
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
		texto1.setEditable(false);
		panel.add(texto1);

		texto2 = new JTextField();
		texto2.setBounds(270, 93, 50, 20);
		texto2.setEditable(false);
		panel.add(texto2);

		texto3 = new JTextField();
		texto3.setBounds(270, 153, 50, 20);
		texto3.setEditable(false);
		panel.add(texto3);

		texto4=new JTextField();
		texto4.setBounds(270, 213, 50, 20);
		texto4.setEditable(false);
		panel.add(texto4);
	}

	public void colocarBoton() {
		boton = new JButton("Mercancia Oro");
		boton.setBounds(350, 20, 150, 40);
		panel.add(boton);

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!texto1.getText().equals("0") && !texto1.getText().equals("")) {
						if(Integer.parseInt(texto1.getText())>(control.getEspana().getNuevaEspaña().getRecoleccionOro().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getNuevaEspaña(), Integer.parseInt(texto1.getText()), ProductoNombre.Oro);
							etiqueta1.setText(control.getEspana().getNuevaEspaña().getRecoleccionOro().getNombre()+" "+control.getEspana().getNuevaEspaña().getRecoleccionOro().getCantidad()+" kg");
							barra1.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionOro().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getNuevaEspaña().getRecoleccionOro().getCantidad()*50)/100+"");
						}
						
					}
				
				} catch (Exception e1) {
					// TODO Auto-generated catch block
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
					if(!texto2.getText().equals("0") && !texto2.getText().equals("")) {
						if(Integer.parseInt(texto2.getText())>(control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getNuevaEspaña(), Integer.parseInt(texto2.getText()), ProductoNombre.Maiz);
							etiqueta2.setText(control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getNombre()+" "+control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getCantidad()+" kg");
							barra2.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getNuevaEspaña().getRecoleccionMaiz().getCantidad()*50)/100+"");
						}
					
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
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
					if(!texto3.getText().equals("0") && !texto3.getText().equals("")) {
						if(Integer.parseInt(texto3.getText())>(control.getEspana().getNuevaEspaña().getRecoleccionTomate().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getNuevaEspaña(), Integer.parseInt(texto3.getText()), ProductoNombre.Tomate);
							etiqueta3.setText(control.getEspana().getNuevaEspaña().getRecoleccionTomate().getNombre()+" "+control.getEspana().getNuevaEspaña().getRecoleccionTomate().getCantidad()+" kg");
							barra3.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionTomate().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getNuevaEspaña().getRecoleccionTomate().getCantidad()*50)/100+"");
						}
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};
		
		boton3.addActionListener(listener3);
		
		boton4 = new JButton("Mercancia Trigo");
		boton4.setBounds(350, 200, 150, 40);
		panel.add(boton4);
		//trigo
		
		ActionListener listener4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(!texto4.getText().equals("0") && !texto4.getText().equals("")) {
						if(Integer.parseInt(texto4.getText())>(control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getCantidad()*50)/100) {
							control.crearMercancias(control.getEspana().getNuevaEspaña(), Integer.parseInt(texto4.getText()), ProductoNombre.Trigo);
							etiqueta4.setText(control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getNombre()+" "+control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getCantidad()+" kg");
							barra4.setMaximum(control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getCantidad());
						}else {
							JOptionPane.showMessageDialog(null," Tine que crear una mercancia superio a "+(control.getEspana().getNuevaEspaña().getRecoleccionTrigo().getCantidad()*50)/100+"");
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

