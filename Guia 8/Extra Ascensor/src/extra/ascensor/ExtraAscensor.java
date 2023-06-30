//4) Crea una clase "Ascensor" con las propiedades "pisoActual" y "maximoPisos".
//Crea un constructor para inicializar los valores de las propiedades.
//Crea un método "subir" que aumente en uno el valor de la propiedad "pisoActual"
//si aún no se ha alcanzado el "maximoPisos".
//Crea un método "bajar" que disminuya en uno el valor de la propiedad "pisoActual" 
//si no se ha alcanzado el piso "0".
//Crea un método "irA" que reciba como parámetro el número de piso al que se desea
//ir y que modifique la propiedad "pisoActual" para que tenga ese valor.
//Crea un programa que cree un objeto "Ascensor" con un "maximoPisos" de 10. 
//Simula el comportamiento del ascensor moviéndolo hacia arriba y hacia abajo, 
//yendo a un piso específico, y mostrando en pantalla el piso actual después de 
//cada movimiento.

package extra.ascensor;
import Entidad.Ascensor;
import Servicio.AscensorServicio;
import java.util.Scanner;
public class ExtraAscensor {

    public static void main(String[] args) {
        
        boolean salir = true;
        Scanner leer = new Scanner(System.in);
        AscensorServicio ascServ = new AscensorServicio();
        
        Ascensor asc = ascServ.crearAsc();
        
        do {
            System.out.println("1. Subir.");
            System.out.println("2. Bajar.");
            System.out.println("3. Elegir piso.");
            int opc = leer.nextInt();
            switch (opc) {
                case 1: 
                    ascServ.subir();
                    break;
                case 2:
                    ascServ.bajar();
                    break;
                case 3: 
                    System.out.println("Ingrese a qué piso desea ir: ");
                    int piso = leer.nextInt();
                    while (piso > 10 || piso < 0) {
                        System.out.println("El piso ingresado no es válido. Vuelva a intentar: ");
                        piso = leer.nextInt();
                    }
                    ascServ.irA(piso);
                    break;
            }
            System.out.println("");
        } while (salir);

    }
    
}
