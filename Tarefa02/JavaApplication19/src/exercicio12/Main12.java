/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio12;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Ler dois valores (considere que não serão lidos 
                           valores iguais) e escrever o maior deles. 
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nInsira um número: ");
        int num01  = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("\nInsira um outro número: ");
        int num02  = Integer.parseInt(myScanner.nextLine());
        
        if (num01 > num02 ) {
            System.out.println("O maior número inserido é " + num01);
            } else {
            System.out.println("O maior número inserido é " + num02);
        }
        myScanner.close();
    }
    
}
