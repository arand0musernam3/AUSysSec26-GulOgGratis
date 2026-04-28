package z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f47087a = new Object();

    public static final boolean a(h0 h0Var, int i11, s3.b bVar) {
        boolean z11;
        synchronized (f47087a) {
            int i12 = h0Var.f47012d;
            if (i12 == i11) {
                h0Var.f47011c = bVar;
                z11 = true;
                h0Var.f47012d = i12 + 1;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    public static final h0 b(y yVar) {
        h0 h0Var = yVar.f47086a;
        h0Var.getClass();
        return (h0) l.t(h0Var, yVar);
    }
}
