/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author SALA I
 */
public class Profesores {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    
    public Profesores (String n){
        nombre = n;
        
    }
    
    public Profesores (String n, String z, double x, String g){
        nombre = n;
        apellido = z;
        sueldoBasico = x;
        cedula = g;
    }
    
    public void establecerNombreProfesores(String n){
        nombre = n;
    }
    
    public void establecerApellidoProfesores(String n){
        apellido = n;
    }
    public void establecerSueldoBasico(double n){
        sueldoBasico = n;
    }
    public void establecerCedula(String n){
        cedula = n;
    }
    public void calcularSueldoTotal(){
        sueldoTotal = sueldoBasico + (sueldoBasico*0.2);
    }
    
    public String obtenerNombreProfesores(){
        return nombre;
    }
    
    public String obtenerApellidoProfesores(){
        return apellido;
    }
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    public String obtenerCedula(){
        return cedula;
    }
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Profesor:\n"
                + "Nombre: %s\n"
                + "Apellido: %s \n"
                + "Cedula: %s \n"
                + "Sueldo Básico: %.2f \n"
                + "Sueldo Total: %.2f \n", 
                obtenerNombreProfesores(),
                obtenerApellidoProfesores(),obtenerCedula(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal());
        return cadena;
   }
}
