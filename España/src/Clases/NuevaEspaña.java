package Clases;
import java.util.HashMap;
import java.util.Random;

public class NuevaEspaña extends Virreinatos {



	private Alimentos recoleccionMaiz;
	private MateriasPrimas recoleccionOro;
	private Alimentos recoleccionCacao;
	private Alimentos recoleccionTomate;

	public NuevaEspaña(String nombre,String continente,  HashMap<Integer,Flota> flota, int poblacion, double dinero,Alimentos maiz,Alimentos cacao,Alimentos tomate,MateriasPrimas oro) throws Exception {
		super(nombre,continente, flota, poblacion, dinero, 4717,
				7353, 9020, 4290, 0);
		this.recoleccionMaiz=maiz;
		calcularProduccionMensual(maiz);
		this.recoleccionOro=oro;
		calcularProduccionMensual(oro);
		this.recoleccionCacao=cacao;
		calcularProduccionMensual(cacao);
		this.recoleccionTomate=tomate;
		calcularProduccionMensual(tomate);

		//meter los calualar produccion de los productos
	}

	public NuevaEspaña(NuevaEspaña obj) {
		super(obj);
		this.recoleccionMaiz=obj.getRecoleccionMaiz();
		this.recoleccionOro=obj.getRecoleccionOro();
		this.recoleccionCacao=obj.getRecoleccionCacao();
		this.recoleccionTomate=obj.getRecoleccionTomate();
	}

	/**
	 * Mustra el nombre del producto y la cantidad del mismo
	 */
	public String  verproduccionMensual() {
		return "Produccion de : "+this.recoleccionMaiz.toString() + "/ Produccion de de : "+ this.recoleccionOro.toString() + "/ Produccion de de : "+this.recoleccionCacao.toString() + "/ Produccion de de : "+this.recoleccionTomate.toString();
	}

	public Alimentos getRecoleccionMaiz() {
		return recoleccionMaiz;
	}

	public void crearMercancia(ProductoNombre producto,int cantidad,int idMercancia) throws Exception {
		Productos newProduct;

		switch (producto) {
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
		case Cacao:
			if(this.recoleccionCacao.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionCacao.setCantidad(this.recoleccionCacao.getCantidad()-cantidad);

				newProduct= new Alimentos(recoleccionCacao);

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
		default:
			throw new IllegalArgumentException("Este reino no produce " + producto);
		}
	}

	public void crearMercancia(ProductoNombre producto,int cantidad,String nombre,int totalkg)throws Exception {
		Mercancia mercancia;
		Productos newProduct;

		switch (producto) {
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
		case Cacao:

			if(this.recoleccionCacao.getCantidad()>cantidad) {

				this.recoleccionCacao.setCantidad(this.recoleccionCacao.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionCacao);
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
		default:
			throw new IllegalArgumentException("Este reino no produce " + producto);
		}

	}

	public void verProduccion() {

	}

	public void setRecoleccionMaiz(Alimentos recoleccionMaiz) {
		this.recoleccionMaiz = recoleccionMaiz;
	}

	public MateriasPrimas getRecoleccionOro() {
		return recoleccionOro;
	}

	public void setRecoleccionOro(MateriasPrimas recoleccionOro) {
		this.recoleccionOro = recoleccionOro;
	}

	public Alimentos getRecoleccionCacao() {
		return recoleccionCacao;
	}

	public void setRecoleccionCacao(Alimentos recoleccionCacao) {
		this.recoleccionCacao = recoleccionCacao;
	}

	public Alimentos getRecoleccionTomate() {
		return recoleccionTomate;
	}

	public void setRecoleccionTomate(Alimentos recoleccionTomate) {
		this.recoleccionTomate = recoleccionTomate;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
