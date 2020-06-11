package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

import Clases.Mercancia;
import Main.PanelControl;
/**
 * 
 * @author Grupo
 *
 */
public class Ventana_Almacen_Plata {
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
	 * declaramos un deslizador para moverlo a nuestro gusto para poder visualizar los datos
	 */
	private JScrollPane scroll;
	/**
	 * declaramos un botón 
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
	 * declaramos una lista donde se guardarán los diferentes datos 
	 */
	private JList lista;
	/**
	 * es un modelo para manejar mejor la lista
	 */
	private DefaultListModel modeloLista;

	
	/**
	 * Constructor de la clase
	 * @param control de tipo PanelControl que administra los datos 
	 */
	public Ventana_Almacen_Plata(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Almacén Nueva Plata");
		ventana.setSize(320, 350);
		modeloLista=new DefaultListModel();
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
		colocarBoton();
		colocarScroll();
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
	 */
	public void colocarEtiquetas() {

		etiqueta1 = new JLabel("Mercancia disponible Plata");
		etiqueta1.setBounds(70, 25, 200, 14);
		panel.add(etiqueta1);

		etiqueta2 = new JLabel("Peso disponible : "+String.valueOf(this.control.getEspana().getPlata().getFlota().getPesoTodasMercancias()));
		etiqueta2.setBounds(60, 200, 200, 14);
		panel.add(etiqueta2);

		//Peso restante de la flota
		etiqueta3 = new JLabel("Peso total introducido: "+String.valueOf(this.control.getEspana().getPlata().getFlota().getPesoMaximo()-this.control.getEspana().getPlata().getFlota().getPesoTodasMercancias()));
		etiqueta3.setBounds(60, 230, 200, 14);
		panel.add(etiqueta3);

	}

	/**
	 * Método que se encarga de inicializar el deslizador y de
	 * crear un vector con las diferentes mercancias del reino creadas anteriormente.
	 * Y después metemos dicho vector dentro del "modeloLista"
	 */
	public void colocarScroll() {
		Iterator it =this.control.getEspana().getPlata().getMercancia().keySet().iterator();
		String mercancias[]= new String [this.control.getEspana().getPlata().getMercancia().size()];

		int posicion=0;
		
		while(it.hasNext()) {
			int id;
			id=(int) it.next();
			mercancias[posicion]=(id)+" "+this.control.getEspana().getPlata().getMercancia().get(id).getNombre()+" cantidad "+this.control.getEspana().getPlata().getMercancia().get(id).getTotalkg()+"kg";
			posicion++;
		}

		for(int i=0;i<mercancias.length;i++) {
			modeloLista.addElement(mercancias[i]);
		}

		lista= new JList(modeloLista);
		scroll = new JScrollPane(lista);
		scroll.setBounds(25, 60, 260, 120);
		panel.add(scroll);

	}

	/**
	 * Método que se encarga de inicializar el botón
	 * Una vez el botón es pulsado se obtiene el numero de la posicion del Jlist
	 * Posteriorme cogemos el valor que pertence dicho numero y recorremos la primera posición del String de éste, para obtener el número de la Mercancia que queremos 
	 * introducir a una flota y finalmente se elimina de la lista.
	 */
	public void colocarBoton() {
		boton = new JButton("Almacenar");
		boton.setBounds(77, 260, 150, 40);
		panel.add(boton);

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id;

				id=lista.getSelectedIndex();
				
				if(id!=-1) {
					String selectedText = (String)lista.getSelectedValue();
					char numero=selectedText.charAt(0);
					String cadena=Character.toString(numero);

					try {
						int numero2=Integer.parseInt(cadena);
						prueba(numero2);
						control.getEspana().getPlata().getFlota().verMercancias();
						control.getEspana().getPlata().verMercancias();
						
						etiqueta2.setText("Peso disponible : "+String.valueOf(control.getEspana().getPlata().getFlota().getPesoTodasMercancias()));
						etiqueta3.setText("Peso total introducido: "+String.valueOf(control.getEspana().getPlata().getFlota().getPesoMaximo()-control.getEspana().getPlata().getFlota().getPesoTodasMercancias()));
						
						modeloLista.remove(id);
						lista.updateUI();
					} catch (Exception e1) {

						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null," Tiene que seleccionar antes una Mercancia ");
				}
			
			}
		};

		boton.addActionListener(listener);

	}

	/**
	 * Método que 
	 * @param id
	 * @throws Exception
	 */
	public void prueba(int id) throws Exception {
		this.control.getEspana().formarFlota(this.control.getEspana().getPlata(), id);
	}

}
