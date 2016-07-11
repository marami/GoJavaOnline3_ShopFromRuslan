package goit.module6.musicShop;

import java.util.*;

public class Order {

    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, Integer> goodsInShop;
    private final Map<String, Integer> order = new HashMap<>();

    public Order(Map<String, Integer> goodsInShop) {
        this.goodsInShop = goodsInShop;
    }

    public void createOrder() {
        List<String> listOfGoods = createBlank();
        fillAmounts(listOfGoods);
        changeBalanceInShop(listOfGoods);
    }

    private List<String> createBlank() {
        List<String> listOfGoods = new ArrayList<>();
        Iterator it = goodsInShop.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = (Map.Entry) it.next();
            listOfGoods.add(pair.getKey());
        }
        return listOfGoods;
    }

    private void fillAmounts(List<String> listOfGoods) {
        for (String product : listOfGoods) {
            System.out.println("Enter please your order on " + product + " : ");
            order.put(product, askAmountLessThanInShop(goodsInShop.get(product)));
        }
    }

    private void changeBalanceInShop(List<String> listOfGoods) {
        for (String product : listOfGoods) {
            goodsInShop.put(product, goodsInShop.get(product) - order.get(product));
            System.out.println("Balance " + product + " in our shop: " + goodsInShop.get(product));
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
                System.out.println("Your number > our range. Please try again");
            } else {
                positiveInt = true;
            }
        } while (!positiveInt);

        return amount;
    }
}



