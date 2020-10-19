package ChiHuoLianMeng;

import java.util.HashMap;
import java.util.Map;

public class CompleteFood {
    Map<String, food> hm = new HashMap();

    public CompleteFood() {

        food f1 = new food("红烧带鱼", "38", 0);
        food f2 = new food("鱼香肉丝", "20", 0);
        food f3 = new food("红烧带鱼", "10", 0);

        hm.put("1", f1);
        hm.put("2", f2);
        hm.put("3", f3);
        System.out.println("序号\t 菜名\t 单价\t 点赞数");
        for (String a : hm.keySet()) {
            System.out.println(a + "\t" + hm.get(a).getName() + "\t" + hm.get(a).getMoney() + "\t" + hm.get(a).getDianzan());
        }

    }

//    public void ss(String a) {
//
//        System.out.println(hm.get(a).getMoney());
//    }
}
