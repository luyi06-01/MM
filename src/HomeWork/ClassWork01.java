package HomeWork;

import java.util.Scanner;

public class ClassWork01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入成绩");
        int score=input.nextInt();
        if (score==100){
            System.out.println("奖励bgm");
        }
        else  if(score>=80&&score<99){
            System.out.println("奖励iPhone 12");
        }else  if(score>=60&&score<80){
            System.out.println("奖励iPhone ipad");
        }else {
            System.out.println("没有奖励");
        }
    }
}
