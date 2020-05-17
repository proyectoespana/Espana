import java.util.ArrayList;

public class Castilla extends Europa {

	private Alimentos recoleccionTrigo;
    private Alimentos recoleccionUvas;
    private MateriasPrimas recoleccionHierro;
	
	public Castilla(String nombre, double pib, String continente, ArrayList<Flota> flota, int poblacion,
			String responsable, ArrayList<Mercancia> imporatacion, ArrayList<Mercancia> exportacion, double dinero,
			boolean sublevaciones,String territorio,boolean guerra, int aragon, int austria, int borgoña, int castilla, int nuevaEspaña,Alimentos trigo,Alimentos uvas,MateriasPrimas hierro) {
		super(nombre, pib, continente, flota, poblacion, responsable, imporatacion, exportacion, dinero, sublevaciones,territorio,guerra, aragon,
				austria, borgoña, castilla, nuevaEspaña);
		this.recoleccionTrigo=trigo;
		this.recoleccionUvas=uvas;
		this.recoleccionHierro=hierro;
	}

	public Castilla(Castilla obj) {
		super(obj);
		this.recoleccionTrigo=obj.getRecoleccionTrigo();
		this.recoleccionUvas=obj.getRecoleccionUvas();
		this.recoleccionHierro=obj.getRecoleccionHierro();
	}

	public Alimentos getRecoleccionTrigo() {
		return recoleccionTrigo;
	}

	public void setRecoleccionTrigo(Alimentos recoleccionTrigo) {
		this.recoleccionTrigo = recoleccionTrigo;
	}

	public Alimentos getRecoleccionUvas() {
		return recoleccionUvas;
	}

	public void setRecoleccionUvas(Alimentos recoleccionUvas) {
		this.recoleccionUvas = recoleccionUvas;
	}

	public MateriasPrimas getRecoleccionHierro() {
		return recoleccionHierro;
	}

	public void setRecoleccionHierro(MateriasPrimas recoleccionHierro) {
		this.recoleccionHierro = recoleccionHierro;
	}
}
