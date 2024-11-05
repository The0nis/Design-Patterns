public class StringCaseChanger implements StringTransformer {
    private StringDrink input;

    public StringCaseChanger(StringDrink inputText) {
        this.input = inputText;
    }

    public void execute() {
        // Retrieve the original text from StringDrink
        char[] charArray = input.getText().toCharArray();

        // Iterate over each character in the array and change its case
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isUpperCase(c)) {
                charArray[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                charArray[i] = Character.toUpperCase(c);
            }
        }

        // Update the input text with the transformed characters
        input.setText(new String(charArray));
    }
    @Override
    public void undo() {
        execute();
    }
}
