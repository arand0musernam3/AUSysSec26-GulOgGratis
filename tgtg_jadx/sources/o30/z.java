package o30;

import java.util.Set;
import java.util.logging.Level;
import o00.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z extends i {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final w0.e f31940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m1 f31941k = new m1(z.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Set f31942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f31943i;

    static {
        Throwable th2;
        w0.e yVar;
        try {
            yVar = new x();
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            yVar = new y();
        }
        f31940j = yVar;
        if (th2 != null) {
            f31941k.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }
}
