package fill.jma;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCalculator {


    public static final double POSITIVE_INFINITY = 1.0 / 0.0;
    public static final double NEGATIVE_INFINITY = -1.0 / 0.0;

    @Test
    public void test()  {
        assertEquals("Error",7.0, Calculator.summ(2.0,5.0));
        assertEquals(POSITIVE_INFINITY, Calculator.division(1.0,0.0));
        assertEquals(NEGATIVE_INFINITY, Calculator.division(-1.0,0.0));
    }




}
