package Clases;
import java.util.HashMap;

public class Borgoña extends Europa{

        private MateriasPrimas recoleccionHierro;
        private Alimentos recoleccionArroz;



        public Borgoña(String nombre,String continente, HashMap<Integer,Flota> flota,int poblacion,double dinero,String territorio,MateriasPrimas hierro,Alimentos arroz) throws Exception {
            super(nombre,continente, flota, poblacion, dinero ,territorio, 1566, 1147, 0, 1776, 9210);
            this.recoleccionHierro=hierro;
            calcularProduccionMensual(hierro);
            this.recoleccionArroz=arroz;
            calcularProduccionMensual(arroz);
        }

        public Borgoña(Borgoña a) {
            super(a);
            this.recoleccionArroz=a.getRecoleccionArroz();
            this.recoleccionHierro=a.getRecoleccionHierro();
        }
        
        public void crearMercancia(ProductoNombre producto,int cantidad,int idMercancia) throws Exception {
    		Productos newProduct;

    		switch (producto) {
    		case Hierro:
    			if(this.recoleccionHierro.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
    				this.recoleccionHierro.setCantidad(this.recoleccionHierro.getCantidad()-cantidad);

    				newProduct= new MateriasPrimas(recoleccionHierro);

    				newProduct.setCantidad(cantidad);

    				this.getMercancia().get(idMercancia).añadirProducto(newProduct);
    			}else {
    				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto+" o ninguna mercancia con ese id ");
    			}
    			break;
    		case Arroz:
    			if(this.recoleccionArroz.getCantidad()>cantidad && this.getMercancia().containsKey(idMercancia)) {
    				this.recoleccionArroz.setCantidad(this.recoleccionArroz.getCantidad()-cantidad);

    				newProduct= new Alimentos(recoleccionArroz);

    				newProduct.setCantidad(cantidad);

    				this.getMercancia().get(idMercancia).añadirProducto(newProduct);
    			}else {
    				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto+" o ninguna mercancia con ese id ");
    			}
    			break;
    		default:
    			throw new IllegalArgumentException("Este reino no produce " + producto);
    		}
    	}

    	public void crearMercancia(ProductoNombre producto,int cantidad,String nombre,int totalkg)throws Exception {
    		Mercancia mercancia;
    		Productos newProduct;

    		switch (producto) {
    		case Hierro:
    			if(this.recoleccionHierro.getCantidad()>cantidad) {

    				this.recoleccionHierro.setCantidad(this.recoleccionHierro.getCantidad()-cantidad);
    				newProduct= new MateriasPrimas(recoleccionHierro);
    				newProduct.setCantidad(cantidad);
    				mercancia= new Mercancia(nombre, totalkg);
    				mercancia.añadirProducto(newProduct);
    				this.getMercancia().put(this.getMercancia().size(), mercancia);	
    			}else {
    				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
    			}
    			break;
    		case Arroz:
    			if(this.recoleccionArroz.getCantidad()>cantidad) {

    				this.recoleccionArroz.setCantidad(this.recoleccionArroz.getCantidad()-cantidad);
    				newProduct= new Alimentos(recoleccionArroz);
    				newProduct.setCantidad(cantidad);
    				mercancia= new Mercancia(nombre, totalkg);
    				mercancia.añadirProducto(newProduct);
    				this.getMercancia().put(this.getMercancia().size(), mercancia);	
    			}else {
    				throw new IllegalArgumentException(this.getNombre()+" no tiene " + cantidad+" kg de "+producto);
    			}
    			break;
    		default:
    			throw new IllegalArgumentException("Este reino no produce " + producto);
    		}

    	}
               
    	public String  verproduccionMensual() {
    		return "Produccion de : "+this.recoleccionHierro.toString() + "/ Produccion de de : "+ this.recoleccionArroz.toString();
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
