package goit.module6;


import goit.module6.musicShop.*;



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













