import java.util.ArrayList;

public class Peru extends Virreinatos {
	
	private MateriasPrimas recoleccionOro;
	private Alimentos recoleccionMaiz;
	private Alimentos recoleccionTomate;
	private Alimentos recoleccionPatata;
	
	public Peru(String nombre, double pib, String continente, ArrayList<Flota> flota, int poblacion,
			String responsable, ArrayList<Mercancia> imporatacion, ArrayList<Mercancia> exportacion, double dinero,boolean sublevaciones, 
			int peru,int plata,int castilla,int granada,int nuevaEspaña, MateriasPrimas recoleccionOro, Alimentos recoleccionPlata, 
			Alimentos recoleccionTabaco, Alimentos recoleccionCafe) {
		super(nombre, pib, continente, flota, poblacion, responsable, imporatacion, exportacion, dinero, sublevaciones, peru, plata, castilla, granada, nuevaEspaña);
		this.recoleccionOro = recoleccionOro;
		this.recoleccionMaiz = recoleccionPlata;
		this.recoleccionTomate = recoleccionTabaco;
		this.recoleccionPatata = recoleccionCafe;
	}
	
	public Peru(Peru peru) {
		super(peru);
		this.recoleccionOro = peru.getRecoleccionOro();
		this.recoleccionMaiz = peru.getRecoleccionMaiz();
		this.recoleccionTomate = peru.getRecoleccionTomate();
		this.recoleccionPatata = peru.getRecoleccionPatata();
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
	
	

}
