package l8;

import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ n f27470b = new n(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27471a;

    public /* synthetic */ n(int i11) {
        this.f27471a = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27471a) {
            case 0:
                try {
                    Method method = d7.g.f14568b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j.d()) {
                        j.a().e();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    Method method2 = d7.g.f14568b;
                    Trace.endSection();
                    throw th2;
                }
            case 1:
            default:
                return;
        }
    }

    private final void a() {
    }

    private final /* synthetic */ void b() {
    }
}
