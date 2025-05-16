package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addHamburgerAddition1(String additionName, double additionPrice) {
        this.addition1Name = additionName;
        this.addition1Price = additionPrice;
    }
    public void addHamburgerAddition2(String additionName, double additionPrice) {
        this.addition2Name = additionName;
        this.addition2Price = additionPrice;
    }
    public void addHamburgerAddition3(String additionName, double additionPrice) {
        this.addition3Name = additionName;
        this.addition3Price = additionPrice;
    }
    public void addHamburgerAddition4(String additionName, double additionPrice) {
        this.addition4Name = additionName;
        this.addition4Price = additionPrice;
    }
    public void itemizeHamburger() {
        System.out.println("Name: " + name + " Meat: " + meat + " BreadRollType: " + breadRollType + " Addition1: " + addition1Name + " Addition2: " + addition2Name + " Addition3: " + addition3Name + " Addition4: " + addition4Name + " Price: " + (price + addition1Price + addition2Price + addition3Price + addition4Price));
    }
}
