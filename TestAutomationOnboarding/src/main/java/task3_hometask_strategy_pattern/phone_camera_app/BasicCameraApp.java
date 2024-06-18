package task3_hometask_strategy_pattern.phone_camera_app;

import task3_hometask_strategy_pattern.strategy_pattern.SharePhotoStrategy;

public class BasicCameraApp implements PhoneCameraApp {
    @Override
    public void takePhoto() {
        System.out.println("Photo clicked by Basic Camera app");
    }

    @Override
    public void editPhoto() {
        System.out.println("Photo edited by Basic Camera app");
    }

    @Override
    public void savePhoto() {
        System.out.println("Photo saved by Basic Camera app");
    }

    @Override
    public void sharePhoto(SharePhotoStrategy sharePhotoStrategy) {
        System.out.println("Photos shared by Basic Camera app");
        sharePhotoStrategy.sharePhoto();
    }
}
