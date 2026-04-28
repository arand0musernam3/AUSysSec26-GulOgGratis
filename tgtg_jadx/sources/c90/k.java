package c90;

import a90.w;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f7843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f7844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f7846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f7847f;

    static {
        String property;
        int i11 = w.f1052a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f7842a = property;
        f7843b = a90.g.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, LongCompanionObject.MAX_VALUE);
        int i12 = w.f1052a;
        if (i12 < 2) {
            i12 = 2;
        }
        f7844c = a90.g.l(i12, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f7845d = a90.g.l(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f7846e = TimeUnit.SECONDS.toNanos(a90.g.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, LongCompanionObject.MAX_VALUE));
        f7847f = h.f7838a;
    }
}
