package goit.module6.musicShop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MusicShop {
    private final Map<String, Integer> goods = new HashMap<>();

    public MusicShop() {
        System.out.println("Hello,welcome to our music shop 'GoIt'");
        System.out.println("Discover our range : ");

        goods.put(new Piano().getName(), 90);
        goods.put(new Guitar ().getName(), 100);
        goods.put(new Trumpet().getName(), 130);

        print();
    }


    public void print() {
        Iterator it = goods.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<String, Integer> pair = (Map.Entry)it.next();
            System.out.println("Assortiment " + pair.getKey() + " in our shop: " + pair.getValue());
        }
    }

    public Map<String, Integer> getGoods() {
        return goods;
    }
}





