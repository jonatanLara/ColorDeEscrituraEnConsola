/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colordeescrituraconsola;

import java.awt.Color;
import java.awt.color.ColorSpace;

/**
 *
 * @author jonatanLara
 */
public class ColorDeEscrituraConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\033[30mTexto en Negro");
        System.out.println("\033[31mTexto en Rojo");
        System.out.println("\033[32mTexto en Verde");
        System.out.println("\033[33mTexto en Amarillo");
        System.out.println("\033[34mTexto en Azul");
        System.out.println("\033[35mTexto en Mangeta");
        System.out.println("\033[36mTexto en Cyan");
        System.out.println("\033[37mTexto en Blanco");
    }
    
}
