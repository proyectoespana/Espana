package Clases;
import java.util.HashMap;

public class Castilla extends Europa {

	private Alimentos recoleccionTrigo;
	private Alimentos recoleccionUvas;
	private MateriasPrimas recoleccionHierro;

	public Castilla(String nombre,String continente,  HashMap<Integer,Flota> flota, int poblacion, double dinero,
			String territorio,Alimentos trigo,Alimentos uva,MateriasPrimas hierro) throws Exception {
		super(nombre,continente, flota, poblacion, dinero,territorio, 621,
				2375, 1784, 0, 9020);
		this.recoleccionTrigo=trigo;
		calcularProduccionMensual(trigo);
		this.recoleccionUvas=uva;
		calcularProduccionMensual(uva);
		this.recoleccionHierro=hierro;
		calcularProduccionMensual(hierro);
	}

	public Castilla(Castilla obj) {
		super(obj);
		this.recoleccionTrigo=obj.getRecoleccionTrigo();
		this.recoleccionUvas=obj.getRecoleccionUvas();
		this.recoleccionHierro=obj.getRecoleccionHierro();
	}
	
	public void crearMercancia(ProductoNombre producto,int cantidad,int idMercancia) throws Exception {
		Productos newProduct;

		switch (producto) {
		case Trigo:
			if(this.recoleccionTrigo.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionTrigo.setCantidad(this.recoleccionTrigo.getCantidad()-cantidad);

				newProduct= new Alimentos(recoleccionTrigo);
				
				newProduct.setCantidad(cantidad);

				this.getMercancia().get(idMercancia).añadirProducto(newProduct);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto+" o ninguna mercancia con ese id ");
			}
			break;
		case Uvas:
			if(this.recoleccionUvas.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionUvas.setCantidad(this.recoleccionUvas.getCantidad()-cantidad);

				newProduct= new Alimentos(recoleccionUvas);

				newProduct.setCantidad(cantidad);

				this.getMercancia().get(idMercancia).añadirProducto(newProduct);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto+" o ninguna mercancia con ese id ");
			}
			break;
		case Hierro:
			if(this.recoleccionHierro.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionHierro.setCantidad(this.recoleccionHierro.getCantidad()-cantidad);

				newProduct= new MateriasPrimas(recoleccionHierro);

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
		case Trigo:
			if(this.recoleccionTrigo.getCantidad()>cantidad) {

				this.recoleccionTrigo.setCantidad(this.recoleccionTrigo.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionTrigo);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia(nombre, totalkg);
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		case Uvas:
			if(this.recoleccionUvas.getCantidad()>cantidad) {

				this.recoleccionUvas.setCantidad(this.recoleccionUvas.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionUvas);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia(nombre, totalkg);
				mercancia.añadirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}

			break;
		case Hierro:

			if(this.recoleccionHierro.getCantidad()>cantidad) {

				this.recoleccionHierro.setCantidad(this.recoleccionHierro.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionHierro);
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
		return "Produccion de : "+this.recoleccionTrigo.toString() + "/ Produccion de de : "+ this.recoleccionUvas.toString() + "/ Produccion de de : "+this.recoleccionHierro.toString();
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
