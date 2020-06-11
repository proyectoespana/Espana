package Vista;

import java.awt.BorderLayout;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Main.PanelControl;
/**
 * 
 * @author Grupo
 *
 */

public class Ventana_Demandas_Reinos {
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
	 * declaramos la etiqueta numero 5 donde se pondrá información en ella
	 */
	private JLabel etiqueta5;
	/**
	 * declaramos la etiqueta numero 6 donde se pondrá información en ella
	 */
	private JLabel etiqueta6;
	/**
	 * declaramos la etiqueta numero 7 donde se pondrá información en ella
	 */
	private JLabel etiqueta7;
	/**
	 * declaramos la etiqueta numero 8 donde se pondrá información en ella
	 */
	private JLabel etiqueta8;
	/**
	 * declaramos la etiqueta numero 9 donde se pondrá información en ella
	 */
	private JLabel etiqueta9;
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
	public Ventana_Demandas_Reinos(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Demandas Diferentes Reinos");
		ventana.setSize(350, 520);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		iniciarComponentes();
		ventana.setResizable(false);
	}
	
	/**
	 * Método que se encarga de iniciar los diferentes componentes que se pondrán en la ventana
	 */
	public void iniciarComponentes() {
		colocarPanel();
		recorrerDemandas();
		aniadir();
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
	 * Método que recorre las diferentes demandas que tiene cada reino en cada turno de la partida,
	 * el cual recoge las diferentes demandas y las añade a una etiqueta para que el usuario pueda
	 * visualizarlas
	 */
	public void recorrerDemandas() {
		int contador=0;
		int bounds=10;
	
		if(control.getEspana().getNuevaEspaña().getProductosDemandados().length!=0) {

			if(control.getEspana().getNuevaEspaña().getProductosDemandados()[0]!=null) {
				etiqueta1= new JLabel("Nueva España demanda: "+control.getEspana().getNuevaEspaña().getProductosDemandados()[0].toString());
			}else {
				etiqueta1= new JLabel("Nueva España ha obtenido su demanda");
			}

			bounds=bounds+(20*contador);
			etiqueta1.setBounds(75, bounds, 400, 100);
			contador++;
			bounds=10;
			panel.add(etiqueta1);
		}

		if(control.getEspana().getNuevaGranda().getProductosDemandados().length!=0) {

			if(control.getEspana().getNuevaGranda().getProductosDemandados()[0]!=null) {
				etiqueta2= new JLabel("Nueva Granada demanda: "+control.getEspana().getNuevaGranda().getProductosDemandados()[0].toString());
			}else {
				etiqueta2= new JLabel("Nueva Granada ha obtenido su demanda");
			}

			bounds=bounds+(20*contador);
			etiqueta2.setBounds(75, bounds, 400, 100);
			contador++;
			bounds=10;
			panel.add(etiqueta2);
		}

		if(control.getEspana().getPeru().getProductosDemandados().length!=0) {

			if(control.getEspana().getPeru().getProductosDemandados()[0]!=null) {
				etiqueta3= new JLabel("Peru demanda: "+control.getEspana().getPeru().getProductosDemandados()[0].toString());
			}else {
				etiqueta3= new JLabel("Perú ha obtenido su demanda");
			}

			bounds=bounds+(20*contador);
			etiqueta3.setBounds(75, bounds, 400, 100);
			contador++;
			bounds=10;
			panel.add(etiqueta3);
		}

		if(control.getEspana().getPlata().getProductosDemandados().length!=0) {

			if(control.getEspana().getPlata().getProductosDemandados()[0]!=null) {
				etiqueta4= new JLabel("Plata demanda: "+control.getEspana().getPlata().getProductosDemandados()[0].toString());
			}else {
				etiqueta4= new JLabel("Plata ha obtenido su demanda");
			}

			bounds=bounds+(20*contador);
			etiqueta4.setBounds(75, bounds, 400, 100);
			contador++;
			bounds=10;
			panel.add(etiqueta4);
		}

		if(control.getEspana().getCastilla().getProductosDemandados().length!=0) {

			if(control.getEspana().getCastilla().getProductosDemandados()[0]!=null) {
				etiqueta5= new JLabel("Castilla demanda: "+control.getEspana().getCastilla().getProductosDemandados()[0].toString());
			}else {
				etiqueta5= new JLabel("Castilla ha obtenido su demanda");
			}

			bounds=bounds+(20*contador);
			etiqueta5.setBounds(75, bounds, 400, 100);
			contador++;
			bounds=10;
			panel.add(etiqueta5);
		}

		if(control.getEspana().getAragon().getProductosDemandados().length!=0) {

			if(control.getEspana().getAragon().getProductosDemandados()[0]!=null) {
				etiqueta6= new JLabel("Aragon demanda: "+control.getEspana().getAragon().getProductosDemandados()[0].toString());
			}else {
				etiqueta6= new JLabel("Aragon ha obtenido su demanda");
			}

			bounds=bounds+(20*contador);
			etiqueta6.setBounds(75, bounds, 400, 100);
			contador++;
			bounds=10;
			panel.add(etiqueta6);
		}

		if(control.getEspana().getBorgoña().getProductosDemandados().length!=0) {

			if(control.getEspana().getBorgoña().getProductosDemandados()[0]!=null) {
				etiqueta7= new JLabel("Borgoña demanda: "+control.getEspana().getBorgoña().getProductosDemandados()[0].toString());
			}else {
				etiqueta7= new JLabel("Borgoña ha obtenido su demanda");
			}

			bounds=bounds+(20*contador);
			etiqueta7.setBounds(75, bounds, 400, 100);
			contador++;
			bounds=10;
			panel.add(etiqueta7);
		}

		if(control.getEspana().getAustria().getProductosDemandados().length!=0) {

			if(control.getEspana().getAustria().getProductosDemandados()[0]!=null) {
				etiqueta8= new JLabel("Austria demanda: "+control.getEspana().getAustria().getProductosDemandados()[0].toString());
			}else {
				etiqueta8= new JLabel("Austria ha obtenido su demanda");
			}

			bounds=bounds+(20*contador);
			etiqueta8.setBounds(75, bounds, 400, 100);
			contador++;
			bounds=10;
			panel.add(etiqueta8);
		}
		
	
	}
	
	/**
	 * Método que se encarga de inicializar la etiqueta numero 9 y de añadirla una imagen.
	 * A su vez añade esta etiqueta al panel
	 */
	public void aniadir() {
		panel.setLayout(new BorderLayout());
		etiqueta9 = new JLabel(new ImageIcon("imagenes/papiro.png"));                  
		etiqueta9.setBounds(-100, 0, 100, 100);	
		panel.add(etiqueta9);
	}



}



