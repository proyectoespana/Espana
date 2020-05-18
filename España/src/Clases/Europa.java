package Clases;

public abstract class Europa extends Reinos {
	
	private String territorio;
	private boolean guerra;
	private int distanciaAragon;
	private int distanciaAustria;
	private int distanciaBorgoņa;
	private int distanciaCastilla;
	private int distanciaNuevaEsapaņa;
	
	public Europa(String nombre,String continente, int poblacion,String territorio ,int aragon,int austria,int borgoņa,int castilla,int nuevaEspaņa) {
		super(nombre,continente, poblacion);
		this.territorio=territorio;
		this.guerra=false;
		this.distanciaAragon=aragon;
		this.distanciaAustria=austria;
		this.distanciaBorgoņa=borgoņa;
		this.distanciaCastilla=castilla;
		this.distanciaNuevaEsapaņa=nuevaEspaņa;
	}
	
	public Europa(Europa obj) {
		super(obj);
		this.distanciaAragon=obj.getDistanciaAragon();
		this.distanciaAustria=obj.getDistanciaAustria();
		this.distanciaBorgoņa=obj.getDistanciaBorgoņa();
		this.distanciaCastilla=obj.getDistanciaCastilla();
		this.distanciaNuevaEsapaņa=obj.getDistanciaNuevaEsapaņa();
		this.guerra=obj.isGuerra();
		this.territorio=obj.getTerritorio();
	}
	
	public String mostrarDistancias() {
		return "Distancias respecto : Aragon "+this.distanciaAragon +" km / Austria : "+this.distanciaAustria +" km / Borgoņa : " +this.distanciaBorgoņa +" km/  Castilla :"+this.distanciaCastilla +" km/ Nueva Espaņa : "+this.distanciaNuevaEsapaņa +" km ";
	}
	
	public void estadoGuerra() {
		
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

	public int getDistanciaBorgoņa() {
		return distanciaBorgoņa;
	}

	public void setDistanciaBorgoņa(int distanciaBorgoņa) {
		this.distanciaBorgoņa = distanciaBorgoņa;
	}

	public int getDistanciaCastilla() {
		return distanciaCastilla;
	}

	public void setDistanciaCastilla(int distanciaCastilla) {
		this.distanciaCastilla = distanciaCastilla;
	}

	public int getDistanciaNuevaEsapaņa() {
		return distanciaNuevaEsapaņa;
	}

	public void setDistanciaNuevaEsapaņa(int distanciaNuevaEsapaņa) {
		this.distanciaNuevaEsapaņa = distanciaNuevaEsapaņa;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
