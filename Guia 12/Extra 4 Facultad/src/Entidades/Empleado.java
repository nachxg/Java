package Entidades;

public abstract class Empleado extends Persona {

    protected int anioIncorporacion;
    protected int nroDespacho;

    public Empleado(int anioIncorporacion, int nroDespacho, String nombre, String apellido, long dni, String estadoCivil) {
        super(nombre, apellido, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.nroDespacho = nroDespacho;
    }

    public Empleado() {
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

    public void reasignarDespacho(){
        System.out.println("Ingrese el número del nuevo despacho a asignar: ");
        nroDespacho = leer.nextInt();
        System.out.println("Despacho asignado correctamente.");
    }

    @Override
    public String toString() {
        
        return super.toString() + "Empleado{" + "anioIncorporacion=" + anioIncorporacion + ", nroDespacho=" + nroDespacho + '}';
    }
    
    
    
}
