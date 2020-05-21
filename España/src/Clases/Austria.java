package Clases;

/**
 * Clase hija de Europa
 * @author Grupo
 *
 */
public class Austria extends Europa {

	private MateriasPrimas recoleccionHierro;
	private Alimentos recoleccionArroz;
	private MateriasPrimas recoleccionAlgodon;


    /**
     * 
     * @param nombre Informa sobre el nombre
     * @param continente Informa sobre el continente que se encuentra
     * @param poblacion Informa sobre la cantidad de poblacion que vive en el reino
     * @param territorio
     * @param hierro Se introduce el objeto determinado que es
     * @param algodon Se introduce el objeto determinado que es
     * @param arroz Se introduce el objeto determinado que es
     * @throws Exception 
     */
	public Austria(String nombre,String continente,int poblacion,String territorio) throws Exception {
		super(nombre,continente, poblacion,territorio,1785, 0, 1147, 2382, 10145);
		this.recoleccionHierro=new MateriasPrimas(ProductoNombre.Hierro, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(this.recoleccionHierro);
		this.recoleccionArroz= new Alimentos(ProductoNombre.Tomate, 0, 0, 0, 0, "gramíneas", 0);
		calcularProduccionMensual(recoleccionArroz);
		this.recoleccionAlgodon= new MateriasPrimas(ProductoNombre.Algodon, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(recoleccionAlgodon);
	}

	public Austria(Austria a) {
		super(a);
		this.recoleccionArroz=a.getRecoleccionArroz();
		this.recoleccionHierro=a.getRecoleccionHierro();
		this.recoleccionAlgodon=a.getRecoleccionAlgodon();
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
		case Hierro:
			if(this.recoleccionHierro.getCantidad()>cantidad) {

				this.recoleccionHierro.setCantidad(this.recoleccionHierro.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionHierro);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Hierro",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		case Arroz:
			if(this.recoleccionArroz.getCantidad()>cantidad) {

				this.recoleccionArroz.setCantidad(this.recoleccionArroz.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionArroz);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Arroz",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}

			break;
		case Algodon:

			if(this.recoleccionAlgodon.getCantidad()>cantidad) {

				this.recoleccionAlgodon.setCantidad(this.recoleccionAlgodon.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionAlgodon);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Algodon",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
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
		return super.verproduccionMensual()+"Produccion de : "+this.recoleccionHierro.toString() + "/ Produccion de de : "+ this.recoleccionArroz.toString() + "/ Produccion de de : "+this.recoleccionAlgodon.toString();
	}

	public MateriasPrimas getRecoleccionAlgodon() {
		return recoleccionAlgodon;
	}

	public void setRecoleccionAlgodon(MateriasPrimas recoleccionAlgodon) {
		this.recoleccionAlgodon = recoleccionAlgodon;
	}

	public MateriasPrimas getRecoleccionHierro() {
		return recoleccionHierro;
	}

	public void setRecoleccionHierro(MateriasPrimas recoleccionHierro) {
		this.recoleccionHierro = recoleccionHierro;
	}

	public Alimentos getRecoleccionArroz() {
		return recoleccionArroz;
	}

	public void setRecoleccionArroz(Alimentos recoleccionArroz) {
		this.recoleccionArroz = recoleccionArroz;
	}


	@Override
	public String toString() {
		return super.toString();
	}

}