package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Main.PanelControl;

public class Ventana_Principal extends JFrame {


	/**
	 * Panel general.
	 */
	
	private JPanel contentPane;
	
	/**
	 * 
	 */
	
	private PanelControl control;
	
	/**
	 * Constructor de la Interfaz.
	 * @param control
	 */
	
	//Cosntructores
	public Ventana_Principal(PanelControl control) {

		this.control = control;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 565);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		setTitle("España");

		iniciarComponentes();

	}

	/**
	 * Método el cual iniciamos todos los métodos e insertarlos en el JFrame.
	 */
	
	//Metodos
	public void iniciarComponentes() {
		siguienteTurno();
		crearPanelFlotas();
		crearPanelMapa();
		crearPanelMercancias();
		crearListasMercancias();
		crearBotonDemandas();
		colocarEtiquetas();
		colocarImagenMonarca();
	}
	
	/**
	 * Panel Mapa
	 * Panel en el que se encuentran los continentes cuando se mandan flotas.
	 */
	
	private void crearPanelMapa() {
		MapaEuropa mE = new MapaEuropa(control);
		MapaAmerica mA = new MapaAmerica(control);
		
		JButton botonEuropa = new JButton("Europa");
		JButton botonAmerica = new JButton("America");
		botonEuropa.setBounds(200, 5, 90, 30);
		botonAmerica.setBounds(300, 5, 90, 30);
		
		contentPane.add(botonEuropa);
		contentPane.add(botonAmerica);
		contentPane.add(mE);
		contentPane.add(mA);
		mA.setVisible(false);
		
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton source = (JButton) e.getSource();
				
				if(source == botonEuropa) {
					mE.setVisible(true);
					mA.setVisible(false);
				}else {
					mA.setVisible(true);
					mE.setVisible(false);
				}
			
			}
		};
		
		botonEuropa.addActionListener(listener);
		botonAmerica.addActionListener(listener);
	}
	
	/**
	 * Método en el cual se mostraran las peticiones de los distintos países.
	 */

	private void crearBotonDemandas() {
		JButton boton = new JButton("Boton Circular");
		ImageIcon imagen=new ImageIcon("Clickaraqui.jpg");
		boton.setBounds(720, 25, 120, 40);
		boton.setFont(new Font("Serif", Font.PLAIN, 14));
		boton.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(getWidth(),getHeight(),Image.SCALE_SMOOTH)));
		contentPane.add(boton);
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Ventana_Demandas_Reinos ventana1=new Ventana_Demandas_Reinos(control);

			}
		};

		boton.addActionListener(listener);
	}
	
	/**
	 * Etiquetas direccionales.
	 */
	
	private void colocarEtiquetas() {
		String texto = "<html><body>|<br>|<br>|<br>|<br>|<br>|</body></html>";
		String texto2 = "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -" ;
		JLabel jl1 = new JLabel(texto);
		JLabel jl2 = new JLabel(texto);
		JLabel jl3 = new JLabel(texto);
		JLabel jl4 = new JLabel(texto2);
		JLabel jl5 = new JLabel(texto2);
		
		jl1.setBounds(780, 9, 200, 200);
		jl2.setBounds(780, 102, 200, 200);
		jl3.setBounds(780, 268, 200, 200);
		jl4.setBounds(503, 336, 300, 200);
		jl5.setBounds(50, 336, 300, 200);
		
		contentPane.add(jl1);
		contentPane.add(jl2);
		contentPane.add(jl3);
		contentPane.add(jl4);
		contentPane.add(jl5);
	}

	/**
	 * Panel Mercancias
	 * El funcionamiento de este panel consiste en que el usuario cree las mercancías con los Kilos que este quiera.
	 * Cada país tiene sus productos y cuando se crea una mercancía, la cantidad bajará.
	 */
	
	private void crearPanelMercancias() {
		JPanel panelMercancia = new JPanel();
		panelMercancia.setBorder(new LineBorder(new Color(169, 169, 169), 2));
		panelMercancia.setBounds(635, 100, 280, 70);
		contentPane.add(panelMercancia);
		panelMercancia.setLayout(null);

		JLabel etiquetaMercancia = new JLabel("Montar Mercancia");
		etiquetaMercancia.setBounds(90, 3, 104, 20);
		panelMercancia.add(etiquetaMercancia);

		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(75, 30, 135, 21);
		panelMercancia.add(menuBar_1);

		JMenu mnAragon = new JMenu("Europa");
		menuBar_1.add(mnAragon);

		JMenuItem mntmNewMenuItem = new JMenuItem("Castilla");
		mnAragon.add(mntmNewMenuItem);
		
		if(control.getEspana().getCastilla().isSublevaciones()==true) {
			mntmNewMenuItem.setEnabled(false);
		}
	
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Aragon");
		mnAragon.add(mntmNewMenuItem_1);
		
		if(control.getEspana().getAragon().isSublevaciones()==true) {
			mntmNewMenuItem_1.setEnabled(false);
		}

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Borgoña");
		mnAragon.add(mntmNewMenuItem_2);
		
		if(control.getEspana().getBorgoña().isSublevaciones()==true) {
			mntmNewMenuItem_2.setEnabled(false);
		}

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Austria");
		mnAragon.add(mntmNewMenuItem_3);
		
		if(control.getEspana().getAustria().isSublevaciones()==true) {
			mntmNewMenuItem_3.setEnabled(false);
		}

		JMenu mnPeru = new JMenu("Virreinatos");
		menuBar_1.add(mnPeru);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Nueva España");
		mnPeru.add(mntmNewMenuItem_4);
		
		if(control.getEspana().getNuevaEspaña().isSublevaciones()==true) {
			mntmNewMenuItem_4.setEnabled(false);
		}

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Nueva Granada");
		mnPeru.add(mntmNewMenuItem_5);
		
		if(control.getEspana().getNuevaGranda().isSublevaciones()==true) {
			mntmNewMenuItem_5.setEnabled(false);
		}

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Peru");
		mnPeru.add(mntmNewMenuItem_6);
		
		if(control.getEspana().getPeru().isSublevaciones()==true) {
			mntmNewMenuItem_6.setEnabled(false);
		}

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Plata");
		mnPeru.add(mntmNewMenuItem_7);
		
		if(control.getEspana().getPlata().isSublevaciones()==true) {
			mntmNewMenuItem_7.setEnabled(false);
		}

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JMenuItem source = (JMenuItem) e.getSource();

				if (source == mntmNewMenuItem) {
					Ventana_Mercancia_Castilla f1 = new Ventana_Mercancia_Castilla(control);
				} else if (source == mntmNewMenuItem_1) {
					Ventana_Mercancia_Aragon f2 = new Ventana_Mercancia_Aragon(control);
				} else if (source == mntmNewMenuItem_2) {
					Ventana_Mercancia_Borgonha f3 = new Ventana_Mercancia_Borgonha(control);
				} else if (source == mntmNewMenuItem_3) {
					Ventana_Mercancia_Austria f4 = new Ventana_Mercancia_Austria(control);
				} else if (source == mntmNewMenuItem_4) {
					Ventana_Mercancia_NuevaEspaña f5 = new Ventana_Mercancia_NuevaEspaña(control);
				} else if (source == mntmNewMenuItem_5) {
					Ventana_Mercancia_NuevaGranada f6 = new Ventana_Mercancia_NuevaGranada(control);
				} else if (source == mntmNewMenuItem_6) {
					Ventana_Mercancia_Peru f7 = new Ventana_Mercancia_Peru(control);
				} else if (source == mntmNewMenuItem_7) {
					Ventana_Mercancia_Plata f8 = new Ventana_Mercancia_Plata(control);
				}
			}
		};

		mntmNewMenuItem.addActionListener(listener);
		mntmNewMenuItem_1.addActionListener(listener);
		mntmNewMenuItem_2.addActionListener(listener);
		mntmNewMenuItem_3.addActionListener(listener);
		mntmNewMenuItem_4.addActionListener(listener);
		mntmNewMenuItem_5.addActionListener(listener);
		mntmNewMenuItem_6.addActionListener(listener);
		mntmNewMenuItem_7.addActionListener(listener);

	}
	
	/**
	 * Panel Listas Mercancias
	 * En este panel se guardarán las mercancías de los distintos países creadas por el usuario.
	 * Se seleccionará que mercancías quiere almacenar en la flota.
	 * A su vez se mostrará cuanto peso puede transportar la flota y cuanto peso ha introducido.
	 */
	
	private void crearListasMercancias() {
		JMenuItem mntmNewMenuItem;
		JMenuItem mntmNewMenuItem_1;
		JMenuItem mntmNewMenuItem_2;
		JMenuItem mntmNewMenuItem_3;
		JMenuItem mntmNewMenuItem_4;
		JMenuItem mntmNewMenuItem_5;
		JMenuItem mntmNewMenuItem_6;
		JMenuItem mntmNewMenuItem_7;

		JPanel panelAragonMercancia = new JPanel();
		panelAragonMercancia.setBorder(new LineBorder(new Color(220, 20, 60), 2));
		panelAragonMercancia.setBounds(635, 250, 280, 70);
		contentPane.add(panelAragonMercancia);
		panelAragonMercancia.setLayout(null);

		JLabel etiquetaMercancia = new JLabel("Introducir Mercancias");
		etiquetaMercancia.setBounds(80, 3, 130, 20);
		panelAragonMercancia.add(etiquetaMercancia);

		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(75, 30, 135, 21);
		panelAragonMercancia.add(menuBar_1);

		JMenu mnAragon = new JMenu("Europa");
		menuBar_1.add(mnAragon);

		mntmNewMenuItem = new JMenuItem("Castilla");
		mnAragon.add(mntmNewMenuItem);


		if(control.getEspana().getCastilla().isSublevaciones()==true) {
			mntmNewMenuItem.setEnabled(false);
		}

		mntmNewMenuItem_1 = new JMenuItem("Aragon");
		mnAragon.add(mntmNewMenuItem_1);

		if(control.getEspana().getAragon().isSublevaciones()==true) {
			mntmNewMenuItem_1.setEnabled(false);
		}

		mntmNewMenuItem_2 = new JMenuItem("Borgoña");
		mnAragon.add(mntmNewMenuItem_2);

		if(control.getEspana().getBorgoña().isSublevaciones()==true) {
			mntmNewMenuItem_2.setEnabled(false);
		}

		mntmNewMenuItem_3 = new JMenuItem("Austria");
		mnAragon.add(mntmNewMenuItem_3);

		if(control.getEspana().getAustria().isSublevaciones()==true) {
			mntmNewMenuItem_3.setEnabled(false);
		}

		JMenu mnPeru = new JMenu("Virreinatos");
		menuBar_1.add(mnPeru);

		mntmNewMenuItem_4 = new JMenuItem("Nueva España");
		mnPeru.add(mntmNewMenuItem_4);

		if(control.getEspana().getNuevaEspaña().isSublevaciones()==true) {
			mntmNewMenuItem_4.setEnabled(false);
		}

		mntmNewMenuItem_5 = new JMenuItem("Nueva Granada");
		mnPeru.add(mntmNewMenuItem_5);

		if(control.getEspana().getNuevaGranda().isSublevaciones()==true) {
			mntmNewMenuItem_5.setEnabled(false);
		}

		mntmNewMenuItem_6 = new JMenuItem("Peru");
		mnPeru.add(mntmNewMenuItem_6);

		if(control.getEspana().getPeru().isSublevaciones()==true) {
			mntmNewMenuItem_6.setEnabled(false);
		}

		mntmNewMenuItem_7 = new JMenuItem("Plata");
		mnPeru.add(mntmNewMenuItem_7);

		if(control.getEspana().getPlata().isSublevaciones()==true) {
			mntmNewMenuItem_7.setEnabled(false);
		}

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JMenuItem source = (JMenuItem) e.getSource();
				String nombre="";
				int distancia=0;

				if(source == mntmNewMenuItem && control.getEspana().getCastilla().getFlota().isDisponible()) {
					Ventana_Almacen_Castilla almacenar1 = new Ventana_Almacen_Castilla(control);


				}else if(source == mntmNewMenuItem_1 && control.getEspana().getAragon().getFlota().isDisponible()) {	
					Ventana_Almacen_Aragon f2 = new Ventana_Almacen_Aragon(control);


				}else if(source == mntmNewMenuItem_2 && control.getEspana().getBorgoña().getFlota().isDisponible()){	
					Ventana_Almacen_Borgonha f3 = new Ventana_Almacen_Borgonha(control);


				}else if(source == mntmNewMenuItem_3 && control.getEspana().getAustria().getFlota().isDisponible()){
					Ventana_Almacen_Austria f4 = new Ventana_Almacen_Austria(control);


				}else if(source == mntmNewMenuItem_4 && control.getEspana().getNuevaEspaña().getFlota().isDisponible()){
					Ventana_Almacen_NuevaEspaña f5 = new Ventana_Almacen_NuevaEspaña(control);


				}else if(source == mntmNewMenuItem_5 && control.getEspana().getNuevaGranda().getFlota().isDisponible()){
					Ventana_Almacen_NuevaGranada f6 = new Ventana_Almacen_NuevaGranada(control);


				}else if(source == mntmNewMenuItem_6 && control.getEspana().getPeru().getFlota().isDisponible()){	
					Ventana_Almacen_Peru f7 = new Ventana_Almacen_Peru(control);


				}else if (source == mntmNewMenuItem_7 && control.getEspana().getPlata().getFlota().isDisponible()){		
					Ventana_Almacen_Plata f8 = new Ventana_Almacen_Plata(control);

				}else {
					JOptionPane.showMessageDialog(null," Este reino ya zarpo su flota");
				}
			}
		};

		mntmNewMenuItem.addActionListener(listener);
		mntmNewMenuItem_1.addActionListener(listener);
		mntmNewMenuItem_2.addActionListener(listener);
		mntmNewMenuItem_3.addActionListener(listener);
		mntmNewMenuItem_4.addActionListener(listener);
		mntmNewMenuItem_5.addActionListener(listener);
		mntmNewMenuItem_6.addActionListener(listener);
		mntmNewMenuItem_7.addActionListener(listener);

	}

	/**
	 * Panel Flotas
	 * Panel en el que se encuentran las flotas de los diferentes países.
	 * En el, se podrá ver las mercancías almacenadas en cada flota.
	 * Por último, se mandará esa flota con las mercancías al lugar (destino) que se desee.
	 */
	
	private void crearPanelFlotas() {
		JPanel panelFlotas = new JPanel();
		panelFlotas.setBorder(new LineBorder(Color.BLUE, 2));
		panelFlotas.setBounds(635, 400, 280, 70);
		contentPane.add(panelFlotas);
		panelFlotas.setLayout(null);

		JLabel etiquetaFlotas = new JLabel("Montar Flotas");
		etiquetaFlotas.setBounds(90, 3, 104, 20);
		panelFlotas.add(etiquetaFlotas);

		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(70, 30, 135, 21);
		panelFlotas.add(menuBar_1);

		JMenu mnAragon = new JMenu("Europa");
		menuBar_1.add(mnAragon);

		JMenuItem mntmNewMenuItem = new JMenuItem("Castilla");
		mnAragon.add(mntmNewMenuItem);
		
		if(control.getEspana().getCastilla().isSublevaciones()==true) {
			mntmNewMenuItem.setEnabled(false);
		}

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Aragon");
		mnAragon.add(mntmNewMenuItem_1);
		
		if(control.getEspana().getAragon().isSublevaciones()==true) {
			mntmNewMenuItem_1.setEnabled(false);
		}

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Borgoña");
		mnAragon.add(mntmNewMenuItem_2);
		
		if(control.getEspana().getBorgoña().isSublevaciones()==true) {
			mntmNewMenuItem_2.setEnabled(false);
		}

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Austria");
		mnAragon.add(mntmNewMenuItem_3);
		
		if(control.getEspana().getAustria().isSublevaciones()==true) {
			mntmNewMenuItem_3.setEnabled(false);
		}

		JMenu mnPeru = new JMenu("Virreinatos");
		menuBar_1.add(mnPeru);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Nueva España");
		mnPeru.add(mntmNewMenuItem_4);
		
		if(control.getEspana().getNuevaEspaña().isSublevaciones()==true) {
			mntmNewMenuItem_4.setEnabled(false);
		}

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Nueva Granada");
		mnPeru.add(mntmNewMenuItem_5);
		
		if(control.getEspana().getNuevaGranda().isSublevaciones()==true) {
			mntmNewMenuItem_5.setEnabled(false);
		}

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Peru");
		mnPeru.add(mntmNewMenuItem_6);
		
		if(control.getEspana().getPeru().isSublevaciones()==true) {
			mntmNewMenuItem_6.setEnabled(false);
		}

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Plata");
		mnPeru.add(mntmNewMenuItem_7);
		
		if(control.getEspana().getPlata().isSublevaciones()==true) {
			mntmNewMenuItem_7.setEnabled(false);
		}

		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JMenuItem source = (JMenuItem) e.getSource();

				if (source == mntmNewMenuItem) {
					Ventana_Flota_Castilla flota1 = new Ventana_Flota_Castilla(control);

				} else if (source == mntmNewMenuItem_1) {
					Ventana_Flota_Aragon flota2 = new Ventana_Flota_Aragon(control);

				} else if (source == mntmNewMenuItem_2) {
					Ventana_Flota_Borgonha flota3 = new Ventana_Flota_Borgonha(control);

				} else if (source == mntmNewMenuItem_3) {
					Ventana_Flota_Austria flota4 = new Ventana_Flota_Austria(control);

				} else if (source == mntmNewMenuItem_4) {
					Ventana_Flota_NuevaEspaña flota5 = new Ventana_Flota_NuevaEspaña(control);

				} else if (source == mntmNewMenuItem_5) {
					Ventana_Flota_NuevaGranada flota6 = new Ventana_Flota_NuevaGranada(control);

				} else if (source == mntmNewMenuItem_6) {
					Ventana_Flota_Peru flota7 = new Ventana_Flota_Peru(control);

				} else if (source == mntmNewMenuItem_7) {
					Ventana_Flota_Plata flota8 = new Ventana_Flota_Plata(control);

				}
			}
		};

		mntmNewMenuItem.addActionListener(listener);
		mntmNewMenuItem_1.addActionListener(listener);
		mntmNewMenuItem_2.addActionListener(listener);
		mntmNewMenuItem_3.addActionListener(listener);
		mntmNewMenuItem_4.addActionListener(listener);
		mntmNewMenuItem_5.addActionListener(listener);
		mntmNewMenuItem_6.addActionListener(listener);
		mntmNewMenuItem_7.addActionListener(listener);

	}
	
	/**
	 * hacer javadoc
	 */
	
	private void colocarImagenMonarca() {
		
		JLabel monarca = new JLabel();
		monarca.setBorder(new LineBorder(Color.BLACK, 4));
		monarca.setHorizontalAlignment(SwingConstants.CENTER);
		monarca.setIcon(new ImageIcon("imagenes/CarlosI.gif"));
		monarca.setBounds(328, 380, 175, 140);
		add(monarca);
		
		//Cambiar número de turnos
		
		if(PanelControl.getContadorTurnos()<10) {
			monarca.setIcon(new ImageIcon("imagenes/Odin.gif"));
			
		}else if(PanelControl.getContadorTurnos()>=10) {
			monarca.setIcon(new ImageIcon("imagenes/CarlosII.gif"));
			
		}else if(PanelControl.getContadorTurnos()>=15) {
			monarca.setIcon(new ImageIcon("imagenes/FelipeII.gif"));
			
		}else if(PanelControl.getContadorTurnos()>=20) {
			monarca.setIcon(new ImageIcon("imagenes/FelipeIII.gif"));
			
		}else if(PanelControl.getContadorTurnos()>=25) {
			monarca.setIcon(new ImageIcon("imagenes/FelipeIV.gif"));
			
		}else
			monarca.setIcon(new ImageIcon("imagenes/Odin.gif"));
		
	}
	
	/**
	 * Boton Siguiente Turno
	 * Boton cuyo funcionamiento consiste en pasar al turno/ronda siguiente.
	 */
	
	private void siguienteTurno() {
		JButton botonSiguienteTurno = new JButton("Siguiente turno");
		botonSiguienteTurno.setBounds(45, 405, 140, 60);
		botonSiguienteTurno.setToolTipText("");
		botonSiguienteTurno.setFont(new Font("Serif", Font.PLAIN, 11));
		botonSiguienteTurno.setForeground(Color.RED);
		contentPane.add(botonSiguienteTurno);

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				

				Ventana_RetornarFlotas retornar = new Ventana_RetornarFlotas(control);

				System.out.println("hola");

			}
		};

		botonSiguienteTurno.addActionListener(listener);
	}

}
