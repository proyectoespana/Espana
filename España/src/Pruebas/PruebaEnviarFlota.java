package Pruebas;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Clases.Alimentos;
import Clases.Austria;
import Clases.Flota;
import Clases.Mercancia;
import Clases.ProductoNombre;
import Clases.Reinos;
import Main.ReinoCompleto;

public class PruebaEnviarFlota {

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

		espana.enviarFlota(espana.getAragon(), espana.getAustria());
	}

	@Test
	public void testEnviarFlota() throws Exception {
		Austria austria;
		/**
		 * Creamos Austria independiente de la clase ReinoTotal
		 */
		austria = new Austria("Austria", "Europa", 100, "Austria");

		/**
		 * Creamos una Mercancia similar a la que hemos importado en el "BeforeClase"
		 */
		mercancia= new Mercancia("Mercancia Arroz", "Aragon");

		/**
		 * Creamos el contenido interno de la mercancia similar a del "BeforeClase"
		 */
		Alimentos alimento2=new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "Cereal", 0);
		/**
		 * Creamos la cantidad que vamos a transportar dicho dicha producto similar a al "BeforeClase" 
		 */
		alimento2.setCantidad(500);
		/**
		 * Añadimos el Producto a la Mercancia
		 */
		mercancia.añadirProducto(alimento2);

		/**
		 * Directamente lo metemos la la lista de Impotacinoes del Reino de Austria para comprobar si ambas listas son similares
		 */
		austria.getImportacionMercancia().put(1, mercancia);

		/**
		 * Comparamos ambas listas
		 */
		assertEquals(espana.getAustria().getImportacionMercancia(), austria.getImportacionMercancia());
	}



	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testEnviarFlotaExcepcionNoDisponible() throws Exception {
		/**
		 * Probamos reintentar enviar la flota de Aragon a otro lugar
		 * Saltara una excepcion dado que la flota no esta disponible porque
		 * en el "BeforeClass" hemos establecido que fuese a Austria, y hasta que esta
		 * no vuelva a su puerto no podra zarpar de nuevo
		 */
		espana.enviarFlota(espana.getAragon(), espana.getBorgoña());

	}

}
