package Text_7继承;

public class Student extends Person {
     private  String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
     public  Student(){

     }
    public  Student(String a,String b){
        super(a);
            this.school=b;
    }
}
