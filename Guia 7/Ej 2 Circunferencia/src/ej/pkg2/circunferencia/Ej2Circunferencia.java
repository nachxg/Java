/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej.pkg2.circunferencia;
import Entidad.Circunferencia;
public class Ej2Circunferencia {

    public static void main(String[] args) {
        
        Circunferencia c1 = new Circunferencia(0);
        
        c1.crearCircunferencia();
        
        System.out.println("El radio ingresado es: " + c1.getRadio());
        System.out.println("El área de la circunferencia es: " + c1.area());
        System.out.println("El perímetro de la circunferencia es: " + c1.perimetro());
    }   
}
