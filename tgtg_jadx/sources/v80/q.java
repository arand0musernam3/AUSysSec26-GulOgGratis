package v80;

import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends s1 implements i0 {
    public q() {
        super(true);
        N(null);
    }

    @Override // v80.i0
    public final Object H(x70.c cVar) {
        Object objM = m(cVar);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objM;
    }

    public final boolean h0(Throwable th2) {
        return R(new t(th2, false));
    }

    @Override // v80.i0
    public final com.google.firebase.messaging.a0 u() {
        p1 p1Var = p1.f42146a;
        p1Var.getClass();
        i80.n nVar = (i80.n) TypeIntrinsics.beforeCheckcastToFunctionOfArity(p1Var, 3);
        q1 q1Var = q1.f42148a;
        q1Var.getClass();
        return new com.google.firebase.messaging.a0(6, this, nVar, (i80.n) TypeIntrinsics.beforeCheckcastToFunctionOfArity(q1Var, 3), null);
    }
}
