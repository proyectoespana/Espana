package Clases;
import java.util.HashMap;

public class NuevaGranada extends Virreinatos {

	private MateriasPrimas recoleccionOro;
	private MateriasPrimas recoleccionPlata;
	private MateriasPrimas recoleccionTabaco;
	private MateriasPrimas recoleccionCafe;

	public NuevaGranada(String nombre,String continente,  HashMap<Integer,Flota> flota, int poblacion, double dinero,MateriasPrimas oro,MateriasPrimas plata,MateriasPrimas tabaco,MateriasPrimas cafe) throws Exception {
		super(nombre,continente, flota, poblacion, dinero, 1970, 4707, 7258, 0, 4288 );
		this.recoleccionOro = oro;
		calcularProduccionMensual(oro);
		this.recoleccionPlata = plata;
		calcularProduccionMensual(plata);
		this.recoleccionTabaco = tabaco;
		calcularProduccionMensual(tabaco);
		this.recoleccionCafe = cafe;
		calcularProduccionMensual(cafe);
	}

	public NuevaGranada(NuevaGranada nuevaGranada) {
		super(nuevaGranada);
		this.recoleccionOro = nuevaGranada.getRecoleccionOro();
		this.recoleccionPlata = nuevaGranada.getRecoleccionPlata();
		this.recoleccionTabaco = nuevaGranada.getRecoleccionTabaco();
		this.recoleccionCafe = nuevaGranada.getRecoleccionCafe();
	}
	
	public void crearMercancia(ProductoNombre producto,int cantidad,int idMercancia) throws Exception {
		Productos newProduct;

		switch (producto) {
		case Oro:
			if(this.recoleccionOro.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionOro.setCantidad(this.recoleccionOro.getCantidad()-cantidad);

				newProduct= new MateriasPrimas(recoleccionOro);
				
				newProduct.setCantidad(cantidad);

				this.getMercancia().get(idMercancia).añadirProducto(newProduct);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto+" o ninguna mercancia con ese id ");
			}
			break;
		case Plata:
			if(this.recoleccionPlata.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionPlata.setCantidad(this.recoleccionPlata.getCantidad()-cantidad);

				newProduct= new MateriasPrimas(recoleccionPlata);

				newProduct.setCantidad(cantidad);

				this.getMercancia().get(idMercancia).añadirProducto(newProduct);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto+" o ninguna mercancia con ese id ");
			}
			break;
		case Tabaco:
			if(this.recoleccionTabaco.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionTabaco.setCantidad(this.recoleccionTabaco.getCantidad()-cantidad);

				newProduct= new MateriasPrimas(recoleccionTabaco);

				newProduct.setCantidad(cantidad);

				this.getMercancia().get(idMercancia).añadirProducto(newProduct);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto+" o ninguna mercancia con ese id ");
			}
			break;
		case Cafe:
			if(this.recoleccionCafe.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionCafe.setCantidad(this.recoleccionCafe.getCantidad()-cantidad);

				newProduct= new MateriasPrimas(recoleccionCafe);

				newProduct.setCantidad(cantidad);

				this.getMercancia().get(idMercancia).añadirProducto(newProduct);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto+" o ninguna mercancia con ese id ");
			}
			break;
		default:
			throw new IllegalArgumentException("Este reino no produce " + producto);
		}
	}

	public void crearMercancia(ProductoNombre producto,int cantidad,String nombre,int totalkg)throws Exception {
		Mercancia mercancia;
		Productos newProduct;

		switch (producto) {
		case Oro:
			if(this.recoleccionOro.getCantidad()>cantidad) {

				this.recoleccionOro.setCantidad(this.recoleccionOro.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionOro);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia(nombre, totalkg);
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		case Plata:
			if(this.recoleccionPlata.getCantidad()>cantidad) {

				this.recoleccionPlata.setCantidad(this.recoleccionPlata.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionPlata);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia(nombre, totalkg);
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}

			break;
		case Tabaco:

			if(this.recoleccionTabaco.getCantidad()>cantidad) {

				this.recoleccionTabaco.setCantidad(this.recoleccionTabaco.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionTabaco);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia(nombre, totalkg);
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		case Cafe:

			if(this.recoleccionCafe.getCantidad()>cantidad) {

				this.recoleccionCafe.setCantidad(this.recoleccionCafe.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionCafe);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia(nombre, totalkg);
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

	public String  verproduccionMensual() {
		return "Produccion de : "+this.recoleccionOro.toString() + "/ Produccion de de : "+ this.recoleccionPlata.toString() + "/ Produccion de de : "+this.recoleccionTabaco.toString() + "/ Produccion de de : "+this.recoleccionCafe.toString();
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