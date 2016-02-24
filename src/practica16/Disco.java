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
public class Disco extends Publicacion{
    protected int duracion;
    protected int precio1;
    

    public void mostrar0(){
        System.out.println("Duración: "+duracion+" minutos");
        System.out.println("Precio: "+precio1);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPrecio1() {
        return precio1;
    }

    public void setPrecio1(int precio1) {
        this.precio1 = precio1;
    }
    
}
