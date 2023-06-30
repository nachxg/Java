/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package servicios;

import entidad.Alumno;
import java.util.ArrayList;

import java.util.Scanner;

public class alumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    // Creamos la lista Alumno
    ArrayList<Alumno> listAlumno = new ArrayList();

    // CREAMOS EL Metodo crearAlumno // ingresamos datos
    public void crearAlumno() {

        boolean salir = true;
        do {
            Alumno alumno = new Alumno();
            System.out.print("Ingrese su nombre: ");
            alumno.setNombre(leer.next());
            System.out.print("Ingrese la nota 1: ");
            alumno.getNotas().add(leer.nextInt());
            System.out.print("Ingrese la nota 2 : ");
            alumno.getNotas().add(leer.nextInt());
            System.out.print("Ingrese la nota 3: ");
            alumno.getNotas().add(leer.nextInt());
            
            // agregando los datos a la lista Alumnos
            listAlumno.add(alumno);

            System.out.println("Desea ingresar otro alumno? S/N");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("N")) {
                salir = false;
            }
            System.out.println(alumno.getNombre() + alumno.getNotas());
        } while (salir);
        // mostramos los datos ingresados.
        for (Alumno alumno : listAlumno) {
            System.out.println(alumno);
        }
      
        }
        /**
         Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
        final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
        del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
        promedio final, devuelto por el método y mostrado en el main.
         */
            // cramos el metodo notaFinal
       public void notaFinal(){
           System.out.println("Ingrese el nombre del alumno a calcular su nota Final: ");
           String nombre = leer.next();
         
         //  buscamos dentro de la lista Alumnos el alumno elegido y traemos sus notas.
           for (Alumno alumno : listAlumno) {
               if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                   double n1=alumno.getNotas().get(0);
                   double n2=alumno.getNotas().get(1);
                   double n3=alumno.getNotas().get(2);
                   
                   double promedio = (n1+n2+n3)/3;
                   System.out.println("El promedio del alumno " + alumno.getNombre()+ " es :" + promedio);     
               }
           }
       
        }
    }
        
