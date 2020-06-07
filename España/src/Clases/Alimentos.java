package Clases;

public class Alimentos extends Productos {
	
	/**
	 * tiempo determinado de vida de un Alimento 
	 */
	private int tiempoPerecer;
	/**
	 * atributo que marca el tipo de Alimeto que es "verdura,fruta..."
	 */
	private String tipo;

	
	/**
	 *       
	 * @param nombre                  Parametro encargado de introducir el nombre del producto
	 * @param costeObtencionMedia     Parametro encargado de introducir el coste de obtencion del producto
	 * @param costeMercadoInterno     Parametro encargado de introducir el coste de mercado interno
	 * @param costeTransporteMedio     Parametro encargado de introducir el coste de Transporte Medio
	 * @param costeMercadoExterno     Parametro encargado de introducir el precio que tiene en el mercado exterior 
	 * @param tipo                    Parametro encargado de introducir el tipo de Alimento que es 
	 * @param perecer                 Parametro encargado de estipular el tiempo de vida de dicho producto
	 */				
	public Alimentos(ProductoNombre nombre, double costeObtencionMedia, double costeMercadoInterno, double costeTransporteMedio,
			double costeMercadoExterno, String tipo,int perecer) {
		super(nombre, costeObtencionMedia, costeMercadoInterno, costeTransporteMedio, costeMercadoExterno);
		this.tiempoPerecer = perecer;
		this.tipo = tipo;
	}
	
	/**
	 * Constructor de copia
	 * @param alimentos
	 */
	public Alimentos(Alimentos alimentos) {
		super(alimentos);
		this.tiempoPerecer=alimentos.getTiempoPerecer();
		this.tipo=alimentos.getTipo();
	}
	
	/**
	 * Metodo encargado de ver los datos mas intrinsecos de un Alimento para hacer mas sencillo el toString
	 */
	public String verDatosAvanzados() {
		return super.verDatosAvanzados() + " tiempo de perecer : "+this.tiempoPerecer+" tipo : "+this.tipo;  
	}

	public int getTiempoPerecer() {
		return tiempoPerecer;
	}

	public void setTiempoPerecer(int tiempoPerecer) {
		this.tiempoPerecer = tiempoPerecer;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString();
	}
		
}
