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
public class ProfesorClass_36 {
    
    // Atributos
    String nombre;
    String apellido;
     int edad;
     String materia;
   
    public void impartirClase() {
        System.out.println(nombre + " " + apellido + " está impartiendo una clase de " + materia);
    }

    public void realizarEvaluacion(String nombreAlumno) {
        System.out.println(nombre + " está realizando una evaluación a " + nombreAlumno);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Juan", "Pérez", 35, "Matemáticas");
        Profesor profesor2 = new Profesor("María", "González", 40, "Historia");

        profesor1.impartirClase();
        profesor2.impartirClase();

        profesor1.realizarEvaluacion("Carlos");
        profesor2.realizarEvaluacion("Laura");
    }
}

    
}
