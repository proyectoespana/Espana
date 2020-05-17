package Clases;
import java.util.HashMap;

public class NuevaGranada extends Virreinatos {

	private MateriasPrimas recoleccionOro;
	private MateriasPrimas recoleccionPlata;
	private MateriasPrimas recoleccionTabaco;
	private MateriasPrimas recoleccionCafe;

	public NuevaGranada(String nombre,String continente,  HashMap<Integer,Flota> flota, int poblacion, double dinero,MateriasPrimas oro,MateriasPrimas plata,MateriasPrimas tabaco,MateriasPrimas cafe) throws Exception {
		super(nombre,continente, flota, poblacion, dinero, 1970, 4707, 7258, 0, 4288 );
		this.recoleccionOro = oro;
		calcularProduccionMensual(oro);
		this.recoleccionPlata = plata;
		calcularProduccionMensual(plata);
		this.recoleccionTabaco = tabaco;
		calcularProduccionMensual(tabaco);
		this.recoleccionCafe = cafe;
		calcularProduccionMensual(cafe);
	}

	public NuevaGranada(NuevaGranada nuevaGranada) {
		super(nuevaGranada);
		this.recoleccionOro = nuevaGranada.getRecoleccionOro();
		this.recoleccionPlata = nuevaGranada.getRecoleccionPlata();
		this.recoleccionTabaco = nuevaGranada.getRecoleccionTabaco();
		this.recoleccionCafe = nuevaGranada.getRecoleccionCafe();
	}

	public String  verproduccionMensual() {
		return "Produccion de : "+this.recoleccionOro.toString() + "/ Produccion de de : "+ this.recoleccionPlata.toString() + "/ Produccion de de : "+this.recoleccionTabaco.toString() + "/ Produccion de de : "+this.recoleccionCafe.toString();
	}

	public MateriasPrimas getRecoleccionOro() {
		return recoleccionOro;
	}

	public void setRecoleccionOro(MateriasPrimas recoleccionOro) {
		this.recoleccionOro = recoleccionOro;
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

	@Override
	public String toString() {
		return super.toString();
	}
}