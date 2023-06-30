//Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros.

package extra.pkg1.ppmejorado;

import extra.pkg1.ppmejorado.entidades.Perro;
import extra.pkg1.ppmejorado.entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Extra1PPMejorado {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        
        for (int i = 1; i < 4; i++) {
            Perro p = new Perro("Perro " + i,"Raza " + i, i,"Grande");
            perros.add(p);
        }
        
        for (Perro perro : perros) {
            System.out.println(perro);
        }
        
        System.out.println(" ");
        
        for (int i = 1; i < 4; i++) {
            
            Persona per = new Persona();
            System.out.println("Persona " + i + ": ");
            System.out.println("Ingrese su nombre: ");
            per.setNombre(leer.next());
            System.out.println("Ingrese su apellido: ");
            per.setApellido(leer.next());
            System.out.println("Ingrese su edad: ");
            per.setEdad(leer.nextInt());
            System.out.println("Ingrese su DNI: ");
            per.setDni(leer.nextInt());
            System.out.println("¿Qué perro desea adoptar?");
            String perro = leer.next();
            
            for (Perro p : perros) {
                if (perro.equals(p.getNombre())) {
                    if (p.getDueno() == null) {
                        p.setDueno(per);
                        per.setPerro(p);
                        System.out.println(per.getNombre() + " ha adoptado a " + p.getNombre());
                    } else {
                        System.out.println("Ese perro ya se encuentra adoptado.");
                    }
                }
            }
            
            personas.add(per);
            
        }
        
        for (Persona per : personas) {
            System.out.println(per);
        }
         
    }
    
}
