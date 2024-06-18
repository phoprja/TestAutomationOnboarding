package task3_hometask_strategy_pattern.phone_camera_app;

import task3_hometask_strategy_pattern.strategy_pattern.SharePhotoStrategy;

public interface PhoneCameraApp {
    void takePhoto();
    void editPhoto();
    void savePhoto();
    void sharePhoto(SharePhotoStrategy sharePhotoStrategy);
}
