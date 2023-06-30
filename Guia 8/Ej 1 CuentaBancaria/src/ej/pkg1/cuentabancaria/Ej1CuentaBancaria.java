//Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
//siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
//Agregar constructor vacío, con parámetros, getters y setters.
//Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
//Método para crear cuenta pidiéndole los datos al usuario.
//Método ingresar(double): recibe una cantidad de dinero a ingresar y se le 
//sumará al saldo actual.
//Método retirar(double): recibe una cantidad de dinero a retirar y se le restara 
//al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se 
//retirará el máximo posible hasta dejar la cuenta en 0.
//Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar 
//que el usuario no saque más del 20%.
//Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
//Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

package ej.pkg1.cuentabancaria;
import CuentaBancariaServicio.CuentaBancariaServicio;
import CuentaBancariaEntidad.CuentaBancaria;
import java.util.Scanner;
public class Ej1CuentaBancaria {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria cb = cbs.crearCuenta();
        
        boolean salir = true;
        
        do {
            System.out.println(" ");
            System.out.println("==== Seleccione una operación a realizar ====");
            System.out.println("| 1. Ingresar dinero.                       |");
            System.out.println("| 2. Retirar dinero.                        |");
            System.out.println("| 3. Extracción rápida.                     |");
            System.out.println("| 4. Consultar saldo.                       |");
            System.out.println("| 5. Consultar datos.                       |");
            System.out.println("| 6. Salir.                                 |");
            System.out.println("=============================================");
            int opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    System.out.println("Su nuevo saldo es: $" + cbs.ingresar(cb));
                    break;
                case 2:
                    System.out.println("Su nuevo saldo es: $" + cbs.retirar(cb));
                    break;
                case 3:
                    System.out.println("Su nuevo saldo es: $" + cbs.extraccionRapida(cb));
                    break;
                case 4:
                    System.out.println("Su saldo actual es: $" + cb.getSaldoActual());
                    break;
                case 5:
                    System.out.println(cb.toString());
                    break;
                case 6:
                    System.out.println("Gracias por utilizar nuestro sistema.");
                    salir = false;
                    break;
            }
        } while (salir);

    }
    
}
