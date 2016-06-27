package goit.module6.musicShop;

import java.util.*;

public class MusicShop {

    public static void rangeShop(){

        Map<String, Integer> musicInstrument = new HashMap<String, Integer>();

        musicInstrument.put("guitar", new Integer(10));
        musicInstrument.put("piano", new Integer(8));
        musicInstrument.put("trumpet", new Integer(12));

        Set<Map.Entry<String, Integer>> set = musicInstrument.entrySet();

        System.out.println("Hi, welcome to our Music Shop - " + "GoIt Music");
        System.out.println("Read our assortment : ");

        for (Map.Entry<String, Integer> mInstument: set) {

            System.out.print(mInstument.getKey() + " in stock - ");
            System.out.println(mInstument.getValue());
            
        }
    }


}
