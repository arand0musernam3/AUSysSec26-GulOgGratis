package b5;

import androidx.compose.ui.node.Owner;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends s1 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final i0.w f6014h0;
    public final n2 Y;
    public w Z;

    static {
        i0.w wVarG = i4.g0.g();
        int i11 = i4.v.f23316i;
        wVarG.H(i4.v.f23311d);
        wVarG.Q(1.0f);
        wVarG.R(1);
        f6014h0 = wVarG;
    }

    public x(m0 m0Var) {
        super(m0Var);
        n2 n2Var = new n2();
        n2Var.setAggregateChildKindSet$ui(0);
        this.Y = n2Var;
        n2Var.updateCoordinator$ui(this);
        this.Z = m0Var.f5873i != null ? new w(this) : null;
    }

    @Override // z4.t0
    public final z4.m1 D(long j9) {
        p0(j9);
        m0 m0Var = this.f5966p;
        o3.e eVarA = m0Var.A();
        Object[] objArr = eVarA.f31830a;
        int i11 = eVarA.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            ((m0) objArr[i12]).H.f5942p.l = j0.NotUsed;
        }
        w1(m0Var.f5887x.c(this, m0Var.m(), j9));
        n1();
        return this;
    }

    @Override // z4.t
    public final int V(int i11) {
        w2.z zVarV = this.f5966p.v();
        z4.u0 u0VarR = zVarV.r();
        m0 m0Var = (m0) zVarV.f43083b;
        return u0VarR.e(m0Var.G.f5858d, m0Var.m(), i11);
    }

    @Override // b5.s1
    public final void Y0() {
        if (this.Z == null) {
            this.Z = new w(this);
        }
    }

    @Override // z4.t
    public final int b(int i11) {
        w2.z zVarV = this.f5966p.v();
        z4.u0 u0VarR = zVarV.r();
        m0 m0Var = (m0) zVarV.f43083b;
        return u0VarR.d(m0Var.G.f5858d, m0Var.m(), i11);
    }

    @Override // b5.s1
    public final v0 b1() {
        return this.Z;
    }

    @Override // b5.s1
    public final b4.s d1() {
        return this.Y;
    }

    @Override // z4.m1
    public final void h0(long j9, float f11, Function1 function1) {
        t1(j9, f11, function1, null);
        if (this.f5996j) {
            return;
        }
        this.f5966p.H.f5942p.F0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // b5.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j1(b5.m1 r19, long r20, b5.v r22, int r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.x.j1(b5.m1, long, b5.v, int, boolean):void");
    }

    @Override // b5.s1, z4.m1
    public final void l0(long j9, float f11, l4.b bVar) {
        t1(j9, f11, null, bVar);
        if (this.f5996j) {
            return;
        }
        this.f5966p.H.f5942p.F0();
    }

    @Override // b5.s1
    public final void s1(i4.t tVar, l4.b bVar) {
        m0 m0Var = this.f5966p;
        Owner ownerA = p0.a(m0Var);
        o3.e eVarZ = m0Var.z();
        Object[] objArr = eVarZ.f31830a;
        int i11 = eVarZ.f31832c;
        for (int i12 = 0; i12 < i11; i12++) {
            m0 m0Var2 = (m0) objArr[i12];
            if (m0Var2.J()) {
                m0Var2.i(tVar, bVar);
            }
        }
        if (((c5.y) ownerA).getShowLayoutBounds()) {
            long j9 = this.f47185c;
            tVar.r(0.5f, 0.5f, ((int) (j9 >> 32)) - 0.5f, ((int) (j9 & 4294967295L)) - 0.5f, f6014h0);
        }
    }

    @Override // b5.u0
    public final int v0(z4.a aVar) {
        w wVar = this.Z;
        if (wVar != null) {
            return wVar.v0(aVar);
        }
        f1 f1Var = this.f5966p.H.f5942p;
        n0 n0Var = f1Var.f5817y;
        if (!f1Var.f5805m) {
            if (f1Var.f5799f.f5931d == h0.Measuring) {
                n0Var.f5898f = true;
                if (n0Var.f5894b) {
                    f1Var.f5815w = true;
                    f1Var.f5816x = true;
                }
            } else {
                n0Var.f5899g = true;
            }
        }
        x xVarJ = f1Var.j();
        boolean z11 = xVarJ.f5997k;
        xVarJ.f5997k = true;
        f1Var.N();
        xVarJ.f5997k = z11;
        Integer num = (Integer) n0Var.f5901i.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // z4.t
    public final int w(int i11) {
        w2.z zVarV = this.f5966p.v();
        z4.u0 u0VarR = zVarV.r();
        m0 m0Var = (m0) zVarV.f43083b;
        return u0VarR.b(m0Var.G.f5858d, m0Var.m(), i11);
    }

    @Override // z4.t
    public final int y(int i11) {
        w2.z zVarV = this.f5966p.v();
        z4.u0 u0VarR = zVarV.r();
        m0 m0Var = (m0) zVarV.f43083b;
        return u0VarR.a(m0Var.G.f5858d, m0Var.m(), i11);
    }
}
