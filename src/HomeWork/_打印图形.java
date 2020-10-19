package HomeWork;

public class _打印图形 {
    public static void main(String[] args) {
       // 矩形 长方形
//        for (int i = 0; i <5 ; i++) {
//            for (int j = 0; j <5-i ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //平行四边形
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <5-i; j++) {
//                System.out.print("");
//            }
//            for (int j = 0; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
            //等腰三角形
//        for (int i = 0; i < 5; i++) {
//
//            for (int j = 0; j < ; j++) {
//
//            }
//            for (int j = 0; j < ; j++) {
//
//            }
//            for (int j = 0; j < ; j++) {
//
//            }
//            System.out.println();
//        }
//            for (int i = 0; i < 5; i++) {
//                for (int j = 0; j < 5 - i; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

        for (int i = 1; i <= 10; i++) {

            for (int k=1;k <= 10-i;k++){
                System.out.print(" ");
            }
            //输出每行里面的* 2*i-1
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

