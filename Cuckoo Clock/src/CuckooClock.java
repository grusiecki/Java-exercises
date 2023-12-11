public class CuckooClock {
    public static String cuckooClock(String inputTime, int chimes) {
        Time time = new Time(inputTime, chimes);
        IntTime intTime = time.conversion(inputTime, chimes);

        return intTime.cuckoo(intTime);
    }
}
