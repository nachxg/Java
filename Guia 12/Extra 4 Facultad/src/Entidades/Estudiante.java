package Entidades;

public final class Estudiante extends Persona {

    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, long dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
    
    public void matriculacion() {
        System.out.println("Ingrese el nuevo curso del estudiante: ");
        curso = leer.next();
        System.out.println("Estudiante matriculado correctamente.");
    }
    
    @Override
    public void cambiarEstadoCivil(){
        super.cambiarEstadoCivil();
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "curso=" + curso + '}';
    }
    
}
