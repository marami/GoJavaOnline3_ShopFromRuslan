package goit.module6.musicShop;

import java.util.*;

public class Order {

    private final Map<String, Integer> goodsInShop;
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, Integer> order = new HashMap<>();

    public Order(Map<String, Integer> goodsInShop) {
        this.goodsInShop = goodsInShop;
    }

    public void createOrder() {
        List<String> goodsInOrder = createBlank();
        fillAmounts(goodsInOrder);
        changeBalanceInShop(goodsInOrder);
    }

    private List<String> createBlank() {
        List<String> goods = new ArrayList<>();
        Iterator it = goodsInShop.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = (Map.Entry) it.next();
            goods.add(pair.getKey());
        }
        return goods;
    }

    private void fillAmounts(List<String> goods) {
        for (String product : goods) {
            System.out.println("Enter please your order on " + product + " : ");
            order.put(product, askAmountLessThanInShop(goodsInShop.get(product)));
        }
    }

    private void changeBalanceInShop(List<String> goodsInOrder) {
        for (String musicInstrument : goodsInOrder) {
            goodsInShop.put(musicInstrument, goodsInShop.get(musicInstrument) - order.get(musicInstrument));
            System.out.println("Balance " + musicInstrument + " in our shop: " + goodsInShop.get(musicInstrument));
        }
    }


    private int askAmountLessThanInShop(int amountInShop) {
        int amount;
        boolean positiveInt = false;

        do {
            amount = scanner.nextInt();

            if (amount < 0) {
                System.out.println("Your order is not correct. Please try again");
            } else if (amount > amountInShop) {
                System.out.println("Your number > our assortiment. Please try again");
            } else {
                positiveInt = true;
            }
        } while (!positiveInt);

        return amount;
    }
}



