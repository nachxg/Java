//5) Crear la clase “Tarea” con los siguientes atributos título, descripción y 
//estado (boolean). Agregar constructor vacío, con parámetros, getters y setters.
//Luego crear la clase “TareaServicio”, que contenga:
// Método para crear una Tarea: se pedirá al usuario que ingrese el título y la 
//descripción. Por defecto, al crear una tarea se tiene que asignar el valor de 
//true al atributo estado, esto indicará que la tarea está en proceso.
// Método para modificar el estado a false, esto indicará que la tarea está 
//terminada.
//Método para analizar si el estado de la tarea y que muestre si la misma está en 
//proceso o terminada.
//Método para visualizar los datos de la Tarea.

package extra.tarea;
import Servicio.TareaServicio;
import java.util.Scanner;
public class ExtraTarea {

    public static void main(String[] args) {
        
        boolean salir = true;
        TareaServicio ts = new TareaServicio();
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("");
            System.out.println("1. Crear tarea.");
            System.out.println("2. Mostrar los datos de la tarea.");
            System.out.println("3. Chequear el estado de la tarea.");
            System.out.println("4. Marcar tarea como finalizada.");
            System.out.println("5. Salir.");
            int opc = leer.nextInt();
            switch (opc) {
                case 1: 
                    ts.crearTarea();
                    break;
                case 2:
                    ts.mostrarDatos();
                    break;
                case 3:
                    System.out.println(ts.chequearEstado());
                    break;
                case 4:
                    ts.tareaTerminada();
                    System.out.println("La tarea se finalizó correctamente.");
                    break;
                case 5: 
                    System.out.println("");
                    System.out.println("Saludos.");
                    salir = false;
            }
        } while (salir);
        
    }
    
}
