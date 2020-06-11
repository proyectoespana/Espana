package Clases;

import BaseDeDatos.IntroducirDatos;

/**
 * 
 * @author Grupo
 *
 */
public abstract class Virreinatos extends Reinos {
	
	private int distanciaPeru;
	/**
	 * Informa de la distancia del Reino respecto a "Peru"
	 */
	private int distanciaPlata;
	/**
	 * Informa de la distancia del Reino respecto a "Plata"
	 */
	private int distanciaCastilla;
	/**
	 * Informa de la distancia del Reino respecto a "Castilla"
	 */
	private int distanciaNuevaGranada;
	/**
	 * Informa de la distancia del Reino respecto a "Nueva Granada"
	 */
	private int distanciaNuevaEspaña;
	/**
	 * Informa de la distancia del Reino respecto a "Nueva España"
	 */
	private int distanciaAragon;
	/**
	 * Informa de la distancia del Reino respecto a "Aragon"
	 */
	private int distanciaBorgoña;
	/**
	 * Informa de la distancia del Reino respecto a "Borgoña"
	 */
	private int distanciaAustria;
	/**
	 * Informa de la distancia del Reino respecto a "Austria"
	 */

	//Constructores
    /**
     * Constructor con 8 parámetros 
     * @param nombre Da información sobre el nombre
     * @param continente Informa sobre donde está cada reino
     * @param poblacion Informa sobre la cantidad de personas que habitan
     * @param peru Indica la distancia sobre donde se encuentra el Reino de Perú
     * @param plata Indica la distancia sobre donde se encuentra el Reino de la Plata
     * @param castilla Indica la distancia sobre donde se encuentra el Reino de Castilla
     * @param granada Indica la distancia sobre donde se encuentra el Reino de Granada
     * @param nuevaEspaña Indica la distancia sobre donde se encuentra el Reino de Nueva Granada
     */
	public Virreinatos(String nombre, String continente, int poblacion,int peru,int plata,int castilla,int granada,int nuevaEspaña,int aragon,int borgoña,int austria) {
		super(nombre, continente, poblacion);
		this.distanciaPeru=peru;
		this.distanciaPlata=plata;
		this.distanciaCastilla=castilla;
		this.distanciaNuevaGranada=granada;
		this.distanciaNuevaEspaña=nuevaEspaña;
		this.distanciaAragon=aragon;
		this.distanciaBorgoña=borgoña;
		this.distanciaAustria=austria;
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
		this.distanciaAragon=obj.getDistanciaAragon();
		this.distanciaBorgoña=obj.getDistanciaBorgoña();
		this.distanciaAustria=obj.getDistanciaAustria();
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

	@Override
	public String toString() {
		return super.toString();
	}

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

	public int getDistanciaAragon() {
		return distanciaAragon;
	}

	public void setDistanciaAragon(int distanciaAragon) {
		this.distanciaAragon = distanciaAragon;
	}

	public int getDistanciaBorgoña() {
		return distanciaBorgoña;
	}

	public void setDistanciaBorgoña(int distanciaBorgoña) {
		this.distanciaBorgoña = distanciaBorgoña;
	}

	public int getDistanciaAustria() {
		return distanciaAustria;
	}

	public void setDistanciaAustria(int distanciaAustria) {
		this.distanciaAustria = distanciaAustria;
	}
	
}
