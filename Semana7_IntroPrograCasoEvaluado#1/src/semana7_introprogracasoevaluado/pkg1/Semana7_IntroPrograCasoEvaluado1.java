/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana7_introprogracasoevaluado.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author andreyvargassolis
 */
public class Semana7_IntroPrograCasoEvaluado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crea el agente de ventas
        Vendedor vendedor1 = new Vendedor();
        //recolecta la info del agente
        vendedor1.setNombreVendedor(JOptionPane.showInputDialog("Ingrese el nombre del agente de ventas:"));
        vendedor1.setCedulaVendedor(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cédula del agente de ventas:")));
        vendedor1.setCodigoVendedor(JOptionPane.showInputDialog("Ingrese el código del agente de ventas:"));
        vendedor1.setSucursal(JOptionPane.showInputDialog("Ingrese la sucursal a la que asiste el agente de ventas:"));
        vendedor1.setVehículo(JOptionPane.showInputDialog("El agente de ventas tiene carro propio? (si/no) "));

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del mes del que se van a regitrar las facturas de " + vendedor1.getNombreVendedor()));
        //obtiene el nombre del mes
        String obtenermes
                = switch (mes) {
            case 1 ->
                "Enero";
            case 2 ->
                "Febrero";
            case 3 ->
                "Marzo";
            case 4 ->
                "Abril";
            case 5 ->
                "Mayo";
            case 6 ->
                "Junio";
            case 7 ->
                "Julio";
            case 8 ->
                "Agosto";
            case 9 ->
                "Septiembre";
            case 10 ->
                "Octubre";
            case 11 ->
                "Noviembre";
            case 12 ->
                "Diciembre";
            default ->
                "Mes no válido";
        };
        //obtiene cantidad de facturas
        int cantidadFacturas = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de facturas registradas en el mes por " + vendedor1.getNombreVendedor()));
        //crea el arreglo   y datos necesario para las operaciones
        Facturas[] facturas = new Facturas[cantidadFacturas];
        int i;
        double bono = 0;
        int puntos = 0;
        double totalFacturas = 0;
        String bonoExtra = "";
        String resultado = "Resumen de facturas:";
        //ciclo para recolectar informacion de las facturas
        for (i = 0; i < cantidadFacturas; i++) {
            facturas[i] = new Facturas();

            JOptionPane.showMessageDialog(null, "Se van a registrar los datos de la factura # " + (i + 1));

            facturas[i].setNombreCliente(JOptionPane.showInputDialog("Nombre del cliente: "));
            facturas[i].setCédula(Double.parseDouble(JOptionPane.showInputDialog("Cecula del cliente: ")));
            facturas[i].setCodigoFactura(JOptionPane.showInputDialog("Codigo de la factura: "));
            facturas[i].setMontoFactura(Integer.parseInt(JOptionPane.showInputDialog("Monto de la factura: ")));
            facturas[i].setProductosElect(JOptionPane.showInputDialog("Se facturaron productos eléctricos? (si/no)"));
            facturas[i].setCantidadElect(Integer.parseInt(JOptionPane.showInputDialog("Cuantos prodcutos elétricos? ")));
            facturas[i].setProductosAuto(JOptionPane.showInputDialog("Se facturaron productos automotrices? (si/no)"));
            facturas[i].setCantidadAuto(Integer.parseInt(JOptionPane.showInputDialog("Cuantos prodcutos automotrices? ")));
            facturas[i].setProductosConstru(JOptionPane.showInputDialog("Se facturaron productos de construcción? (si/no)"));
            facturas[i].setCantidadConstru(Integer.parseInt(JOptionPane.showInputDialog("Cuantos prodcutos de construcción? ")));
            //condiciones para asignar los puntos y bonos
            if ("si".equalsIgnoreCase(facturas[i].getProductosElect()) && "si".equalsIgnoreCase(facturas[i].getProductosAuto()) && "si".equalsIgnoreCase(facturas[i].getProductosConstru())) {
                bono += (facturas[i].getMontoFactura()) * 0.10;
                puntos += 3;
                if ((facturas[i].getMontoFactura()) > 50000) {
                    bono += (facturas[i].getMontoFactura()) * 0.05;
                    puntos += 1;
                }
                
            } else {
                if (facturas[i].getCantidadElect() >= 3) {
                    bono += facturas[i].getMontoFactura() * 0.04;
                    puntos += 1;
                } else {
                    if (facturas[i].getCantidadElect() >= 1) {
                        bono += facturas[i].getMontoFactura() * 0.02;
                        puntos += 1;
                    }
                }
                if (facturas[i].getCantidadAuto() > 4) {
                    bono += facturas[i].getMontoFactura() * 0.04;
                    puntos += 1;
                } else {
                    if (facturas[i].getCantidadElect() >= 1) {
                        bono += facturas[i].getMontoFactura() * 0.02;
                        puntos += 1;
                    }
                }
                if ("si".equalsIgnoreCase(facturas[i].getProductosConstru()) && facturas[i].getCantidadConstru() > 0) {
                    bono += (facturas[i].getMontoFactura()) * 0.08;
                    puntos += 2;

                }
                if ((facturas[i].getMontoFactura()) > 50000) {
                    bono += (facturas[i].getMontoFactura()) * 0.05;
                    puntos += 1;
                }
                for (i = 0; i < cantidadFacturas; i++) {
                    totalFacturas += facturas[i].getMontoFactura();
                }
                
            }
            
            for (i = 0; i < cantidadFacturas; i++) {
                    totalFacturas += facturas[i].getMontoFactura();
                }
            
            if (cantidadFacturas > 3 || totalFacturas > 300000) {
                bono += 20000;
                bonoExtra = "si";
            }
            //impresion de las facturas
            resultado += "\n\nFactura #" + (i + 1) + "\nCliente: " + facturas[i].getNombreCliente() + "\nCédula: " + facturas[i].getCédula() + 
                    "\nCódigo factura: " + facturas[i].getCodigoFactura() + "\nElectricos: " + facturas[i].getCantidadElect() + "\nAutomotrices: " + facturas[i].getCantidadAuto()
                            + "\nConstrucción: " + facturas[i].getCantidadConstru() + "Monto Factura: " + facturas[i].getMontoFactura();
            
        }
        //impresiones finales de la info del vendedor y las facturas
        JOptionPane.showMessageDialog(null, "El agente vendedor " + vendedor1.getNombreVendedor() + " código:" + vendedor1.getCodigoVendedor()
                    + "en el mes de " + obtenermes + "." + "\n\nVendió un total de " + totalFacturas + "en facturas" + "\nObtuvo un total de comisiones de "
                    + bono + "\nEl agente vendedor " + bonoExtra + " logro el objetivo de llegar al BONO EXTRA" + "\nPuntos obtenidos por el vendedor: "
                    + puntos + "\nEl agente vendedor " + vendedor1.getVehículo() + " cuenta con el vehículo propio" + "\nSucursal: " + vendedor1.getSucursal());
        
        JOptionPane.showMessageDialog(null, resultado);


    }
}
