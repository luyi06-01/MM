package Text04_数组;

import java.util.Scanner;

public class _一组数组求最大最小值 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min=0;
        int max=0;
        System.out.println("输入五位同学的成绩");
        int [] score=new int[5];
        for (int i = 0; i <score.length ; i++) {
            score[i]=input.nextInt();
        }
           min=score[0];
        max=score[0];
        for (int i = 0; i < score.length; i++) {
                if(max<score[i]){
                    max=score[i];
                }
                if(score[i]<min){
                    min=score[i];
                }
        }
        System.out.println("最大值是"+max);
        System.out.println("最小值是"+min);
    }
}
