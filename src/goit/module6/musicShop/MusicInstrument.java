package goit.module6.musicShop;

import java.util.*;

public abstract class MusicInstrument {

    public static final Map<String, Integer> instruments;
    public static String name = "music instrument";

    static {
        instruments = new HashMap<>();
        instruments.put(Piano.g, 90);
        instruments.put(Guitar.getName(), 100);
        instruments.put(Trumpet.getName(), 130);
    }

    public static void print() {
        System.out.println("Assortiment Piano in our shop: " + instruments.get(Piano.getName()));
        System.out.println("Assortiment Guitar in our shop: " + instruments.get(Guitar.getName()));
        System.out.println("Assortiment Trumpet in our shop: " + instruments.get(Trumpet.getName()));
    }

    public abstract static String getName();

}
