//5) Crear la clase “Tarea” con los siguientes atributos título, descripción y 
//estado (boolean). Agregar constructor vacío, con parámetros, getters y setters.
//Luego crear la clase “TareaServicio”, que contenga:
// Método para crear una Tarea: se pedirá al usuario que ingrese el título y la 
//descripción. Por defecto, al crear una tarea se tiene que asignar el valor de 
//true al atributo estado, esto indicará que la tarea está en proceso.
// Método para modificar el estado a false, esto indicará que la tarea está 
//terminada.
//Método para analizar el estado de la tarea y que muestre si la misma está en 
//proceso o terminada.
//Método para visualizar los datos de la Tarea.

package Servicio;
import Entidad.Tarea;
import java.util.Scanner;
public class TareaServicio {
    
    Tarea t = new Tarea();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearTarea() {
        System.out.println("");
        System.out.println("Ingrese el título de la tarea: ");
        t.setTitulo(leer.next());
        System.out.println("Ingrese la descripción: ");
        t.setDescripcion(leer.next());
        t.setEstado(true);

    }
    
    public void tareaTerminada() {
        t.setEstado(false);
    }
    
    public String chequearEstado() {
        if (t.isEstado()) {
            return "La tarea está en proceso.";
        } else {
            return "La tarea fue finalizada.";
        }   
    }
    
    public void mostrarDatos() {
        System.out.println("");
        System.out.println("Título: " + t.getTitulo());
        System.out.println("Descripción: " + t.getDescripcion());
        System.out.println("Estado: " + chequearEstado());
    }
    
}
