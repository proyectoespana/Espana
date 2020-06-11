package Vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import Main.PanelControl;

/**
 * Clase del Panel Mapa
 * @author Grupo
 *
 */

public class MapaAmerica extends JPanel {
	
	//Atributos
	
	/**
	 * Atributo que controla las funcionalidades de la interfaz
	 */
	
	private PanelControl control;
	
	/**
	 * Botones 
	 */
	
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	
	/**
	 * Atributos que dan función a los botones. 
	 */
	
	private InfoPlata pPlata;
	private InfoPeru pPeru;
	private InfoNuevaGranada pNuevaGranada;
	private InfoNuevaEspaña pNuevaEspaña;
	
	/**
	 * Atributo que es la imagen. 
	 */
	
	private JLabel imagen;
	
	//Constructores
	
	/**
	 * Constructor
	 * @param control
	 */
	
	public MapaAmerica(PanelControl control) {
		this.control = control;
		setLayout(null);
		iniciarComponentes();
		setVisible(true);
	}
	
	//Métodos
	
	/**
	 * Método que inicializa los componentes en el panel.
	 */
	
	public void iniciarComponentes() {
		
		pPlata = new InfoPlata();
		pPeru = new InfoPeru();
		pNuevaGranada = new InfoNuevaGranada();
		pNuevaEspaña = new InfoNuevaEspaña();
		
		add(pPlata);
		add(pPeru);
		add(pNuevaGranada);
		add(pNuevaEspaña);
		
		pPlata.setVisible(false);
		pPeru.setVisible(false);
		pNuevaGranada.setVisible(false);
		pNuevaEspaña.setVisible(false);
		
		boton1 = new JButton();
		boton2 = new JButton();
		boton3 = new JButton();
		boton4 = new JButton();
		
		boton1.setBounds(260, 243, 20, 20);
		boton2.setBounds(236, 150, 20, 20);
		boton3.setBounds(244, 105, 20, 20);
		boton4.setBounds(194, 62, 20, 20);
		
		comprobarSublevacion();
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		
		ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	JButton source = (JButton) e.getSource();
            	
            	if(source == boton1) {
					pPlata.setVisible(true);
					pPeru.setVisible(false);
					pNuevaGranada.setVisible(false);
            		pNuevaEspaña.setVisible(false);
            		
            	}else if(source == boton2){
					pPlata.setVisible(false);
					pPeru.setVisible(true);
					pNuevaGranada.setVisible(false);
            		pNuevaEspaña.setVisible(false);
            		
            	}else if(source == boton3){
					pPlata.setVisible(false);
					pPeru.setVisible(false);
					pNuevaGranada.setVisible(true);
            		pNuevaEspaña.setVisible(false);
            		
            	}else {
            		pPlata.setVisible(false);
					pPeru.setVisible(false);
					pNuevaGranada.setVisible(false);
            		pNuevaEspaña.setVisible(true);
            		
            	}
                
            }
        };
		
		boton1.addActionListener(listener);
		boton2.addActionListener(listener);
		boton3.addActionListener(listener);
		boton4.addActionListener(listener);
		
		//Imagen
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(70, 43, 530, 330);
		setLayout(null);
		
		imagen = new JLabel();
		imagen.setHorizontalAlignment(SwingConstants.CENTER);
		imagen.setIcon(new ImageIcon("imagenes/AmericaDef.jpg"));
		imagen.setBounds(5, 5, 520, 320);
		add(imagen);
		
	}
	
	/**
	 * Método que comprueba las sublevaciones de los diversos países.
	 */
	
	public void comprobarSublevacion() {
		
		if(control.getEspana().getPlata().isSublevaciones()) {
			this.boton1.setEnabled(false);
		}
		
		if(control.getEspana().getPeru().isSublevaciones()) {
			this.boton2.setEnabled(false);
		}
		
		if(control.getEspana().getNuevaGranda().isSublevaciones()) {
			this.boton3.setEnabled(false);
		}
		
		if(control.getEspana().getNuevaEspaña().isSublevaciones()) {
			this.boton4.setEnabled(false);
		}
		
	}
	

}
