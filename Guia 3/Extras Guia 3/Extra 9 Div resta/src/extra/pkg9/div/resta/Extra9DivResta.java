//Simular la división usando solamente restas. Dados dos números enteros mayores 
//que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
//restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor 
//que el divisor, este resultado es el residuo, y el número de restas realizadas 
//es el cociente.
//
//Por ejemplo: 50 / 13:
//50 – 13 = 37     una resta realizada
//37 – 13 = 24     dos restas realizadas
//24 – 13 = 11     tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.


package extra.pkg9.div.resta;
import java.util.Scanner;
public class Extra9DivResta {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int divisor,dividendo,resto = 0,cociente = 0;
        
        System.out.println("Ingrese el divisor: ");
        divisor = leer.nextInt();
        System.out.println("Ingrese el dividendo: ");
        dividendo = leer.nextInt();
        
        while (divisor < dividendo || divisor < 1 || dividendo < 1) {
            System.out.println("Alguno de los valores ingresados es inválido.");
            System.out.println("Recuerda que el dividendo no puede ser mayor que el divisor, y ambos deben ser mayores o iguales a 1.");
            System.out.println("Vuelva a intentarlo.");
            System.out.println("Ingrese el divisor: ");
            divisor = leer.nextInt();
            System.out.println("Ingrese el dividendo: ");
            dividendo = leer.nextInt();
        }
        
        while (divisor >= dividendo) {
            System.out.println(divisor + " - " + dividendo + " = " + (divisor -= dividendo));
            resto = divisor;
            cociente++;
        }
        
        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
    }
    
}
