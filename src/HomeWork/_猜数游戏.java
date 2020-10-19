package HomeWork;

import java.util.Scanner;

public class _猜数游戏 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[]{8, 4, 2, 1, 23, 344, 12};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            count += num[i];
        }
        System.out.println("总数和为" + count);
            boolean bean=true;
     do{
         System.out.print("输入一个数字");
         int a = input.nextInt();
         for (int i = 0; i < num.length; i++) {
             if (a == num[i]) {
                 System.out.println("输入正确");
                 bean=false;
                 return;
             }

         }
         if(bean==true){
             System.out.println("输入错误,再试一次");
         }
     }while (bean=true);



    }
}
