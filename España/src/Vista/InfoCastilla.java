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

public class InfoCastilla extends JPanel{
	
	//Atributos

	/**
	 * Atributo que es la imagen
	 */

	private JLabel imagen;

	//Constructores

	/**
	 * Constructor
	 */
	
	public InfoCastilla() {
		setLayout(null);
		iniciarComponentes();
		setVisible(true);
	}
	
	//M�todos
	
	/**
	 * M�todo que inicializa los componentes en el panel.
	 */

	private void iniciarComponentes() {
		
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(50, 30, 150, 155);
		setLayout(null);
		
		imagen = new JLabel();
		imagen.setHorizontalAlignment(SwingConstants.CENTER);
		imagen.setIcon(new ImageIcon("imagenes/tablonCastilla.jpg"));
		imagen.setBounds(2, 2, 146, 151);
		add(imagen);
		
	}

}
