//Una compañía de promociones turísticas desea mantener información sobre la infraestructura
//de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
//acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
//una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
//alojamientos: Hoteles y Alojamientos Extrahoteleros.
//Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
//Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
//características de las distintas categorías son las siguientes:
//• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
//• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
//Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
//Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
//acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
//cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
//será.
//El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
//PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
//agregado por gimnasio) + (valor agregado por limosinas).
//Donde:
//Valor agregado por el restaurante:
//• $10 si la capacidad del restaurante es de menos de 30 personas.
//• $30 si está entre 30 y 50 personas.
//• $50 si es mayor de 50.
//Valor agregado por el gimnasio:
//• $50 si el tipo del gimnasio es A.
//• $30 si el tipo del gimnasio es B.
//Valor agregado por las limosinas:
//• $15 por la cantidad de limosinas del hotel.
//
//17
//En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
//hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
//Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
//cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
//Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
//disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
//indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
//campo deportivo. Realizar un programa en el que se representen todas las relaciones
//descriptas.
//Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
//• todos los alojamientos.
//• todos los hoteles de más caro a más barato.
//• todos los campings con restaurante
//• todos las residencias que tienen descuento.

package extra.pkg3.alojamientos;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel;
import Entidades.Hotel4;
import Entidades.Hotel5;
import Entidades.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Extra3Alojamientos {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        Hotel4 h4 = new Hotel4(true, 20, "Restaurante 1", 50, 100, 1, 0, "Nacho", "Caseros 1131", "Cordoba", "Nacho Gimenez");
        Hotel5 h5 = new Hotel5(true, 50, "Restaurante 2", 1, 5, 20, 100, 200, 1, 0, "Dora", "Calle 123", "Lanús", "Emiliano");
        Residencia r = new Residencia(0, true, true, true, 0, "Emiliano y Asociados", "Blablabla 432", "Rosario", "Paola Rico");
        Camping c = new Camping(0, 0, true, true, 0, "La Hortensia", "Hortensia 354", "Buenos Aires", "Agustina");
        
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        alojamientos.add(h4); alojamientos.add(h5); alojamientos.add(r); alojamientos.add(c);
        
        h4.calcularPrecio();
        System.out.println("Precio hotel 4: $" + h4.getPrecioHab());
        h5.calcularPrecio();
        System.out.println("Precio hotel 5: $" + h5.getPrecioHab());
        
    //Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
    //• todos los alojamientos.
    //• todos los hoteles de más caro a más barato.
    //• todos los campings con restaurante
    //• todos las residencias que tienen descuento.
        
        int opc;
        
        do {
        System.out.println("-------- Compañía de promociones turísticas --------");
        System.out.println("1. Listar todos los alojamientos disponibles.");
        System.out.println("2. Listar hoteles de más caro a más barato.");
        System.out.println("3. Listar todos los campings con restaurantes.");
        System.out.println("4. Listar todas las residencias con descuento.");
        System.out.println("5. Salir");
        System.out.println("-----------------------------------------------------");
        opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                
                for (Alojamiento alo : alojamientos) {
                    if (alo instanceof Hotel4 || alo instanceof Hotel5) {
                        Hotel h = (Hotel) alo;
                        h.calcularPrecio();
                    }
                    System.out.println(alo.toString());  
                }
                
                break;
                
            case 2:
                
                ArrayList<Hotel> ordenados = new ArrayList();
                
                for (Alojamiento alo : alojamientos) {
                    
                    if (alo instanceof Hotel4 || alo instanceof Hotel5) {
                        Hotel h = (Hotel) alo;
                        h.calcularPrecio();
                        ordenados.add(h);
                    }
                   
                }
                
                Collections.sort(ordenados, Comparator.comparing(Hotel::getPrecioHab).reversed());
                
                for (Hotel ordenado : ordenados) {
                    
                    System.out.println(ordenado.toString());
                    
                }
                
                break;
                
            case 3:
                
                for (Alojamiento alo : alojamientos) {
                    
                    if (alo instanceof Camping) {
                        Camping camp = (Camping) alo;
                        if (camp.isPoseeRestaurante()) {
                            System.out.println(camp.toString());
                        }
                    }
                   
                }
                
                break;
                
            case 4:
                
                for (Alojamiento alo : alojamientos) {
                    
                    if (alo instanceof Residencia) {
                        Residencia rs = (Residencia) alo;
                        if (rs.isHaceDescuento()) {
                            System.out.println(rs.toString());
                        }
                    }
                   
                }
                
                break;
                
            case 5:
                
                System.out.println("Saludos.");
                System.exit(0);
                
            default:
                System.out.println("Escribí bien boludo!!!!!!");
        }
        
        } while(opc != 5);
        
    }
    
}
