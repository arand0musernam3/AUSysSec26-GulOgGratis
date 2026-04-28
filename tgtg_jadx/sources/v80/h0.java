package v80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f42105a;

    static {
        String property;
        k0 k0Var;
        int i11 = a90.w.f1052a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            c90.f fVar = p0.f42144a;
            w80.c cVar = a90.p.f1044a;
            w80.c cVar2 = cVar.f43295e;
            k0Var = cVar;
            if (cVar == null) {
                k0Var = g0.f42097i;
            }
        } else {
            k0Var = g0.f42097i;
        }
        f42105a = k0Var;
    }
}
