public class checkingLeapYear {

    static boolean checkingLeapYear(Integer yearToCheck) {
        if (yearToCheck % 400 == 0) {
            System.out.println("This is a Leap Year!");
            return true;
        } else {
            if (yearToCheck % 100 == 0) {
                System.out.println("This is not a Leap Year");
                return false;
            } else {
                if (yearToCheck % 4 == 0) {
                    System.out.println("This is a Leap Year!");
                    return true;
                } else {
                    System.out.println("This is not a Leap Year");
                    return false;
                }
            }
        }
    }
}

