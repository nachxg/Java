//Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá 
//contener como atributos, un vector con la palabra a buscar, la cantidad de 
//letras encontradas y la cantidad jugadas máximas que puede realizar el usuario. 
//Definir los siguientes métodos en AhorcadoService:
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del 
//vector. Después ingresa la palabra en el vector, letra por letra, quedando cada 
//letra de la palabra en un índice del vector. Y también, guarda la cantidad de 
//jugadas máximas y el valor que ingresó el usuario.
//Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
//Nota: buscar como se usa el vector.length.
//Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
//si la letra ingresada es parte de la palabra o no. También informará si la letra 
//estaba o no.
//Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
//muestre cuantas letras han sido encontradas y cuántas le faltan. Este método 
//además deberá devolver true si la letra estaba y false si la letra no estaba,
//ya que, cada vez que se busque una letra que no esté, se le restará uno a sus 
//oportunidades.
//Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
//Método juego(): el método juego se encargará de llamar todos los métodos 
//previamente mencionados e informará cuando el usuario descubra toda la palabra 
//o se quede sin intentos. Este método se llamará en el main.

package Servicios;
import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
public class AhorcadoServicios {
    
    Scanner leer = new Scanner(System.in);
    Ahorcado ah = new Ahorcado();
    
    public void juego() {
        
        crearJuego();
        longitud();
        
        do {
            buscar();
        } while (ah.getContador() != ah.getPalabra().length && ah.getJugadasMax() != 0);
        
        if (ah.getContador() == ah.getPalabra().length) {
            System.out.println("Adivinaste la palabra.");
        } else {
            System.out.println("Te quedaste sin intentos.");
        }
        
    }
    
    public void crearJuego() {
        
        System.out.println("Ingrese la palabra: ");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad máxima de jugadas: ");
        ah.setJugadasMax(leer.nextInt());
        
        ah.setN(palabra.length());
        String[] aux = new String[palabra.length()];
        
        for (int i = 0; i < palabra.length(); i++) {
            
            aux[i] = palabra.substring(i,i+1).toUpperCase();
            
        }
        
        ah.setPalabra(aux);
        
        System.out.println(Arrays.toString(ah.getPalabra()));
        
    }
    
    public void longitud() {
        
        System.out.println("La longitud de la palabra es: " + ah.getPalabra().length);
        
    }
    
    public void buscar() {
        
        int contSi = 0;
        int contNo = 0;
        
        System.out.println("Ingrese una letra: ");
        ah.setLetra(leer.next());

        for (String palabra : ah.getPalabra()) {
            
            if (ah.getLetra().equalsIgnoreCase(palabra)) {
                contSi++;
                ah.setContador(ah.getContador() + 1); 
            } else {
                contNo++;
            }
            
        }

        System.out.println(ah.getContador());
        
        if (contNo > 0 && contSi == 0) {
            ah.setJugadasMax(ah.getJugadasMax() - 1);
        }
        
        if (contSi > 0) {
            System.out.println("La letra fue encontrada.");
        } else {
            System.out.println("La letra no fue encontrada.");
        }
        
        encontradas();
        
    }
    
    public void encontradas() {
        
        System.out.println("Letras encontradas: (" + ah.getContador() + "/" + ah.getPalabra().length + ")");
        
        intentos();
        
    }
    
    public void intentos() {

        System.out.println("Intentos restantes: " + ah.getJugadasMax());
  
    }
    
}
    
