
package pkg36_leonardi;

/**
 *
 * @author Usuario11
 */
public class bomberoClass_36 {

    // Atributos
    private String nombre;
    private int edad;
    private String rango;

   

    // Métodos
    public void apagarIncendio() {
        System.out.println(nombre + " está apagando un incendio.");
    }

    public void realizarRescate(String persona) {
        System.out.println(nombre + " está rescatando a " + persona + " de un peligro.");
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

        

    
}
