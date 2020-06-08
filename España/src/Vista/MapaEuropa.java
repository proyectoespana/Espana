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

public class MapaEuropa extends JPanel {
	
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
	
	private InfoCastilla pCastilla;
	private InfoAragon pAragon;
	private InfoBorgoña pBorgoña;
	private InfoAustria pAustria;
	
	/**
	 * Atributo que es la imagen. 
	 */
	
	private JLabel imagen;
	
	//Constructores
	
	/**
	 * Constructor
	 * @param control
	 */

	public MapaEuropa(PanelControl control) {
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

		pCastilla = new InfoCastilla();
		pAragon = new InfoAragon();
		pBorgoña = new InfoBorgoña();
		pAustria = new InfoAustria();

		add(pCastilla);
		add(pBorgoña);
		add(pAragon);
		add(pAustria);

		pCastilla.setVisible(false);
		pBorgoña.setVisible(false);
		pAragon.setVisible(false);
		pAustria.setVisible(false);

		boton1 = new JButton();
		boton2 = new JButton();
		boton3 = new JButton();
		boton4 = new JButton();

		boton1.setBounds(101, 207, 20, 20);
		boton2.setBounds(260, 201, 20, 20);
		boton4.setBounds(270, 78, 20, 20);
		boton3.setBounds(460, 144, 20, 20);

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
					pCastilla.setVisible(true);
					pAragon.setVisible(false);
					pAustria.setVisible(false);
					pBorgoña.setVisible(false);

				}else if(source == boton2){
					pCastilla.setVisible(false);
					pAragon.setVisible(true);
					pAustria.setVisible(false);
					pBorgoña.setVisible(false);

				}else if(source == boton3){
					pCastilla.setVisible(false);
					pAragon.setVisible(false);
					pAustria.setVisible(true);
					pBorgoña.setVisible(false);

				}else {
					pCastilla.setVisible(false);
					pAragon.setVisible(false);
					pAustria.setVisible(false);
					pBorgoña.setVisible(true);

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
		imagen.setIcon(new ImageIcon("imagenes/EuropaDef.jpg"));
		imagen.setBounds(5, 5, 520, 320);
		add(imagen);

	}
	
	/**
	 * Método que comprueba las sublevaciones de los diversos países.
	 */

	public void comprobarSublevacion() {

		if(control.getEspana().getCastilla().isSublevaciones()) {
			this.boton1.setEnabled(false);
		}

		if(control.getEspana().getAragon().isSublevaciones()) {
			this.boton2.setEnabled(false);
		}

		if(control.getEspana().getBorgoña().isSublevaciones()) {
			this.boton4.setEnabled(false);
		}

		if(control.getEspana().getAustria().isSublevaciones()) {
			this.boton3.setEnabled(false);
		}

	}


}
