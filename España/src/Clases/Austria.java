package Clases;
import java.util.HashMap;

public class Austria extends Europa {

	private MateriasPrimas recoleccionHierro;
	private Alimentos recoleccionArroz;
	private MateriasPrimas recoleccionAlgodon;



	public Austria(String nombre,String continente, HashMap<Integer,Flota> flota,int poblacion,double dinero,String territorio,MateriasPrimas hierro,MateriasPrimas algodon,Alimentos arroz) {
		super(nombre,continente, flota, poblacion, dinero,territorio,1785, 0, 1147, 2382, 10145);
		this.recoleccionHierro=hierro;
		this.recoleccionArroz=arroz;
		this.recoleccionAlgodon=algodon;
	}

	public Austria(Austria a) {
		super(a);
		this.recoleccionArroz=a.getRecoleccionArroz();
		this.recoleccionHierro=a.getRecoleccionHierro();
		this.recoleccionAlgodon=a.getRecoleccionAlgodon();
	}


	public String  verproduccionMensual() {
		return "Produccion de : "+this.recoleccionHierro.toString() + "/ Produccion de de : "+ this.recoleccionArroz.toString() + "/ Produccion de de : "+this.recoleccionAlgodon.toString();
	}

	public MateriasPrimas getRecoleccionAlgodon() {
		return recoleccionAlgodon;
	}

	public void setRecoleccionAlgodon(MateriasPrimas recoleccionAlgodon) {
		this.recoleccionAlgodon = recoleccionAlgodon;
	}

	public MateriasPrimas getRecoleccionHierro() {
		return recoleccionHierro;
	}

	public void setRecoleccionHierro(MateriasPrimas recoleccionHierro) {
		this.recoleccionHierro = recoleccionHierro;
	}

	public Alimentos getRecoleccionArroz() {
		return recoleccionArroz;
	}

	public void setRecoleccionArroz(Alimentos recoleccionArroz) {
		this.recoleccionArroz = recoleccionArroz;
	}


	@Override
	public String toString() {
		return super.toString();
	}

}