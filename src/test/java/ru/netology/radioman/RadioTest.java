package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setRadioStationDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationAfterEightDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationAfterNineDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationBeforeOneDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationBeforeZeroDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeDefault() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);
        radio.increaseVolume();

        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveNineDefault() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMaxDefault() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeDefault() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.decreaseVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeTwiceDefault() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.decreaseVolume();
        radio.decreaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeToZeroFromFourDefault() {
        Radio radio = new Radio();

        radio.setCurrentVolume(4);
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBelowOneDefault() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBelowZeroDefault() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncorrectRadioStationAboveNineDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncorrectRadioStationBelowZeroDefault() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncorrectVolumeBelowZeroDefault() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-10);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncorrectVolumeAboveMaxDefault() {
        Radio radio = new Radio();

        radio.setCurrentVolume(125);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationAfterMax() {
        Radio radio = new Radio(15);

        radio.setCurrentRadioStation(14);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio radio = new Radio(40);

        radio.setCurrentRadioStation(30);
        radio.prevStation();

        int expected = 29;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingRadioStation() {
        Radio radio = new Radio(40);

        radio.setCurrentRadioStation(30);
        radio.prevStation();
        Assertions.assertEquals(29, radio.getCurrentRadioStation());
        radio.prevStation();
        radio.prevStation();
        radio.prevStation();
        Assertions.assertEquals(26, radio.getCurrentRadioStation());
        radio.nextStation();
        Assertions.assertEquals(27, radio.getCurrentRadioStation());
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        Assertions.assertEquals(34, radio.getCurrentRadioStation());
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        radio.nextStation();
        Assertions.assertEquals(1, radio.getCurrentRadioStation());
        radio.prevStation();
        radio.prevStation();
        radio.prevStation();
        Assertions.assertEquals(38, radio.getCurrentRadioStation());
    }

    @Test
    public void increaseAndDecreaseVolumeDefault() {
        Radio radio = new Radio();

        radio.setCurrentVolume(40);
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        Assertions.assertEquals(30, radio.getCurrentVolume());
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        Assertions.assertEquals(35, radio.getCurrentVolume());
        radio.setCurrentVolume(97);
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
        radio.setCurrentVolume(3);
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
