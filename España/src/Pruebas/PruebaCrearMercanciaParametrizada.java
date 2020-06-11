package Pruebas;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Clases.Alimentos;
import Clases.Mercancia;
import Clases.ProductoNombre;
import Main.ReinoCompleto;

@RunWith(Parameterized.class)
public class PruebaCrearMercanciaParametrizada {
	
	private ReinoCompleto espana;
	private Alimentos alimento;
	private ProductoNombre nombre;
	private Mercancia mercancia;
	private int cantidad;
	
	/**
	 * Busco comprobar si dos mercancias son similares, una cre�ndola con el m�todo de "crearMercancia" y otra cre�ndola de forma artificial
	 * @param nombr par�metro encargado de meter el nombre del producto
	 * @param cantida par�metro encargado de meter la cantidad de producto del que se va crear una mercanc�a
	 * @param mercan par�metro encargado de meter la mercanc�a resultante para compararla con la generada
	 * @throws Exception
	 */
	public PruebaCrearMercanciaParametrizada(ProductoNombre nombr,int cantida,Mercancia mercan) throws Exception {
		nombre=nombr;
		cantidad=cantida;
		mercancia=mercan;
		espana= new ReinoCompleto();
		espana.getAragon().getRecoleccionArroz().setCantidad(1000);
		espana.getAragon().getRecoleccionMaiz().setCantidad(1000);
		espana.getAragon().getRecoleccionTrigo().setCantidad(1000);
		espana.getAragon().getRecoleccionUvas().setCantidad(1000);	
	}
	
	@Parameters
	public static Iterable<Object[]>resul(){
		Mercancia merca =new Mercancia("Mercancia Arroz", "Aragon");
		Alimentos ali=new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "X", 0);
		ali.setCantidad(500);
		merca.a�adirProducto(ali);
		
		Alimentos ali2=new Alimentos(ProductoNombre.Maiz, 0, 0, 0, 0, "X", 0);
		Mercancia merca2 =new Mercancia("Mercancia Maiz", "Aragon");
		ali2.setCantidad(600);
		merca2.a�adirProducto(ali2);
		
		Alimentos ali3=new Alimentos(ProductoNombre.Trigo, 0, 0, 0, 0, "X", 0);
		Mercancia merca3 =new Mercancia("Mercancia Trigo", "Aragon");
		ali3.setCantidad(800);
		merca3.a�adirProducto(ali3);
		return Arrays.asList(new Object [][] {{ProductoNombre.Arroz,500,merca},{ProductoNombre.Maiz,600,merca2},{ProductoNombre.Trigo,800,merca3}});
	}
	

	@Test
	public void CrearMercanciaPara() throws Exception {
		
		this.espana.getAragon().crearMercancia(this.nombre, this.cantidad);
		
		assertEquals(espana.getAragon().getMercancia().get(1), mercancia);
	}

}
