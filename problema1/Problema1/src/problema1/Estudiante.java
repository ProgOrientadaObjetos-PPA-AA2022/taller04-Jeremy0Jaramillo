/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author fabri
 */
public class Estudiante {
    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    
    public Estudiante(String n) {
        nombre = n;
    }
    
    public Estudiante(String n, double z, double x, double c) {
        nombre = n;
        calificacion1 = z;
        calificacion2 = x;
        calificacion3 = c;
    }
    
    public void establecerNombreEstudiante(String n) {
        nombre = n;
    }
    
    public void establecerCalificacion1(double n) {
        calificacion1 = n;
    }
    
    public void establecerCalificacion2(double n) {
        calificacion2 = n;
    }
    
    public void establecerCalificacion3(double n) {
        calificacion3 = n;
    }
    
    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;
    }
    
    public String obtenerNombreEstudiante() {
        return nombre;
    }
    
    public double obtenerCalificacion1() {
        return calificacion1;
    }
    
    public double obtenerCalificacion2() {
        return calificacion2;
    }
    
    public double obtenerCalificacion3() {
        return calificacion3;
    }
    
    public double obtenerPromedio() {
        return promedio;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Estudiante:\n"
                + "Nombre: %s\n"
                + "Calificacion 1: %.2f \n"
                + "Calificacion 2: %.2f \n"
                + "Calificacion 3: %.2f \n"
                + "Promedio: %.2f \n", 
                obtenerNombreEstudiante(),
                obtenerCalificacion1(),
                obtenerCalificacion2(), 
                obtenerCalificacion3(),
                obtenerPromedio());
        return cadena;
    }
}
