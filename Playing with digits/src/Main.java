import static org.junit.Assert.*;
import org.junit.Test;

public class Main {
    public static void main(String[] args){



        class DigPowTest {

            @Test
            public void Test1() {
                assertEquals(1, dig.digPow(89, 1));
            }
            @Test
            public void Test2() {
                assertEquals(-1, dig.digPow(92, 1));
            }
            @Test
            public void Test3() {
                assertEquals(51, dig.digPow(46288, 3));
            }
        }


    }
}