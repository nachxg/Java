package Entidades;

public class Polideportivo extends Edificio {

    private String nombre;
    private String instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String instalacion) {
        this.nombre = nombre;
        this.instalacion = instalacion;
    }
    
    public Polideportivo(String nombre, String instalacion, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(String instalacion) {
        this.instalacion = instalacion;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public void calcularSuperficie() {
        
        double sup = ancho * largo;
        System.out.println("La superficie del polideportivo " + nombre + " es de: " + sup + " m2.");
        
    }

    @Override
    public void calcularVolumen() {
        
        double vol = ancho * alto * largo;
        System.out.println("El volumen del polideportivo " + nombre + " es de: " + vol + " m3.");
        
    }
}
