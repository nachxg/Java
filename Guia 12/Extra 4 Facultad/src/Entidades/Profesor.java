package Entidades;

public final class Profesor extends Empleado {

    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, int anioIncorporacion, int nroDespacho, String nombre, String apellido, long dni, String estadoCivil) {
        super(anioIncorporacion, nroDespacho, nombre, apellido, dni, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(int nroDespacho) {
        this.nroDespacho = nroDespacho;
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

    public void cambiarDepartamento() {
        System.out.println("Ingrese el nuevo departamento a asignar: ");
        departamento = leer.next();
        System.out.println("Departamento asignado correctamente.");
    }

    @Override
    public void reasignarDespacho() {
        super.reasignarDespacho();
    }

    @Override
    public void cambiarEstadoCivil() {
        super.cambiarEstadoCivil();
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "departamento=" + departamento + '}';
    }
    
    
    
}
