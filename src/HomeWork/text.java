package HomeWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        ArrayList aa = new ArrayList();
//
//        int num = 0;
//        int small = 0;
//        int k = 0;
//        do {
//
//
//            k = input.nextInt();
//            if (k == 0) {
//                System.out.println("baibai");
//                break;
//            }
//            aa.add(k);
//
//
//            for (int i = 0; i < aa.size(); i++) {
//
//                if ((int) aa.get(i) > num) {
//                    num = (int) aa.get(i);
//                }
//
//            }
//            small = (int) aa.get(0);
//            for (int i = 0; i < aa.size(); i++) {
//
//                if ((int) aa.get(i) < small) {
//                    small = (int) aa.get(i);
//                }
//
//            }
//        }while (k!=0);



        int num =  input.nextInt();
        int a = num;
        int b = num;
        int c = 0;
        do {
            if(num==0){
                break;
            }
            c=input.nextInt();
            if(a<c){
                a=c;
            }
            if(c>b){
                c=b;
            }

        }while (num!=0);
        System.out.println("最大值是"+a);
        System.out.println("最小值是"+c);
//        System.out.println("请输入整数:");
//        int i=input.nextInt();
//        int max=i;
//        int min=i;
//        while(i!=0){
//            i=input.nextInt();//最小值是0
//            if(max<i){
//                max=i;
//            }else if(min>i){
//                min=i;
//            }
//            //i=input.nextInt();//最小值不是0
//        }
//        System.out.println("最大值是"+max);
//        System.out.println("最小值是"+min);

    }
}
