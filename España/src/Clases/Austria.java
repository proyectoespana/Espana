package Clases;

import java.util.Random;

/**
 * Clase hija de Europa
 * @author Grupo
 *
 */
public class Austria extends Europa {

	private MateriasPrimas recoleccionHierro;
	private Alimentos recoleccionArroz;
	private Alimentos recoleccionUvas;
	private MateriasPrimas recoleccionPlata;


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
		super(nombre,continente, poblacion,territorio,1785, 0, 1147, 2382, 10145,8949,10864,12727);
		this.recoleccionHierro=new MateriasPrimas(ProductoNombre.Hierro, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(this.recoleccionHierro);
		this.recoleccionArroz= new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "gramíneas", 0);
		calcularProduccionMensual(recoleccionArroz);
		this.recoleccionUvas= new Alimentos(ProductoNombre.Uvas, 0, 0, 0, 0, "fruta", 0);
		calcularProduccionMensual(recoleccionUvas);
		this.recoleccionPlata = new MateriasPrimas(ProductoNombre.Plata, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(recoleccionPlata);
		this.calcularProductosDemandados();
	}

	public Austria(Austria a) {
		super(a);
		this.recoleccionArroz=a.getRecoleccionArroz();
		this.recoleccionHierro=a.getRecoleccionHierro();
		this.recoleccionPlata= a.getRecoleccionPlata();
	}

	/**
	 * El usuario procede a crear mercancias de los productos  recolectados
	 * @param producto nombre del producto
	 * @param cantidad cantidad del producto
	 * @param nombre nombre del producto
	 * @param totalkg peso total del producto
	 * @throws Exception
	 */
	public void crearMercancia(ProductoNombre producto,int cantidad)throws Exception {
		Mercancia mercancia;
		Productos newProduct;

		switch (producto) {
		case Hierro:
			if(this.recoleccionHierro.getCantidad()>=cantidad) {

				this.recoleccionHierro.setCantidad(this.recoleccionHierro.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionHierro);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Hierro",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(this.getIdMercancias()+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		case Arroz:
			if(this.recoleccionArroz.getCantidad()>=cantidad) {

				this.recoleccionArroz.setCantidad(this.recoleccionArroz.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionArroz);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Arroz",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(this.getIdMercancias()+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}

			break;
		case Plata:
			if(this.recoleccionPlata.getCantidad()>=cantidad) {

				this.recoleccionPlata.setCantidad(this.recoleccionPlata.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionPlata);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Plata",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(this.getIdMercancias()+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
			//		case Algodon:
			//
			//			if(this.recoleccionAlgodon.getCantidad()>=cantidad) {
			//
			//				this.recoleccionAlgodon.setCantidad(this.recoleccionAlgodon.getCantidad()-cantidad);
			//				newProduct= new MateriasPrimas(recoleccionAlgodon);
			//				newProduct.setCantidad(cantidad);
			//				mercancia= new Mercancia("Algodon",this.getNombre());
			//				mercancia.añadirProducto(newProduct);
			//				this.getMercancia().put(this.getIdMercancias(), mercancia);	
			//				this.setIdMercancias(this.getIdMercancias()+1);
			//			}else {
			//				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			//			}
			//			break;
		case Uvas:
			if(this.recoleccionUvas.getCantidad()>=cantidad) {

				this.recoleccionUvas.setCantidad(this.recoleccionUvas.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionUvas);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Uvas",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(this.getIdMercancias()+1);
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
			}while(productoNombre==ProductoNombre.Arroz || productoNombre==ProductoNombre.Plata || productoNombre==ProductoNombre.Uvas);			
			this.getProductosDemandados()[i]=productoNombre;
		}	
	}

	/**
	 * Método que devuelve la produccion mensual obtenida de los productos
	 * @return
	 */
	public String  verproduccionMensual() {
		return super.verproduccionMensual()+"Produccion de : "+this.recoleccionHierro.toString() + "/ Produccion de de : "+ this.recoleccionArroz.toString() + "/ Produccion de de : "+this.recoleccionPlata.toString();
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

	public Alimentos getRecoleccionUvas() {
		return recoleccionUvas;
	}

	public void setRecoleccionUvas(Alimentos recoleccionUvas) {
		this.recoleccionUvas = recoleccionUvas;
	}

	public MateriasPrimas getRecoleccionPlata() {
		return recoleccionPlata;
	}

	public void setRecoleccionPlata(MateriasPrimas recoleccionPlata) {
		this.recoleccionPlata = recoleccionPlata;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}