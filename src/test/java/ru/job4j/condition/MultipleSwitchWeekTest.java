package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {

    @Test
    void whenFriday() {
        String name = "Пятница";
        int expected = 5;
        int out = MultipleSwitchWeek.numberOfDay("Пятница");
        assertThat(out).isEqualTo(expected);
    }
}