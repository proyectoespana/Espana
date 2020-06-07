package Vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import Main.PanelControl;

public class InfoBorgo�a extends JPanel{
	
	public InfoBorgo�a() {
		setLayout(null);
		iniciarComponentes();
		setVisible(true);
	}

	private void iniciarComponentes() {
		
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBounds(100, 20, 150, 155);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("gatico.jpg"));
		lblNewLabel.setBounds(10, 10, 140, 145);
		add(lblNewLabel);
		
	}

}
