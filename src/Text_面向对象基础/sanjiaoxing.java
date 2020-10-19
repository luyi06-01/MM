package Text_面向对象基础;

public class sanjiaoxing {

    public boolean triangle(int a, int b, int c) {
        boolean bl=false;
        if (a + b > c && a + c > b && b + c > a) {
                    bl=true;
        }else {
            bl=false;
            System.out.println("输入错误");
        }
        return bl;
    }
    public  void shape(int a, int b, int c){
            if (triangle(a,b,c)==true){
                if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
                    System.out.println("这是一个直角三角形");
                }
                 if(a*a+b*b>c*c||a*a+c*c>b*b||b*b+c*c>a*a){
                    System.out.println("这是一个钝角三角形");
                }
                else {
                    System.out.println("这是一个锐角三角形");
                }
            }

    }
}