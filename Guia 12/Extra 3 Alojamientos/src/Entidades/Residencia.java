package Entidades;

public final class Residencia extends Extrahotelero {

    private int cantHabitaciones;
    private boolean haceDescuento;
    private boolean poseeCampo;

    public Residencia(int cantHabitaciones, boolean haceDescuento, boolean poseeCampo) {
        this.cantHabitaciones = cantHabitaciones;
        this.haceDescuento = haceDescuento;
        this.poseeCampo = poseeCampo;
    }

    public Residencia(int cantHabitaciones, boolean haceDescuento, boolean poseeCampo, boolean privado, int superficie) {
        super(privado, superficie);
        this.cantHabitaciones = cantHabitaciones;
        this.haceDescuento = haceDescuento;
        this.poseeCampo = poseeCampo;
    }

    public Residencia(int cantHabitaciones, boolean haceDescuento, boolean poseeCampo, boolean privado, int superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.haceDescuento = haceDescuento;
        this.poseeCampo = poseeCampo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isHaceDescuento() {
        return haceDescuento;
    }

    public void setHaceDescuento(boolean haceDescuento) {
        this.haceDescuento = haceDescuento;
    }

    public boolean isPoseeCampo() {
        return poseeCampo;
    }

    public void setPoseeCampo(boolean poseeCampo) {
        this.poseeCampo = poseeCampo;
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
        return super.toString() + "Residencia{" + "cantHabitaciones=" + cantHabitaciones + ", haceDescuento=" + haceDescuento + ", poseeCampo=" + poseeCampo + '}';
    }

}
