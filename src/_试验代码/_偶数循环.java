package _试验代码;

public class _偶数循环 {
    public static void main(String[] args) {

      int num=0;
        for (int i = 1; i <=100; i++) {
            if (i%2==0){
                System.out.println(i);
                num=num+i;
            }

        }
        System.out.println("100以内的偶数和是"+num);
    }
}
