//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
//el promedio de n números (n>0). El valor de n se solicitará al principio del 
//programa y los números serán introducidos por el usuario. Realice dos versiones 
//del programa, una usando el bucle “while” y otra con el bucle “do - while”.

package extra.pkg7.minmaxprom;
import java.util.Scanner;
public class Extra7Minmaxprom {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num,max = 0,min = 0,c = 0;
        double suma = 0;

/////////////////////////////////// WHILE //////////////////////////////////////        
        System.out.println("A continuación, ingrese números mayores a 0, o un 0 para parar.");
        num = leer.nextInt();
        
        while (num > 0) {
            suma += num;
            
            if (num != 0) { c++; }
            if (num > max) { max = num; }
            if (c == 1 && num != 0) {min = num;} 
            else if (num != 0 && num < min) { min = num; }
            
            num = leer.nextInt();
        }
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////// DO-WHILE ////////////////////////////////////      
//        System.out.println("A continuación, ingrese números mayores a 0, o un 0 para parar.");
//        
//        do {
//            
//            num = leer.nextInt();
//            suma += num;
//            
//            if (num != 0) { c++; }
//            if (num > max) { max = num; }
//            if (c == 1 && num != 0) {min = num;} 
//            else if (num != 0 && num < min) { min = num; }
//            
//        } while (num > 0);
////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("El mayor número ingresado es: " + max);
        System.out.println("El menor número ingresado es: " + min);
        System.out.println("El promedio de todos los números es: " + (suma/c));
       
    }
    
}
