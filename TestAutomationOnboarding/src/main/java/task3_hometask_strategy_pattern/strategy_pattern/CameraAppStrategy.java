package task3_hometask_strategy_pattern.strategy_pattern;

import task3_hometask_strategy_pattern.phone_camera_app.PhoneCameraApp;

public class CameraAppStrategy {
    private PhoneCameraApp phoneCameraApp;
    public CameraAppStrategy (PhoneCameraApp phoneCameraApp) {
        this.phoneCameraApp = phoneCameraApp;
    }

    public PhoneCameraApp getPhoneCameraApp() {
        return phoneCameraApp;
    }
}
