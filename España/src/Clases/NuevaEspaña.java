package Clases;
import java.util.ArrayList;
import java.util.Random;

public class NuevaEspa�a extends Virreinatos {



	private Alimentos recoleccionMaiz;
	private MateriasPrimas recoleccionOro;
	private Alimentos recoleccionCacao;
	private Alimentos recoleccionTomate;

	public NuevaEspa�a(String nombre,String continente, int poblacion,Alimentos maiz,Alimentos cacao,Alimentos tomate,MateriasPrimas oro) throws Exception {
		super(nombre,continente, poblacion, 4717,
				7353, 9020, 4290, 0);
		this.recoleccionMaiz=maiz;
		calcularProduccionMensual(maiz);
		this.recoleccionOro=oro;
		calcularProduccionMensual(oro);
		this.recoleccionCacao=cacao;
		calcularProduccionMensual(cacao);
		this.recoleccionTomate=tomate;
		calcularProduccionMensual(tomate);

		//meter los calualar produccion de los productos
	}

	public NuevaEspa�a(NuevaEspa�a obj) {
		super(obj);
		this.recoleccionMaiz=obj.getRecoleccionMaiz();
		this.recoleccionOro=obj.getRecoleccionOro();
		this.recoleccionCacao=obj.getRecoleccionCacao();
		this.recoleccionTomate=obj.getRecoleccionTomate();
	}

	/**
	 * Mustra el nombre del producto y la cantidad del mismo
	 */
	public String  verproduccionMensual() {
		return "Produccion de : "+this.recoleccionMaiz.toString() + "/ Produccion de de : "+ this.recoleccionOro.toString() + "/ Produccion de de : "+this.recoleccionCacao.toString() + "/ Produccion de de : "+this.recoleccionTomate.toString();
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
			if(this.recoleccionMaiz.getCantidad()>cantidad) {

				this.recoleccionMaiz.setCantidad(this.recoleccionMaiz.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionMaiz);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Maiz");
				mercancia.a�adirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		case Oro:
			if(this.recoleccionOro.getCantidad()>cantidad) {

				this.recoleccionOro.setCantidad(this.recoleccionOro.getCantidad()-cantidad);
				newProduct= new MateriasPrimas(recoleccionOro);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Oro");
				mercancia.a�adirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}

			break;
		case Cacao:

			if(this.recoleccionCacao.getCantidad()>cantidad) {

				this.recoleccionCacao.setCantidad(this.recoleccionCacao.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionCacao);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Cacao");
				mercancia.a�adirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		case Tomate:

			if(this.recoleccionTomate.getCantidad()>cantidad) {

				this.recoleccionTomate.setCantidad(this.recoleccionTomate.getCantidad()-cantidad);
				newProduct= new Alimentos(recoleccionTomate);
				newProduct.setCantidad(cantidad);
				mercancia= new Mercancia("Tomate");
				mercancia.a�adirProducto(newProduct);
				this.getMercancia().put(this.getMercancia().size(), mercancia);	
			}else {
				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
			}
			break;
		default:
			throw new IllegalArgumentException("Este reino no produce " + producto);
		}

	}
	

	
	/**
	 * Con el id de la Mercancia,se procede a Transportar a un destino determinado
	 * @param idMercancia
	 * @param destino
	 * @throws Exception 
	 */
	public String formarFlota(int idMercancia) throws Exception {
		int pesoDisponibleFlota;
		
		pesoDisponibleFlota=this.getFlota().a�adirMercancia(this.getMercancia().get(idMercancia));
//		this.getMercancia().remove(idMercancia);
		
		return "La flota todavia puede transportar "+pesoDisponibleFlota;
	}
	
	public void enviarFlota(String destino) {
		
	}
	
	//geterSeters
	
	public Alimentos getRecoleccionMaiz() {
		return recoleccionMaiz;
	}

	public void verProduccion() {

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

	public Alimentos getRecoleccionCacao() {
		return recoleccionCacao;
	}

	public void setRecoleccionCacao(Alimentos recoleccionCacao) {
		this.recoleccionCacao = recoleccionCacao;
	}

	public Alimentos getRecoleccionTomate() {
		return recoleccionTomate;
	}

	public void setRecoleccionTomate(Alimentos recoleccionTomate) {
		this.recoleccionTomate = recoleccionTomate;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
