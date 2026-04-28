package k2;

import b2.l;
import b4.q;
import b4.t;
import c5.m2;
import g3.t5;
import j5.j;
import j5.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import v1.b1;
import v1.e1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final t a(t tVar, boolean z11, l lVar, e1 e1Var, boolean z12, j jVar, Function0 function0) {
        t tVarA;
        if (e1Var != null) {
            tVarA = new a(z11, lVar, e1Var, z12, jVar, function0);
        } else if (e1Var == null) {
            tVarA = new a(z11, lVar, null, z12, jVar, function0);
        } else {
            q qVar = q.f5711a;
            if (lVar != null) {
                tVarA = b1.a(qVar, lVar, e1Var).then(new a(z11, lVar, null, z12, jVar, function0));
            } else {
                tVarA = b4.a.a(qVar, m2.f7291a, new b(e1Var, z11, z12, jVar, function0));
            }
        }
        return tVar.then(tVarA);
    }

    public static final t b(t tVar) {
        return r.c(tVar, false, new im.a(25));
    }

    public static final t c(t tVar, boolean z11, l lVar, boolean z12, j jVar, Function1 function1) {
        return tVar.then(new e(z11, lVar, false, z12, jVar, function1));
    }

    public static t d(t tVar, boolean z11, j jVar, Function1 function1) {
        return tVar.then(new e(z11, null, true, true, jVar, function1));
    }

    public static final t e(t tVar, l5.a aVar, l lVar, t5 t5Var, boolean z11, j jVar, Function0 function0) {
        t tVarA;
        if (t5Var != null) {
            tVarA = new h(aVar, lVar, t5Var, z11, jVar, function0);
        } else if (t5Var == null) {
            tVarA = new h(aVar, lVar, null, z11, jVar, function0);
        } else {
            q qVar = q.f5711a;
            if (lVar != null) {
                tVarA = b1.a(qVar, lVar, t5Var).then(new h(aVar, lVar, null, z11, jVar, function0));
            } else {
                tVarA = b4.a.a(qVar, m2.f7291a, new f(t5Var, aVar, z11, jVar, function0));
            }
        }
        return tVar.then(tVarA);
    }
}
