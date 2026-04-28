package b0;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 implements s0.n2 {
    public e1 a(Context context) {
        e1 e1Var;
        context.getClass();
        e1 e1Var2 = e1.f5138k;
        if (e1Var2 != null) {
            return e1Var2;
        }
        synchronized (this) {
            e1Var = e1.f5138k;
            if (e1Var == null) {
                Context contextA = v0.c.a(context);
                contextA.getClass();
                e1Var = new e1(contextA);
                e1.f5138k = e1Var;
            }
        }
        return e1Var;
    }

    @Override // m0.d0
    public s0.i1 d() {
        return s0.i1.h();
    }

    @Override // s0.n2
    public s0.o2 f() {
        return new q1();
    }
}
