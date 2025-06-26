/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7_introprogracasoevaluado.pkg1;

/**
 *
 * @author andreyvargassolis
 */
public class Facturas {
    //atributos
    private String nombreCliente;
    private double cédula;
    private String codigoFactura;
    private int montoFactura;
    private int mes;
    private String productosElect;
    private String productosAuto;
    private String productosConstru;
    private int cantidadElect;
    private int cantidadAuto;
    private int cantidadConstru;

    public Facturas(String nombreCliente, double cédula, String codigoFactura, int montoFactura, int mes, String productosElect, String productosAuto, String productosConstru) {
        this.nombreCliente = nombreCliente;
        this.cédula = cédula;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.productosElect = productosElect;
        this.productosAuto = productosAuto;
        this.productosConstru = productosConstru;
    }
    //contructor
    public Facturas() {
    
}

    //setters&getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getCédula() {
        return cédula;
    }

    public void setCédula(double cédula) {
        this.cédula = cédula;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(int montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getProductosElect() {
        return productosElect;
    }

    public void setProductosElect(String productosElect) {
        this.productosElect = productosElect;
    }

    public String getProductosAuto() {
        return productosAuto;
    }

    public void setProductosAuto(String productosAuto) {
        this.productosAuto = productosAuto;
    }

    public String getProductosConstru() {
        return productosConstru;
    }

    public void setProductosConstru(String productosConstru) {
        this.productosConstru = productosConstru;
    }
    
    public String getObtenesMes() {
        return switch (mes) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "Mes no válido";
        };
    }

    public int getCantidadElect() {
        return cantidadElect;
    }

    public void setCantidadElect(int cantidadElect) {
        this.cantidadElect = cantidadElect;
    }

    public int getCantidadAuto() {
        return cantidadAuto;
    }

    public void setCantidadAuto(int cantidadAuto) {
        this.cantidadAuto = cantidadAuto;
    }

    public int getCantidadConstru() {
        return cantidadConstru;
    }

    public void setCantidadConstru(int cantidadConstru) {
        this.cantidadConstru = cantidadConstru;
    }
    


    }
    
            
    

