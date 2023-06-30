//Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B 
//de 20 números reales. Crear la clase ArregloService, en el paquete servicio, con 
//los siguientes métodos:
//Método inicializarA recibe un arreglo por parámetro y lo inicializa con números
//aleatorios.
//Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
//Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
//Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
//Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
//En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, 
//mostrar A y B.


package ej.pkg3.arrays;
import java.util.Arrays;
import java.util.Collections;
import Servicios.ArraysServicios;
public class Ej3Arrays {

    public static void main(String[] args) {

        double[] a = new double[50];
        double[] b = new double[20];
        
        ArraysServicios as = new ArraysServicios();
        
        as.inicializarA(a);
        as.mostrar(a);
        as.ordenar(a);
        as.inicializarB(a,b);
        
    }
    
}
