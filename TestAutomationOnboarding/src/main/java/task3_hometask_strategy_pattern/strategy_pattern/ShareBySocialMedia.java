package task3_hometask_strategy_pattern.strategy_pattern;

public class ShareBySocialMedia implements SharePhotoStrategy {
    @Override
    public void sharePhoto() {
        System.out.println("Photos shared by social media");
    }
}
