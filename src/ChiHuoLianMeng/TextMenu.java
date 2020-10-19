package ChiHuoLianMeng;

import java.util.Scanner;

public class TextMenu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=0;
        System.out.println("欢迎使用“吃货联盟订餐系统”");
        System.out.println("====================");
        System.out.println("1.我要订餐");
        System.out.println("2.查看餐袋");
        System.out.println("3.签收订单");
        System.out.println("4.删除订单");
        System.out.println("5.我要点赞");
        System.out.println("6.退出系统");
        System.out.println("====================");
        System.out.println("请选择");
        int chooise=input.nextInt();



            switch (chooise){
                case  1:
                    System.out.println("===我要订餐===");

                    ComGongNeng c=new ComGongNeng();
                    c.completefood();
                    break;
                case  2:
                    System.out.println("===查看餐袋===");
                    break;
                case  3:
                    System.out.println("===签收订单===");
                    break;
                case  4:
                    System.out.println("===删除订单===");
                    break;
                case  5:
                    System.out.println("===我要点赞===");
                    break;
                case  6:
                    System.out.println("===退出系统===");
                    break;

            }





    }
}
