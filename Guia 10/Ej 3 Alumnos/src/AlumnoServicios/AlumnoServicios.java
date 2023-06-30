
package AlumnoServicios;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> listAlumno = new ArrayList();

    public void crearAlumno() {

        boolean salir = true;
        do {
            Alumno alumno = new Alumno();
            
            System.out.print("Ingrese el nombre del alumno: ");
            alumno.setNombre(leer.next());
            System.out.print("Ingrese la nota 1: ");
            alumno.getNotas().add(leer.nextInt());
            System.out.print("Ingrese la nota 2: ");
            alumno.getNotas().add(leer.nextInt());
            System.out.print("Ingrese la nota 3: ");
            alumno.getNotas().add(leer.nextInt());

            listAlumno.add(alumno);
            System.out.println("");
            System.out.println("Alumno: " + alumno.getNombre() +" Notas: " + alumno.getNotas());
            
            System.out.println("");
            System.out.println("¿Desea ingresar otro alumno? S/N.");
            String resp = leer.next();
            System.out.println("");
            if (resp.equalsIgnoreCase("N")) {
                salir = false;
            }
            
        } while (salir);

        for (Alumno alumno : listAlumno) {
            System.out.println(alumno);
        }

    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno a calcular su nota final: ");
        String nombre = leer.next();

        for (Alumno alumno : listAlumno) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                double n1 = alumno.getNotas().get(0);
                double n2 = alumno.getNotas().get(1);
                double n3 = alumno.getNotas().get(2);

                double promedio = (n1 + n2 + n3) / 3;
                System.out.println("El promedio del alumno " + alumno.getNombre() + " es: " + promedio);
            }
        }
    }
}
