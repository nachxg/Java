//• La clase Simulador debe tener un método que genere un listado de alumnos manera
//aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
//manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
//• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
//objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
//listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
//mismo nombre.
//• Se debe imprimir por pantalla el listado de alumnos.
//• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
//un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
//• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
//para cada alumno genera tres votos de manera aleatoria. En este método debemos
//guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
//votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
//Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
//mismo alumno. Utilizar un hashset para resolver esto.
//• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
//fueron sus 3 votos.
//• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
//comienza a hacer el recuento de votos.
//• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
//facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
//los 5 facilitadores y los 5 facilitadores suplentes.

package extra.pkg4.pulsos.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Simulador {
    
//• La clase Simulador debe tener un método que genere un listado de alumnos manera
//aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
//manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
   
    List<Alumno> alumnos = new ArrayList();
    Random random = new Random();
    List<Long> dnis = new ArrayList();
    List<String> nombresCompletos = new ArrayList<>();
    String magenta = "\033[35m";
            
    public List<Alumno> generarAlumnos() {

        String[] nombres = {"Juan", "María", "Pedro", "Laura", "Carlos", "Ana", "Luis", "Marta", "José", "Elena","Nacho","Dora","Francisco","Agostina","Agustina","Agustin","Leonardo","Javier"};
        String[] apellidos = {"García", "López", "Rodríguez", "Martínez", "Fernández", "González", "Pérez", "Sánchez", "Romero", "Torres","Gimenez","Abuaf","Freytes","Basualdo","Giampietro","Castro"};

        for (int i = 0; i < 20; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            String apellido = apellidos[random.nextInt(apellidos.length)];
            String nombreCompleto = nombre + " " + apellido;
            long dni = (long) (random.nextDouble() * 50000000L) + 10000000L;
            Alumno a = new Alumno(nombreCompleto,dni,0);
            dnis.add(dni); 
            nombresCompletos.add(nombreCompleto);
            alumnos.add(a);
        }
        
        return alumnos;
        
    }
    
//• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
//para cada alumno genera tres votos de manera aleatoria. En este método debemos
//guardar al alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
//votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
//Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
//mismo alumno. Utilizar un hashset para resolver esto.
    
    public void votacion() {
        
        ArrayList<Alumno> alumnosTemporal = new ArrayList<>(alumnos);
        
        for (int i = 0; i < alumnosTemporal.size(); i++) {
            
            Voto voto = new Voto();
            HashSet<Alumno> alumnosVotadosTemp = new HashSet<>();//3
            Alumno alumno = alumnosTemporal.get(i);
            
            System.out.println(magenta+"Votos de: " + alumno.getNombreCompleto());
            for (int j = 0; j < 3; j++) {
                Alumno alumnoVotado = alumnosTemporal.get(random.nextInt(alumnosTemporal.size()));
                if (!alumnoVotado.equals(alumno) && !alumnosVotadosTemp.contains(alumnoVotado)) {
                    System.out.println(alumnoVotado.getNombreCompleto());
                    voto.setAlumno(alumno);
                    alumnoVotado.setCantVotos(alumnoVotado.getCantVotos() + 1);
                    alumnosVotadosTemp.add(alumnoVotado);
                } else {
                    j--;
                }
            }
            System.out.println(magenta+"---------------------------------------------");
            ArrayList<Alumno> alumnosVotados = new ArrayList<>(alumnosVotadosTemp);
            voto.setAlumnosVotados(alumnosVotados);

        }
        System.out.println("Todos los alumnos votaron...\n");
    }
    
    public void mostrarAlumnos() {
        System.out.println(alumnos);
    }
    
//• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
//facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
//los 5 facilitadores y los 5 facilitadores suplentes.
    
    public void facilitadores(){
        
        ArrayList<Alumno> facilitadores = new ArrayList();
        ArrayList<Alumno> suplentes = new ArrayList();
        
        Collections.sort(alumnos, Comparator.comparingInt(Alumno::getCantVotos).reversed());
        
        System.out.println("ORDENADOS: ");
        
        for (int i = 0; i < 10; i++) {
            if (i<5) {
                facilitadores.add(alumnos.get(i));
            } else {
                suplentes.add(alumnos.get(i));
            }
        }
    
        System.out.println("Facilitadores: " + facilitadores);
        System.out.println("Suplentes: " + suplentes);
        
    }
    

}
