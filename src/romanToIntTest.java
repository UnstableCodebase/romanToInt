import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class romanToIntTest {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }
    private String toRoman(int number) {
        String result = "";

        for (int i = 0; i < number; i++) {
            result += "I";
        }

        return result;
    }
}
