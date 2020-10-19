package ChiHuoLianMeng;

public class food {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    private String name;
    private String money;

    public int getDianzan() {
        return dianzan;
    }

    public void setDianzan(int dianzan) {
        this.dianzan = dianzan;
    }

    private int dianzan;
    public  food(){

    }
    public  food(String a,String b,int c){
     this.name=a;
     this.money=b;
     this.dianzan=c;

    }

}
