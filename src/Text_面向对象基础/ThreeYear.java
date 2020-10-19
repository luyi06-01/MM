package Text_面向对象基础;

public class ThreeYear extends Bank{

            public ThreeYear(double mon){
                super(mon);
            }
            public double print(){

                double lixi=super.getMoneny()*0.0603;
                double yuegong=(super.getMoneny()+lixi)/36;
                return  yuegong;
            }
}
