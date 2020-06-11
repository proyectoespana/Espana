package Clases;

import BaseDeDatos.IntroducirDatos;

/**
 * Clase hija de Reinos
 * @author Grupo
 *
 */
public abstract class Europa extends Reinos {
	

	private String territorio;
	/**
	 * Informa sobre el lugar donde está el Reino
	 */
	private boolean guerra;
	/**
	 * Atributo encargado de estipular si esa zona ha caído en guerra
	 */
	private int distanciaAragon;
	/**
	 * Informa de la distancia del Reino respecto a "Aragon"
	 */
	private int distanciaAustria;
	/**
	 * Informa de la distancia del Reino respecto a "Austria"
	 */
	private int distanciaBorgoña;
	/**
	 * Informa de la distancia del Reino respecto a "Borgoña"
	 */
	private int distanciaCastilla;
	/**
	 * Informa de la distancia del Reino respecto a "Castilla"
	 */
	private int distanciaNuevaEsapaña;
	/**
	 * Informa de la distancia del Reino respecto a "Nueva España"
	 */
	private int distanciaNuevaGranada;
	/**
	 * Informa de la distancia del Reino respecto a "Nueva Granada"
	 */
	private int distanciaPeru;
	/**
	 * Informa de la distancia del Reino respecto a "Peru"
	 */
	private int distanciaPlata;
	/**
	 * Informa de la distancia del Reino respecto a "Plata"
	 */
	
	
	  /**
     * Constructor donde se pasarán por parámetros los atributos anteriores
     * @param nombre Informa sobre el nombre
     * @param continente Informa sobre el continente que se encuentra
     * @param poblacion Informa sobre la cantidad de población que vive en el reino
     * @param territorio 
     * @param aragon Se introduce la distancia de Aragón
     * @param austria Se introduce la distancia de Austria
     * @param borgoña Se introduce la distancia de Borgoña
     * @param castilla Se introduce la distancia de Castilla
     * @param nuevaEspaña Se introduce la distancia de Nueva España
     */
	public Europa(String nombre,String continente, int poblacion,String territorio ,int aragon,int austria,int borgoña,int castilla,int nuevaEspaña,int nuevaGranada,int peru,int plata) {
		super(nombre,continente, poblacion);
		this.territorio=territorio;
		this.guerra=false;
		this.distanciaAragon=aragon;
		this.distanciaAustria=austria;
		this.distanciaBorgoña=borgoña;
		this.distanciaCastilla=castilla;
		this.distanciaNuevaEsapaña=nuevaEspaña;
		this.distanciaNuevaGranada=nuevaGranada;
		this.distanciaPeru=peru;
		this.distanciaPlata=plata;
	}
	
	/**
     * Constructor de copia
     * @param obj objeto a copiar
     */
	public Europa(Europa obj) {
		super(obj);
		this.distanciaAragon=obj.getDistanciaAragon();
		this.distanciaAustria=obj.getDistanciaAustria();
		this.distanciaBorgoña=obj.getDistanciaBorgoña();
		this.distanciaCastilla=obj.getDistanciaCastilla();
		this.distanciaNuevaEsapaña=obj.getDistanciaNuevaEsapaña();
		this.distanciaNuevaGranada=obj.getDistanciaNuevaGranada();
		this.distanciaPeru=obj.getDistanciaPeru();
		this.distanciaPlata=obj.getDistanciaPlata();
		this.guerra=obj.isGuerra();
		this.territorio=obj.getTerritorio();
	}
	
	  /**
     * Método que muestra las distancias entre unas zonas y otras
     * @return devuelve la distancia de cada zona
     */
	public String mostrarDistancias() {
		return "Distancias respecto : Aragon "+this.distanciaAragon +" km / Austria : "+this.distanciaAustria +" km / Borgoña : " +this.distanciaBorgoña +" km/  Castilla :"+this.distanciaCastilla +" km/ Nueva España : "+this.distanciaNuevaEsapaña +" km ";
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

	public int getDistanciaNuevaGranada() {
		return distanciaNuevaGranada;
	}

	public void setDistanciaNuevaGranada(int distanciaNuevaGranada) {
		this.distanciaNuevaGranada = distanciaNuevaGranada;
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

	@Override
	public String toString() {
		return super.toString();
	}
	
}
