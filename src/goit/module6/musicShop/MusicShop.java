package goit.module6.musicShop;

import java.util.HashMap;
import java.util.Map;

public class MusicShop {
    public final Map<String, Integer> instruments = new HashMap<>();

    public void MusicShop() {
        System.out.println("Hello,welcome to our music shop 'GoIt'");
        System.out.println("Discover our range : ");

        instruments.put(Piano.getClass().getSimpleName(), 90);
        instruments.put("", 100);
        instruments.put(Trumpet.getName(), 130);

        MusicInstrument.print();
    }

}





