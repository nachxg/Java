//Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como 
//atributos una frase (String) y su longitud. Agregar constructor vacío y con 
//atributo frase solamente. Agregar getters y setters. El constructor con frase 
//como atributo debe setear la longitud de la frase de manera automática. Crear 
//una clase CadenaServicio en el paquete servicios que implemente los siguientes
//métodos:
//Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene 
//la frase ingresada.
//Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por 
//pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
//Método vecesRepetido(String letra), recibirá un carácter ingresado por el 
//usuario y contabilizar cuántas veces se repite el carácter en la frase, 
//por ejemplo:
//Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
//Método compararLongitud(String frase), deberá comparar la longitud de la frase 
//que compone la clase con otra nueva frase ingresada por el usuario.
//Método unirFrases(String frase), deberá unir la frase contenida en la clase 
//Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
//Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y 
//mostrar la frase resultante.
//Método contiene(String letra), deberá comprobar si la frase contiene una letra 
//que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

package Servicios;
import Entidades.Cadena;
import java.util.Scanner;
import java.lang.StringBuilder;
public class CadenaServicios {
    
    StringBuilder sb = new StringBuilder();
    Cadena frase = new Cadena();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void mostrarVocales(Cadena frase) {
        
        String c = frase.getFrase();
        int cont = 0;
        
        for (int i = 0; i < c.length(); i++) {
            if (c.substring(i,i+1).equalsIgnoreCase("a") || c.substring(i,i+1).equalsIgnoreCase("e") || c.substring(i,i+1).equalsIgnoreCase("i") || c.substring(i,i+1).equalsIgnoreCase("o") || c.substring(i,i+1).equalsIgnoreCase("u")) {
                cont++;
            }
        }
        System.out.println("La frase tiene " + cont + " vocales.");
    }
    
    public void vecesRepetido(Cadena frase) {
        
        String c = frase.getFrase();
        int cont = 0;
        String buscar;
        
        System.out.println("Ingrese el caracter a buscar:");
        buscar = leer.next();
        
        
        for (int i = 0; i < c.length(); i++) {
            if (c.substring(i,i+1).equalsIgnoreCase(buscar)) {
                cont++;
            }
        }
        
        System.out.println("El caracter ingresado de encontró " + cont + " veces.");
        
    }
    
    public String invertirFrase(Cadena cadena) {
        String frase = cadena.getFrase();
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }
        return fraseInvertida;
    }

    public void compararLongitud(Cadena cadena) {
        
        String frase1 = cadena.getFrase();
        System.out.println("Ingrese una frase: ");
        String frase2 = leer.next();
        
        System.out.println("Longitud frase 1: " + frase1.length());
        System.out.println("Longitud frase 2: " + frase2.length());
        
    }
    
    public void unirFrases(Cadena cadena) {
        
       String frase1 = cadena.getFrase();
        System.out.println("Ingrese una frase: ");
        String frase2 = leer.next();
        
        String nueva = frase1 + frase2;
        
        System.out.println("Nueva frase: " + nueva);
        
    }
    
    public void reemplazar(Cadena cadena) {
        
        String frase = cadena.getFrase();
        System.out.println("Ingrese un caracter a reemplazar: ");
        String caracter = leer.next();
        System.out.println("Ingrese con qué caracter reemplazarlo: ");
        String remp = leer.next();
        
        String nueva = frase.replace(caracter, remp);
        
        System.out.println("La nueva frase es: " + nueva);
        
    }
    
    public boolean contiene(Cadena c) {
        System.out.println("Ingrese la letra a buscar ");
        String letra = leer.nextLine();
        return ((c.getFrase().indexOf(letra)) != -1);
    }
   
}
