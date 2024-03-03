/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio15;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           A jornada de trabalho semanal de um funcionário é de 
                           40 horas. O funcionário que trabalhar mais de 40 
                           horas receberá hora extra, cujo cálculo é o valor da 
                           hora regular com um acréscimo de 50%. Escreva um 
                           algoritmo que leia o número de horas trabalhadas em 
                           um mês, o salário por hora e escreva o salário total 
                           do funcionário, que deverá ser acrescido das horas 
                           extras, caso tenham sido trabalhadas (considere que o
                           mês possua 4 semanas exatas). 
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nHoras Trabalhadas no mes: ");
        int horasTrabMes  = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("\nSalario por hora: ");
        int salarioPorHora  = Integer.parseInt(myScanner.nextLine());
        
        int horaExtra = horasTrabMes - 160;
        
        int horaRegular = 160;
        
        double salario = horaRegular*salarioPorHora + horaExtra*(1.5*salarioPorHora);
        
        System.out.println("O salário final foi de R$" + salario);
        myScanner.close();
    }
    
}
