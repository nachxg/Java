/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inegr1.Servicios;

import inegr1.Entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class EstudianteService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarDatos (Estudiante [] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=new Estudiante();
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el nombre del " + (i+1)+ "° alumno");
            vector[i].setNombre(leer.next());
            
            System.out.println("Ingrese la nota promedio del " + (i+1) +"° alumno");
            vector[i].setNota(leer.nextDouble());
        }
    }
    
    public double calcularPromedio(Estudiante[] vector){
        double prom=0;
        for (int i = 0; i < vector.length; i++) {
            prom += vector[i].getNota();
        }
        return prom/vector.length;
    }
    
    public String[] mayorAlPromedio(Estudiante[] vector, double prom){
        int cont=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getNota()>prom) {
                cont++;
            }
        }
                
        String[] nombres = new String[cont];
        int cont2=0;
        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i].getNota()>prom) {
                nombres[cont2]=vector[i].getNombre();
                cont2++;
            }
        }
        
        return nombres;
    }
    public void leerArreglo (String[] vector){
         System.out.println("Los alumnos con notas superiores al promedio son: ");
        for (String nombre : vector) {
            System.out.println(nombre);
        }
    }
}
