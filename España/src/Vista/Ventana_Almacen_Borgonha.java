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

public class Ventana_Almacen_Borgonha {
	private JPanel panel;
	private JLabel etiqueta1;
	private JLabel etiqueta5;
	private JLabel etiqueta6;
	private JScrollPane scroll;
	private JButton boton;
	private JFrame ventana;
	private PanelControl control;
	private JList lista;
	private DefaultListModel modeloLista;
	/**
	 * Se crea el modelo lista y dentro de este se mete la lista 
	 * 
	 * @param control
	 */
	public Ventana_Almacen_Borgonha(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Almacén Borgoña");
		ventana.setSize(320, 350);
		modeloLista=new DefaultListModel();
		iniciarComponentes();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public void iniciarComponentes() {
		colocarPanel();
		colocarEtiquetas();
		colocarBoton();
		colocarScroll();
	}

	public void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		ventana.setContentPane(panel);
	}

	public void colocarEtiquetas() {

		etiqueta1 = new JLabel("Mercancia disponible Borgoña");
		etiqueta1.setBounds(70, 25, 200, 14);
		panel.add(etiqueta1);


		etiqueta5 = new JLabel("Peso disponible : "+String.valueOf(this.control.getEspana().getBorgoña().getFlota().getPesoTodasMercancias()));
		etiqueta5.setBounds(60, 200, 200, 14);
		panel.add(etiqueta5);

		//Peso restante de la flota
		etiqueta6 = new JLabel("Peso total introducido: "+String.valueOf(this.control.getEspana().getBorgoña().getFlota().getPesoMaximo()-this.control.getEspana().getBorgoña().getFlota().getPesoTodasMercancias()));
		etiqueta6.setBounds(60, 230, 200, 14);
		panel.add(etiqueta6);

	}


	/**
	 * crearmos un vector con las diferentes mercancias del reino creadas anteriormente.
	 * Despues metemos dicho vector dentro del "modeloLista"
	 */
	public void colocarScroll() {
		Iterator it =this.control.getEspana().getBorgoña().getMercancia().keySet().iterator();
		String mercancias[]= new String [this.control.getEspana().getBorgoña().getMercancia().size()];

		int posicion=0;
		
		while(it.hasNext()) {
			int id;
			id=(int) it.next();
			mercancias[posicion]=(id)+" "+this.control.getEspana().getBorgoña().getMercancia().get(id).getNombre()+" cantidad "+this.control.getEspana().getBorgoña().getMercancia().get(id).getTotalkg()+"kg";
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
	 * Una vez el boton es pulsado se obtiene el numero de la posicion del Jlist
	 * Posteriorme cogemos el valor que pertence dicho numero y recorreromos la primera posicione del String de este, para obtener el numero de la Mercancia que queremos introducir a una flota
	 * y finalmete se elimina de la lista.
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
						control.getEspana().getBorgoña().getFlota().verMercancias();
						control.getEspana().getBorgoña().verMercancias();
						
						etiqueta5.setText("Peso disponible : "+String.valueOf(control.getEspana().getBorgoña().getFlota().getPesoTodasMercancias()));
						etiqueta6.setText("Peso total introducido: "+String.valueOf(control.getEspana().getBorgoña().getFlota().getPesoMaximo()-control.getEspana().getBorgoña().getFlota().getPesoTodasMercancias()));
						
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


	public void prueba(int id) throws Exception {
		this.control.getEspana().formarFlota(this.control.getEspana().getBorgoña(), id);
	}
	
	
}
