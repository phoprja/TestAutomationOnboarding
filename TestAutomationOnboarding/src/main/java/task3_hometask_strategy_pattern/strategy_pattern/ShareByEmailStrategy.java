package task3_hometask_strategy_pattern.strategy_pattern;

public class ShareByEmailStrategy implements SharePhotoStrategy {
    @Override
    public void sharePhoto() {
        System.out.println("Photos shared by email");
    }
}
