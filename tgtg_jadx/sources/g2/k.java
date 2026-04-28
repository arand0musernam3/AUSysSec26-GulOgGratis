package g2;

import h2.k0;
import kotlin.jvm.internal.Intrinsics;
import m3.w1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f18174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f18175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3.j f18176c;

    public k(b0 b0Var, i iVar, a3.j jVar) {
        this.f18174a = b0Var;
        this.f18175b = iVar;
        this.f18176c = jVar;
    }

    @Override // h2.k0
    public final int a() {
        return this.f18175b.k().f398b;
    }

    @Override // h2.k0
    public final Object b(int i11) {
        Object objL = this.f18176c.l(i11);
        return objL == null ? this.f18175b.l(i11) : objL;
    }

    @Override // h2.k0
    public final Object c(int i11) {
        return this.f18175b.j(i11);
    }

    @Override // h2.k0
    public final void d(int i11, Object obj, m3.n nVar, int i12) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1493551140);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(obj) ? 32 : 16) | (sVar.f(this) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            h2.q.b(obj, i11, this.f18174a.f18141q, u3.e.e(726189336, sVar, new c60.c(this, i11, 5)), sVar, ((i13 >> 3) & 14) | 3072 | ((i13 << 3) & 112));
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(this, i11, obj, i12, 6);
        }
    }

    @Override // h2.k0
    public final int e(Object obj) {
        return this.f18176c.k(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return Intrinsics.areEqual(this.f18175b, ((k) obj).f18175b);
    }

    public final int hashCode() {
        return this.f18175b.hashCode();
    }
}
