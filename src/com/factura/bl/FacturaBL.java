package com.factura.bl;

import java.util.ArrayList;

public class FacturaBL {
    ArrayList<Producto> productos = new ArrayList<>();
    ArrayList<Factura> facturas = new ArrayList<>();

    public void registroProducto(Producto producto){
        if(buscarProducto(producto.codigo) == null){
            productos.add(producto);
        }
    }

    public Producto buscarProducto(String codigo){
        Producto produc = null;
        for (Producto producto:productos) {
            if(producto.codigo.equals(codigo))
                return producto;
        }
        return produc;
    }

    public void registroFactura(Factura factura){
        if(buscarFactura(factura.numero) == -1){
            facturas.add(factura);
        }
    }

    public int buscarFactura(String numero){
        int result = -1;
        for (int i = 0; i < facturas.size(); i++) {
            if(facturas.get(i).numero.equals(numero))
                return i;
        }
        return result;
    }

    public String imprimirFactura(String numero){
        int index = buscarFactura(numero);
        if(index != -1){
            return facturas.get(index).toString();
        }
        return "No hay factura asociada";
    }

    public String[] listarProductos(){
        String[] array = new String[productos.size()];
        if(productos.size() > 0){
            for (int i = 0; i < productos.size(); i++) {
                array[i] = productos.get(i).toString();
            }
        }
        else{
            array = new String[1];
            array[0] = "No hay productos";
        }
        return array;
    }

    public String eliminarFactura(String numero){
        int index = buscarFactura(numero);
        if(index != -1){
            facturas.remove(facturas.get(index));
            return "Borrado";
        }
        return "No se encontro factura";
    }
}
