package Clases;
import java.util.ArrayList;
import java.util.Random;

import BaseDeDatos.IntroducirDatos;

public class NuevaEspa�a extends Virreinatos {



	private Alimentos recoleccionMaiz;
	private MateriasPrimas recoleccionOro;
	private Alimentos recoleccionTomate;
	private Alimentos recoleccionTrigo;

	/**
	 * 
	 * @param nombre         parametro donde se introduce el nombre del Reino
	 * @param continente	parametro donde se introduce el continente al que pertenece	
	 * @param poblacion		parametro donde se introduce el numero de poblacion de cada Reino
	 * @param maiz			parametro  donde se introduce el tipo de Alimento que produce ese Reino
	 * @param cacao			parametro  donde se introduce el tipo de Alimento que produce ese Reino
	 * @param tomate		parametro  donde se introduce el tipo de Alimento que produce ese Reino
	 * @param oro			parametro  donde se introduce el tipo de Alimento que produce ese Reino
	 * @throws Exception	Excepcion se produce si en el metodo calcularProduccion se introduce un producto que no esta en la lista
	 */
	public NuevaEspa�a(String nombre,String continente, int poblacion) throws Exception {
		super(nombre,continente, poblacion, 4717,7353, 9020, 4290, 0,9483,9210,9978);
		this.recoleccionMaiz= new Alimentos(ProductoNombre.Maiz, 0, 0, 0, 0, "Gram�nea ", 0);
		calcularProduccionMensual(this.recoleccionMaiz);
		this.recoleccionOro=new MateriasPrimas(ProductoNombre.Oro, 0, 0, 0, 0, 0, 10);
		calcularProduccionMensual(this.recoleccionOro);
		this.recoleccionTomate=new  Alimentos(ProductoNombre.Tomate, 0, 0, 0, 0, "fruta", 0);
		calcularProduccionMensual(this.recoleccionTomate);
		this.recoleccionTrigo = new Alimentos(ProductoNombre.Trigo, 0, 0, 0, 0, "semilla", 0);
		calcularProduccionMensual(recoleccionTrigo);
		this.calcularProductosDemandados();
	}

	/**
	 * Constructor de Copia
	 * @param obj
	 */
	public NuevaEspa�a(NuevaEspa�a obj) {
		super(obj);
		this.recoleccionMaiz=obj.getRecoleccionMaiz();
		this.recoleccionOro=obj.getRecoleccionOro();
		this.recoleccionTomate=obj.getRecoleccionTomate();
		this.recoleccionTrigo=obj.getRecoleccionTrigo();
	}

	/**
	 * Mustra el nombre del producto y la cantidad del mismo
	 */
	public String  verproduccionMensual() {
		return super.verproduccionMensual()+"Produccion de : "+this.recoleccionTrigo.toString() + "/ Produccion de de : "+ this.recoleccionOro.toString() + "/ Produccion de de : "+this.recoleccionMaiz.toString() + "/ Produccion de de : "+this.recoleccionTomate.toString();
	}


	/**
	 * El usuario procede a crear mercancias de los productos  recolectados
	 * @param producto
	 * @param cantidad
	 * @throws Exception
	 */
	public void crearMercancia(ProductoNombre producto,int cantidad)throws Exception {
		Mercancia mercancia;
		Productos newProduct;

		switch (producto) {
		case Maiz:
			if(this.recoleccionMaiz.getCantidad()>=cantidad) {

				this.recoleccionMaiz.setCantidad(this.recoleccionMaiz.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionMaiz);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Maiz",this.getNombre());
				mercancia.a�adirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);
				this.setIdMercancias(this.getIdMercancias()+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		case Oro:
			if(this.recoleccionOro.getCantidad()>=cantidad) {

				this.recoleccionOro.setCantidad(this.recoleccionOro.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionOro);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Oro",this.getNombre());
				mercancia.a�adirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(this.getIdMercancias()+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}

			break;
		case Trigo:
			if(this.recoleccionTrigo.getCantidad()>=cantidad) {

				this.recoleccionTrigo.setCantidad(this.recoleccionTrigo.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionTrigo);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Trigo",this.getNombre());
				mercancia.a�adirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(this.getIdMercancias()+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
			//		case Cacao:
			//
			//			if(this.recoleccionCacao.getCantidad()>=cantidad) {
			//
			//				this.recoleccionCacao.setCantidad(this.recoleccionCacao.getCantidad()-cantidad);
			//				newProduct= new Alimentos(recoleccionCacao);
			//				newProduct.setCantidad(cantidad);
			//				mercancia= new Mercancia("Cacao",this.getNombre());
			//				mercancia.a�adirProducto(newProduct);
			//				this.getMercancia().put(this.getIdMercancias(), mercancia);	
			//				this.setIdMercancias(this.getIdMercancias()+1);
			//			}else {
			//				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			//			}
			//			break;
		case Tomate:

			if(this.recoleccionTomate.getCantidad()>=cantidad) {

				this.recoleccionTomate.setCantidad(this.recoleccionTomate.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionTomate);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Tomate",this.getNombre());
				mercancia.a�adirProducto(newProduct);
				this.getMercancia().put(this.getIdMercancias(), mercancia);	
				this.setIdMercancias(this.getIdMercancias()+1);
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		default:
			throw new IllegalArgumentException("Este reino no produce " + producto);
		}

	}



	//	/**
	//	 * Con el id de la Mercancia,se procede a Transportar a un destino determinado
	//	 * @param idMercancia
	//	 * @param destino
	//	 * @throws Exception 
	//	 */
	//	public String formarFlota(int idMercancia) throws Exception {
	//		int pesoDisponibleFlota;
	//
	//		if(this.getFlota().isDisponible()) {
	//
	//			pesoDisponibleFlota=this.getFlota().a�adirMercancia(this.getMercancia().get(idMercancia));
	//			//			this.getMercancia().remove(idMercancia);
	//
	//			return "La flota todavia puede transportar "+pesoDisponibleFlota;
	//
	//		}else {
	//			throw new Exception("La flota no esta disponible ");
	//		}
	//	}
	//
	//	/**
	//	 * Metodo encargado de enviar una flota con mercancias a una determinada zona
	//	 * @param destino
	//	 * @throws Exception 
	//	 */
	//	public void enviarFlota(String destino) throws Exception {
	//		
	//		if(this.getFlota().isDisponible()) {
	//			
	//			switch (destino.toUpperCase()) {
	//			case "PERU":
	//				this.getFlota().enviarMercancias(this.getDistanciaPeru());
	//				break;
	//			case "PLATA":
	//				this.getFlota().enviarMercancias(this.getDistanciaPlata());
	//				break;
	//			case "CASTILLA":
	//				this.getFlota().enviarMercancias(this.getDistanciaCastilla());
	//				break;
	//			case "NUEVA GRANADA":
	//				this.getFlota().enviarMercancias(this.getDistanciaNuevaGranada());
	//				break;
	//			case "NUEVA ESPA�A":
	//				this.getFlota().enviarMercancias(this.getDistanciaNuevaEspa�a());
	//				break;
	//			default:
	//				throw new IllegalArgumentException(destino+" no esta disponible en las rutas de "+this.getNombre());
	//			}
	//		}
	//	}

	/**
	 * Metodo encargado de calcular cuales de los productos que no producen van a demandar
	 */
	private void calcularProductosDemandados() {
		int valor;
		ProductoNombre productoNombre;

		for(int i=0;i<this.getProductosDemandados().length;i++) {
			do {
				valor = new Random().nextInt(ProductoNombre.values().length);
				productoNombre=ProductoNombre.values()[valor];
			}while(productoNombre==ProductoNombre.Maiz || productoNombre==ProductoNombre.Oro || productoNombre==ProductoNombre.Trigo || productoNombre==ProductoNombre.Tomate);			
			this.getProductosDemandados()[i]=productoNombre;
		}	
	}

	//geterSeters


	@Override
	public String toString() {
		return super.toString();
	}

	public Alimentos getRecoleccionMaiz() {
		return recoleccionMaiz;
	}

	public void setRecoleccionMaiz(Alimentos recoleccionMaiz) {
		this.recoleccionMaiz = recoleccionMaiz;
	}

	public MateriasPrimas getRecoleccionOro() {
		return recoleccionOro;
	}

	public void setRecoleccionOro(MateriasPrimas recoleccionOro) {
		this.recoleccionOro = recoleccionOro;
	}

	public Alimentos getRecoleccionTomate() {
		return recoleccionTomate;
	}

	public void setRecoleccionTomate(Alimentos recoleccionTomate) {
		this.recoleccionTomate = recoleccionTomate;
	}

	public Alimentos getRecoleccionTrigo() {
		return recoleccionTrigo;
	}

	public void setRecoleccionTrigo(Alimentos recoleccionTrigo) {
		this.recoleccionTrigo = recoleccionTrigo;
	}

}
