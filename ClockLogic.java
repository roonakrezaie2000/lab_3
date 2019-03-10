package org.clock.logic;

public class ClockLogic {
    int hour;
    int minute;
    int second;
    public ClockLogic(int hour, int minute , int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public ClockLogic(int hour, int minute , int second , Timezone t){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        if(t.getpos() >0){
            this.minute += t.getMinute();
            this.hour += t.getHour();
            if(this.minute >= 60){
                this.minute = this.minute%60;
                this.hour += this.minute/60;
                if(this.hour>12){
                    this.hour = this.hour%12;
                }
            }
        }
        else{
            this.minute -= t.getMinute();
            this.hour -= t.getHour();
        }
    }
    public void setClock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }


    public void tik(int second) {
        this.second += second;
        if (this.second >= 60) {
            this.minute += (this.second / 60);
            this.second = (this.second%60);
            if (this.minute >= 60) {
                this.hour += (this.minute / 60);
                this.minute = (this.minute%60);
                if (this.hour > 12) {
                    this.hour = (this.hour % 12);
                }
            }
        }
    }
}