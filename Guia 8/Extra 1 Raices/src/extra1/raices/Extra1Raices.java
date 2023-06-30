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

package extra1.raices;
import Servicio.RaicesServicio;
import Entidad.Raices;
import java.util.Scanner;
public class Extra1Raices {

    public static void main(String[] args) {
        
        boolean salir = true;
        Scanner leer = new Scanner(System.in);
        RaicesServicio rs = new RaicesServicio();
        Raices r = new Raices();
        
        rs.ingresarValores();
        
        do {
            System.out.println("");
            System.out.println("Ingrese una opción: ");
            System.out.println("1. Calcular discriminante.");
            System.out.println("2. Averiguar si tiene dos raíces.");
            System.out.println("3. Averiguar si tiene una única raiz doble.");
            System.out.println("4. Imprimir la raíz/raíces.");
            System.out.println("5. Calcular la ecuación con las soluciones posibles.");
            System.out.println("6. Reingresar valores.");
            System.out.println("7. Salir.");
            int opc = leer.nextInt();
            System.out.println("");
            
            switch (opc) {
                case 1: 
                    System.out.println("El discriminante es: " + rs.getDiscriminante());
                    break;
                case 2: 
                    if (rs.tieneRaices()) {
                        System.out.println("La ecuación tiene dos raíces.");
                    } else {
                        System.out.println("La ecuación no tiene dos raíces.");
                    }
                    break;
                case 3: 
                    if (rs.tieneRaiz()) {
                        System.out.println("La ecuación tiene una única raíz doble.");
                    } else {
                        System.out.println("La ecuación no tiene una única raíz doble.");
                    }
                    break;
                case 4:
                    rs.imprimirRaiz();
                    break;
                case 5:
                    rs.calcular();
                    break;
                case 6:
                    rs.ingresarValores();
                    break;
                case 7:
                    System.out.println("¡Adiós!");
                    salir = false;
                    break;
                default:
                    System.out.println("La opción ingresada es inválida. Vuelva a intentarlo.");
            }
            
        } while (salir);

    }
    
}
