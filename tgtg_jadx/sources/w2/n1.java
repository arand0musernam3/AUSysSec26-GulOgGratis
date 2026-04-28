package w2;

import c5.x1;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends b5.n implements b5.c0, b5.s, b5.k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o1 f42994q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f42995r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j2.e f42996s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map f42997t;

    public n1(o1 o1Var, s1 s1Var, m5.u0 u0Var, boolean z11, m2.d1 d1Var) {
        this.f42994q = o1Var;
        this.f42995r = z11;
        j2.e eVar = new j2.e(o1Var.f43013g);
        L0(eVar);
        this.f42996s = eVar;
        o1 o1Var2 = this.f42994q;
        o1Var2.getClass();
        boolean z12 = this.f42995r;
        boolean z13 = !z12;
        k1 k1Var = o1Var2.f43007a;
        k1Var.getClass();
        k1Var.f42957a.setValue(new j1(s1Var, u0Var, z12, z13, d1Var.f28807c == 4));
    }

    @Override // b5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final z4.v0 mo58measure3p2s80s(z4.w0 w0Var, z4.t0 t0Var, long j9) {
        o1 o1Var = this.f42994q;
        z5.m layoutDirection = w0Var.getLayoutDirection();
        q5.h hVar = (q5.h) b5.o.e(this, x1.f7419k);
        k1 k1Var = o1Var.f43007a;
        k1Var.getClass();
        i1 i1Var = new i1(w0Var, layoutDirection, hVar, j9);
        k1Var.f42958b.setValue(i1Var);
        j1 j1Var = (j1) k1Var.f42957a.getValue();
        if (j1Var == null) {
            c2.a.d("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
            qc.y.m();
            return null;
        }
        m5.q0 q0VarF = k1Var.f(j1Var, i1Var);
        long j11 = q0VarF.f29619c;
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        z4.m1 m1VarD = t0Var.D(y9.w.r(i11, i11, i12, i12));
        this.f42994q.f43012f.setValue(new z5.f(this.f42995r ? w0Var.O(m2.g0.r(q0VarF.f29618b.b(0))) : 0));
        Map linkedHashMap = this.f42997t;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap(2);
        }
        linkedHashMap.put(z4.d.f47100a, Integer.valueOf(Math.round(q0VarF.f29620d)));
        linkedHashMap.put(z4.d.f47101b, Integer.valueOf(Math.round(q0VarF.f29621e)));
        this.f42997t = linkedHashMap;
        return w0Var.r(i11, i12, linkedHashMap, new d2.k(m1VarD, 13));
    }

    @Override // b5.s
    public final void v(z4.z zVar) {
        this.f42994q.f43009c.setValue(zVar);
    }
}
