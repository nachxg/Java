//Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
//y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
//introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
//programa mostrará por pantalla el número de valores que se han leído, su suma y su
//media (promedio).

package extra.pkg1.integers;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra1Integers {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<Integer> lista = new ArrayList();
        
        int num;
        double suma = 0;
        
        do {
            
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            
            if (num != -99) {
                lista.add(num); 
                suma += num;
            }
             
        } while (num != -99);
        
        System.out.println(lista);
        
        System.out.println("Cantidad de números: " + lista.size());
        System.out.println("Suma de los números: " + suma);
        System.out.println("Promedio de los números: " + suma/lista.size());
        
    }
    
}
