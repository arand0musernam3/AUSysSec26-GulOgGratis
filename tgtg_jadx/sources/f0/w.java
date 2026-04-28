package f0;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final Set a(CameraManager cameraManager) throws CameraAccessException {
        cameraManager.getClass();
        Set<Set<String>> concurrentCameraIds = cameraManager.getConcurrentCameraIds();
        concurrentCameraIds.getClass();
        return concurrentCameraIds;
    }

    public static final void b(CameraDevice cameraDevice, int i11) throws CameraAccessException {
        cameraDevice.setCameraAudioRestriction(i11);
    }
}
