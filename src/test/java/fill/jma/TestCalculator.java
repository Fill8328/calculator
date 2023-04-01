package fill.jma;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.io.IOException;

import static junit.framework.TestCase.*;

public class TestCalculator {


    public static final double POSITIVE_INFINITY = 1.0 / 0.0;
    public static final double NEGATIVE_INFINITY = -1.0 / 0.0;
    public static final Double BIG_DOUBLE = 1.7976931348623158E308-1;


    @Test
    public void testDivision() throws IOException {
        assertEquals("Error",2.0, Calculator.division(2.0,1.0));
        assertEquals(POSITIVE_INFINITY, Calculator.division(1.0,0.0));
        assertEquals(NEGATIVE_INFINITY, Calculator.division(-1.0,0.0));
    }

    @Test
    public void testSubtraction() throws IOException {
        assertEquals(-8.371160868902694E298, Calculator.subtraction(-4.185580434451347E298, 4.185580434451347E298));
        assertEquals(-BIG_DOUBLE, Calculator.subtraction(-1.7976931348623158E308, 1));
    }

    @Test
    public void testSumm() throws IOException {
       // assertEquals(BIG_DOUBLE, Calculator.summ(BIG_DOUBLE,BIG_DOUBLE));
        assertEquals(BIG_DOUBLE, Calculator.summ(BIG_DOUBLE,0));
        assertEquals(1.7976931348623157999999999999999999999999999999999999999999E308, Calculator.summ(BIG_DOUBLE,1));
    }

    @Test
    public void testMultiplication() throws IOException{
        assertNotSame(4,"4");
        assertSame("Error",4,"4");
    }
}
