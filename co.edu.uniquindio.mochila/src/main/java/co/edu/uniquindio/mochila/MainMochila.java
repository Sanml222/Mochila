package co.edu.uniquindio.mochila;

import co.edu.uniquindio.mochila.Clases.Elemento;
import co.edu.uniquindio.mochila.Clases.Mochila;

public class MainMochila {
    public static void main(String[] args) {

        Mochila mochila = new Mochila(50, 5);


        Elemento e1 = new Elemento("Cuaderno", 2, 60);
        Elemento e2 = new Elemento("Computador", 80, 80);
        Elemento e3 = new Elemento("termo", 4, 70);
        Elemento e4 = new Elemento("Balon", 4, 70);
        Elemento e5 = new Elemento("Cartuchera", 8, 80);


        mochila.addElemento(e1);
        mochila.addElemento(e2);
        mochila.addElemento(e3);
        mochila.addElemento(e4);
        mochila.addElemento(e5);


        System.out.println("Contenido de la mochila:");
        System.out.println(mochila);


        mochila.eliminarElemento(e2);
        System.out.println("Después de eliminar el segundo elemento:");
        System.out.println(mochila);


        mochila.clear();
        System.out.println("Después de vaciar la mochila:");
        System.out.println(mochila);
    }
}