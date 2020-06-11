package Pruebas;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Clases.Alimentos;
import Clases.Flota;
import Clases.Mercancia;
import Clases.ProductoNombre;
import Main.ReinoCompleto;

@RunWith(Parameterized.class)
public class PruebaMeterMercanciaParametrizada {
	private ReinoCompleto espana;
	private Alimentos alimento;
	private ProductoNombre nombre;
	private Flota flot;
	private int cantidad;

	/**
	 * Busco comprobar si dos flotas(con mercanc�as) son similares, una cre�ndola con el m�todo de "a�adirMercancia" de Flota y otra cre�ndola de forma artificial
	 * @param nombr par�metro encargado de meter el nombre del producto
	 * @param cantida par�metro encargado de meter la cantidad de producto del que se va crear una mercanc�a
	 * @param Flota par�metro encargado de meter la flota resultante para compararla con la generada
	 * @throws Exception
	 */
	public PruebaMeterMercanciaParametrizada(ProductoNombre nombr,int cantida,Flota flota) throws Exception {
		nombre=nombr;
		cantidad=cantida;
		flot=flota;
		espana= new ReinoCompleto();
		espana.getAragon().getRecoleccionArroz().setCantidad(1000);
		espana.getAragon().getRecoleccionMaiz().setCantidad(1000);
		espana.getAragon().getRecoleccionTrigo().setCantidad(1000);
		espana.getAragon().getRecoleccionUvas().setCantidad(1000);	
	}

	@Parameters
	public static Iterable<Object[]>resul() throws Exception{
		Flota flota = new Flota("Flota Aragon");
		Mercancia merca =new Mercancia("Mercancia Arroz", "Aragon");
		Alimentos ali=new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "X", 0);
		ali.setCantidad(500);
		merca.a�adirProducto(ali);
		flota.a�adirMercancia(merca);

		Flota flota2 = new Flota("Flota Aragon");
		Mercancia merca2 =new Mercancia("Mercancia Maiz", "Aragon");
		Alimentos ali2=new Alimentos(ProductoNombre.Maiz, 0, 0, 0, 0, "X", 0);
		ali2.setCantidad(600);
		merca2.a�adirProducto(ali2);
		flota2.a�adirMercancia(merca2);

		Flota flota3 = new Flota("Flota Aragon");
		Mercancia merca3 =new Mercancia("Mercancia Trigo", "Aragon");
		Alimentos ali3=new Alimentos(ProductoNombre.Trigo, 0, 0, 0, 0, "X", 0);
		ali3.setCantidad(800);
		merca3.a�adirProducto(ali3);
		flota3.a�adirMercancia(merca3);
		return Arrays.asList(new Object [][] {{ProductoNombre.Arroz,500,flota},{ProductoNombre.Maiz,600,flota2},{ProductoNombre.Trigo,800,flota3}});
	}


	@Test
	public void CrearMercanciaPara() throws Exception {

		this.espana.getAragon().crearMercancia(this.nombre, this.cantidad);

		this.espana.getAragon().getFlota().a�adirMercancia(this.espana.getAragon().getMercancia().get(1));

		assertEquals(espana.getAragon().getFlota(), flot);
	}

}
