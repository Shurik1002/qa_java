package com.example.lion;

import com.example.Feline;
import com.example.Lion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Feline feline;

    Lion lion;

    @BeforeEach
    void setUp() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    void lionConstructorUnknownSexThrowException() {
        Exception exception = assertThrows(Exception.class,
                () -> new Lion("Неизвестно", feline)
        );
        assertEquals(
                "Используйте допустимые значения пола животного - самец или самка",
                exception.getMessage());
    }

    @Test
    void getKittensNoParamsOne() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        assertEquals(1, actual, "Неверное число котят");

    }


    @Test
    void getFoodNoParamsListOfMeat() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List <String> expected = List.of("Животные", "Птицы", "Рыба");
        List <String> actual = lion.getFood();
        assertEquals(expected, actual, "Неверный список еды");
    }
}