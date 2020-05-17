package Clases;
import java.util.HashMap;

public class Castilla extends Europa {

	private Alimentos recoleccionTrigo;
	private Alimentos recoleccionUvas;
	private MateriasPrimas recoleccionHierro;

	public Castilla(String nombre,String continente,  HashMap<Integer,Flota> flota, int poblacion, double dinero,
			String territorio,Alimentos trigo,Alimentos uva,MateriasPrimas hierro) throws Exception {
		super(nombre,continente, flota, poblacion, dinero,territorio, 621,
				2375, 1784, 0, 9020);
		this.recoleccionTrigo=trigo;
		calcularProduccionMensual(trigo);
		this.recoleccionUvas=uva;
		calcularProduccionMensual(uva);
		this.recoleccionHierro=hierro;
		calcularProduccionMensual(hierro);
	}

	public Castilla(Castilla obj) {
		super(obj);
		this.recoleccionTrigo=obj.getRecoleccionTrigo();
		this.recoleccionUvas=obj.getRecoleccionUvas();
		this.recoleccionHierro=obj.getRecoleccionHierro();
	}

	public String  verproduccionMensual() {
		return "Produccion de : "+this.recoleccionTrigo.toString() + "/ Produccion de de : "+ this.recoleccionUvas.toString() + "/ Produccion de de : "+this.recoleccionHierro.toString();
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

	@Override
	public String toString() {
		return super.toString();
	}	

}
