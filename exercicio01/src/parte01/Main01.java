/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte01;

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
        int jan = 15000;
        int fev= 23000;
        int mar= 17000;
        int despTotal = jan+fev+mar;
        
        System.out.println("Despesa total: "+ despTotal);     
        System.out.println("Média mensal: "+ despTotal/3);             
    }
    
}
