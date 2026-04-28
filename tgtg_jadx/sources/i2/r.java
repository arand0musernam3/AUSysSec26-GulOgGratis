package i2;

import h2.k0;
import kotlin.jvm.internal.Intrinsics;
import m3.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f22890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2.q f22891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3.j f22892c;

    public r(e0 e0Var, q qVar, a3.j jVar) {
        this.f22890a = e0Var;
        this.f22891b = qVar;
        this.f22892c = jVar;
    }

    @Override // h2.k0
    public final int a() {
        return this.f22891b.k().f398b;
    }

    @Override // h2.k0
    public final Object b(int i11) {
        Object objL = this.f22892c.l(i11);
        return objL == null ? this.f22891b.l(i11) : objL;
    }

    @Override // h2.k0
    public final void d(int i11, Object obj, m3.n nVar, int i12) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1201380429);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(obj) ? 32 : 16) | (sVar.f(this) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            h2.q.b(obj, i11, this.f22890a.B, u3.e.e(1142237095, sVar, new c60.c(this, i11, 9)), sVar, ((i13 >> 3) & 14) | 3072 | ((i13 << 3) & 112));
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(this, i11, obj, i12, 12);
        }
    }

    @Override // h2.k0
    public final int e(Object obj) {
        return this.f22892c.k(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return Intrinsics.areEqual(this.f22891b, ((r) obj).f22891b);
    }

    public final int hashCode() {
        return this.f22891b.hashCode();
    }
}
