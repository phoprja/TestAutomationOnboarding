package task3_hometask_strategy_pattern.phone_camera_app;

import task3_hometask_strategy_pattern.strategy_pattern.SharePhotoStrategy;

public class CameraPlusApp implements PhoneCameraApp {
    @Override
    public void takePhoto() {
        System.out.println("Photo clicked by Camera Plus app");
    }

    @Override
    public void editPhoto() {
        System.out.println("Photo edited by Camera Plus app");
    }

    @Override
    public void savePhoto() {
        System.out.println("Photo saved by Camera Plus app");
    }

    @Override
    public void sharePhoto(SharePhotoStrategy sharePhotoStrategy) {
        System.out.println("Photos shared by Camera Plus app");
        sharePhotoStrategy.sharePhoto();
    }
}
