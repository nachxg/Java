package Entidades;

import java.util.Scanner;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected long dni;
    protected String estadoCivil;
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    public Persona() {
    }

    public Persona(String nombre, String apellido, long dni, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public void cambiarEstadoCivil(){
        System.out.println("Ingrese el nuevo estado civil: ");
        estadoCivil = leer.next();
        System.out.println("Estado civil actualizado correctamente.");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
}
