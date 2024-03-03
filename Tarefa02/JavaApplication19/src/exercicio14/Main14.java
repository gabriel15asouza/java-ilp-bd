/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio14;

import java.util.Scanner;

/**
 *
 * @author gabal
 */
public class Main14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("""
                           Ler a hora de início e a hora de fim de um jogo de 
                           Xadrez (considere apenas horas inteiras, sem os 
                           minutos) e calcule a duração do jogo em horas, 
                           sabendo-se que o tempo máximo de duração do jogo é de
                           24 horas e que o jogo pode iniciar em um dia e 
                           terminar no dia seguinte.
                           """);
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("\nHora de início: ");
        int horaInicial  = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("\nHora de término: ");
        int horaFinal  = Integer.parseInt(myScanner.nextLine());
        int duracao;
        
        if (horaInicial < horaFinal ) {
            duracao = horaFinal - horaInicial;
            } else {
            duracao = (24 - horaInicial) + (horaFinal);
        }
        System.out.printf("A partida durou %s horas!", duracao);
        myScanner.close();
    }
    
}
