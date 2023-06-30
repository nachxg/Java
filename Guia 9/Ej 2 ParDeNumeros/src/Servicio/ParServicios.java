//Realizar una clase llamada ParDeNumeros que tenga como atributos dos números 
//reales con los cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
//Método mostrarValores que muestra cuáles son los dos números guardados.
//Método devolverMayor para retornar cuál de los dos atributos tiene el mayor 
//valor
//Método calcularPotencia para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

package Servicio;
import Entidad.ParDeNumeros;



public class ParServicios {
    
    ParDeNumeros p = new ParDeNumeros();
    
    public void mostrarValores(ParDeNumeros p) {
        
        System.out.println("Numero 1: " + p.getN1());
        System.out.println("Numero 2: " + p.getN2());

    }
    
    public double devolverMayor(ParDeNumeros p) {
        return Math.max(p.getN1(),p.getN2());
    }
    
    public double calcularPotencia(ParDeNumeros p) {
        
        double n1 = Math.round(p.getN1());
        double n2 = Math.round(p.getN2());
        System.out.println("n1 = " + n1 + " n2 = " + n2);
        return Math.pow(Math.max(n2,n1), Math.min(n2,n1));
    }
    
    public double calculaRaiz(ParDeNumeros p) {
        return Math.sqrt(Math.min(p.getN1(),p.getN2()));
    }
    
}
