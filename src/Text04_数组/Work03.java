package Text04_数组;

import java.util.Scanner;

public class Work03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入十个数字");
        int num[]=new int[10];
        for (int i = 0; i <10 ; i++) {
            num[i]=input.nextInt();

        }
        System.out.print("输入的十个数字为");
        int a=0;
        int b=0;
        int c=0;
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"\t");
            if (num[i]==1){
                a++;
            }
            if (num[i]==2){
                b++;
            }
            if (num[i]==3){
                c++;
            }
        }
        System.out.println("数字为1的个数是"+a);
        System.out.println("数字为2的个数是"+b);
        System.out.println("数字为3的个数是"+c);

    }
}
