package Text04_数组;

import java.util.Scanner;

public class Work01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("输入五句话");
        String str[]=new String[5];
        for (int i=0;i<5;i++){
            System.out.print("第"+i+"句话");
           str[i]=input.next();

        }
        System.out.println("11");
        System.out.println("倒叙后");
        for (int i=str.length-1;i>=0;i--){

            System.out.println(str[i]);
        }

        System.out.println("222");
    }
}
