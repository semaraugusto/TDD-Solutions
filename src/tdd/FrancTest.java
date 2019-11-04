package tdd;
import static org.junit.Assert.*;
import org.junit.Test;

public class FrancTest {

    @Test
    public void testMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
}
