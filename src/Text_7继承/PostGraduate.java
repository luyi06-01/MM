package Text_7继承;

public class PostGraduate  extends Student{
    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    private  String teacher;
        public  PostGraduate(){

        }
    public  PostGraduate(String a,String b,String c){
                super(a,b);
                this.teacher=c;

    }
    public void print(){
        System.out.println("名字是"+super.getName());
        System.out.println("学校是"+super.getSchool());
        System.out.println("导师是"+this.teacher);
    }
}
