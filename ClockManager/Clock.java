/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clockmng;

import java.util.Scanner;

/**
 *
 * @author NITRO5
 */
public class Clock {
    Scanner sc = new Scanner(System.in);
    ClockList _id = new ClockList();
    String id = "", manufact = "";
    int price = 0, guarantee = 0;

    public Clock() {
        
    }
    
    public Clock(String id){
        this.id = id;
    }
    
    public Clock(String id, String manufact, int price, int guarantee){
        this.id = id;
        this.manufact = manufact;
        this.price = price;
        this.guarantee = guarantee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getManufact() {
        return manufact;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    @Override
    public String toString() {
        return id + ", " + manufact + ", " + price + ", " + guarantee;
    }
    
    public void input(String id){
//        System.out.print("Input clock's ID: ");
//        id = sc.nextLine();
        this.id = id;
        System.out.print("Input manufacturer: ");
        manufact = sc.nextLine();
        price = inputPrice("Input price: ", "Invalid! The price must be positive!");
        guarantee = inputGuarantee("Input guarantee[0...36]: ", "Invalid! The guarantee is out of range [0...36]!" );   
    }
    
    @Override
    public boolean equals(Object obj){
        return this.id.equals(((Clock)obj).id);
    }
    
    public int inputPrice(String inputMes, String errorMes){
        int n;
        while(true){
            try{
                System.out.print(inputMes);
                n = Integer.parseInt(sc.nextLine());
                if(n < 0)
                    throw new Exception();
                else
                    return n;
            }catch(Exception e){
                System.out.println(errorMes);
            }
        }
    }
    
    public int inputGuarantee(String inputMes, String errorMes){
        int n;
        while(true){
            try{
                System.out.print(inputMes);
                n = Integer.parseInt(sc.nextLine());
                if(n < 0 || n > 36)
                    throw new Exception();
                else
                    return n;
            }catch(Exception e){
                System.out.println(errorMes);
            }
        }
    }
}
