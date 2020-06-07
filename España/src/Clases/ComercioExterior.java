package Clases;

public class ComercioExterior extends Territorio {
	
	private int relacionInternacional;
	private int distancia;
	
	public ComercioExterior(String nombre,String continente, Flota flota, int relacion,int distancia) {
		super(nombre,continente);
		this.relacionInternacional=relacion;
		this.distancia=distancia;
	}

	public ComercioExterior(ComercioExterior obj) {
		super(obj);
		this.relacionInternacional=obj.getRelacionInternacional();
		this.distancia=obj.getDistancia();
	}

	public int getRelacionInternacional() {
		return relacionInternacional;
	}

	public void setRelacionInternacional(int relacionInternacional) {
		this.relacionInternacional = relacionInternacional;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

}
