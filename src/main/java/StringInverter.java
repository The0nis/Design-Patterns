//Concrete-command
public class StringInverter implements StringTransformer {
    public StringDrink input;

    public StringInverter(StringDrink input) {
        this.input = input;
    }

    @Override
    public void execute() {
        StringBuilder orignialText = new StringBuilder(input.getText());
        input.setText(orignialText.reverse().toString());

    }

    @Override
    public void undo() {
        execute();
    }
}
