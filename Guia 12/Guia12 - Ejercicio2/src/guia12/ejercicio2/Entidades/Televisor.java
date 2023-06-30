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
public final class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, double precio, String color, char consEnerg, double peso) {
        super(precio, color, consEnerg, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("Ingrese resolucion en pulgadas: ");
        resolucion = sc.nextInt();
        System.out.println("El televisor cuenta con sintonizador TDT? (S/N)");
        String resp = sc.next();
        if (resp.equalsIgnoreCase("N")) {
            sintonizador = false;
        }

    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precio;
        if (resolucion > 40) {
            precioFinal = precioFinal * 1.3;
        }
        if (sintonizador) {
            precioFinal += 500;
        }

        return precioFinal;
    }
}


