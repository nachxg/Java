//Vamos a usar la clase Date que ya existe en Java. Crearemos la clase 
//FechaService, en paquete Servicios, que tenga los siguientes métodos:
//Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
//Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el 
//objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Método fechaActual que cree un objeto fecha con el día actual. Para esto 
//usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
//El método debe retornar el objeto Date.
//Método diferencia que reciba las dos fechas por parámetro y retorna la 
//diferencia de años entre una y otra (edad del usuario).

package Servicios;
import java.util.Scanner;
import java.util.Date;

public class FechaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento() {
        
        System.out.println("Ingrese una fecha de nacimiento.");
        System.out.println("Ingrese el día: ");
        int dd = leer.nextInt();
        System.out.println("Ingrese el mes en números: ");
        int mm = leer.nextInt();
        System.out.println("Ingrese el año: ");
        int aa = leer.nextInt();
        
        return new Date(aa-1900,mm-1,dd);
    }
    
    public Date fechaActual() {
        return new Date();
    }
    
    public void diferencia(Date fechaActual, Date fechaNac) {
//        int a = fechaActual.getYear() - fechaNac.getYear();
        long b = (fechaActual.getTime() - fechaNac.getTime())/31536000000L;

//        if (fechaActual.getMonth() < fechaNac.getMonth() ) {
//            a--;     
//        }

        System.out.println("Edad: " + b);
    }

}
