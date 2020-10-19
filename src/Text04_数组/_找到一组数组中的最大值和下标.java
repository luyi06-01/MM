package Text04_数组;

public class _找到一组数组中的最大值和下标 {
    public static void main(String[] args) {
        int []num={21,34,5,56,39};
        int a=0;
            int temp=num[0];
        int min=num[0];
        for (int i = 0; i <num.length ; i++) {

            if(temp<num[i]){
                temp=num[i];
            }
            if(min>num[i]){
                min=num[i];
            }
        }
        System.out.println(temp);
        System.out.println(min);
        for (int i = 0; i < num.length; i++) {
                if(num[i]==temp){
                    System.out.println(i);
                    break;
                }
        }

    }
}
