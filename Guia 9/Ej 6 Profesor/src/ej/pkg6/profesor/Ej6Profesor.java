//Un profesor particular está dando cursos para grupos de cinco alumnos y necesita
//un programa para organizar la información de cada curso. Para ello, crearemos 
//una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, 
//cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
//precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 
//5 (cinco), donde se alojarán los nombres de cada alumno. A continuación, se 
//implementarán los siguientes métodos:
//Un constructor por defecto.
//Un constructor con todos los atributos como parámetro.
//Métodos getters y setters de cada atributo.
//Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se
//ingrese el nombre de cada alumno.
//Método crearCurso(): el método crear curso, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el 
//objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle 
//valor al atributo alumnos
//Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por 
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana 
//que se repite el encuentro.

package ej.pkg6.profesor;
import Servicios.CursoServicio;
import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;
public class Ej6Profesor {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CursoServicio cs = new CursoServicio();
                
        System.out.println("Ingrese la cantidad de alumnos: ");
        int n = leer.nextInt();
        
        String[] alumnos = new String[n];
        
        cs.cargarAlumnos(alumnos);
        cs.mostrar(alumnos);
        Curso c = cs.crearCurso(alumnos);
        
        System.out.println(Arrays.toString(c.getAlumnos()));
        System.out.println(c.toString());
        double g = cs.calcularGananciaSemanal(c,alumnos);
        System.out.println("> La ganancia semanal es: $" + g);
        
    }
    
}
