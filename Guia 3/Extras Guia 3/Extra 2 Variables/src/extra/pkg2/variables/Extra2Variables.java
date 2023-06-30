//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
//diferente a cada una. A continuación, realizar las instrucciones necesarias 
//para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
//tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
//variable. Utilizar sólo una variable auxiliar.

package extra.pkg2.variables;
import java.util.Scanner;
public class Extra2Variables {

    public static void main(String[] args) {
        
        int aux = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor para A: ");
        int a = leer.nextInt();
        System.out.println("Ingrese un valor para B: ");
        int b = leer.nextInt();
        System.out.println("Ingrese un valor para C: ");
        int c = leer.nextInt();
        System.out.println("Ingrese un valor para D: ");
        int d = leer.nextInt();
        
        System.out.println("Valores ingresados: ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        System.out.println(" ");
        
        // A --> D
        // B --> C
        // C --> A
        // D --> B
        
        aux = a;
        a = d;
        d = b;
        b = c;
        c = aux;
        
        System.out.println("Nuevos valores: ");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        System.out.println(" ");
      
    }
    
}
