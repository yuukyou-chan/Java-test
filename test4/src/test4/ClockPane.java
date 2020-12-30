package test4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
public class ClockPane extends Pane{
private int hour;
private int minute;
private int second;
private double w = 500,h = 500;
//无参构造函数
public ClockPane() {
setCurrentTime();//调用方法
}
//有参构造函数
public ClockPane(int hour,int minute,int second) {
this.hour = hour;
this.minute = minute;
this.second = second;
paintClock();//调用方法
}

//set与get方法

public int getHour() {
return hour;
}
public void setHour(int hour) {
this.hour = hour;
paintClock();
}
public int getMinute() {
return minute;
}
public void setMinute(int minute) {
this.minute = minute;
paintClock();

}
public int getSecond() {
return second;
}
public void setSecond(int second) {
this.second = second;
paintClock();
}
public double getW() {
return w;
}
public void setW(double w) {
this.w = w;
paintClock();
}
public double getH() {
return h;
}
public void setH(double h) {
this.h = h;
paintClock();
}

public void setCurrentTime1(int hour,int minute,int second){
this.hour = hour;
this.minute = minute;
this.second = second;
paintClock();
}

public void setCurrentTime() {
Calendar calendar = new GregorianCalendar();//多态
this.hour = calendar.get(Calendar.HOUR_OF_DAY);
this.minute = calendar.get(Calendar.MINUTE);
this.second = calendar.get(Calendar.SECOND);
paintClock();
}

//创建paintClock()显示时间
public void paintClock() {
double clockRadius = Math.min(w, h)*0.5;//时钟半径
double centerX = w/2;//圆心坐标
double centerY = h/2;

//创建时钟圆形
Circle circle = new Circle(centerX,centerY,clockRadius);//创建圆
circle.setFill(Color.WHITE);//圆形背景色为白色
circle.setStroke(Color.BLACK);//圆形边缘色为黑色

Text text1 = new Text(centerX-5,centerY-clockRadius+12,"12");
Text text2 = new Text(centerX-clockRadius+3,centerY+5,"9");
Text text3 = new Text(centerX+clockRadius-10,centerY+3,"3");
Text text4 = new Text(centerX-3,centerY+clockRadius-3,"6");

//分别绘制时针，分针，秒针
//秒针
double secLength = clockRadius*0.8;//秒针长度
double secondX = centerX + secLength*Math.sin(second*(2*Math.PI/60));
double secondY = centerY - secLength*Math.cos(second*(2*Math.PI/60));
Line secline = new Line(centerX,centerY,secondX,secondY);

//分针
double minLength = clockRadius*0.65;//分针长度
double minuteX = centerX + minLength*Math.sin((minute )*(2*Math.PI/60));
double minuteY = centerY - minLength*Math.cos((minute )*(2*Math.PI/60));
Line minline = new Line(centerX,centerY,minuteX,minuteY);

//时针
double houLength = clockRadius*0.5;//时针长度
double hourX = centerX + houLength*Math.sin((hour%12 + minute/60.0 )*(2*Math.PI/12));
double hourY = centerY - houLength*Math.cos((hour%12 + minute/60.0 )*(2*Math.PI/12));
Line houline = new Line(centerX,centerY,hourX,hourY);//创建线段对象实现时针

getChildren().clear();
getChildren().addAll(circle,text1,text2,text3,text4,secline,minline,houline);
}

}