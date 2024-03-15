/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte02;

/**
 *
 * @author gabal
 */
public class Math {

    private double x;
    private double y;
    private double num;
    private double denom;
    
    public double soma(double x, double y) {
        return x + y;
    }
    
    public double subtrai(double x, double y) {
        return x - y;
    }
    
    public double multiplica(double x, double y) {
        return x * y;
    }
    
    public double divide(double num, double denom) {
        if (num != 0) {
            return (double)num / denom;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return Double.NaN; // Retorno de um valor inválido (NaN - Not a Number)
        }
    }
}