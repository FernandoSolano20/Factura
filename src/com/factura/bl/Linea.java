package com.factura.bl;

public class Linea {
    private int cantidad;
    private Producto producto;

    public Linea(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Linea{" +
                "cantidad=" + cantidad +
                ", producto=" + producto +
                '}';
    }
}
