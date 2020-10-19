package _图形;

import java.util.Scanner;

public class _正方形 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("请输入几行");
        int num=input.nextInt();

        for (int i = 0; i <num; i++) {
            for (int j = 0; j<num ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
