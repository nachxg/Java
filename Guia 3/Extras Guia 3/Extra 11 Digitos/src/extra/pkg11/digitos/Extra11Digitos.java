//Escribir un programa que lea un número entero y devuelva el número de dígitos 
//que componen ese número. Por ejemplo, si introducimos el número 12345, el 
//programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
//utilizando el operador de división. Nota: recordar que las variables de tipo 
//entero truncan los números o resultados.

package extra.pkg11.digitos;
import java.util.Scanner;
public class Extra11Digitos {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int digitos = 0,num;
        
        System.out.println("Ingrese un número entero: ");
        num = leer.nextInt();

///////////////////////// Alternativa con do-while: ////////////////////////////       
//        do {
//            num = num/10;
//            digitos++;
//        } while (num > 0);
////////////////////////////////////////////////////////////////////////////////

        for (int i = num; i > 0; digitos++) {
            i = i/10;
        }
        
        System.out.println("El número ingresado tiene " + digitos + " dígitos.");
        
    }
    
}
