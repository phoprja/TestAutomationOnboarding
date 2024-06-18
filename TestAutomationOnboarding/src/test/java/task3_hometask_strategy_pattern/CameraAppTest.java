package task3_hometask_strategy_pattern;

import task3_hometask_strategy_pattern.phone_camera_app.BasicCameraApp;
import task3_hometask_strategy_pattern.phone_camera_app.CameraPlusApp;
import task3_hometask_strategy_pattern.strategy_pattern.CameraAppStrategy;
import task3_hometask_strategy_pattern.strategy_pattern.ShareByEmailStrategy;
import task3_hometask_strategy_pattern.strategy_pattern.ShareBySocialMedia;
import task3_hometask_strategy_pattern.strategy_pattern.ShareByTextStrategy;

public class CameraAppTest {
    public static void main(String[] args) {
        CameraAppStrategy basicCameraAppStrategy = new CameraAppStrategy(new BasicCameraApp());
        basicCameraAppStrategy.getPhoneCameraApp().takePhoto();
        basicCameraAppStrategy.getPhoneCameraApp().editPhoto();
        basicCameraAppStrategy.getPhoneCameraApp().savePhoto();
        basicCameraAppStrategy.getPhoneCameraApp().sharePhoto(new ShareBySocialMedia());

        CameraAppStrategy cameraPlusAppStrategy = new CameraAppStrategy(new CameraPlusApp());
        cameraPlusAppStrategy.getPhoneCameraApp().takePhoto();
        cameraPlusAppStrategy.getPhoneCameraApp().editPhoto();
        cameraPlusAppStrategy.getPhoneCameraApp().savePhoto();
        cameraPlusAppStrategy.getPhoneCameraApp().sharePhoto(new ShareByEmailStrategy());
        cameraPlusAppStrategy.getPhoneCameraApp().sharePhoto(new ShareByTextStrategy());

    }
}
