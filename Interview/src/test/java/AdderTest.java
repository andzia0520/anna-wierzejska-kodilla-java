import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {
    @Test
    public void testSumAllFromOneTillX() {
        //Given
        Adder adder = new Adder();
        int finalInteger = 7;

        //When
        int result = adder.sumAllFromOneTillX(finalInteger);

        //Then
        assertEquals(28, result);
    }

}