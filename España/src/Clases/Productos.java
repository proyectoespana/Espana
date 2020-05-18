package Clases;

import java.util.Random;
/**
 * 
 * @author GRUPO
 *Clase padre de Alimentos y Materias Primas comparten atributos en comun 
 */
public abstract class Productos {
	
	private ProductoNombre nombre;
	/**
	 * Nombre del producto
	 */
	private double costeObtencionMedia;
	/**
	 * el precio de obtener dicho producto
	 */
	private double costeMercadoInterno;
	/**
	 * Precio al que se vende dicho producto dentro de España
	 */
	private double costeTransporteMedio;
	/**
	 * Coste del Transporte de dicho producto
	 */
	private double costeMercadoExterno;
	/**
	 * Precio al que se vende dicho producto en el mercado exterior
	 */
	private int cantidad;
	/**
	 * Cantidad de dicho producto que se tiene disponible
	 */
	
	/**
	 * 
	 * @param nombre                Parametro encargado de introducir el nombre del producto
	 * @param costeObtencionMedia   Parametro encargado de introducir el coste de obtencion del producto
	 * @param costeMercadoInterno	Parametro encargado de introducir el coste de mercado interno
	 * @param costeTransporteMedio  Parametro encargado de introducir el coste de Transporte Medio
	 * @param costeMercadoExterno	Parametro encargado de introducir el precio que tiene en el mercado exterior 
	 */
	public Productos(ProductoNombre nombre ,double costeObtencionMedia, double costeMercadoInterno, double costeTransporteMedio, double costeMercadoExterno) {
		this.nombre=nombre;
		this.costeObtencionMedia = costeObtencionMedia;
		this.costeMercadoInterno = costeMercadoInterno;
		this.costeTransporteMedio = costeTransporteMedio;
		this.costeMercadoExterno = costeMercadoExterno;

	}
	
	public Productos(Productos productos) {
		this.nombre=productos.getNombre();
		this.cantidad=productos.getCantidad();
		this.costeObtencionMedia = productos.getCosteObtencionMedia();
		this.costeMercadoInterno = productos.getCosteMercadoInterno();
		this.costeTransporteMedio = productos.getCosteTransporteMedio();
		this.costeMercadoExterno = productos.getCosteMercadoExterno();
	}
	
	public String verDatosAvanzados() {
		return this.nombre+"  coste de obtencion : "+this.costeObtencionMedia+ " coste Mercado Interno : "+this.costeMercadoInterno+" coste transporte : "+this.costeTransporteMedio+" coste mercado Externo "+ this.costeMercadoExterno ; 
	}

	public ProductoNombre getNombre() {
		return nombre;
	}

	public void setNombre(ProductoNombre nombre) {
		this.nombre = nombre;
	}

	public double getCosteObtencionMedia() {
		return costeObtencionMedia;
	}

	public void setCosteObtencionMedia(double costeObtencionMedia) {
		this.costeObtencionMedia = costeObtencionMedia;
	}

	public double getCosteMercadoInterno() {
		return costeMercadoInterno;
	}

	public void setCosteMercadoInterno(double costeMercadoInterno) {
		this.costeMercadoInterno = costeMercadoInterno;
	}

	public double getCosteTransporteMedio() {
		return costeTransporteMedio;
	}

	public void setCosteTransporteMedio(double costeTransporteMedio) {
		this.costeTransporteMedio = costeTransporteMedio;
	}

	public double getCosteMercadoExterno() {
		return costeMercadoExterno;
	}

	public void setCosteMercadoExterno(double costeMercadoExterno) {
		this.costeMercadoExterno = costeMercadoExterno;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return  nombre +" cantidad"+  cantidad ;
	}
		
}
