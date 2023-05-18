package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(30);

    @Test
    public void shouldNextNumber() {
        radio.setCurrentNumber(21);

        radio.nextNumber();

        int expected = 22;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberAfterMax() {
        radio.setCurrentNumber(29);

        radio.nextNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousNumber() {
        radio.setCurrentNumber(3);

        radio.previousNumber();

        int expected = 2;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousNumberBeforeMin() {
        radio.setCurrentNumber(0);

        radio.previousNumber();

        int expected = 29;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberAboveMax() {
        radio.setCurrentNumber(31);

        radio.nextNumber();

        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberBelowMin() {
        radio.setCurrentNumber(-5);

        radio.previousNumber();

        int expected = 29;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumber() {
        radio.setCurrentNumber(25);

        int expected = 25;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(80);

        radio.increaseVolume();

        int expected = 81;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setCurrentVolume(56);

        radio.decreaseVolume();

        int expected = 55;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMin() {
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        radio.setCurrentVolume(105);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        radio.setCurrentVolume(-10);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}