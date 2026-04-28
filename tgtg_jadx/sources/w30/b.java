package w30;

import a40.u;
import c50.w;
import p30.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f43095a;

    public b(u uVar) {
        this.f43095a = uVar;
    }

    public static b a() {
        b bVar = (b) g.c().b(b.class);
        if (bVar != null) {
            return bVar;
        }
        w.l("FirebaseCrashlytics component is not present.");
        return null;
    }
}
