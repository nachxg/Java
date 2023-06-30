//Declarar una clase llamada Circunferencia que tenga como atributo privado el 
//radio de tipo real. A continuación, se deben crear los siguientes métodos:
//Método constructor que inicialice el radio pasado como parámetro.
//Métodos get y set para el atributo radio de la clase Circunferencia.
//Método para crearCircunferencia(): que le pide el radio y lo guarda  en el 
//atributo del objeto.
//Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

package Entidad;
import java.util.Scanner;
public class Circunferencia {
    
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        System.out.println("Ingrese el radio: ");
        Scanner leer = new Scanner(System.in);
        this.radio = leer.nextDouble();
    }
    
    public double area() {
        return Math.PI * radio * radio;
    }
    
    public double perimetro () {
        return Math.PI * radio * 2;
    }
      
}
