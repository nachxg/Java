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

package Servicios;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysServicios {
    
    public void inicializarA(double[] a) {
    
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.round(Math.random() * 100);
        }
             
    }
        
    public void mostrar(double[] a) {
         
        for (int i = 0; i < a.length; i++) {
           System.out.println("[" + a[i] + "]");
        }

    }
   
    public void ordenar(double[] a) {
        
        Double[] b = Arrays.stream(a).boxed().toArray(Double[]::new);
        Arrays.sort(a);
        System.out.println("Mayor a menor: " + Arrays.toString(a));
        Arrays.sort(b, Comparator.reverseOrder());
        System.out.println("Menor a mayor: " + Arrays.toString(b));
    }
    
    public void inicializarB(double[] A, double[] B) {
        System.arraycopy(A, 0, B, 0, 10);
        Arrays.fill(B, 10, B.length, 0.5);
        mostrar(B);
    }

}
