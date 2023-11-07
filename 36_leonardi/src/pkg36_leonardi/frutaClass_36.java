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
public class frutaClass_36 {
    public class Fruta {
    // Atributos
    private String nombre;
    private String color;
    private double peso;

    

    // Métodos
    public void comer() {
        System.out.println("Estás comiendo una deliciosa fruta " + nombre);
    }

    public void pelar() {
        System.out.println("Estás pelando una fruta " + nombre);
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static void main(String[] args) {
        Fruta fruta1 = new Fruta("Manzana", "Roja", 0.2);
        Fruta fruta2 = new Fruta("Plátano", "Amarillo", 0.15);

        fruta1.comer();
        fruta2.pelar();
    }
}

    

