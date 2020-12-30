/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test21;

/**
 *
 * @author 19681
 */
public class Stock {
private  static String name="努力";
private static int symbol;
private static double previousClosingPrice=3.5;
private static double currentPrice=4.5;
private static final String Holder="陈勇强";
private static String buyDate="2020/11/23";
    
    public static void main(String[] args) {
         property();
         show();
    }
    private  static void property(){
    System.out.println("name:"+name);
    System.out.println("symbol:"+symbol);
    System.out.println("previousClosingPrice:"+previousClosingPrice);
    System.out.println("currentPrice:"+currentPrice);
    System.out.println("Holder:"+Holder);
    System.out.println("buyDate:"+buyDate);
    }
     private  static void show(){
         double n=currentPrice/previousClosingPrice;
         System.out.println("The change in stock is "+n);
     }
}
