//c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
//vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
//póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
//asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
//terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
//relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
//muchos a uno o de muchos a muchos.

package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Poliza {
    
    private int nroPoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int cantCuotas;
    private FormaPago formapago;
    private double montoTotalAsegurado;
    private boolean incluyeGranizo;
    private double montoMaxGranizo;
    private Cobertura tipoCobertura;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private ArrayList<Cuotas> cuotas;

    public Poliza() {
    }

    public Poliza(int nroPoliza, LocalDate fechaInicio, LocalDate fechaFin, int cantCuotas, FormaPago formapago, double montoTotalAsegurado, boolean incluyeGranizo, double montoMaxGranizo, Cobertura tipoCobertura, Cliente cliente, Vehiculo vehiculo, ArrayList<Cuotas> cuotas) {
        this.nroPoliza = nroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantCuotas = cantCuotas;
        this.formapago = formapago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoCobertura = tipoCobertura;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cuotas = cuotas;
    }

    public ArrayList<Cuotas> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuotas> cuotas) {
        this.cuotas = cuotas;
    }

    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public FormaPago getFormapago() {
        return formapago;
    }

    public void setFormapago(FormaPago formapago) {
        this.formapago = formapago;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(double montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public Cobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(Cobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Poliza{" + "nroPoliza=" + nroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", cantCuotas=" + cantCuotas + ", formapago=" + formapago + ", montoTotalAsegurado=" + montoTotalAsegurado + ", incluyeGranizo=" + incluyeGranizo + ", montoMaxGranizo=" + montoMaxGranizo + ", tipoCobertura=" + tipoCobertura + ", cliente=" + cliente + ", vehiculo=" + vehiculo + '}';
    }
    

    
    
    
}
