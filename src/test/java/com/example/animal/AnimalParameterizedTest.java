package com.example.animal;

import com.example.Animal;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalParameterizedTest {

    Animal animal = new Animal();

    private static Stream<Arguments> provideAnimalKindTestData() {
        return Stream.of(
                Arguments.of("Травоядное", List.of("Трава", "Различные растения")),
                Arguments.of("Хищник", List.of("Животные", "Птицы", "Рыба"))
        );
    }

    @ParameterizedTest
    @MethodSource("provideAnimalKindTestData")
    void getFoodKnownAnimalSpeciesListOfFood(String animalKind, List<String> expected) throws Exception {
        List<String> actual = animal.getFood(animalKind);
        assertEquals(expected, actual);
    }

}
