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
public class GeometricProgression {
    public static double gp(int n, double a, double q){
        if(n == 1) return a;
        return gp(n - 1, a, q) * q;
    }
    
    public static void main(String[] args) {
        System.out.println(gp(6, 1.5, 2));
    }
}
