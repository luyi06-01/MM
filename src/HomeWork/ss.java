package HomeWork;

public class ss {
    public static void main(String[] args) {
//        for (int i=0 ; i <5 ; i++) {
//            for (int j = 0; j <5-i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 5; i++) {
//
//            for (int k=1;k <= 5-i;k++){
//                System.out.print(" ");
//            }
//            //输出每行里面的* 2*i-1
//            for (int j = 1; j <= 2*i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= 5; i++) {

//            for (int k=1;k <= 5-i;k++){
//                System.out.print(" ");
//            }
            //输出每行里面的* 2*i-1
            for (int j = 5; j <= 2*i-1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
