package ru.netology;

public class Radio {
    private int currentRadioNumber;
    private int currentVolume;


    public int getCurrentNumber() {
        return currentRadioNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > 9) {
            return;
        }
        currentRadioNumber = newCurrentNumber;
    }

    public void nextNumber() {
        if (currentRadioNumber < 9) {
            currentRadioNumber = currentRadioNumber + 1;
        } else {
            currentRadioNumber = 0;
        }
    }

    public void previousNumber() {
        if (currentRadioNumber > 0) {
            currentRadioNumber = currentRadioNumber - 1;
        } else {
            currentRadioNumber = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}