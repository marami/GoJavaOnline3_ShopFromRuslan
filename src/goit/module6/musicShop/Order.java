package goit.module6.musicShop;

import javax.sound.midi.Instrument;
import java.util.Scanner;
import java.util.*;

public class Order {

    private Map<String,Integer> yourOrder = new HashMap<>();

    Guitar guitar = new Guitar();
    Piano piano = new Piano();
    Trumpet trumpet = new Trumpet();

    public void createOrder (){

        System.out.println("Please enter numer of guitars in your order - ");
        yourOrder.put("guitar",CorrectScanner.getCorrectInt());

        System.out.println("Please enter numer of pianos in your order - ");
        yourOrder.put("piano",CorrectScanner.getCorrectInt());

        System.out.println("Please enter numer of trumpets in your order - ");
        yourOrder.put("trumpet",CorrectScanner.getCorrectInt());
    }

    public void printOrder(){

        System.out.println("Your order : ");
        System.out.println("Guitars - " + yourOrder.get("guitar"));
        System.out.println("Pianos - " + yourOrder.get("piano"));
        System.out.println("Trumpets - " + yourOrder.get("trumpet"));


    }
}

