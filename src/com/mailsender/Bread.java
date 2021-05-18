package com.mailsender;
enum BreadType {
    WHITE,
    DARK
}

enum SeedType {
    GRAIN
}

public class Bread {

    private BreadType breadType;
    private SeedType seedType;

    public Bread(BreadType breadType) {
        this.breadType = breadType;
    }

    public Bread addSeeds(SeedType seedType) {
        this.seedType = seedType;
        return this;
    }
    
}
