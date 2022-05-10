/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

/**
 *
 * @author fabri
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante es = new Estudiante("Pablo");
        Estudiante es2 = new Estudiante("Poblas", 7.0, 3.2, 10.0);
        es.establecerCalificacion1(10.0);
        es.establecerCalificacion2(7.8);
        es.establecerCalificacion3(8.9);
        es.calcularPromedio();
        System.out.printf("%s\n", es);
        es2.calcularPromedio();
        System.out.printf("%s\n", es2);
    }
    
}
