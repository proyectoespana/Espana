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

public class MapaAmerica extends JPanel {
	
	private PanelControl control;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private boolean activacion;
	
	public MapaAmerica(PanelControl control) {
		this.control = control;
		setLayout(null);
		iniciarComponentes();
		setVisible(true);
	}
	
	public void iniciarComponentes() {
		
		InfoPlata pPlata = new InfoPlata();
		InfoPeru pPeru = new InfoPeru();
		InfoNuevaGranada pNuevaGranada = new InfoNuevaGranada();
		InfoNuevaEspaña pNuevaEspaña = new InfoNuevaEspaña();
		
		add(pPlata);
		add(pPeru);
		add(pNuevaGranada);
		add(pNuevaEspaña);
		
		pPlata.setVisible(false);
		pPeru.setVisible(false);
		pNuevaGranada.setVisible(false);
		pNuevaEspaña.setVisible(false);
		
		boton1 = new JButton();
		boton2 = new JButton();
		boton3 = new JButton();
		boton4 = new JButton();
		
		boton1.setBounds(260, 243, 20, 20);
		boton2.setBounds(236, 150, 20, 20);
		boton3.setBounds(244, 105, 20, 20);
		boton4.setBounds(194, 62, 20, 20);
		
		comprobarSublevacion();
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		
//		boton1.addMouseListener(new MouseListener() {
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				
//				
//			}
//
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				
//			}
//
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				pC.setVisible(true);
//        		pB.setVisible(false);
//				
//			}
//
//			@Override
//			public void mouseExited(MouseEvent e) {
//				pC.setVisible(false);
//        		pB.setVisible(false);
//				
//			}
//			
//		});
		
		
		
		ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	JButton source = (JButton) e.getSource();
            	
            	if(source == boton1) {
					activacion = true;
					pPlata.setVisible(true);
					pPeru.setVisible(false);
					pNuevaGranada.setVisible(false);
            		pNuevaEspaña.setVisible(false);
            		
            	}else if(source == boton2){
					activacion = false;
					pPlata.setVisible(false);
					pPeru.setVisible(true);
					pNuevaGranada.setVisible(false);
            		pNuevaEspaña.setVisible(false);
            		
            	}else if(source == boton3){
					activacion = false;
					pPlata.setVisible(false);
					pPeru.setVisible(false);
					pNuevaGranada.setVisible(true);
            		pNuevaEspaña.setVisible(false);
            		
            	}else {
            		activacion = false;
            		pPlata.setVisible(false);
					pPeru.setVisible(false);
					pNuevaGranada.setVisible(false);
            		pNuevaEspaña.setVisible(true);
            		
            	}
                
            }
        };
		
			
//		}
		
		
		boton1.addActionListener(listener);
		boton2.addActionListener(listener);
		boton3.addActionListener(listener);
		boton4.addActionListener(listener);
		
		//Imagen
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(70, 43, 530, 330);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("imagenes/AmericaDef.jpg"));
		lblNewLabel.setBounds(5, 5, 520, 320);
		add(lblNewLabel);
		
	}
	
	
	public void comprobarSublevacion() {
		
		if(control.getEspana().getPlata().isSublevaciones()) {
			this.boton1.setEnabled(false);
		}
		
		if(control.getEspana().getPeru().isSublevaciones()) {
			this.boton2.setEnabled(false);
		}
		
		if(control.getEspana().getNuevaGranda().isSublevaciones()) {
			this.boton3.setEnabled(false);
		}
		
		if(control.getEspana().getNuevaEspaña().isSublevaciones()) {
			this.boton4.setEnabled(false);
		}
		
	}
	

}
