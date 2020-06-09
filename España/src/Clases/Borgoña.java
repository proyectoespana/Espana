package Clases;

import java.util.Random;

import BaseDeDatos.IntroducirDatos;

/**
 * Clase hija de Europa
 * @author Grupo
 *
 */
public class Borgoña extends Europa{

        private MateriasPrimas recoleccionHierro;
        private Alimentos recoleccionArroz;
        private Alimentos recoleccionTomates;
        private Alimentos recoleccionPatatas;

        /**
         * Constructor donde se pasarán por parametros los atributos anteriores
         * @param nombre Informa sobre el nombre
         * @param continente Informa sobre el continente que se encuentra
         * @param poblacion Informa sobre la cantidad de poblacion que vive en el reino
         * @param territorio
         * @param hierro Se introduce el objeto determinado que es
         * @param arroz Se introduce el objeto determinado que es
         * @throws Exception
         */
        public Borgoña(String nombre,String continente,int poblacion,String territorio) throws Exception {
            super(nombre,continente, poblacion ,territorio, 1566, 1147, 0, 1776, 9210,8186,10134,12248);
            this.recoleccionHierro= new MateriasPrimas(ProductoNombre.Hierro, 0, 0, 0, 0, 0, 10);
            calcularProduccionMensual(this.recoleccionHierro);
            this.recoleccionArroz= new Alimentos(ProductoNombre.Arroz, 0, 0, 0, 0, "Gramíneas", 0);
            calcularProduccionMensual(this.recoleccionArroz);
            this.recoleccionTomates= new Alimentos(ProductoNombre.Tomate, 0, 0, 0, 0, "Fruta ", 0);
            calcularProduccionMensual(recoleccionTomates);
            this.recoleccionPatatas= new Alimentos(ProductoNombre.Patata, 0, 0, 0, 0, "Tubérculo ", 0);
            calcularProduccionMensual(recoleccionPatatas);
            this.calcularProductosDemandados();
        }

        public Borgoña(Borgoña a) {
            super(a);
            this.recoleccionArroz=a.getRecoleccionArroz();
            this.recoleccionHierro=a.getRecoleccionHierro();
            this.recoleccionTomates=a.getRecoleccionTomates();
            this.recoleccionPatatas=a.getRecoleccionPatatas();
        }

        /**
         * El usuario procede a crear mercancias de los productos  recolectados
         * @param producto nombre del producto
         * @param cantidad cantidad del producto
         */
    	public void crearMercancia(ProductoNombre producto,int cantidad)throws Exception {
    		Mercancia mercancia;
    		Productos newProduct;

    		switch (producto) {
    		case Hierro:
    			if(this.recoleccionHierro.getCantidad()>=cantidad) {

    				this.recoleccionHierro.setCantidad(this.recoleccionHierro.getCantidad()-cantidad);
    				newProduct= new MateriasPrimas(recoleccionHierro);
    				newProduct.setCantidad(cantidad);
    				mercancia= new Mercancia("Hierro",this.getNombre());
    				mercancia.añadirProducto(newProduct);
    				this.getMercancia().put(this.getIdMercancias(), mercancia);	
    				this.setIdMercancias(this.getIdMercancias()+1);
    			}else {
    				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
    			}
    			break;
    		case Arroz:
    			if(this.recoleccionArroz.getCantidad()>=cantidad) {

    				this.recoleccionArroz.setCantidad(this.recoleccionArroz.getCantidad()-cantidad);
    				newProduct= new Alimentos(recoleccionArroz);
    				newProduct.setCantidad(cantidad);
    				mercancia= new Mercancia("Arroz",this.getNombre());
    				mercancia.añadirProducto(newProduct);
    				this.getMercancia().put(this.getIdMercancias(), mercancia);	
    				this.setIdMercancias(this.getIdMercancias()+1);
    			}else {
    				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
    			}
    			break;
    		case Tomate:

    			if(this.recoleccionTomates.getCantidad()>=cantidad) {

    				this.recoleccionTomates.setCantidad(this.recoleccionTomates.getCantidad()-cantidad);
    				newProduct= new Alimentos(recoleccionTomates);
    				newProduct.setCantidad(cantidad);
    				mercancia= new Mercancia("Tomate",this.getNombre());
    				mercancia.añadirProducto(newProduct);
    				this.getMercancia().put(this.getIdMercancias(), mercancia);	
    				this.setIdMercancias(this.getIdMercancias()+1);
    			}else {
    				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
    			}
    			break;
    		case Patata:

    			if(this.recoleccionPatatas.getCantidad()>=cantidad) {

    				this.recoleccionPatatas.setCantidad(this.recoleccionPatatas.getCantidad()-cantidad);
    				newProduct= new Alimentos(recoleccionPatatas);
    				newProduct.setCantidad(cantidad);
    				mercancia= new Mercancia("Patata",this.getNombre());
    				mercancia.añadirProducto(newProduct);
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
    	
    	/**
    	 * Metodo encargado de calcular cuales de los producotos que no producen van a demandar
    	 */
    	private void calcularProductosDemandados() {
    		int valor;
    		ProductoNombre productoNombre;
    		
    		for(int i=0;i<this.getProductosDemandados().length;i++) {
    			do {
    				valor = new Random().nextInt(ProductoNombre.values().length);
    				productoNombre=ProductoNombre.values()[valor];
    			}while(productoNombre==ProductoNombre.Hierro || productoNombre==ProductoNombre.Arroz|| productoNombre==ProductoNombre.Patata);			
    			this.getProductosDemandados()[i]=productoNombre;
    		}	
    	}
               
    	/**
         * Método que devuelve la produccion mensual obtenida de los productos
         * @return
         */
    	public String  verproduccionMensual() {
    		return super.verproduccionMensual()+"Produccion de : "+this.recoleccionHierro.toString() + "/ Produccion de de : "+ this.recoleccionArroz.toString()+ "/ Produccion de de : "+ this.recoleccionPatatas.toString()+ "/ Produccion de de : "+ this.recoleccionTomates.toString();
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

		public Alimentos getRecoleccionTomates() {
			return recoleccionTomates;
		}

		public void setRecoleccionTomates(Alimentos recoleccionTomates) {
			this.recoleccionTomates = recoleccionTomates;
		}

		public Alimentos getRecoleccionPatatas() {
			return recoleccionPatatas;
		}

		public void setRecoleccionPatatas(Alimentos recoleccionPatatas) {
			this.recoleccionPatatas = recoleccionPatatas;
		}

		@Override
		public String toString() {
			return super.toString();
		}
    
        

}
