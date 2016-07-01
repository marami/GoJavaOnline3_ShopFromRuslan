package goit.module6.musicShop;

import java.security.Key;
import java.util.*;

import static goit.module6.musicShop.MusicInstrument.instrument;

public class Order {

    public static void createOrder() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter please your order on Guitar: ");

        int numberGuitar = 0;
        boolean positiveIntGuitar = false;

        while (!positiveIntGuitar) {

            numberGuitar = scanner.nextInt();
            if (numberGuitar < 0) {
                System.out.println("Your order is not correct.Please try again");
            } else {
                positiveIntGuitar = true;
            }
        }

        System.out.println("Enter please your order on Piano: ");

        int numberPiano = 0;
        boolean positiveIntPiano = false;

        while (!positiveIntPiano) {

            numberPiano = scanner.nextInt();
            if (numberPiano < 0) {
                System.out.println("Your order is not correct.Please try again");
            } else {
                positiveIntPiano = true;
            }
        }

        System.out.println("Enter please your order on Trumpet: ");

        int numberTrumpet = 0;
        boolean positiveIntTrumpet = false;

        while (!positiveIntTrumpet) {

            numberTrumpet = scanner.nextInt();
            if (numberTrumpet < 0) {
                System.out.println("Your order is not correct.Please try again");
            } else {
                positiveIntTrumpet = true;
            }
        }

        Map<String, Integer> order = new HashMap<String, Integer>();
        order.put(Piano.getNamePiano(),new Integer(numberPiano));
        order.put(Guitar.getNameGuitar(),new Integer(numberGuitar));
        order.put(Trumpet.getNameTrumpet(),new Integer(numberTrumpet));

        for (Map.Entry<String,Integer> ord : order.entrySet()) {

            System.out.printf("Name your instrument order - %s - number of: %d \n", ord.getKey(), ord.getValue());
            
        }

    }
//    НЕ ЗНАЮ ЧТО С ЭТИМ МЕТОДОМ СДЕЛАТЬ????
    public List<MusicInstrument> prepareInstruments (Map<String,Integer> order) {

        List <MusicInstrument> balance = new ArrayList<>();


        
        for (int i =0; i < instrument.size();i++){
            for (int j=0; j < order.size();j++){
                if(instrument.equals(order)) {
                    instrument.remove(order);
                    System.out.println(instrument);
                }
                instrument.clear();
                instrument.putAll(instrument: Map<? extends String,? extends Integer>);

            }

        }

    }

}


