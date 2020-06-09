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
		 * Creo una Flota aparte del Reino dandole los atributos que tendria la Flota original
		 */
		//nombre
		Flota barco= new Flota("Flota de Aragon");
		
		/**
		 * Creo la misma mercancia que introduzcon en el "BeforeClass" pero aparte como con la Flota
		 */
		mercancia= new Mercancia("Mercancia Arroz", "Aragon");

		/**
		 * Introduzco en la mercancia el Producto que voy a exportar
		 */
		Alimentos alimento2=new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "Cereal", 0);

		/**
		 * Introduzo la cantidad de dicho Producto
		 */
		alimento2.setCantidad(500);

		/**
		 * Creo finalmente la Mercancia introduciendole el producto que antes hemos creado 
		 */
		mercancia.añadirProducto(alimento2);
		
		/**
		 * Procedo a merter la Mercancia en la Flota
		 */
		barco.añadirMercancia(mercancia);
		
		/**
		 * Y Finalmente comparo si ambas flotas son similares teniendo en cuenta que para que sean similares tiene que tener
		 * el mismo conjunto de mercancias,el peso total de dichas mercancias  y si estas o no disponibles
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
		 * Creo la misma mercancia que introduzcon en el "BeforeClass" pero aparte como con la Flota
		 */
		mercancia= new Mercancia("Mercancia Arroz", "Aragon");

		/**
		 * Introduzco en la mercancia el Producto que voy a exportar
		 */
		Alimentos alimento2=new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "Cereal", 0);

		/**
		 * Introduzo la cantidad de dicho Producto en este caso mucho superior a la que el barco puede transportar
		 */
		alimento2.setCantidad(60000);

		/**
		 * Creo finalmente la Mercancia introduciendole el producto que antes hemos creado 
		 */
		mercancia.añadirProducto(alimento2);
		
		/**
		 * Procedo a merter la Mercancia en la Flota y por ende me saltara una Excepcion por exceso de capacidad
		 */
		barco.añadirMercancia(mercancia);
		
	}

}
