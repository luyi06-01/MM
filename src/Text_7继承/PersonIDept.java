package Text_7继承;

public class PersonIDept extends Department {
    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    private  int people;//本月计划招募人数
        public PersonIDept(){

        }
        public  PersonIDept(String a,String b,String c,int d){
            super(a,b,c);
            this.people=d;
        }
        public void print(){
            super.print();
            System.out.println("本月招募了"+people+"个新员工");
        }
}
