package h2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y3.b f21142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f21143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1.t0 f21144c;

    public j0(y3.b bVar, n0 n0Var) {
        this.f21142a = bVar;
        this.f21143b = n0Var;
        long[] jArr = q1.g1.f35760a;
        this.f21144c = new q1.t0();
    }

    public final Function2 a(int i11, Object obj, Object obj2) {
        q1.t0 t0Var = this.f21144c;
        i0 i0Var = (i0) t0Var.d(obj);
        if (i0Var != null && i0Var.f21134c == i11 && Intrinsics.areEqual(i0Var.f21133b, obj2)) {
            u3.d dVar = i0Var.f21135d;
            if (dVar != null) {
                return dVar;
            }
            u3.d dVar2 = new u3.d(new gn.i(4, i0Var.f21136e, i0Var), true, 818252804);
            i0Var.f21135d = dVar2;
            return dVar2;
        }
        i0 i0Var2 = new i0(this, i11, obj, obj2);
        t0Var.m(obj, i0Var2);
        u3.d dVar3 = i0Var2.f21135d;
        if (dVar3 != null) {
            return dVar3;
        }
        u3.d dVar4 = new u3.d(new gn.i(4, this, i0Var2), true, 818252804);
        i0Var2.f21135d = dVar4;
        return dVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        i0 i0Var = (i0) this.f21144c.d(obj);
        if (i0Var != null) {
            return i0Var.f21133b;
        }
        k0 k0Var = (k0) this.f21143b.invoke();
        int iE = k0Var.e(obj);
        if (iE != -1) {
            return k0Var.c(iE);
        }
        return null;
    }
}
