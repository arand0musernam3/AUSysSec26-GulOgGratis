package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static a0 a(long j9, Object obj) {
        a0 a0Var = (a0) n1.f3018c.h(j9, obj);
        if (((y0) a0Var).f3063a) {
            return a0Var;
        }
        y0 y0Var = (y0) a0Var;
        int i11 = y0Var.f3065c;
        y0 y0VarD = y0Var.d(i11 == 0 ? 10 : i11 * 2);
        n1.o(j9, obj, y0VarD);
        return y0VarD;
    }
}
