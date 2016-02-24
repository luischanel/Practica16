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
public class Publicacion {
    protected String titulo;
    protected int precio;
    
    public void mostrar(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Precio: "+precio);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
