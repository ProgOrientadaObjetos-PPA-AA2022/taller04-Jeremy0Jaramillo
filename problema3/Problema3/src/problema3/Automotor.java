/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author fabri
 */
public class Automotor {
    private String cedula;
    private String marca;
    private double año;
    private double valor;
    private double valorMatricula;
    
    public Automotor (String n){
        cedula = n;
        
    }
    
    public Automotor (String n, String z, double x, double g){
        cedula = n;
        marca = z;
        año = x;
        valor = g; 
    }
    
    public void establecerCedula(String n){
        cedula= n;
    }
    
    public void establecerMarca(String n){
        marca = n;
    }
    public void establecerAño(double n){
        año = n;
    }
    public void establecerValor(double n){
        valor = n;
    }
    public void calcularMatricula(){
        valorMatricula = (2022 - año) * (valor*0.002);
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    public double obtenerAño(){
        return año;
    }
    public double obtenerValor(){
        return valor;
    }
    public double obtenerMatricula(){
        return valorMatricula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Automotor:\n"
                + "Cedula del dueño: %s\n"
                + "Marca del vehículo: %s \n"
                + "Año de fabricación: %.0f\n"
                + "Valor de Vehículo: %.2f \n"
                + "Valor de Matrícula: %.2f \n", 
                obtenerCedula(), obtenerMarca(),obtenerAño(),
                obtenerValor(), obtenerMatricula());
        return cadena;
   }
    
}
