package u3;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f40651a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f40652b = new StackTraceElement[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f40653c = new j(0, new long[0], new Object[0]);

    public static final int a(int i11, int i12) {
        return i11 << (((i12 % 10) * 3) + 1);
    }

    public static final d b(int i11, n nVar, u70.f fVar) {
        d dVar;
        s sVar = (s) nVar;
        sVar.Y(Integer.rotateLeft(i11, 1), f40651a);
        Object objM = sVar.M();
        if (objM == m.f29332a) {
            dVar = new d(fVar, true, i11);
            sVar.k0(dVar);
        } else {
            objM.getClass();
            dVar = (d) objM;
            dVar.g(fVar);
        }
        sVar.q(false);
        return dVar;
    }

    public static final long c() {
        return Thread.currentThread().getId();
    }

    public static final void d(s sVar, Function2 function2) {
        function2.getClass();
        ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(sVar, 1);
    }

    public static final d e(int i11, n nVar, u70.f fVar) {
        s sVar = (s) nVar;
        Object objM = sVar.M();
        if (objM == m.f29332a) {
            objM = new d(fVar, true, i11);
            sVar.k0(objM);
        }
        d dVar = (d) objM;
        dVar.g(fVar);
        return dVar;
    }

    public static final boolean f(w1 w1Var, w1 w1Var2) {
        return w1Var == null || !w1Var.a() || Intrinsics.areEqual(w1Var, w1Var2) || Intrinsics.areEqual(w1Var.f29475c, w1Var2.f29475c);
    }
}
