package ru.mirea.lab9;

public class Shoes implements Comparable {

    private int price;

    public Shoes(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    @Override
    public int compareTo(Shoes other) {
        if (this.price > other.getPrice()) {
            return 1;
        } else if (this.price < other.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Shoes shoe1 = new Shoes(8900);
        Shoes shoe2 = new Shoes(1000);

        int result = shoe1.compareTo(shoe2);

        if (result == 1) {
            System.out.println("Первая пара дороже второй");
        } else if (result == -1) {
            System.out.println("Вторая пара дороже первой");
        } else {
            System.out.println("Стоимость кроссовок одинаковая");
        }
    }
}

