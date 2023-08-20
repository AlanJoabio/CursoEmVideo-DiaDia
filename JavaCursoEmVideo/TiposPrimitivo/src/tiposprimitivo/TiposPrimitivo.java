/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivo;

import java.util.Scanner;

/**
 *
 * @author alanj
 */
public class TiposPrimitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        
        
        System.out.println("Digite nome do aluno: ");        
        String nome = teclado.nextLine();
        
        System.out.println("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        System.out.printf("A sua nota %s é %.1f \n", nome, nota);
        
//        float nota = 8.5f;
//        float nota1 = (float) 8.5;
//        String nome = "Alan Joabio";
//        
//        System.out.print("Sua nota é " + nota);
//        System.out.println("a minha nota é " + nota);
//        System.out.printf("A nota de %s é %.2f \n ", nome, nota);
//        System.out.format("A nota de %s é %.1f \n ", nome, nota);        
//        System.out.println(" A nota é " + nota1);
    }
    
}
