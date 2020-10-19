package Text04_数组;

import java.util.Random;

public class _累计数组中数字出现的次数 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Random r = new Random();

            int [] nn=new int[10];
        for (int i = 0; i < nn.length; i++) {
            nn[i]=r.nextInt(10);
            System.out.print(nn[i]+"\t");

        }
        System.out.println();
        System.out.println("********");
        int[] aa = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a=0;
        for (int i = 0; i < aa.length; i++) {

            for (int j = 0; j <nn.length ; j++) {
                if(nn[i]==aa[i]){
                    a++;
                }
            }
            System.out.println(aa[i]+"出现了"+a);
        }
    }
}
