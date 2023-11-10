import java.util.Collections;
import java.util.LinkedList;

public class Rotator {
    public static Object[] rotate(Object[] data, int n) {
        LinkedList<Object> list = new LinkedList<>();
        LinkedList<Object> list2 = new LinkedList<>();
        Collections.addAll(list, data);
        Collections.addAll(list, data);
        //dodac przypadek minusowy i zerowy
        if (n < 0) {
            n *= -1;
            for (int i = 0; i < data.length; i++) {
                if (n <= data.length) {
                    list2.add(list.get(i + n));
                } else {
                    int num = n % data.length;
                    list2.add(list.get(i + num));
                }

            }
            data = list2.toArray();
        } else if (n > 0) {
            for (int i = 0; i < data.length; i++) {
                if (n <= data.length) {
                    list2.add(list.get(data.length + i - n));
                } else {
                    int num = n % data.length;
                    list2.add(list.get(data.length + i - num));
                }
            }
            data = list2.toArray();
        }

        return data;
    }
}
