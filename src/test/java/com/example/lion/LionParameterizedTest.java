package com.example.lion;

import com.example.CatsReproduction;
import com.example.Lion;
import com.example.Predator;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LionParameterizedTest {

    @Mock
    Predator predator;

    @Mock
    CatsReproduction catsReproduction;

    private static Stream<Arguments> provideLionSexTestData() {
        return Stream.of(
                Arguments.of("Самец", true),
                Arguments.of("Самка", false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideLionSexTestData")
    void doesHaveManeKnownSexBoolean(String sex, boolean expected) throws Exception {
        Lion lion = new Lion(sex, predator, catsReproduction);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

}
