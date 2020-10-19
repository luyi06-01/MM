package Text04_数组;

import java.util.Random;

public class _随机数排大小 {
    public static void main(String[] args) {
        int []num=new int[10];
        Random r=new Random();
        for (int i = 0; i <num.length ; i++) {
            num[i]=r.nextInt(10);

        }
        for (int a:
            num ) {
            System.out.print(a+"\t");
        }
        for (int i = 0; i <num.length-1 ; i++) {
            for (int j = 0; j <num.length-1-i ; j++) {

                if (num[j]<num[j+1]){
                    int tt=num[j];
                    num[j]=num[j+1];
                    num[j+1]=tt;
                }
            }
        }
        System.out.println();
        System.out.println("排序后");
        int count=0;
        double dvg=0;
        for (int a:
                num ) {
            System.out.print(a+"\t");
            count+=a;

        }
         dvg=(double) count/num.length;
        System.out.println("总数为"+count);
        System.out.println("平均数"+dvg);
    }
}
