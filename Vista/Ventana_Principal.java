package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Ventana_Principal extends JFrame {
	
	private JPanel contentPane;

	public Ventana_Principal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		iniciarComponentes();

	}
	
	public void iniciarComponentes() {
		siguienteTurno();
		crearPanelFlotas();
		crearPanelMapa();
		crearPanelMercancias();
		crearListasMercancias();
	}

	private void crearListasMercancias() {
		JPanel panelAragonMercancia = new JPanel();
		panelAragonMercancia.setBorder(new LineBorder(new Color(220, 20, 60), 2));
		panelAragonMercancia.setBounds(427, 242, 250, 70);
		contentPane.add(panelAragonMercancia);
		panelAragonMercancia.setLayout(null);
	}

	private void crearPanelMercancias() {
		JPanel panelMercancia = new JPanel();
		panelMercancia.setBorder(new LineBorder(new Color(169, 169, 169), 2));
		panelMercancia.setBounds(396, 70, 280, 70);
		contentPane.add(panelMercancia);
		panelMercancia.setLayout(null);
		
		JLabel etiquetaMercancia = new JLabel("Montar Mercancia");
		etiquetaMercancia.setBounds(90, 3, 104, 20);
		panelMercancia.add(etiquetaMercancia);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(20, 30, 236, 21);
		panelMercancia.add(menuBar_1);
		
		JMenu mnAragon = new JMenu("Europa");
		menuBar_1.add(mnAragon);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Castilla");
		mnAragon.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Aragon");
		mnAragon.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Borgo\u00F1a");
		mnAragon.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Austria");
		mnAragon.add(mntmNewMenuItem_3);
		
		JMenu mnPeru = new JMenu("Virreinatos");
		menuBar_1.add(mnPeru);
		
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Nueva Espa\u00F1a");
		mnPeru.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Nueva Granada");
		mnPeru.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Peru");
		mnPeru.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Plata");
		mnPeru.add(mntmNewMenuItem_7);
		
		JMenu mnCastilla1 = new JMenu("Comercio Exterior");
		menuBar_1.add(mnCastilla1);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Europa del Este");
		mnCastilla1.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("\u00C1frica del Norte");
		mnCastilla1.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Oriente Pr\u00F3ximo");
		mnCastilla1.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("\u00C1sia");
		mnCastilla1.add(mntmNewMenuItem_11);
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JMenuItem source = (JMenuItem) e.getSource();
				
				if(source == mntmNewMenuItem) {
					Ventana_Mercancia_Castilla f1 = new Ventana_Mercancia_Castilla();
				}else if(source == mntmNewMenuItem_1) {
					Ventana_Mercancia_Aragon f2 = new Ventana_Mercancia_Aragon();
				}else if(source == mntmNewMenuItem_2) {
					Ventana_Mercancia_Borgonha f3 = new Ventana_Mercancia_Borgonha();
				}else if(source == mntmNewMenuItem_3) {
					Ventana_Mercancia_Austria f4 = new Ventana_Mercancia_Austria();
				}
				else if(source == mntmNewMenuItem_4) {
					Ventana_Mercancia_NuevaEspaña f5 = new Ventana_Mercancia_NuevaEspaña();
				}
				else if(source == mntmNewMenuItem_5) {
					Ventana_Mercancia_NuevaGranada f6 = new Ventana_Mercancia_NuevaGranada();
				}
				else if(source == mntmNewMenuItem_6) {
					Ventana_Mercancia_Peru f7 = new Ventana_Mercancia_Peru();
				}
				else if(source == mntmNewMenuItem_7) {
					Ventana_Mercancia_Plata f8 = new Ventana_Mercancia_Plata();
				}
				else if(source == mntmNewMenuItem_8) {
					Ventana_Mercancia_EuropaEste f9 = new Ventana_Mercancia_EuropaEste();
				}
				else if(source == mntmNewMenuItem_9) {
					Ventana_Mercancia_AfricaNorte f10 = new Ventana_Mercancia_AfricaNorte();
				}
				else if(source == mntmNewMenuItem_10) {
					Ventana_Mercancia_OrienteProximo f11 = new Ventana_Mercancia_OrienteProximo();
				}
				else if(source == mntmNewMenuItem_11) {
					Ventana_Mercancia_Asia f12 = new Ventana_Mercancia_Asia();
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
		mntmNewMenuItem_8.addActionListener(listener);
		mntmNewMenuItem_9.addActionListener(listener);
		mntmNewMenuItem_10.addActionListener(listener);
		mntmNewMenuItem_11.addActionListener(listener);
		
	}
		
	private void crearPanelMapa() {
		JPanel panelMapa = new JPanel();
		panelMapa.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelMapa.setBounds(21, 11, 350, 201);
		contentPane.add(panelMapa);
		panelMapa.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario\\Desktop\\Art, anime, games\\949ab9014f655c979112cec6ad257d56.jpg"));
		lblNewLabel.setBounds(10, 11, 330, 179);
		panelMapa.add(lblNewLabel);
	}

	private void crearPanelFlotas() {
		JPanel panelFlotas = new JPanel();
		panelFlotas.setBorder(new LineBorder(Color.BLUE, 2));
		panelFlotas.setBounds(161, 242, 256, 70);
		contentPane.add(panelFlotas);
		panelFlotas.setLayout(null);
		
		JLabel etiquetaFlotas = new JLabel("Montar Flotas");
		etiquetaFlotas.setBounds(90, 3, 104, 20);
		panelFlotas.add(etiquetaFlotas);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(10, 30, 236, 21);
		panelFlotas.add(menuBar_1);
		
		JMenu mnAragon = new JMenu("Europa");
		menuBar_1.add(mnAragon);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Castilla");
		mnAragon.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Aragon");
		mnAragon.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Borgo\u00F1a");
		mnAragon.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Austria");
		mnAragon.add(mntmNewMenuItem_3);
		
		JMenu mnPeru = new JMenu("Virreinatos");
		menuBar_1.add(mnPeru);
		
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Nueva Espa\u00F1a");
		mnPeru.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Nueva Granada");
		mnPeru.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Peru");
		mnPeru.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Plata");
		mnPeru.add(mntmNewMenuItem_7);
		
		JMenu mnCastilla1 = new JMenu("Comercio Exterior");
		menuBar_1.add(mnCastilla1);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Europa del Este");
		mnCastilla1.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("\u00C1frica del Norte");
		mnCastilla1.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Oriente Pr\u00F3ximo");
		mnCastilla1.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("\u00C1sia");
		mnCastilla1.add(mntmNewMenuItem_11);
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JMenuItem source = (JMenuItem) e.getSource();
				
				if(source == mntmNewMenuItem) {
					Ventana_Flota_Castilla flota1 = new Ventana_Flota_Castilla();
				}else if(source == mntmNewMenuItem_1) {
					Ventana_Flota_Aragon flota2 = new Ventana_Flota_Aragon();
				}else if(source == mntmNewMenuItem_2) {
					Ventana_Flota_Borgonha flota3 = new Ventana_Flota_Borgonha();
				}else if(source == mntmNewMenuItem_3) {
					Ventana_Flota_Austria flota4 = new Ventana_Flota_Austria();
				}
				else if(source == mntmNewMenuItem_4) {
					Ventana_Flota_NuevaEspaña flota5 = new Ventana_Flota_NuevaEspaña();
				}
				else if(source == mntmNewMenuItem_5) {
					Ventana_Flota_NuevaGranada flota6 = new Ventana_Flota_NuevaGranada();
				}
				else if(source == mntmNewMenuItem_6) {
					Ventana_Flota_Peru flota7 = new Ventana_Flota_Peru();
				}
				else if(source == mntmNewMenuItem_7) {
					Ventana_Flota_Plata flota8 = new Ventana_Flota_Plata();
				}
				else if(source == mntmNewMenuItem_8) {
					Ventana_Flota_EuropaEste flota9 = new Ventana_Flota_EuropaEste();
				}
				else if(source == mntmNewMenuItem_9) {
					Ventana_Flota_AfricaNorte flota10 = new Ventana_Flota_AfricaNorte();
				}
				else if(source == mntmNewMenuItem_10) {
					Ventana_Flota_OrienteProximo flota11 = new Ventana_Flota_OrienteProximo();
				}
				else if(source == mntmNewMenuItem_11) {
					Ventana_Flota_Asia flota12 = new Ventana_Flota_Asia();
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
		mntmNewMenuItem_8.addActionListener(listener);
		mntmNewMenuItem_9.addActionListener(listener);
		mntmNewMenuItem_10.addActionListener(listener);
		mntmNewMenuItem_11.addActionListener(listener);
		
	}

	private void siguienteTurno() {
		JButton botonSiguienteTurno = new JButton("Siguiente turno");
		botonSiguienteTurno.setBounds(37, 242, 114, 55);
		botonSiguienteTurno.setToolTipText("");
		botonSiguienteTurno.setFont(new Font("Serif", Font.PLAIN, 11));
		botonSiguienteTurno.setForeground(Color.RED);
		contentPane.add(botonSiguienteTurno);
	}
	
}
