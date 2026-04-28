package a3;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5.h f278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m5.q0 f280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r5.s f281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s3 f282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m5.h f284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r5.y f285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m2.a2 f286i;

    public b3(r5.y yVar, r5.s sVar, m2.a2 a2Var, s3 s3Var) {
        m5.h hVar = yVar.f37714a;
        long j9 = yVar.f37715b;
        m5.q0 q0Var = a2Var != null ? a2Var.f28762a : null;
        this.f278a = hVar;
        this.f279b = j9;
        this.f280c = q0Var;
        this.f281d = sVar;
        this.f282e = s3Var;
        this.f283f = j9;
        this.f284g = hVar;
        this.f285h = yVar;
        this.f286i = a2Var;
    }

    public final List a(Function1 function1) {
        if (!m5.t0.d(this.f283f)) {
            return kotlin.collections.d0.h(new r5.a("", 0), new r5.x(m5.t0.g(this.f283f), m5.t0.g(this.f283f)));
        }
        r5.g gVar = (r5.g) function1.invoke(this);
        if (gVar != null) {
            return kotlin.collections.c0.c(gVar);
        }
        return null;
    }

    public final Integer b() {
        m5.q0 q0Var = this.f280c;
        if (q0Var == null) {
            return null;
        }
        m5.r rVar = q0Var.f29618b;
        int iF = m5.t0.f(this.f283f);
        r5.s sVar = this.f281d;
        return Integer.valueOf(sVar.i(rVar.c(rVar.d(sVar.r(iF)), true)));
    }

    public final Integer c() {
        m5.q0 q0Var = this.f280c;
        if (q0Var == null) {
            return null;
        }
        int iG = m5.t0.g(this.f283f);
        r5.s sVar = this.f281d;
        return Integer.valueOf(sVar.i(q0Var.i(q0Var.f29618b.d(sVar.r(iG)))));
    }

    public final Integer d() {
        int length;
        m5.q0 q0Var = this.f280c;
        if (q0Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            m5.h hVar = this.f278a;
            if (iR < hVar.f29538b.length()) {
                int length2 = this.f284g.f29538b.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long jL = q0Var.l(length2);
                int i11 = m5.t0.f29649c;
                int i12 = (int) (jL & 4294967295L);
                if (i12 > iR) {
                    length = this.f281d.i(i12);
                    break;
                }
                iR++;
            } else {
                length = hVar.f29538b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i11;
        m5.q0 q0Var = this.f280c;
        if (q0Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            if (iR <= 0) {
                i11 = 0;
                break;
            }
            int length = this.f284g.f29538b.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long jL = q0Var.l(length);
            int i12 = m5.t0.f29649c;
            int i13 = (int) (jL >> 32);
            if (i13 < iR) {
                i11 = this.f281d.i(i13);
                break;
            }
            iR--;
        }
        return Integer.valueOf(i11);
    }

    public final boolean f() {
        m5.q0 q0Var = this.f280c;
        return (q0Var != null ? q0Var.j(r()) : null) != x5.j.Rtl;
    }

    public final int g(m5.q0 q0Var, int i11) {
        int iR = r();
        s3 s3Var = this.f282e;
        if (s3Var.f568a == null) {
            s3Var.f568a = Float.valueOf(q0Var.c(iR).f21380a);
        }
        m5.r rVar = q0Var.f29618b;
        int iD = rVar.d(iR) + i11;
        if (iD < 0) {
            return 0;
        }
        if (iD >= rVar.f29628f) {
            return this.f284g.f29538b.length();
        }
        float fB = rVar.b(iD) - 1;
        Float f11 = s3Var.f568a;
        f11.getClass();
        float fFloatValue = f11.floatValue();
        if ((f() && fFloatValue >= q0Var.h(iD)) || (!f() && fFloatValue <= q0Var.g(iD))) {
            return rVar.c(iD, true);
        }
        return this.f281d.i(rVar.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f11.floatValue()) << 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(m2.a2 r9, int r10) {
        /*
            r8 = this;
            z4.z r0 = r9.f28763b
            m5.q0 r1 = r9.f28762a
            if (r0 == 0) goto L13
            z4.z r9 = r9.f28764c
            if (r9 == 0) goto L10
            r2 = 1
            h4.c r9 = r9.v(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            h4.c r9 = h4.c.f21379e
        L15:
            r5.y r0 = r8.f285h
            long r2 = r0.f37715b
            int r0 = m5.t0.f29649c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            r5.s r2 = r8.f281d
            int r0 = r2.r(r0)
            h4.c r0 = r1.c(r0)
            float r3 = r0.f21380a
            float r0 = r0.f21381b
            long r6 = r9.e()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r6 = r6 << r0
            long r9 = r9 & r4
            long r9 = r9 | r6
            m5.r r0 = r1.f29618b
            int r9 = r0.g(r9)
            int r9 = r2.i(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.b3.h(m2.a2, int):int");
    }

    public final void i() {
        s3 s3Var = this.f282e;
        s3Var.f568a = null;
        m5.h hVar = this.f284g;
        if (hVar.f29538b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            s3Var.f568a = null;
            if (hVar.f29538b.length() > 0) {
                String str = hVar.f29538b;
                long j9 = this.f283f;
                int i11 = m5.t0.f29649c;
                int iU = m2.g0.u((int) (j9 & 4294967295L), str);
                if (iU != -1) {
                    q(iU, iU);
                }
            }
        }
    }

    public final void j() {
        this.f282e.f568a = null;
        m5.h hVar = this.f284g;
        String str = hVar.f29538b;
        String str2 = hVar.f29538b;
        if (str.length() > 0) {
            int iV = m2.g0.v(m5.t0.f(this.f283f), str2);
            if (iV == m5.t0.f(this.f283f) && iV != str2.length()) {
                iV = m2.g0.v(iV + 1, str2);
            }
            q(iV, iV);
        }
    }

    public final void k() {
        this.f282e.f568a = null;
        m5.h hVar = this.f284g;
        if (hVar.f29538b.length() > 0) {
            String str = hVar.f29538b;
            long j9 = this.f283f;
            int i11 = m5.t0.f29649c;
            int iX = m2.g0.x((int) (j9 & 4294967295L), str);
            if (iX != -1) {
                q(iX, iX);
            }
        }
    }

    public final void l() {
        this.f282e.f568a = null;
        m5.h hVar = this.f284g;
        String str = hVar.f29538b;
        String str2 = hVar.f29538b;
        if (str.length() > 0) {
            int iW = m2.g0.w(m5.t0.g(this.f283f), str2);
            if (iW == m5.t0.g(this.f283f) && iW != 0) {
                iW = m2.g0.w(iW - 1, str2);
            }
            q(iW, iW);
        }
    }

    public final void m() {
        s3 s3Var = this.f282e;
        s3Var.f568a = null;
        m5.h hVar = this.f284g;
        if (hVar.f29538b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            s3Var.f568a = null;
            if (hVar.f29538b.length() > 0) {
                String str = hVar.f29538b;
                long j9 = this.f283f;
                int i11 = m5.t0.f29649c;
                int iU = m2.g0.u((int) (j9 & 4294967295L), str);
                if (iU != -1) {
                    q(iU, iU);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.f282e.f568a = null;
        if (this.f284g.f29538b.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.f282e.f568a = null;
        if (this.f284g.f29538b.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.f284g.f29538b.length() > 0) {
            int i11 = m5.t0.f29649c;
            this.f283f = m5.k0.b((int) (this.f279b >> 32), (int) (this.f283f & 4294967295L));
        }
    }

    public final void q(int i11, int i12) {
        this.f283f = m5.k0.b(i11, i12);
    }

    public final int r() {
        long j9 = this.f283f;
        int i11 = m5.t0.f29649c;
        return this.f281d.r((int) (j9 & 4294967295L));
    }
}
