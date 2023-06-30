//5) Crear la clase “Tarea” con los siguientes atributos título, descripción y 
//estado (boolean). Agregar constructor vacío, con parámetros, getters y setters.
//Luego crear la clase “TareaServicio”, que contenga:
// Método para crear una Tarea: se pedirá al usuario que ingrese el título y la 
//descripción. Por defecto, al crear una tarea se tiene que asignar el valor de 
//true al atributo estado, esto indicará que la tarea está en proceso.
// Método para modificar el estado a false, esto indicará que la tarea está 
//terminada.
//Método para analizar si el estado de la tarea y que muestre si la misma está en 
//proceso o terminada.
//Método para visualizar los datos de la Tarea.

package Entidad;

public class Tarea {
    
    private String titulo;
    private String descripcion;
    private boolean estado;

    public Tarea(String titulo, String descripcion, boolean estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Tarea() {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
