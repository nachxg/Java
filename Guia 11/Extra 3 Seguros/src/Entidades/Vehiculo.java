//b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
//modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).

package Entidades;

public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int anio;
    private String numMotor;
    private String chasis;
    private String color;
    private Tipo tipo;


    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Vehiculo(String marca, String modelo, int anio, String numMotor, String chasis, String color, Tipo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numMotor = numMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", numMotor=" + numMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }

    
    
}
