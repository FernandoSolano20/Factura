package com.factura.tl;

import com.factura.bl.Factura;
import com.factura.bl.FacturaBL;
import com.factura.bl.Producto;

import java.util.ArrayList;
import java.util.List;

public class FacturaController {
    private FacturaBL logic = new FacturaBL();
    public String registroFactura(String numero, String  cliente, ArrayList<Integer> cantidades, ArrayList<String> codigos, int dia, int mes, int year){
        Factura factura = new Factura(numero, cliente, dia, mes, year);
        for (int i = 0; i < cantidades.size(); i++) {
            Producto producto = logic.buscarProducto(codigos.get(i));
            factura.agregarLinea(cantidades.get(i),producto);
        }
        logic.registroFactura(factura);
        return  ("Total: " + factura.calcularTotal());
    }

    public void registroProducto(String codigo, String descripcion, int precio){
        Producto producto = new Producto(codigo,descripcion,precio);
        logic.registroProducto(producto);
    }

    public String imprimirFactura(String numero){
        return logic.imprimirFactura(numero);
    }

    public String[] listarProductos(){
        return logic.listarProductos();
    }

    public String eliminarFactura(String numero){
        return logic.eliminarFactura(numero);
    }
}
