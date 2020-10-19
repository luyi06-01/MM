package Text04_数组;

public class _数组去除 {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3};
        for (int i = 0; i <num.length ; i++) {

            for (int j = i+1; j < num.length; j++) {
              if(num[i]==num[j]){
                 num[j]=-1;
              }
            }
            System.out.print(num[i]+"\t");
        }
        int a=0;

        for (int i = 0; i < num.length; i++) {
            if(num[i]!=-1){
                a++;
            }
        }
        System.out.println(a);
        int [] arr=new int[a];
        int o=0;
        for (int i = 0; i <num.length ; i++) {
            if(num[i]!=-1){
              arr[o]=num[i];
              o+=1;
            }
        }
        for (int aa:arr
             ) {
            System.out.print(aa+"\t");
        }
    }
}
