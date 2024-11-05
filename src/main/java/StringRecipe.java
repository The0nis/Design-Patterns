//Invoker
import java.util.List;

public class StringRecipe {
    private List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public void mix() {
        // Apply each transformer in sequence
        for (StringTransformer transformer : transformers) {
            transformer.execute();
        }
    }
}
