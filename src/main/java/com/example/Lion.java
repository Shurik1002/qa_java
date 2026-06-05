package com.example;

import java.util.List;

public class Lion {

    private boolean hasMane;
    private final Predator predator;
    private final CatsReproduction catsReproduction;

    public Lion(String sex, Predator predator, CatsReproduction catsReproduction) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.predator = predator;
        this.catsReproduction = catsReproduction;
    }


    public int getKittens() {
        return catsReproduction.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
