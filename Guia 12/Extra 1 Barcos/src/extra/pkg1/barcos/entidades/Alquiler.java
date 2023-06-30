//En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
//nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
//amarre y el barco que lo ocupará.
//Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
//Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
//• Número de mástiles para veleros.
//• Potencia en CV para barcos a motor.
//• Potencia en CV y número de camarotes para yates de lujo.
//Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
//alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
//multiplicando por 10 los metros de eslora).
//En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
//sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
//en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
//el número de camarotes.
//Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
//métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
//precio final de su alquiler.

package extra.pkg1.barcos.entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    
    private String nombre;
    private long dni;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private int posicionAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, long dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    //Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    //alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
    //multiplicando por 10 los metros de eslora).

    public double calcularPrecioAlquiler() {
        long diasOcupacion = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        double modulo = barco.calcularModulo();
        return diasOcupacion * modulo;
    }
    
}
