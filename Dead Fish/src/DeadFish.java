import java.util.Arrays;
import java.util.LinkedList;

public class DeadFish {
    public static int[] parse(String data) {
        int number = 0;
        LinkedList<Integer> listOfNUmbers = new LinkedList<>();
        char[] charArray = data.toCharArray();
        for (int i = 0; i < data.length(); i++) {
            char letter = charArray[i];
            switch (letter) {
                case 'i' -> number++;
                case 'd' -> number--;
                case 's' -> number *= number;
                case 'o' -> {
                    listOfNUmbers.add(number);
                }
            }
        }
        int[] bo = listOfNUmbers.stream().mapToInt(i->i).toArray();
        return bo;
    }
}

