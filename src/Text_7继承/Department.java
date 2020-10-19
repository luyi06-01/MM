package Text_7继承;

public class Department {
     private int id;//部门编号
     private  String name;//部门名称

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    private  int amount;
     private  String responsibility;
     private  String manager;
     public  Department(){

     }
     public Department(String a,String b,String c){
                 this.name=a;
                 this.manager=b;
                 this.responsibility=c;
     }
     public void print(){
         System.out.println("部门"+this.name);
         System.out.println("经理"+this.manager);
         System.out.println("部门职责"+this.responsibility);
         System.out.println("================");
     }
}
