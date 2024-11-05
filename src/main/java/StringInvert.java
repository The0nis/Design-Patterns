public class StringInvert extends StringDrink implements StringTransformer {


    public StringInvert(String input) {
        super(input);
    }

    @Override
    public void execute() {
        // Get the current text from StringDrink
        String originalText = getText();

        // Use StringBuilder to reverse the text
        StringBuilder reversedText = new StringBuilder(originalText);
        reversedText.reverse();

        // Set the inverted text back in the StringDrink class
        setText(reversedText.toString());
    }
}
