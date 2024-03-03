/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio02;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Escreva um algoritmo para ler o número total de 
                           eleitores de um município, o número de votos brancos, 
                           nulos e válidos. Calcular e escrever o percentual que
                           cada um representa em relação ao total de eleitores. 
                           """);
        Scanner myScanner = new Scanner(System.in);
        System.out.println("\nNúmero Total de Eleitores: ");
        int totalEleitores = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("\nVotos Brancos: ");
        int votoBranco = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("\nVotos Nulos: ");
        int votoNulo = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("\nVotos Válidos: ");
        int votoValido = Integer.parseInt(myScanner.nextLine());
        
        double percentBranco = 100*votoBranco/totalEleitores;
        double percentNulo = 100*votoNulo/totalEleitores;
        double percentValido = 100*votoValido/totalEleitores;
        
        System.out.println("\nPercentual de votos válidos: " + percentValido);
        System.out.println("Percentual de votos brancos: " + percentNulo);
        System.out.println("Percentual de votos nulo: " + percentBranco);
        myScanner.close();
    }
    
}
