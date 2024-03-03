/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio06;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Escreva um algoritmo para ler uma temperatura em 
                           graus Fahrenheit, calcular e escrever o valor 
                           correspondente em graus Celsius. Observação: Para 
                           testar se a sua resposta está correta saiba que 100°C
                           = 212°F
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nTemperatura em Fahrenheit: ");
        double tempFahren = Double.parseDouble(myScanner.nextLine());
        
        double tempCelsius = (tempFahren-32)/1.8;
        
        System.out.printf("Temperatura em Celsius é %s°C", tempCelsius);
        myScanner.close();

    }
}
