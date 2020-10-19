package GuoQingJieHomeWokr;

import java.util.Scanner;

public class _获得个位_十位_百位数字 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("输入一个四位数字");
        int num=input.nextInt();
        if(num>999&&num<10000){
            int a=num%10;
            int b=num/10%10;
            int c=num/100%10;
            int d=num/1000;
            int count=a+b+c+d;
            System.out.println("数字之和为"+count);
        }else {
            System.out.println("你输入的不是四位数字");
        }
    }
}
