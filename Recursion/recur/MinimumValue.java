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
public class MinimumValue {
    public static int mum(int[] a, int n){
        if(n == 1) return a[0];
        int m = mum(a, n - 1);
        return m < a[n - 1] ? m : a[n - 1];
    }
    
    public static void main(String[] args) {
        int b[] = {1, 5, 9, 7, 2, 19, 10};
        System.out.println(mum(b, 7));
    }
}
