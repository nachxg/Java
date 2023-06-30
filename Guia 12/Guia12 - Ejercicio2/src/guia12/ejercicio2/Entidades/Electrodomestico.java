/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12.ejercicio2.Entidades;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC-Leonardo
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consEnerg;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consEnerg, double peso) {
        this.precio = precio;
        this.color = color;
        this.consEnerg = consEnerg;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsEnerg() {
        return consEnerg;
    }

    public void setConsEnerg(char consEnerg) {
        this.consEnerg = consEnerg;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + "\ncolor=" + color + "\nconsEnerg=" + consEnerg + "\npeso=" + peso;
    }

    public char comprobarConsEnergetico(char letra) {
        char [] letras = {'A','B','C','D','E','F'};
        char letra1 = Character.toUpperCase(letra);
        System.out.println("hola");
        for (char   aux : letras) {
            if (letra1==(aux)) {
                return aux;
                          
            }
        }
        return 'F';
//        if (letra < 'A' || letra > 'F') {
//
//            consEnerg = 'F';
//
//        }
    }

    public String comprobarColor(String color) {
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};

        for (String colorDisponible : coloresDisponibles) {
            if (color.equalsIgnoreCase(colorDisponible)) {
                return colorDisponible;
            }
        }

        return "blanco";
    }

//    public void crearElectrodomestico(){
//        
//        String precio = JOptionPane.showInputDialog(null, "Ingrese el precio:", "Entrada de datos", JOptionPane.PLAIN_MESSAGE);
//        String color = JOptionPane.showInputDialog(null, "Ingrese el color:", "Entrada de datos", JOptionPane.PLAIN_MESSAGE);
//        String consEnerg = JOptionPane.showInputDialog(null, "Ingrese el consumo energetico:", "Entrada de datos", JOptionPane.PLAIN_MESSAGE);
//        String peso = JOptionPane.showInputDialog(null, "Ingrese el peso:", "Entrada de datos", JOptionPane.PLAIN_MESSAGE);
//        String mensaje = "Información ingresada:\n"
//                + "Precio: " + precio + "\n"
//                + "Color: " + color + "\n"
//                + "Consumo energetico: " + consEnerg + "\n"
//                + "Peso: " + peso;
//
//        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
//        comprobarColor(color);
    //char letra = charAt(consEnerg);
    //comprobarConsEnergetico(letra);
//}
    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Ingrese el precio: ");
        precio = sc.nextDouble();
        System.out.println("Ingrese el color: ");
        color = sc.next();
        color = comprobarColor(color);
        System.out.println("Ingrese el consumo energetico: ");
        consEnerg = sc.next().charAt(0);
        consEnerg=comprobarConsEnergetico(consEnerg);
        System.out.println("Ingrese el peso: ");
        peso = sc.nextDouble();
        
    }

    public double precioFinal() {

        double precioFinal = precio;

        switch (consEnerg) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }
}
