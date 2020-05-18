package Clases;

public class Alimentos extends Productos {
	
	private int tiempoPerecer;
	private String tipo;
					
	public Alimentos(ProductoNombre nombre, double costeObtencionMedia, double costeMercadoInterno, double costeTransporteMedio,
			double costeMercadoExterno, String tipo,int perecer) {
		super(nombre, costeObtencionMedia, costeMercadoInterno, costeTransporteMedio, costeMercadoExterno);
		this.tiempoPerecer = perecer;
		this.tipo = tipo;
	}
	
	public Alimentos(Alimentos alimentos) {
		super(alimentos);
		this.tiempoPerecer=alimentos.getTiempoPerecer();
		this.tipo=alimentos.getTipo();
	}
	
	
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
