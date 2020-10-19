package QuickHit_Text;

import java.util.Random;
import java.util.Scanner;

public class game {
    Scanner input=new Scanner(System.in);
//        public void printStr(){
//            //生出随机字符串
//
//            for (根据等级数循环) {
//                int num=(int)Math.random()*10;
//            }
//            switch (1){
//                case  1:
//                    >
//                    break;
//                case  2:
//                    <
//                    break;
//                case  3:
//                    !
//                    break;
//                case  4:
//                    &
//                    break;
//                case  5:
//                    $
//                    break;
//            }
//            if(内容一样){
//                    if(判断时间是否超时){
//                        System.out.println("输入正确 你的等级?你的积分是？已用时间结束时间-开始时间");
//                    }
//            }
//        }
    public  String getstr(){
        String str = "";
        String ss = "";
        for (int i = 0; i < 2; i++) {
            int num = (int) (Math.random() * 10);
            switch (num) {
                case 0:
                    str = str + "<";
                    break;
                case 1:
                    str = str + ">";
                    break;
                default:
                    str = str + "!";
                    break;
            }
        }
        return str;
    }
    public boolean panduanstr(){
            String h=getstr();
        System.out.println(h);
        long a = System.currentTimeMillis();
        long b1 = a / 1000;

        String b=input.next();

        long c = System.currentTimeMillis();
        long g = c / 1000;

        if ((g - b1) > 5) {
            System.out.println("超时");
            return  false;
        } else {
            if (b.equals(h)) {
                System.out.println("输入正确,你的级别是？你的积分是,已用时间是"+(g - b1));
                return  true;
            } else {
                System.out.println("输入错误");
        return  false;
            }

        }
    }
}
