/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio13;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Ler dois valores (considere que não serão lidos 
                           valores iguais) e escrevê-los em ordem crescente. 
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nInsira um número: ");
        int num01  = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("\nInsira um outro número: ");
        int num02  = Integer.parseInt(myScanner.nextLine());
        
        if (num01 > num02 ) {
            System.out.printf("A ordem crescente dos números é %s e %s",num02,num01);
            } else {
            System.out.printf("A ordem crescente dos números é %s e %s",num01,num02);
        }
        myScanner.close();
    }
    
}
