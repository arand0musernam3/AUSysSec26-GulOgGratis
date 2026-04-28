package z3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f47063a = new Object();

    public static final int a(long[] jArr, long j9) {
        int length = jArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            long j11 = jArr[i12];
            if (j9 > j11) {
                i11 = i12 + 1;
            } else {
                if (j9 >= j11) {
                    return i12;
                }
                length = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static g c() {
        return (g) l.f47037b.j();
    }

    public static g d(g gVar) {
        if (gVar instanceof k0) {
            k0 k0Var = (k0) gVar;
            if (k0Var.f47035t == u3.e.c()) {
                k0Var.f47033r = null;
                return gVar;
            }
        }
        if (gVar instanceof l0) {
            l0 l0Var = (l0) gVar;
            if (l0Var.f47051i == u3.e.c()) {
                l0Var.f47050h = null;
                return gVar;
            }
        }
        g gVarG = l.g(gVar, null, false);
        gVarG.j();
        return gVarG;
    }

    public static Object e(cn.j jVar, Function0 function0) {
        g k0Var;
        g gVar = (g) l.f47037b.j();
        if (gVar instanceof k0) {
            k0 k0Var2 = (k0) gVar;
            if (k0Var2.f47035t == u3.e.c()) {
                Function1 function1 = k0Var2.f47033r;
                Function1 function12 = k0Var2.f47034s;
                try {
                    ((k0) gVar).f47033r = l.k(jVar, function1, true);
                    ((k0) gVar).f47034s = function12;
                    return function0.invoke();
                } finally {
                    k0Var2.f47033r = function1;
                    k0Var2.f47034s = function12;
                }
            }
        }
        if (gVar == null || (gVar instanceof c)) {
            k0Var = new k0(gVar instanceof c ? (c) gVar : null, jVar, null, true, false);
        } else {
            k0Var = gVar.u(jVar);
        }
        try {
            g gVarJ = k0Var.j();
            try {
                Object objInvoke = function0.invoke();
                g.q(gVarJ);
                k0Var.c();
                return objInvoke;
            } catch (Throwable th2) {
                g.q(gVarJ);
                throw th2;
            }
        } catch (Throwable th3) {
            k0Var.c();
            throw th3;
        }
    }

    public static void f(g gVar, g gVar2, Function1 function1) {
        if (gVar != gVar2) {
            gVar2.getClass();
            g.q(gVar);
            gVar2.c();
        } else if (gVar instanceof k0) {
            ((k0) gVar).f47033r = function1;
        } else if (gVar instanceof l0) {
            ((l0) gVar).f47050h = function1;
        } else {
            org.bouncycastle.jce.provider.a.p(gVar, "Non-transparent snapshot was reused: ");
        }
    }

    public static final void g() {
        throw new UnsupportedOperationException();
    }

    public abstract void b();
}
