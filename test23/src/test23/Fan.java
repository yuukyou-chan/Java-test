/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test23;

/**
 *
 * @author 
 */
public class Fan {
    /**
     * @param args the command line arguments
     */
    public int SLOW=1;
    public int MEDIUM=2;
    public int FAST=3;
    private int speed=SLOW;
    boolean on=false;
    String color="blue";
    private double radius=5;

    
    public Fan(int speed1,double radius1,String  color1){
    speed=speed1;
     radius=radius1;
    color=color1;
    }//构造器
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void toString(boolean on){
        if (on==true){
        System.out.println("速度为 "+speed);
        System.out.println("颜色为 "+color);
        System.out.println("半径为 "+radius);
        }
        else{
        System.out.println("fan is off");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Fan fan=new Fan(2,10,"黄色");
        fan.toString(true);
        System.out.println("陈勇强 电商1903 20194760");
    }
    
    
}
