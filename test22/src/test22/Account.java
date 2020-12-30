/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test22;

import java.util.Date;

/**
 *
 * @author 19681
 */
 public class Account {
static private String id;
static private double balance;
private double annulInterestRate=0.015;
private Date dateCreated; 
private String transactions[]=new String[1000];


public Account(){}//创建默认无参构造器
public Account(String id2, double balance2){
id=id2;
balance=balance2;
} //创造一个具有指定id和初始余额的账户构造函数

public String getid(){
  return id;
}//id的访问方法

public double getBalance(){
    return balance;  
}//Balance的访问方法

public double getannualInterestRate(){
   return annulInterestRate;
}//annulInterestRate的访问方法

public Date getdate(){
return dateCreated;
}
public Date dateCreated(Date dateCreated2){
 dateCreated= dateCreated2;
 return dateCreated;
}
public double getMonthlyInterestRate(){
return annulInterestRate/12;
}
public double Withdraw(double withedraw){
    balance=balance-withedraw;
    for(int i=0;i<1000;i++){
    if (transactions[i]==null)
    transactions[i]="取出";}
return balance ;
}//取钱函数
public  double Deposit(double deposit){
balance=balance+deposit;
 for(int i=0;i<1000;i++){
    if (transactions[i]==null)
    transactions[i]="存入";}
return balance;
}//存钱函数
    public static void main(String[] args) {
        // TODO code application logic here
       Account account=new Account("陈勇强",1000);
       account.Deposit(30);
       account.Deposit(40);
       account.Deposit(50);
       System.out.println(id);
       System.out.println(balance);
       account.Withdraw(500);
       System.out.println(balance);
    }
   
}
