/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg4.rectangulo;
import Entidad.Rectangulo;
public class Ej4Rectangulo {

    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo(0,0);
        r1.crearRectangulo();
        System.out.println("La superficie del rectángulo es: " + r1.superficie() + " m2.");
        System.out.println("El perímetro del rectángulo es: " + r1.perimetro() + " m.");
        r1.dibujar();
    }
    
}
