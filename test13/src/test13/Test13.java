/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test13;

public class Test13 {

    public static void main(String[] args) {

        for (int num=100;num<1000;num++)
        {
            int gw=num%10;
            int sw=num/10%10;
            int bw=num/100%10;
            if (gw*gw*gw+sw*sw*sw+bw*bw*bw==num)
            {
                System.out.println(num);
            }
        }
        System.out.println("电子商务1903 陈勇强 20194760");
    }

}