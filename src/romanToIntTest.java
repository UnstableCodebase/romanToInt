import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class romanToIntTest {

    @Test
    public void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }

    @Test
    public void shouldConvert2ToII() {
        assertEquals("II", toRoman(2));
    }

    @Test
    public void shouldConvert3ToIII() {
        assertEquals("III", toRoman(3) );
    }

    @Test
    public void shouldConvert4ToIV(){
        assertEquals("IV", toRoman(4));
    }
    private String toRoman(int number) {
        String result = "";

        for (int i = 0; i < number; i++) {
            result += "I";
        }

        return result;
    }


}
