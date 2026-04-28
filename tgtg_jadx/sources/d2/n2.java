package d2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends b4.s implements b5.c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f13861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f13862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f13863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f13864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13865s;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L0(z4.w0 r7) {
        /*
            r6 = this;
            float r0 = r6.f13863q
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f13863q
            int r0 = r7.q0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f13864r
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f13864r
            int r3 = r7.q0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f13861o
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f13861o
            int r4 = r7.q0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.f13862p
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.f13862p
            int r7 = r7.q0(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = z5.b.a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.n2.L0(z4.w0):long");
    }

    @Override // b5.c0
    public final int maxIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        long jL0 = L0((z4.w0) uVar);
        if (z5.a.f(jL0)) {
            return z5.a.h(jL0);
        }
        if (!this.f13865s) {
            i11 = z5.b.g(i11, jL0);
        }
        return z5.b.f(tVar.b(i11), jL0);
    }

    @Override // b5.c0
    public final int maxIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        long jL0 = L0((z4.w0) uVar);
        if (z5.a.g(jL0)) {
            return z5.a.i(jL0);
        }
        if (!this.f13865s) {
            i11 = z5.b.f(i11, jL0);
        }
        return z5.b.g(tVar.y(i11), jL0);
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        int iK;
        int i11;
        int iJ;
        int iH;
        long jA;
        long jL0 = L0(w0Var);
        if (this.f13865s) {
            jA = z5.b.e(j9, jL0);
        } else {
            if (Float.isNaN(this.f13861o)) {
                iK = z5.a.k(j9);
                int i12 = z5.a.i(jL0);
                if (iK > i12) {
                    iK = i12;
                }
            } else {
                iK = z5.a.k(jL0);
            }
            if (Float.isNaN(this.f13863q)) {
                i11 = z5.a.i(j9);
                int iK2 = z5.a.k(jL0);
                if (i11 < iK2) {
                    i11 = iK2;
                }
            } else {
                i11 = z5.a.i(jL0);
            }
            if (Float.isNaN(this.f13862p)) {
                iJ = z5.a.j(j9);
                int iH2 = z5.a.h(jL0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = z5.a.j(jL0);
            }
            if (Float.isNaN(this.f13864r)) {
                iH = z5.a.h(j9);
                int iJ2 = z5.a.j(jL0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = z5.a.h(jL0);
            }
            jA = z5.b.a(iK, i11, iJ, iH);
        }
        z4.m1 m1VarD = t0Var.D(jA);
        return z4.w0.f(w0Var, m1VarD.f47183a, m1VarD.f47184b, new k(m1VarD, 3));
    }

    @Override // b5.c0
    public final int minIntrinsicHeight(z4.u uVar, z4.t tVar, int i11) {
        long jL0 = L0((z4.w0) uVar);
        if (z5.a.f(jL0)) {
            return z5.a.h(jL0);
        }
        if (!this.f13865s) {
            i11 = z5.b.g(i11, jL0);
        }
        return z5.b.f(tVar.V(i11), jL0);
    }

    @Override // b5.c0
    public final int minIntrinsicWidth(z4.u uVar, z4.t tVar, int i11) {
        long jL0 = L0((z4.w0) uVar);
        if (z5.a.g(jL0)) {
            return z5.a.i(jL0);
        }
        if (!this.f13865s) {
            i11 = z5.b.f(i11, jL0);
        }
        return z5.b.g(tVar.w(i11), jL0);
    }
}
