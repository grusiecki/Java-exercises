
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Main {
    public static void main(String[] args){



         class LeapYearTest
        {

            @Test
            public void testYear2020()
            {
                assertEquals(true, checkingLeapYear.checkingLeapYear(2020));
            }

            @Test
            public void testYear2000()
            {
                assertEquals(true, checkingLeapYear.checkingLeapYear(2000));
            }

            @Test
            public void testYear2015()
            {
                assertEquals(false, checkingLeapYear.checkingLeapYear(2015));
            }

            @Test
            public void testYear2100()
            {
                assertEquals(false, checkingLeapYear.checkingLeapYear(2100));
            }
        }

    }
}


