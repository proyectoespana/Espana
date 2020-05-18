package Clases;

public abstract class Virreinatos extends Reinos {
	
	private int distanciaPeru;
	private int distanciaPlata;
	private int distanciaCastilla;
	private int distanciaNuevaGranada;
	private int distanciaNuevaEspaña;

	public Virreinatos(String nombre, String continente, int poblacion,int peru,int plata,int castilla,int granada,int nuevaEspaña) {
		super(nombre, continente, poblacion);
		this.distanciaPeru=peru;
		this.distanciaPlata=plata;
		this.distanciaCastilla=castilla;
		this.distanciaNuevaGranada=granada;
		this.distanciaNuevaEspaña=nuevaEspaña;
	}

	public Virreinatos(Virreinatos obj) {
		super(obj);
		this.distanciaPeru=obj.getDistanciaPeru();
		this.distanciaPlata=obj.getDistanciaPlata();
		this.distanciaCastilla=obj.getDistanciaCastilla();
		this.distanciaNuevaGranada=obj.getDistanciaNuevaGranada();
		this.distanciaNuevaEspaña=obj.getDistanciaNuevaEspaña();
	}
	
	
	public String mostrarDistancias() {
		return "Distancias respecto : Castilla "+this.distanciaCastilla+" km / Nueva España : "+this.distanciaNuevaEspaña+" km / NuevaGranada : " +this.distanciaNuevaGranada+" km/  Peru :"+this.distanciaPeru+" km/ Plata : "+this.distanciaPlata+" km ";
	}

	//getSeter
	public int getDistanciaPeru() {
		return distanciaPeru;
	}

	public void setDistanciaPeru(int distanciaPeru) {
		this.distanciaPeru = distanciaPeru;
	}

	public int getDistanciaPlata() {
		return distanciaPlata;
	}

	public void setDistanciaPlata(int distanciaPlata) {
		this.distanciaPlata = distanciaPlata;
	}

	public int getDistanciaCastilla() {
		return distanciaCastilla;
	}

	public void setDistanciaCastilla(int distanciaCastilla) {
		this.distanciaCastilla = distanciaCastilla;
	}

	public int getDistanciaNuevaGranada() {
		return distanciaNuevaGranada;
	}

	public void setDistanciaNuevaGranada(int distanciaNuevaGranada) {
		this.distanciaNuevaGranada = distanciaNuevaGranada;
	}

	public int getDistanciaNuevaEspaña() {
		return distanciaNuevaEspaña;
	}

	public void setDistanciaNuevaEspaña(int distanciaNuevaEspaña) {
		this.distanciaNuevaEspaña = distanciaNuevaEspaña;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
