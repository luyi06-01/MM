package HomeWork;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

       // System.out.println(newnum);
      int num=0;
        String str="";


          System.out.println("输入四位数字");
          str=input.next();


          num=Integer.valueOf(str);
          int len=str.length();
          char [] l=new  char[len];
          for (int i = 0; i <len ; i++) {
              l[len-1-i]=str.charAt(i);
          }
          System.out.println("转换后的数字为");
          int newnum=Integer.valueOf(String.valueOf(l));
        System.out.println(newnum);
          System.out.print("和是");
          int a=num+newnum;
          System.out.println(a);


    }
}
