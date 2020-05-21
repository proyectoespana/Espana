package Clases;
import java.util.Iterator;
import java.util.TreeMap;
/**
 * 
 * @author GRUPO
 *Clase encargada de almacenar los productos en lotes de mercancias
 */
public class Mercancia {
/**
 * Mercancias necesarias a la hora de crear una mercancia
 */
	private String nombre;
	/**
	 * Nombre de dicha mercancia
	 */
	private Productos producto;
	/**
	 * Objeto Producto del  que se va almacenar
	 */
	private int totalkg;
	/**
	 * la cantidad total de peso que tiene dicha mercancia
	 */
	private String origen;
	/**
	 * el nombre del pais de origen
	 */
	
	
	/**
	 * 
	 * @param nombre parametro que marca el nombre de dicha mercancia
	 */
	public Mercancia(String nombre,String origen) {
		this.nombre="Mercancia de "+nombre;
		this.producto = null;
		this.totalkg=0;
		this.origen=origen;
	}

//	public void verProductos() {
//		Iterator iterador = this.arrayProductos.keySet().iterator();
//		int id;
//
//		while(iterador.hasNext()) {
//			id=(int) iterador.next();
//
//			System.out.println("Mercancia numero "+id+" con contenido "+this.arrayProductos.get(id).toString());
//		}
//	}

	public void añadirProducto(Productos producto) {
		this.producto= producto;
		this.totalkg=producto.getCantidad();
	}

//	public void calcularPeso() {
//		Iterator iterator = this.arrayProductos.keySet().iterator();
//		Productos producto;
//		int pesoT=0;
//
//		while(iterator.hasNext()) {
//			producto=(Productos) iterator.next();
//
//			pesoT=pesoT+producto.getCantidad();
//		}
//		this.setTotalkg(pesoT);
//	}

	
	@Override
	public String toString() {
		return nombre+" con un contenido disponible de "+totalkg+" kg y un contenido de "+producto.getNombre();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	public int getTotalkg() {
		return totalkg;
	}

	public void setTotalkg(int totalkg) {
		this.totalkg = totalkg;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

}
