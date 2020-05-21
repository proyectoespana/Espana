package Clases;

/**
 * Clase hija de Europa
 * @author Grupo
 *
 */
public class Castilla extends Europa {

	private Alimentos recoleccionTrigo;
	private Alimentos recoleccionUvas;
	private MateriasPrimas recoleccionHierro;

	   /**
     * Constructor donde se pasarán por parametros los atributos anteriores
     * @param nombre Informa sobre el nombre
     * @param continente Informa sobre el continente que se encuentra
     * @param poblacion Informa sobre la cantidad de poblacion que vive en el reino
     * @param territorio
     * @param trigo Se introduce el objeto determinado que es
     * @param uva Se introduce el objeto determinado que es
     * @param hierro Se introduce el objeto determinado que es
     * @throws Exception 
     */
	public Castilla(String nombre,String continente, int poblacion,String territorio) throws Exception {
		super(nombre,continente, poblacion,territorio, 621,	2375, 1784, 0, 9020);
		this.recoleccionTrigo= new Alimentos(ProductoNombre.Trigo, 0, 0, 0, 0, "cereal", 0);
		calcularProduccionMensual(this.recoleccionTrigo);
		this.recoleccionUvas= new Alimentos(ProductoNombre.Tomate, 0, 0, 0, 0, "fruta", 0);
		calcularProduccionMensual(this.recoleccionUvas);
		this.recoleccionHierro=new MateriasPrimas(ProductoNombre.Hierro, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(this.recoleccionHierro);
	}

	public Castilla(Castilla obj) {
		super(obj);
		this.recoleccionTrigo=obj.getRecoleccionTrigo();
		this.recoleccionUvas=obj.getRecoleccionUvas();
		this.recoleccionHierro=obj.getRecoleccionHierro();
	}

    /**
     * El usuario procede a crear mercancias de los productos  recolectados
     * @param producto nombre del producto
     * @param cantidad cantidad del producto
     * @param nombre nombre del producto
     * @param totalkg peso total del producto
     * @throws Exception
     */
	public void crearMercancia(ProductoNombre producto,int cantidad,String nombre,int totalkg)throws Exception {
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
		case Hierro:

			if(this.recoleccionHierro.getCantidad()>cantidad) {

				this.recoleccionHierro.setCantidad(this.recoleccionHierro.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionHierro);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Hierro",this.getNombre());
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

	/**
     * Método que devuelve la produccion mensual obtenida de los productos
     * @return
     */
	public String  verproduccionMensual() {
		return super.verproduccionMensual()+"Produccion de : "+this.recoleccionTrigo.toString() + "/ Produccion de de : "+ this.recoleccionUvas.toString() + "/ Produccion de de : "+this.recoleccionHierro.toString();
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

	public MateriasPrimas getRecoleccionHierro() {
		return recoleccionHierro;
	}

	public void setRecoleccionHierro(MateriasPrimas recoleccionHierro) {
		this.recoleccionHierro = recoleccionHierro;
	}

	@Override
	public String toString() {
		return super.toString();
	}	

}
