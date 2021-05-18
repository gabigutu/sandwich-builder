package com.mailsender;

public class Main {

    public static void main(String[] args) {
        // Asa nu
        // Sandwich sandwich = new Sandwich(true, false, true, 0);
        // sandwich.addTomatoes();
        // sandwich.addCheese();
        // sandwich.addCheese();
        // sandwich.addCucumbers();
        // Bread bread = new Bread(BreadType.DARK);
        // bread.addSeeds(SeedType.GRAIN);
        // sandwich.addBread(bread);

        // Builder design pattern
        // HOW???

        Sandwich sandwich = new Sandwich()
            .addTomatoes()
            .addCheese()
            .addCheese()
            .addTomatoes()
            .addCucumbers()
            .addCucumbers()
            .addBread(new Bread(BreadType.DARK).addSeeds(SeedType.GRAIN))
            .addBread(new Bread(BreadType.WHITE));
        sandwich.removeBread(sandwich.getBread(0));

    }
}
