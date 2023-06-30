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

package ej.pkg5.personaedadetc;
import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;
//import java.text.ParseException;
public class Ej5PersonaEdadEtc {

    public static void main(String[] args) /*throws ParseException*/ {
        
        Scanner leer = new Scanner(System.in);
        PersonaServicio ps = new PersonaServicio();
        Persona p = ps.crearPersona();
        int edad = ps.calcularEdad(p);
        System.out.println("La edad es: " + edad);
        
        Persona p2 = ps.crearPersona();
        
        if (ps.menorQue(p,p2,edad)) {
            System.out.println(p2.getNombre() + " es menor que " + p.getNombre());
        } else {
            System.out.println(p.getNombre() + " es menor que " + p2.getNombre());
        }
        
        System.out.println("Ingrese qué persona desea mostrar: ");
        int px = leer.nextInt();
        if (px == 1) {
            ps.mostrarPersona(p);
        } else {
            ps.mostrarPersona(p2);
        }
        
    }
    
}
