package Clases;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;

public abstract class Reinos extends Territorio{

	private int poblacion;
	private LinkedHashMap <Integer,Mercancia> importacionMercancia;
	private LinkedHashMap <Integer,Mercancia> mercancia;
	private double dineroTotal;
	private boolean sublevaciones;

	public Reinos(String nombre, String continente,int poblacion) {
		super(nombre, continente);
		this.poblacion= poblacion;
		this.importacionMercancia=new LinkedHashMap<Integer, Mercancia>();
		this.mercancia=new LinkedHashMap<Integer, Mercancia>();
		this.sublevaciones=false;
	}

	public Reinos(Reinos obj) {
		super(obj);
		this.poblacion=obj.getPoblacion();
		this.importacionMercancia=obj.getImportacionMercancia();
		this.dineroTotal=obj.getDineroTotal();
		this.sublevaciones=obj.isSublevaciones();
	}


	/**
	 * Metodo encargado de introduccir la cantidad de kg que produce una zona mensualmente
	 * @param product
	 * @throws Exception 
	 */

	public void calcularProduccionMensual(Productos product) throws Exception {
		Random rnd = new Random();
		int random;
		int random2;

		random=rnd.nextInt((30000-10000)+10000)+30000;

		switch (product.getNombre()) {
		case Patata: 
			product.setCantidad((4*this.poblacion)+random);
			break;
		case Tomate:
			product.setCantidad((2*this.poblacion)+random);
			break;
		case Cacao:
			product.setCantidad((1*this.poblacion)+random);
			break;
		case Maiz:
			product.setCantidad((6*this.poblacion)+random);
			break;
		case Trigo:
			product.setCantidad((5*this.poblacion)+random);
			break;
		case Arroz:
			product.setCantidad((3*this.poblacion)+random);
			break;
		case Uvas:
			product.setCantidad((1*this.poblacion)+random);
			break;
		case Hierro:
			random2=rnd.nextInt((200-10)+10)+200;
			product.setCantidad(random2);
			break;
		case Algodon:
			product.setCantidad((1*this.poblacion)+random);
			break;		
		case Oro:
			random2=rnd.nextInt((50-10)+10)+50;
			product.setCantidad(random2);
			break;
		case Plata:
			random2=rnd.nextInt((50-10)+10)+50;
			product.setCantidad(random2);
			break;
		case Tabaco:
			product.setCantidad((1*this.poblacion)+random);
			break;
		case Cafe:
			product.setCantidad((3*this.poblacion)+random);
			break;
		default:
			throw new Exception("No existe "+product.getNombre());
		}
	}


	/**
	 * Metodo para ver las importaciones de cada zona
	 */
	public void verMercanciasImportacion() {
		Iterator iterador = this.importacionMercancia.keySet().iterator();
		int key;

		while(iterador.hasNext()) {
			key=(int) iterador.next();
			System.out.println("Exportacion numero "+key+ " contenido "+this.importacionMercancia.get(key));
		}
	}
	
	public void verMercancias() {
		Iterator iterador = this.mercancia.keySet().iterator();
		int key;

		while(iterador.hasNext()) {
			key=(int) iterador.next();
			System.out.println("Mercancia numero "+key+ " contenido "+this.mercancia.get(key));
		}
	}
	
	public void verProduccionMensual() {
		
	}
	
	public void crearMercancia(ProductoNombre producto,int cantidad)throws Exception {
		
	}

	public void sublevaciones() {

	}

	public void crearExportacion(Territorio pais) {

	}

	public void llegadaImpotacion(Flota barcos) {

	}
	
	//getter

	@Override
	public String toString() {
		return super.toString();
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	public LinkedHashMap<Integer, Mercancia> getImportacionMercancia() {
		return importacionMercancia;
	}

	public void setImportacionMercancia(LinkedHashMap<Integer, Mercancia> importacionMercancia) {
		this.importacionMercancia = importacionMercancia;
	}

	public LinkedHashMap<Integer, Mercancia> getMercancia() {
		return mercancia;
	}

	public void setMercancia(LinkedHashMap<Integer, Mercancia> mercancia) {
		this.mercancia = mercancia;
	}

	public double getDineroTotal() {
		return dineroTotal;
	}

	public void setDineroTotal(double dineroTotal) {
		this.dineroTotal = dineroTotal;
	}

	public boolean isSublevaciones() {
		return sublevaciones;
	}

	public void setSublevaciones(boolean sublevaciones) {
		this.sublevaciones = sublevaciones;
	}

}
