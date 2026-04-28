package o00;

import android.os.Build;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends cl.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f31750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f31751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f31752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference f31753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f31754f;

    static {
        String str = Build.FINGERPRINT;
        f31750b = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f31751c = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f31752d = "eng".equals(str3) || "userdebug".equals(str3);
        f31753e = new AtomicReference();
        new AtomicLong();
        f31754f = new ConcurrentLinkedQueue();
    }
}
