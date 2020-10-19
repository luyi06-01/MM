package Text04_数组;

import java.util.Scanner;

public class Demo01_实例6__计算成绩 {
    public static void main(String[] args) {
        int max=0;
        int min=0;
        int avg=0;
        int total=0;
        Scanner input=new Scanner(System.in);
            int scores[]=new int[5];
        System.out.println("请输入五位同学的成绩");
        for (int i=0;i<scores.length;i++){
              scores[i]=input.nextInt();

            System.out.println("第"+(i+1)+"同学的成绩是"+scores[i]);
            if (scores[i]>max){
                max=scores[i];
            }//最大值

            min=scores[0];
            if (scores[i]<min){
            min=scores[i];

            }//最小值

            total+=scores[i];//总分

        }
        for (int i=0;i<scores.length;i++){
            System.out.println(scores[i]);
        }
            avg=total/scores.length;//平均分
        System.out.println("最高分是"+max);
        System.out.println("最低分是"+min);
        System.out.println("最平均是"+avg);
        System.out.println("总成绩是"+total);
    }
}
