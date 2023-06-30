//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M 
//cantidad de hijos. Escriba un programa que pida la cantidad de familias y para 
//cada familia la cantidad de hijos para averiguar la media de edad de los hijos 
//de todas las familias.

package extra.pkg14.familias;
import java.util.Scanner;
public class Extra14Familias {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int canthijos = 0, cantedad = 0;
        System.out.println("Ingrese la cantidad de familias: ");
        int flias = leer.nextInt();
        
        for (int i = 0; i < flias; i++) {
            System.out.println("Para la familia Nº " + (i+1) + ", ingrese la cantidad de hijos: ");
            int hijos = leer.nextInt();
            canthijos += hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo Nº " + (j+1));
                int edad = leer.nextInt();
                cantedad += edad;
            }
        }
        
        System.out.println("La media de edad de todos los hijos de todas las familias es de " + (cantedad / canthijos) + " años.");
        
    }
    
}
