/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica16;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sel, salir=0;
        String lect;
        int aa;
        Libro lb1=new Libro();
        Disco dis=new Disco();
        Scanner lector= new Scanner(System.in);
            System.out.println("Ingrese datos del libro");
            System.out.println("Titulo: ");
            lect=lector.next();
            lb1.setTitulo(lect);
            System.out.println("Numpag: ");
            aa=lector.nextInt();
            lb1.setNumpaginas(aa);
            System.out.println("Apublciacion: ");
            aa=lector.nextInt();
            lb1.setApublicacion(aa);
            System.out.println("Precio: ");
            aa=lector.nextInt();
            lb1.setPrecio0(aa);
            System.out.println("Ingrese datos del Disco");
            System.out.println("Titulo: ");
            lect=lector.next();
            dis.setTitulo(lect);
            System.out.println("Precio: ");
            aa=lector.nextInt();
            dis.setPrecio1(aa);
            System.out.println("Duración: ");
            aa=lector.nextInt();
            dis.setDuracion(aa);
            lb1.setPrecio(lb1.getPrecio0()+dis.getPrecio1());
            lb1.mostrar();
            lb1.mostrar0();
            dis.mostrar();
            dis.mostrar0();
            
            
            
            
            
            
            
        }
    }
    
