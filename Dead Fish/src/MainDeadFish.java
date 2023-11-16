import static org.junit.Assert.*;
public class MainDeadFish {
    public static void main(String[] args){
        class ExampleTests {
            @org.junit.Test
            public void exampleTests() {
                assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
                assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
            }
        }
    }
}
