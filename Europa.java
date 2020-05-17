import java.util.ArrayList;

public abstract class Europa extends Reinos {
	
	private String territorio;
	private boolean guerra;
	private int distanciaAragon;
	private int distanciaAustria;
	private int distanciaBorgoña;
	private int distanciaCastilla;
	private int distanciaNuevaEsapaña;
	
	public Europa(String nombre, double pib, String continente, ArrayList<Flota> flota, int poblacion,
			String responsable, ArrayList<Mercancia> imporatacion, ArrayList<Mercancia> exportacion, double dinero,
			boolean sublevaciones,String territorio,boolean guerra,int aragon,int austria,int borgoña,int castilla,int nuevaEspaña) {
		super(nombre, pib, continente, flota, poblacion, responsable, imporatacion, exportacion, dinero, sublevaciones);
		this.territorio=territorio;
		this.guerra=guerra;
		this.distanciaAragon=aragon;
		this.distanciaAustria=austria;
		this.distanciaBorgoña=borgoña;
		this.distanciaCastilla=castilla;
		this.distanciaNuevaEsapaña=nuevaEspaña;
	}
	
	public Europa(Europa obj) {
		super(obj);
		this.distanciaAragon=obj.getDistanciaAragon();
		this.distanciaAustria=obj.getDistanciaAustria();
		this.distanciaBorgoña=obj.getDistanciaBorgoña();
		this.distanciaCastilla=obj.getDistanciaCastilla();
		this.distanciaNuevaEsapaña=obj.getDistanciaNuevaEsapaña();
		this.guerra=obj.isGuerra();
		this.territorio=obj.getTerritorio();
	}

	public String getTerritorio() {
		return territorio;
	}

	public void setTerritorio(String territorio) {
		this.territorio = territorio;
	}

	public boolean isGuerra() {
		return guerra;
	}

	public void setGuerra(boolean guerra) {
		this.guerra = guerra;
	}

	public int getDistanciaAragon() {
		return distanciaAragon;
	}

	public void setDistanciaAragon(int distanciaAragon) {
		this.distanciaAragon = distanciaAragon;
	}

	public int getDistanciaAustria() {
		return distanciaAustria;
	}

	public void setDistanciaAustria(int distanciaAustria) {
		this.distanciaAustria = distanciaAustria;
	}

	public int getDistanciaBorgoña() {
		return distanciaBorgoña;
	}

	public void setDistanciaBorgoña(int distanciaBorgoña) {
		this.distanciaBorgoña = distanciaBorgoña;
	}

	public int getDistanciaCastilla() {
		return distanciaCastilla;
	}

	public void setDistanciaCastilla(int distanciaCastilla) {
		this.distanciaCastilla = distanciaCastilla;
	}

	public int getDistanciaNuevaEsapaña() {
		return distanciaNuevaEsapaña;
	}

	public void setDistanciaNuevaEsapaña(int distanciaNuevaEsapaña) {
		this.distanciaNuevaEsapaña = distanciaNuevaEsapaña;
	}


}
