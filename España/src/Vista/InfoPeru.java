package Vista;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 * Clase que informa los detalles de los botones (MapaAmerica)
 * @author Grupo
 *
 */

public class InfoPeru extends JPanel{
	
	//Atributos

	/**
	 * Atributo que es la imagen
	 */

	private JLabel imagen;

	//Constructores

	/**
	 * Constructor
	 */
	
	public InfoPeru() {
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
		setBounds(300, 100, 150, 155);
		setLayout(null);
		
		imagen = new JLabel();
		imagen.setHorizontalAlignment(SwingConstants.CENTER);
		imagen.setIcon(new ImageIcon("gatico.jpg"));
		imagen.setBounds(10, 10, 140, 145);
		add(imagen);
		
	}

}
