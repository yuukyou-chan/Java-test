/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test32;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author 19681
 */
public class Student {
private String Stuno;
private String name;
float math;
float english;
float computer; 

public float sum(float math,float english,float computer){
    float sum=math+english+computer;
    return sum;
}
public float avg(float math,float english,float computer){
    float avg=(math+english+computer)/3;
    return avg;
}
public float max(float math,float english,float computer){
    float max,max1;
    max1=math<english?english:math;
    max=max1<math?math:max1;
    return max;
}
 public float min(float math,float english,float computer){
    float min,min1;
    min1=math>english?english:math;
    min=min1>math?math:min1;
    return min;
} 
    public static void main(String[] args) {
        // TODO code application logic here
        StudentManagement menu= new StudentManagement();
        int num=menu.printMenu();
        if (num ==1){
            menu.add();}
         if(num==2){
            menu.delete();}
        if (num ==3){
            menu.check();}
    }
    }
    
