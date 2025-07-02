import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Math.round;
//import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void sumRange() {
        Assertions.assertEquals(10, Main.sumRange(1, 4));
    }

    @Test
    void addn() {
        Assertions.assertEquals(10, Main.add(4, 6));
    }

    @Test
    void adds() {
        Assertions.assertEquals("Пример", Main.add("При", "мер"));
    }

    @Test
    void findMax() {
        int[] nums = {-100, 4, 5, 9};
        Assertions.assertEquals(9, Main.findMax(nums));
    }

    @Test
    void factorial() {
        Assertions.assertEquals(3628800, Main.factorial(10));
    }

    @Test
    void calculateAreaC() {
        Assertions.assertEquals(78.54, (double) (round(Main.calculateArea(5) * 100)) / 100.0);
    }

    @Test
    void calculateAreaR() {
        Assertions.assertEquals(30, (double) (round(Main.calculateArea(5, 6) * 100)) / 100.0);
    }

    @Test
    void averageNums() {
        double[] dnums = {1, 2, 3};
        Assertions.assertEquals(2, (double) (round(Main.averageNums(dnums) * 100)) / 100.0);
    }

    @Test
    void pifogor() {
        Assertions.assertEquals(1.41, (double) (round(Main.pifogor(1, 1) * 100)) / 100.0);

    }
}