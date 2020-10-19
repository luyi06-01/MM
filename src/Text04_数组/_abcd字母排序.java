package Text04_数组;

import  java.util.*;

public class _abcd字母排序 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String [] str={"a","d","b","c","e"};
        Arrays.sort(str);
        for (int i = 0; i <str.length ; i++) {
            System.out.print(str[i]+"\t");
        }
        boolean bean=true;


        do {
            System.out.println("请输入你要查找的字母");
            String a=input.next();
            for (int i = 0; i <str.length ; i++) {
                if(a.equals(str[i])){
                    System.out.println(a+"的下标是"+i);
                    bean=false;
                    break;
                }else {

                }

            }
            if(bean==true){
                System.out.println("请重新输入");
            }
        }while (bean);


    }
}
