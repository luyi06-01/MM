package _试验代码;

public class _打印图形 {
    public static void main(String[] args) {
        //矩形
//        for (int i = 0; i <5 ; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//            1  1
//            2 2
//            3 3
        //*********************************************
        //三角形
        for (int i = 1; i < 10; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
