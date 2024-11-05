import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTransformUndo {
    @Test
    public void transformUndo() {
        StringDrink drink = new StringDrink( "AbCd-aBcD");

        StringInverter si = new StringInverter(drink);
        StringCaseChanger cc = new StringCaseChanger(drink);
        StringReplacer sr = new StringReplacer(drink, 'A', 'X');

        si.execute();
        cc.execute();
        sr.execute();

        sr.undo();
        assertEquals("dCbA-DcBa", drink.getText());

        cc.undo();
        assertEquals("DcBa-dCbA", drink.getText());

        si.undo();
        assertEquals("AbCd-aBcD", drink.getText());
    }
}
