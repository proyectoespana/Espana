package Vista;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana_Flota_EuropaEste {
	
	private JPanel panel;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JLabel etiqueta4;
	private JLabel etiqueta5;
	private JComboBox box1;
	private JComboBox box2;
	private static ImageIcon imagen;
	private JButton boton;
	private JFrame ventana;
	
	static {
		imagen = new ImageIcon("barcoNav.gif");
	}
	
	public Ventana_Flota_EuropaEste() {
		ventana = new JFrame("Mercancia Flota Europa Este");
		ventana.setSize(430, 300);
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
		etiqueta1 = new JLabel("Mercancias de Europa del Este");
		etiqueta2 = new JLabel("Mercancias");
		etiqueta3 = new JLabel("~~~~~~~~~~~~~~");
		etiqueta4 = new JLabel("Destino");
		etiqueta5 = new JLabel();

		etiqueta1.setBounds(125, -25, 180, 100);
		etiqueta2.setBounds(60, 40, 100, 100);
		etiqueta3.setBounds(160, 80, 100, 100);
		etiqueta4.setBounds(290, 40, 100, 100);
		etiqueta5.setBounds(165, 30, 100, 100);
		
		panel.add(etiqueta1);
		panel.add(etiqueta2);
		panel.add(etiqueta3);
		panel.add(etiqueta4);
		panel.add(etiqueta5);
		
	}
	
	public void colocarBox() {
		String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
		String [] c2 = {"a", "b", "c"};
		
		box1  =  new JComboBox(c1);
		box2  =  new JComboBox(c2);
		
		box1.setBounds(40, 120, 110, 20);
		box2.setBounds(270, 120, 100, 20);
		
		panel.add(box1);
		panel.add(box2);
	}
	
	public void colocarBoton() {
		boton = new JButton("Embarcar");
		boton.setBounds(145, 180, 110, 40);
		panel.add(boton);
	}
	
	public void colocarImagen() {
		Icon fondo1 = new ImageIcon(imagen.getImage().getScaledInstance(90, 90, 10));
		etiqueta5.setIcon(fondo1);
		etiqueta5.setBounds(165, 30, 100, 100);
		panel.add(etiqueta5);
	}

}


