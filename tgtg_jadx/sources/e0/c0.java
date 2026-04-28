package e0;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r80.b f15323a = w.b.q(0);

    public static final b0 a(y yVar) {
        try {
            Trace.beginSection("CameraPipe");
            g0.e eVar = new g0.e(new a50.c(yVar, 20), new g0.g(yVar.f15419b));
            Trace.endSection();
            return new b0(eVar);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
