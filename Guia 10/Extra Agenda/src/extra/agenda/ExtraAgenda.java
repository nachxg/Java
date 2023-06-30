//1) Crear una clase llamada "AgendaTelefónica" que permita almacenar contactos con su nombre y número de teléfono. 
//La clase debe tener métodos para agregar un contacto nuevo, buscar un contacto por nombre, mostrar todos los contactos y 
//mostrar los contactos ordenados alfabéticamente por nombre.
//En el programa principal, crear un mapa (HashMap) de tipo "String" (nombre del contacto) y "Integer" (número de teléfono). 
//Luego, mostrar un menú que le dé al usuario la opción de agregar un contacto, buscar un contacto por nombre, mostrar todos 
//los contactos o mostrar los contactos ordenados alfabéticamente.
package extra.agenda;

import extra.agenda.entidad.AgendaTelefonica;
import java.util.HashMap;

public class ExtraAgenda {

    public static void main(String[] args) {
        
        HashMap<String,Long> agenda = new HashMap();
        AgendaTelefonica a = new AgendaTelefonica();
        
        a.crearContactos(agenda);
        a.mostrarNormal(agenda);
        a.mostrarOrden(agenda);
        a.borrarContactos(agenda);
        a.mostrarNormal(agenda);
        
    }
    
}
