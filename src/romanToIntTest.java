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

    @Test
    public void shouldConvert5toV(){
        assertEquals("V", toRoman(5));
    }
    @Test
    public void shouldConvert6toVI(){
        assertEquals("VI", toRoman(6));
    }
    @Test
    public void shouldConvert7toVII(){
        assertEquals("VII", toRoman(7));
    }
    @Test
    public void shouldConvert8toVIII(){
        assertEquals("VIII", toRoman(8));
    }
    @Test
    public void shouldConvert9toIX(){
        assertEquals("IX", toRoman(9));
    }
    @Test
    public void shouldConvert10toX(){
        assertEquals("X", toRoman(10));
    }
    @Test
    public void shouldConvert20ToXX() {
        assertEquals("XX", toRoman(20));
    }

    @Test
    public void shouldConvert39ToXXXIX() {
        assertEquals("XXXIX", toRoman(39));
    }
    private String toRoman(int number) {

        String result = "";
        if (number >= 10){
            result += "X";
            number -= 10;
        }
        if(number >= 9){
            result += "IX";
            number -= 9;
        }

        if(number >= 8){
            result += "VIII";
            number -= 8;
        }
        if(number >= 7){
            result += "VII";
            number -= 7;
        }
        if(number >= 6){
            result += "VI";
            number -= 6;
        }
        if(number >= 5){
            result += "V";
            number -= 5;
        }

        if(number >= 4){
            result += "IV";
            number -= 4;
        }

        for (int i = 0; i < number; i++) {
            result += "I";
        }

        return result;
    }


}
