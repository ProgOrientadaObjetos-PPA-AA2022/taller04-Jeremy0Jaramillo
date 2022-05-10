/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author fabri
 */
public class Cheque {
    private String nombre;
    private String nombreBanco;
    private double valor;
    private double comision;
    
    public Cheque (String n){
        nombre= n;
        
    }
    
    public Cheque(String n, String z, double x){
        nombre = n;
        nombreBanco = z;
        valor = x;
        
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerNombreBanco(String n){
        nombreBanco= n;
    }
    public void establecerValor(double n){
        valor = n;
    }
    
    public void calcularComision(){
        comision = valor * (valor * 0.003);
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerNombreBanco(){
        return nombreBanco;
    }
    
    public double obtenerValor(){
        return valor;
    }
    public double obtenerComision(){
        return comision;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Manejo de cheque:\n"
                + "Nombre del cliente: %s\n"
                + "Nombre del Banco: %s \n"
                + "Valor del cheque: %.0f\n"
                + "Comisión del cheque: %.2f \n",
                obtenerNombre(), obtenerNombreBanco(),
                obtenerValor(), obtenerComision());
        return cadena;
   }
}
