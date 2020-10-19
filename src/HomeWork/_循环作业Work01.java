package HomeWork;

import java.util.Scanner;

public class _循环作业Work01 {
    public static void main(String[] args) {

      Scanner input=new Scanner(System.in);
      int a=0;
        int b=0;
        System.out.println("请问要输入几个数");
        int count=input.nextInt();
        int []num=new int[count];


        for (int i = 0; i < num.length; i++) {
            System.out.println("输入的"+i+"数字为");
            num[i]=input.nextInt();

        }
        b=num[0];
        for (int i = 0; i <num.length ; i++) {

            if (a<num[i]){
                a=num[i];
            }

            if(num[i]<b){
                System.out.println("g");
                b=num[i];
            }
        }


        System.out.println("最大值是"+a);
        System.out.println("最小值是"+b);
    }
}
