package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRootPane;
import javax.swing.JSlider;
import javax.swing.JTextField;

import Main.PanelControl;

public class Ventana_RetornarFlotas {
	private JPanel panel;
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JLabel etiqueta4;
	private JLabel etiqueta5;
	private JLabel etiqueta6;
	private JLabel etiqueta7;
	private JLabel etiqueta8;
	private JLabel etiqueta9;
	private JCheckBox radio1;
	private JCheckBox radio2;
	private JCheckBox radio3;
	private JCheckBox radio4;
	private JCheckBox radio5;
	private JCheckBox radio6;
	private JCheckBox radio7;
	private JCheckBox radio8;
	private JButton boton;
	private JFrame ventana;
	private PanelControl control;
	private ImageIcon imagen1;
	private ImageIcon imagen2;


	public Ventana_RetornarFlotas(PanelControl control) {
		this.control=control;
		ventana = new JFrame("Retornar Flotas ");
		ventana.setSize(450, 400);
		ventana.setUndecorated(true);
		ventana.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		ventana.setDefaultCloseOperation(0);
		ventana.setResizable(false);
		iniciarComponentes();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}


	public void iniciarComponentes() {
		colocarPanel();
		//		reinosDisponible();
		//		colocarImagen();
		colocarEtiquetas();
		colocarBoton();
		colocarRadioButton();
	}

	public void colocarPanel() {
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		ventana.setContentPane(panel);

	}

	public void colocarEtiquetas() {
		etiqueta1 = new JLabel("Castilla: "+" esta a una distacia de "+control.getEspana().getCastilla().getFlota().getDestino()+" km de su puerto");
		etiqueta2 = new JLabel("Aragon: "+" esta a una distacia de "+control.getEspana().getAragon().getFlota().getDestino()+" km de su puerto");
		etiqueta3 = new JLabel("Borgoña: "+" esta a una distacia de "+control.getEspana().getBorgoña().getFlota().getDestino()+" km de su puerto");
		etiqueta4 = new JLabel("Austria: "+" esta a una distacia de "+control.getEspana().getAustria().getFlota().getDestino()+" km de su puerto");
		etiqueta5 = new JLabel("Nueva España: "+" esta a una distacia de "+control.getEspana().getNuevaEspaña().getFlota().getDestino()+" km de su puerto");
		etiqueta6 = new JLabel("Nueva Granada: "+" esta a una distacia de "+control.getEspana().getNuevaGranda().getFlota().getDestino()+" km de su puerto");
		etiqueta7 = new JLabel("Peru: "+" esta a una distacia de "+control.getEspana().getPeru().getFlota().getDestino()+" km de su puerto");
		etiqueta8 = new JLabel("Plata: "+" esta a una distacia de "+control.getEspana().getPlata().getFlota().getDestino()+" km de su puerto");
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

	//	public void reinosDisponible() {
	//		int contador=0;
	//		int bounds=10;
	//		int bondRadio=50;
	//
	//		if(control.getEspana().getNuevaEspaña().getFlota().isDisponible()==false) {
	//			etiqueta1=new JLabel("Nueva España");
	//			radio1 = new JCheckBox();
	//
	//			bondRadio=bondRadio+(30*contador);
	//			bounds=bounds+(30*contador);
	//
	//			etiqueta1.setBounds(65, bounds, 200, 100);
	//			radio1.setBounds(40, bondRadio, 20, 20);
	//
	//			contador++;
	//			panel.add(etiqueta1);
	//			panel.add(radio1);
	//			bounds=10;
	//			bondRadio=50;
	//		}
	//
	//		if(control.getEspana().getNuevaGranda().getFlota().isDisponible()==false) {
	//			etiqueta2=new JLabel("Nueva Granada");
	//			radio2 = new JCheckBox();
	//
	//			bondRadio=bondRadio+(30*contador);
	//			bounds=bounds+(30*contador);
	//
	//			etiqueta2.setBounds(65, bounds, 200, 100);
	//			radio2.setBounds(40, bondRadio, 20, 20);
	//
	//			contador++;
	//			panel.add(etiqueta2);
	//			panel.add(radio2);
	//			bounds=10;
	//			bondRadio=50;
	//		}
	//
	//		if(control.getEspana().getPeru().getFlota().isDisponible()==false) {
	//			etiqueta3=new JLabel("Peru");
	//			radio3 = new JCheckBox();
	//
	//			bondRadio=bondRadio+(30*contador);
	//			bounds=bounds+(30*contador);
	//
	//			etiqueta3.setBounds(65, bounds, 200, 100);
	//			radio3.setBounds(40, bondRadio, 20, 20);
	//
	//			contador++;
	//			panel.add(etiqueta3);
	//			panel.add(radio3);
	//			bounds=10;
	//			bondRadio=50;
	//		}
	//
	//		if(control.getEspana().getPlata().getFlota().isDisponible()==false) {
	//			etiqueta4=new JLabel("Plata");
	//			radio4 = new JCheckBox();
	//
	//			bondRadio=bondRadio+(30*contador);
	//			bounds=bounds+(30*contador);
	//
	//			etiqueta4.setBounds(65, bounds, 200, 100);
	//			radio4.setBounds(40, bondRadio, 20, 20);
	//
	//			contador++;
	//			panel.add(etiqueta4);
	//			panel.add(radio4);
	//			bounds=10;
	//			bondRadio=50;
	//		}
	//
	//		if(control.getEspana().getCastilla().getFlota().isDisponible()==false) {
	//			etiqueta5=new JLabel("Castilla");
	//			radio5 = new JCheckBox();
	//
	//			bondRadio=bondRadio+(30*contador);
	//			bounds=bounds+(30*contador);
	//
	//			etiqueta5.setBounds(65, bounds, 200, 100);
	//			radio5.setBounds(40, bondRadio, 20, 20);
	//
	//			contador++;
	//			panel.add(etiqueta5);
	//			panel.add(radio5);
	//			bounds=10;
	//			bondRadio=50;
	//		}
	//
	//		if(control.getEspana().getAragon().getFlota().isDisponible()==false) {
	//			etiqueta6=new JLabel("Aragon");
	//			radio6 = new JCheckBox();
	//
	//			bondRadio=bondRadio+(30*contador);
	//			bounds=bounds+(30*contador);
	//
	//			etiqueta6.setBounds(65, bounds, 200, 100);
	//			radio6.setBounds(40, bondRadio, 20, 20);
	//
	//			contador++;
	//			panel.add(etiqueta6);
	//			panel.add(radio6);
	//			bounds=10;
	//			bondRadio=50;
	//		}
	//
	//		if(control.getEspana().getAustria().getFlota().isDisponible()==false) {
	//			etiqueta7=new JLabel("Austria");
	//			radio7 = new JCheckBox();
	//
	//			bondRadio=bondRadio+(30*contador);
	//			bounds=bounds+(30*contador);
	//
	//			etiqueta7.setBounds(65, bounds, 200, 100);
	//			radio7.setBounds(40, bondRadio, 20, 20);
	//
	//			contador++;
	//			panel.add(etiqueta7);
	//			panel.add(radio7);
	//			bounds=10;
	//			bondRadio=50;
	//		}
	//
	//		if(control.getEspana().getBorgoña().getFlota().isDisponible()==false) {
	//			etiqueta8=new JLabel("Borgoña");
	//			radio8 = new JCheckBox();
	//
	//			bondRadio=bondRadio+(30*contador);
	//			bounds=bounds+(30*contador);
	//
	//			etiqueta8.setBounds(65, bounds, 200, 100);
	//			radio8.setBounds(40, bondRadio, 20, 20);
	//
	//			contador++;
	//			panel.add(etiqueta8);
	//			panel.add(radio8);
	//			bounds=10;
	//			bondRadio=50;
	//		}
	//		contador=0;
	//	}



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
				
				int opcion = JOptionPane.showConfirmDialog(null, "Si no ha marcado alguna Flota, no estara disponible el siguiente turno. ¿ Esta seguro de su decision ?");
				
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

					JOptionPane.showMessageDialog(null,"Las Flotas Seleccionadas, volveran a su Puerto de Origen en el siguiente turno");
					
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

	//	public void colocarImagen() {
	//		imagen1= new ImageIcon("barcoNav.gif");
	//		imagen2 = new ImageIcon("mundo.gif");
	//		etiqueta5 = new JLabel();
	//		Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(90, 90, 10));
	//		etiqueta5.setIcon(fondo1);
	//		etiqueta5.setBounds(120, 30, 100, 100);
	//		panel.add(etiqueta5);
	//
	//		etiqueta6 = new JLabel();
	//		Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(100, 100, 10));
	//		etiqueta6.setIcon(fondo2);
	//		etiqueta6.setBounds(120, 150, 200, 100);
	//		panel.add(etiqueta6);
	//	}
}
