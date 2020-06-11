package Pruebas;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Clases.Alimentos;
import Clases.Flota;
import Clases.Mercancia;
import Clases.ProductoNombre;
import Main.ReinoCompleto;

public class PruebaMeterMercancia {
	
	public static ReinoCompleto espana;
	public static Alimentos alimento;
	public static Mercancia mercancia;
	
	@BeforeClass
	public static void before() throws Exception {

		espana= new ReinoCompleto();

		alimento=new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "Cereal", 0);

		alimento.setCantidad(1000);

		espana.getAragon().setRecoleccionArroz(alimento);
		
		espana.getAragon().crearMercancia(ProductoNombre.Arroz, 500);
		
		espana.formarFlota(espana.getAragon(), 1);
	}

	@Test
	public void testMeterMercanciaEnFlota() throws Exception {
		
		/**
		 * Creo una Flota aparte del Reino d�ndole los atributos que tendr�a la Flota original
		 */
		//nombre
		Flota barco= new Flota("Flota de Aragon");
		
		/**
		 * Creo la misma mercanc�a que introduzco en el "BeforeClass" pero aparte, como con la Flota
		 */
		mercancia= new Mercancia("Mercancia Arroz", "Aragon");

		/**
		 * Introduzco en la mercanc�a el Producto que voy a exportar
		 */
		Alimentos alimento2=new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "Cereal", 0);

		/**
		 * Introduzo la cantidad de dicho Producto
		 */
		alimento2.setCantidad(500);

		/**
		 * Creo finalmente, la Mercanc�a introduci�ndole el producto que antes hemos creado 
		 */
		mercancia.a�adirProducto(alimento2);
		
		/**
		 * Procedo a meter la Mercanc�a en la Flota
		 */
		barco.a�adirMercancia(mercancia);
		
		/**
		 * Y finalmente, comparo si ambas flotas son similares, teniendo en cuenta que para que sean similares, tiene que tener
		 * el mismo conjunto de mercancias,el peso total de dichas mercancias  y si est�n o no disponibles.
		 */
		assertEquals(espana.getAragon().getFlota(), barco);
	}
	
	
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testMeterMercanciaEnFlotaExcepcion() throws Exception {
		
		/**
		 * Creo una Flota aparte del Reino dandole los atributos que tendria la Flota original
		 */
		//nombre
		Flota barco= new Flota("Flota de Aragon");
		
		/**
		 * Creo la misma mercanc�a que introduzco en el "BeforeClass" pero aparte como con la Flota
		 */
		mercancia= new Mercancia("Mercancia Arroz", "Aragon");

		/**
		 * Introduzco en la mercanc�a el Producto que voy a exportar
		 */
		Alimentos alimento2=new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "Cereal", 0);

		/**
		 * Introduzo la cantidad de dicho Producto en este caso, muy superior a la que el barco puede transportar
		 */
		alimento2.setCantidad(60000);

		/**
		 * Creo finalmente, la Mercanc�a introduci�ndole el producto que antes hemos creado 
		 */
		mercancia.a�adirProducto(alimento2);
		
		/**
		 * Procedo a meter la Mercanc�a en la Flota y por ende, me saltar� una Excepci�n por exceso de capacidad.
		 */
		barco.a�adirMercancia(mercancia);
		
	}

}
