package ex;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SensorManager f16513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f16514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f16515e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile boolean f16518h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f16511a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f16512b = new k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f16516f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f16517g = new AtomicBoolean(false);

    public static final String a() {
        if (yx.a.f46339a.contains(d.class)) {
            return null;
        }
        try {
            if (f16515e == null) {
                f16515e = UUID.randomUUID().toString();
            }
            String str = f16515e;
            str.getClass();
            return str;
        } catch (Throwable th2) {
            yx.a.a(d.class, th2);
            return null;
        }
    }
}
