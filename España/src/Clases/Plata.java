package Clases;
import java.util.HashMap;

public class Plata extends Virreinatos {

	private MateriasPrimas recoleccionPlata;
	private MateriasPrimas recoleccionTabaco;
	private MateriasPrimas recoleccionCafe;
	private Alimentos recoleccionPatata;

	public Plata(String nombre,String continente,  HashMap<Integer,Flota> flota, int poblacion, double dinero,MateriasPrimas plata,MateriasPrimas tabaco,MateriasPrimas cafe,Alimentos patata) throws Exception {
		super(nombre,continente, flota, poblacion, dinero, 4190, 0, 10927, 4707, 7353);
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
