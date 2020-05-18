package Clases;

public class Borgoña extends Europa{

        private MateriasPrimas recoleccionHierro;
        private Alimentos recoleccionArroz;



        public Borgoña(String nombre,String continente,int poblacion,String territorio,MateriasPrimas hierro,Alimentos arroz) throws Exception {
            super(nombre,continente, poblacion ,territorio, 1566, 1147, 0, 1776, 9210);
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

    	public void crearMercancia(ProductoNombre producto,int cantidad)throws Exception {
    		Mercancia mercancia;
    		Productos newProduct;

    		switch (producto) {
    		case Hierro:
    			if(this.recoleccionHierro.getCantidad()>cantidad) {

    				this.recoleccionHierro.setCantidad(this.recoleccionHierro.getCantidad()-cantidad);
    				newProduct= new MateriasPrimas(recoleccionHierro);
    				newProduct.setCantidad(cantidad);
    				mercancia= new Mercancia("Hierro");
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
    				mercancia= new Mercancia("Arroz");
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
