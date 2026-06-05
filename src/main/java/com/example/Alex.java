package com.example;

import java.util.List;

public class Alex extends Lion {

    private final List<String> friendsList = List.of("Марти", "Глория", "Мелман");
    private final String home = "Нью-Йоркский зоопарк";

    public Alex(Predator predator, CatsReproduction catsReproduction) throws Exception {
        super("Самец", predator, catsReproduction);
    }

    public List<String> getFriends() {
        return friendsList;
    }

    public String getPlaceOfLiving() {
        return home;
    }
    @Override
    public int getKittens() {
        return 0;
    }

}
