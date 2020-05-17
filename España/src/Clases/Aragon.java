package Clases;
import java.util.HashMap;

public class Aragon extends Europa {
	private Alimentos recoleccionTrigo;
	private Alimentos recoleccionUvas;



	public Aragon(String nombre,String continente, HashMap<Integer,Flota> flota,int poblacion,double dinero,String territorio,Alimentos trigo,Alimentos uvas) throws Exception {
		super(nombre,continente, flota, poblacion,dinero,territorio,0, 1778, 1543, 624, 9483);
		this.recoleccionTrigo=trigo;
		calcularProduccionMensual(trigo);
		this.recoleccionUvas=uvas;
		calcularProduccionMensual(uvas);

	}

	public Aragon(Aragon a) {
		super(a);
		this.recoleccionTrigo=a.getRecoleccionTrigo();
		this.recoleccionUvas=a.getRecoleccionUvas();
	}
	
	public void crearMercancia(ProductoNombre producto,int cantidad,int idMercancia) throws Exception {
		Productos newProduct;

		switch (producto) {
		case Trigo:
			if(this.recoleccionTrigo.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionTrigo.setCantidad(this.recoleccionTrigo.getCantidad()-cantidad);

				newProduct= new Alimentos(recoleccionTrigo);

				newProduct.setCantidad(cantidad);

				this.getMercancia().get(idMercancia).a�adirProducto(newProduct);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto+" o ninguna mercancia con ese id ");
			}
			break;
		case Uvas:
			if(this.recoleccionUvas.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
				this.recoleccionUvas.setCantidad(this.recoleccionUvas.getCantidad()-cantidad);

				newProduct= new Alimentos(recoleccionUvas);

				newProduct.setCantidad(cantidad);

				this.getMercancia().get(idMercancia).a�adirProducto(newProduct);
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
				mercancia.a�adirProducto(newProduct);
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
				mercancia.a�adirProducto(newProduct);
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
		return "Produccion de : "+this.recoleccionTrigo.toString() + "/ Produccion de de : "+ this.recoleccionUvas.toString() ;
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
