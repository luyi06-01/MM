package Text04_数组;

import java.util.Scanner;

public class _二维数组_储存学生成绩 {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
       // 使用二维数组存储班上五个学生三门功课的考试成绩，要求输出每一个学生的总分、平均分、最高分、最低分
            int [] [] score=new int[2][3];
        for (int i = 0; i < score.length; i++) {

            for (int j = 0; j < score[i].length; j++) {
                System.out.println("第" + (i + 1) + "的第" + (j + 1) + "门成绩是:");
                score[i][j] = input.nextInt();

            }
        }
        for (int i = 0; i <score.length ; i++) {
            int count = 0;
            int dvg = 0;
            int max = 0;
            int min = 0;
            min=score[i][0];
            max=score[i][0];
            for (int j = 0; j <score[i].length ; j++) {

                count+=score[i][j];

                if(min>score[i][j]){
                    min=score[i][j];
                }
                if(max<score[i][j]){
                    max=score[i][j];
                }
            }
            dvg=count/score[i].length;
            System.out.println("最高分是"+max);
            System.out.println("最低分"+min);
            }
        }
    }
