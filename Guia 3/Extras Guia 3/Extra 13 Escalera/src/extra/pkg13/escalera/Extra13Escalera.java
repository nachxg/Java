//Crear un programa que dibuje una escalera de números, donde cada línea de 
//números comience en uno y termine en el número de la línea. Solicitar la altura 
//de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123

package extra.pkg13.escalera;
import java.util.Scanner;
public class Extra13Escalera {

    public static void main(String[] args) {
        
        String ant = "";
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la altura de la escalera: ");
        int n = leer.nextInt();

        for (int i = 1; i < n+1; i++) {
            ant = ant.concat(Integer.toString(i));
            System.out.println(ant);
        } 
    }
}


//////////////////////////// SIN USAR STRING ///////////////////////////////////
//
//public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
//        System.out.print("Ingrese la altura de la escalera: ");
//        int altura = leer.nextInt();
//        for (int i = 1; i <= altura; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}