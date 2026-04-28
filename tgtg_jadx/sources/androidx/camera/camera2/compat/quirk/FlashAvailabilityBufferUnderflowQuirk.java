package androidx.camera.camera2.compat.quirk;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.y;
import s0.n1;
import y.e;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/FlashAvailabilityBufferUnderflowQuirk;", "Ls0/n1;", "y/e", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
public final class FlashAvailabilityBufferUnderflowQuirk implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f2188a;

    static {
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = "sprd".toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = "lemp".toLowerCase(locale);
        lowerCase2.getClass();
        e eVar = new e(lowerCase, lowerCase2);
        locale.getClass();
        String lowerCase3 = "sprd".toLowerCase(locale);
        lowerCase3.getClass();
        String lowerCase4 = "DM20C".toLowerCase(locale);
        lowerCase4.getClass();
        f2188a = y.W(new e[]{eVar, new e(lowerCase3, lowerCase4)});
    }
}
