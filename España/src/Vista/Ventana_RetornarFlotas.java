package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import Main.PanelControl;

/**
 * Clase cuyo funcionamiento retorna las flotas de su destino.
 * @author Grupo
 *
 */

public class Ventana_RetornarFlotas {

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
	private JLabel etiqueta8;
	private JLabel etiqueta9;

	/**
	 * Lista de flotas que han partido.
	 */

	private JCheckBox radio1;
	private JCheckBox radio2;
	private JCheckBox radio3;
	private JCheckBox radio4;
	private JCheckBox radio5;
	private JCheckBox radio6;
	private JCheckBox radio7;
	private JCheckBox radio8;

	/**
	 * Botón.  
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
	 * Constructor
	 * @param control de tipo PanelControl que administra los datos
	 */

	public Ventana_RetornarFlotas(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Retornar Flotas ");
		ventana.setSize(450, 400);
		ventana.setUndecorated(true);
		ventana.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		ventana.setDefaultCloseOperation(0);
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
		colocarBoton();
		colocarRadioButton();
	}

	/**
	 * Método que coloca el panel en la ventana.
	 */

	public void colocarPanel() {
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		ventana.setContentPane(panel);

	}

	/**
	 * Método que coloca las etiquetas en el panel en el caso de que dicha flota haya partido.
	 */

	public void colocarEtiquetas() {
		etiqueta1 = new JLabel("Castilla: "+" está a una distacia de "+control.getEspana().getCastilla().getFlota().getDestino()+" km de su puerto");
		etiqueta2 = new JLabel("Aragon: "+" está a una distacia de "+control.getEspana().getAragon().getFlota().getDestino()+" km de su puerto");
		etiqueta3 = new JLabel("Borgoña: "+" está a una distacia de "+control.getEspana().getBorgoña().getFlota().getDestino()+" km de su puerto");
		etiqueta4 = new JLabel("Austria: "+" está a una distacia de "+control.getEspana().getAustria().getFlota().getDestino()+" km de su puerto");
		etiqueta5 = new JLabel("Nueva España: "+" está a una distacia de "+control.getEspana().getNuevaEspaña().getFlota().getDestino()+" km de su puerto");
		etiqueta6 = new JLabel("Nueva Granada: "+" está a una distacia de "+control.getEspana().getNuevaGranda().getFlota().getDestino()+" km de su puerto");
		etiqueta7 = new JLabel("Peru: "+" está a una distacia de "+control.getEspana().getPeru().getFlota().getDestino()+" km de su puerto");
		etiqueta8 = new JLabel("Plata: "+" está a una distacia de "+control.getEspana().getPlata().getFlota().getDestino()+" km de su puerto");
		etiqueta9 = new JLabel("Lista de flotas: ");


		etiqueta1.setBounds(65, 10, 320, 100);
		etiqueta2.setBounds(65, 40, 320, 100);
		etiqueta3.setBounds(65, 70, 320, 100);
		etiqueta4.setBounds(65, 100, 320, 100);
		etiqueta5.setBounds(65, 130, 350, 100);
		etiqueta6.setBounds(65, 160, 350, 100);
		etiqueta7.setBounds(65, 190, 320, 100);
		etiqueta8.setBounds(65, 220, 320, 100);
		etiqueta9.setBounds(160, -30, 320, 100);
		etiqueta9.setFont(new Font("Serif", Font.PLAIN, 20));


		if(control.getEspana().getCastilla().getFlota().isDisponible()) {
			etiqueta1.setVisible(false);
		}

		if(control.getEspana().getAragon().getFlota().isDisponible()) {
			etiqueta2.setVisible(false);
		}
		if(control.getEspana().getBorgoña().getFlota().isDisponible()) {
			etiqueta3.setVisible(false);
		}

		if(control.getEspana().getAustria().getFlota().isDisponible()) {
			etiqueta4.setVisible(false);
		}

		if(control.getEspana().getNuevaEspaña().getFlota().isDisponible()) {
			etiqueta5.setVisible(false);
		}

		if (control.getEspana().getNuevaGranda().getFlota().isDisponible()) {
			etiqueta6.setVisible(false);
		}

		if(control.getEspana().getPeru().getFlota().isDisponible()) {
			etiqueta7.setVisible(false);
		}

		if(control.getEspana().getPlata().getFlota().isDisponible()) {
			etiqueta8.setVisible(false);
		}

		panel.add(etiqueta1);
		panel.add(etiqueta2);
		panel.add(etiqueta3);
		panel.add(etiqueta4);
		panel.add(etiqueta5);
		panel.add(etiqueta6);
		panel.add(etiqueta7);
		panel.add(etiqueta8);
		panel.add(etiqueta9);

	}

	/**
	 * Método el cual se seleccionará la flota que quiera que vuelva al lugar de origen.
	 * Una vez seleccionada y dada al boton se eliminará de la lista.
	 */

	public void colocarRadioButton() {
		radio1 = new JCheckBox();
		radio2 = new JCheckBox();
		radio3 = new JCheckBox();
		radio4 = new JCheckBox();
		radio5 = new JCheckBox();
		radio6 = new JCheckBox();
		radio7 = new JCheckBox();
		radio8 = new JCheckBox();

		radio1.setBounds(40, 50, 20, 20);
		radio2.setBounds(40, 80, 20, 20);
		radio3.setBounds(40, 110, 20, 20);
		radio4.setBounds(40, 140, 20, 20);
		radio5.setBounds(40, 170, 20, 20);
		radio6.setBounds(40, 200, 20, 20);
		radio7.setBounds(40, 230, 20, 20);
		radio8.setBounds(40, 260, 20, 20);

		if(control.getEspana().getCastilla().getFlota().isDisponible()) {
			radio1.setEnabled(false);
			radio1.setVisible(false);
		}

		if(control.getEspana().getAragon().getFlota().isDisponible()) {
			radio2.setEnabled(false);
			radio2.setVisible(false);
		}
		if(control.getEspana().getBorgoña().getFlota().isDisponible()) {
			radio3.setEnabled(false);
			radio3.setVisible(false);
		}

		if(control.getEspana().getAustria().getFlota().isDisponible()) {
			radio4.setEnabled(false);
			radio4.setVisible(false);
		}

		if(control.getEspana().getNuevaEspaña().getFlota().isDisponible()) {
			radio5.setEnabled(false);
			radio5.setVisible(false);
		}

		if (control.getEspana().getNuevaGranda().getFlota().isDisponible()) {
			radio6.setEnabled(false);
			radio6.setVisible(false);
		}

		if(control.getEspana().getPeru().getFlota().isDisponible()) {
			radio7.setEnabled(false);
			radio7.setVisible(false);
		}

		if(control.getEspana().getPlata().getFlota().isDisponible()) {
			radio8.setEnabled(false);
			radio8.setVisible(false);
		}

		panel.add(radio1);
		panel.add(radio2);
		panel.add(radio3);
		panel.add(radio4);
		panel.add(radio5);
		panel.add(radio6);
		panel.add(radio7);
		panel.add(radio8);
	}

	/**
	 * Método que retorna las flotas seleccionadas en los RadioButton.
	 */

	public void colocarBoton() {
		boton = new JButton("Salir y Retornar Flotas");
		boton.setBounds(130, 305, 180, 40);
		boton.setFont(new Font("Serif", Font.PLAIN, 15));
		panel.add(boton);
		radio1= new JCheckBox();
		radio2=new JCheckBox();
		radio3=new JCheckBox();
		radio4=new JCheckBox();
		radio5=new JCheckBox();
		radio6=new JCheckBox();
		radio7=new JCheckBox();
		radio8=new JCheckBox();

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int opcion = JOptionPane.showConfirmDialog(null, "Si no ha marcado alguna Flota, no estará disponible el siguiente turno. ¿ Está seguro de su decisión ?");

				if(opcion==JOptionPane.YES_OPTION) {

					if(!radio1.isSelected() && radio1.isVisible()) {
						control.meterZonaSinFlota(control.getEspana().getCastilla().getNombre()+","+control.getEspana().getCastilla().getFlota().getDestino());

					}else if(radio1.isSelected() && radio1.isVisible()) {
						control.quitarReinoDeZonasSinFlota(control.getEspana().getCastilla().getNombre()+","+control.getEspana().getCastilla().getFlota().getDestino());
						radio1.setVisible(false);
						etiqueta1.setVisible(false);
					}

					if(!radio2.isSelected() && radio2.isVisible()) {		 
						control.meterZonaSinFlota(control.getEspana().getAragon().getNombre()+","+control.getEspana().getAragon().getFlota().getDestino());


					}else if(radio2.isSelected() && radio2.isVisible()) {
						control.quitarReinoDeZonasSinFlota(control.getEspana().getAragon().getNombre()+","+control.getEspana().getAragon().getFlota().getDestino());
						radio2.setVisible(false);
						etiqueta2.setVisible(false);
					}

					if(!radio3.isSelected() && radio3.isVisible()) {
						control.meterZonaSinFlota(control.getEspana().getBorgoña().getNombre()+","+control.getEspana().getBorgoña().getFlota().getDestino());		

					}else if(radio3.isSelected() && radio3.isVisible()) {
						control.quitarReinoDeZonasSinFlota(control.getEspana().getBorgoña().getNombre()+","+control.getEspana().getBorgoña().getFlota().getDestino());
						radio3.setVisible(false);
						etiqueta3.setVisible(false);
					}

					if(!radio4.isSelected() && radio4.isVisible()) {
						control.meterZonaSinFlota(control.getEspana().getAustria().getNombre()+","+control.getEspana().getAustria().getFlota().getDestino());		

					}else if(radio4.isSelected() && radio4.isVisible()) {
						control.quitarReinoDeZonasSinFlota(control.getEspana().getAustria().getNombre()+","+control.getEspana().getAustria().getFlota().getDestino());
						radio4.setVisible(false);
						etiqueta4.setVisible(false);
					}

					if(!radio5.isSelected() && radio5.isVisible()) {
						control.meterZonaSinFlota(control.getEspana().getNuevaEspaña().getNombre()+","+control.getEspana().getNuevaEspaña().getFlota().getDestino());		


					}else if(radio5.isSelected() && radio5.isVisible()) {
						control.quitarReinoDeZonasSinFlota(control.getEspana().getNuevaEspaña().getNombre()+","+control.getEspana().getNuevaEspaña().getFlota().getDestino());
						radio5.setVisible(false);
						etiqueta5.setVisible(false);
					}


					if(!radio6.isSelected() && radio6.isVisible()) {
						control.meterZonaSinFlota(control.getEspana().getNuevaGranda().getNombre()+","+control.getEspana().getNuevaGranda().getFlota().getDestino());	


					}else if(radio6.isSelected() && radio6.isVisible()) {
						control.quitarReinoDeZonasSinFlota(control.getEspana().getNuevaGranda().getNombre()+","+control.getEspana().getNuevaGranda().getFlota().getDestino());
						radio6.setVisible(false);
						etiqueta6.setVisible(false);
					}


					if(!radio7.isSelected() && radio7.isVisible()) {
						control.meterZonaSinFlota(control.getEspana().getPeru().getNombre()+","+control.getEspana().getPeru().getFlota().getDestino());	

					}else if(radio7.isSelected() && radio7.isVisible()) {
						control.quitarReinoDeZonasSinFlota(control.getEspana().getPeru().getNombre()+","+control.getEspana().getPeru().getFlota().getDestino());
						radio7.setVisible(false);
						etiqueta7.setVisible(false);
					}

					if(!radio8.isSelected() && radio8.isVisible()) {
						control.meterZonaSinFlota(control.getEspana().getPlata().getNombre()+","+control.getEspana().getPlata().getFlota().getDestino());

					}else if(radio8.isSelected() && radio8.isVisible()) {
						control.quitarReinoDeZonasSinFlota(control.getEspana().getPlata().getNombre()+","+control.getEspana().getPlata().getFlota().getDestino());
						radio8.setVisible(false);
						etiqueta8.setVisible(false);
					}

					ventana.setVisible(false);

					ventana.dispose();

					JOptionPane.showMessageDialog(null,"Las Flotas Seleccionadas, volverán a su Puerto de Origen en el siguiente turno");

					control.iteradorZonasSinFLota();

					try {
						control.cambiarTruno();

						if(control.getZonasSinProductosDemandados().size()==8) {
							JOptionPane.showMessageDialog(null," Has aguantado "+control.getContadorTurnos()+" turnos");
						}

					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		};

		boton.addActionListener(listener);
	}

}
