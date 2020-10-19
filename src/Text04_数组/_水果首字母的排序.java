package Text04_数组;

import java.util.Arrays;
import java.util.Scanner;

public class _水果首字母的排序 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String []shuiguo=new String[5];
        for (int i = 0; i <5 ; i++) {
            System.out.println("请输入第"+(i+1)+"个水果的名称");
           shuiguo[i]=input.next();
        }
       // 如葡萄grape，橘子orange，香蕉banana，苹果apple，桃peach)，编写
        Arrays.sort(shuiguo);
        for (String a:shuiguo
             ) {
            System.out.println(a);
        }
    }
}
