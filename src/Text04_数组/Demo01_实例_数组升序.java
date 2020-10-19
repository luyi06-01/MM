package Text04_数组;
import java.util.*;
public class Demo01_实例_数组升序 {
    public static void main(String[] args) {
        int score[]={23,12,56,35};
        Arrays.sort(score);
        for (int i=0;i<score.length;i++){
            System.out.println(score[i]);
        }
        int num=-Arrays.binarySearch(score,12);
        System.out.println(num);
    }
}
