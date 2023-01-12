package ru.netology.radioman;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int numberOfRadioStation;

    public Radio(int newNumberOfRadioStation) {
        this.numberOfRadioStation = newNumberOfRadioStation;
    }

    public Radio(){
        numberOfRadioStation = 10;
    }

    // при задании несуществующей радиостанции будет установлена ближайщая возможная
    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            currentRadioStation = 0;
            return;
        }
        if (newCurrentRadioStation > numberOfRadioStation - 1) {
            currentRadioStation = numberOfRadioStation - 1;
            return;
        }
        currentRadioStation = newCurrentRadioStation;
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

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextStation() {
        if (currentRadioStation < numberOfRadioStation - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = numberOfRadioStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
