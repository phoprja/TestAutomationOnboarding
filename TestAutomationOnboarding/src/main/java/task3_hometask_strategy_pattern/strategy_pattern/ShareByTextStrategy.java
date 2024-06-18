package task3_hometask_strategy_pattern.strategy_pattern;

public class ShareByTextStrategy implements SharePhotoStrategy {
    @Override
    public void sharePhoto() {
        System.out.println("Photos shared by text");
    }
}
