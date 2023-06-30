//Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a 
//medida que el usuario las va ingresando, construya una “sopa de letras para 
//niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
//horizontal en una fila que será seleccionada de manera aleatoria. Una vez 
//concluida la ubicación de las palabras, rellene los espacios no utilizados con 
//un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de 
//letras creada.
//Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las 
//siguientes funciones de Java substring(), Length() y Math.random

//MATRIZ[i][j] = Integer.toString(Math.random() * 10);

package extra.pkg6.sopadeletras;
import java.util.Scanner;
public class Extra6Sopadeletras {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String[][] sopa = new String[20][20];
        String[] palabras = new String[5];
        String palabra;
        int f,c;
        c = 0;

        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese una palabra: ");
                palabra = leer.nextLine();
                if (palabra.length() < 3 || palabra.length() > 5) {
                    System.out.println("La palabra es inválida. Vuelva a intentarlo: ");
                }
            } while (palabra.length() < 3 || palabra.length() > 5);
            palabras[i] = palabra;
        }   
        
        filasRandom(sopa,palabras,c); c++;
        filasRandom(sopa,palabras,c); c++; 
        filasRandom(sopa,palabras,c); c++;
        filasRandom(sopa,palabras,c); c++;
        filasRandom(sopa,palabras,c); 
        rellenarVacios(sopa);
        mostrarMatriz(sopa);
        
    }
    
    public static void filasRandom(String sopa[][],String palabras[],int c) {
        int f = (int) (Math.random() * 20);
        int o = 0;
        
        for (int j = 0; j < 5; j++) {
                if (o < palabras[c].length() ) {
                    sopa[f][j] = String.valueOf(palabras[c].charAt(o));
                    o++;
            }
        }
    }
    
    public static void rellenarVacios(String sopa[][]) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j] == null || sopa[i][j].equals("")) {
                    sopa[i][j] = Integer.toString((int) (Math.random() * 10));
                }
            }
        }
    }
    
    public static void mostrarMatriz(String sopa[][]) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + sopa[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
}

        
 
    

