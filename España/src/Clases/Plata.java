package Clases;

public class Plata extends Virreinatos {

	private MateriasPrimas recoleccionPlata;
	private MateriasPrimas recoleccionTabaco;
	private MateriasPrimas recoleccionCafe;
	private Alimentos recoleccionPatata;

	public Plata(String nombre,String continente, int poblacion,MateriasPrimas plata,MateriasPrimas tabaco,MateriasPrimas cafe,Alimentos patata) throws Exception {
		super(nombre,continente, poblacion, 4190, 0, 10927, 4707, 7353);
		this.recoleccionPlata = plata;
		calcularProduccionMensual(plata);
		this.recoleccionTabaco = tabaco;
		calcularProduccionMensual(tabaco);
		this.recoleccionCafe = cafe;
		calcularProduccionMensual(cafe);
		this.recoleccionPatata = patata;
		calcularProduccionMensual(patata);
	}

	public Plata(Plata plata) {
		super(plata);
		this.recoleccionPlata = plata.getRecoleccionPlata();
		this.recoleccionTabaco = plata.getRecoleccionTabaco();
		this.recoleccionCafe = plata.getRecoleccionCafe();
		this.recoleccionPatata = plata.getRecoleccionPatata();
	}

	public void crearMercancia(ProductoNombre producto,int cantidad)throws Exception {
		Mercancia mercancia;
		Productos newProduct;

		switch (producto) {
		case Plata:
			if(this.recoleccionPlata.getCantidad()>cantidad) {

				this.recoleccionPlata.setCantidad(this.recoleccionPlata.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionPlata);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Plata");
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
				mercancia= new Mercancia("Tabaco");
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
				mercancia= new Mercancia("Cafe");
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
				mercancia= new Mercancia("Patata");
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
		return "Produccion de : "+this.recoleccionPlata.toString() + "/ Produccion de de : "+ this.recoleccionTabaco.toString() + "/ Produccion de de : "+this.recoleccionCafe.toString() + "/ Produccion de de : "+this.recoleccionPatata.toString();
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
