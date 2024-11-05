import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStringReplacer {
    @Test
    public void stringReplacer() {
        StringDrink drink = new StringDrink("ABCDABCD");
        StringReplacer sr = new StringReplacer(drink, 'A', 'X');
        sr.execute();
        assertEquals("XBCDXBCD", drink.getText());
    }
}
