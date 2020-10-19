package HomeWork;

import java.util.Scanner;

public class _用户登录 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String uname="张三";
        int pwd=123456;
            boolean bool=true;
        for (int i = 1; i <4 ; i++) {

            System.out.print("请输入用户名");
            String name=input.next();
            System.out.print("请输入密码");
            int num=input.nextInt();
            if (name.equals(uname)&&(pwd==num)){
                System.out.println("登录成功");

                break;
            }
            else {


                if(3-i==0){
                    System.out.println("你没有权限进入");
                }else {
                    System.out.println("用户名或密码输入错误");
                    System.out.println("你还有"+(3-i)+"次机会,请重新输入");
                }

                continue;

            }
        }


    }
}
