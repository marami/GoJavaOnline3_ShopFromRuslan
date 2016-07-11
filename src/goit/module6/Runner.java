/*
антипаттерн состоит в неуклежем написании кода
Возможно код можно было написать гораздо удобней для чтения
 */

package goit.module6;

import goit.module6.musicShop.MusicShop;
import goit.module6.musicShop.Order;

public class Runner {

    public static void main(String[] arg) {

        MusicShop shop = new MusicShop();
        Order order = new Order(shop.getGoods());
        order.createOrder();
    }
}




















