//
//Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
//ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
//coberturas integrales para vehículos.
//Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
//que quiere realizar la empresa.
//
//12
//a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
//cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
//domicilio, teléfono.
//b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
//modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
//c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
//vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
//póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
//asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
//terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
//relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
//muchos a uno o de muchos a muchos.
//d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
//Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
//cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
//etc.).
//Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
//requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
//relaciones.

package extra.pkg3.seguros;

import Entidades.Servicios;
import java.util.Scanner;

public class Extra3Seguros {

    public static void main(String[] args) {

        String rojo = "\033[31m";
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Servicios s = new Servicios();
        
        do {

            System.out.println("Seleccione su perfil (o 0 para salir del sistema): ");
            System.out.println("1. CLIENTE.");
            System.out.println("2. EMPLEADO.");
            int op = leer.nextInt();
            
            switch (op) {
                case 1: cliente(s); break;
                case 2: empleado(s); break;
                case 0: System.out.println("Gracias por utilizar nuestro sistema."); System.exit(0);
                default: System.out.println(rojo + "La opción ingresada es inválida. Vuelva a intentarlo.");
            }
            
        } while (true);
                
    }

    public static void cliente(Servicios s) {
            
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        boolean salir = true;
        
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Consultar datos de póliza.");
            System.out.println("2. Consultar estado de cuotas.");
            System.out.println("3. Pagar una cuota.");
            System.out.println("4. Volver a selección de perfil.");
            System.out.println("5. Salir.");
            int opc = leer.nextInt();
            switch (opc) {
                case 1: s.consultarPoliza(); break;
                case 2: s.consultarCuotas(); break;
                case 3: s.pagarCuota(); break;
                case 4: salir = false; break;
                case 5: System.out.println("Gracias por utilizar nuestro sistema."); System.exit(0);
                default: System.out.println("La opción ingresada es inválida. Vuelva a intentarlo.");
            }
                    
        } while (salir);

    }

    public static void empleado(Servicios s) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        boolean salir = true;
        
        do {
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Cargar un cliente.");
            System.out.println("2. Cargar un vehículo.");
            System.out.println("3. Registrar una póliza.");
            System.out.println("4. Listar clientes.");
            System.out.println("5. Listar vehículos.");
            System.out.println("6. Volver a selección de perfil.");
            System.out.println("7. Precargar clientes, vehículos, pólizas, cuotas.");
            System.out.println("8. Salir.");
            int opc = leer.nextInt();
            switch (opc) {
                case 1: s.cargarClientes(); break;
                case 2: s.cargarVehiculo(); break;
                case 3: s.crearPoliza(); break;
                case 4: s.listarClientes(); break;
                case 5: s.listarVehiculos(); break;
                case 6: salir = false; break;
                case 7: s.precargar(); break;
                case 8: System.out.println("Gracias por utilizar nuestro sistema."); System.exit(0);
                default: System.out.println("La opción ingresada es inválida. Vuelva a intentarlo.");
            }
            
        } while (salir);
        
    }

}
