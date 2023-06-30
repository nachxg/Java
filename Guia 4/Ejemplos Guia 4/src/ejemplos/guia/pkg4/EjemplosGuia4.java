//Escribir un programa que procese una secuencia de caracteres ingresada por 
//teclado y terminada en punto, y luego codifique la palabra o frase ingresada de 
//la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la 
//tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se 
//mantienen sin cambios.
//a e i o u
//@ # $ % *
//
//Realice un subprograma que reciba una secuencia de caracteres y retorne la 
//codificación correspondiente. Utilice la estructura “según” para la transformación. 
//Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

package ejemplos.guia.pkg4;
import java.util.Scanner;
public class EjemplosGuia4 {

//    public static void main(String[] args) {
//        
//        Scanner leer = new Scanner (System.in);
//        
//        System.out.print("Ingrese una frase: ");
//        String cadena = leer.nextLine();
//        
//        String retorno = codificar(cadena);
//        System.out.println("Codificación: " + retorno);
//    }
//    
//    public static String codificar(String cadena) {
//        
//        System.out.println("Cadena: " + cadena);
//        String nueva = "";
//        
//        for (int i = 0; i < cadena.length(); i++) {
//            
//            switch (cadena.substring(i,i+1).toUpperCase()) {
//                case "A":
//                    nueva = nueva.concat("@");
//                    break;
//                case "E":
//                    nueva = nueva.concat("#");
//                    break;
//                case "I":
//                    nueva = nueva.concat("$");
//                    break;
//                case "O":
//                    nueva = nueva.concat("%");
//                    break;
//                case "U":
//                    nueva = nueva.concat("*");
//                    break;
//                default:
//                    nueva = nueva.concat(cadena.substring(i,i+1));
//            }
//            
//        }
//        
//        return nueva;
//    }
    
    public static void main(String[] args) {
    
//    Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
//    usuario, validando que el primer número múltiplo del segundo e 
//    imprima si el primer número es múltiplo del segundo, sino 
//    informe que no lo son.
    
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n1 = leer.nextInt();
        System.out.print("Ingrese otro número: ");
        int n2 = leer.nextInt();
        
        EsMultiplo(n1,n2);
    
    }
    
    public static void EsMultiplo(int n1, int n2) {
        
        if (n1 % n2 == 0) { System.out.println(n1 + " es múltiplo de " + n2 + "."); } 
        else { System.out.println(n1 + " no es múltiplo de " + n2 + "."); }
        
    }
    
}