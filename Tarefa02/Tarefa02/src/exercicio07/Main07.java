/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio07;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Ler um valor e escrever a mensagem É MAIOR QUE 10! 
                           se o valor lido for maior que 10, caso contrário 
                           escrever NÃO É MAIOR QUE 10! 
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nInsira um número: ");
        int num = Integer.parseInt(myScanner.nextLine());
        
        if (num > 10) {
            System.out.println("É maior que 10!");
            } else {
            System.out.println("Não é maior que 10!");
        }

        myScanner.close();
    }
    
}
