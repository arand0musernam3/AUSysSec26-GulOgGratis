package f0;

import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final Set a(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i11) {
        Set<CaptureRequest.Key> availableCaptureRequestKeys = cameraExtensionCharacteristics.getAvailableCaptureRequestKeys(i11);
        availableCaptureRequestKeys.getClass();
        return availableCaptureRequestKeys;
    }

    public static final Set b(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i11) {
        Set<CaptureResult.Key> availableCaptureResultKeys = cameraExtensionCharacteristics.getAvailableCaptureResultKeys(i11);
        availableCaptureResultKeys.getClass();
        return availableCaptureResultKeys;
    }

    public static final void c(OutputConfiguration outputConfiguration, long j9) {
        outputConfiguration.setDynamicRangeProfile(j9);
    }

    public static final void d(OutputConfiguration outputConfiguration, int i11) {
        outputConfiguration.setMirrorMode(i11);
    }

    public static final void e(OutputConfiguration outputConfiguration, long j9) {
        outputConfiguration.setStreamUseCase(j9);
    }
}
