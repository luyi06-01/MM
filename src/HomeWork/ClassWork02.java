package HomeWork;

import java.util.Scanner;

public class ClassWork02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int d=0;
        System.out.println("请输入第一个数字");
        int a=input.nextInt();
        System.out.println("请输入第二个数字");
        int b=input.nextInt();
        System.out.println("请输入第三个数字");
        int c=input.nextInt();
        int []num=new int[]{a,b,c};
        for (int i = 0; i < num.length; i++) {
            if (d<num[i]){
                d=num[i];
            }
        }
        System.out.println("最大的值是"+d);
    }
}
