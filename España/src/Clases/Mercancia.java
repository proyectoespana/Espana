package Clases;
import java.util.Iterator;
import java.util.TreeMap;
/**
 * 
 * @author GRUPO
 *Clase encargada de almacenar los productos en lotes de mercancias
 */
public class Mercancia {


	private String nombre;
	/**
	 * Nombre de dicha mercancía
	 */
	private Productos producto;
	/**
	 * Objeto Producto, del  que se va almacenar
	 */
	private int totalkg;
	/**
	 * La cantidad total de peso que tiene dicha mercancía
	 */
	private String origen;
	/**
	 * El nombre del país de origen
	 */
	
	
	/**
	 * 
	 * @param nombre Parámetro que marca el nombre de dicha mercancía
	 * @param origen Parámetro que marca el origen del producto
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

	/**
	 * Método encargado de añadir un producto a una mercancía
	 * @param producto  Parámetro que se encarga de establecer qué productos queremos almacenar junto a la cantidad total de la mercancía
	 */
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

	
	//getters

	//hasCode para pruebas
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		result = prime * result + totalkg;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mercancia other = (Mercancia) obj;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		if (totalkg != other.totalkg)
			return false;
		return true;
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
	
	@Override
	public String toString() {
		return nombre+" con un contenido disponible de "+totalkg+" kg y un contenido de "+producto.getNombre();
	}

}
