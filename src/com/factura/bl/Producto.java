package com.factura.bl;

public class Producto {
    public String codigo;
    public   String descripcion;
    public   int precio;

    public Producto(String codigo, String descripcion, int precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
