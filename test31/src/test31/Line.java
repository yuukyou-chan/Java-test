
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test31;

/**
 *
 * @author 陈勇强
 */
public class Line {
Point start;
Point end;

public  double  calculate(Point start, Point end){
  double distance=(start.x+end.x)*(start.x+end.x)+(start.y+end.y)*(start.y+end.y);
  distance=Math.sqrt(distance);
  return distance;
}

    public static void main(String[] args) {
        // TODO code application logic here
        Point start = new Point(0, 0, "陈勇强");
        Point end= new Point(1, 1, "20194760");
        Line line1 = new Line();
        System.out.println("本程序运行日期为2020-11-27，用于计算两点间的距离");
        System.out.println("起点为 "+start.name+"坐标为("+start.x+","+start.y+")");
        System.out.println("终点为 "+end.name+"坐标为("+end.x+","+end.y+")");
        System.out.println("起点到终点的距离为"+line1.calculate(start, end));
    }
    
}
