package goit.module6;


import goit.module6.musicShop.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static goit.module6.musicShop.MusicInstrument.instrument;

public class Runner {

    public static void main(String[] arg) {

        MusicShop musicShop = new MusicShop();
        musicShop.welcomeToShop();

        MusicInstrument musicInstrument = new MusicInstrument();
        musicInstrument.createListInstrument();

        Order order = new Order();
        order.createOrder();
        order.prepareInstruments();


            }
        }













