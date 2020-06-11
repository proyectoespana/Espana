package Clases;

public class MateriasPrimas extends Productos {
	
	private double precioGramo;
	/**
	 * Valor del gramo de dicho producto 
	 */
	private int calidad;
	/**
	 * Variable temporal relacionada con el precio 
	 */
	
	/**
	 * 
	 * @param nombre                  Parámetro encargado de introducir el nombre del producto
	 * @param costeObtencionMedia     Parámetro encargado de introducir el coste de obtención del producto
	 * @param costeMercadoInterno     Parámetro encargado de introducir el coste de mercado interno
	 * @param costeTransporteMedio     Parámetro encargado de introducir el coste de Transporte Medio
	 * @param costeMercadoExterno     Parámetro encargado de introducir el precio que tiene en el mercado exterior 
	 * @param precioGramo				Parámetro, encargado de introducir el precio, al que está el gramo de una determinada Materia Prima
	 * @param calidad 					Parámetro que mide el nivel de dicha Materia Prima
	 */
	public MateriasPrimas(ProductoNombre nombre, double costeObtencionMedia, double costeMercadoInterno, double costeTransporteMedio, 
			double	costeMercadoExterno, double precioGramo, int calidad) {
		super(nombre, costeObtencionMedia, costeMercadoInterno, costeTransporteMedio, costeMercadoExterno);
		this.precioGramo = precioGramo;
		this.calidad = calidad;
	}
	
	/**
	 * Constructor de copia
	 * @param materiasPrimas objeto que copiar
	 */
	public MateriasPrimas(MateriasPrimas materiasPrimas) {
		super(materiasPrimas);
		this.precioGramo = materiasPrimas.getPrecioGramo();
		this.calidad = materiasPrimas.getCalidad();
	}

	public double getPrecioGramo() {
		return precioGramo;
	}
	
	/**
	 * Método, encargado de ver los datos más intrínsecos de unas Materias Primas, para hacer más sencillo el "toString"
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

