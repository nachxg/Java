package Entidades;

public final class Camping extends Extrahotelero {

    private int maxCarpas;
    private int cantBanios;
    private boolean poseeRestaurante;

    public Camping(int maxCarpas, int cantBanios, boolean poseeRestaurante) {
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.poseeRestaurante = poseeRestaurante;
    }

    public Camping(int maxCarpas, int cantBanios, boolean poseeRestaurante, boolean privado, int superficie) {
        super(privado, superficie);
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.poseeRestaurante = poseeRestaurante;
    }

    public Camping(int maxCarpas, int cantBanios, boolean poseeRestaurante, boolean privado, int superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.cantBanios = cantBanios;
        this.poseeRestaurante = poseeRestaurante;
    }

    public int getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(int maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isPoseeRestaurante() {
        return poseeRestaurante;
    }

    public void setPoseeRestaurante(boolean poseeRestaurante) {
        this.poseeRestaurante = poseeRestaurante;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
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

    @Override
    public String toString() {
        return super.toString() + "Camping{" + "maxCarpas=" + maxCarpas + ", cantBanios=" + cantBanios + ", poseeRestaurante=" + poseeRestaurante + '}';
    }
    
}
