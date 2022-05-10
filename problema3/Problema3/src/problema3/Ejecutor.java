/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author fabri
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Automotor ec = new Automotor("1108973423");
        ec.establecerMarca("Chevrolet");
        ec.establecerAño(2019);
        ec.establecerValor(24000);
        ec.calcularMatricula();
        Automotor ec2 = new Automotor("1132074323", "Toyota", 2012, 16000);
        
        System.out.printf("%s\n", ec);
        
        ec2.calcularMatricula();
        System.out.printf("%s\n", ec2);
        
    }
    
}
