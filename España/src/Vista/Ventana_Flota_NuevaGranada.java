package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.Box;
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

public class Ventana_Flota_NuevaGranada {


	private JPanel panel;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JLabel etiqueta4;
	private JLabel etiqueta5;
	private JLabel etiqueta6;
	private JLabel etiqueta7;
	private JComboBox box2;
	private static ImageIcon imagen;
	private static ImageIcon imagen2;
	private static ImageIcon imagen3;
	private JButton boton;
	private JFrame ventana;
	private PanelControl control;
	private JMenuBar menu;
	private JMenu jmenu;

	static {
		imagen = new ImageIcon("imagenes/barcoNav.gif");
		imagen2 = new ImageIcon("imagenes/mundo.gif");
		imagen3 = new ImageIcon("imagenes/caja.gif");
	}

	public Ventana_Flota_NuevaGranada(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Mercancia Flota Nueva Granada");
		ventana.setSize(815, 300);
		iniciarComponentes();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}


	public void iniciarComponentes() {
		colocarPanel();
		colocarEtiquetas();
		colocarBox();
		colocarImagen();
		colocarBoton();
	}

	public void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		ventana.setContentPane(panel);
	}

	public void colocarEtiquetas() {
		etiqueta1 = new JLabel("Mercancias de Nueva Granada");
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
	 * Para finalizar metemos el JMenu dentro del JMenuBar
	 * 
	 */
	public void colocarBox() {
		jmenu = new JMenu("  Mercancias almacenadas en la flota     ⛵");
		menu = new JMenuBar();

		//		String [] mercanciasFlota=new  String[this.control.getEspana().getAragon().getFlota().getArrayMercancias().size()];

		Iterator it=this.control.getEspana().getNuevaGranda().getFlota().getArrayMercancias().keySet().iterator();

		while(it.hasNext()) {
			JMenuItem jmenuitem;
			int id;
			id=(int) it.next();


			//			mercanciasFlota[posicion]=id+" "+this.control.getEspana().getAragon().getFlota().getArrayMercancias().get(id).getNombre()+" cantidad "+this.control.getEspana().getAragon().getFlota().getArrayMercancias().get(id).getTotalkg()+" kg ";

			//			jmenuitem = new JMenuItem(mercanciasFlota[posicion]);
			jmenuitem = new JMenuItem(id+" "+this.control.getEspana().getNuevaGranda().getFlota().getArrayMercancias().get(id).getNombre()+" cantidad "+this.control.getEspana().getNuevaGranda().getFlota().getArrayMercancias().get(id).getTotalkg()+" kg ");

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
	 * Creamos un metodo que se encarga de comprobar antes de crear un Item de JComboBox tiene sublevacion false.
	 * Si el pais tiene sublevacion true no se mostrara impidiendo al usuario iteractuar con el mismo 
	 */
	public void recorrerPaises() {

		if(control.getEspana().getNuevaEspaña().isSublevaciones()==false) {
			box2.addItem("Nueva España");
		}

		if(control.getEspana().getAragon().isSublevaciones()==false) {
			box2.addItem("Aragon");
		}

		if(control.getEspana().getPeru().isSublevaciones()==false) {
			box2.addItem("Peru");
		}

		if(control.getEspana().getPlata().isSublevaciones()==false) {
			box2.addItem("Plata");
		}

		if(control.getEspana().getCastilla().isSublevaciones()==false) {
			box2.addItem("Castilla");
		}

		if(control.getEspana().getAustria().isSublevaciones()==false) {
			box2.addItem("Austria");
		}

		if(control.getEspana().getBorgoña().isSublevaciones()==false) {
			box2.addItem("Borgoña");
		}
	}

	/**
	 * Una vez el usuario presiona el boton Embarcar las mercancias se transportaran al pais seleccionado y se pondra la Flota no disponible
	 * 
	 */
	public void colocarBoton() {
		boton = new JButton("Embarcar");
		boton.setBounds(350, 180, 110, 40);
		panel.add(boton);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(control.getEspana().getNuevaGranda().getFlota().getArrayMercancias().size()!=0) {
					try {
						switch (box2.getSelectedItem().toString().toUpperCase()) {
						case "NUEVA ESPAÑA":
							control.getEspana().enviarFlota(control.getEspana().getNuevaGranda(), control.getEspana().getNuevaEspaña());
							System.out.println("Importaciones Nueva España");
							control.getEspana().getNuevaEspaña().verMercanciasImportacion();
							break;
						case "ARAGON": 
							control.getEspana().enviarFlota(control.getEspana().getNuevaGranda(), control.getEspana().getAragon());
							System.out.println("Importaciones Nueva Granda");
							control.getEspana().getAragon().verMercanciasImportacion();
							break;
						case "PERU":
							control.getEspana().enviarFlota(control.getEspana().getNuevaGranda(), control.getEspana().getPeru());
							System.out.println("Importaciones Peru");
							control.getEspana().getPeru().verMercanciasImportacion();
							break;
						case "PLATA": 
							control.getEspana().enviarFlota(control.getEspana().getNuevaGranda(), control.getEspana().getPlata());
							System.out.println("Importaciones Plata");
							control.getEspana().getPlata().verMercanciasImportacion();
							break;
						case "CASTILLA":
							control.getEspana().enviarFlota(control.getEspana().getNuevaGranda(), control.getEspana().getCastilla());
							System.out.println("Importaciones Castilla");
							control.getEspana().getCastilla().verMercanciasImportacion();
							break;
						case "AUSTRIA":
							control.getEspana().enviarFlota(control.getEspana().getNuevaGranda(), control.getEspana().getAustria());
							System.out.println("Importaciones Austria ");
							control.getEspana().getAustria().verMercanciasImportacion();
							break;
						case "BORGOÑA":
							control.getEspana().enviarFlota(control.getEspana().getNuevaGranda(), control.getEspana().getBorgoña());
							System.out.println("Importaciones Borgoñaa");
							control.getEspana().getBorgoña().verMercanciasImportacion();
							break;
						default:
							throw new IllegalArgumentException(box2.getSelectedItem().toString().toUpperCase());
						}

						jmenu.removeAll();

						System.out.println("Mercancias Reino Nueva Granada");
						control.getEspana().getNuevaGranda().verMercancias();
						System.out.println("Mercancias FLota Nueva Granada");
						control.getEspana().getNuevaGranda().getFlota().verMercancias();


					}catch (Exception o) {
						// TODO: handle exception
					}
				}else {
					JOptionPane.showMessageDialog(null,"No hay Mercancias disponibles para transportar");
				}

			}		
		};

		boton.addActionListener(listener);
	}

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



