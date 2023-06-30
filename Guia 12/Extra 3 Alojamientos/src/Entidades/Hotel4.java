package Entidades;

public class Hotel4 extends Hotel {

    private boolean gimnasio;
    private int capacidadRestaurante;
    private String nombreRestaurante;
    
    public Hotel4(boolean gimnasio, int capacidadRestaurante, String nombreRestaurante) {
        this.gimnasio = gimnasio;
        this.capacidadRestaurante = capacidadRestaurante;
        this.nombreRestaurante = nombreRestaurante;
    }

    public Hotel4(boolean gimnasio, int capacidadRestaurante, String nombreRestaurante, int cantHabitaciones, int nroCamas, int cantPisos, double precioHab) {
        super(cantHabitaciones, nroCamas, cantPisos, precioHab);
        this.gimnasio = gimnasio;
        this.capacidadRestaurante = capacidadRestaurante;
        this.nombreRestaurante = nombreRestaurante;
    }

    public Hotel4(boolean gimnasio, int capacidadRestaurante, String nombreRestaurante, int cantHabitaciones, int nroCamas, int cantPisos, double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, nroCamas, cantPisos, precioHab, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.capacidadRestaurante = capacidadRestaurante;
        this.nombreRestaurante = nombreRestaurante;
    }

    public boolean isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
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
    
    //Valor agregado por el restaurante:
    //• $10 si la capacidad del restaurante es de menos de 30 personas.
    //• $30 si está entre 30 y 50 personas.
    //• $50 si es mayor de 50.
    //Valor agregado por el gimnasio:
    //• $50 si el tipo del gimnasio es A.
    //• $30 si el tipo del gimnasio es B.
    //Valor agregado por las limosinas:
    //• $15 por la cantidad de limosinas del hotel.
    
    @Override
    public void calcularPrecio(){

        super.calcularPrecio();
        
        if (gimnasio) {
            precioHab += 50;
        } else {
            precioHab += 30;
        }
        
        if (capacidadRestaurante < 30) {
            precioHab += 10;
        } else if(capacidadRestaurante < 51) { 
            precioHab += 30;
        } else {
            precioHab += 50;
        }
        
    }
    
    
    
    
    @Override
    public String toString() {
        String tipo = "";
        if (gimnasio) {
            tipo = "A";
        } else {
            tipo = "B";
        }
        
        return 
                super.toString() + "\n> Tipo de hotel: 4 estrellas." 
                + "\n> Tipo de gimnasio: " + tipo 
                + "\n> Capacidad del restaurante: " + capacidadRestaurante 
                + "\n> Nombre del restaurante: " + nombreRestaurante
                + "\n-------------------------------------------------------";
    }
    
}
