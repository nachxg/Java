//Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre 
//y una fecha de nacimiento (Tipo Date), constructor vacío, constructor 
//parametrizado, get y set. Crear una clase PersonaService, en el paquete 
//servicio, con los siguientes métodos:
//Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la 
//persona a crear. Retornar el objeto Persona creado.
//Método calcularEdad que calcule la edad del usuario utilizando el atributo de 
//fecha de nacimiento y la fecha actual.
//Método menorQue recibe como parámetro una Persona y una edad. Retorna true si 
//la persona es menor que la edad consultada o false en caso contrario.
//Método mostrarPersona que muestra la información de la persona deseada.

package Servicio;
import Entidad.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p = new Persona();
    public Persona crearPersona() /*throws ParseException*/{

        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese el día de nacimiento:");
        int dd = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mm = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int aa = leer.nextInt();
        Date fechaNac = new Date(aa-1900,mm-1,dd);
        
        System.out.println("Fecha de nacimiento: " + fechaNac);
        
//        return new Persona(nombre,fechaNac);
//        System.out.print("Ingrese el nombre: ");
//        String nombre = leer.nextLine();
//        System.out.print("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
//        String fechaNacimientoStr = leer.nextLine();
//        Date fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimientoStr);
//        System.out.println(fechaNacimiento);

        return new Persona(nombre, fechaNac);

    }
    
    public int calcularEdad(Persona p) {
        
        LocalDate fechaNac = p.getFechaNac().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        Period period = Period.between(fechaNac, fechaActual);

        return period.getYears();
    }
    
    public boolean menorQue(Persona p,Persona p2, int edad) {
        
        
        int edad2 = calcularEdad(p2);
        
        return edad2 < edad;
    }
    
    public void mostrarPersona(Persona p) {
        
        System.out.println("Persona: " + p.getNombre());
        System.out.println("Fecha de nacimiento: " + p.getFechaNac());    
    }
    
}
