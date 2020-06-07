package Vista;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Main.PanelControl;

public class MapaEuropa extends JPanel {
	
	private PanelControl control;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private boolean activacion;
	
	public MapaEuropa(PanelControl control) {
		this.control = control;
		setLayout(null);
		iniciarComponentes();
		setVisible(true);
	}
	
	public void iniciarComponentes() {
		
		InfoCastilla pCastilla = new InfoCastilla();
		InfoAustria pBorgoña = new InfoAustria();
		InfoAragon pAragon = new InfoAragon();
		InfoBorgoña pAustria = new InfoBorgoña();
		
		add(pCastilla);
		add(pBorgoña);
		add(pAragon);
		add(pAustria);
		
		pCastilla.setVisible(false);
		pBorgoña.setVisible(false);
		pAragon.setVisible(false);
		pAustria.setVisible(false);
		
		boton1 = new JButton();
		boton2 = new JButton();
		boton3 = new JButton();
		boton4 = new JButton();
		
		boton1.setBounds(101, 207, 20, 20);
		boton2.setBounds(260, 201, 20, 20);
		boton3.setBounds(270, 78, 20, 20);
		boton4.setBounds(460, 144, 20, 20);
		
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
					pCastilla.setVisible(true);
					pAragon.setVisible(false);
					pAustria.setVisible(false);
            		pBorgoña.setVisible(false);
            		
            	}else if(source == boton2){
					activacion = false;
					pCastilla.setVisible(false);
					pAragon.setVisible(true);
					pAustria.setVisible(false);
            		pBorgoña.setVisible(false);
            		
            	}else if(source == boton3){
					activacion = false;
					pCastilla.setVisible(false);
					pAragon.setVisible(false);
					pAustria.setVisible(true);
            		pBorgoña.setVisible(false);
            		
            	}else {
            		activacion = false;
            		pCastilla.setVisible(false);
					pAragon.setVisible(false);
					pAustria.setVisible(false);
            		pBorgoña.setVisible(true);
            		
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
		lblNewLabel.setIcon(new ImageIcon("imagenes/EuropaDef.jpg"));
		lblNewLabel.setBounds(5, 5, 520, 320);
		add(lblNewLabel);
		
	}
	

}
