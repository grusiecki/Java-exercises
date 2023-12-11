public class IntTime {
    private int hour;
    private int minutes;
    private int counter;

    public IntTime() {

    }

    public IntTime(int hour, int minutes, int counter) {
        this.hour = hour;
        this.minutes = minutes;
        this.counter = counter;
    }

    public void setHour(int hour) {
        if (hour > 0 && hour < 13) {
            this.hour = hour;
        } else {
            System.out.println("Wrong hour value");
        }
    }

    public void setMinutes(int minutes) {
        if (hour >= 0 && hour < 60) {
            this.minutes = minutes;
        } else {
            System.out.println("Wrong minutes value");
        }
    }

    public String cuckoo(IntTime intTime) {
        int hour = intTime.hour;
        int minutes = intTime.minutes;
        int counter = intTime.counter;
        String result;
        String hourString;
        String minutesString;
        while (counter >= 0) {
            if (minutes > 0 && minutes <= 15) {
                counter -= 1;
                if (counter <= 0) {
                    minutes = 15;
                    break;
                }
                minutes = 30;
            } else if (minutes > 15 && minutes <= 30) {
                counter -= 1;
                if (counter <= 0) {
                    minutes = 30;
                    break;
                }
                minutes = 45;
            } else if (minutes > 30 && minutes <= 45) {
                counter -= 1;
                if (counter <= 0) {
                    minutes = 45;
                    break;
                }
                if (hour == 12) {
                    hour = 1;
                } else {
                    hour += 1;
                }
                minutes = 0;
            } else if (minutes > 45 && minutes < 60) {
                if (hour == 12) {
                    hour = 1;
                } else {
                    hour += 1;
                }
                counter -= hour;
                if (counter <= 0) {
                    minutes = 0;
                    break;
                }
                minutes = 15;
            } else if (minutes == 0) {
                counter -= hour;
                if (counter <= 0) {
                    minutes = 0;
                    break;
                }
                minutes = 15;
            }
        }
        if (hour < 10) {
            hourString = "0" + Integer.toString(hour);
        } else {
            hourString = Integer.toString(hour);
        }
        if (minutes < 10) {
            minutesString = "0" + Integer.toString(minutes);
        } else {
            minutesString = Integer.toString(minutes);
        }
        return result = hourString + ":" + minutesString;
    }
}