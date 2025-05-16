package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.10, "Double Sandwich");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public void addHamburgerAddition1(String additionName, double additionPrice) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    public void addHamburgerAddition2(String additionName, double additionPrice) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    public void addHamburgerAddition3(String additionName, double additionPrice) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    public void addHamburgerAddition4(String additionName, double additionPrice) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
}
