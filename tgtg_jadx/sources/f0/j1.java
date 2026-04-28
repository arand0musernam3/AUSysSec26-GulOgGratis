package f0;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16730a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f16731b = new LinkedHashMap();

    public final void a(String str, int i11, boolean z11) {
        f4 f4Var;
        str.getClass();
        synchronized (this.f16730a) {
            f4Var = (f4) this.f16731b.get(new e0.s(str));
        }
        if (f4Var == null) {
            return;
        }
        f4Var.f16660b.a(new e0.m0(i11, z11));
    }
}
