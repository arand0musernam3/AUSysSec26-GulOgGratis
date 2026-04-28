package k3;

import d2.m2;
import g3.m5;
import g3.p0;
import g3.r0;
import g3.s0;
import g3.z0;
import i4.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l3.f0;
import l3.u;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s1.y;
import t1.b1;
import z4.c0;
import z4.l1;
import z4.m1;
import z4.t0;
import z4.u0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f25823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f25824d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f25821a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l2.f f25822b = l2.g.f26790a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f25825e = u.f27144c;

    static {
        float f11 = 80;
        f25823c = f11;
        f25824d = f11;
    }

    public final void a(final t tVar, final boolean z11, final b4.t tVar2, long j9, long j11, float f11, m3.n nVar, final int i11, final int i12) {
        final long j12;
        final long j13;
        final float f12;
        int i13;
        float f13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1076870256);
        int i14 = (sVar.f(tVar) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16) | (sVar.f(tVar2) ? 256 : 128);
        if ((i11 & 3072) == 0) {
            j12 = j9;
            i14 |= ((i12 & 8) == 0 && sVar.e(j12)) ? NewHope.SENDB_BYTES : 1024;
        } else {
            j12 = j9;
        }
        if ((i11 & 24576) == 0) {
            j13 = j11;
            i14 |= ((i12 & 16) == 0 && sVar.e(j13)) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        } else {
            j13 = j11;
        }
        int i15 = i14 | 65536;
        if ((1572864 & i11) == 0) {
            i15 |= sVar.f(this) ? 1048576 : 524288;
        }
        if (sVar.R(i15 & 1, (599187 & i15) != 599186)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                if ((i12 & 8) != 0) {
                    j12 = ((p0) sVar.j(r0.f19375a)).G;
                    i15 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    j13 = ((p0) sVar.j(r0.f19375a)).f19284s;
                    i15 &= -57345;
                }
                i13 = i15 & (-458753);
                f13 = f25824d;
            } else {
                sVar.U();
                if ((i12 & 8) != 0) {
                    i15 &= -7169;
                }
                if ((i12 & 16) != 0) {
                    i15 &= -57345;
                }
                i13 = i15 & (-458753);
                f13 = f11;
            }
            final long j14 = j13;
            long j15 = j12;
            sVar.r();
            int i16 = (i13 & 14) | 12582912 | (i13 & 112) | (i13 & 896);
            int i17 = i13 << 6;
            b(tVar, z11, tVar2, f13, null, j15, 0.0f, u3.e.e(298232649, sVar, new i80.n() { // from class: k3.b
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    m3.n nVar2 = (m3.n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    m3.s sVar2 = (m3.s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        Boolean boolValueOf = Boolean.valueOf(z11);
                        b1 b1VarD = s0.D(f0.DefaultEffects, sVar2);
                        final long j16 = j14;
                        final t tVar3 = tVar;
                        y.g(boolValueOf, null, b1VarD, null, u3.e.e(-2064098104, sVar2, new i80.n() { // from class: k3.d
                            @Override // i80.n
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                m3.n nVar3 = (m3.n) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= ((m3.s) nVar3).g(zBooleanValue) ? 4 : 2;
                                }
                                m3.s sVar3 = (m3.s) nVar3;
                                if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    long j17 = j16;
                                    if (zBooleanValue) {
                                        sVar3.a0(-499763759);
                                        m5.a(m2.m(b4.q.f5711a, m.f25845c), j17, m.f25843a, 0L, 0, 0.0f, sVar3, 390, 56);
                                        sVar3.q(false);
                                    } else {
                                        sVar3.a0(-499540745);
                                        t tVar4 = tVar3;
                                        boolean zF = sVar3.f(tVar4);
                                        Object objM = sVar3.M();
                                        if (zF || objM == m3.m.f29332a) {
                                            objM = new z0(tVar4, 1);
                                            sVar3.k0(objM);
                                        }
                                        m.a((i3.u) objM, j17, sVar3, 0);
                                        sVar3.q(false);
                                    }
                                } else {
                                    sVar3.U();
                                }
                                return Unit.f26487a;
                            }
                        }), sVar2, 24576);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, i16 | (458752 & i17) | (i17 & 234881024));
            f12 = f13;
            j12 = j15;
            j13 = j14;
        } else {
            sVar.U();
            f12 = f11;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: k3.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f25784a.a(tVar, z11, tVar2, j12, j13, f12, (m3.n) obj, m3.i.F(i11 | 1), i12);
                    return Unit.f26487a;
                }
            };
        }
    }

    public final void b(final t tVar, final boolean z11, final b4.t tVar2, final float f11, v0 v0Var, final long j9, float f12, final u3.d dVar, m3.n nVar, final int i11) {
        final t tVar3;
        int i12;
        i iVar;
        final v0 v0Var2;
        final float f13;
        int i13;
        v0 v0Var3;
        final v0 v0Var4;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1341144489);
        if ((i11 & 6) == 0) {
            tVar3 = tVar;
            i12 = (sVar.f(tVar3) ? 4 : 2) | i11;
        } else {
            tVar3 = tVar;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(tVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.c(f11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.e(j9) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.h(dVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            iVar = this;
            i12 |= sVar.f(iVar) ? 67108864 : 33554432;
        } else {
            iVar = this;
        }
        if (sVar.R(i12 & 1, (38347923 & i12) != 38347922)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                i13 = i12 & (-3727361);
                v0Var3 = f25822b;
                f13 = f25825e;
            } else {
                sVar.U();
                i13 = i12 & (-3727361);
                v0Var3 = v0Var;
                f13 = f12;
            }
            int i14 = i13;
            sVar.r();
            b4.t tVarM = m2.m(tVar2, m.f25846d);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new im.a(26);
                sVar.k0(objM);
            }
            b4.t tVarF = f4.g.f(tVarM, (Function1) objM);
            boolean zC = ((i14 & 112) == 32) | ((i14 & 14) == 4) | ((((i14 & 7168) ^ 3072) > 2048 && sVar.c(f11)) || (i14 & 3072) == 2048) | sVar.c(f13) | sVar.f(v0Var3);
            Object objM2 = sVar.M();
            if (zC || objM2 == fVar) {
                v0Var4 = v0Var3;
                i80.n nVar2 = new i80.n() { // from class: k3.e
                    @Override // i80.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final m1 m1VarD = ((t0) obj2).D(((z5.a) obj3).f47271a);
                        int i15 = m1VarD.f47183a;
                        int i16 = m1VarD.f47184b;
                        final t tVar4 = tVar3;
                        final boolean z12 = z11;
                        final float f14 = f11;
                        final float f15 = f13;
                        final v0 v0Var5 = v0Var4;
                        return w0.f((w0) obj, i15, i16, new Function1() { // from class: k3.g
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                final t tVar5 = tVar4;
                                final boolean z13 = z12;
                                final float f16 = f14;
                                final float f17 = f15;
                                final v0 v0Var6 = v0Var5;
                                l1.v((l1) obj4, m1VarD, 0, 0, new Function1() { // from class: k3.h
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        i4.s0 s0Var = (i4.s0) obj5;
                                        t tVar6 = tVar5;
                                        boolean z14 = ((Number) tVar6.f25869a.d()).floatValue() > 0.0f || z13;
                                        s0Var.y((((Number) tVar6.f25869a.d()).floatValue() * s0Var.q0(f16)) - Float.intBitsToFloat((int) (s0Var.f23297q & 4294967295L)));
                                        s0Var.q(z14 ? s0Var.f23298r.a() * f17 : 0.0f);
                                        s0Var.u(v0Var6);
                                        s0Var.g(true);
                                        return Unit.f26487a;
                                    }
                                }, 4);
                                return Unit.f26487a;
                            }
                        });
                    }
                };
                sVar.k0(nVar2);
                objM2 = nVar2;
            } else {
                v0Var4 = v0Var3;
            }
            b4.t tVarJ = v1.n.j(c0.l(tVarF, (i80.n) objM2), j9, v0Var4);
            int i15 = ((i14 >> 12) & 7168) | 48;
            u0 u0VarD = d2.p.d(b4.d.f5687e, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            b5.g gVar = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar);
            }
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            dVar.invoke(d2.u.f13938a, sVar, Integer.valueOf(((i15 >> 6) & 112) | 6));
            sVar.q(true);
            v0Var2 = v0Var4;
        } else {
            sVar.U();
            v0Var2 = v0Var;
            f13 = f12;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final i iVar2 = iVar;
            w1VarS.f29476d = new Function2() { // from class: k3.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f25800a.b(tVar, z11, tVar2, f11, v0Var2, j9, f13, dVar, (m3.n) obj, m3.i.F(i11 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }
}
