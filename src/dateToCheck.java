import java.util.Scanner;

public class dateToCheck {
    static Integer giveTheDate() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Write year from 1600 to 4000 and discover if it is a leap year!:");
        String year;
        int intYear = 0;
        boolean correctYear = false;
        while (!correctYear) {
            year = userInput.nextLine();

            try {
                intYear = Integer.parseInt(year);

            } catch (NumberFormatException e) {
                System.out.println("It need to be only number!");
            }
            if (intYear > 1599 && intYear < 4001) {
                correctYear = true;
            } else {
                System.out.println("Year should be in the range 1600 to 4000");
            }
        }
        return intYear;
    }

}
