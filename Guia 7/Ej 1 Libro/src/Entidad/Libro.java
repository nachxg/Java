//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, 
//Título, Autor, Número de páginas, y un constructor con todos los atributos 
//pasados por parámetro y un constructor vacío. Crear un método para cargar un 
//libro pidiendo los datos al usuario y luego informar mediante otro método el 
//número de ISBN, el título, el autor del libro y el número de páginas.
package Entidad;
import java.util.Scanner;
public class Libro {
    
    public int isbn;
    public String titulo;
    public String autor;
    public int pag;
    
    public Libro(int isbn, String titulo, String autor, int pag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
    }
    
    public Libro() {
    
    }
    
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ISBN: ");
        this.isbn = leer.nextInt();
        System.out.println("Ingrese el título: ");
        this.titulo = leer.next();
        System.out.println("Ingrese el autor: ");
        this.autor = leer.next();
        System.out.println("Ingrese el número de páginas: ");
        this.pag = leer.nextInt();
    }

    public void imprimirLibro() {
        System.out.println("-----------------------------------");
        System.out.println(">> Título: " + this.titulo + " << ");
        System.out.println(">> Autor: " + this.autor + " << ");
        System.out.println(">> Número de páginas: " + this.pag + " << ");
        System.out.println(">> ISBN: " + this.isbn + " << ");
        System.out.println("-----------------------------------");
    }

}
