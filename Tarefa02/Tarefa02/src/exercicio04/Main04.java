/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           O custo de um carro novo ao consumidor é a soma do 
                           custo de fábrica com a porcentagem do distribuidor e 
                           dos impostos (aplicados ao custo de fábrica). Supondo
                           que o percentual do distribuidor seja de 28% e os 
                           impostos de 45%, escrever um algoritmo para ler o 
                           custo de fábrica de um carro, calcular e escrever o 
                           custo final ao consumidor. 
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nCusto de fábrica: ");
        double custoFabr = Double.parseDouble(myScanner.nextLine());
        
        double percenDist = 0.45;
        double imposto = 0.28;
        
        double custoFinal = custoFabr*(1 + percenDist + imposto);
        System.out.println("Custo final de carro: R$" + custoFinal);
        myScanner.close();
    }   
}
