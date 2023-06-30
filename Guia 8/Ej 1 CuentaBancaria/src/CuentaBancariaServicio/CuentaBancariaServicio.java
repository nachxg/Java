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
package CuentaBancariaServicio;
import CuentaBancariaEntidad.CuentaBancaria;
import java.util.Scanner;
public class CuentaBancariaServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public CuentaBancaria crearCuenta() {
        
        int numeroCuenta = (int) (Math.random() * 100);
        double saldoActual = 0;
        System.out.println("Bienvenido. Creando cuenta...");
        System.out.println("Ingrese su DNI: ");
        long dniCliente = leer.nextLong();
        System.out.println("Generando su número de cuenta...");
        System.out.println("Su nuevo Nº de cuenta es: " + numeroCuenta);
        System.out.println("Su saldo inicial es: $" + saldoActual);
        
        return new CuentaBancaria(numeroCuenta,dniCliente,saldoActual);
    }
    
    public double ingresar(CuentaBancaria cb) {
        System.out.println("Especifique el monto a ingresar: ");
        double ing = leer.nextDouble();
        System.out.println("Ha ingresado $" + ing + " exitosamente.");
        ing += cb.getSaldoActual();
        cb.setSaldoActual(ing);
        return cb.getSaldoActual();
    }
    
    public double retirar(CuentaBancaria cb) {
        System.out.println("Especifique el monto a retirar: ");
        double ing = leer.nextDouble();
        System.out.println("Ha retirado $" + ing + " exitosamente.");
        ing = cb.getSaldoActual() - ing;
        cb.setSaldoActual(ing);
        return cb.getSaldoActual();
    }
    
    public double extraccionRapida(CuentaBancaria cb) {

        System.out.println("Se retirará el 20% de su saldo.");
        System.out.println("Ha retirado $" + cb.getSaldoActual() * 0.2 + " exitosamente.");
        cb.setSaldoActual(cb.getSaldoActual() - (cb.getSaldoActual() * 0.2));
        return cb.getSaldoActual();
    }
    
}
