package Clases;

public class MateriasPrimas extends Productos {
	
	private double precioGramo;
	/**
	 * valor del gramo de dicho producto 
	 */
	private int calidad;
	/**
	 * Varaible temporal relacionada con el precio 
	 */
	
	/**
	 * 
	 * @param nombre                  Parametro encargado de introducir el nombre del producto
	 * @param costeObtencionMedia     Parametro encargado de introducir el coste de obtencion del producto
	 * @param costeMercadoInterno     Parametro encargado de introducir el coste de mercado interno
	 * @param costeTransporteMedio     Parametro encargado de introducir el coste de Transporte Medio
	 * @param costeMercadoExterno     Parametro encargado de introducir el precio que tiene en el mercado exterior 
	 * @param precioGramo				Parametro encargado de introducir el precio al que este el grama de una determinada Materia Prima
	 * @param calidad 					Parametro que mide el nivel de dicha Materia Prima
	 */
	public MateriasPrimas(ProductoNombre nombre, double costeObtencionMedia, double costeMercadoInterno, double costeTransporteMedio, 
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
	
	/**
	 * Metodo encargado de ver los datos mas intrinsecos de un Materias Primas para hacer mas sencillo el toString
	 */
	public String verDatosAvanzados() {
		return super.verDatosAvanzados()+" precio gramo : "+this.precioGramo+" calidad : "+this.calidad; 
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
		return super.toString();
	}
		
}

