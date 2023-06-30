//Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
//edificio tendrá como métodos:
//• Método calcularSuperficie(): calcula la superficie del edificio.
//• Método calcularVolumen(): calcula el volumen del edifico.
//Estos métodos serán abstractos y los implementarán las siguientes clases:
//• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
//Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
//• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
//por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
//los atributos del padre.
//De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.
//Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
//dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
//métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
//superficie y el volumen de cada edificio.
//Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
//techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
//cantPersonas() y mostrar los resultados de cada edificio de oficinas.

package extra.pkg2.edificio;

import Entidades.Edificio;
import Entidades.Oficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

public class Extra2Edificio {

    public static void main(String[] args) {
        
        ArrayList<Edificio> edificios = new ArrayList();
        
        Oficinas o1 = new Oficinas(5,10,10,20F,10F,5F);
        Oficinas o2 = new Oficinas(20,40,15,40F,20F,10F);
        Polideportivo p1 = new Polideportivo("Nacho","Techado",5F,20F,40F);       
        Polideportivo p2 = new Polideportivo("Agustina","Abierto",5F,20F,40F);    
        
        edificios.add(o1); edificios.add(o2); edificios.add(p1); edificios.add(p2);
        
        int i = 1;
        int techados = 0;
        int abiertos = 0;
        
        for (Edificio edi : edificios) {
            
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Edificio Nº " + i + ":");
            edi.calcularSuperficie();
            edi.calcularVolumen();
            
            if (edi instanceof Oficinas) {
                Oficinas ofi = (Oficinas) edi;
                ofi.cantPersonas();
            }
            
            if (edi instanceof Polideportivo) {
                
                if (((Polideportivo) edi).getInstalacion().equalsIgnoreCase("Techado")) {
                    techados++;
                } else {
                    abiertos++;
                }
                
            }
            System.out.println("-----------------------------------------------------------------------");
            i++;
        }
        
        System.out.println("Cantidad de polideportivos techados: " + techados + ".");
        System.out.println("Cantidad de polideportivos abiertos: " + abiertos + ".");
        
    }
    
}
