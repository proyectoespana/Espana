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
	private int distanciaNuevaEspa�a;
	/**
	 * Informa de la distancia del Reino respecto a "Nueva Espa�a"
	 */
	private int distanciaAragon;
	/**
	 * Informa de la distancia del Reino respecto a "Aragon"
	 */
	private int distanciaBorgo�a;
	/**
	 * Informa de la distancia del Reino respecto a "Borgo�a"
	 */
	private int distanciaAustria;
	/**
	 * Informa de la distancia del Reino respecto a "Austria"
	 */

	//Constructores
    /**
     * Constructor con 8 par�metros 
     * @param nombre Da informaci�n sobre el nombre
     * @param continente Informa sobre donde est� cada reino
     * @param poblacion Informa sobre la cantidad de personas que habitan
     * @param peru Indica la distancia sobre donde se encuentra el Reino de Per�
     * @param plata Indica la distancia sobre donde se encuentra el Reino de la Plata
     * @param castilla Indica la distancia sobre donde se encuentra el Reino de Castilla
     * @param granada Indica la distancia sobre donde se encuentra el Reino de Granada
     * @param nuevaEspa�a Indica la distancia sobre donde se encuentra el Reino de Nueva Granada
     * @param aragon Indica la distancia sobre donde se encuentra el Reino de Aragon
     * @param borgo�a Indica la distancia sobre donde se encuentra el Reino de Borgo�a
     * @param austria Indica la distancia sobre donde se encuentra el Reino de Austria
     */
	public Virreinatos(String nombre, String continente, int poblacion,int peru,int plata,int castilla,int granada,int nuevaEspa�a,int aragon,int borgo�a,int austria) {
		super(nombre, continente, poblacion);
		this.distanciaPeru=peru;
		this.distanciaPlata=plata;
		this.distanciaCastilla=castilla;
		this.distanciaNuevaGranada=granada;
		this.distanciaNuevaEspa�a=nuevaEspa�a;
		this.distanciaAragon=aragon;
		this.distanciaBorgo�a=borgo�a;
		this.distanciaAustria=austria;
	}

	/**
     * Constructor de copia
     * @param obj Objeto que copiar
     */
	public Virreinatos(Virreinatos obj) {
		super(obj);
		this.distanciaPeru=obj.getDistanciaPeru();
		this.distanciaPlata=obj.getDistanciaPlata();
		this.distanciaCastilla=obj.getDistanciaCastilla();
		this.distanciaNuevaGranada=obj.getDistanciaNuevaGranada();
		this.distanciaNuevaEspa�a=obj.getDistanciaNuevaEspa�a();
		this.distanciaAragon=obj.getDistanciaAragon();
		this.distanciaBorgo�a=obj.getDistanciaBorgo�a();
		this.distanciaAustria=obj.getDistanciaAustria();
	}
	
	/**
	 * Devuelve la distancia respecto cada zoma
	 * @return distancia de cada zona 
	 */
	public String mostrarDistancias() {
		return "Distancias respecto : Castilla "+this.distanciaCastilla+" km / Nueva Espa�a : "+this.distanciaNuevaEspa�a+" km / NuevaGranada : " +this.distanciaNuevaGranada+" km/  Peru :"+this.distanciaPeru+" km/ Plata : "+this.distanciaPlata+" km ";
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

	public int getDistanciaNuevaEspa�a() {
		return distanciaNuevaEspa�a;
	}

	public void setDistanciaNuevaEspa�a(int distanciaNuevaEspa�a) {
		this.distanciaNuevaEspa�a = distanciaNuevaEspa�a;
	}

	public int getDistanciaAragon() {
		return distanciaAragon;
	}

	public void setDistanciaAragon(int distanciaAragon) {
		this.distanciaAragon = distanciaAragon;
	}

	public int getDistanciaBorgo�a() {
		return distanciaBorgo�a;
	}

	public void setDistanciaBorgo�a(int distanciaBorgo�a) {
		this.distanciaBorgo�a = distanciaBorgo�a;
	}

	public int getDistanciaAustria() {
		return distanciaAustria;
	}

	public void setDistanciaAustria(int distanciaAustria) {
		this.distanciaAustria = distanciaAustria;
	}
	
}
