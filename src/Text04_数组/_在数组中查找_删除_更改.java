package Text04_数组;

import java.util.Arrays;
import java.util.Scanner;

public class _在数组中查找_删除_更改 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Angelia", "Alice", "tome", "sam", "Jack", "Ruby", "Robin", "Anne"};
        Arrays.sort(names);
        //***********查找**********
//        for (String a:names
//        ) {
//            System.out.print(a+"\t");
//        }
//        System.out.println("请输入要查找的名字");
//        String findname=input.next();
//
//
//        int index = Arrays.binarySearch(names,findname);
//     if(index>0){
//         System.out.println("存在");
//     }


//************************更改******************
//        System.out.println("请输入要更改的名字");
//     String changename=input.next();
//        System.out.println("请输入更改后的名字");
//        String lastname=input.next();
//        int changeindex = Arrays.binarySearch(names,changename);
//        if(changeindex>0){
//            System.out.println("111");
//            for (int i = 0; i <names.length ; i++) {
//                    if (changename.equals(names[i])){
//                            names[i]=lastname;
//                    }
//            }
//        }
//        for (String a:names
//        ) {
//            System.out.print(a+"\t");
//        }
//        int b = 0;
//
        System.out.println("请输入要删除的名字");
        String delname = input.next();
        for (int i = 0; i < names.length; i++) {
            if (delname.equals(names[i])) {
                names[i] = null;
            }
        }
        for (String a:names
        ) {
            System.out.print(a+"\t");
        }
//            if (names[i].equals("null")){
//                b++;
//
//            }
//
//
//        }
//        System.out.println(b);
//        for (String a:names
//        ) {
//            System.out.print(a+"\t");
//        }
//
//        String []arr=new String[b];
//
//        for (int i = 0; i <names.length ; i++) {
//                if(!names[i].equals("null")){
//                    arr[i]=names[i];
//                }
//        }
//        for (String a:arr
//        ) {
//            System.out.print(a+"\t");
//        }
        }


    }

