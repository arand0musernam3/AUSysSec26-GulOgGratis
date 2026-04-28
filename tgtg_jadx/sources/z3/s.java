package z3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f47056a = new Object();

    public static final void a(int i11, int i12) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException("index (" + i11 + ") is out of bound of [0, " + i12 + ')');
        }
    }

    public static final boolean b(a0 a0Var, int i11, q3.c cVar, boolean z11) {
        boolean z12;
        synchronized (f47056a) {
            try {
                int i12 = a0Var.f46972d;
                if (i12 == i11) {
                    a0Var.f46971c = cVar;
                    z12 = true;
                    if (z11) {
                        a0Var.f46973e++;
                    }
                    a0Var.f46972d = i12 + 1;
                } else {
                    z12 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z12;
    }

    public static final a0 c(r rVar) {
        a0 a0Var = rVar.f47055a;
        a0Var.getClass();
        return (a0) l.t(a0Var, rVar);
    }

    public static final int d(r rVar) {
        a0 a0Var = rVar.f47055a;
        a0Var.getClass();
        return ((a0) l.h(a0Var)).f46973e;
    }

    public static final boolean e(r rVar, Function1 function1) {
        int i11;
        q3.c cVar;
        Object objInvoke;
        g gVarJ;
        boolean zB;
        do {
            synchronized (f47056a) {
                a0 a0Var = rVar.f47055a;
                a0Var.getClass();
                a0 a0Var2 = (a0) l.h(a0Var);
                i11 = a0Var2.f46972d;
                cVar = a0Var2.f46971c;
            }
            cVar.getClass();
            q3.f fVarH = cVar.h();
            objInvoke = function1.invoke(fVarH);
            q3.c cVarE = fVarH.e();
            if (Intrinsics.areEqual(cVarE, cVar)) {
                break;
            }
            a0 a0Var3 = rVar.f47055a;
            a0Var3.getClass();
            synchronized (l.f47038c) {
                gVarJ = l.j();
                zB = b((a0) l.w(a0Var3, rVar, gVarJ), i11, cVarE, true);
            }
            l.n(gVarJ, rVar);
        } while (!zB);
        return ((Boolean) objInvoke).booleanValue();
    }
}
