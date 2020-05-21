package Clases;

import java.util.Random;

public class NuevaGranada extends Virreinatos {

	private MateriasPrimas recoleccionOro;
	private MateriasPrimas recoleccionPlata;
	private MateriasPrimas recoleccionTabaco;
	private MateriasPrimas recoleccionCafe;

	 /**
     * Constructor con 7 parametros
     * @param nombre informa sobre el nombre
     * @param continente Informa sobre el continente en el que se encuentra
     * @param poblacion Informa sobre la cantidad de poblacion que vive en el reino
     * @param oro
     * @param plata
     * @param tabaco
     * @param cafe
     * @throws Exception
     */
	public NuevaGranada(String nombre,String continente, int poblacion) throws Exception {
		super(nombre,continente, poblacion, 1970, 4707, 7258, 0, 4288 );
		this.recoleccionOro = new MateriasPrimas(ProductoNombre.Oro, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(this.recoleccionOro);
		this.recoleccionPlata = new MateriasPrimas(ProductoNombre.Plata, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(this.recoleccionPlata);
		this.recoleccionTabaco =new MateriasPrimas(ProductoNombre.Tabaco, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(this.recoleccionTabaco);
		this.recoleccionCafe = new MateriasPrimas(ProductoNombre.Cafe, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(this.recoleccionCafe);
		this.calcularProductosDemandados();
	}

	/**
     * Contructor de copia
     * @param nuevaGranada
     */
	public NuevaGranada(NuevaGranada nuevaGranada) {
		super(nuevaGranada);
		this.recoleccionOro = nuevaGranada.getRecoleccionOro();
		this.recoleccionPlata = nuevaGranada.getRecoleccionPlata();
		this.recoleccionTabaco = nuevaGranada.getRecoleccionTabaco();
		this.recoleccionCafe = nuevaGranada.getRecoleccionCafe();
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
		case Oro:
			if(this.recoleccionOro.getCantidad()>cantidad) {

				this.recoleccionOro.setCantidad(this.recoleccionOro.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionOro);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Oro",this.getNombre());
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
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
			}while(productoNombre==ProductoNombre.Oro && productoNombre==ProductoNombre.Plata && productoNombre==ProductoNombre.Tabaco && productoNombre==ProductoNombre.Cafe);			
			this.getProductosDemandados()[i]=productoNombre;
		}	
	}

	public String  verproduccionMensual() {
		return super.verproduccionMensual()+"Produccion de : "+this.recoleccionOro.toString() + "/ Produccion de de : "+ this.recoleccionPlata.toString() + "/ Produccion de de : "+this.recoleccionTabaco.toString() + "/ Produccion de de : "+this.recoleccionCafe.toString();
	}

	public MateriasPrimas getRecoleccionOro() {
		return recoleccionOro;
	}

	public void setRecoleccionOro(MateriasPrimas recoleccionOro) {
		this.recoleccionOro = recoleccionOro;
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

	@Override
	public String toString() {
		return super.toString();
	}
}