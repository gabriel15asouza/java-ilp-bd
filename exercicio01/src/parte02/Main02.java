/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte02;
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
        Scanner myObj = new Scanner(System.in);
        System.out.println("Valor de Janeiro: ");
        String janStr = myObj.nextLine();
        int janValue = Integer.parseInt(janStr);
        
        System.out.println("Valor de Fevereiro: ");
        String fevStr = myObj.nextLine();
        int fevValue = Integer.parseInt(fevStr);
                
        System.out.println("Valor de Março: ");
        String marStr = myObj.nextLine();
        int marValue = Integer.parseInt(marStr);
        
        int soma = janValue + fevValue + marValue;
        
        System.out.println("Soma:" + soma);         
    }
    
}
