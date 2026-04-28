package f0;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final List a(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionCharacteristicsKeys();
    }

    public static final int b(e0.v vVar) {
        vVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL;
        key.getClass();
        Integer num = (Integer) ((t0) vVar).c(key);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final int c(e0.v vVar) {
        vVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
        key.getClass();
        Integer num = (Integer) ((t0) vVar).c(key);
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public static final boolean d(e0.v vVar) {
        vVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL;
        key.getClass();
        Integer num = (Integer) ((t0) vVar).c(key);
        return num != null && num.intValue() > 1;
    }
}
