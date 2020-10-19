package Text_面向对象基础;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
       if (sex.equals("男")||sex.equals("女")){
          this. sex=sex;
       }else {
           System.out.println("输入不合法");
       }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0||age>=150){
            System.out.println("输入的年龄为"+age);
            System.out.println("输入的年龄不合法,将重置");

            return;
        }else {
           this.age=age;
        }
    }

    private  String name;
    private  String sex;
    private  int age;

    public  void print(){
        System.out.println("自我介绍一下");
        System.out.println("我叫"+this.name);
        System.out.println("我的性别是"+this.sex);
        System.out.println("我的年龄是"+this.age);
    }
    }

