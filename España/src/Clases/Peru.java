package Clases;
import java.util.HashMap;

public class Peru extends Virreinatos {

	private MateriasPrimas recoleccionOro;
	private Alimentos recoleccionMaiz;
	private Alimentos recoleccionTomate;
	private Alimentos recoleccionPatata;

	public Peru(String nombre,String continente,  HashMap<Integer,Flota> flota, int poblacion, double dinero,MateriasPrimas oro,Alimentos maiz,Alimentos tomate,Alimentos patata) throws Exception {
		super(nombre,continente, flota, poblacion, dinero, 0, 4163, 9123, 1970, 4717);
		this.recoleccionOro = oro;
		calcularProduccionMensual(oro);
		this.recoleccionMaiz = maiz;
		calcularProduccionMensual(maiz);
		this.recoleccionTomate = tomate;
		calcularProduccionMensual(tomate);
		this.recoleccionPatata = patata;
		calcularProduccionMensual(patata);
	}

	public Peru(Peru peru) {
		super(peru);
		this.recoleccionOro = peru.getRecoleccionOro();
		this.recoleccionMaiz = peru.getRecoleccionMaiz();
		this.recoleccionTomate = peru.getRecoleccionTomate();
		this.recoleccionPatata = peru.getRecoleccionPatata();
	}


	public String  verproduccionMensual() {
		return "Produccion de : "+this.recoleccionOro.toString() + "/ Produccion de de : "+ this.recoleccionMaiz.toString() + "/ Produccion de de : "+this.recoleccionTomate.toString() + "/ Produccion de de : "+this.recoleccionPatata.toString();
	}

	public MateriasPrimas getRecoleccionOro() {
		return recoleccionOro;
	}

	public void setRecoleccionOro(MateriasPrimas recoleccionOro) {
		this.recoleccionOro = recoleccionOro;
	}

	public Alimentos getRecoleccionMaiz() {
		return recoleccionMaiz;
	}

	public void setRecoleccionMaiz(Alimentos recoleccionMaiz) {
		this.recoleccionMaiz = recoleccionMaiz;
	}

	public Alimentos getRecoleccionTomate() {
		return recoleccionTomate;
	}

	public void setRecoleccionTomate(Alimentos recoleccionTomate) {
		this.recoleccionTomate = recoleccionTomate;
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
