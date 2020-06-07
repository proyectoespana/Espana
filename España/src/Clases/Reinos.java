package Clases;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;

import BaseDeDatos.IntroducirDatos;
import Main.PanelControl;

public abstract class Reinos extends Territorio{

	private int poblacion;
	private LinkedHashMap <Integer,Mercancia> importacionMercancia;
	private LinkedHashMap <Integer,Mercancia> mercancia;
	private double dineroTotal;
	private boolean sublevaciones;
	private int idMercancias;
	private int idImportaciones;
	private ProductoNombre [] productosDemandados;
	private IntroducirDatos base;

	public Reinos(String nombre, String continente,int poblacion,IntroducirDatos base) {
		super(nombre, continente);
		this.base=base;
		this.poblacion= poblacion;
		this.importacionMercancia=new LinkedHashMap<Integer, Mercancia>();
		this.mercancia=new LinkedHashMap<Integer, Mercancia>();
		this.productosDemandados=new ProductoNombre[(int)(Math.random()*2)];
		this.sublevaciones=false;
		this.idMercancias=1;
		this.idImportaciones=1;
	}

	public Reinos(Reinos obj) {
		super(obj);
		this.poblacion=obj.getPoblacion();
		this.importacionMercancia=obj.getImportacionMercancia();
		this.dineroTotal=obj.getDineroTotal();
		this.sublevaciones=obj.isSublevaciones();
		this.base=obj.getBase();
	}


	/**
	 * Metodo que se encarga de calcular la cantidad kg que se produce en un determinado lugar  dependiendo de su nombre
	 * @param product
	 * @throws Exception 
	 */

	public void calcularProduccionMensual(Productos product) throws Exception {
		Random rnd = new Random();
		int random;
		int random2;

		random=rnd.nextInt((10000-5000)+5000)+10000;

		switch (product.getNombre()) {
		case Patata: 
			/**
			 * La formula de los alimentos se basa en un numero de kg determinado que asumimos que una persona corriente consume de media al mes
			 *  de un determinado producto * el numero de personas de su pais determinado + un numero aleatorio con el que se podrá comerciar con el resto de Países.
			 */
			product.setCantidad((4*this.poblacion)+random);
			//El objetivo es meter los datos de la produccion integra en la base de datos produccion total
			cosumoProductos(product);
			break;
		case Tomate:
			product.setCantidad((2*this.poblacion)+random);
			cosumoProductos(product);
			break;
//		case Cacao:
//			product.setCantidad((1*this.poblacion)+random);
//			cosumoProductos(product);
//			break;
		case Maiz:
			product.setCantidad((6*this.poblacion)+random);
			cosumoProductos(product);
			break;
		case Trigo:
			product.setCantidad((5*this.poblacion)+random);
			cosumoProductos(product);
			break;
		case Arroz:
			product.setCantidad((3*this.poblacion)+random);
			cosumoProductos(product);
			break;
		case Uvas:
			product.setCantidad((1*this.poblacion)+random);
			cosumoProductos(product);
			break;
		case Hierro:
			random2=rnd.nextInt((200-10)+10)+200;
			product.setCantidad(random2);
			cosumoProductos(product);
			break;
//		case Algodon:
//			product.setCantidad((1*this.poblacion)+random);
//			cosumoProductos(product);
//			break;		
		case Oro:
			random2=rnd.nextInt((50-10)+10)+50;
			product.setCantidad(random2);
			cosumoProductos(product);
			break;
		case Plata:
			random2=rnd.nextInt((50-10)+10)+50;
			product.setCantidad(random2);
			cosumoProductos(product);
			break;
		case Tabaco:
			product.setCantidad((1*this.poblacion)+random);
			cosumoProductos(product);
			break;
		case Cafe:
			product.setCantidad((3*this.poblacion)+random);
			cosumoProductos(product);
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
			System.out.println("Exportacion "+this.importacionMercancia.get(key).getOrigen()+" numero "+key+" con "+this.importacionMercancia.get(key)+" a "+this.getNombre());
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

	public String verproduccionMensual() {
		return this.getNombre()+" ";	
	}

	public void crearMercancia(ProductoNombre producto,int cantidad)throws Exception {

	}

	/**Metodo encargado de transpasar las importaciones de una flota al pais al que se les a mandado 
	 * 
	 * @param barcos parametro encargado de pasar la flota que ha sido envidada por otro pais
	 */
	public void llegadaImpotacion(Flota barcos) {
		int key;
		Iterator iterador = barcos.getArrayMercancias().keySet().iterator();

		while(iterador.hasNext()) {
			key=(int) iterador.next();
			this.importacionMercancia.put(this.idImportaciones, barcos.getArrayMercancias().get(key));
			this.setIdImportaciones(this.getIdImportaciones()+1);
		}

		barcos.getArrayMercancias().clear();
		barcos.setPesoTodasMercancias(0);
		this.comprobarImportaciones();
	}

	/**
	 * Metodo encargado de recorred  las importaciones y comprobar si estas contienen productos demandados
	 */
	private void comprobarImportaciones() {
		Iterator iterador = this.importacionMercancia.keySet().iterator();
		int key;

		while(iterador.hasNext()) {
			key=(int) iterador.next();
			for(int i=0;i<this.productosDemandados.length;i++) {
				if(this.productosDemandados[i]!=null) {
					if(this.productosDemandados[i].equals(this.importacionMercancia.get(key).getProducto().getNombre())) {
						this.productosDemandados[i]=null;
						this.importacionMercancia.remove(key);
					}
				}
			}
		}
	}

	/**
	 * Metodo encargado de calcular de forma automatcia el consumo de productos dentro de un pais
	 * @param product parametro encargado de pasar el producto del que se quiere calcular el consumo 
	 * @throws SQLException 
	 */
	private void cosumoProductos(Productos product) throws SQLException {
		int newCantidad;
		int produccionPrincipal;
	

		if(product.getNombre()==ProductoNombre.Cafe || product.getNombre()==ProductoNombre.Tabaco) {
			//se consume el 25% de lo generado
			newCantidad=(int) (product.getCantidad()*0.25);
			produccionPrincipal=product.getCantidad();
			product.setCantidad(product.getCantidad()-newCantidad);
		}else {
			//consume el 60% de lo generado
			newCantidad=(int) (product.getCantidad()*0.60);
			produccionPrincipal=product.getCantidad();
			product.setCantidad(product.getCantidad()-newCantidad);
		}
		
		//insertamos en la base de datos los primeros contenidos
//		IntroducirDatos.insertarDatosProduccion("PrimeraPrueba", 3, 2, 3, PanelControl.getContadorTurnos());
//		base.insertarDatosProduccion(product.getNombre().toString(), product.getCantidad(), newCantidad, PanelControl.getContadorTurnos());
		IntroducirDatos.insertarDatosProduccion(PanelControl.getContadorTurnos(), this.getNombre(), product.getNombre().toString(), produccionPrincipal, newCantidad, product.getCantidad());
	}

	public void sublevaciones() {

	}

	/**
	 * Metodo encargado de recorrer la lista de ProductosDemandamos y mostrar los mismo de cada Region
	 */
	public void verProductosDemandados() {
		for(int i=0;i<this.productosDemandados.length;i++) {
			if(this.productosDemandados[i]!=null) {
				System.out.println(this.productosDemandados[i]);
			}
		}
	}

	public boolean comprobarProductosDemandados() {
		Iterator iterador = this.importacionMercancia.keySet().iterator();
		int key;
		int contador=0;

		while(iterador.hasNext()) {
			key=(int) iterador.next();
			if(productosDemandados.length!=0) {
				for(int i=0;i<this.productosDemandados.length;i++) {
					if(this.productosDemandados[i]!=null) {
						//comparo dos enums con ==  debido a que equals da nullpointedException
						if(this.importacionMercancia.get(iterador).getProducto().getNombre()==this.productosDemandados[i]) {
							contador++;
							this.productosDemandados[i]=null;
						}
					}
				}
			}
		}

		if(contador==this.productosDemandados.length) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Metodo encargado de remplazar las posibles demandas de un reino que tiene las sublevaciones a false
	 */
	public void zonaNoDisponibleDemanda() {
		this.productosDemandados=new ProductoNombre[0];
	}
	
	
	//getter

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

	public int getIdMercancias() {
		return idMercancias;
	}

	public void setIdMercancias(int idMercancias) {
		this.idMercancias = idMercancias;
	}

	public int getIdImportaciones() {
		return idImportaciones;
	}

	public void setIdImportaciones(int idImportaciones) {
		this.idImportaciones = idImportaciones;
	}

	public ProductoNombre[] getProductosDemandados() {
		return productosDemandados;
	}

	public void setProductosDemandados(ProductoNombre[] productosDemandados) {
		this.productosDemandados = productosDemandados;
	}

	public IntroducirDatos getBase() {
		return base;
	}

	public void setBase(IntroducirDatos base) {
		this.base = base;
	}
	

}
