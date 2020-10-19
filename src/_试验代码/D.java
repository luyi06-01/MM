package _试验代码;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num =  input.nextInt();
        int a = num;
        int b = num;
        int c = 0;
        do {

            c=input.nextInt();

            if(a<c){
                a=c;
            }
            if(b>c){
                System.out.println(c);
                c=b;
            }
            if(c==0){
                break;
            }
        }while (num!=0);
        System.out.println("最大值是"+a);
        System.out.println("最小值是"+c);
    }
}
