package Text04_数组;

import java.util.Scanner;

public class _插入数组 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]names={"Angelia","Alice","tome","sam","Jack","Ruby",null,"Robin","Anne"};
        System.out.print("请输入你要添加的名字");
        String name=input.next();
        for (int i = 0; i < names.length; i++) {
                    if(names[i]==null){
                            names[i]=name;
                    }
        }
        System.out.println("添加后的名单是:");
        for (String a:names
             ) {
            System.out.print(a+"\t");
        }
    }
}
