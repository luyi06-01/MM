package Text_面向对象基础;

import java.util.Scanner;

public class Text_Bank {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你要贷款的金额");
        double money=input.nextDouble();


            Bank b=new Bank(money);
        System.out.println(b.getMoneny());
            ThreeYear ty=new ThreeYear(money);
        System.out.println(ty.print());


    }
}
