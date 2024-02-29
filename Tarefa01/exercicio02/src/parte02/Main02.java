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
        System.out.println("Nota P1: ");
        String primNotaStr = myObj.nextLine();
        int P1 = Integer.parseInt(primNotaStr);
        
        System.out.println("Nota E1: ");
        String segNotaStr = myObj.nextLine();
        int E1 = Integer.parseInt(segNotaStr);
                
        System.out.println("Nota E2: ");
        String terNotaStr = myObj.nextLine();
        int E2 = Integer.parseInt(terNotaStr);
        
        System.out.println("Nota API: ");
        String quaNotaStr = myObj.nextLine();
        int API = Integer.parseInt(quaNotaStr);
        
       
        
        System.out.println("Nota X: ");
        String sexNotaStr = myObj.nextLine();
        int X = Integer.parseInt(sexNotaStr);
        
        double media = (P1*0.6+((E1+E2)/2)*0.4)*0.5+(Math.max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*(API*0.5)+X;
        
        System.out.println("Média:" + media);         
        
        if (media < 6) {
            System.out.println("Nota SUB: ");
            String quiNotaStr = myObj.nextLine();
            int SUB = Integer.parseInt(quiNotaStr);
            
            double mediaSub=media+(SUB*0.2);
            
            System.out.println("Média após SUB:" + mediaSub);  
        }
        
    }
    
}
