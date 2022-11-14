package com.factura.bl;

public class Fecha {
    private int dia;
    private int mes;
    private int year;

    public Fecha(int dia, int mes, int year) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", year=" + year +
                '}';
    }
}
