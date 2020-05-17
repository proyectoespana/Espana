package Clases;
import java.util.HashMap;

public class Peru extends Virreinatos {

	private MateriasPrimas recoleccionOro;
	private Alimentos recoleccionMaiz;
	private Alimentos recoleccionTomate;
	private Alimentos recoleccionPatata;

	public Peru(String nombre,String continente,  HashMap<Integer,Flota> flota, int poblacion, double dinero,MateriasPrimas oro,Alimentos maiz,Alimentos tomate,Alimentos patata) throws Exception {
		super(nombre,continente, flota, poblacion, dinero, 0, 4163, 9123, 1970, 4717);
		this.recoleccionOro = oro;
		calcularProduccionMensual(oro);
		this.recoleccionMaiz = maiz;
		calcularProduccionMensual(maiz);
		this.recoleccionTomate = tomate;
		calcularProduccionMensual(tomate);
		this.recoleccionPatata = patata;
		calcularProduccionMensual(patata);
	}

	public Peru(Peru peru) {
		super(peru);
		this.recoleccionOro = peru.getRecoleccionOro();
		this.recoleccionMaiz = peru.getRecoleccionMaiz();
		this.recoleccionTomate = peru.getRecoleccionTomate();
		this.recoleccionPatata = peru.getRecoleccionPatata();
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
		case Maiz:
			if(this.recoleccionMaiz.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionMaiz.setCantidad(this.recoleccionMaiz.getCantidad()-cantidad);

				newProduct= new Alimentos(recoleccionMaiz);

				newProduct.setCantidad(cantidad);

				this.getMercancia().get(idMercancia).añadirProducto(newProduct);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto+" o ninguna mercancia con ese id ");
			}
			break;
		case Tomate:
			if(this.recoleccionTomate.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionTomate.setCantidad(this.recoleccionTomate.getCantidad()-cantidad);

				newProduct= new Alimentos(recoleccionTomate);

				newProduct.setCantidad(cantidad);

				this.getMercancia().get(idMercancia).añadirProducto(newProduct);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto+" o ninguna mercancia con ese id ");
			}
			break;
		case Patata:
			if(this.recoleccionPatata.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionPatata.setCantidad(this.recoleccionPatata.getCantidad()-cantidad);

				newProduct= new Alimentos(recoleccionPatata);

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
		case Maiz:
			if(this.recoleccionMaiz.getCantidad()>cantidad) {

				this.recoleccionMaiz.setCantidad(this.recoleccionMaiz.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionMaiz);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia(nombre, totalkg);
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}

			break;
		case Tomate:

			if(this.recoleccionTomate.getCantidad()>cantidad) {

				this.recoleccionTomate.setCantidad(this.recoleccionTomate.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionTomate);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia(nombre, totalkg);
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		case Patata:

			if(this.recoleccionPatata.getCantidad()>cantidad) {

				this.recoleccionPatata.setCantidad(this.recoleccionPatata.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionPatata);
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
		return "Produccion de : "+this.recoleccionOro.toString() + "/ Produccion de de : "+ this.recoleccionMaiz.toString() + "/ Produccion de de : "+this.recoleccionTomate.toString() + "/ Produccion de de : "+this.recoleccionPatata.toString();
	}

	public MateriasPrimas getRecoleccionOro() {
		return recoleccionOro;
	}

	public void setRecoleccionOro(MateriasPrimas recoleccionOro) {
		this.recoleccionOro = recoleccionOro;
	}

	public Alimentos getRecoleccionMaiz() {
		return recoleccionMaiz;
	}

	public void setRecoleccionMaiz(Alimentos recoleccionMaiz) {
		this.recoleccionMaiz = recoleccionMaiz;
	}

	public Alimentos getRecoleccionTomate() {
		return recoleccionTomate;
	}

	public void setRecoleccionTomate(Alimentos recoleccionTomate) {
		this.recoleccionTomate = recoleccionTomate;
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
