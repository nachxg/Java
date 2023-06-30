package Entidades;

public abstract class Hotel extends Alojamiento {

    protected int cantHabitaciones;
    protected int nroCamas;
    protected int cantPisos;
    protected double precioHab;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int nroCamas, int cantPisos, double precioHab) {
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

    public Hotel(int cantHabitaciones, int nroCamas, int cantPisos, double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public double getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(double precioHab) {
        this.precioHab = precioHab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    //El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
    //PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
    //agregado por gimnasio) + (valor agregado por limosinas).
    //Donde:
    //Valor agregado por el restaurante:
    //• $10 si la capacidad del restaurante es de menos de 30 personas.
    //• $30 si está entre 30 y 50 personas.
    //• $50 si es mayor de 50.
    //Valor agregado por el gimnasio:
    //• $50 si el tipo del gimnasio es A.
    //• $30 si el tipo del gimnasio es B.
    //Valor agregado por las limosinas:
    //• $15 por la cantidad de limosinas del hotel.
    
    public void calcularPrecio() {
        
        precioHab = 50 + (nroCamas * cantHabitaciones);
        
    }

    @Override
    public String toString() {
        return 
                super.toString() 
                + "\n> Cantidad de habitaciones: " + cantHabitaciones 
                + "\n> Número de camas: " + nroCamas 
                + "\n> Pisos: " + cantPisos 
                + "\n> Precio por habitación: " + precioHab;
    }
    
}
