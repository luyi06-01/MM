package NO_01;
import  java.util.ArrayList;
import java.util.List;

public class Demo01_示例2_ArrayList {
    public static void main(String[] args) {
        NewTitlle car=new NewTitlle("汽车","管理员");
        NewTitlle text=new NewTitlle("高考","管理员");
        List n=new ArrayList();
        n.add(car);
        n.add(text);
        for (Object obj:n) {
            NewTitlle s=(NewTitlle)obj;
            System.out.println(s.getName());
        }
    }
}
