package ChiHuoLianMeng;

import java.util.Scanner;

public class ComGongNeng {
    Scanner input = new Scanner(System.in);
String adrees="";
    int finalmoney=0;
    int  time=0;
    int money=0;//总价
    //完成点餐
    public void completefood() {
        System.out.print("请输入订餐人的姓名");
        String name = input.next();

        CompleteFood tf = new CompleteFood();

        System.out.print("请输入你要点的菜品编号");
        String  chooisefood = input.next();
        System.out.print("请选择你需要的份数");
        int chooisecount = input.nextInt();
        String uname=tf.hm.get(chooisefood).getName();
        //System.out.println(tf.hm.get(chooisefood).getMoney());
        System.out.print("请输入送餐时间(送餐时间是10点至20点间整点送餐)");
          time=input.nextInt();
            if (time>=10&&time<=20){
                System.out.println("请输入送餐地址:");
                adrees=input.next();
                System.out.println("订餐成功!!");
                System.out.print("你定的是:");
                System.out.println(tf.hm.get(chooisefood).getName()+"*"+chooisecount+"份");
                System.out.println("送餐时间是"+time);

             finalmoney= (Integer.parseInt(tf.hm.get(chooisefood).getMoney()) *chooisecount);

            if (finalmoney>=50){
                System.out.println("餐费是:"+finalmoney+"运餐费：0.0元,总计："+finalmoney+"元");
            }else {
                finalmoney=finalmoney+5;
                System.out.println("餐费是:"+(finalmoney-5)+"运餐费：5.0元,总计："+finalmoney+"元");
            }


            }else {
                System.out.println("输入错误，请重新输入");
            }
            this.lookfood(name, uname,time,adrees,finalmoney);
    }
    //查看餐袋
        public void lookfood(String name,String foodname,int time,String address,int money){
            ComGongNeng c=new ComGongNeng();
            CompleteFood tf=new CompleteFood();

            System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址\t总金额\t订单状态");

        }


}
