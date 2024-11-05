//Concrete-command
public class StringReplacer implements StringTransformer {
    public StringDrink input;
    private char text;
    private char change;

    public StringReplacer(StringDrink input, char text, char change) {
        this.input = input;
        this.text = text;
        this.change = change;
    }

    public void execute() {
        String changeText = input.getText().replace(text, change);
        input.setText(changeText);
    }

    @Override
    public void undo() {
        String changeText = input.getText().replace(change, text);
        input.setText(changeText);
    }
}
