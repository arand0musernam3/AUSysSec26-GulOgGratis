package f4;

import b4.s;
import b5.c0;
import b5.o0;
import b5.r;
import i4.w;
import z4.m1;
import z4.t;
import z4.t0;
import z4.u;
import z4.v0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends s implements c0, r {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n4.b f17307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f17308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b4.f f17309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z4.m f17310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f17311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w f17312t;

    public static boolean M0(long j9) {
        return !h4.e.a(j9, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean N0(long j9) {
        return !h4.e.a(j9, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j9 >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    public final boolean L0() {
        return this.f17308p && this.f17307o.h() != 9205357640488583168L;
    }

    public final long O0(long j9) {
        boolean z11 = false;
        boolean z12 = z5.a.e(j9) && z5.a.d(j9);
        if (z5.a.g(j9) && z5.a.f(j9)) {
            z11 = true;
        }
        if ((!L0() && z12) || z11) {
            return z5.a.b(j9, z5.a.i(j9), 0, z5.a.h(j9), 0, 10);
        }
        long jH = this.f17307o.h();
        int iRound = N0(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : z5.a.k(j9);
        int iRound2 = M0(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : z5.a.j(j9);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(z5.b.f(iRound2, j9))) & 4294967295L) | (((long) Float.floatToRawIntBits(z5.b.g(iRound, j9))) << 32);
        if (L0()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!N0(this.f17307o.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f17307o.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!M0(this.f17307o.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f17307o.h() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : z4.c0.r(jFloatToRawIntBits2, this.f17310r.a(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return z5.a.b(j9, z5.b.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j9), 0, z5.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j9), 0, 10);
    }

    @Override // b4.s
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // b5.c0
    public final int maxIntrinsicHeight(u uVar, t tVar, int i11) {
        if (!L0()) {
            return tVar.b(i11);
        }
        long jO0 = O0(z5.b.b(i11, 0, 13));
        return Math.max(z5.a.j(jO0), tVar.b(i11));
    }

    @Override // b5.c0
    public final int maxIntrinsicWidth(u uVar, t tVar, int i11) {
        if (!L0()) {
            return tVar.y(i11);
        }
        long jO0 = O0(z5.b.b(0, i11, 7));
        return Math.max(z5.a.k(jO0), tVar.y(i11));
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final v0 mo58measure3p2s80s(w0 w0Var, t0 t0Var, long j9) {
        m1 m1VarD = t0Var.D(O0(j9));
        return w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new c5.l(m1VarD, 2));
    }

    @Override // b5.c0
    public final int minIntrinsicHeight(u uVar, t tVar, int i11) {
        if (!L0()) {
            return tVar.V(i11);
        }
        long jO0 = O0(z5.b.b(i11, 0, 13));
        return Math.max(z5.a.j(jO0), tVar.V(i11));
    }

    @Override // b5.c0
    public final int minIntrinsicWidth(u uVar, t tVar, int i11) {
        if (!L0()) {
            return tVar.w(i11);
        }
        long jO0 = O0(z5.b.b(0, i11, 7));
        return Math.max(z5.a.k(jO0), tVar.w(i11));
    }

    @Override // b5.r
    public final void n(o0 o0Var) {
        k4.b bVar = o0Var.f5908a;
        long jH = this.f17307o.h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(N0(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (bVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(M0(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) & 4294967295L);
        long jR = (Float.intBitsToFloat((int) (bVar.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) == 0.0f) ? 0L : z4.c0.r(jFloatToRawIntBits, this.f17310r.a(jFloatToRawIntBits, bVar.d()));
        long jA = this.f17309q.a((((long) Math.round(Float.intBitsToFloat((int) (jR >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jR & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (bVar.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (bVar.d() & 4294967295L)))) & 4294967295L), o0Var.getLayoutDirection());
        float f11 = (int) (jA >> 32);
        float f12 = (int) (jA & 4294967295L);
        ((jd.f) bVar.f25938b.f24502b).r(f11, f12);
        try {
            this.f17307o.g(o0Var, jR, this.f17311s, this.f17312t);
            ((jd.f) bVar.f25938b.f24502b).r(-f11, -f12);
            o0Var.b();
        } catch (Throwable th2) {
            ((jd.f) bVar.f25938b.f24502b).r(-f11, -f12);
            throw th2;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f17307o + ", sizeToIntrinsics=" + this.f17308p + ", alignment=" + this.f17309q + ", alpha=" + this.f17311s + ", colorFilter=" + this.f17312t + ')';
    }
}
