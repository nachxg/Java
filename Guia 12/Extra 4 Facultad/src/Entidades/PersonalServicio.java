package Entidades;

public final class PersonalServicio extends Empleado {

    private String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, int anioIncorporacion, int nroDespacho, String nombre, String apellido, long dni, String estadoCivil) {
        super(anioIncorporacion, nroDespacho, nombre, apellido, dni, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
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

    public void trasladarSeccion() {
        System.out.println("Ingrese la nueva sección a trasladar: ");
        seccion = leer.next();
        System.out.println("Personal trasladado correctamente.");
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
        return super.toString() + "PersonalServicio{" + "seccion=" + seccion + '}';
    }
    
    
    
}
