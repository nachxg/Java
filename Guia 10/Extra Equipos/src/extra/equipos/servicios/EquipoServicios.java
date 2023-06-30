//2) En este ejercicio vamos a mostrar la tabla de posiciones final de un torneo del deporte que deseen. Para ello deberán 
//crear una clase llamada "EquipoDe…" que represente a un equipo del deporte seleccionado. La clase debe tener los siguientes 
//atributos: nombre del equipo, ciudad, cantidad de partidos jugados, ganados, perdidos y empatados, y puntos totales.
//En el programa principal, crear una lista de tipo "EquipoDe…" y agregar 10 objetos de tipo equipo a la lista. Luego, mostrar 
//por pantalla de forma ordenada según cantidad de puntos los nombres de cada equipo, su cantidad de puntos, partidos jugados, 
//ganados, perdidos y empatados.
//Una vez finalizado el torneo, determinar el equipo ganador, eliminar al último equipo de la tabla por haber descendido, sumar 
//al nuevo equipo que ascendió de la división inferior, reiniciar los valores de partidos y puntos a 0 para el inicio del 
//siguiente campeonato y mostrar la lista en orden alfabético de los equipos.
package extra.equipos.servicios;

import extra.equipos.entidad.Equipo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EquipoServicios {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void llenarLista(ArrayList<Equipo> equipos) {

        Equipo eq1 = new Equipo("Belgrano", "Cordoba", 7, 4, 2, 1, 13);
        Equipo eq2 = new Equipo("Talleres", "Cordoba", 7, 3, 3, 1, 10);
        Equipo eq3 = new Equipo("River", "Buenos Aires", 6, 5, 0, 1, 16);
        Equipo eq4 = new Equipo("Boca", "Buenos Aires", 6, 3, 2, 1, 10);
        Equipo eq5 = new Equipo("San Martin", "San Juan", 7, 7, 0, 0, 21);
        Equipo eq6 = new Equipo("Huracán", "Buenos Aires", 7, 2, 3, 2, 8);
        Equipo eq7 = new Equipo("Colón", "Santa Fe", 7, 4, 2, 1, 13);
        Equipo eq8 = new Equipo("Unión", "Santa Fe", 7, 2, 3, 2, 8);
        Equipo eq9 = new Equipo("Rosario Central", "Rosario", 7, 5, 0, 2, 17);
        Equipo eq10 = new Equipo("Godoy Cruz", "Mendoza", 7, 3, 4, 0, 9);

        equipos.add(eq1);
        equipos.add(eq2);
        equipos.add(eq3);
        equipos.add(eq4);
        equipos.add(eq5);
        equipos.add(eq6);
        equipos.add(eq7);
        equipos.add(eq8);
        equipos.add(eq9);
        equipos.add(eq10);

    }

    public void mostrarEquipos(ArrayList<Equipo> equipos) {
        
        Collections.sort(equipos,Comparator.comparingInt(Equipo::getPuntosTotales).reversed());
        
        System.out.printf("%-20s %-20s %-5s %-5s %-5s %-5s %-5s", "EQUIPO", "CIUDAD", "PJ", "PG", "PP", "PE","PT");
        System.out.println("\n--------------------------------------------------------------------");
        
        equipos.forEach((Equipo equipo) -> {
            System.out.printf("%-20s %-20s %-5s %-5s %-5s %-5s %-5s", equipo.getNombreEquipo(), equipo.getCiudad(),
                    equipo.getCantidadPartidos(), equipo.getGanados(), equipo.getPerdidos(), equipo.getEmpatados(),
                    equipo.getPuntosTotales());
            System.out.println("");
        });
        
    }
    
    public void finalTorneo(ArrayList<Equipo> equipos) {
        
        Collections.sort(equipos,Comparator.comparingInt(Equipo::getPuntosTotales).reversed());
        
        System.out.println("");
        System.out.println("Equipo ganador: " + equipos.get(0).getNombreEquipo()+ " con " + equipos.get(0).getPuntosTotales() + " puntos.");
        System.out.println("Equipo perdedor: " + equipos.get(9).getNombreEquipo() + " con " + equipos.get(9).getPuntosTotales() + " puntos.");
        System.out.println("");
        
        System.out.println("Ingrese el equipo que ascendió de la división inferior: ");
        String nombre = leer.next();
        System.out.println("Ingrese la ciudad: ");
        String ciudad = leer.next();
        
        equipos.remove(9);
        equipos.add(new Equipo(nombre,ciudad,0,0,0,0,0));
        
        equipos.forEach((Equipo equipo) -> {
            equipo.setCantidadPartidos(0);
            equipo.setGanados(0);
            equipo.setPerdidos(0);
            equipo.setEmpatados(0);
            equipo.setPuntosTotales(0);
        });
        
        Collections.sort(equipos,Comparator.comparing(Equipo::getNombreEquipo));
        
        System.out.printf("%-20s %-20s %-5s %-5s %-5s %-5s %-5s", "EQUIPO", "CIUDAD", "PJ", "PG", "PP", "PE","PT");
        System.out.println("\n--------------------------------------------------------------------");
        
        equipos.forEach((Equipo equipo) -> {
            System.out.printf("%-20s %-20s %-5s %-5s %-5s %-5s %-5s", equipo.getNombreEquipo(), equipo.getCiudad(),
                    equipo.getCantidadPartidos(), equipo.getGanados(), equipo.getPerdidos(), equipo.getEmpatados(),
                    equipo.getPuntosTotales());
            System.out.println("");
        });
          
    }
     
}
