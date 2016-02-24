/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica16;

/**
 *
 * @author Usuario
 */
public class Libro extends Publicacion {
    protected int numpaginas;
    protected int apublicacion;
    protected int precio0;
    
    public void mostrar0(){
        System.out.println("Número de páginas: "+numpaginas);
        System.out.println("Año de publicacion: "+apublicacion);
        System.out.println("Precio: "+precio0);
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    public int getApublicacion() {
        return apublicacion;
    }

    public void setApublicacion(int apublicacion) {
        this.apublicacion = apublicacion;
    }

    public int getPrecio0() {
        return precio0;
    }

    public void setPrecio0(int precio0) {
        this.precio0 = precio0;
    }
    
    
}
