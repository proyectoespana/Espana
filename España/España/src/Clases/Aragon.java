package Clases;

public class Aragon extends Europa {
	private Alimentos recoleccionTrigo;
	private Alimentos recoleccionUvas;



	public Aragon(String nombre,String continente,int poblacion,String territorio,Alimentos trigo,Alimentos uvas) throws Exception {
		super(nombre,continente, poblacion,territorio,0, 1778, 1543, 624, 9483);
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

	public void crearMercancia(ProductoNombre producto,int cantidad)throws Exception {
		Mercancia mercancia;
		Productos newProduct;

		switch (producto) {
		case Trigo:
			if(this.recoleccionTrigo.getCantidad()>cantidad) {

				this.recoleccionTrigo.setCantidad(this.recoleccionTrigo.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionTrigo);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Trigo");
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
				mercancia= new Mercancia("Uvas");
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
