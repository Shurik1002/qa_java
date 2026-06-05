package com.example.feline;

import com.example.Feline;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineParameterizedTest {

    private static Stream<Arguments> provideCountKittensTestData() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(100, 100)
        );
    }

    Feline feline = new Feline();

    @ParameterizedTest
    @MethodSource("provideCountKittensTestData")
    void getKittensDifferentCountKittensCount(int kittenCount, int expected) {
        int actual = feline.getKittens(kittenCount);
        assertEquals(expected, actual, "Неверное количество котят");

    }

}
