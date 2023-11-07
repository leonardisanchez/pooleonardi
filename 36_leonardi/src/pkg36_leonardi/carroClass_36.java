/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg36_leonardi;

/**
 *
 * @author Usuario11
 */
public class carroClass_36 {
    public class Carro {
    // Atributos
    private String marca;
    private String modelo;
    private int año;
    private double precio;

   

    // Métodos
    public void arrancar() {
        System.out.println("El carro " + marca + " " + modelo + " está arrancando.");
    }

    public void detener() {
        System.out.println("El carro " + marca + " " + modelo + " se está deteniendo.");
    }

    public void acelerar() {
        System.out.println("El carro " + marca + " " + modelo + " está acelerando.");
    }

    public void frenar() {
        System.out.println("El carro " + marca + " " + modelo + " está frenando.");
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}

