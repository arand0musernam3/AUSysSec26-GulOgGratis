package w2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2.h f43043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f43044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.i0 f43045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m3.k1 f43046d;

    public s1(v2.h hVar, n0 n0Var) {
        this.f43043a = hVar;
        this.f43044b = n0Var;
        this.f43045c = n0Var != null ? m3.i.q(new us.j(13, this, n0Var)) : null;
        t1 t1Var = t1.Start;
        this.f43046d = m3.i.w(new m0(t1Var, t1Var));
    }

    public static void h(s1 s1Var, CharSequence charSequence, y2.c cVar, boolean z11, int i11) {
        boolean z12 = (i11 & 2) == 0;
        if ((i11 & 4) != 0) {
            cVar = y2.c.MergeIfPossible;
        }
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        v2.h hVar = s1Var.f43043a;
        hVar.f41936b.a().m();
        v2.a aVar = hVar.f41936b;
        if (z12) {
            aVar.e(null);
        }
        long j9 = aVar.f41922d;
        aVar.c(m5.t0.g(j9), m5.t0.f(j9), charSequence);
        int length = charSequence.length() + m5.t0.g(j9);
        v2.k.g(aVar, length, length);
        s1Var.l(aVar);
        v2.h.a(hVar, z11, cVar);
    }

    public static void i(s1 s1Var, String str, long j9, boolean z11, int i11) {
        y2.c cVar = y2.c.MergeIfPossible;
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        v2.h hVar = s1Var.f43043a;
        hVar.f41936b.a().m();
        v2.a aVar = hVar.f41936b;
        long jE = s1Var.e(j9);
        aVar.c(m5.t0.g(jE), m5.t0.f(jE), str);
        int length = str.length() + m5.t0.g(jE);
        v2.k.g(aVar, length, length);
        s1Var.l(aVar);
        v2.h.a(hVar, z11, cVar);
    }

    public final void a() {
        y2.c cVar = y2.c.MergeIfPossible;
        v2.h hVar = this.f43043a;
        hVar.f41936b.a().m();
        v2.a aVar = hVar.f41936b;
        int iF = m5.t0.f(aVar.f41922d);
        v2.k.g(aVar, iF, iF);
        v2.h.a(hVar, true, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y70.a b(w2.f r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof w2.r1
            if (r0 == 0) goto L13
            r0 = r6
            w2.r1 r0 = (w2.r1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            w2.r1 r0 = new w2.r1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f43033j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
        L28:
            r5 = 0
            return r5
        L2a:
            ba0.g.M(r6)
            goto L57
        L2e:
            ba0.g.M(r6)
            r0.l = r3
            v80.l r6 = new v80.l
            x70.c r0 = y70.f.b(r0)
            r6.<init>(r3, r0)
            r6.t()
            v2.h r0 = r4.f43043a
            o3.e r0 = r0.f41940f
            r0.b(r5)
            ao.p2 r0 = new ao.p2
            r2 = 26
            r0.<init>(r2, r4, r5)
            r6.v(r0)
            java.lang.Object r5 = r6.s()
            if (r5 != r1) goto L57
            return r1
        L57:
            qc.y.m()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.s1.b(w2.f, z70.c):y70.a");
    }

    public final void c() {
        y2.c cVar = y2.c.NeverMerge;
        v2.h hVar = this.f43043a;
        hVar.f41936b.a().m();
        v2.a aVar = hVar.f41936b;
        aVar.c(m5.t0.g(aVar.f41922d), m5.t0.f(aVar.f41922d), "");
        int iG = m5.t0.g(aVar.f41922d);
        v2.k.g(aVar, iG, iG);
        l(aVar);
        v2.h.a(hVar, true, cVar);
    }

    public final v2.b d() {
        q1 q1Var;
        m3.i0 i0Var = this.f43045c;
        return (i0Var == null || (q1Var = (q1) i0Var.getValue()) == null) ? this.f43043a.b() : q1Var.f43030a;
    }

    public final long e(long j9) {
        q1 q1Var;
        m3.i0 i0Var = this.f43045c;
        j0 j0Var = (i0Var == null || (q1Var = (q1) i0Var.getValue()) == null) ? null : q1Var.f43031b;
        if (j0Var == null) {
            return j9;
        }
        int i11 = m5.t0.f29649c;
        long jA = j0Var.a((int) (j9 >> 32), false);
        long jA2 = m5.t0.d(j9) ? jA : j0Var.a((int) (4294967295L & j9), false);
        int iMin = Math.min(m5.t0.g(jA), m5.t0.g(jA2));
        int iMax = Math.max(m5.t0.f(jA), m5.t0.f(jA2));
        return m5.t0.h(j9) ? m5.k0.b(iMax, iMin) : m5.k0.b(iMin, iMax);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (Intrinsics.areEqual(this.f43043a, s1Var.f43043a) && Intrinsics.areEqual(this.f43044b, s1Var.f43044b)) {
            return Intrinsics.areEqual((Object) null, (Object) null);
        }
        return false;
    }

    public final long f(long j9) {
        q1 q1Var;
        m3.i0 i0Var = this.f43045c;
        j0 j0Var = (i0Var == null || (q1Var = (q1) i0Var.getValue()) == null) ? null : q1Var.f43031b;
        return j0Var != null ? n0.c(j9, j0Var, (m0) this.f43046d.getValue()) : j9;
    }

    public final void g(CharSequence charSequence) {
        y2.c cVar = y2.c.MergeIfPossible;
        v2.h hVar = this.f43043a;
        hVar.f41936b.a().m();
        v2.a aVar = hVar.f41936b;
        aVar.c(0, aVar.f41920b.length(), "");
        aVar.append(charSequence.toString());
        l(aVar);
        v2.h.a(hVar, true, cVar);
    }

    public final int hashCode() {
        int iHashCode = this.f43043a.hashCode() * 31;
        n0 n0Var = this.f43044b;
        return (iHashCode + (n0Var != null ? n0Var.hashCode() : 0)) * 31;
    }

    public final void j(long j9) {
        k(e(j9));
    }

    public final void k(long j9) {
        y2.c cVar = y2.c.MergeIfPossible;
        v2.h hVar = this.f43043a;
        hVar.f41936b.a().m();
        v2.a aVar = hVar.f41936b;
        int i11 = m5.t0.f29649c;
        v2.k.g(aVar, (int) (j9 >> 32), (int) (j9 & 4294967295L));
        v2.h.a(hVar, true, cVar);
    }

    public final void l(v2.a aVar) {
        if (((o3.e) aVar.a().f40981b).f31832c <= 0 || !m5.t0.d(aVar.f41922d)) {
            return;
        }
        t1 t1Var = t1.Start;
        this.f43046d.setValue(new m0(t1Var, t1Var));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformedTextFieldState(textFieldState=");
        v2.h hVar = this.f43043a;
        sb2.append(hVar);
        sb2.append(", outputTransformation=null, outputTransformedText=null, codepointTransformation=");
        sb2.append(this.f43044b);
        sb2.append(", codepointTransformedText=");
        sb2.append(this.f43045c);
        sb2.append(", outputText=\"");
        sb2.append((Object) hVar.b());
        sb2.append("\", visualText=\"");
        sb2.append((Object) d());
        sb2.append("\")");
        return sb2.toString();
    }
}
