/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio08;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Ler um valor e escrever se é positivo ou negativo (
                           considere o valor zero como positivo). 
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nInsira um número: ");
        int num = Integer.parseInt(myScanner.nextLine());
        
        if (num < 0) {
            System.out.println("Esse valor é negativo");
            } else {
            System.out.println("Esse valor é positivo");
        }

        myScanner.close();
    }
    
}
