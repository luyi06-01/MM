package _图形;

public class _倒立等腰三角形 {
    public static void main(String[] args) {
        int a=5;
        for (int i = a; i >=1 ; i--) {
            for (int j = 1; j <=a-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
