//d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
//Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
//cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
//etc.).

package Entidades;

import java.time.LocalDate;

public class Cuotas {
    
    private int nroCuota;
    private double montoTotalCuota;
    private boolean pagada;
    private LocalDate fechaVencimiento;
    private FormaPago formapago;

    //nro cuota montocuota pagada fechavenc
    
    public Cuotas() {
    }

    public Cuotas(int nroCuota, double montoTotalCuota, boolean pagada, LocalDate fechaVencimiento, FormaPago formapago) {
        this.nroCuota = nroCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formapago = formapago;
    }

    public int getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
    }

    public double getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(double montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public FormaPago getFormapago() {
        return formapago;
    }

    public void setFormapago(FormaPago formapago) {
        this.formapago = formapago;
    }

    @Override
    public String toString() {
        return "Cuotas{" + "nroCuota=" + nroCuota + ", montoTotalCuota=" + montoTotalCuota + ", pagada=" + pagada + ", fechaVencimiento=" + fechaVencimiento + ", formapago=" + formapago + '}';
    }
    
}
