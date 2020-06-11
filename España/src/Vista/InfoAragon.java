package Vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 * Clase que informa los detalles de los botones (MapaEuropa)
 * @author Grupo
 *
 */

public class InfoAragon extends JPanel{
	
	//Atributos
	
	/**
	 * Atributo que es la imagen
	 */
	
	private JLabel imagen;
	
	//Constructores
	
	/**
	 * Constructor
	 */

	public InfoAragon() {
		setLayout(null);
		iniciarComponentes();
		setVisible(true);
	}
	
	//Métodos
	
	/**
	 * Método que inicializa los componentes en el panel.
	 */

	private void iniciarComponentes() {

		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(300, 170, 150, 155);
		setLayout(null);

		imagen = new JLabel();
		imagen.setHorizontalAlignment(SwingConstants.CENTER);
		imagen.setIcon(new ImageIcon("imagenes/tablonAragon.jpg"));
		imagen.setBounds(0, 2, 148, 151);
		add(imagen);

	}

}
