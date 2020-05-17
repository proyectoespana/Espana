
public abstract class MateriasPrimas extends Productos {
	
	private double precioGramo;
	private int calidad;
	
	public MateriasPrimas(String nombre, double costeObtencionMedia, double costeMercadoInterno, double costeTransporteMedio, 
			double	costeMercadoExterno, double precioGramo, int calidad) {
		super(nombre, costeObtencionMedia, costeMercadoInterno, costeTransporteMedio, costeMercadoExterno);
		this.precioGramo = precioGramo;
		this.calidad = calidad;
	}
	
	public MateriasPrimas(MateriasPrimas materiasPrimas) {
		super(materiasPrimas);
		this.precioGramo = materiasPrimas.getPrecioGramo();
		this.calidad = materiasPrimas.getCalidad();
	}

	public double getPrecioGramo() {
		return precioGramo;
	}

	public void setPrecioGramo(double precioGramo) {
		this.precioGramo = precioGramo;
	}

	public int getCalidad() {
		return calidad;
	}

	public void setCalidad(int calidad) {
		this.calidad = calidad;
	}

	@Override
	public String toString() {
		return "MateriasPrimas [precioGramo=" + precioGramo + ", calidad=" + calidad + "]";
	}
	
	
}

