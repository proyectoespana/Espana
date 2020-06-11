package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Main.PanelControl;

public class Ventana_Sublevaciones {
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
	 * declaramos la etiqueta numero 5 donde se pondrá información en ella
	 */
	private JLabel etiqueta6;
	/**
	 * declaramos la etiqueta numero 7 donde se pondrá información en ella
	 */
	private JLabel etiqueta7;
	/**
	 * declaramos una caja para poder seleccionar un elemento de entre todos los que puedan haber
	 */
	private JComboBox box2;
	/**
	 * declaramos una imagen
	 */
	private static ImageIcon imagen;
	/**
	 * declaramos una imagen
	 */
	private static ImageIcon imagen2;
	/**
	 * declaramos una imagen
	 */
	private static ImageIcon imagen3;
	/**
	 * declaramos una botón
	 */
	private JButton boton;
	/**
	 * declaramos la ventana donde se encontrarán todos los elementos que contiene el panel
	 */
	private JFrame ventana;
	/**
	 * declaramos un atributo de tipo PanelControl que se encargará de administrar los datos
	 */
	private PanelControl control;
	/**
	 * declaramos la barra de menu desplegable
	 */
	private JMenuBar menu;
	/**
	 * declaramos un submenu
	 */
	private JMenu jmenu;

	static {
		imagen = new ImageIcon("barcoNav.gif");
		imagen2 = new ImageIcon("mundo.gif");
		imagen3 = new ImageIcon("caja.gif");
	}


	/**
	 * Constructor de la clase
	 * @param control de tipo PanelControl que administra los datos 
	 */
	public Ventana_Sublevaciones(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Mercancia Flota Borgoña");
		ventana.setSize(815, 300);
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
		colocarBox();
		colocarImagen();
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
	 * 
	 */
	public void colocarEtiquetas() {
		etiqueta1 = new JLabel("Mercancias de Borgoña");
		etiqueta2 = new JLabel("Mercancias");
		etiqueta3 = new JLabel("~~~~~~~~~~~~~~");
		etiqueta4 = new JLabel("Destino");

		etiqueta1.setBounds(330, -25, 150, 100);
		etiqueta2.setBounds(60, 40, 100, 100);
		etiqueta3.setBounds(330, 80, 200, 100);
		etiqueta4.setBounds(520, 40, 100, 100);

		panel.add(etiqueta1);
		panel.add(etiqueta2);
		panel.add(etiqueta3);
		panel.add(etiqueta4);


	}

	/**
	 * Recoremos las mercancias de la flota del Reino seleccionado y lo introducimos en forma de String en un JmenuItem.
	 * Para posteriormente meterlo dentro del JMenu.
	 * Para finalizar metemos el JMenu dentro del JMenuBar y su vez al panel
	 */
	public void colocarBox() {
		jmenu = new JMenu("  Mercancias almacenadas en la flota     ");
		menu = new JMenuBar();
		Iterator it=this.control.getEspana().getBorgoña().getFlota().getArrayMercancias().keySet().iterator();

		while(it.hasNext()) {
			JMenuItem jmenuitem;
			int id;
			id=(int) it.next();

			jmenuitem = new JMenuItem(id+" "+this.control.getEspana().getBorgoña().getFlota().getArrayMercancias().get(id).getNombre()+" cantidad "+this.control.getEspana().getBorgoña().getFlota().getArrayMercancias().get(id).getTotalkg()+" kg ");

			jmenu.add(jmenuitem);
		}

		menu.add(jmenu);

		box2  =  new JComboBox();
		recorrerPaises();

		menu.setBounds(40, 120, 250, 20);
		box2.setBounds(500, 120, 250, 20);

		panel.add(menu);
		panel.add(box2);
	}

	/**
	 * Método que se encarga de comprobar antes de crear un Item de JComboBox tiene sublevacion false.
	 * Si el pais tiene sublevacion true no se mostrara impidiendo al usuario iteractuar con el mismo 
	 */
	public void recorrerPaises() {

		if(control.getEspana().getNuevaEspaña().isSublevaciones()==false) {
			box2.addItem("Nueva España");
		}

		if(control.getEspana().getNuevaGranda().isSublevaciones()==false) {
			box2.addItem("Nueva Granada");
		}

		if(control.getEspana().getPeru().isSublevaciones()==false) {
			box2.addItem("Peru");
		}

		if(control.getEspana().getPlata().isSublevaciones()==false) {
			box2.addItem("Plata");
		}

		if(control.getEspana().getAustria().isSublevaciones()==false) {
			box2.addItem("Austria");
		}

	}

	/**
	 * Una vez el usuario presiona el boton Embarcar las mercancias se transportaran al pais seleccionado y se pondra la Flota no disponible
	 */
	public void colocarBoton() {
		boton = new JButton("Embarcar");
		boton.setBounds(350, 180, 110, 40);
		panel.add(boton);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(control.getEspana().getBorgoña().getFlota().getArrayMercancias().size()!=0) {
					try {
						switch (box2.getSelectedItem().toString().toUpperCase()) {
						case "NUEVA ESPAÑA":
							control.getEspana().enviarFlota(control.getEspana().getBorgoña(), control.getEspana().getNuevaEspaña());
							System.out.println("Importaciones Nueva España");
							control.getEspana().getNuevaEspaña().verMercanciasImportacion();
							break;
						case "NUEVA GRANADA": 
							control.getEspana().enviarFlota(control.getEspana().getBorgoña(), control.getEspana().getNuevaGranda());
							System.out.println("Importaciones Nueva Granda");
							control.getEspana().getNuevaGranda().verMercanciasImportacion();
							break;
						case "PERU":
							control.getEspana().enviarFlota(control.getEspana().getBorgoña(), control.getEspana().getPeru());
							System.out.println("Importaciones Peru");
							control.getEspana().getPeru().verMercanciasImportacion();
							break;
						case "PLATA": 
							control.getEspana().enviarFlota(control.getEspana().getBorgoña(), control.getEspana().getPlata());
							System.out.println("Importaciones Plata");
							control.getEspana().getPlata().verMercanciasImportacion();
							break;
						case "AUSTRIA":
							control.getEspana().enviarFlota(control.getEspana().getBorgoña(), control.getEspana().getAustria());
							System.out.println("Importaciones Austria ");
							control.getEspana().getAustria().verMercanciasImportacion();
							break;
						default:
							throw new IllegalArgumentException(box2.getSelectedItem().toString().toUpperCase());
						}

						jmenu.removeAll();

						System.out.println("Mercancias Reino Borgoña");
						control.getEspana().getBorgoña().verMercancias();
						System.out.println("Mercancias FLota Borgoña");
						control.getEspana().getBorgoña().getFlota().verMercancias();


					}catch (Exception o) {
					}
				}else {
					JOptionPane.showMessageDialog(null,"No hay Mercancias disponibles para transportar");
				}

			}		
		};

		boton.addActionListener(listener);
	}

	/**
	 * Método para inicializar las imágenes
	 */
	public void colocarImagen() {

		etiqueta5 = new JLabel();
		Icon fondo1 = new ImageIcon(imagen.getImage().getScaledInstance(90, 90, 10));
		etiqueta5.setIcon(fondo1);
		etiqueta5.setBounds(350, 30, 100, 100);
		panel.add(etiqueta5);

		etiqueta6 = new JLabel();
		Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(70, 70, 10));
		etiqueta6.setIcon(fondo2);
		etiqueta6.setBounds(600, 25, 100, 100);
		panel.add(etiqueta6);

		etiqueta7 = new JLabel();
		Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(90, 90, 10));
		etiqueta7.setIcon(fondo3);
		etiqueta7.setBounds(165, 25, 100, 100);
		panel.add(etiqueta7);
	}

}