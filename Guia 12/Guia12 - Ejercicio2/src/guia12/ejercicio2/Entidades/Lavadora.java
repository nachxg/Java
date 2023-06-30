/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejercicio2.Entidades;

import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public final class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consEnerg, double peso) {
        super(precio, color, consEnerg, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Ingrese carga de la lavadora: ");
        carga=sc.nextInt();
    }
    
    @Override
    public String toString() {
        return "Lavadora " + "precio=" + precio + "\ncolor=" + comprobarColor(color) + "\nconsEnerg=" + comprobarConsEnergetico(consEnerg) + "\npeso=" + peso;
    }
    
    @Override
    public double precioFinal(){
        double precioFinal = super.precio;
        if (carga>30) {
            precioFinal+=500;            
        } 
        return precioFinal;
    }
    
}
