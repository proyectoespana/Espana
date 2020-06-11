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

/**
 * Clase que abre una ventana respecto a las Flotas
 * @author Grupo
 *
 */

public class Ventana_Flota_Austria {
	
	//Atributos
	
	/**
	 * Panel donde se colocan los componentes 
	 */
	
	private JPanel panel;
	
	/**
	 * Etiquetas
	 */
	
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JLabel etiqueta4;
	private JLabel etiqueta5;
	private JLabel etiqueta6;
	private JLabel etiqueta7;
	
	/**
	 * Lista de países
	 */
	
	private JComboBox box2;
	
	/**
	 * Imágenes
	 */
	
	private ImageIcon imagen = new ImageIcon("imagenes/barcoNav.gif");
	private ImageIcon imagen2 = new ImageIcon("imagenes/mundo.gif");
	private ImageIcon imagen3 = new ImageIcon("imagenes/caja.gif");
	
	/**
	 * Botones 
	 */
	
	private JButton boton;

	/**
	 * Ventana  
	 */
	
	private JFrame ventana;
	
	/**
     * Declaramos un atributo de tipo PanelControl que se encargará de administrar los datos
     */
	
	private PanelControl control;
	
	/**
	 * Menú donde se guardan las mercancias
	 */
	
	private JMenuBar menu;
	private JMenu jmenu;
	
	//Constructores
	
	/**
	 * Constructor
	 * @param control de tipo PanelControl que administra los datos
	 */
	
	public Ventana_Flota_Austria(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Mercancia Flota Austria");
		ventana.setSize(815, 300);
		ventana.setResizable(false);
		iniciarComponentes();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	//Métodos
	
	/**
	 * Método que inicializa los componentes en el panel.
	 */
	
	public void iniciarComponentes() {
		colocarPanel();
		colocarEtiquetas();
		colocarBox();
		colocarImagen();
		colocarBoton();
	}
	
	/**
	 * Método que coloca el panel en la ventana.
	 */

	public void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		ventana.setContentPane(panel);
	}
	
	/**
	 * Método que coloca las etiquetas en el panel.
	 */

	public void colocarEtiquetas() {
		etiqueta1 = new JLabel("Mercancias de Austria");
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
	 * Método que guarda las mercancias y las coloca en un menú.
	 * Recorremos las mercancias de la flota del Reino seleccionado y lo introducimos en forma de String en un JmenuItem.
	 * Para posteriormente meterlo dentro del JMenu.
	 * Para finalizar metemos el JMenu dentro del JMenuBar.
	 * 
	 */
	
	public void colocarBox() {
		jmenu = new JMenu("    Mercancias almacenadas en la flota        ");
		menu = new JMenuBar();

		Iterator it=this.control.getEspana().getAustria().getFlota().getArrayMercancias().keySet().iterator();

		while(it.hasNext()) {
			JMenuItem jmenuitem;
			int id;
			id=(int) it.next();

			jmenuitem = new JMenuItem(id+" "+this.control.getEspana().getAustria().getFlota().getArrayMercancias().get(id).getNombre()+" cantidad "+this.control.getEspana().getAustria().getFlota().getArrayMercancias().get(id).getTotalkg()+" kg ");

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
	 * Si el pais tiene sublevacion true no se mostrara impidiendo al usuario iteractuar con el mismo.
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

		if(control.getEspana().getBorgoña().isSublevaciones()==false) {
			box2.addItem("Borgoña");
		}
		
		if(control.getEspana().getCastilla().isSublevaciones()==false) {
			box2.addItem("Castilla");
		}
		
		if(control.getEspana().getAragon().isSublevaciones()==false) {
			box2.addItem("Aragon");
		}
	}

	/**
	 * Método que manda la flota al lugar destino seleccionado..
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

				if(control.getEspana().getAustria().getFlota().getArrayMercancias().size()!=0) {
					try {
						switch (box2.getSelectedItem().toString().toUpperCase()) {
						case "NUEVA ESPAÑA":
							control.getEspana().enviarFlota(control.getEspana().getAustria(), control.getEspana().getNuevaEspaña());
							System.out.println("Importaciones Nueva España");
							control.getEspana().getNuevaEspaña().verMercanciasImportacion();
							break;
						case "NUEVA GRANADA": 
							control.getEspana().enviarFlota(control.getEspana().getAustria(), control.getEspana().getNuevaGranda());
							System.out.println("Importaciones Nueva Granada");
							control.getEspana().getNuevaGranda().verMercanciasImportacion();
							break;
						case "PERU":
							control.getEspana().enviarFlota(control.getEspana().getAustria(), control.getEspana().getPeru());
							System.out.println("Importaciones Peru");
							control.getEspana().getPeru().verMercanciasImportacion();
							break;
						case "PLATA": 
							control.getEspana().enviarFlota(control.getEspana().getAustria(), control.getEspana().getPlata());
							System.out.println("Importaciones Plata");
							control.getEspana().getPlata().verMercanciasImportacion();
							break;
						case "BORGOÑA":
							control.getEspana().enviarFlota(control.getEspana().getAustria(), control.getEspana().getBorgoña());
							System.out.println("Importaciones Borgoña");
							control.getEspana().getBorgoña().verMercanciasImportacion();
							break;
						case "CASTILLA":
							control.getEspana().enviarFlota(control.getEspana().getAustria(), control.getEspana().getCastilla());
							System.out.println("Importaciones Castilla");
							control.getEspana().getCastilla().verMercanciasImportacion();
							break;
						case "ARAGON":
							control.getEspana().enviarFlota(control.getEspana().getAustria(), control.getEspana().getAragon());
							System.out.println("Importaciones Aragón");
							control.getEspana().getAragon().verMercanciasImportacion();
							break;
						default:
							throw new IllegalArgumentException(box2.getSelectedItem().toString().toUpperCase());
						}

						jmenu.removeAll();

						System.out.println("Mercancias Reino Austria");
						control.getEspana().getAustria().verMercancias();
						System.out.println("Mercancias FLota Austria");
						control.getEspana().getAustria().getFlota().verMercancias();


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
	
	/**
	 * Método que colocar las imágenes en el panel.
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
