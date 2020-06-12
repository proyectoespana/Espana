package Pruebas;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Clases.Alimentos;
import Clases.Mercancia;
import Clases.ProductoNombre;
import Clases.Productos;
import Main.ReinoCompleto;

public class PruebaCrearMercancia {

	public static ReinoCompleto espana;
	public static Alimentos alimento;
	public static Mercancia mercancia;

	@BeforeClass
	public static void before() throws Exception {

		espana= new ReinoCompleto();

		alimento=new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "Cereal", 0);

		alimento.setCantidad(1000);

		espana.getAragon().setRecoleccionArroz(alimento);
	}

	/**
	 * Creo una mercancía de Arroz de 500kg de los 1000 que tenemos disponibles.
	 * Creo un objeto mercancía, no relacionado con el reino, 
	 * En el que voy a meter los atributos que debería tener la mercancía que he creado anteriormente en el reino.
	 * @throws Exception envía excepcion si no encuetra el Producto
	 */
	@Test
	public void testCrearMercancia() throws Exception {

//		/**
//		 * Creo una mercancía de Arroz de 500kg de los 1000 que tenemos disponibles
//		 */
		espana.getAragon().crearMercancia(ProductoNombre.Arroz, 500);


//		/**
//		 * Creo un objeto mercancía, no relacionado con el reino, 
//		 * En el que voy a meter los atributos que debería tener la mercancía que he creado anteriormente en el reino.
//		 */
		mercancia= new Mercancia("Mercancia Arroz", "Aragon");

		Alimentos alimento2=new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "Cereal", 0);

		alimento2.setCantidad(500);

		mercancia.añadirProducto(alimento2);

		assertEquals(espana.getAragon().getMercancia().get(1), mercancia);

	}

	/**
	 * Creo una mercancia de Arroz, de 1500kg de los 1000, que tenemos disponibles
	 * Por lo tanto, saltará una excepción no permitiendo que se realice la operación
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testCrearMercanciaExcepcion() throws Exception {

		
		espana.getAragon().crearMercancia(ProductoNombre.Arroz, 1500);

	}

}
