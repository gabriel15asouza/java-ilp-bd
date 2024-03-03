/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Faca um algoritmo que leia a idade de uma pessoa expressa em anos, 
                           meses e dias e escreva a idade dessa pessoa expressa apenas em dias. 
                           Considerar ano com 365 dias e mes com 30 dias. 
                           """);
        System.out.println("Informe a seguir sua idade em anos, meses e dias");
        Scanner myScanner = new Scanner(System.in);        
        
        System.out.println("\nAnos: ");
        int anos = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("\nMeses: ");
        int meses = Integer.parseInt(myScanner.nextLine()); 
        
        System.out.println("\nDias: ");      
        int dias = Integer.parseInt(myScanner.nextLine());
        
        int idadeEmDias = (anos*365) + (meses*30) + dias;
        System.out.printf("\nSua idade em dias é %s!", idadeEmDias);
        myScanner.close();
    }
    
}
