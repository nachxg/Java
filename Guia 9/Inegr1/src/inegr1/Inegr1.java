/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inegr1;

import inegr1.Entidades.Estudiante;
import inegr1.Servicios.EstudianteService;
import java.util.Scanner;

/**
 *
 * @author PC-Leonardo
 */
public class Inegr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Estudiante [] vector = new Estudiante [5];
        EstudianteService es = new EstudianteService();
        
        
        es.cargarDatos(vector);
        double prom = es.calcularPromedio(vector);
        System.out.println("El promedio de notas del curso es: " + prom );
        String [] mejoresAlumnos = es.mayorAlPromedio(vector, prom);
        es.leerArreglo(mejoresAlumnos);
    }
    
}
