/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio05;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Uma revendedora de carros usados paga a seus 
                           funcionários vendedores um salário fixo por mês, mais
                           uma comissão também fixa para cada carro vendido e 
                           mais 5% do valor das vendas por ele efetuadas. 
                           Escrever um algoritmo que leia o número de carros por
                           ele vendidos, o valor total de suas vendas, o salário
                           fixo e o valor que ele recebe por carro vendido. 
                           Calcule e escreva o salário final do vendedor.
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nSalário fixo mensal: ");
        double salarioFixo = Double.parseDouble(myScanner.nextLine());
        
        System.out.println("\nValor total de vendas: ");
        double valorVendas = Double.parseDouble(myScanner.nextLine());
        
        System.out.println("\nNúmero de carros vendidos: ");
        double quantCarro = Double.parseDouble(myScanner.nextLine());
        
        System.out.println("\nValor recebido por carro vendido: ");
        double valorPorCarro = Double.parseDouble(myScanner.nextLine());
        
        double salarioFinal = salarioFixo + (quantCarro*valorPorCarro) + (valorVendas*0.05);
        System.out.println("Salário final do vendedor: R$" + salarioFinal);
        myScanner.close();
    }
    
}
