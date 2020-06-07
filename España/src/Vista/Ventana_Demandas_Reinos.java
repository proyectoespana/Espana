package Vista;

import java.awt.BorderLayout;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Main.PanelControl;


public class Ventana_Demandas_Reinos {

	private JPanel panel;
	private JLabel etiqueta;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JLabel etiqueta4;
	private JLabel etiqueta5;
	private JLabel etiqueta6;
	private JLabel etiqueta7;
	private JLabel etiqueta8;
	private JLabel etiqueta9;
	private JLabel etiqueta10;
	private JButton boton;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JFrame ventana;
	private PanelControl control;
	private ImageIcon icono;

	public Ventana_Demandas_Reinos(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Demandas Diferentes Reinos");
		ventana.setSize(350, 520);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		iniciarComponentes();
	}
	public void iniciarComponentes() {
		colocarPanel();
		recorrerDemandas();
		aniadir();
	}

	public void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);	
		ventana.setContentPane(panel);
	}



	public void recorrerDemandas() {
		int contador=0;
		int bounds=10;
	
		if(control.getEspana().getNuevaEspaña().getProductosDemandados().length!=0) {

			if(control.getEspana().getNuevaEspaña().getProductosDemandados()[0]!=null) {
				etiqueta1= new JLabel("Nueva España demanda: "+control.getEspana().getNuevaEspaña().getProductosDemandados()[0].toString());
			}else {
				etiqueta1= new JLabel("Nueva España a obtenido su demanda");
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
				etiqueta2= new JLabel("Nueva Granada a obtenido su demanda");
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
				etiqueta3= new JLabel("Peru a obtenido su demanda");
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
				etiqueta4= new JLabel("Plata a obtenido su demanda");
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
				etiqueta5= new JLabel("Castilla a obtenido su demanda");
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
				etiqueta6= new JLabel("Aragon a obtenido su demanda");
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
				etiqueta7= new JLabel("Borgoña a obtenido su demanda");
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
				etiqueta8= new JLabel("Austria a obtenido su demanda");
			}

			bounds=bounds+(20*contador);
			etiqueta8.setBounds(75, bounds, 400, 100);
			contador++;
			bounds=10;
			panel.add(etiqueta8);
		}
		
	
	}
	
	public void aniadir() {
		panel.setLayout(new BorderLayout());
		etiqueta10 = new JLabel(new ImageIcon(Ventana_Demandas_Reinos.class.getResource("papiro.png")));                  
		etiqueta10.setBounds(-100, 0, 100, 100);	
		panel.add(etiqueta10);
	}



}



