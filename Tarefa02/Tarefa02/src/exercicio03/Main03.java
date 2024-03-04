/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio03;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Escreva um algoritmo para ler o salário mensal atual 
                           de um funcionário e o percentual de reajuste. 
                           Calcular e escrever o valor do novo salário. 
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nSalário Mensal: ");
        int salarioMensal = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("\nPercentual de reajuste (em %): ");
        double percentReaj = Integer.parseInt(myScanner.nextLine());
        
        double novoSalario = salarioMensal*(1 + (percentReaj/100));
        System.out.println("Salário com Reajuste: " + novoSalario);
        myScanner.close();
    }
    
}
