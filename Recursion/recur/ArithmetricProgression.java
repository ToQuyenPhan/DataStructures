/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recur;

/**
 *
 * @author NITRO5
 */
public class ArithmetricProgression {
    public static double ap(int n, double a, double d){
        if(n == 1) return a;
        return ap(n - 1, a, d) + d;
    }
    
    public static void main(String[] args) {
        System.out.println(ap(6, 1.5, 2));
    }
}
