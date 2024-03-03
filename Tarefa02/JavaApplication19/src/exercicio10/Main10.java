/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio10;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Ler as notas da 1a. e 2a. avaliações de um aluno. 
                           Calcular a média aritmética simples e escrever uma 
                           mensagem que diga se o aluno foi ou não aprovado 
                           (considerar que nota igual ou maior que 6 o aluno é 
                           aprovado). Escrever também a média calculada. 
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nNota da avaliação 1: ");
        double nota01  = Double.parseDouble(myScanner.nextLine());
        
        System.out.println("\nNota da avaliação 2: ");
        double nota02  = Double.parseDouble(myScanner.nextLine());
        
        double media = (nota01 + nota02)/2;
        if (media < 6) {
            System.out.printf("Aluno reprovado!Sua nota foi %s!", media);
            } else {
            System.out.printf("Aluno aprovado!Sua nota foi %s!", media);
        }
        myScanner.close();
    }
    
}
