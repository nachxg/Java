package Entidades;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Servicios {
    
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    ArrayList<Cliente> clientes = new ArrayList();
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    ArrayList<Poliza> polizas = new ArrayList();
    
    String rojo = "\033[31m";
    String celeste = "\033[36m";
    String verde = "\033[32m";
    String amarillo = "\033[33m";

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void precargar(){
        
        Cliente c1 = new Cliente("Ignacio", "Gimenez", 44296063L, "nachogxyz@gmail.com", "Caseros 1131", 3571521300L);
        Cliente c2 = new Cliente("Juan", "Perez", 12345678L, "juanperez@gmail.com", "Calle Falsa 234", 3516789101L);
        Cliente c3 = new Cliente("Flavia", "Scoppa", 20362993L, "flaviascoppa@hotmail.com", "A. Piazola 580", 3571456538L);
        Cliente c4 = new Cliente("Lola", "Pepa", 17456761L, "lolapepa@gmail.com", "Calle Real 456", 1198564567L);
        clientes.add(c1); clientes.add(c2); clientes.add(c3); clientes.add(c4);
        
        Vehiculo v1 = new Vehiculo("Toyota","Corolla",2018,"ABC123","FGH456","Negro",Tipo.AUTO);
        Vehiculo v2 = new Vehiculo("Toyota","RAV4",2023,"IJK789","LMN123","Blanco",Tipo.SUV);
        Vehiculo v3 = new Vehiculo("Ford","F150",2020,"OPQ456","RST789","Gris",Tipo.CAMIONETA);
        Vehiculo v4 = new Vehiculo("Chevrolet","Prisma",2017,"UVW123","XYZ456","Gris",Tipo.AUTO);
        vehiculos.add(v1); vehiculos.add(v2); vehiculos.add(v3); vehiculos.add(v4);
        
        ArrayList<Cuotas> cuotas = new ArrayList();
        
        for (int i = 1; i < 13; i++) {
            Cuotas cuota = new Cuotas(i,1000000/12,false,LocalDate.of(2022,1,1).plusMonths(i),FormaPago.DEBITO_AUTOMATICO);
            cuotas.add(cuota);
        }
        
        Poliza p1 = new Poliza(1,LocalDate.of(2022,1,1),LocalDate.of(2023,12,1),12,FormaPago.DEBITO_AUTOMATICO,1000000,true,50000,Cobertura.TERCERO_CON_GRANIZO,c1,v1,cuotas);
        Poliza p2 = new Poliza(1,LocalDate.of(2022,1,1),LocalDate.of(2023,12,1),12,FormaPago.DEBITO_AUTOMATICO,1000000,true,50000,Cobertura.TERCERO_CON_GRANIZO,c2,v2,cuotas);
        Poliza p3 = new Poliza(1,LocalDate.of(2022,1,1),LocalDate.of(2023,12,1),12,FormaPago.DEBITO_AUTOMATICO,1000000,true,50000,Cobertura.TERCERO_CON_GRANIZO,c3,v3,cuotas);
        Poliza p4 = new Poliza(1,LocalDate.of(2022,1,1),LocalDate.of(2023,12,1),12,FormaPago.DEBITO_AUTOMATICO,1000000,true,50000,Cobertura.TERCERO_CON_GRANIZO,c4,v4,cuotas);
        polizas.add(p1); polizas.add(p2); polizas.add(p3); polizas.add(p4); 
        
        System.out.println("Datos precargados correctamente.");

    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void cargarClientes() {
        
        System.out.println(celeste+"Ingrese los siguientes datos del cliente.");
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Apellido: ");
        String apellido = leer.next();
        System.out.println("DNI: ");
        long dni = leer.nextLong();
        System.out.println("Mail: ");
        String mail = leer.next();
        System.out.println("Domicilio: ");
        String domicilio = leer.next();
        System.out.println("Teléfono: ");
        long telefono = leer.nextLong();
        
        Cliente c = new Cliente(nombre,apellido,dni,mail,domicilio,telefono);
        
        clientes.add(c);
        System.out.println(celeste+"Cliente registrado correctamente.");
        
    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void cargarVehiculo(){

        System.out.println(celeste+"Ingrese los siguientes datos del vehículo.");
        System.out.println("Marca: ");
        String marca = leer.next();
        System.out.println("Modelo: ");
        String modelo = leer.next();
        System.out.println("Año: ");
        int anio = Integer.parseInt(leer.next());
        System.out.println("Nro. motor: ");
        String nroMotor = leer.next();
        System.out.println("Nro. chasis: ");
        String nroChasis = leer.next();
        System.out.println("Color: ");
        String color = leer.next();
        System.out.println("Tipo (Admitidos: " + Tipo.AUTO + ", " + Tipo.SUV + ", " + Tipo.CAMIONETA + "): ");
        String tipo = leer.next().toUpperCase();
        
        Vehiculo v = new Vehiculo(marca,modelo,anio,nroMotor,nroChasis,color,Tipo.valueOf(tipo));
        
        vehiculos.add(v);
        System.out.println(celeste+"Vehículo registrado correctamente.");
        
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void crearPoliza() {
            
        boolean incluyeGranizo = false;
        double montoMax = 0;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        
        System.out.println(celeste+"Ingrese los siguientes datos de la póliza: ");
        System.out.println("Número: ");
        int nroPoliza = leer.nextInt();
        
        System.out.println("Fecha de inicio (DD/MM/AAAA): ");
        String fechaInicioStr = leer.next();
        LocalDate fechaInicio = LocalDate.parse(fechaInicioStr, formato);
        
        System.out.println("Fecha de finalización (DD/MM/AAAA): ");
        String fechaFinStr = leer.next();
        LocalDate fechaFin = LocalDate.parse(fechaFinStr, formato);
        
        System.out.println("Cantidad de cuotas: ");
        int cantCuotas = leer.nextInt();
        
        System.out.println("Forma de pago (Admitidos: " + FormaPago.CONTADO + ", " + FormaPago.CREDITO + ", " 
                 + FormaPago.TRANSFERENCIA + FormaPago.CUOTAS + FormaPago.DEBITO_AUTOMATICO + FormaPago.EFECTIVO + "): ");
        String formaPago = leer.next().toUpperCase();
        
        System.out.println("Monto total asegurado: ");
        double montoTotal = leer.nextDouble();
        
        System.out.println("¿Incluye granizo? S/N");
        String opc = leer.next();
        if (opc.equalsIgnoreCase("S")) {
            System.out.println("Monto máximo por granizo: ");
            montoMax = leer.nextDouble();
            incluyeGranizo = true;
        }
        
        System.out.println("Tipo de cobertura (Admitidos: " + Cobertura.TERCEROS + ", " + Cobertura.TERCERO_CON_GRANIZO 
                + ", " + Cobertura.TODO_RIESGO + "): ");
        String cobertura = leer.next().toUpperCase();

        System.out.print("Seleccione un cliente:");
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            System.out.println((i + 1) + ". " + cliente.getDni() + " - " + cliente.getNombre() + " " + cliente.getApellido());
        }
        
        int clienteIndex = leer.nextInt() - 1;
        Cliente cliente = clientes.get(clienteIndex);
        
        System.out.print("Seleccione un vehículo:");
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            System.out.println((i + 1) + ". " + vehiculo.getChasis() + " - " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        }
        
        int vehiculoIndex = leer.nextInt() - 1;
        Vehiculo vehiculo = vehiculos.get(vehiculoIndex);
        
        ArrayList<Cuotas> cuotas = new ArrayList();
        
        for (int i = 1; i < cantCuotas+1; i++) {
            Cuotas cuota = new Cuotas(i,montoTotal/cantCuotas,false,fechaInicio.plusMonths(i),FormaPago.DEBITO_AUTOMATICO);
            cuotas.add(cuota);
        }
        
        Poliza p = new Poliza(nroPoliza,fechaInicio,fechaFin,cantCuotas,FormaPago.valueOf(formaPago),montoTotal,incluyeGranizo,montoMax,Cobertura.valueOf(cobertura),cliente,vehiculo,cuotas);
        
        polizas.add(p);
        System.out.println(celeste+"Póliza registrada correctamente.");
        
        System.out.println(polizas);
        
    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void consultarPoliza() {

        boolean salir = true;

        do {
            System.out.print("Para acceder a los datos de su póliza, ingrese su DNI: ");
            long dni = leer.nextLong();

            for (Poliza p : polizas) {

                if (p.getCliente().getDni().equals(dni)) {
                    System.out.println("_____________________________________");
                    System.out.printf("|%-14s |%-19d|%n", "Nº POLIZA", p.getNroPoliza());
                    System.out.printf("|%-14s |%-19s|%n", "FECHA INICIO", p.getFechaInicio());
                    System.out.printf("|%-14s |%-19s|%n", "FECHA FIN", p.getFechaFin());
                    System.out.printf("|%-14s |%-19d|%n", "CUOTAS", p.getCantCuotas());
                    System.out.printf("|%-14s |%-19s|%n", "FORMA PAGO", p.getFormapago());
                    System.out.printf("|%-14s |%-19f|%n", "TOTAL ASEG.", p.getMontoTotalAsegurado());
                    System.out.printf("|%-14s |%-19s|%n", "GRANIZO", p.isIncluyeGranizo());
                    System.out.printf("|%-14s |%-19f|%n", "MAX. GRANIZO", p.getMontoMaxGranizo());
                    System.out.printf("|%-14s |%-19s|%n", "COBERTURA", p.getTipoCobertura());
                    System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
                    salir = false;
                    break;
                }
            }
        } while (salir);

    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void listarClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            System.out.println((i + 1) + ". " + cliente.getNombre() + " " + cliente.getApellido() + ", DNI Nº " + cliente.getDni());
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void listarVehiculos() {
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            System.out.println((i + 1) + ". " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " CHASIS Nº " + vehiculo.getChasis());
        }
    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    public void consultarCuotas(){
        
        System.out.print("Para consultar el estado de sus cuotas, ingrese su DNI: ");
        long dni = leer.nextLong();
        boolean salir = true;
        //nro cuota montocuota pagada fechavenc
        do {
            for (Poliza p : polizas) {
                
                if (p.getCliente().getDni().equals(dni)) {
                    
                    ArrayList<Cuotas> cuotas = p.getCuotas();
                    System.out.println("_________________________________________________________________________________");
                    System.out.printf("|%-19s|%-19s|%-19s|%-19s|%n", "Nº CUOTA", "MONTO", "PAGADA", "VENCIMIENTO");
                    for (Cuotas cuota : cuotas) {
                        String sn;
                        boolean estado = cuota.isPagada();
                        if (estado) {
                            sn = "SI";
                        } else {
                            sn = "NO";
                        }
                        
                        System.out.printf("|%-19s|%-19s|%-19s|%-19s|%n", cuota.getNroCuota(), "$"+cuota.getMontoTotalCuota(), sn, cuota.getFechaVencimiento());
                    }
                    System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
                    salir = false;
                    break;
                }
            }
        } while (salir);

    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    
    public void pagarCuota(){
    
        System.out.println("Ingrese su Nº de DNI: ");
        long dni = leer.nextLong();
        int opc = 0;
        
        buclePoliza:
        for (Poliza p : polizas) {

            if (p.getCliente().getDni().equals(dni)) {
                ArrayList<Cuotas> cuotas = p.getCuotas();
                ArrayList<Cuotas> pagas = new ArrayList();
                
                for (Cuotas c : cuotas){
                    if (c.isPagada()) {
                       pagas.add(c);
                    }
                }
                
                bucleCuotas:
                for (Cuotas c : cuotas) {
                    
                    if (!c.isPagada()) {

                        System.out.println("Usted tiene " + (cuotas.size() - pagas.size()) + " cuotas pendientes.");
                        System.out.println("Seleccione una forma de pago: ");
                        System.out.println("1. EFECTIVO. ");
                        System.out.println("2. CREDITO. ");
                        System.out.println("3. TRANSFERENCIA.");
                        System.out.println("4. DEBITO AUTOMATICO.");
                        System.out.println("5. CANCELAR.");
                        int fp = leer.nextInt();

                        if (fp != 5 && opc != 2) {
                            System.out.println("Cuota Nº " + c.getNroCuota() + " pagada correctamente.");
                            c.setPagada(true);
                            pagas.add(c);
                            System.out.println("Presione 1 para continuar pagando, o 2 para volver al menú.");
                            opc = leer.nextInt();
                            if (opc == 2) {
                                System.out.println("Volviendo al menú...");
                                break buclePoliza;
                            }
                        } else {
                            System.out.println("Volviendo al menú...");
                            break buclePoliza;
                        }

                    }
                    
                }  
                
            }
            
        }
    
    }
    
}
