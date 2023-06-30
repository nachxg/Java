/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejercicio2;

import guia12.ejercicio2.Entidades.Lavadora;
import guia12.ejercicio2.Entidades.Televisor;

/**
 *
 * @author PC-Leonardo
 */
public class Guia12Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lavadora l1 = new Lavadora (45, 100000,"negro",'Z',50);
        
        
        Lavadora l3 = new Lavadora();
        l3.crearLavadora();
        
        //l1.setConsEnerg(l1.comprobarConsEnergetico(l1.getConsEnerg()));
        Lavadora l2 = new Lavadora (10, 100000,"negro",'G',70);
        
        Televisor t1 = new Televisor(55,true,230000, "negro",'B',10);
        Televisor t2 = new Televisor(24,true,80000, "negro",'B',5);
        Televisor t3 = new Televisor(24,false,80000, "negro",'B',5);
        
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
        
    }
    
}
