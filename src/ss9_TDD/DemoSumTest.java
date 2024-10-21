package ss9_TDD;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DemoSumTest {

    @Test
    public void sum() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        DemoSum demoSum = new DemoSum();
        assertEquals(4294967294L, demoSum.sum(a, b));
    }
}