package Clases;
import java.util.HashMap;

public class Aragon extends Europa {
	private Alimentos recoleccionTrigo;
	private Alimentos recoleccionUvas;



	public Aragon(String nombre,String continente, HashMap<Integer,Flota> flota,int poblacion,double dinero,String territorio,Alimentos trigo,Alimentos uvas) throws Exception {
		super(nombre,continente, flota, poblacion,dinero,territorio,0, 1778, 1543, 624, 9483);
		this.recoleccionTrigo=trigo;
		calcularProduccionMensual(trigo);
		this.recoleccionUvas=uvas;
		calcularProduccionMensual(uvas);

	}

	public Aragon(Aragon a) {
		super(a);
		this.recoleccionTrigo=a.getRecoleccionTrigo();
		this.recoleccionUvas=a.getRecoleccionUvas();
	}

	public String  verproduccionMensual() {
		return "Produccion de : "+this.recoleccionTrigo.toString() + "/ Produccion de de : "+ this.recoleccionUvas.toString() ;
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

	@Override
	public String toString() {
		return super.toString();
	}



}
