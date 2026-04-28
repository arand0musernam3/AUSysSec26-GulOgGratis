package e0;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import com.google.android.gms.internal.measurement.cg;
import java.util.HashMap;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ u f15407a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f15408b;

    static {
        HashMap map = u0.f15409c;
        cg.n("androidx.camera.camera2.pipe.scalar.streamConfigurationMap", Reflection.getOrCreateKotlinClass(f0.class));
        cg.n("androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap", Reflection.getOrCreateKotlinClass(w.class));
        cg.n("androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap", Reflection.getOrCreateKotlinClass(h.class));
        f15408b = new int[0];
    }

    public static boolean a(v vVar) {
        vVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
        key.getClass();
        f0.t0 t0Var = (f0.t0) vVar;
        Float f11 = (Float) t0Var.c(key);
        if (f11 == null) {
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
            key2.getClass();
            int[] iArr = (int[]) t0Var.c(key2);
            if (iArr == null) {
                return false;
            }
            if (!kotlin.collections.y.t(iArr, 1) && !kotlin.collections.y.t(iArr, 2) && !kotlin.collections.y.t(iArr, 4) && !kotlin.collections.y.t(iArr, 3)) {
                return false;
            }
        } else if (f11.floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    public static boolean b(v vVar) {
        vVar.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        v.f15412i0.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        key.getClass();
        int[] iArr = (int[]) ((f0.t0) vVar).c(key);
        if (iArr == null) {
            iArr = f15408b;
        }
        return kotlin.collections.y.t(iArr, 2);
    }

    public static boolean c(v vVar) {
        vVar.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        Integer num = (Integer) ((f0.t0) vVar).c(key);
        return num != null && num.intValue() == 2;
    }
}
