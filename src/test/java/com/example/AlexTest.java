package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlexTest {

    Alex alex;

    @BeforeEach
    void setUp() throws Exception {
        alex = new Alex(null, null);
    }

    @Test
    void getFriendsNoParamsListOfFriends() {
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        List<String> actual = alex.getFriends();
        assertEquals(expected, actual, "Неверный список друзей");
    }

    @Test
    void getPlaceOfLivingNoParamsNewYorkZoo()  {
        String expected = "Нью-Йоркский зоопарк";
        String actual = alex.getPlaceOfLiving();
        assertEquals(expected, actual, "Неверное место обитания");
    }

    @Test
    void getKittensNoParamsZero()  {
        int actual = alex.getKittens();
        assertEquals(0, actual, "У Алекса не должно быть котят");
    }
}