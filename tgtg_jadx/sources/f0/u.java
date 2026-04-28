package f0;

import android.hardware.HardwareBuffer;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.Image;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final void a(CameraDevice cameraDevice, SessionConfiguration sessionConfiguration) throws CameraAccessException {
        cameraDevice.createCaptureSession(sessionConfiguration);
    }

    public static final List b(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailablePhysicalCameraRequestKeys();
    }

    public static final List c(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionKeys();
    }

    public static final int d(OutputConfiguration outputConfiguration) {
        return outputConfiguration.getMaxSharedSurfaceCount();
    }

    public static final Set e(CameraCharacteristics cameraCharacteristics) {
        Set<String> physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
        physicalCameraIds.getClass();
        return physicalCameraIds;
    }

    public static final Map f(TotalCaptureResult totalCaptureResult) {
        totalCaptureResult.getClass();
        return totalCaptureResult.getPhysicalCameraResults();
    }

    public static final void g(CameraManager cameraManager, String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException {
        cameraManager.getClass();
        executor.getClass();
        cameraManager.openCamera(str, executor, stateCallback);
    }

    public static final void h(CameraManager cameraManager, Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        cameraManager.getClass();
        executor.getClass();
        cameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public static final void i(SessionConfiguration sessionConfiguration, InputConfiguration inputConfiguration) {
        sessionConfiguration.setInputConfiguration(inputConfiguration);
    }

    public static final void j(OutputConfiguration outputConfiguration, String str) {
        outputConfiguration.setPhysicalCameraId(str);
    }

    public static final void k(SessionConfiguration sessionConfiguration, CaptureRequest captureRequest) {
        sessionConfiguration.getClass();
        captureRequest.getClass();
        sessionConfiguration.setSessionParameters(captureRequest);
    }

    public static final HardwareBuffer l(Image image, KClass kClass) {
        if (r8.k.D(kClass, HardwareBuffer.class, kClass)) {
            return image.getHardwareBuffer();
        }
        return null;
    }
}
