package goit.module6.musicShop;

import java.util.*;

public class MusicInstrument {

     static Map<String,Integer> instrument = new HashMap<>();

    public static void createListInstrument() {

        Map<String,Integer> instrument = new HashMap<>();
        instrument.put(Piano.getNamePiano(),new Integer(100));
        instrument.put(Guitar.getNameGuitar(), new Integer(100));
        instrument.put(Trumpet.getNameTrumpet(),new Integer(100));
        instrument.size();

        for (Map.Entry<String,Integer> instr : instrument.entrySet() ) {

                System.out.printf("Name instrument - %s - in stock : %d \n", instr.getKey(), instr.getValue());
            
        }
    }
}
