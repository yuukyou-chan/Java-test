package test32;

import java.util.Scanner;

class StudentManagement {

    String[] Stuno = new String[100];
    String[] name = new String[100];
    float[] math = new float[100];
    float[] english = new float[100];
    float[] computer = new float[100];

    public int printMenu() {
        System.out.println("请输入(1-6)");
        System.out.println("1、添加学生(输入“000”停止录入)");
        System.out.println("2、删除学生");
        System.out.println("3、查询学生");
        System.out.println("4、修改学生");
        System.out.println("5、打印学生");
        System.out.println("6、统计学生");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();
        return num;
    }

    public void add() {

        Scanner name1 = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入姓名");

            String name2 = name1.next();
            name[i] = name2;
            if (name[i].equals("000")) {
                break;
            }
                //测试
                System.out.println("姓名为" + name[i]);
               
            
            
            System.out.println("请输入数学成绩");
            Scanner math1 = new Scanner(System.in);
            float math2 = math1.nextFloat();
            math[i] = math2;
            System.out.println("数学成绩为" + math[i]);
 
            
            System.out.println("请输入英语成绩");
                Scanner english1 = new Scanner(System.in);
                float english2 = english1.nextFloat();
                english[i] = english2;
                 System.out.println("英语成绩为" + english[i]);
                 
                 
                  System.out.println("请输入计算机成绩");
            Scanner computer1 = new Scanner(System.in);
            float computer2 = computer1.nextFloat();
            computer[i]=computer2;
        }






        printMenu();

    }

    public void delete() {

    }

    public void check() {
        for (int i = 0; i < 3; i++) {
            if (name[i]!=null) {
                System.out.print("姓名    ");
                System.out.print("数学    ");
                System.out.print("英语    ");
                System.out.print("计算机    ");
                System.out.print(name[i]);
                System.out.print("    " + math[i]);
                System.out.print("    " + english[i]);
                System.out.print("    " + computer[i]);
            } else {
                break;
           }
        }
        printMenu();

    }

    public void modify() {

    }

    public void all() {

    }
}
