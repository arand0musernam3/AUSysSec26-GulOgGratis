package f0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final boolean a(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i11) {
        return cameraExtensionCharacteristics.isCaptureProcessProgressAvailable(i11);
    }

    public static final boolean b(CameraExtensionCharacteristics cameraExtensionCharacteristics, int i11) {
        return cameraExtensionCharacteristics.isPostviewAvailable(i11);
    }

    public static final boolean c(e0.v vVar) {
        vVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
        key.getClass();
        int[] iArr = (int[]) ((t0) vVar).c(key);
        return iArr != null && kotlin.collections.y.t(iArr, 1);
    }

    public static final void d(ExtensionSessionConfiguration extensionSessionConfiguration, OutputConfiguration outputConfiguration) {
        extensionSessionConfiguration.setPostviewOutputConfiguration(outputConfiguration);
    }
}
