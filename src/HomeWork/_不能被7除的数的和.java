package HomeWork;

public class _不能被7除的数的和 {
    public static void main(String[] args) {
        int num=0;
        for (int i = 1; i <101 ; i++) {
            if(i%7!=0){
                num=num+i;
            }
        }
        System.out.println(num);
    }
}
