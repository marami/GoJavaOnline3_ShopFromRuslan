package goit.module6;

import goit.module6.musicShop.MusicShop;
import goit.module6.musicShop.Order;

public class Runner {

    public static void main(String[] arg) {

        MusicShop musicShop = new MusicShop();

        Order order = new Order();
        order.createOrder();
        order.printOrder();


    }
}
