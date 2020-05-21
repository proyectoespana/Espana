package Clases;

import java.util.Random;

public class Plata extends Virreinatos {

	private MateriasPrimas recoleccionPlata;
	private MateriasPrimas recoleccionTabaco;
	private MateriasPrimas recoleccionCafe;
	private Alimentos recoleccionPatata;

	/**
     * Constructor de 7 parametros
     * @param nombre informa sobre el nombre
     * @param continente Informa sobre el continente en el que se encuentra
     * @param poblacion Informa sobre la cantidad de poblacion que vive en el reino
     * @param plata Se introduce el objeto determinado que es
     * @param tabaco Se introduce el objeto determinado que es
     * @param cafe Se introduce el objeto determinado que es
     * @param patata Se introduce el objeto determinado que es
     * @throws Exception
     */
	public Plata(String nombre,String continente, int poblacion) throws Exception {
		super(nombre,continente, poblacion, 4190, 0, 10927, 4707, 7353);
		this.recoleccionPlata = new MateriasPrimas(ProductoNombre.Plata, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(this.recoleccionPlata);
		this.recoleccionTabaco = new MateriasPrimas(ProductoNombre.Tabaco, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(this.recoleccionTabaco);
		this.recoleccionCafe = new MateriasPrimas(ProductoNombre.Cafe, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(this.recoleccionCafe);
		this.recoleccionPatata =new Alimentos(ProductoNombre.Patata, 0, 0, 0, 0, "tubérculo", 0);
		calcularProduccionMensual(this.recoleccionPatata);
		this.calcularProductosDemandados();
	}

	/**
     * Constructor de copia
     * @param plata
     */
	public Plata(Plata plata) {
		super(plata);
		this.recoleccionPlata = plata.getRecoleccionPlata();
		this.recoleccionTabaco = plata.getRecoleccionTabaco();
		this.recoleccionCafe = plata.getRecoleccionCafe();
		this.recoleccionPatata = plata.getRecoleccionPatata();
	}

    /**
     * Crean las mercancias 
     * @param producto recogen un Objeto producto
     * @param cantidad recoge la cantidad 
     * @throws IllegalArgumentException que no se admite ese dato
     */
	public void crearMercancia(ProductoNombre producto,int cantidad)throws Exception {
		Mercancia mercancia;
		Productos newProduct;

		switch (producto) {
		case Plata:
			if(this.recoleccionPlata.getCantidad()>cantidad) {

				this.recoleccionPlata.setCantidad(this.recoleccionPlata.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionPlata);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Plata",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		case Tabaco:
			if(this.recoleccionTabaco.getCantidad()>cantidad) {

				this.recoleccionTabaco.setCantidad(this.recoleccionTabaco.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionTabaco);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Tabaco",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}

			break;
		case Cafe:

			if(this.recoleccionCafe.getCantidad()>cantidad) {

				this.recoleccionCafe.setCantidad(this.recoleccionCafe.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionCafe);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Cafe",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		case Patata:

			if(this.recoleccionPatata.getCantidad()>cantidad) {

				this.recoleccionPatata.setCantidad(this.recoleccionPatata.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionPatata);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Patata",this.getNombre());
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
			}while(productoNombre==ProductoNombre.Plata && productoNombre==ProductoNombre.Tabaco && productoNombre==ProductoNombre.Cafe && productoNombre==ProductoNombre.Patata);			
			this.getProductosDemandados()[i]=productoNombre;
		}	
	}

	public String  verproduccionMensual() {
		return super.verproduccionMensual()+"Produccion de : "+this.recoleccionPlata.toString() + "/ Produccion de de : "+ this.recoleccionTabaco.toString() + "/ Produccion de de : "+this.recoleccionCafe.toString() + "/ Produccion de de : "+this.recoleccionPatata.toString();
	}

	public MateriasPrimas getRecoleccionPlata() {
		return recoleccionPlata;
	}

	public void setRecoleccionPlata(MateriasPrimas recoleccionPlata) {
		this.recoleccionPlata = recoleccionPlata;
	}

	public MateriasPrimas getRecoleccionTabaco() {
		return recoleccionTabaco;
	}

	public void setRecoleccionTabaco(MateriasPrimas recoleccionTabaco) {
		this.recoleccionTabaco = recoleccionTabaco;
	}

	public MateriasPrimas getRecoleccionCafe() {
		return recoleccionCafe;
	}

	public void setRecoleccionCafe(MateriasPrimas recoleccionCafe) {
		this.recoleccionCafe = recoleccionCafe;
	}

	public Alimentos getRecoleccionPatata() {
		return recoleccionPatata;
	}

	public void setRecoleccionPatata(Alimentos recoleccionPatata) {
		this.recoleccionPatata = recoleccionPatata;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
