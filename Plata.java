import java.util.ArrayList;

public class Plata extends Virreinatos {
	
	private MateriasPrimas recoleccionPlata;
	private MateriasPrimas recoleccionTabaco;
	private MateriasPrimas recoleccionCafe;
	private Alimentos recoleccionPatata;
	
	public Plata(String nombre, double pib, String continente, ArrayList<Flota> flota, int poblacion,
			String responsable, ArrayList<Mercancia> imporatacion, ArrayList<Mercancia> exportacion, double dinero,boolean sublevaciones, 
			int peru,int plata,int castilla,int granada,int nuevaEspaña, MateriasPrimas recoleccionPlata, MateriasPrimas recoleccionTabaco, 
			MateriasPrimas recoleccionCafe, Alimentos recoleccionPatata) {
		super(nombre, pib, continente, flota, poblacion, responsable, imporatacion, exportacion, dinero, sublevaciones, peru, plata, castilla, granada, nuevaEspaña);
		this.recoleccionPlata = recoleccionPlata;
		this.recoleccionTabaco = recoleccionTabaco;
		this.recoleccionCafe = recoleccionCafe;
		this.recoleccionPatata = recoleccionPatata;
	}
	
	public Plata(Plata plata) {
		super(plata);
		this.recoleccionPlata = plata.getRecoleccionPlata();
		this.recoleccionTabaco = plata.getRecoleccionTabaco();
		this.recoleccionCafe = plata.getRecoleccionCafe();
		this.recoleccionPatata = plata.getRecoleccionPatata();
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
	
	

}
