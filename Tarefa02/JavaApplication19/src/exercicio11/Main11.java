/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio11;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Ler o ano atual e o ano de nascimento de uma pessoa. 
                           Escrever uma mensagem que diga se ela poderá ou não 
                           votar este ano (não é necessário considerar o mês em 
                           que a pessoa nasceu).
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nQual seu ano de nascimento: ");
        int ano  = Integer.parseInt(myScanner.nextLine());
        
        if (ano > 2008) {
            System.out.println("Você não podera votar esse ano!");
            } else {
            System.out.println("Você podera votar esse ano!");
        }
        myScanner.close();
    }
    
}
