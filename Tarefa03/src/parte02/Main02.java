/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parte02;
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
        Math calc = new Math(); // Criando uma instância da classe Math
        double a = 5;
        double b = 4;
        
        System.out.println("Soma: " + calc.soma(10, 3));
        System.out.println("Subtração: " + calc.subtrai(5, 4));
        System.out.println("Multiplicação: " + calc.multiplica(calc.soma(10,3),calc.subtrai(5, 4)));
        System.out.println("Divisão: " + calc.divide(calc.multiplica(calc.soma(10,3),calc.subtrai(5, 4)), calc.soma(2, 3)));
        
        System.out.println("Exemplo1: "+ calc.soma(calc.divide(2, 5), calc.divide(3, 7)));
        System.out.println("Exemplo2: "+ calc.subtrai(calc.divide(4, 3), calc.divide(2, 7)));
        System.out.println("Exemplo3: "+ calc.soma(calc.soma(calc.divide(4, 3), calc.divide(2, 5)), calc.divide(3, 2)));
        System.out.println("Exemplo4: "+ calc.subtrai(calc.divide(10, 3), calc.divide(4, 3)));
        System.out.println("Exemplo5: "+ calc.subtrai(calc.soma(2, calc.divide(1, 3)), calc.divide(5, 4)));
        System.out.println("Exemplo6: "+ calc.multiplica(calc.divide(5, 2), calc.subtrai(calc.divide(4, 3), calc.divide(2, 5))));
        System.out.println("Exemplo7: "+ calc.soma(5, calc.divide(2, 7)));
        System.out.println("Exemplo8: "+ calc.multiplica(calc.divide(5, 3), calc.divide(7, 4)));
    }
    
}
