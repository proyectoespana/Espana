package Clases;

import java.util.Random;

public abstract class Productos {
	
	private ProductoNombre nombre;
	private double costeObtencionMedia;
	private double costeMercadoInterno;
	private double costeTransporteMedio;
	private double costeMercadoExterno;
	private int cantidad;
	
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
