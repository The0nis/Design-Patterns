public class HumanClient implements Client, BarObserver{
    @Override
    public void wants(StringRecipe recipe, StringBar bar) {
        // Specify behavior when a client "wants" something
        if (bar.isHappyHour()) {
            recipe.mix();

        }
    }

    @Override
    public void happyHourStarted(Bar bar) {
        // React to happy hour starting (implementation can vary)
    }

    @Override
    public void happyHourEnded(Bar bar) {
        // React to happy hour ending (implementation can vary)
    }
}
