package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f19814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f19815c = 12;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f19816d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f19817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f19818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f19819g;

    static {
        float f11 = 48;
        f19813a = f11;
        f19814b = f11;
        d2.c.c(4, 0.0f, 2);
        f19817e = 8;
        f19818f = 112;
        f19819g = 280;
    }

    public static final void a(final b4.t tVar, final t1.k0 k0Var, final m3.b1 b1Var, final v1.y1 y1Var, final i4.v0 v0Var, final long j9, final float f11, final float f12, final u3.d dVar, m3.n nVar, final int i11) {
        m3.s sVar;
        v1.a0 a0Var;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(848986741);
        int i12 = i11 | (sVar2.f(tVar) ? 4 : 2) | (sVar2.f(k0Var) ? 32 : 16) | (sVar2.f(y1Var) ? NewHope.SENDB_BYTES : 1024) | (sVar2.f(v0Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.e(j9) ? 131072 : 65536) | (sVar2.c(f11) ? 1048576 : 524288) | (sVar2.c(f12) ? 8388608 : 4194304) | (sVar2.f(null) ? 67108864 : 33554432) | (sVar2.h(dVar) ? 536870912 : 268435456);
        if (sVar2.R(i12 & 1, (i12 & 306783379) != 306783378)) {
            t1.q1 q1VarD = t1.t1.d(k0Var, "DropDownMenu", sVar2, (((i12 >> 3) & 14) | 48) & 126);
            t1.b1 b1VarD = s0.D(l3.f0.FastSpatial, sVar2);
            t1.b1 b1VarD2 = s0.D(l3.f0.FastEffects, sVar2);
            FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
            t1.v1 v1Var = t1.c.f39389j;
            h2.s0 s0Var = q1VarD.f39537a;
            m3.k1 k1Var = q1VarD.f39540d;
            boolean zBooleanValue = ((Boolean) s0Var.j()).booleanValue();
            sVar2.a0(143964305);
            float f13 = zBooleanValue ? 1.0f : 0.8f;
            sVar2.q(false);
            Float fValueOf = Float.valueOf(f13);
            boolean zBooleanValue2 = ((Boolean) k1Var.getValue()).booleanValue();
            sVar2.a0(143964305);
            float f14 = zBooleanValue2 ? 1.0f : 0.8f;
            sVar2.q(false);
            Float fValueOf2 = Float.valueOf(f14);
            q1VarD.f();
            sVar2.a0(-745957716);
            sVar2.q(false);
            t1.p1 p1VarC = t1.t1.c(q1VarD, fValueOf, fValueOf2, b1VarD, v1Var, sVar2, 0);
            boolean zBooleanValue3 = ((Boolean) q1VarD.f39537a.j()).booleanValue();
            sVar2.a0(892761509);
            float f15 = zBooleanValue3 ? 1.0f : 0.0f;
            sVar2.q(false);
            Float fValueOf3 = Float.valueOf(f15);
            boolean zBooleanValue4 = ((Boolean) k1Var.getValue()).booleanValue();
            sVar2.a0(892761509);
            float f16 = zBooleanValue4 ? 1.0f : 0.0f;
            sVar2.q(false);
            Float fValueOf4 = Float.valueOf(f16);
            q1VarD.f();
            sVar2.a0(2839488);
            sVar2.q(false);
            t1.p1 p1VarC2 = t1.t1.c(q1VarD, fValueOf3, fValueOf4, b1VarD2, v1Var, sVar2, 0);
            boolean zBooleanValue5 = ((Boolean) sVar2.j(c5.n2.f7299a)).booleanValue();
            boolean zG = sVar2.g(zBooleanValue5) | sVar2.f(p1VarC) | ((i12 & 112) == 32) | sVar2.f(p1VarC2);
            Object objM = sVar2.M();
            if (zG || objM == m3.m.f29332a) {
                a0Var = null;
                w2 w2Var = new w2(zBooleanValue5, k0Var, b1Var, p1VarC, p1VarC2);
                sVar2.k0(w2Var);
                objM = w2Var;
            } else {
                a0Var = null;
            }
            int i13 = i12 >> 9;
            int i14 = i12 >> 6;
            q7.a(i4.g0.p(b4.q.f5711a, (Function1) objM), v0Var, j9, 0L, f11, f12, a0Var, u3.e.e(-1463404422, sVar2, new an.d(tVar, y1Var, dVar, 13)), sVar2, (i13 & 896) | (i13 & 112) | 12582912 | (57344 & i14) | (458752 & i14) | (i14 & 3670016), 8);
            sVar = sVar2;
        } else {
            sVar = sVar2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(k0Var, b1Var, y1Var, v0Var, j9, f11, f12, dVar, i11) { // from class: g3.x2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t1.k0 f19750b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ m3.b1 f19751c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ v1.y1 f19752d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ i4.v0 f19753e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f19754f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ float f19755g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ float f19756h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ u3.d f19757i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(385);
                    y2.a(this.f19749a, this.f19750b, this.f19751c, this.f19752d, this.f19753e, this.f19754f, this.f19755g, this.f19756h, this.f19757i, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void b(u3.d dVar, Function0 function0, b4.t tVar, boolean z11, v2 v2Var, d2.z1 z1Var, m3.n nVar, int i11) {
        int i12;
        boolean z12 = z11;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1325192924);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(tVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(null) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(null) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.g(z12) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.f(v2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.f(z1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar.f(null) ? 67108864 : 33554432;
        }
        if (sVar.R(i12 & 1, (38347923 & i12) != 38347922)) {
            b4.t tVarB = androidx.compose.foundation.b.b(tVar, null, s5.a(0.0f, 6, 0L, true), z12, null, null, function0, 24);
            z12 = z12;
            b4.t tVarY = d2.c.y(d2.m2.p(d2.m2.d(tVarB, 1.0f), f19818f, f19814b, f19819g, 0.0f, 8), z1Var);
            d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarY, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            b5.g gVar = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar);
            }
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            r9.a(((la) sVar.j(na.f19192a)).f19054m, u3.e.e(865999929, sVar, new bn.d(v2Var, z12, dVar, 5)), sVar, 48);
            sVar.q(true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e0(dVar, function0, tVar, z12, v2Var, z1Var, i11);
        }
    }
}
