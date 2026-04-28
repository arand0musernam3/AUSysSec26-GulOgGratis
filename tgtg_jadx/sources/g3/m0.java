package g3;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d2.b2 f19073b;

    static {
        float f11 = 8;
        f19072a = f11;
        d2.c.c(f11, 0.0f, 2);
        f19073b = d2.c.c(f11, 0.0f, 2);
        d2.c.c(f11, 0.0f, 2);
    }

    public static final void a(final u3.d dVar, final m5.u0 u0Var, final long j9, final long j11, final long j12, final float f11, final d2.z1 z1Var, m3.n nVar, final int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2070754602);
        int i12 = i11 | (sVar.h(dVar) ? 4 : 2) | (sVar.f(u0Var) ? 32 : 16) | (sVar.e(j9) ? 256 : 128) | (sVar.h(null) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(null) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(null) ? 131072 : 65536) | (sVar.e(j11) ? 1048576 : 524288) | (sVar.e(j12) ? 8388608 : 4194304) | (sVar.c(f11) ? 67108864 : 33554432) | (sVar.f(z1Var) ? 536870912 : 268435456);
        if (sVar.R(i12 & 1, (306783379 & i12) != 306783378)) {
            m3.i.b(new m3.v1[]{b3.i.u(j9, v0.f19606a), r9.f19436a.a(u0Var)}, u3.e.e(-668234218, sVar, new Function2() { // from class: g3.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    m3.n nVar2 = (m3.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    m3.s sVar2 = (m3.s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        t1.b1 b1VarD = s0.D(l3.f0.SlowEffects, sVar2);
                        t1.b1 b1VarD2 = s0.D(l3.f0.FastEffects, sVar2);
                        t1.b1 b1VarD3 = s0.D(l3.f0.FastSpatial, sVar2);
                        t1.b1 b1VarD4 = s0.D(l3.f0.DefaultEffects, sVar2);
                        b4.q qVar = b4.q.f5711a;
                        b4.t tVarY = d2.c.y(d2.m2.b(qVar, 0.0f, f11, 1), z1Var);
                        Object objM = sVar2.M();
                        if (objM == m3.m.f29332a) {
                            objM = new o0();
                            sVar2.k0(objM);
                        }
                        o0 o0Var = (o0) objM;
                        int iHashCode = Long.hashCode(sVar2.T);
                        u3.i iVarL = sVar2.l();
                        b4.t tVarC = b4.a.c(tVarY, sVar2);
                        b5.j.R.getClass();
                        b5.h hVar = b5.i.f5839b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar);
                        } else {
                            sVar2.n0();
                        }
                        b5.g gVar = b5.i.f5843f;
                        m3.i.C(o0Var, gVar, sVar2);
                        b5.g gVar2 = b5.i.f5842e;
                        m3.i.C(iVarL, gVar2, sVar2);
                        b5.g gVar3 = b5.i.f5844g;
                        if (sVar2.S || !Intrinsics.areEqual(sVar2.M(), Integer.valueOf(iHashCode))) {
                            e0.f.y(iHashCode, sVar2, iHashCode, gVar3);
                        }
                        b5.g gVar4 = b5.i.f5841d;
                        m3.i.C(tVarC, gVar4, sVar2);
                        b4.t tVarM = z4.c0.m(qVar, "leadingIcon");
                        b4.i iVar = b4.d.f5694m;
                        s1.y.d(false, tVarM, s1.r0.a(b1VarD3, iVar, 12).a(s1.r0.d(b1VarD, 2)), s1.r0.h(b1VarD4, iVar, 12).a(s1.r0.e(b1VarD2, 2)), null, u3.e.e(687705959, sVar2, new c60.a(j11, 19)), sVar2, 196656, 16);
                        b4.t tVarB = d2.c.B(z4.c0.m(qVar, AnnotatedPrivateKey.LABEL), m0.f19072a, 0.0f, 2);
                        d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5693k, sVar2, 54);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        u3.i iVarL2 = sVar2.l();
                        b4.t tVarC2 = b4.a.c(tVarB, sVar2);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar);
                        } else {
                            sVar2.n0();
                        }
                        m3.i.C(i2VarA, gVar, sVar2);
                        m3.i.C(iVarL2, gVar2, sVar2);
                        if (sVar2.S || !Intrinsics.areEqual(sVar2.M(), Integer.valueOf(iHashCode2))) {
                            e0.f.y(iHashCode2, sVar2, iHashCode2, gVar3);
                        }
                        m3.i.C(tVarC2, gVar4, sVar2);
                        r8.k.w(0, dVar, sVar2, true);
                        b4.t tVarM2 = z4.c0.m(qVar, "trailingIcon");
                        b4.i iVar2 = b4.d.f5696o;
                        s1.y.d(false, tVarM2, s1.r0.a(b1VarD3, iVar2, 12).a(s1.r0.d(b1VarD, 2)), s1.r0.h(b1VarD4, iVar2, 12).a(s1.r0.e(b1VarD2, 2)), null, u3.e.e(1905252304, sVar2, new c60.a(j12, 20)), sVar2, 196656, 16);
                        sVar2.q(true);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 56);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(u0Var, j9, j11, j12, f11, z1Var, i11) { // from class: g3.l0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m5.u0 f18989b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f18990c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f18991d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f18992e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f18993f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ d2.z1 f18994g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    m0.a(this.f18988a, this.f18989b, this.f18990c, this.f18991d, this.f18992e, this.f18993f, this.f18994g, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void b(Function0 function0, u3.d dVar, b4.t tVar, boolean z11, i4.v0 v0Var, h6 h6Var, i6 i6Var, v1.a0 a0Var, m3.n nVar, int i11) {
        boolean z12;
        i6 i6Var2;
        int i12;
        boolean z13;
        i6 i6Var3;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1385473344);
        int i13 = i11 | (sVar.h(function0) ? 32 : 16) | 1794048 | (sVar.f(v0Var) ? 8388608 : 4194304) | (sVar.f(h6Var) ? 67108864 : 33554432) | 268435456;
        if (sVar.R(i13 & 1, (306783379 & i13) != 306783378)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                float f11 = e2.f18510a;
                float f12 = l3.y.f27218e;
                i12 = i13 & (-1879048193);
                z13 = true;
                i6Var3 = new i6(f12, l3.y.f27224k, l3.y.f27222i, l3.y.f27223j, l3.y.f27217d, f12);
            } else {
                sVar.U();
                i12 = i13 & (-1879048193);
                z13 = z11;
                i6Var3 = i6Var;
            }
            sVar.r();
            c(tVar, function0, z13, dVar, na.a(l3.y.l, sVar), v0Var, h6Var, i6Var3, a0Var, e2.f18510a, f19073b, sVar, ((i12 << 3) & 896) | 114846774 | ((i12 << 6) & 1879048192), ((i12 >> 24) & 14) | 224640);
            z12 = z13;
            i6Var2 = i6Var3;
        } else {
            sVar.U();
            z12 = z11;
            i6Var2 = i6Var;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h0(function0, dVar, tVar, z12, v0Var, h6Var, i6Var2, a0Var, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final void c(final b4.t tVar, final Function0 function0, final boolean z11, final u3.d dVar, final m5.u0 u0Var, final i4.v0 v0Var, final h6 h6Var, final i6 i6Var, final v1.a0 a0Var, final float f11, final d2.z1 z1Var, m3.n nVar, final int i11, final int i12) {
        int i13;
        int i14;
        float f12;
        m3.b1 b1Var;
        b2.l lVar;
        int i15;
        z5.f fVar;
        int i16;
        boolean z12;
        t1.j jVar;
        ?? r92;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1786844928);
        if ((i11 & 6) == 0) {
            i13 = (sVar.g(false) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar.f(tVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar.h(function0) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar.g(z11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar.h(dVar) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= sVar.f(u0Var) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= sVar.h(null) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= sVar.h(null) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= sVar.h(null) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= sVar.f(v0Var) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (sVar.f(h6Var) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= sVar.f(i6Var) ? 32 : 16;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= sVar.f(a0Var) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            f12 = f11;
            i14 |= sVar.c(f12) ? 2048 : 1024;
        } else {
            f12 = f11;
        }
        if ((i12 & 24576) == 0) {
            i14 |= sVar.f(z1Var) ? 16384 : 8192;
        }
        if ((i12 & 196608) == 0) {
            i14 |= sVar.f(null) ? 131072 : 65536;
        }
        int i17 = i13;
        boolean z13 = true;
        if (sVar.R(i17 & 1, ((i13 & 306783379) == 306783378 && (i14 & 74899) == 74898) ? false : true)) {
            sVar.a0(73195707);
            Object objM = sVar.M();
            m3.f fVar2 = m3.m.f29332a;
            if (objM == fVar2) {
                objM = w.a0.g(sVar);
            }
            b2.l lVar2 = (b2.l) objM;
            sVar.q(false);
            Object objM2 = sVar.M();
            if (objM2 == fVar2) {
                objM2 = new g2.q(6);
                sVar.k0(objM2);
            }
            b4.t tVarC = j5.r.c(tVar, false, (Function1) objM2);
            long j9 = !z11 ? h6Var.f18750e : h6Var.f18746a;
            if (i6Var == null) {
                sVar.a0(73511286);
                sVar.q(false);
                lVar = lVar2;
                r92 = 0;
                i16 = i17;
                jVar = null;
            } else {
                sVar.a0(-828912661);
                int i18 = ((i17 >> 9) & 14) | ((i14 << 3) & 896);
                Object objM3 = sVar.M();
                if (objM3 == fVar2) {
                    objM3 = new z3.r();
                    sVar.k0(objM3);
                }
                z3.r rVar = (z3.r) objM3;
                Object objM4 = sVar.M();
                if (objM4 == fVar2) {
                    objM4 = m3.i.w(null);
                    sVar.k0(objM4);
                }
                m3.b1 b1Var2 = (m3.b1) objM4;
                boolean zF = sVar.f(lVar2);
                Object objM5 = sVar.M();
                if (zF || objM5 == fVar2) {
                    b1Var = b1Var2;
                    objM5 = new r(lVar2, rVar, null, 2);
                    sVar.k0(objM5);
                } else {
                    b1Var = b1Var2;
                }
                m3.i.h(lVar2, (Function2) objM5, sVar);
                b2.j jVar2 = (b2.j) CollectionsKt.X(rVar);
                float f13 = !z11 ? i6Var.f18814f : jVar2 instanceof b2.n ? i6Var.f18810b : jVar2 instanceof b2.h ? i6Var.f18812d : jVar2 instanceof b2.d ? i6Var.f18811c : jVar2 instanceof b2.b ? i6Var.f18813e : i6Var.f18809a;
                Object objM6 = sVar.M();
                if (objM6 == fVar2) {
                    lVar = lVar2;
                    i15 = i18;
                    objM6 = new t1.b(new z5.f(f13), t1.c.l, null, 12);
                    sVar.k0(objM6);
                } else {
                    lVar = lVar2;
                    i15 = i18;
                }
                t1.b bVar = (t1.b) objM6;
                z5.f fVar3 = new z5.f(f13);
                boolean zH = sVar.h(bVar) | sVar.c(f13);
                if ((((i15 & 14) ^ 6) <= 4 || !sVar.g(z11)) && (i15 & 6) != 4) {
                    z13 = false;
                }
                boolean zH2 = zH | z13 | sVar.h(jVar2);
                Object objM7 = sVar.M();
                if (zH2 || objM7 == fVar2) {
                    float f14 = f13;
                    fVar = fVar3;
                    i16 = i17;
                    z12 = false;
                    s sVar2 = new s(bVar, f14, z11, jVar2, b1Var, null);
                    sVar.k0(sVar2);
                    objM7 = sVar2;
                } else {
                    fVar = fVar3;
                    i16 = i17;
                    z12 = false;
                }
                m3.i.h(fVar, (Function2) objM7, sVar);
                jVar = bVar.f39359c;
                sVar.q(z12);
                r92 = z12;
            }
            float f15 = jVar != null ? ((z5.f) jVar.f39464b.getValue()).f47277a : (float) r92;
            final float f16 = f12;
            q7.b(false, function0, tVarC, z11, v0Var, j9, 0L, f15, a0Var, lVar, u3.e.e(-990050154, sVar, new Function2() { // from class: g3.i0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    m3.n nVar2 = (m3.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    m3.s sVar3 = (m3.s) nVar2;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        h6 h6Var2 = h6Var;
                        boolean z14 = z11;
                        m0.a(dVar, u0Var, !z14 ? h6Var2.f18751f : h6Var2.f18747b, !z14 ? h6Var2.f18752g : h6Var2.f18748c, !z14 ? h6Var2.f18753h : h6Var2.f18749d, f16, z1Var, sVar3, 0);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, ((i16 >> 15) & 57344) | (i16 & 14) | ((i16 >> 3) & 112) | (i16 & 7168) | ((i14 << 21) & 1879048192), BERTags.PRIVATE);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g3.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m0.c(tVar, function0, z11, dVar, u0Var, v0Var, h6Var, i6Var, a0Var, f11, z1Var, (m3.n) obj, m3.i.F(i11 | 1), m3.i.F(i12));
                    return Unit.f26487a;
                }
            };
        }
    }
}
