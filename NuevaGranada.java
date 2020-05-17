import java.util.ArrayList;

public class NuevaGranada extends Virreinatos {
	
	private MateriasPrimas recoleccionOro;
	private MateriasPrimas recoleccionPlata;
	private MateriasPrimas recoleccionTabaco;
	private MateriasPrimas recoleccionCafe;
	
	public NuevaGranada(String nombre, double pib, String continente, ArrayList<Flota> flota, int poblacion,
			String responsable, ArrayList<Mercancia> imporatacion, ArrayList<Mercancia> exportacion, double dinero,boolean sublevaciones, 
			int peru,int plata,int castilla,int granada,int nuevaEspaña, MateriasPrimas recoleccionOro, MateriasPrimas recoleccionPlata, 
			MateriasPrimas recoleccionTabaco, MateriasPrimas recoleccionCafe) {
		super(nombre, pib, continente, flota, poblacion, responsable, imporatacion, exportacion, dinero, sublevaciones, peru, plata, castilla, granada, nuevaEspaña);
		this.recoleccionOro = recoleccionOro;
		this.recoleccionPlata = recoleccionPlata;
		this.recoleccionTabaco = recoleccionTabaco;
		this.recoleccionCafe = recoleccionCafe;
	}
	
	public NuevaGranada(NuevaGranada nuevaGranada) {
		super(nuevaGranada);
		this.recoleccionOro = nuevaGranada.getRecoleccionOro();
		this.recoleccionPlata = nuevaGranada.getRecoleccionPlata();
		this.recoleccionTabaco = nuevaGranada.getRecoleccionTabaco();
		this.recoleccionCafe = nuevaGranada.getRecoleccionCafe();
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
	
	

}