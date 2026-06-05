package com.example.animal;

import com.example.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal animal = new Animal();

    @Test
    void getFoodUnknownAnimalSpeciesThrowsException() {

        Exception exception = assertThrows(
                Exception.class,
                () -> animal.getFood("Другое животное")
        );

        String expectedString = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        assertEquals(expectedString, exception.getMessage());
    }


    @Test
    void getFamilyNoParamsFamilyDescription() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }

}