package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + healthyExtra1Price + healthyExtra2Price;
    }

    public void addHealthyAddition1(String healthyExtra, double healthyExtraPrice) {
        this.healthyExtra1Name = healthyExtra;
        this.healthyExtra1Price = healthyExtraPrice;
    }
    public void addHealthyAddition2(String healthyExtra, double healthyExtraPrice) {
        this.healthyExtra2Name = healthyExtra;
        this.healthyExtra2Price = healthyExtraPrice;
    }
    public void itemizeHamburger() {
        System.out.println("Name: " + super.getName() + " Meat: " + super.getMeat() + " BreadRollType: " + super.getBreadRollType() + " Addition1: " + healthyExtra1Name + " Addition2: " + healthyExtra2Name + " Price: " + (super.getPrice() + healthyExtra1Price + healthyExtra2Price));
    }
}
