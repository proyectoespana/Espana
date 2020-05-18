package Clases;
/*
 * GRUPO
 */
public abstract class Virreinatos extends Reinos {
	
	private int distanciaPeru;
	private int distanciaPlata;
	private int distanciaCastilla;
	private int distanciaNuevaGranada;
	private int distanciaNuevaEspaña;

	//Constructores
    /**
     * Constructor con 8 parametros 
     * @param nombre Da informacion sobre el nombre
     * @param continente Informa sobre donde esta cada reino
     * @param poblacion Informa sobre la cantidad de personas que habitan
     * @param peru Indica la distancia sobre donde se encuentra el reino de Peru
     * @param plata Indica la distancia sobre donde se encuentra el reino de la Plata
     * @param castilla Indica la distancia sobre donde se encuentra el reino de Castilla
     * @param granada Indica la distancia sobre donde se encuentra el reino de Granada
     * @param nuevaEspaña Indica la distancia sobre donde se encuentra el reino de Granada
     */
	public Virreinatos(String nombre, String continente, int poblacion,int peru,int plata,int castilla,int granada,int nuevaEspaña) {
		super(nombre, continente, poblacion);
		this.distanciaPeru=peru;
		this.distanciaPlata=plata;
		this.distanciaCastilla=castilla;
		this.distanciaNuevaGranada=granada;
		this.distanciaNuevaEspaña=nuevaEspaña;
	}

	/**
     * Constructor de copia
     * @param obj
     */
	public Virreinatos(Virreinatos obj) {
		super(obj);
		this.distanciaPeru=obj.getDistanciaPeru();
		this.distanciaPlata=obj.getDistanciaPlata();
		this.distanciaCastilla=obj.getDistanciaCastilla();
		this.distanciaNuevaGranada=obj.getDistanciaNuevaGranada();
		this.distanciaNuevaEspaña=obj.getDistanciaNuevaEspaña();
	}
	
	/**
	 * Devuelve la distancia respecto cada zoma
	
	 */
	public String mostrarDistancias() {
		return "Distancias respecto : Castilla "+this.distanciaCastilla+" km / Nueva España : "+this.distanciaNuevaEspaña+" km / NuevaGranada : " +this.distanciaNuevaGranada+" km/  Peru :"+this.distanciaPeru+" km/ Plata : "+this.distanciaPlata+" km ";
	}

	//Getters y Setters
    /**
     * 
     * @return devuelve las distancias de cada Reino
     */
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
