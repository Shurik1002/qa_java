package com.example.feline;

import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FelineTest {


    @Spy
    Feline feline;

    @Test
    void eatMeatNoParamsListOfMeat() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual, "Ожидался другой список");
    }


    @Test
    void getFamilyNoParamsFeline() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual, "Получено не то семейство");
    }

    @Test
    void getKittensNoParamsOneKitten() {
        int actual = feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
        assertEquals(1, actual, "Неверное количество котят");
    }



}