package Text04_数组;

public class Demo01_实例14_二维数组 {
    public static void main(String[] args) {
        int scores[][]=new int[][]{{90,85,92,78,54},{76,63,80},{46,25,}};
        int total;
        for (int i=0; i<scores.length;i++){

            total=0;
            for (int j=0;j<scores[i].length;j++){
                total+=scores[i][j];
            }
            System.out.println("第"+i+"的总成绩是"+total);
        }
    }
}
