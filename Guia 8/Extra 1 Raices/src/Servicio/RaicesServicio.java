//Vamos a realizar una clase llamada Raices, donde representaremos los valores de 
//una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, 
//llamémosles a, b y c. Hay que insertar estos 3 valores para construir el 
//objeto a través de un método constructor. Luego, en RaicesServicio las 
//operaciones que se podrán realizar son las siguientes:
//
//Método getDiscriminante(): devuelve el valor del discriminante (double). 
//El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
//Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
//para que esto ocurra, el discriminante debe ser mayor o igual que 0.
//Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, 
//para que esto ocurra, el discriminante debe ser igual que 0.
//Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 
//posibles soluciones.
//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única 
//raíz. Es en el caso en que se tenga una única solución posible.
//Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará
//por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en 
//caso de no existir solución, se mostrará un mensaje.
//Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el 
//signo delante de -b
package Servicio;
import Entidad.Raices;
import java.util.Scanner;
public class RaicesServicio {
    
    Scanner leer = new Scanner(System.in);
    Raices r = new Raices();
    
    public void ingresarValores() {

        System.out.println("Ingrese 'a': ");
        double a = leer.nextDouble();
        System.out.println("Ingrese 'b':");
        double b = leer.nextDouble();
        System.out.println("Ingrese 'c': ");
        double c = leer.nextDouble();
        
        r.setA(a);
        r.setB(b);
        r.setC(c);
        
    }
    
    public double getDiscriminante() {

        return r.getB()*r.getB() - 4 * r.getA() * r.getC();
    }
    
    public boolean tieneRaices() {
        return getDiscriminante() > 0;
    }
    
    public boolean tieneRaiz() {
        return getDiscriminante() == 0;
    }
   
    public void imprimirRaiz() {

        double a = r.getA();
        double b = r.getB();
        double c = r.getC();
        
        double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        
        if (getDiscriminante() > 0) {
            System.out.println("El discriminante (Δ = " + getDiscriminante() + ") es mayor a 0, por lo que existen dos raíces.");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (getDiscriminante() == 0) {
            System.out.println("El discriminante (Δ = " + getDiscriminante() + ") es 0, por lo que existe una única raíz doble.");
            System.out.println("x = " + x1);
        } else {
            System.out.println("El discriminante (Δ = " + getDiscriminante() + ") es menor a 0, por lo que la ecuación no tiene raíces reales.");
        }

    }
    
    public void calcular() {

        double a = r.getA();
        double b = r.getB();
        double c = r.getC();
        
        double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
        double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
        double sol1 = a*Math.pow(x1,2) + b*x1 + c;
        double sol2 = a*Math.pow(x2,2) + b*x2 + c;
        
        if (tieneRaices()) {
            System.out.println("Las soluciones de la ecuación son x1 = " + x1 + " y x2 = " + x2 + ", ya que: ");
            System.out.println("("+ a + ")(" + x1 + ")^2 + (" + b + ")(" + x1 + ") + (" + c +") = " + sol1);
            System.out.println("("+ a + ")(" + x2 + ")^2 + (" + b + ")(" + x2 + ") + (" + c +") = " + sol1);
        } else if (tieneRaiz()) {
            System.out.println("La única solución de la ecuación es x = " + x1 + ", ya que: ");
            System.out.println("("+ a + ")(" + x1 + ")^2 + (" + b + ")(" + x1 + ") + (" + c +") = " + sol1);
        } else {
            System.out.println("La ecuación no tiene solución dentro de los reales.");
        }
        
    }
    
}