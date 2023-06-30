//Los profesores del curso de programación de Egg necesitan llevar un registro de 
//las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de 
//aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 
//notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones 
//de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
//Al final del programa los profesores necesitan obtener por pantalla la cantidad 
//de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
//con promedio mayor o igual al 7 de sus notas del curso.

package extra.pkg4.notas;
import java.util.Scanner;
public class Extra4Notas {

    public static void main(String[] args) {
        
        int aprobados=0,desaprobados=0;
        double[] vector = new double[10];
        
        for (int i = 0; i < 10; i++) {
            vector[i] = notaFinal(i);
            if (vector[i] >= 7) {
                aprobados++;
            } else { 
                desaprobados++; 
            }
        }
        
        mostrar(vector);
        
        System.out.println("La cantidad de alumnos aprobados es: " + aprobados);
        System.out.println("La cantidad de alumnos desaprobados es: " + desaprobados);

    }
    
    public static double notaFinal(int i) {
        double nota,n1,n2,n3,n4;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la nota del primer TP evaluativo del " + (i+1) + "º alumno: ");
        n1 = leer.nextDouble();
        System.out.println("Ingrese la nota del segundo TP evaluativo del " + (i+1) + "º alumno: ");
        n2 = leer.nextDouble();
        System.out.println("Ingrese la nota del primer integrador del " + (i+1) + "º alumno: ");
        n3 = leer.nextDouble();
        System.out.println("Ingrese la nota del segundo integrador del " + (i+1) + "º alumno: ");
        n4 = leer.nextDouble();
        
        nota = n1 * 0.1 + n2 * 0.15 + n3 * 0.25 + n4 * 0.5;
        
        return nota;
    }
    
     public static void mostrar(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println(" ");
    }
    
}
