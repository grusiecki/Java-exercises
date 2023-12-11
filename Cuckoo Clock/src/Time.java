
public class Time {
    private String time;
    private int counter;

    public Time(String time, int counter) {
        this.time = time;
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public String getTime() {
        return time;
    }

    public IntTime conversion(String time, int counter) {
        this.time = time;
        this.counter = counter;

        String hourString = time.substring(0, 2);
        String minuteString = time.substring(3);
        int hourInt = Integer.parseInt(checkIfFirstIs0(hourString));
        int minuteInt = Integer.parseInt(checkIfFirstIs0(minuteString));

        IntTime intTime = new IntTime(hourInt, minuteInt, counter);
        return intTime;
    }

    private String checkIfFirstIs0(String time) {
        if (time.substring(0, 1) == "0") {
            return time.substring(1, 2);
        } else
            return time;
    }
}
