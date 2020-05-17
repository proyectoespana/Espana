import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Pruebas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pruebas frame = new Pruebas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pruebas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
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
		
		JPanel panelFlotas = new JPanel();
		panelFlotas.setBorder(new LineBorder(Color.BLUE, 2));
		panelFlotas.setBounds(161, 242, 256, 61);
		contentPane.add(panelFlotas);
		panelFlotas.setLayout(null);
		
		////////////////
		//FLOTAS//////////////////
		
		JLabel lblMontarFlotas = DefaultComponentFactory.getInstance().createTitle("Montar flotas");
		lblMontarFlotas.setBounds(10, 5, 124, 14);
		panelFlotas.add(lblMontarFlotas);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(10, 25, 236, 21);
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
		
		//Ventanas de la FLOTA ////////////////////!!!!!!!!!!!!!!!!!!!!!!!
		///////////////////////////////////
		////////////////////////////////////
		
		JFrame ventana_1 = new JFrame();
		ventana_1.setSize(430, 250);
//		ventana_1.setLayout(null);
		
		JFrame ventana2 = new JFrame();
		ventana2.setSize(400, 300);
//		ventana2.setLayout(null);
		
		JFrame ventana_2 = new JFrame();
		ventana_2.setSize(400, 300);
//		ventana_2.setLayout(null);
		
		JFrame ventana_3 = new JFrame();
		ventana_3.setSize(400, 300);
//		ventana_3.setLayout(null);
		
		JFrame ventana_4 = new JFrame();
		ventana_4.setSize(400, 300);
//		ventana_4.setLayout(null);
		
		JFrame ventana_5 = new JFrame();
		ventana_5.setSize(400, 300);
//		ventana_5.setLayout(null);
		
		JFrame ventana_6 = new JFrame();
		ventana_6.setSize(400, 300);
//		ventana_6.setLayout(null);
		
		JFrame ventana_7 = new JFrame();
		ventana_7.setSize(400, 300);
//		ventana_7.setLayout(null);
		
		JFrame ventana_8 = new JFrame();
		ventana_8.setSize(400, 300);
//		ventana_8.setLayout(null);
		
		JFrame ventana_9 = new JFrame();
		ventana_9.setSize(400, 300);
//		ventana_9.setLayout(null);
		
		JFrame ventana_10 = new JFrame();
		ventana_10.setSize(400, 300);
//		ventana_10.setLayout(null);
		
		JFrame ventana_11 = new JFrame();
		ventana_11.setSize(400, 300);
//		ventana_11.setLayout(null);
		
		JFrame ventana_12 = new JFrame();
		ventana_12.setSize(400, 300);
//		ventana_12.setLayout(null);
		
		////////
		////////
		//FUNCIONALIDAD DE LAS FLOTAS
		/////////
		//////////
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JMenuItem source = (JMenuItem) e.getSource();
				
				if(source == mntmNewMenuItem) {
					JPanel p1 = new JPanel();
					JLabel j1 = new JLabel("Mercancias de Castilla");
					JLabel j2 = new JLabel("Mercancias");
					JLabel j3 = new JLabel("~~~~~~~~~~~~~~");
					JLabel j4 = new JLabel("Destino");
					JLabel j5 = new JLabel();
					ImageIcon imagen1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\barcoNav.gif");
					Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(90, 90, 10));
					j5.setIcon(fondo1);
					String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
					JComboBox jb1 = new JComboBox(c1);
					String [] c2 = {"a", "b", "c"};
					JComboBox jb2 = new JComboBox(c2);
					j1.setBounds(150, -25, 150, 100);
					j2.setBounds(60, 40, 100, 100);
					j3.setBounds(160, 80, 100, 100);
					j4.setBounds(290, 40, 100, 100);
					j5.setBounds(165, 30, 100, 100);
					jb1.setBounds(40, 120, 110, 20);
					jb2.setBounds(270, 120, 100, 20);
					p1.add(j1);
					p1.add(j2);
					p1.add(j3);
					p1.add(j4);
					p1.add(j5);
					p1.add(jb1);
					p1.add(jb2);
					p1.setLayout(null);
					ventana_1.getContentPane().add(p1);
					ventana_1.setLocationRelativeTo(null);
					ventana_1.setVisible(true);
					ventana_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if(source == mntmNewMenuItem_1){
					JPanel p1 = new JPanel();
					JLabel j1 = new JLabel("Mercancias de Castilla");
					JLabel j2 = new JLabel("Mercancias");
					JLabel j3 = new JLabel("~~~~~~~~~~~~~~");
					JLabel j4 = new JLabel("Destino");
					JLabel j5 = new JLabel();
					ImageIcon imagen1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\barcoNavegando.gif");
					Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, 10));
					j5.setIcon(fondo1);
					String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
					JComboBox jb1 = new JComboBox(c1);
					String [] c2 = {"a", "b", "c"};
					JComboBox jb2 = new JComboBox(c2);
					j1.setBounds(150, -25, 150, 100);
					j2.setBounds(60, 40, 100, 100);
					j3.setBounds(160, 80, 100, 100);
					j4.setBounds(290, 40, 100, 100);
					j5.setBounds(165, 30, 100, 100);
					jb1.setBounds(40, 120, 110, 20);
					jb2.setBounds(270, 120, 100, 20);
					p1.add(j1);
					p1.add(j2);
					p1.add(j3);
					p1.add(j4);
					p1.add(j5);
					p1.add(jb1);
					p1.add(jb2);
					p1.setLayout(null);
					ventana_1.getContentPane().add(p1);
					ventana_1.setLocationRelativeTo(null);
					ventana_1.setVisible(true);
					ventana_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if(source == mntmNewMenuItem_2){
					JPanel p1 = new JPanel();
					JLabel j1 = new JLabel("Mercancias de Castilla");
					JLabel j2 = new JLabel("Mercancias");
					JLabel j3 = new JLabel("~~~~~~~~~~~~~~");
					JLabel j4 = new JLabel("Destino");
					JLabel j5 = new JLabel();
					ImageIcon imagen1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\barcoNav.gif");
					Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, 10));
					j5.setIcon(fondo1);
					String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
					JComboBox jb1 = new JComboBox(c1);
					String [] c2 = {"a", "b", "c"};
					JComboBox jb2 = new JComboBox(c2);
					j1.setBounds(150, -25, 150, 100);
					j2.setBounds(60, 40, 100, 100);
					j3.setBounds(160, 80, 100, 100);
					j4.setBounds(290, 40, 100, 100);
					j5.setBounds(165, 30, 100, 100);
					jb1.setBounds(40, 120, 110, 20);
					jb2.setBounds(270, 120, 100, 20);
					p1.add(j1);
					p1.add(j2);
					p1.add(j3);
					p1.add(j4);
					p1.add(j5);
					p1.add(jb1);
					p1.add(jb2);
					p1.setLayout(null);
					ventana_1.getContentPane().add(p1);
					ventana_1.setLocationRelativeTo(null);
					ventana_1.setVisible(true);
					ventana_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if(source == mntmNewMenuItem_3){
					JPanel p1 = new JPanel();
					JLabel j1 = new JLabel("Mercancias de Castilla");
					JLabel j2 = new JLabel("Mercancias");
					JLabel j3 = new JLabel("~~~~~~~~~~~~~~");
					JLabel j4 = new JLabel("Destino");
					JLabel j5 = new JLabel();
					ImageIcon imagen1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\barcoNav.gif");
					Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, 10));
					j5.setIcon(fondo1);
					String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
					JComboBox jb1 = new JComboBox(c1);
					String [] c2 = {"a", "b", "c"};
					JComboBox jb2 = new JComboBox(c2);
					j1.setBounds(150, -25, 150, 100);
					j2.setBounds(60, 40, 100, 100);
					j3.setBounds(160, 80, 100, 100);
					j4.setBounds(290, 40, 100, 100);
					j5.setBounds(165, 30, 100, 100);
					jb1.setBounds(40, 120, 110, 20);
					jb2.setBounds(270, 120, 100, 20);
					p1.add(j1);
					p1.add(j2);
					p1.add(j3);
					p1.add(j4);
					p1.add(j5);
					p1.add(jb1);
					p1.add(jb2);
					p1.setLayout(null);
					ventana_1.getContentPane().add(p1);
					ventana_1.setLocationRelativeTo(null);
					ventana_1.setVisible(true);
					ventana_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if(source == mntmNewMenuItem_4){
					JPanel p1 = new JPanel();
					JLabel j1 = new JLabel("Mercancias de Castilla");
					JLabel j2 = new JLabel("Mercancias");
					JLabel j3 = new JLabel("~~~~~~~~~~~~~~");
					JLabel j4 = new JLabel("Destino");
					JLabel j5 = new JLabel();
					ImageIcon imagen1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\barcoNav.gif");
					Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, 10));
					j5.setIcon(fondo1);
					String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
					JComboBox jb1 = new JComboBox(c1);
					String [] c2 = {"a", "b", "c"};
					JComboBox jb2 = new JComboBox(c2);
					j1.setBounds(150, -25, 150, 100);
					j2.setBounds(60, 40, 100, 100);
					j3.setBounds(160, 80, 100, 100);
					j4.setBounds(290, 40, 100, 100);
					j5.setBounds(165, 30, 100, 100);
					jb1.setBounds(40, 120, 110, 20);
					jb2.setBounds(270, 120, 100, 20);
					p1.add(j1);
					p1.add(j2);
					p1.add(j3);
					p1.add(j4);
					p1.add(j5);
					p1.add(jb1);
					p1.add(jb2);
					p1.setLayout(null);
					ventana_1.getContentPane().add(p1);
					ventana_1.setLocationRelativeTo(null);
					ventana_1.setVisible(true);
					ventana_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if(source == mntmNewMenuItem_5){
					JPanel p1 = new JPanel();
					JLabel j1 = new JLabel("Mercancias de Castilla");
					JLabel j2 = new JLabel("Mercancias");
					JLabel j3 = new JLabel("~~~~~~~~~~~~~~");
					JLabel j4 = new JLabel("Destino");
					JLabel j5 = new JLabel();
					ImageIcon imagen1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\barcoNav.gif");
					Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, 10));
					j5.setIcon(fondo1);
					String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
					JComboBox jb1 = new JComboBox(c1);
					String [] c2 = {"a", "b", "c"};
					JComboBox jb2 = new JComboBox(c2);
					j1.setBounds(150, -25, 150, 100);
					j2.setBounds(60, 40, 100, 100);
					j3.setBounds(160, 80, 100, 100);
					j4.setBounds(290, 40, 100, 100);
					j5.setBounds(165, 30, 100, 100);
					jb1.setBounds(50, 120, 100, 20);
					jb2.setBounds(270, 120, 100, 20);
					p1.add(j1);
					p1.add(j2);
					p1.add(j3);
					p1.add(j4);
					p1.add(j5);
					p1.add(jb1);
					p1.add(jb2);
					p1.setLayout(null);
					ventana_1.getContentPane().add(p1);
					ventana_1.setLocationRelativeTo(null);
					ventana_1.setVisible(true);
					ventana_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if(source == mntmNewMenuItem_6){
					JPanel p1 = new JPanel();
					JLabel j1 = new JLabel("Mercancias de Castilla");
					JLabel j2 = new JLabel("Mercancias");
					JLabel j3 = new JLabel("~~~~~~~~~~~~~~");
					JLabel j4 = new JLabel("Destino");
					JLabel j5 = new JLabel();
					ImageIcon imagen1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\barcoNav.gif");
					Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, 10));
					j5.setIcon(fondo1);
					String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
					JComboBox jb1 = new JComboBox(c1);
					String [] c2 = {"a", "b", "c"};
					JComboBox jb2 = new JComboBox(c2);
					j1.setBounds(150, -25, 150, 100);
					j2.setBounds(60, 40, 100, 100);
					j3.setBounds(160, 80, 100, 100);
					j4.setBounds(290, 40, 100, 100);
					j5.setBounds(165, 30, 100, 100);
					jb1.setBounds(50, 120, 100, 20);
					jb2.setBounds(270, 120, 100, 20);
					p1.add(j1);
					p1.add(j2);
					p1.add(j3);
					p1.add(j4);
					p1.add(j5);
					p1.add(jb1);
					p1.add(jb2);
					p1.setLayout(null);
					ventana_1.getContentPane().add(p1);
					ventana_1.setLocationRelativeTo(null);
					ventana_1.setVisible(true);
					ventana_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if(source == mntmNewMenuItem_7){
					JPanel p1 = new JPanel();
					JLabel j1 = new JLabel("Mercancias de Castilla");
					JLabel j2 = new JLabel("Mercancias");
					JLabel j3 = new JLabel("~~~~~~~~~~~~~~");
					JLabel j4 = new JLabel("Destino");
					JLabel j5 = new JLabel();
					ImageIcon imagen1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\barcoNav.gif");
					Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, 10));
					j5.setIcon(fondo1);
					String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
					JComboBox jb1 = new JComboBox(c1);
					String [] c2 = {"a", "b", "c"};
					JComboBox jb2 = new JComboBox(c2);
					j1.setBounds(150, -25, 150, 100);
					j2.setBounds(60, 40, 100, 100);
					j3.setBounds(160, 80, 100, 100);
					j4.setBounds(290, 40, 100, 100);
					j5.setBounds(165, 30, 100, 100);
					jb1.setBounds(40, 120, 110, 20);
					jb2.setBounds(270, 120, 100, 20);
					p1.add(j1);
					p1.add(j2);
					p1.add(j3);
					p1.add(j4);
					p1.add(j5);
					p1.add(jb1);
					p1.add(jb2);
					p1.setLayout(null);
					ventana_1.getContentPane().add(p1);
					ventana_1.setLocationRelativeTo(null);
					ventana_1.setVisible(true);
					ventana_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if(source == mntmNewMenuItem_8){
					JPanel p1 = new JPanel();
					JLabel j1 = new JLabel("Mercancias de Castilla");
					JLabel j2 = new JLabel("Mercancias");
					JLabel j3 = new JLabel("~~~~~~~~~~~~~~");
					JLabel j4 = new JLabel("Destino");
					JLabel j5 = new JLabel();
					ImageIcon imagen1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\barcoNav.gif");
					Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, 10));
					j5.setIcon(fondo1);
					String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
					JComboBox jb1 = new JComboBox(c1);
					String [] c2 = {"a", "b", "c"};
					JComboBox jb2 = new JComboBox(c2);
					j1.setBounds(150, -25, 150, 100);
					j2.setBounds(60, 40, 100, 100);
					j3.setBounds(160, 80, 100, 100);
					j4.setBounds(290, 40, 100, 100);
					j5.setBounds(165, 30, 100, 100);
					jb1.setBounds(40, 120, 110, 20);
					jb2.setBounds(270, 120, 100, 20);
					p1.add(j1);
					p1.add(j2);
					p1.add(j3);
					p1.add(j4);
					p1.add(j5);
					p1.add(jb1);
					p1.add(jb2);
					p1.setLayout(null);
					ventana_1.getContentPane().add(p1);
					ventana_1.setLocationRelativeTo(null);
					ventana_1.setVisible(true);
					ventana_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if(source == mntmNewMenuItem_9){
					JPanel p1 = new JPanel();
					JLabel j1 = new JLabel("Mercancias de Castilla");
					JLabel j2 = new JLabel("Mercancias");
					JLabel j3 = new JLabel("~~~~~~~~~~~~~~");
					JLabel j4 = new JLabel("Destino");
					JLabel j5 = new JLabel();
					ImageIcon imagen1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\barcoNav.gif");
					Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, 10));
					j5.setIcon(fondo1);
					String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
					JComboBox jb1 = new JComboBox(c1);
					String [] c2 = {"a", "b", "c"};
					JComboBox jb2 = new JComboBox(c2);
					j1.setBounds(150, -25, 150, 100);
					j2.setBounds(60, 40, 100, 100);
					j3.setBounds(160, 80, 100, 100);
					j4.setBounds(290, 40, 100, 100);
					j5.setBounds(165, 30, 100, 100);
					jb1.setBounds(40, 120, 110, 20);
					jb2.setBounds(270, 120, 100, 20);
					p1.add(j1);
					p1.add(j2);
					p1.add(j3);
					p1.add(j4);
					p1.add(j5);
					p1.add(jb1);
					p1.add(jb2);
					p1.setLayout(null);
					ventana_1.getContentPane().add(p1);
					ventana_1.setLocationRelativeTo(null);
					ventana_1.setVisible(true);
					ventana_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				
				else if(source == mntmNewMenuItem_10){
					JPanel p1 = new JPanel();
					JLabel j1 = new JLabel("Mercancias de Castilla");
					JLabel j2 = new JLabel("Mercancias");
					JLabel j3 = new JLabel("~~~~~~~~~~~~~~");
					JLabel j4 = new JLabel("Destino");
					JLabel j5 = new JLabel();
					ImageIcon imagen1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\barcoNav.gif");
					Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, 10));
					j5.setIcon(fondo1);
					String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
					JComboBox jb1 = new JComboBox(c1);
					String [] c2 = {"a", "b", "c"};
					JComboBox jb2 = new JComboBox(c2);
					j1.setBounds(150, -25, 150, 100);
					j2.setBounds(60, 40, 100, 100);
					j3.setBounds(160, 80, 100, 100);
					j4.setBounds(290, 40, 100, 100);
					j5.setBounds(165, 30, 100, 100);
					jb1.setBounds(40, 120, 110, 20);
					jb2.setBounds(270, 120, 100, 20);
					p1.add(j1);
					p1.add(j2);
					p1.add(j3);
					p1.add(j4);
					p1.add(j5);
					p1.add(jb1);
					p1.add(jb2);
					p1.setLayout(null);
					ventana_1.getContentPane().add(p1);
					ventana_1.setLocationRelativeTo(null);
					ventana_1.setVisible(true);
					ventana_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				}
				else if(source == mntmNewMenuItem_11){
					JPanel p1 = new JPanel();
					JLabel j1 = new JLabel("Mercancias de Castilla");
					JLabel j2 = new JLabel("Mercancias");
					JLabel j3 = new JLabel("~~~~~~~~~~~~~~");
					JLabel j4 = new JLabel("Destino");
					JLabel j5 = new JLabel();
					ImageIcon imagen1 = new ImageIcon("C:\\Users\\Usuario\\Desktop\\barcoNav.gif");
					Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, 10));
					j5.setIcon(fondo1);
					String [] c1 = {"Mercancia Nº 1", "Mercancia Nº 2", "Mercancia Nº 3"};
					JComboBox jb1 = new JComboBox(c1);
					String [] c2 = {"a", "b", "c"};
					JComboBox jb2 = new JComboBox(c2);
					j1.setBounds(150, -25, 150, 100);
					j2.setBounds(60, 40, 100, 100);
					j3.setBounds(160, 80, 100, 100);
					j4.setBounds(290, 40, 100, 100);
					j5.setBounds(165, 30, 100, 100);
					jb1.setBounds(40, 120, 110, 20);
					jb2.setBounds(270, 120, 100, 20);
					p1.add(j1);
					p1.add(j2);
					p1.add(j3);
					p1.add(j4);
					p1.add(j5);
					p1.add(jb1);
					p1.add(jb2);
					p1.setLayout(null);
					ventana_1.getContentPane().add(p1);
					ventana_1.setLocationRelativeTo(null);
					ventana_1.setVisible(true);
					ventana_1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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
		
		JPanel panelMercancia = new JPanel();
		panelMercancia.setBorder(new LineBorder(new Color(169, 169, 169), 2));
		panelMercancia.setBounds(396, 11, 281, 48);
		contentPane.add(panelMercancia);
		panelMercancia.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(20, 11, 251, 21);
		panelMercancia.add(menuBar);
		
		//Europa
		
		//Castilla
		
		JMenu mnEuropa = new JMenu("Europa");
		menuBar.add(mnEuropa);
		
		JMenu mnNewMenu = new JMenu("Castilla");
		mnEuropa.add(mnNewMenu);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 220, 185);
		mnNewMenu.add(panel);
		
		JLabel lblOro = new JLabel("Trigo ------ 2500 Kg");
		lblOro.setBounds(40, 0, 129, 14);
		panel.add(lblOro);
		
		JLabel lblMaiz = new JLabel("Uvas ------ 20000 Kg");
		lblMaiz.setBounds(40, 50, 129, 14);
		panel.add(lblMaiz);
		
		JLabel lblTomate = new JLabel("Hierro ------ 61000 Kg");
		lblTomate.setBounds(40, 100, 129, 14);
		panel.add(lblTomate);
		
		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMaximum(2500);
		slider.setBounds(10, 20, 140, 23);
		slider.contains(0, 1000);
		panel.add(slider);
		
		JSlider slider_1 = new JSlider();
		slider_1.setBounds(10, 70, 140, 23);
		panel.add(slider_1);
		
		JSlider slider_2 = new JSlider();
		slider_2.setBounds(10, 120, 140, 23);
		panel.add(slider_2);
		
		JTextField textPane = new JTextField();
		textPane.setBounds(160, 20, 40, 20);
		panel.add(textPane);
		
		JTextField textPane_1 = new JTextField();
		textPane_1.setBounds(160, 70, 40, 20);
		panel.add(textPane_1);
		
		JTextField textPane_2 = new JTextField();
		textPane_2.setBounds(160, 120, 40, 20);
		panel.add(textPane_2);
		
		JButton btnComerciar = new JButton("Comerciar");
		btnComerciar.setBounds(50, 148, 95, 23);
		panel.add(btnComerciar);
		
		//Aragon///////////////////////////////////
		
		JMenu mnAragon_1 = new JMenu("Aragon");
		mnEuropa.add(mnAragon_1);
		
		Panel panel_3 = new Panel();
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 220, 185);
		mnAragon_1.add(panel_3);
		
		JLabel lblOro_1 = new JLabel("Uvas ------ 2500 Kg");
		lblOro_1.setBounds(40, 0, 129, 14);
		panel_3.add(lblOro_1);
		
		JLabel lblMaiz_1 = new JLabel("Trigo ------ 20000 Kg");
		lblMaiz_1.setBounds(40, 50, 129, 14);
		panel_3.add(lblMaiz_1);
		
		JSlider slider_3 = new JSlider();
		slider_3.setBounds(10, 20, 140, 23);
		panel_3.add(slider_3);
		
		JSlider slider_4 = new JSlider();
		slider_4.setBounds(10, 70, 140, 23);
		panel_3.add(slider_4);
		
		JTextField textPane_3 = new JTextField();
		textPane_3.setBounds(160, 20, 40, 20);
		panel_3.add(textPane_3);
		
		JTextField textPane_4 = new JTextField();
		textPane_4.setBounds(160, 70, 40, 20);
		panel_3.add(textPane_4);
		
		JButton btnComerciar_1 = new JButton("Comerciar");
		btnComerciar_1.setBounds(50, 148, 95, 23);
		panel_3.add(btnComerciar_1);
		
		//Borgoña////////////////////////////////
		
		JMenu mnBorgoa = new JMenu("Borgo\u00F1a");
		mnEuropa.add(mnBorgoa);
		
		Panel panel_4 = new Panel();
		panel_4.setLayout(null);
		panel_4.setBounds(0, 0, 220, 185);
		mnBorgoa.add(panel_4);
		
		JLabel lblOro_2 = new JLabel("Hierro ------ 2500 Kg");
		lblOro_2.setBounds(40, 0, 129, 14);
		panel_4.add(lblOro_2);
		
		JLabel lblMaiz_2 = new JLabel("Arroz ------ 20000 Kg");
		lblMaiz_2.setBounds(40, 50, 129, 14);
		panel_4.add(lblMaiz_2);
		
		JSlider slider_5 = new JSlider();
		slider_5.setBounds(10, 20, 140, 23);
		panel_4.add(slider_5);
		
		JSlider slider_6 = new JSlider();
		slider_6.setBounds(10, 70, 140, 23);
		panel_4.add(slider_6);
		
		JTextField textPane_5 = new JTextField();
		textPane_5.setBounds(160, 20, 40, 20);
		panel_4.add(textPane_5);
		
		JTextField textPane_6 = new JTextField();
		textPane_6.setBounds(160, 70, 40, 20);
		panel_4.add(textPane_6);
		
		JButton btnComerciar_2 = new JButton("Comerciar");
		btnComerciar_2.setBounds(50, 148, 95, 23);
		panel_4.add(btnComerciar_2);
		
		//Austria//////////////////////////
		
		JMenu mnAustria = new JMenu("Austria");
		mnEuropa.add(mnAustria);
		
		Panel panel_5 = new Panel();
		panel_5.setLayout(null);
		panel_5.setBounds(0, 0, 220, 185);
		mnAustria.add(panel_5);
		
		JLabel lblOro_3 = new JLabel("Arroz ------ 2500 Kg");
		lblOro_3.setBounds(40, 0, 129, 14);
		panel_5.add(lblOro_3);
		
		JLabel lblMaiz_3 = new JLabel("Algodón ------ 20000 Kg");
		lblMaiz_3.setBounds(40, 50, 129, 14);
		panel_5.add(lblMaiz_3);
		
		JLabel lblTomate_2 = new JLabel("Uvas ------ 61000 Kg");
		lblTomate_2.setBounds(40, 100, 129, 14);
		panel_5.add(lblTomate_2);
		
		JSlider slider_7 = new JSlider();
		slider_7.setBounds(10, 20, 140, 23);
		panel_5.add(slider_7);
		
		JSlider slider_8 = new JSlider();
		slider_8.setBounds(10, 70, 140, 23);
		panel_5.add(slider_8);
		
		JSlider slider_9 = new JSlider();
		slider_9.setBounds(10, 120, 140, 23);
		panel_5.add(slider_9);
		
		JTextField textPane_7 = new JTextField();
		textPane_7.setBounds(160, 20, 40, 20);
		panel_5.add(textPane_7);
		
		JTextField textPane_8 = new JTextField();
		textPane_8.setBounds(160, 70, 40, 20);
		panel_5.add(textPane_8);
		
		JTextField textPane_9 = new JTextField();
		textPane_9.setBounds(160, 120, 40, 20);
		panel_5.add(textPane_9);
		
		JButton btnComerciar_3 = new JButton("Comerciar");
		btnComerciar_3.setBounds(50, 148, 95, 23);
		panel_5.add(btnComerciar_3);
		
		//Europa///////////////////////////////
		//Nueva España//////////////////////////
		
		JMenu mnVirreinatos = new JMenu("Virreinatos");
		menuBar.add(mnVirreinatos);
		
		JMenu mnNewMenu_1 = new JMenu("Nueva Espa\u00F1a");
		mnVirreinatos.add(mnNewMenu_1);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 220, 230);
		mnNewMenu_1.add(panel_1);
		
		JLabel lblMaiz_4 = new JLabel("Maiz ------ 2500 Kg");
		lblMaiz_4.setBounds(40, 0, 129, 14);
		panel_1.add(lblMaiz_4);
		
		JLabel lblOro_4 = new JLabel("Oro ------ 2000 Kg");
		lblOro_4.setBounds(40, 50, 129, 14);
		panel_1.add(lblOro_4);
		
		JLabel lblCacao_1 = new JLabel("Cacao ------ 6100 Kg");
		lblCacao_1.setBounds(40, 100, 129, 14);
		panel_1.add(lblCacao_1);
		
		JLabel lblTomate_11 = new JLabel("Tomate ------ 222 Kg");
		lblTomate_11.setBounds(40, 146, 129, 14);
		panel_1.add(lblTomate_11);
		
		JSlider slider_10 = new JSlider();
		slider_10.setBounds(10, 20, 140, 23);
		panel_1.add(slider_10);
		
		JSlider slider_11 = new JSlider();
		slider_11.setBounds(10, 70, 140, 23);
		panel_1.add(slider_11);
		
		JSlider slider_12 = new JSlider();
		slider_12.setBounds(10, 120, 140, 23);
		panel_1.add(slider_12);
		
		JSlider slider_13 = new JSlider();
		slider_13.setBounds(10, 165, 140, 23);
		panel_1.add(slider_13);
		
		JTextField textPane_10 = new JTextField();
		textPane_10.setBounds(160, 20, 40, 20);
		panel_1.add(textPane_10);
		
		JTextField textPane_11 = new JTextField();
		textPane_11.setBounds(160, 70, 40, 20);
		panel_1.add(textPane_11);
		
		JTextField textPane_12 = new JTextField();
		textPane_12.setBounds(160, 120, 40, 20);
		panel_1.add(textPane_12);
		
		JTextField textPane_13 = new JTextField();
		textPane_13.setBounds(160, 165, 40, 20);
		panel_1.add(textPane_13);
		
		JButton btnComerciar_4 = new JButton("Comerciar");
		btnComerciar_4.setBounds(50, 192, 95, 23);
		panel_1.add(btnComerciar_4);
		
		//Nueva Granada////////////////////////
		
		JMenu mnNewMenu_2 = new JMenu("Nueva Granada");
		mnVirreinatos.add(mnNewMenu_2);
		
		Panel panel_1_1 = new Panel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 0, 220, 230);
		mnNewMenu_2.add(panel_1_1);
		
		JLabel lblOro_4_1 = new JLabel("Oro ------ 2500 Kg");
		lblOro_4_1.setBounds(40, 0, 129, 14);
		panel_1_1.add(lblOro_4_1);
		
		JLabel lblMaiz_4_1 = new JLabel("Plata ------ 2000 Kg");
		lblMaiz_4_1.setBounds(40, 50, 129, 14);
		panel_1_1.add(lblMaiz_4_1);
		
		JLabel lblTomate_1_1 = new JLabel("Tabaco ------ 6100 Kg");
		lblTomate_1_1.setBounds(40, 100, 129, 14);
		panel_1_1.add(lblTomate_1_1);
		
		JLabel lblTomate_11_1 = new JLabel("Cafe ------ 222 Kg");
		lblTomate_11_1.setBounds(40, 146, 129, 14);
		panel_1_1.add(lblTomate_11_1);
		
		JSlider slider_14 = new JSlider();
		slider_14.setBounds(10, 20, 140, 23);
		panel_1_1.add(slider_14);
		
		JSlider slider_15 = new JSlider();
		slider_15.setBounds(10, 70, 140, 23);
		panel_1_1.add(slider_15);
		
		JSlider slider_16 = new JSlider();
		slider_16.setBounds(10, 120, 140, 23);
		panel_1_1.add(slider_16);
		
		JSlider slider_17 = new JSlider();
		slider_17.setBounds(10, 165, 140, 23);
		panel_1_1.add(slider_17);
		
		JTextField textPane_14 = new JTextField();
		textPane_14.setBounds(160, 20, 40, 20);
		panel_1_1.add(textPane_14);
		
		JTextField textPane_15 = new JTextField();
		textPane_15.setBounds(160, 70, 40, 20);
		panel_1_1.add(textPane_15);
		
		JTextField textPane_16 = new JTextField();
		textPane_16.setBounds(160, 120, 40, 20);
		panel_1_1.add(textPane_16);
		
		JTextField textPane_17 = new JTextField();
		textPane_17.setBounds(160, 165, 40, 20);
		panel_1_1.add(textPane_17);
		
		JButton btnComerciar_4_1 = new JButton("Comerciar");
		btnComerciar_4_1.setBounds(50, 192, 95, 23);
		panel_1_1.add(btnComerciar_4_1);
		
		//Peru////////////////////////////
		
		JMenu mnNewMenu_3 = new JMenu("Peru");
		mnVirreinatos.add(mnNewMenu_3);
		
		Panel panel_1_2 = new Panel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(0, 0, 220, 230);
		mnNewMenu_3.add(panel_1_2);
		
		JLabel lblOro_4_2 = new JLabel("Oro ------ 2500 Kg");
		lblOro_4_2.setBounds(40, 0, 129, 14);
		panel_1_2.add(lblOro_4_2);
		
		JLabel lblMaiz_4_2 = new JLabel("Maiz ------ 2000 Kg");
		lblMaiz_4_2.setBounds(40, 50, 129, 14);
		panel_1_2.add(lblMaiz_4_2);
		
		JLabel lblTomate_1_2 = new JLabel("Tomate ------ 6100 Kg");
		lblTomate_1_2.setBounds(40, 100, 129, 14);
		panel_1_2.add(lblTomate_1_2);
		
		JLabel lblTomate_11_2 = new JLabel("Patata ------ 222 Kg");
		lblTomate_11_2.setBounds(40, 146, 129, 14);
		panel_1_2.add(lblTomate_11_2);
		
		JSlider slider_18 = new JSlider();
		slider_18.setBounds(10, 20, 140, 23);
		panel_1_2.add(slider_18);
		
		JSlider slider_19 = new JSlider();
		slider_19.setBounds(10, 70, 140, 23);
		panel_1_2.add(slider_19);
		
		JSlider slider_20 = new JSlider();
		slider_20.setBounds(10, 120, 140, 23);
		panel_1_2.add(slider_20);
		
		JSlider slider_21 = new JSlider();
		slider_21.setBounds(10, 165, 140, 23);
		panel_1_2.add(slider_21);
		
		JTextPane textPane_18= new JTextPane();
		textPane_18.setBounds(160, 20, 40, 20);
		panel_1_2.add(textPane_18);
		
		JTextField textPane_19 = new JTextField();
		textPane_19.setBounds(160, 70, 40, 20);
		panel_1_2.add(textPane_19);
		
		JTextField textPane_20 = new JTextField();
		textPane_20.setBounds(160, 120, 40, 20);
		panel_1_2.add(textPane_20);
		
		JTextField textPane_21 = new JTextField();
		textPane_21.setBounds(160, 165, 40, 20);
		panel_1_2.add(textPane_21);
		
		JButton btnComerciar_4_2 = new JButton("Comerciar");
		btnComerciar_4_2.setBounds(50, 192, 95, 23);
		panel_1_2.add(btnComerciar_4_2);
		
		//Plata/////////////////////////
		
		JMenu mnNewMenu_4 = new JMenu("Plata");
		mnVirreinatos.add(mnNewMenu_4);
		
		Panel panel_1_3 = new Panel();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(0, 0, 220, 230);
		mnNewMenu_4.add(panel_1_3);
		
		JLabel lblOro_4_3 = new JLabel("Plata ------ 2500 Kg");
		lblOro_4_3.setBounds(40, 0, 129, 14);
		panel_1_3.add(lblOro_4_3);
		
		JLabel lblMaiz_4_3 = new JLabel("Tabaco ------ 2000 Kg");
		lblMaiz_4_3.setBounds(40, 50, 129, 14);
		panel_1_3.add(lblMaiz_4_3);
		
		JLabel lblTomate_1_3 = new JLabel("Cafe ------ 6100 Kg");
		lblTomate_1_3.setBounds(40, 100, 129, 14);
		panel_1_3.add(lblTomate_1_3);
		
		JLabel lblTomate_11_3 = new JLabel("Patata ------ 222 Kg");
		lblTomate_11_3.setBounds(40, 146, 129, 14);
		panel_1_3.add(lblTomate_11_3);
		
		JSlider slider_22 = new JSlider();
		slider_22.setBounds(10, 20, 140, 23);
		panel_1_3.add(slider_22);
		
		JSlider slider_23 = new JSlider();
		slider_23.setBounds(10, 70, 140, 23);
		panel_1_3.add(slider_23);
		
		JSlider slider_24 = new JSlider();
		slider_24.setBounds(10, 120, 140, 23);
		panel_1_3.add(slider_24);
		
		JSlider slider_25 = new JSlider();
		slider_25.setBounds(10, 165, 140, 23);
		panel_1_3.add(slider_25);
		
		JTextField textPane_22 = new JTextField();
		textPane_22.setBounds(160, 20, 40, 20);
		panel_1_3.add(textPane_22);
		
		JTextField textPane_23 = new JTextField();
		textPane_23.setBounds(160, 70, 40, 20);
		panel_1_3.add(textPane_23);
		
		JTextField textPane_24 = new JTextField();
		textPane_24.setBounds(160, 120, 40, 20);
		panel_1_3.add(textPane_24);
		
		JTextField textPane_25 = new JTextField();
		textPane_25.setBounds(160, 165, 40, 20);
		panel_1_3.add(textPane_25);
		
		JButton btnComerciar_4_3 = new JButton("Comerciar");
		btnComerciar_4_3.setBounds(50, 192, 95, 23);
		panel_1_3.add(btnComerciar_4_3);
		
		//Comercio Exterior/////////////////////////
		//Europa del Este/////////////////////
		
		JMenu mnPer = new JMenu("Comercio Exterior");
		menuBar.add(mnPer);
		
		JMenu mnNewMenu_5 = new JMenu("Europa del Este");
		mnPer.add(mnNewMenu_5);
		
		Panel panel_1_1_1 = new Panel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(0, 0, 220, 230);
		mnNewMenu_5.add(panel_1_1_1);
		
		JLabel lblOro_4_1_1 = new JLabel("Oro ------ 2500 Kg");
		lblOro_4_1_1.setBounds(40, 0, 129, 14);
		panel_1_1_1.add(lblOro_4_1_1);
		
		JLabel lblMaiz_4_1_1 = new JLabel("Plata ------ 2000 Kg");
		lblMaiz_4_1_1.setBounds(40, 50, 129, 14);
		panel_1_1_1.add(lblMaiz_4_1_1);
		
		JLabel lblTomate_1_1_1 = new JLabel("Tabaco ------ 6100 Kg");
		lblTomate_1_1_1.setBounds(40, 100, 129, 14);
		panel_1_1_1.add(lblTomate_1_1_1);
		
		JLabel lblTomate_11_1_1 = new JLabel("Cafe ------ 222 Kg");
		lblTomate_11_1_1.setBounds(40, 146, 129, 14);
		panel_1_1_1.add(lblTomate_11_1_1);
		
		JSlider slider_26 = new JSlider();
		slider_26.setBounds(10, 20, 140, 23);
		panel_1_1_1.add(slider_26);
		
		JSlider slider_27 = new JSlider();
		slider_27.setBounds(10, 70, 140, 23);
		panel_1_1_1.add(slider_27);
		
		JSlider slider_28 = new JSlider();
		slider_28.setBounds(10, 120, 140, 23);
		panel_1_1_1.add(slider_28);
		
		JSlider slider_29 = new JSlider();
		slider_29.setBounds(10, 165, 140, 23);
		panel_1_1_1.add(slider_29);
		
		JTextPane textPane_26 = new JTextPane();
		textPane_26.setBounds(160, 20, 40, 20);
		panel_1_1_1.add(textPane_26);
		
		JTextPane textPane_27 = new JTextPane();
		textPane_27.setBounds(160, 70, 40, 20);
		panel_1_1_1.add(textPane_27);
		
		JTextPane textPane_28 = new JTextPane();
		textPane_28.setBounds(160, 120, 40, 20);
		panel_1_1_1.add(textPane_28);
		
		JTextPane textPane_29 = new JTextPane();
		textPane_29.setBounds(160, 165, 40, 20);
		panel_1_1_1.add(textPane_29);
		
		JButton btnComerciar_4_1_1 = new JButton("Comerciar");
		btnComerciar_4_1_1.setBounds(50, 192, 95, 23);
		panel_1_1_1.add(btnComerciar_4_1_1);
		
		//Africa del Norte///////////////
		
		JMenu mnNewMenu_6 = new JMenu("\u00C1frica del Norte");
		mnPer.add(mnNewMenu_6);
		
		Panel panel_1_1_2 = new Panel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBounds(0, 0, 220, 230);
		mnNewMenu_6.add(panel_1_1_2);
		
		JLabel lblOro_4_1_2 = new JLabel("Oro ------ 2500 Kg");
		lblOro_4_1_2.setBounds(40, 0, 129, 14);
		panel_1_1_2.add(lblOro_4_1_2);
		
		JLabel lblMaiz_4_1_2 = new JLabel("Plata ------ 2000 Kg");
		lblMaiz_4_1_2.setBounds(40, 50, 129, 14);
		panel_1_1_2.add(lblMaiz_4_1_2);
		
		JLabel lblTomate_1_1_2 = new JLabel("Tabaco ------ 6100 Kg");
		lblTomate_1_1_2.setBounds(40, 100, 129, 14);
		panel_1_1_2.add(lblTomate_1_1_2);
		
		JLabel lblTomate_11_1_2 = new JLabel("Cafe ------ 222 Kg");
		lblTomate_11_1_2.setBounds(40, 146, 129, 14);
		panel_1_1_2.add(lblTomate_11_1_2);
		
		JSlider slider_30 = new JSlider();
		slider_30.setBounds(10, 20, 140, 23);
		panel_1_1_2.add(slider_30);
		
		JSlider slider_31 = new JSlider();
		slider_31.setBounds(10, 70, 140, 23);
		panel_1_1_2.add(slider_31);
		
		JSlider slider_32 = new JSlider();
		slider_32.setBounds(10, 120, 140, 23);
		panel_1_1_2.add(slider_32);
		
		JSlider slider_33 = new JSlider();
		slider_33.setBounds(10, 165, 140, 23);
		panel_1_1_2.add(slider_33);
		
		JTextPane textPane_30 = new JTextPane();
		textPane_30.setBounds(160, 20, 40, 20);
		panel_1_1_2.add(textPane_30);
		
		JTextPane textPane_31 = new JTextPane();
		textPane_31.setBounds(160, 70, 40, 20);
		panel_1_1_2.add(textPane_31);
		
		JTextPane textPane_32 = new JTextPane();
		textPane_32.setBounds(160, 120, 40, 20);
		panel_1_1_2.add(textPane_32);
		
		JTextPane textPane_33 = new JTextPane();
		textPane_33.setBounds(160, 165, 40, 20);
		panel_1_1_2.add(textPane_33);
		
		JButton btnComerciar_4_1_2 = new JButton("Comerciar");
		btnComerciar_4_1_2.setBounds(50, 192, 95, 23);
		panel_1_1_2.add(btnComerciar_4_1_2);
		
		//Oriente Proximo///////////////////////////
		
		JMenu mnNewMenu_7 = new JMenu("Oriente Pr\u00F3ximo");
		mnPer.add(mnNewMenu_7);
		
		Panel panel_1_1_3 = new Panel();
		panel_1_1_3.setLayout(null);
		panel_1_1_3.setBounds(0, 0, 220, 230);
		mnNewMenu_7.add(panel_1_1_3);
		
		JLabel lblOro_4_1_3 = new JLabel("Oro ------ 2500 Kg");
		lblOro_4_1_3.setBounds(40, 0, 129, 14);
		panel_1_1_3.add(lblOro_4_1_3);
		
		JLabel lblMaiz_4_1_3 = new JLabel("Plata ------ 2000 Kg");
		lblMaiz_4_1_3.setBounds(40, 50, 129, 14);
		panel_1_1_3.add(lblMaiz_4_1_3);
		
		JLabel lblTomate_1_1_3 = new JLabel("Tabaco ------ 6100 Kg");
		lblTomate_1_1_3.setBounds(40, 100, 129, 14);
		panel_1_1_3.add(lblTomate_1_1_3);
		
		JLabel lblTomate_11_1_3 = new JLabel("Cafe ------ 222 Kg");
		lblTomate_11_1_3.setBounds(40, 146, 129, 14);
		panel_1_1_3.add(lblTomate_11_1_3);
		
		JSlider slider_34 = new JSlider();
		slider_34.setBounds(10, 20, 140, 23);
		panel_1_1_3.add(slider_34);
		
		JSlider slider_35 = new JSlider();
		slider_35.setBounds(10, 70, 140, 23);
		panel_1_1_3.add(slider_35);
		
		JSlider slider_36 = new JSlider();
		slider_36.setBounds(10, 120, 140, 23);
		panel_1_1_3.add(slider_36);
		
		JSlider slider_37 = new JSlider();
		slider_37.setBounds(10, 165, 140, 23);
		panel_1_1_3.add(slider_37);
		
		JTextPane textPane_34 = new JTextPane();
		textPane_34.setBounds(160, 20, 40, 20);
		panel_1_1_3.add(textPane_34);
		
		JTextPane textPane_35 = new JTextPane();
		textPane_35.setBounds(160, 70, 40, 20);
		panel_1_1_3.add(textPane_35);
		
		JTextPane textPane_36 = new JTextPane();
		textPane_36.setBounds(160, 120, 40, 20);
		panel_1_1_3.add(textPane_36);
		
		JTextPane textPane_37 = new JTextPane();
		textPane_37.setBounds(160, 165, 40, 20);
		panel_1_1_3.add(textPane_37);
		
		JButton btnComerciar_4_1_3 = new JButton("Comerciar");
		btnComerciar_4_1_3.setBounds(50, 192, 95, 23);
		panel_1_1_3.add(btnComerciar_4_1_3);
		
		//Asia//////////////////////////////
		
		JMenu mnNewMenu_8 = new JMenu("Asia");
		mnPer.add(mnNewMenu_8);
		
		Panel panel_1_1_4 = new Panel();
		panel_1_1_4.setLayout(null);
		panel_1_1_4.setBounds(0, 0, 220, 230);
		mnNewMenu_8.add(panel_1_1_4);
		
		JLabel lblOro_4_1_4 = new JLabel("Oro ------ 2500 Kg");
		lblOro_4_1_4.setBounds(40, 0, 129, 14);
		panel_1_1_4.add(lblOro_4_1_4);
		
		JLabel lblMaiz_4_1_4 = new JLabel("Plata ------ 2000 Kg");
		lblMaiz_4_1_4.setBounds(40, 50, 129, 14);
		panel_1_1_4.add(lblMaiz_4_1_4);
		
		JLabel lblTomate_1_1_4 = new JLabel("Tabaco ------ 6100 Kg");
		lblTomate_1_1_4.setBounds(40, 100, 129, 14);
		panel_1_1_4.add(lblTomate_1_1_4);
		
		JLabel lblTomate_11_1_4 = new JLabel("Cafe ------ 222 Kg");
		lblTomate_11_1_4.setBounds(40, 146, 129, 14);
		panel_1_1_4.add(lblTomate_11_1_4);
		
		JSlider slider_38 = new JSlider();
		slider_38.setBounds(10, 20, 140, 23);
		panel_1_1_4.add(slider_38);
		
		JSlider slider_39 = new JSlider();
		slider_39.setBounds(10, 70, 140, 23);
		panel_1_1_4.add(slider_39);
		
		JSlider slider_40 = new JSlider();
		slider_40.setBounds(10, 120, 140, 23);
		panel_1_1_4.add(slider_40);
		
		JSlider slider_41 = new JSlider();
		slider_41.setBounds(10, 165, 140, 23);
		panel_1_1_4.add(slider_41);
		
		JTextPane textPane_38 = new JTextPane();
		textPane_38.setBounds(160, 20, 40, 20);
		panel_1_1_4.add(textPane_38);
		
		JTextPane textPane_39 = new JTextPane();
		textPane_39.setBounds(160, 70, 40, 20);
		panel_1_1_4.add(textPane_39);
		
		JTextPane textPane_40 = new JTextPane();
		textPane_40.setBounds(160, 120, 40, 20);
		panel_1_1_4.add(textPane_40);
		
		JTextPane textPane_41 = new JTextPane();
		textPane_41.setBounds(160, 165, 40, 20);
		panel_1_1_4.add(textPane_41);
		
		JButton btnComerciar_4_1_4 = new JButton("Comerciar");
		btnComerciar_4_1_4.setBounds(50, 192, 95, 23);
		panel_1_1_4.add(btnComerciar_4_1_4);
		
		slider.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_1.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_1.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_2.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_2.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_3.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_3.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_4.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_4.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_5.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_5.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_6.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_6.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_7.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_7.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_8.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_8.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_9.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_9.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_10.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_10.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_11.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_11.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_12.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_12.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_13.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_13.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_14.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_14.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_15.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_15.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_16.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_16.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_17.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_17.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_18.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_18.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_18.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_18.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_19.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_19.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_20.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_20.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_21.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_21.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_22.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_22.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_23.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_23.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_24.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_24.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_25.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_26.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_27.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_27.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_28.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_28.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_29.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_29.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_30.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_30.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_31.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_31.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_32.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_32.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_33.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_33.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_34.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_34.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_35.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_36.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_37.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_37.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_38.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_38.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_39.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_39.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_40.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_40.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
		slider_41.addChangeListener(new ChangeListener(){

			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider source = (JSlider) e.getSource();
				
				textPane_41.setText(String.valueOf(source.getValue()));
				
			}
			
		});
		
//		textPane.setText(Integer.toString(slider.getValue()));
		JPanel panelAragonMercancia = new JPanel();
		panelAragonMercancia.setBorder(new LineBorder(new Color(220, 20, 60), 2));
		panelAragonMercancia.setBounds(427, 242, 250, 61);
		contentPane.add(panelAragonMercancia);
		panelAragonMercancia.setLayout(null);
		
		JLabel lblMercanciaDisponibleAragn = DefaultComponentFactory.getInstance().createTitle("Mercancia disponible Arag\u00F3n");
		lblMercanciaDisponibleAragn.setBounds(10, 11, 167, 14);
		panelAragonMercancia.add(lblMercanciaDisponibleAragn);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBounds(20, 36, 147, 21);
		panelAragonMercancia.add(menuBar_2);
		
		JMenu mn1 = new JMenu("1");
		mn1.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar_2.add(mn1);
		
		Panel xxxxxxx = new Panel();
		mn1.add(xxxxxxx);
		xxxxxxx.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
		
		JMenu mn2 = new JMenu("2");
		menuBar_2.add(mn2);
		
		Panel yyyyyyy = new Panel();
		mn2.add(yyyyyyy);
		yyyyyyy.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
		
		JMenu mn3 = new JMenu("3");
		menuBar_2.add(mn3);
		
		Panel eeeeeeeee = new Panel();
		mn3.add(eeeeeeeee);
		eeeeeeeee.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
		
		JMenu mn4 = new JMenu("4");
		menuBar_2.add(mn4);
		
		Panel kkkkkkkkk = new Panel();
		mn4.add(kkkkkkkkk);
		kkkkkkkkk.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
		
		JButton botonSiguienteTurno = new JButton("Siguiente turno");
		botonSiguienteTurno.setBounds(37, 242, 114, 55);
		botonSiguienteTurno.setToolTipText("");
		botonSiguienteTurno.setFont(new Font("Serif", Font.PLAIN, 11));
		botonSiguienteTurno.setForeground(Color.RED);
		contentPane.add(botonSiguienteTurno);
	}
}
