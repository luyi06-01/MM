package _图形;

import java.util.Scanner;

public class _等腰三角形 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int max = input.nextInt();

        //控制行数
        for(int i = 1; i<=max ; i++) {
            //控制空格
            for (int j = 1; j <= max - i; j++) {
                System.out.print(" ");
            }
            //控制星数
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
           // System.out.pri0kkkkkkkkoooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooojoooooooooooooooojntln();
        }


    }
}
