package q;

import android.os.Looper;
import h0.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile a f35694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l0.b f35695h = new l0.b(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f35696f;

    public a() {
        super(18);
        this.f35696f = new b();
    }

    public static a H() {
        if (f35694g != null) {
            return f35694g;
        }
        synchronized (a.class) {
            try {
                if (f35694g == null) {
                    f35694g = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f35694g;
    }

    public final void I(Runnable runnable) {
        b bVar = this.f35696f;
        if (bVar.f35699h == null) {
            synchronized (bVar.f35697f) {
                try {
                    if (bVar.f35699h == null) {
                        bVar.f35699h = b.H(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.f35699h.post(runnable);
    }
}
