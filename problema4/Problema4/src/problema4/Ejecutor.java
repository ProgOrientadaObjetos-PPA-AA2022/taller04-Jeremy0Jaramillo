/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

/**
 *
 * @author fabri
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cheque ch = new Cheque("Camilo Rojas");
       ch.establecerNombreBanco("Banco del Pacífico");
       ch.establecerValor(11);
       ch.calcularComision();
        Cheque ch2 = new Cheque("Mario Lopez", "Pollos Hermanos", 12);
        
        System.out.printf("%s\n", ch);
        
        ch2.calcularComision();
        System.out.printf("%s\n", ch2);
    }
    
}
