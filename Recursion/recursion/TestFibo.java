/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author NITRO5
 */
public class TestFibo {

    /**
     * @param args the command line arguments
     */
    public static int fibo(int n){
        if(n < 2) return 1;
        return fibo(n - 2) + fibo(n - 1);
    }
    
    public static boolean testFibo(int x){
        if(x < 1) return false;
        int aFibo = 1;
        int n = 2;
        while(aFibo < x) aFibo = fibo(n++);
        return x == aFibo;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(testFibo(55));
        System.out.println(testFibo(144));
        System.out.println(testFibo(120));
    }   
}
