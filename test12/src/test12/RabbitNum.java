/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test12;

import java.util.Scanner;



public class RabbitNum {
    
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份: ");
		int n = scanner.nextInt();
System.out.println("第" + n + "个月兔子总数为" + fun(n));
System.out.println("电商1903陈勇强  20194760  2020/11/20");
}//定义私有类的方法，采用递归调用的方法
private static int fun(int n) {
//当所求月份为1或2月时，返回值为1
if(n == 1||n == 2)
return 1;
//递归调用
else
return fun(n - 1) + fun(n - 2);	

}
}