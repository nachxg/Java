
//Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
//la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
//tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
//información debe gestionar esta aplicación:
//• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
//identificación y su estado civil.
//• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
//incorporación a la facultad y qué número de despacho tienen asignado.
//• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
//matriculados.
//• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
//pertenecen (lenguajes, matemáticas, arquitectura, ...).
//• Sobre el personal de servicio, hay que conocer a qué sección están asignados
//(biblioteca, decanato, secretaría, ...).
//El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
//continuación, debe programar las clases definidas en las que, además de los constructores,
//hay que desarrollar los métodos correspondientes a las siguientes operaciones:
//• Cambio del estado civil de una persona.
//• Reasignación de despacho a un empleado.
//• Matriculación de un estudiante en un nuevo curso.
//• Cambio de departamento de un profesor.
//• Traslado de sección de un empleado del personal de servicio.
//• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
//que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.

package extra.pkg4.facultad;

import Entidades.Empleado;
import Entidades.Persona;
import Entidades.Estudiante;
import Entidades.PersonalServicio;
import Entidades.Profesor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Extra4Facultad {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        ArrayList<Persona> personas = new ArrayList();
        
        Persona Nacho = new Estudiante("Lic en Computacion", "Ignacio", "Gimenez", 44296063, "Soltero");
        Persona Dora = new Estudiante("Java", "Dora", "Abuaf", 44245430, "Casada");
        Persona Juano = new Profesor("Artes Oscuras", 2010, 15, "Juan", "Castro", 12345678, "Soltero");
        Persona Paola = new Profesor("Calidad", 2000, 23, "Paola", "Rico", 87654321, "Divorciada");
        Persona Agustina = new PersonalServicio("Contable", 2013, 17, "Agustina", "Basualdo", 44612333, "Casada");
        Persona Federico = new PersonalServicio("Pastelero", 2020, 10, "Federico", "Martinez", 45678910, "Casado");
        Persona Jonatan = new PersonalServicio("Kiosquero", 2021, 1, "Jonatan", "Herrera", 49876011, "Casado");
        
        Collections.addAll(personas, Nacho,Dora,Juano,Paola,Agustina,Federico,Jonatan);
//        personas.add(Nacho); personas.add(Dora); personas.add(Juano); personas.add(Paola); personas.add(Agustina); personas.add(Federico); personas.add(Jonatan);
      
        do {
            System.out.println("Sistema de Gestión Facultad");
            System.out.println("1. Cambiar estado civil de una persona.");
            System.out.println("2. Reasignar despacho a un empleado.");
            System.out.println("3. Matricular un estudiante en un nuevo curso.");
            System.out.println("4. Cambiar departamento a un profesor.");
            System.out.println("5. Trasladar de sección a un empleado del personal de servicio.");
            System.out.println("6. Mostrar datos de todos los miembros de la facultad.");
            System.out.println("7. Salir.");
            int opc = leer.nextInt();

            switch (opc) {

                case 1:

                    System.out.println("Ingrese el DNI de la persona a modificar su estado civil: ");
                    int i = 1;

                    for (Persona persona : personas) {

                        System.out.println(i + ". " + persona.getNombre() + " "
                                + persona.getApellido()
                                + " DNI Nº: " + persona.getDni()
                                + ". Estado civil actual: " + persona.getEstadoCivil() + ".");
                        i++;
                    }

                    long dni = leer.nextLong();

                    for (Persona persona : personas) {
                        if (persona.getDni() == dni) {
                            persona.cambiarEstadoCivil();
                        }
                    }

                    break;

                case 2:

                    System.out.println("Ingrese el DNI del empleado a modificar su despacho: ");
                    i = 1;

                    for (Persona persona : personas) {
                        if (persona instanceof Empleado) {
                            System.out.println(i + ". " + persona.getNombre() + " "
                                    + persona.getApellido()
                                    + " DNI Nº: " + persona.getDni()
                                    + ". Despacho actual: " + ((Empleado) persona).getNroDespacho() + ".");
                            i++;
                        }

                    }

                    dni = leer.nextLong();

                    for (Persona persona : personas) {
                        if (persona.getDni() == dni) {
                            Empleado e = (Empleado) persona;
                            e.reasignarDespacho();
                        }
                    }

                    break;

                case 3:

                    System.out.println("Ingrese el DNI del estudiante a matricular en un nuevo curso: ");
                    i = 1;

                    for (Persona persona : personas) {
                        if (persona instanceof Estudiante) {
                            System.out.println(i + ". " + persona.getNombre() + " "
                                    + persona.getApellido()
                                    + " DNI Nº: " + persona.getDni()
                                    + ". Curso actual: " + ((Estudiante) persona).getCurso() + ".");
                            i++;
                        }

                    }

                    dni = leer.nextLong();

                    for (Persona persona : personas) {
                        if (persona.getDni() == dni) {
                            Estudiante e = (Estudiante) persona;
                            e.matriculacion();
                        }
                    }

                    break;

                case 4:

                    System.out.println("Ingrese el DNI del profesor a cambiar de departamento: ");
                    i = 1;

                    for (Persona persona : personas) {
                        if (persona instanceof Profesor) {
                            System.out.println(i + ". " + persona.getNombre() + " "
                                    + persona.getApellido()
                                    + " DNI Nº: " + persona.getDni()
                                    + ". Departamento actual: " + ((Profesor) persona).getDepartamento() + ".");
                            i++;
                        }

                    }

                    dni = leer.nextLong();

                    for (Persona persona : personas) {
                        if (persona.getDni() == dni) {
                            Profesor e = (Profesor) persona;
                            e.cambiarDepartamento();
                        }
                    }

                    break;

                case 5:

                    System.out.println("Ingrese el DNI del empleado a trasladar de sección: ");
                    i = 1;

                    for (Persona persona : personas) {
                        if (persona instanceof PersonalServicio) {
                            System.out.println(i + ". " + persona.getNombre() + " "
                                    + persona.getApellido()
                                    + " DNI Nº: " + persona.getDni()
                                    + ". Sección actual: " + ((PersonalServicio) persona).getSeccion() + ".");
                            i++;
                        }

                    }

                    dni = leer.nextLong();

                    for (Persona persona : personas) {
                        if (persona.getDni() == dni) {
                            PersonalServicio e = (PersonalServicio) persona;
                            e.trasladarSeccion();
                        }
                    }

                    break;

                case 6:

                    i = 1;
                    for (Persona persona : personas) {

                        if (persona instanceof Estudiante) {
                            System.out.println(i + ". " + persona.getNombre() + " "
                                    + persona.getApellido()
                                    + " DNI Nº: " + persona.getDni()
                                    + ". Estado civil actual: " + persona.getEstadoCivil() + "."
                                    + ". Curso actual: " + ((Estudiante) persona).getCurso() + ".");
                        }

                        if (persona instanceof Profesor) {
                            System.out.println(i + ". " + persona.getNombre() + " "
                                    + persona.getApellido()
                                    + " DNI Nº: " + persona.getDni()
                                    + ". Estado civil actual: " + persona.getEstadoCivil() + "."
                                    + " Año de incorporación: " + ((Profesor) persona).getAnioIncorporacion()
                                    + " Nº de despacho: " + ((Profesor) persona).getNroDespacho()
                                    + " Departamento: " + ((Profesor) persona).getDepartamento());
                        }

                        if (persona instanceof PersonalServicio) {
                            System.out.println(i + ". " + persona.getNombre() + " "
                                    + persona.getApellido()
                                    + " DNI Nº: " + persona.getDni()
                                    + ". Estado civil actual: " + persona.getEstadoCivil() + "."
                                    + " Año de incorporación: " + ((PersonalServicio) persona).getAnioIncorporacion()
                                    + " Nº de despacho: " + ((PersonalServicio) persona).getNroDespacho()
                                    + " Sección: " + ((PersonalServicio) persona).getSeccion());
                        }

                        i++;
                        
                    }
                    
                    break;
                    
                case 7:
                    System.out.println("Saludos.");
                    System.exit(0);
                default:
                    System.out.println("Escribi bien boludo!!!!");
            }

        } while (true);

    }

}
