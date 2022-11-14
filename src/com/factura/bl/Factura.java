package com.factura.bl;

import java.util.ArrayList;

public class Factura {
    public String numero;
    private String cliente;
    private Fecha fecha;
    private int cantidad;
    private ArrayList<Linea> lineas = new ArrayList<Linea>();
    private FacturaBL logic = new FacturaBL();

    public Factura(String numero, String cliente, int dia, int mes, int year) {
        this.numero = numero;
        this.cliente = cliente;
        this.fecha = new Fecha(dia,mes,year);
        this.cantidad = 0;
    }

    public void agregarLinea(int cantidad, Producto producto){
        Linea linea = new Linea(cantidad, producto);
        lineas.add(linea);
        this.cantidad += (producto.precio*cantidad);
    }

    public int calcularTotal(){
        return cantidad;
    }

    @Override
    public String toString() {
        String  result = "============================================\n" +
                "\nFactura: " +
                "  numero='" + numero + '\'' +
                "\ncliente='" + cliente + '\'' +
                "\nfecha=" + fecha +
                "\ncantidad=" + cantidad;

        for (Linea linea:lineas) {
            result += "\nlineas=" + linea.toString();
        }
        return result;
    }
}
