package x2;

import kotlin.jvm.functions.Function1;
import m2.g0;
import m5.k0;
import m5.q0;
import m5.t0;
import w2.m0;
import w2.s1;
import w2.t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f43716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f43717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f43718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f43719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d2.e f43720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v2.b f43721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0 f43722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f43723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t1 f43724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f43725j;

    public c(s1 s1Var, q0 q0Var, boolean z11, float f11, d2.e eVar) {
        this.f43716a = s1Var;
        this.f43717b = q0Var;
        this.f43718c = z11;
        this.f43719d = f11;
        this.f43720e = eVar;
        z3.g gVarC = z3.v.c();
        Function1 function1E = gVarC != null ? gVarC.e() : null;
        z3.g gVarD = z3.v.d(gVarC);
        try {
            v2.b bVarD = s1Var.d();
            this.f43721f = bVarD;
            this.f43722g = (m0) s1Var.f43046d.getValue();
            z3.v.f(gVarC, gVarD, function1E);
            this.f43723h = bVarD.f41929d;
            this.f43725j = bVarD.f41928c.toString();
        } catch (Throwable th2) {
            z3.v.f(gVarC, gVarD, function1E);
            throw th2;
        }
    }

    public final void a() {
        if (this.f43725j.length() > 0) {
            v2.b bVar = this.f43721f;
            boolean zD = t0.d(bVar.f41929d);
            s1 s1Var = this.f43716a;
            if (zD) {
                s1.i(s1Var, "", k0.b((int) (bVar.f41929d >> 32), (int) (this.f43723h & 4294967295L)), !this.f43718c, 4);
            } else {
                s1Var.c();
            }
            this.f43723h = this.f43716a.d().f41929d;
            this.f43724i = t1.Start;
        }
    }

    public final boolean b() {
        q0 q0Var = this.f43717b;
        if (q0Var == null) {
            return true;
        }
        long j9 = this.f43723h;
        int i11 = t0.f29649c;
        x5.j jVarJ = q0Var.j((int) (j9 & 4294967295L));
        return jVarJ == null || jVarJ == x5.j.Ltr;
    }

    public final int c(q0 q0Var, int i11) {
        long j9 = this.f43723h;
        int i12 = t0.f29649c;
        int i13 = (int) (j9 & 4294967295L);
        d2.e eVar = this.f43720e;
        if (Float.isNaN(eVar.f13775b)) {
            eVar.f13775b = q0Var.c(i13).f21380a;
        }
        m5.r rVar = q0Var.f29618b;
        int iD = rVar.d(i13) + i11;
        if (iD < 0) {
            return Integer.MIN_VALUE;
        }
        if (iD >= rVar.f29628f) {
            return Integer.MAX_VALUE;
        }
        float fB = rVar.b(iD) - 1;
        float f11 = eVar.f13775b;
        if ((b() && f11 >= q0Var.h(iD)) || (!b() && f11 <= q0Var.g(iD))) {
            return rVar.c(iD, true);
        }
        return rVar.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }

    public final int d(int i11) {
        long j9 = this.f43721f.f41929d;
        int i12 = t0.f29649c;
        int i13 = (int) (j9 & 4294967295L);
        q0 q0Var = this.f43717b;
        if (q0Var != null) {
            m5.r rVar = q0Var.f29618b;
            float f11 = this.f43719d;
            if (!Float.isNaN(f11)) {
                h4.c cVarJ = q0Var.c(i13).j(0.0f, f11 * i11);
                float f12 = cVarJ.f21383d;
                float f13 = cVarJ.f21381b;
                float fB = rVar.b(rVar.e(f13));
                if (Math.abs(f13 - fB) > Math.abs(f12 - fB)) {
                    return rVar.g(cVarJ.f());
                }
                return rVar.g((((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(cVarJ.f21380a) << 32));
            }
        }
        return i13;
    }

    public final void e() {
        q0 q0Var = this.f43717b;
        int iC = q0Var != null ? c(q0Var, 1) : Integer.MAX_VALUE;
        if (iC == Integer.MAX_VALUE) {
            this.f43720e.f13775b = Float.NaN;
        }
        String str = this.f43725j;
        if (str.length() > 0) {
            long j9 = this.f43723h;
            int i11 = t0.f29649c;
            int i12 = (int) (j9 & 4294967295L);
            int length = str.length();
            if (iC > length) {
                iC = length;
            }
            long jL = dx.f.l(iC, i12, this.f43716a);
            int i13 = (int) (jL >> 32);
            t1 t1VarX = d40.t1.x(jL);
            if (i13 != i12 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i13, i13);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void f() {
        if (this.f43725j.length() > 0) {
            long j9 = this.f43723h;
            int i11 = t0.f29649c;
            int i12 = (int) (j9 & 4294967295L);
            long jL = dx.f.l(d(1), i12, this.f43716a);
            int i13 = (int) (jL >> 32);
            t1 t1VarX = d40.t1.x(jL);
            if (i13 != i12 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i13, i13);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void g() {
        this.f43720e.f13775b = Float.NaN;
        String str = this.f43725j;
        if (str.length() > 0) {
            long j9 = this.f43723h;
            int i11 = t0.f29649c;
            int i12 = (int) (j9 & 4294967295L);
            long jL = dx.f.l(g0.u(i12, str), i12, this.f43716a);
            int i13 = (int) (jL >> 32);
            t1 t1VarX = d40.t1.x(jL);
            if (i13 != i12 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i13, i13);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void h() {
        this.f43720e.f13775b = Float.NaN;
        String str = this.f43725j;
        if (str.length() > 0) {
            long j9 = this.f43723h;
            int i11 = (int) (4294967295L & j9);
            int iV = g0.v(t0.f(j9), str);
            if (iV == t0.f(this.f43723h) && iV != str.length()) {
                iV = g0.v(iV + 1, str);
            }
            long jL = dx.f.l(iV, i11, this.f43716a);
            int i12 = (int) (jL >> 32);
            t1 t1VarX = d40.t1.x(jL);
            if (i12 != i11 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i12, i12);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void i() {
        int length;
        this.f43720e.f13775b = Float.NaN;
        String str = this.f43725j;
        if (str.length() > 0) {
            long j9 = this.f43723h;
            int i11 = t0.f29649c;
            int i12 = (int) (j9 & 4294967295L);
            q0 q0Var = this.f43717b;
            if (q0Var != null) {
                int i13 = i12;
                while (true) {
                    v2.b bVar = this.f43721f;
                    if (i13 < bVar.f41928c.length()) {
                        int length2 = str.length() - 1;
                        if (i13 <= length2) {
                            length2 = i13;
                        }
                        long jL = q0Var.l(length2);
                        int i14 = t0.f29649c;
                        int i15 = (int) (jL & 4294967295L);
                        if (i15 > i13) {
                            length = i15;
                            break;
                        }
                        i13++;
                    } else {
                        length = bVar.f41928c.length();
                        break;
                    }
                }
            } else {
                length = str.length();
            }
            long jL2 = dx.f.l(length, i12, this.f43716a);
            int i16 = (int) (jL2 >> 32);
            t1 t1VarX = d40.t1.x(jL2);
            if (i16 != i12 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i16, i16);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void j() {
        this.f43720e.f13775b = Float.NaN;
        String str = this.f43725j;
        if (str.length() > 0) {
            long j9 = this.f43723h;
            int i11 = t0.f29649c;
            int i12 = (int) (j9 & 4294967295L);
            long jL = dx.f.l(g0.x(i12, str), i12, this.f43716a);
            int i13 = (int) (jL >> 32);
            t1 t1VarX = d40.t1.x(jL);
            if (i13 != i12 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i13, i13);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void k() {
        this.f43720e.f13775b = Float.NaN;
        String str = this.f43725j;
        if (str.length() > 0) {
            long j9 = this.f43723h;
            int i11 = (int) (4294967295L & j9);
            int iW = g0.w(t0.g(j9), str);
            if (iW == t0.g(this.f43723h) && iW != 0) {
                iW = g0.w(iW - 1, str);
            }
            long jL = dx.f.l(iW, i11, this.f43716a);
            int i12 = (int) (jL >> 32);
            t1 t1VarX = d40.t1.x(jL);
            if (i12 != i11 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i12, i12);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void l() {
        this.f43720e.f13775b = Float.NaN;
        String str = this.f43725j;
        if (str.length() > 0) {
            long j9 = this.f43723h;
            int i11 = t0.f29649c;
            int i12 = (int) (j9 & 4294967295L);
            int i13 = 0;
            q0 q0Var = this.f43717b;
            if (q0Var != null) {
                int i14 = i12;
                while (true) {
                    if (i14 <= 0) {
                        break;
                    }
                    int length = str.length() - 1;
                    if (i14 <= length) {
                        length = i14;
                    }
                    long jL = q0Var.l(length);
                    int i15 = t0.f29649c;
                    int i16 = (int) (jL >> 32);
                    if (i16 < i14) {
                        i13 = i16;
                        break;
                    }
                    i14--;
                }
            }
            long jL2 = dx.f.l(i13, i12, this.f43716a);
            int i17 = (int) (jL2 >> 32);
            t1 t1VarX = d40.t1.x(jL2);
            if (i17 != i12 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i17, i17);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void m() {
        this.f43720e.f13775b = Float.NaN;
        String str = this.f43725j;
        if (str.length() > 0) {
            long j9 = this.f43723h;
            int i11 = t0.f29649c;
            int i12 = (int) (j9 & 4294967295L);
            long jL = dx.f.l(str.length(), i12, this.f43716a);
            int i13 = (int) (jL >> 32);
            t1 t1VarX = d40.t1.x(jL);
            if (i13 != i12 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i13, i13);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void n() {
        this.f43720e.f13775b = Float.NaN;
        if (this.f43725j.length() > 0) {
            long j9 = this.f43723h;
            int i11 = t0.f29649c;
            int i12 = (int) (j9 & 4294967295L);
            long jL = dx.f.l(0, i12, this.f43716a);
            int i13 = (int) (jL >> 32);
            t1 t1VarX = d40.t1.x(jL);
            if (i13 != i12 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i13, i13);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void o() {
        int length;
        this.f43720e.f13775b = Float.NaN;
        String str = this.f43725j;
        if (str.length() > 0) {
            long j9 = this.f43723h;
            int i11 = t0.f29649c;
            int i12 = (int) (4294967295L & j9);
            q0 q0Var = this.f43717b;
            if (q0Var != null) {
                m5.r rVar = q0Var.f29618b;
                length = rVar.c(rVar.d(t0.f(j9)), true);
            } else {
                length = str.length();
            }
            long jL = dx.f.l(length, i12, this.f43716a);
            int i13 = (int) (jL >> 32);
            t1 t1VarX = d40.t1.x(jL);
            if (i13 != i12 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i13, i13);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void p() {
        int i11;
        this.f43720e.f13775b = Float.NaN;
        if (this.f43725j.length() > 0) {
            long j9 = this.f43723h;
            int i12 = t0.f29649c;
            int i13 = (int) (4294967295L & j9);
            q0 q0Var = this.f43717b;
            if (q0Var != null) {
                i11 = q0Var.i(q0Var.f29618b.d(t0.g(j9)));
            } else {
                i11 = 0;
            }
            long jL = dx.f.l(i11, i13, this.f43716a);
            int i14 = (int) (jL >> 32);
            t1 t1VarX = d40.t1.x(jL);
            if (i14 != i13 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i14, i14);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void q() {
        q0 q0Var = this.f43717b;
        int iC = q0Var != null ? c(q0Var, -1) : Integer.MIN_VALUE;
        if (iC == Integer.MIN_VALUE) {
            this.f43720e.f13775b = Float.NaN;
        }
        if (this.f43725j.length() > 0) {
            long j9 = this.f43723h;
            int i11 = t0.f29649c;
            int i12 = (int) (j9 & 4294967295L);
            if (iC < 0) {
                iC = 0;
            }
            long jL = dx.f.l(iC, i12, this.f43716a);
            int i13 = (int) (jL >> 32);
            t1 t1VarX = d40.t1.x(jL);
            if (i13 != i12 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i13, i13);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void r() {
        if (this.f43725j.length() > 0) {
            long j9 = this.f43723h;
            int i11 = t0.f29649c;
            int i12 = (int) (j9 & 4294967295L);
            long jL = dx.f.l(d(-1), i12, this.f43716a);
            int i13 = (int) (jL >> 32);
            t1 t1VarX = d40.t1.x(jL);
            if (i13 != i12 || !t0.d(this.f43723h)) {
                this.f43723h = k0.b(i13, i13);
            }
            if (t1VarX != null) {
                this.f43724i = t1VarX;
            }
        }
    }

    public final void s() {
        if (this.f43725j.length() > 0) {
            long j9 = this.f43721f.f41929d;
            int i11 = t0.f29649c;
            this.f43723h = k0.b((int) (j9 >> 32), (int) (this.f43723h & 4294967295L));
        }
    }
}
