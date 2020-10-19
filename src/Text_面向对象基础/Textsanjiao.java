package Text_面向对象基础;

import java.util.Scanner;

public class Textsanjiao {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str="";
        do {
            System.out.println("请输入第一条边");
            int a=input.nextInt();
            System.out.println("请输入第二条边");
            int b=input.nextInt();
            System.out.println("请输入第三条边");
            int c=input.nextInt();
            sanjiaoxing s=new sanjiaoxing();

            s.shape(a,b,c);
            System.out.println("继续吗y/n");
         str=input.next();
        }while (str.equals("y"));

    }
}
