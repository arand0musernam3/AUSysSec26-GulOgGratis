package b5;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends s1 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final i0.w f5794h0;
    public c0 Y;
    public d0 Z;

    static {
        i0.w wVarG = i4.g0.g();
        int i11 = i4.v.f23316i;
        wVarG.H(i4.v.f23313f);
        wVarG.Q(1.0f);
        wVarG.R(1);
        f5794h0 = wVarG;
    }

    public e0(m0 m0Var, c0 c0Var) {
        super(m0Var);
        this.Y = c0Var;
        this.Z = m0Var.f5873i != null ? new d0(this) : null;
        if ((c0Var.getNode().getKindSet$ui() & 512) == 0) {
            return;
        }
        org.bouncycastle.jce.provider.a.c();
        throw null;
    }

    @Override // z4.t0
    public final z4.m1 D(long j9) {
        p0(j9);
        c0 c0Var = this.Y;
        s1 s1Var = this.f5967q;
        s1Var.getClass();
        w1(c0Var.mo58measure3p2s80s(this, s1Var, j9));
        n1();
        return this;
    }

    public final void E1() {
        if (this.f5996j) {
            return;
        }
        o1();
        s1 s1Var = this.f5967q;
        s1Var.getClass();
        s1Var.f5997k = this.f5997k;
        L0().a();
        s1Var.f5997k = false;
    }

    public final void F1(c0 c0Var) {
        if (Intrinsics.areEqual(c0Var, this.Y) || (c0Var.getNode().getKindSet$ui() & 512) == 0) {
            this.Y = c0Var;
        } else {
            org.bouncycastle.jce.provider.a.c();
        }
    }

    @Override // z4.t
    public final int V(int i11) {
        c0 c0Var = this.Y;
        s1 s1Var = this.f5967q;
        s1Var.getClass();
        return c0Var.minIntrinsicHeight(this, s1Var, i11);
    }

    @Override // b5.s1
    public final void Y0() {
        if (this.Z == null) {
            this.Z = new d0(this);
        }
    }

    @Override // z4.t
    public final int b(int i11) {
        c0 c0Var = this.Y;
        s1 s1Var = this.f5967q;
        s1Var.getClass();
        return c0Var.maxIntrinsicHeight(this, s1Var, i11);
    }

    @Override // b5.s1
    public final v0 b1() {
        return this.Z;
    }

    @Override // b5.s1
    public final b4.s d1() {
        return this.Y.getNode();
    }

    @Override // z4.m1
    public final void h0(long j9, float f11, Function1 function1) {
        t1(j9, f11, function1, null);
        E1();
    }

    @Override // b5.s1, z4.m1
    public final void l0(long j9, float f11, l4.b bVar) {
        t1(j9, f11, null, bVar);
        E1();
    }

    @Override // b5.s1
    public final void s1(i4.t tVar, l4.b bVar) {
        s1 s1Var;
        s1 s1Var2 = this.f5967q;
        s1Var2.getClass();
        s1Var2.W0(tVar, bVar);
        if (!((c5.y) p0.a(this.f5966p)).getShowLayoutBounds() || (s1Var = this.f5967q) == null) {
            return;
        }
        if (z5.l.a(this.f47185c, s1Var.f47185c) && z5.j.b(s1Var.A, 0L)) {
            return;
        }
        long j9 = this.f47185c;
        tVar.r(0.5f, 0.5f, ((int) (j9 >> 32)) - 0.5f, ((int) (j9 & 4294967295L)) - 0.5f, f5794h0);
    }

    @Override // b5.u0
    public final int v0(z4.a aVar) {
        d0 d0Var = this.Z;
        if (d0Var == null) {
            return o.b(this, aVar);
        }
        q1.n0 n0Var = d0Var.f6012u;
        int iA = n0Var.a(aVar);
        if (iA >= 0) {
            return n0Var.f35870c[iA];
        }
        return Integer.MIN_VALUE;
    }

    @Override // z4.t
    public final int w(int i11) {
        c0 c0Var = this.Y;
        s1 s1Var = this.f5967q;
        s1Var.getClass();
        return c0Var.minIntrinsicWidth(this, s1Var, i11);
    }

    @Override // z4.t
    public final int y(int i11) {
        c0 c0Var = this.Y;
        s1 s1Var = this.f5967q;
        s1Var.getClass();
        return c0Var.maxIntrinsicWidth(this, s1Var, i11);
    }
}
