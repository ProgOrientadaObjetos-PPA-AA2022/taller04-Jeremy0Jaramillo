/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Profesores pf = new Profesores("Arroba");
        Profesores pf2 = new Profesores("Poblador", "Pueblas", 250, "11912382");
        
        pf.establecerApellidoProfesores("Igriega");
        pf.establecerSueldoBasico(210);
        pf.establecerCedula("1092381022");
        pf.calcularSueldoTotal();
        System.out.printf("%s\n", pf);
        
        pf2.calcularSueldoTotal();
        System.out.printf("%s\n", pf2);
        
    }
    }
    

