public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute , int second){
        this.hour = hour;
        this.minute = minute;
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

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time nextSecond(){
        second++;
        if (second >= 60) {
            minute=0;
            minute++;
            nextMinute();

        }
        return this;
    }

    public Time nextMinute(){
        minute++;
        if(minute>60){
            minute=0;
            hour++;
            nextHour();
        }
        return this;

    }

    public Time nextHour(){
        hour++;
        if(hour>23){
            hour=0;
        }
        return this;
    }

    public Time previousSecond(){
        second--;
        if (second < 1) {
            second=59;
            minute--;
            previousMinute();
        }
        return this;
    }

    public Time previousMinute() {
        minute--;
        if(minute<0) {
            minute=59;
        }
        return this;
    }
    public Time  previousHour() {
        hour--;
        if(hour<0) {
            hour=23;
        }

        return this;
    }



    public String toString(){
        return hour+":"+minute+":"+second;
    }
}
