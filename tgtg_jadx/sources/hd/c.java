package hd;

import b4.s;
import b5.c0;
import b5.l2;
import b5.o0;
import b5.r;
import d2.k;
import gd.i;
import i4.w;
import j5.b0;
import j5.z;
import n80.p;
import z4.m;
import z4.m1;
import z4.t;
import z4.t0;
import z4.u;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends s implements r, c0, l2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b4.f f21851o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m f21852p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f21853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w f21854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f21856t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public gd.m f21857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i f21858v;

    public c(i iVar, b4.f fVar, m mVar, float f11, w wVar, boolean z11, String str, gd.m mVar2) {
        this.f21851o = fVar;
        this.f21852p = mVar;
        this.f21853q = f11;
        this.f21854r = wVar;
        this.f21855s = z11;
        this.f21856t = str;
        this.f21857u = mVar2;
        this.f21858v = iVar;
    }

    public final long L0(long j9) {
        if (h4.e.e(j9)) {
            return 0L;
        }
        long jH = this.f21858v.h();
        if (jH == 9205357640488583168L) {
            return j9;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        long jA = this.f21852p.a(jFloatToRawIntBits, j9);
        return (Math.abs(Float.intBitsToFloat((int) (jA >> 32))) > Float.MAX_VALUE || Math.abs(Float.intBitsToFloat((int) (4294967295L & jA))) > Float.MAX_VALUE) ? j9 : z4.c0.r(jFloatToRawIntBits, jA);
    }

    public final long M0(long j9) {
        float fK;
        int iJ;
        float fB;
        boolean zG = z5.a.g(j9);
        boolean zF = z5.a.f(j9);
        if (zG && zF) {
            return j9;
        }
        boolean z11 = z5.a.e(j9) && z5.a.d(j9);
        i iVar = this.f21858v;
        long jH = iVar.h();
        if (jH == 9205357640488583168L) {
            return (!z11 || ((gd.h) iVar.f20387u.f45488a.getValue()).a() == null) ? j9 : z5.a.b(j9, z5.a.i(j9), 0, z5.a.h(j9), 0, 10);
        }
        if (z11 && (zG || zF)) {
            fK = z5.a.i(j9);
            iJ = z5.a.h(j9);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
            if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                int i11 = h.f21865b;
                fK = p.b(fIntBitsToFloat, z5.a.k(j9), z5.a.i(j9));
            } else {
                fK = z5.a.k(j9);
            }
            if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                int i12 = h.f21865b;
                fB = p.b(fIntBitsToFloat2, z5.a.j(j9), z5.a.h(j9));
                long jL0 = L0((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (((long) Float.floatToRawIntBits(fK)) << 32));
                return z5.a.b(j9, z5.b.g(j80.c.b(Float.intBitsToFloat((int) (jL0 >> 32))), j9), 0, z5.b.f(j80.c.b(Float.intBitsToFloat((int) (jL0 & 4294967295L))), j9), 0, 10);
            }
            iJ = z5.a.j(j9);
        }
        fB = iJ;
        long jL02 = L0((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (((long) Float.floatToRawIntBits(fK)) << 32));
        return z5.a.b(j9, z5.b.g(j80.c.b(Float.intBitsToFloat((int) (jL02 >> 32))), j9), 0, z5.b.f(j80.c.b(Float.intBitsToFloat((int) (jL02 & 4294967295L))), j9), 0, 10);
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.l2
    public final void h0(b0 b0Var) {
        String str = this.f21856t;
        if (str != null) {
            z.h(str, b0Var);
            z.m(b0Var, 5);
        }
    }

    @Override // b5.c0
    public final int maxIntrinsicHeight(u uVar, t tVar, int i11) {
        long jB = z5.b.b(i11, 0, 13);
        gd.m mVar = this.f21857u;
        if (mVar != null) {
            mVar.c(jB);
        }
        if (this.f21858v.h() == 9205357640488583168L) {
            return tVar.b(i11);
        }
        long jM0 = M0(jB);
        return Math.max(z5.a.j(jM0), tVar.b(i11));
    }

    @Override // b5.c0
    public final int maxIntrinsicWidth(u uVar, t tVar, int i11) {
        long jB = z5.b.b(0, i11, 7);
        gd.m mVar = this.f21857u;
        if (mVar != null) {
            mVar.c(jB);
        }
        if (this.f21858v.h() == 9205357640488583168L) {
            return tVar.y(i11);
        }
        long jM0 = M0(jB);
        return Math.max(z5.a.k(jM0), tVar.y(i11));
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final v0 mo58measure3p2s80s(w0 w0Var, t0 t0Var, long j9) {
        gd.m mVar = this.f21857u;
        if (mVar != null) {
            mVar.c(j9);
        }
        m1 m1VarD = t0Var.D(M0(j9));
        return w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new k(m1VarD, 10));
    }

    @Override // b5.c0
    public final int minIntrinsicHeight(u uVar, t tVar, int i11) {
        long jB = z5.b.b(i11, 0, 13);
        gd.m mVar = this.f21857u;
        if (mVar != null) {
            mVar.c(jB);
        }
        if (this.f21858v.h() == 9205357640488583168L) {
            return tVar.V(i11);
        }
        long jM0 = M0(jB);
        return Math.max(z5.a.j(jM0), tVar.V(i11));
    }

    @Override // b5.c0
    public final int minIntrinsicWidth(u uVar, t tVar, int i11) {
        long jB = z5.b.b(0, i11, 7);
        gd.m mVar = this.f21857u;
        if (mVar != null) {
            mVar.c(jB);
        }
        if (this.f21858v.h() == 9205357640488583168L) {
            return tVar.w(i11);
        }
        long jM0 = M0(jB);
        return Math.max(z5.a.k(jM0), tVar.w(i11));
    }

    @Override // b5.r
    public final void n(o0 o0Var) {
        k4.b bVar = o0Var.f5908a;
        long jL0 = L0(bVar.d());
        long jA = this.f21851o.a(h.d(jL0), h.d(bVar.d()), o0Var.getLayoutDirection());
        int i11 = (int) (jA >> 32);
        int i12 = (int) (jA & 4294967295L);
        j30.g gVar = bVar.f25938b;
        long jO = gVar.o();
        gVar.i().e();
        try {
            jd.f fVar = (jd.f) gVar.f24502b;
            j30.g gVar2 = (j30.g) fVar.f24983b;
            if (this.f21855s) {
                fVar.d(0.0f, 0.0f, Float.intBitsToFloat((int) (gVar2.o() >> 32)), Float.intBitsToFloat((int) (gVar2.o() & 4294967295L)), 1);
            }
            fVar.r(i11, i12);
            this.f21858v.g(o0Var, jL0, this.f21853q, this.f21854r);
            gVar.i().o();
            gVar.B(jO);
            o0Var.b();
        } catch (Throwable th2) {
            r8.k.y(gVar, jO);
            throw th2;
        }
    }

    @Override // b4.s
    public final void onAttach() {
        v80.b0 coroutineScope = getCoroutineScope();
        i iVar = this.f21858v;
        iVar.l = coroutineScope;
        iVar.d();
    }

    @Override // b4.s
    public final void onDetach() {
        this.f21858v.c();
    }

    @Override // b4.s
    public final void onReset() {
        this.f21858v.n(null);
    }
}
