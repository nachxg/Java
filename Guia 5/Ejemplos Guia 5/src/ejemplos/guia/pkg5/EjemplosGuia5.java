//Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de 
//equipo y define su tipo de dato de tal manera que te permita alojar sus nombres 
//más adelante.

package ejemplos.guia.pkg5;
import java.util.Scanner;
public class EjemplosGuia5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String[] Equipo = new String[5];
        
        System.out.println("Ingrese los nombres de los integrantes del equipo: ");
        
        for (int i = 0; i < 5; i++) {
            Equipo[i] = leer.nextLine();
        }
        
        String aux = "";
        for (String elemento: Equipo) {
            System.out.println(elemento);
        }
        
    }
    
}
