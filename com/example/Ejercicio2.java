package com.example;

public class Ejercicio2 {
    public static double calcularPrecioConIva(double precio){
        double porcentajeIva = 0.21;
        double precioConIva = precio * (1 + porcentajeIva);
        return precioConIva;
    }

    public static void main(String[] args) {
        double precioSinIva = 50.0;
        double precioConIva = calcularPrecioConIva(precioSinIva);

        System.out.println("Precio sin IVA: " + precioSinIva);
        System.out.println("Precio con IVA: " + precioConIva);
    }
}


