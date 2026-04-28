package g3;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    static {
        d6.k0 k0Var = d6.k0.Inherit;
        m3.e0 e0Var = d6.r.f14523a;
        d6.k0 k0Var2 = d6.k0.Inherit;
        d6.k0 k0Var3 = d6.k0.Inherit;
    }

    public static final void a(u3.d dVar, Function0 function0, b4.t tVar, boolean z11, v2 v2Var, d2.z1 z1Var, m3.n nVar, int i11) {
        b4.t tVar2;
        boolean z12;
        v2 v2Var2;
        d2.z1 z1Var2;
        v2 v2Var3;
        int i12;
        b4.t tVar3;
        d2.z1 z1Var3;
        v2 v2Var4;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-532959117);
        int i13 = i11 | (sVar.h(function0) ? 32 : 16) | 113995136;
        boolean z13 = true;
        if (sVar.R(i13 & 1, (38347923 & i13) != 38347922)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                float f11 = u2.f19549a;
                p0 p0Var = (p0) sVar.j(r0.f19375a);
                v2 v2Var5 = p0Var.f19265d0;
                if (v2Var5 == null) {
                    v2Var3 = new v2(r0.d(p0Var, l3.b0.f26920g), r0.d(p0Var, l3.b0.f26921h), r0.d(p0Var, l3.b0.f26922i), i4.v.b(l3.b0.f26915b, r0.d(p0Var, l3.b0.f26914a)), i4.v.b(l3.b0.f26917d, r0.d(p0Var, l3.b0.f26916c)), i4.v.b(l3.b0.f26919f, r0.d(p0Var, l3.b0.f26918e)));
                    p0Var.f19265d0 = v2Var3;
                } else {
                    v2Var3 = v2Var5;
                }
                i12 = i13 & (-3670017);
                d2.b2 b2Var = u2.f19551c;
                tVar3 = b4.q.f5711a;
                z1Var3 = b2Var;
                v2Var4 = v2Var3;
            } else {
                sVar.U();
                i12 = i13 & (-3670017);
                tVar3 = tVar;
                z13 = z11;
                v2Var4 = v2Var;
                z1Var3 = z1Var;
            }
            sVar.r();
            y2.b(dVar, function0, tVar3, z13, v2Var4, z1Var3, sVar, i12 & 268435454);
            tVar2 = tVar3;
            z12 = z13;
            v2Var2 = v2Var4;
            z1Var2 = z1Var3;
        } else {
            sVar.U();
            tVar2 = tVar;
            z12 = z11;
            v2Var2 = v2Var;
            z1Var2 = z1Var;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.w(i11, 1, dVar, tVar2, v2Var2, z1Var2, function0, z12);
        }
    }
}
