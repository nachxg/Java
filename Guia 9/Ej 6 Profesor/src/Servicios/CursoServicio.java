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

package Servicios;
import Entidad.Curso;
import java.util.Scanner;

public class CursoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarAlumnos(String[] alumnos) {

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno: ");
            alumnos[i] = leer.next(); 
        }

    }
    
    public void mostrar(String[] alumnos) {
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("[" + alumnos[i] + "]");
        }
    }
    
    public Curso crearCurso(String[] a) {
        
        System.out.println("Ingrese el nombre del curso: ");
        String nombreCurso = leer.next();
        System.out.println("Ingrese la cantidad de horas por dia: ");
        int cantidadHorasPorDia = leer.nextInt();
        System.out.println("Ingrese la cantidad de días por semana: ");
        int cantidadDiasPorSemana = leer.nextInt();
        System.out.println("Ingrese el turno (M/T): ");
        String turno = leer.next();

        while (!turno.equalsIgnoreCase("m") && !turno.equalsIgnoreCase("t")) {
            System.out.println("La opción ingresada es incorrecta. Vuelva a intentarlo:");
            turno = leer.next();
        }

        System.out.println("Ingrese el precio por hora: ");
        double precioPorHora = leer.nextDouble();
        String[] alumnos = a;
        
        return new Curso(nombreCurso,cantidadHorasPorDia,cantidadDiasPorSemana,turno,precioPorHora,alumnos);
        
    }
    
    public double calcularGananciaSemanal(Curso c,String[] alumnos) {
        int cant = alumnos.length;
        return c.getCantidadHorasPorDia() * c.getPrecioPorHora() * cant * c.getCantidadDiasPorSemana();
    }
    
}
