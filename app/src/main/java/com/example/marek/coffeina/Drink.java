package com.example.marek.coffeina;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
        new Drink("Latte", "Czarne espresso z gorącym mlekiem i mleczną pianką", R.drawable.latte),
        new Drink("Cappucino", "Czarne espresso z dużą ilością spienionego mleka", R.drawable.cappuccino),
        new Drink("Espresso", "Czarne kawa ze świeżo mielonych ziaren najwyższej ajkości", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description =  description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
