/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio09;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           As maçãs custam R$ 1,30 cada se forem compradas 
                           menos de uma dúzia, e R$ 1,00 se forem compradas pelo
                           menos doze. Escreva um programa que leia o número de 
                           maçãs compradas, calcule e escreva o custo total da 
                           compra. 
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nInsira um número: ");
        int quant  = Integer.parseInt(myScanner.nextLine());
        double precoMaca;
        
        if (quant < 12) {
            precoMaca = 1.3;
            } else {
            precoMaca = 1.0;
        }
        
        double custoTotal = precoMaca*quant;
        
        System.out.println("Custo total: R$" + custoTotal);
        myScanner.close();
    }
    
}
