//2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
//tendrá como atributos el nombre y discoConMasVentas.
//Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
//objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
//cada cantante y su disco con más ventas por pantalla.
//Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
//agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
//usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
//cambios.

package CantanteFamoso;

public class CantanteFamoso {
    
    private String nombre;
    private String discoConMasVenta;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoConMasVenta) {
        this.nombre = nombre;
        this.discoConMasVenta = discoConMasVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVenta() {
        return discoConMasVenta;
    }

    public void setDiscoConMasVenta(String discoConMasVenta) {
        this.discoConMasVenta = discoConMasVenta;
    }

    @Override
    public String toString() {
        return "Cantante: " + nombre + " Disco: " + discoConMasVenta + "\n";
    }
    
}
