package Text04_数组;

import java.util.Scanner;

public class _颠倒二维数组 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("请输入数组的行和列");
        int hang=input.nextInt();
        int lie=input.nextInt();
        int [][]num=new int[hang][lie];
        System.out.println("请输入数组的元素");
        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num[i].length ; j++) {
                num[i][j]=input.nextInt();
            }
        }
        System.out.println("依次打印数组");
        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num.length ; j++) {
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("颠置后的数组");
        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num.length ; j++) {
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
