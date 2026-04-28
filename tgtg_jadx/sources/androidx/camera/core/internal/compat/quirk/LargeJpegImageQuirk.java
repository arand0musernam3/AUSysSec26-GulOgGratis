package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import s0.n1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class LargeJpegImageQuirk implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f2223a = new HashSet(Arrays.asList("SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T", "SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f2224b = new HashSet(Arrays.asList("V2244A", "V2045", "V2046"));

    public static boolean b() {
        if ("Vivo".equalsIgnoreCase(Build.BRAND)) {
            return f2224b.contains(Build.MODEL.toUpperCase(Locale.US));
        }
        return false;
    }
}
