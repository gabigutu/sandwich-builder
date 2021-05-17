package com.mailsender;

public class Sandwich {

    boolean hasMeat;
    boolean hasCheese;
    boolean hasCucumbers;
    boolean hasTomatoes;

    public Sandwich(boolean hasMeat) {
        this(hasMeat, false, false, false);
    }

    public Sandwich(boolean hasMeat, boolean hasCheese) {
        this(hasMeat, hasCheese, false, false);
    }

    public Sandwich(boolean hasMeat, boolean hasCheese, boolean hasCucumbers) {
        this(hasMeat, hasCheese, hasCucumbers, false);
    }

    public Sandwich(boolean hasMeat, boolean hasCheese, boolean hasCucumbers, boolean hasTomatoes) {
        this.hasMeat = hasMeat;
        this.hasCheese = hasCheese;
        this.hasCucumbers = hasCucumbers;
        this.hasTomatoes = hasTomatoes;
    }

    public void addCheese() {
        this.hasCheese = true;
    }

    public void addCucumbers() {
        this.hasCucumbers = true;
    }

    public void addTomatoes() {
        this.hasTomatoes = true;
    }

}
