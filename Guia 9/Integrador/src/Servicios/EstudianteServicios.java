//Ejercicio integrador
//Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
//examen final. La escuela nos ha pedido que calculemos el promedio de notas
//final de todos sus alumnos y saber qué alumnos han recibido una nota por
//encima de ese promedio.
//Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
//van a ser nombre y nota (representando la nota obtenida en el final).
//La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
//estudiantes con sus respectivas notas.
//Una vez creado los estudiantes deberemos guardar los estudiantes en un
//arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
//dos tareas que nos ha pedido la escuela.
//1. Calcular y mostrar el promedio de notas de todo el curso
//2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
//nota mayor al promedio del curso
//3. Por último, deberemos mostrar todos los estudiantes con una nota
//mayor al promedio.
//Nota: para crear un vector de objetos la definición es la siguiente:
//Objeto nombreVector[] = new Objeto[];

package Servicios;
import Entidad.Estudiante;
import java.util.Arrays;
import java.util.Scanner;
public class EstudianteServicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public void ingresarEstudiantes(Estudiante[] e) {
        
        String[] nombres = new String[e.length];
        
        for (int i = 0; i < e.length; i++) {
            System.out.println("Ingrese el NOMBRE del estudiante (" + (i+1) + "/" + e.length + "): ");
            String nombre = leer.next();
            nombres[i] = nombre;
            System.out.println("Ingrese la NOTA del estudiante (" + (i+1) + "/" + e.length + "): ");
            double nota = leer.nextDouble();
            e[i] = new Estudiante(nombre,nota);
        }
        System.out.println("");
        System.out.println("- Estudiantes: " + Arrays.toString(nombres));
    }
    
    public void calculos(Estudiante[] e) {
        
        
        double promedio = 0;
        
        for (Estudiante e1 : e) {
            promedio += e1.getNota();
        }
        
        int cont = 0;
        
        for (Estudiante e1 : e) {
            if (e1.getNota() > promedio/e.length) { cont++; }
        }
        
        String[] mp = new String[cont];
        
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < cont; j++) {
               if (e[i].getNota() > promedio/e.length) {
                mp[j] = e[i].getNombre();
            } 
            } 
        }
        
        System.out.println("- Promedio de notas de todos los estudiantes: [" + promedio/e.length + "]");
        System.out.println("- Alumnos que obtuvieron una nota mayor al promedio: " + Arrays.toString(mp));
        System.out.println("");
    }
    
}
