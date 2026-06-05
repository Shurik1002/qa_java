package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CatTest {

    @Mock
    Feline feline;

    Cat cat;

    @BeforeEach
    void setUp() {
        cat = new Cat(feline);
    }

    @Test
    void getSoundNoParamsCatsSound() {
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual, "Неверный вывод");
    }

    @Test
    void getFoodNoParamsListOfMeat() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

}