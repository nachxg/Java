//Realizar una clase llamada Persona en el paquete de entidades que tengan los 
//siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ 
//para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo. 
//Agregar constructores, getters y setters.
//En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
//Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
//devuelve un booleano.
//Metodo crearPersona(): el método crear persona, le pide los valores de los 
//atributos al usuario y después se le asignan a sus respectivos atributos para 
//llenar el objeto Persona. Además, comprueba que el sexo introducido sea 
//correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje

//Método calcularIMC(): calculara si la persona está en su peso ideal 
//(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor 
//menor que 20, significa que la persona está por debajo de su peso ideal y la 
//función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
//(incluidos), significa que la persona está en su peso ideal y la función 
//devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 
//25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
//llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
//está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e 
//indicar para cada objeto si la persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y 
//esMayorDeEdad en distintas variables(arrays), para después calcular un 
//porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en 
//su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de 
//cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos 
//métodos adicionales.

package PersonaServicio;
import Entidades.Persona;
import java.util.Scanner;
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p1 = new Persona();
    
    public boolean esMayorDeEdad(Persona p1) {
        return p1.getEdad() >= 18;
    }
    
    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = leer.next();
        System.out.println("Ingrese la edad de la persona: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese el sexo de la persona: ");
        String sexo = leer.next();
        if (!sexo.equalsIgnoreCase("h") || !sexo.equalsIgnoreCase("m") || !sexo.equalsIgnoreCase("o")) {
            while (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("o")) {
                System.out.println("El caracter ingresado no es válido. Vuelva a intentarlo.");
                sexo = leer.next();
            }
        } 

        System.out.println("Ingrese el peso de la persona: ");
       double peso = leer.nextDouble();
        System.out.println("Ingrese la altura de la persona: ");
       double altura = leer.nextDouble();
        
        return new Persona(nombre,edad,sexo,peso,altura);
    }
    
    public int calcularIMC(Persona p1) {
        //(peso en kg/(altura^2 en mt2))
        
        System.out.println(p1.getPeso());
        System.out.println(p1.getAltura());
        double imc = p1.getPeso()/(p1.getAltura()*p1.getAltura());
        
        if (imc > 25) {
            return 1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return -1;
        }
    }
}
