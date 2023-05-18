package ru.netology;

public class Radio {
    private int currentRadioNumber;
    private int currentVolume;
    private final int numberStation = 10;
    private int maxStation = numberStation - 1;
    private final int minStation = 0;
    private final int maxVolume = 100;
    private final int minVolume = 0;

    public Radio(int numberStation) {
        this.maxStation = numberStation - 1;
    }

    public Radio() {
    }

    public int getCurrentNumber() {
        return currentRadioNumber;
    }

    public void setCurrentNumber(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentRadioNumber = newCurrentStation;
    }


    public void nextNumber() {
        if (currentRadioNumber < maxStation) {
            currentRadioNumber = currentRadioNumber + 1;
        } else {
            currentRadioNumber = minStation;
        }
    }

    public void previousNumber() {
        if (currentRadioNumber > minStation) {
            currentRadioNumber = currentRadioNumber - 1;
        } else {
            currentRadioNumber = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}