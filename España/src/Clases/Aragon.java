package Clases;

import java.util.Random;

/**
 * Clase hija de Europa
 * @author Grupo
 *
 */
public class Aragon extends Europa {
	private Alimentos recoleccionTrigo;
	private Alimentos recoleccionUvas;


	/**
     * Constructor donde se pasarán por parametros los atributos anteriores
     * @param nombre Informa sobre el nombre
     * @param continente Informa sobre el continente que se encuentra
     * @param poblacion Informa sobre la cantidad de poblacion que vive en el reino
     * @param territorio 
     * @param trigo Se introduce el objeto determinado que es
     * @param uvas Se introduce el objeto determinado que es
     * @throws Exception
     */
	public Aragon(String nombre,String continente,int poblacion,String territorio) throws Exception {
		super(nombre,continente, poblacion,territorio,0, 1778, 1543, 624, 9483);
		this.recoleccionTrigo= new Alimentos(ProductoNombre.Trigo, 0, 0, 0, 0, "cereal", 0);
		calcularProduccionMensual(this.recoleccionTrigo);
		this.recoleccionUvas= new Alimentos(ProductoNombre.Tomate, 0, 0, 0, 0, "fruta", 0);
		calcularProduccionMensual(this.recoleccionUvas);
		this.calcularProductosDemandados();
	}

	public Aragon(Aragon a) {
		super(a);
		this.recoleccionTrigo=a.getRecoleccionTrigo();
		this.recoleccionUvas=a.getRecoleccionUvas();
	}

    /**
     * El usuario procede a crear mercancias de los productos  recolectados
     * @param producto nombre del producto
     * @param cantidad cantidad del producto
     */
	public void crearMercancia(ProductoNombre producto,int cantidad)throws Exception {
		Mercancia mercancia;
		Productos newProduct;

		switch (producto) {
		case Trigo:
			if(this.recoleccionTrigo.getCantidad()>cantidad) {

				this.recoleccionTrigo.setCantidad(this.recoleccionTrigo.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionTrigo);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Trigo",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		case Uvas:
			if(this.recoleccionUvas.getCantidad()>cantidad) {

				this.recoleccionUvas.setCantidad(this.recoleccionUvas.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionUvas);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Uvas",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		default:
			throw new IllegalArgumentException("Este reino no produce " + producto);
		}
	}
	
	private void calcularProductosDemandados() {
		int valor;
		ProductoNombre productoNombre;
		
		for(int i=0;i<this.getProductosDemandados().length;i++) {
			do {
				valor = new Random().nextInt(ProductoNombre.values().length);
				productoNombre=ProductoNombre.values()[valor];
			}while(productoNombre==ProductoNombre.Uvas && productoNombre==ProductoNombre.Trigo);			
			this.getProductosDemandados()[i]=productoNombre;
		}	
	}

	/**
     * Método que devuelve la produccion mensual obtenida de los productos
     * @return
     */
	public String  verproduccionMensual() {
		return super.verproduccionMensual()+"Produccion de : "+this.recoleccionTrigo.toString() + "/ Produccion de de : "+ this.recoleccionUvas.toString() ;
	}

	public Alimentos getRecoleccionTrigo() {
		return recoleccionTrigo;
	}

	public void setRecoleccionTrigo(Alimentos recoleccionTrigo) {
		this.recoleccionTrigo = recoleccionTrigo;
	}

	public Alimentos getRecoleccionUvas() {
		return recoleccionUvas;
	}

	public void setRecoleccionUvas(Alimentos recoleccionUvas) {
		this.recoleccionUvas = recoleccionUvas;
	}

	@Override
	public String toString() {
		return super.toString();
	}



}
