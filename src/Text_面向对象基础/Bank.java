package Text_面向对象基础;

public class Bank {
    public double getMoneny() {
        return moneny;
    }

    public void setMoneny(double moneny) {
        this.moneny = moneny;
    }

    private double moneny;
        public Bank(){

        }
    public Bank(double a){
         this.moneny=a;
    }


}
