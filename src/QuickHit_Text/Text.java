package QuickHit_Text;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {

        int count = 0;
        boolean bool = true;
        Scanner input = new Scanner(System.in);

        do {
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
            System.out.println(str);
            long a = System.currentTimeMillis();
            long b1 = a / 1000;

            String b = input.next();

            long c = System.currentTimeMillis();
            long g = c / 1000;

            if ((g - b1) > 5) {
                System.out.println("超时");
                bool = false;
            } else {

                if (b.equals(str)) {
                    System.out.println("对");
                    count++;

                    bool = true;
                } else {
                    System.out.println("错");
                    bool = false;
                }

            }

        } while (bool);


    }
}
