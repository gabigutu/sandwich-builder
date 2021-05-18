package com.mailsender;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    boolean hasMeat;
    boolean hasCheese;
    boolean hasCucumbers;
    int noTomatoes;
    List<Bread> breads; // tip generic

    public Sandwich() {
        breads = new ArrayList<>();
    }

    public Sandwich addCheese() {
        this.hasCheese = true;
        return this;
    }

    public Sandwich addCucumbers() {
        this.hasCucumbers = true;
        return this;
    }

    public Sandwich addTomatoes() {
        this.noTomatoes++;
        return this;
    }

    public Sandwich addBread(Bread bread) {
        this.breads.add(bread);
        return this;
    }

    public Sandwich removeBread(Bread bread) {
        this.breads.remove(bread);
        return this;
    }

    public Bread getBread(int index) {
        return this.breads.get(index);
    }

}
