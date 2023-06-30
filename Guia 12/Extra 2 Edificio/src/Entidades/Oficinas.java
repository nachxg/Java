package Entidades;


import java.util.Scanner;

public class Oficinas extends Edificio {

    private int nroOficinas;
    private int personasPorOficina;
    private int nroPisos;
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public Oficinas(int nroOficinas, int personasPorOficina, int nroPisos) {
        this.nroOficinas = nroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.nroPisos = nroPisos;
    }

    public Oficinas(int nroOficinas, int personasPorOficina, int nroPisos, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.nroOficinas = nroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.nroPisos = nroPisos;
    }

    public Oficinas() {
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
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
    
    //De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
    //usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
    //(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
    //cuantas personas entrarían en un piso y cuantas en todo el edificio.
    
    public void cantPersonas() {
        
        if (nroPisos == 0 && nroOficinas == 0 && personasPorOficina == 0) {
            System.out.println("Ingrese la cantidad de oficinas por piso: ");
            nroOficinas = leer.nextInt();

            System.out.println("Ingrese la capacidad de personas por oficina: ");
            personasPorOficina = leer.nextInt();

            System.out.println("Ingrese el número de pisos del edificio: ");
            nroPisos = leer.nextInt();
        }

        System.out.println("Capacidad máxima de personas por piso: " + nroOficinas * personasPorOficina + " personas.");
        System.out.println("Capacidad máxima del edificio: " + nroOficinas * personasPorOficina * nroPisos + " personas.");
        
    }
    
    @Override
    public void calcularSuperficie() {
        
        double sup = ancho * largo;
        System.out.println("La superficie de cada piso del edificio es de: " + sup + " m2.");
        System.out.println("La superficie total del edificio es de: " + sup * nroPisos + " m2.");
        
    }

    @Override
    public void calcularVolumen() {
        
        double vol = ancho * alto * largo;
        System.out.println("El volumen del edificio es de: " + vol + " m3.");

    }
}
