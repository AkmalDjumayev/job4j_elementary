package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {

    @Test
    void when5ToFriday() {
        int day = 5;
        String expected = "Пятница";
        String out = SwitchWeek.nameOfDay(day);
        assertThat(out).isEqualTo(expected);
    }
}