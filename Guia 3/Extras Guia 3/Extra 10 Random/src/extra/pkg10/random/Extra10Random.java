//Realice un programa para que el usuario adivine el resultado de una 
//multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
//El programa debe indicar al usuario si su respuesta es o no correcta. 
//En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su 
//respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la 
//función Math.random() de Java.

package extra.pkg10.random;
import java.util.Scanner;
public class Extra10Random {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num,r1,r2,random;
        
        r1 = (int) Math.floor(Math.random() * 10);
        r2 = (int) Math.floor(Math.random() * 10);
        random = r1 * r2;
        
        System.out.println("El programa genera una multiplicación entre dos números aleatorios entre 0 y 10. Debes intentar adivinarla. (" + r1 + " * " + r2 + " = " + random + ")." );
        System.out.println("Ingresa un número: ");
        num = leer.nextInt();
        
         while (num != random) {
            System.out.println("¡Incorrecto! Vuelve a intentarlo:");
            num = leer.nextInt();
        }
        
        System.out.println("¡Correcto! Adivinaste.");
       
    }
    
}
