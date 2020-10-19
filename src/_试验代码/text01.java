package _试验代码;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import  java.util.Set;
public class text01 {
    public static void main(String[] args) {
        HashMap <String,String>menu=new HashMap();
        menu.put("红烧带鱼","38.0");
        menu.put("鱼香肉丝","20.0");
        menu.put("时令时蔬","10.0");
//        Set  set =     menu.entrySet();
//         Iterator<String> it=set.iterator();
         for (Map.Entry<String,String> aa:menu.entrySet()) {
            System.out.println("食物:"+aa.getKey()+":"+aa.getValue());
       }

    }
}
