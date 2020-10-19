package Text04_数组;

import java.util.Scanner;

public class _二维数组季度信息遍历 {
    public static void main(String[] args) {
//        3、公司年销售额求和
//        某公司按照季度和月份统计的数据如下：单位(万元)
//        第一季度：22,66,44
//        第二季度：77,33,88
//        第三季度：25,45,65
//        第四季度：11,66,99
//        提示：
//        1、按照季度列出二维数组；
//        2、分别对每个一维数组中的元素进行加法运算；
//        3、输出运算结果


        Scanner input =new Scanner(System.in);
        int [][]year=new int[4][3];
        for (int i = 0; i < year.length; i++) {
            System.out.println("第"+(i+1)+"季度：");
            for (int j = 0; j <year[i].length ; j++) {

                    year[i][j]=input.nextInt();
            }

        }
        for (int i = 0; i < year.length; i++) {
            System.out.print("第"+(i+1)+"季度：");
            int count=0;
            for (int j = 0; j <year[i].length ; j++) {

                System.out.print(year[i][j]+"\t");
                count+=year[i][j];

            }
            System.out.println();

        }
        for (int i = 0; i < year.length; i++) {

            int count=0;
            for (int j = 0; j <year[i].length ; j++) {

            
                count+=year[i][j];

            }
            System.out.println("第"+(i+1)+"季度的总值为"+count);

        }

//        for (int i = 0; i < year.length; i++) {
////            for (int j = 0; j <year[i].length ; j++) {
////                System.out.print("第"+(i+1)+"季度："+"\t");
////                year[i][j]=input.nextInt();
////            }
//            System.out.println(year[i]);
//        }


    }
}
