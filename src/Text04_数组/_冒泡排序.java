package Text04_数组;

import java.util.Scanner;

public class _冒泡排序 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int [] num=new int[5];
        System.out.println("请输入五位同学的成绩");
        for (int i = 0; i <num.length ; i++) {
            num[i]=input.nextInt();
        }
        System.out.println("排序后的成绩是");


        for (int i = 0; i <num.length-1 ; i++) {
            for (int j = 0; j <num.length-1-i ; j++) {

                if (num[j]<num[j+1]){
                    int tt=num[j];
                    num[j]=num[j+1];
                    num[j+1]=tt;
                }
            }
        }
        for (int a:num) {
            System.out.println(a);
        }
    }
}
