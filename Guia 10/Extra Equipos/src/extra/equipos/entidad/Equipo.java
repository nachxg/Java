//2) En este ejercicio vamos a mostrar la tabla de posiciones final de un torneo del deporte que deseen. Para ello deberán 
//crear una clase llamada "EquipoDe…" que represente a un equipo del deporte seleccionado. La clase debe tener los siguientes 
//atributos: nombre del equipo, ciudad, cantidad de partidos jugados, ganados, perdidos y empatados, y puntos totales.
//En el programa principal, crear una lista de tipo "EquipoDe…" y agregar 10 objetos de tipo equipo a la lista. Luego, mostrar 
//por pantalla de forma ordenada según cantidad de puntos los nombres de cada equipo, su cantidad de puntos, partidos jugados, 
//ganados, perdidos y empatados.
//Una vez finalizado el torneo, determinar el equipo ganador, eliminar al último equipo de la tabla por haber descendido, sumar 
//al nuevo equipo que ascendió de la división inferior, reiniciar los valores de partidos y puntos a 0 para el inicio del 
//siguiente campeonato y mostrar la lista en orden alfabético de los equipos.

package extra.equipos.entidad;

public class Equipo {
    
    private String nombreEquipo;
    private String ciudad;
    private Integer cantidadPartidos;
    private Integer ganados;
    private Integer perdidos;
    private Integer empatados;
    private Integer puntosTotales;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, String ciudad, Integer cantidadPartidos, Integer ganados, Integer perdidos, Integer empatados, Integer puntosTotales) {
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.cantidadPartidos = cantidadPartidos;
        this.ganados = ganados;
        this.perdidos = perdidos;
        this.empatados = empatados;
        this.puntosTotales = puntosTotales;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCantidadPartidos() {
        return cantidadPartidos;
    }

    public void setCantidadPartidos(Integer cantidadPartidos) {
        this.cantidadPartidos = cantidadPartidos;
    }

    public Integer getGanados() {
        return ganados;
    }

    public void setGanados(Integer ganados) {
        this.ganados = ganados;
    }

    public Integer getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(Integer perdidos) {
        this.perdidos = perdidos;
    }

    public Integer getEmpatados() {
        return empatados;
    }

    public void setEmpatados(Integer empatados) {
        this.empatados = empatados;
    }

    public Integer getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(Integer puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    @Override
    public String toString() {
        return  nombreEquipo + ciudad + cantidadPartidos + ganados +  perdidos +  empatados + puntosTotales ;
    }
    
    
    
    
}
