package GuoQingJieHomeWokr;

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("输入你的会员号");
        int num=input.nextInt();
         if(num>999&&num<10000){
             System.out.println("登录成功");
         }else {
             System.out.println("你输入的不是四位数字");
         }
    }
}
