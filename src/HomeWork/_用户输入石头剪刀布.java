package HomeWork;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class _用户输入石头剪刀布 {
    public static void main(String[] args) {
        String s="";
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("请输入一个0-2的整数");
            int num=input.nextInt();
            switch (num){
                case 0:
                    System.out.println("你输入的是石头");
                    break;
                case 1:
                    System.out.println("你输入的是布");
                    break;
                case 2:
                    System.out.println("你输入的是剪刀");
                    break;
            }
            System.out.println("请问是否要继续出拳 y/n");
             s=input.next();
        }while (s.equals("y"));

    }
}
