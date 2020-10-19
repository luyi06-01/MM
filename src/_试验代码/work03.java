package _试验代码;

import java.util.Scanner;

public class work03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int money=5000;
        System.out.println("请选择你要出行的月份");
         int month=input.nextInt();
         if(month>=4&&month<=10){
             System.out.println("请问你选择头等舱还是经济舱？头等舱输入1,经济舱输入2");
                int choiise=input.nextInt();
                if (choiise==1){
                    System.out.println("你的机票为:"+money*0.9);
                }else {
                    System.out.println("你的机票为:"+money*0.6);
                }
         }
         else {
             System.out.println("请问你选择头等舱还是经济舱？头等舱输入1,经济舱输入2");
             int choiise=input.nextInt();
             if (choiise==1){
                 System.out.println("你的机票为:"+money*0.5);
             }else {
                 System.out.println("你的机票为:"+money*0.4);
             }
         }
    }
}
