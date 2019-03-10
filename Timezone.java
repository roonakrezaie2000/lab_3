package org.clock.logic;

public class Timezone {
    int hour;
    int minute;
    int pos;

    public Timezone(int hour, int minute, int pos) {
        this.hour = hour;
        this.minute = minute;
        this.pos = pos;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getpos() {
        return pos;
    }
}