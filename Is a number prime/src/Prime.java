import java.util.ArrayList;

public class Prime {
    public static boolean isPrime(int number) {
        int i;
        boolean result = false;
        int lastPrime = 2;
        ArrayList<Integer> primeList = new ArrayList<>();
        primeList.add(2);
        primeList.add(3);
        int tooSmallToDivide;

        if (number < 1) { //number lower than 1 cannot be prime
            return false;
        } else if (number == 2) { // two is prime
            return true;
        } else {
            for (i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return result = false;
                } else {
                    int check = i + 1;
                    for (int j = 0; j < primeList.size(); j++) { //checking next prime number
                        if (check % primeList.get(j) != 0) {
                            if (j <= primeList.size() - 1) {
                                lastPrime = check;
                                primeList.add(lastPrime);
                                i = lastPrime - 1;
                                break;
                            }
                        } else {
                            check++;
                            j = 0;
                        }
                    }
                }
                tooSmallToDivide = number / lastPrime;
                if (tooSmallToDivide < lastPrime) { //if number divide by biggest found prime number is smaller than this prime number is no sense to looking for more - number is prime.
                    return true;
                }
                result = true;
            }
        }
        return result;
    }
}
