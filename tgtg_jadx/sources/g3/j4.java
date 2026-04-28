package g3;

import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18882a = l3.h0.f26972g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f18883b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f18884c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f18885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f18886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f18887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f18888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m3.e0 f18889h;

    static {
        float f11 = l3.i0.f26976b;
        float f12 = l3.i0.f26977c;
        float f13 = 2;
        f18885d = (f11 - f12) / f13;
        f18886e = (l3.i0.f26975a - f12) / f13;
        f18887f = 12;
        f18888g = 44;
        f18889h = new m3.e0(new fw.b(22));
    }

    public static final void a(final b4.t tVar, final long j9, long j11, float f11, d2.y2 y2Var, final u3.d dVar, m3.n nVar, final int i11) {
        final long j12;
        final float f12;
        final d2.y2 p1Var;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1054099326);
        int i12 = i11 | (sVar.f(tVar) ? 4 : 2) | (sVar.e(j9) ? 32 : 16) | 11392;
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                long jA = r0.a((p0) sVar.j(r0.f19375a), j9);
                float f13 = b4.f18361a;
                j12 = jA;
                p1Var = new d2.p1(i3.r.k(sVar), 32 | d2.c.f13762h);
                f12 = f13;
            } else {
                sVar.U();
                j12 = j11;
                f12 = f11;
                p1Var = y2Var;
            }
            sVar.r();
            ((x0) sVar.j(f18889h)).a(new k4(tVar, j9, j12, f12, p1Var, dVar), sVar, 0);
        } else {
            sVar.U();
            j12 = j11;
            f12 = f11;
            p1Var = y2Var;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(j9, j12, f12, p1Var, dVar, i11) { // from class: g3.g4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f18666b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f18667c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ float f18668d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ d2.y2 f18669e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ u3.d f18670f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(196609);
                    j4.a(this.f18665a, this.f18666b, this.f18667c, this.f18668d, this.f18669e, this.f18670f, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void b(d2.j2 j2Var, final boolean z11, Function0 function0, final u3.d dVar, b4.t tVar, boolean z12, final Function2 function2, boolean z13, final c4 c4Var, m3.n nVar, int i11) {
        int i12;
        c4 c4Var2;
        b4.t tVar2;
        boolean z14;
        m3.s sVar;
        boolean z15;
        b4.t tVar3;
        final boolean z16;
        int i13;
        u3.d dVarE;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(974293026);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(j2Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.h(function0) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(dVar) ? NewHope.SENDB_BYTES : 1024;
        }
        int i14 = i12 | 221184;
        if ((1572864 & i11) == 0) {
            i14 |= sVar2.h(function2) ? 1048576 : 524288;
        }
        int i15 = i14 | 12582912;
        if ((100663296 & i11) == 0) {
            i15 |= sVar2.f(c4Var) ? 67108864 : 33554432;
        }
        int i16 = i15 | 805306368;
        final boolean z17 = true;
        if (sVar2.R(i16 & 1, (306783379 & i16) != 306783378)) {
            sVar2.W();
            if ((i11 & 1) == 0 || sVar2.z()) {
                tVar3 = b4.q.f5711a;
                z16 = true;
            } else {
                sVar2.U();
                tVar3 = tVar;
                z16 = z12;
                z17 = z13;
            }
            sVar2.r();
            sVar2.a0(-224975399);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = w.a0.g(sVar2);
            }
            b2.l lVar = (b2.l) objM;
            sVar2.q(false);
            l3.f0 f0Var = l3.f0.DefaultEffects;
            final t1.b1 b1VarD = s0.D(f0Var, sVar2);
            boolean z18 = z17;
            u3.d dVarE2 = u3.e.e(-876637252, sVar2, new Function2() { // from class: g3.d4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    m3.n nVar2 = (m3.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    m3.s sVar3 = (m3.s) nVar2;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        c4 c4Var3 = c4Var;
                        boolean z19 = z11;
                        m3.c3 c3VarA = s1.d1.a(!z16 ? c4Var3.f18413f : z19 ? c4Var3.f18408a : c4Var3.f18411d, b1VarD, null, sVar3, 0, 12);
                        b4.t tVarB = b4.q.f5711a;
                        if (function2 == null || !(z17 || z19)) {
                            sVar3.a0(-634793532);
                        } else {
                            sVar3.a0(-634794445);
                            Object objM2 = sVar3.M();
                            if (objM2 == m3.m.f29332a) {
                                objM2 = new g2.q(11);
                                sVar3.k0(objM2);
                            }
                            tVarB = j5.r.b(tVarB, (Function1) objM2);
                        }
                        sVar3.q(false);
                        z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                        int iHashCode = Long.hashCode(sVar3.T);
                        u3.i iVarL = sVar3.l();
                        b4.t tVarC = b4.a.c(tVarB, sVar3);
                        b5.j.R.getClass();
                        b5.h hVar = b5.i.f5839b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(u0VarD, b5.i.f5843f, sVar3);
                        m3.i.C(iVarL, b5.i.f5842e, sVar3);
                        b5.g gVar = b5.i.f5844g;
                        if (sVar3.S || !Intrinsics.areEqual(sVar3.M(), Integer.valueOf(iHashCode))) {
                            e0.f.y(iHashCode, sVar3, iHashCode, gVar);
                        }
                        m3.i.C(tVarC, b5.i.f5841d, sVar3);
                        m3.i.a(b3.i.u(((i4.v) c3VarA.getValue()).f23317a, v0.f19606a), dVar, sVar3, 8);
                        sVar3.q(true);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            });
            if (function2 == null) {
                sVar2.a0(-224048562);
                sVar2.q(false);
                dVarE = null;
                i13 = i16;
                c4Var2 = c4Var;
            } else {
                sVar2.a0(-224048561);
                i13 = i16;
                c4Var2 = c4Var;
                dVarE = u3.e.e(802208206, sVar2, new ar.c(c4Var, z11, z16, b1VarD, function2));
                sVar2.q(false);
            }
            u3.d dVar2 = dVarE;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = w.a0.s(0, sVar2);
            }
            m3.h1 h1Var = (m3.h1) objM2;
            boolean z19 = z16;
            b4.t tVar4 = tVar3;
            b4.t tVarA = j2Var.a(1.0f, d2.m2.b(k2.c.a(tVar4, z11, lVar, null, z19, new j5.j(4), function0), 0.0f, f18882a, 1), true);
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = new co.t(h1Var, 4);
                sVar2.k0(objM3);
            }
            b4.t tVarQ = z4.c0.q(tVarA, (Function1) objM3);
            z4.u0 u0VarD = d2.p.d(b4.d.f5687e, true);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarQ, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            b5.g gVar = b5.i.f5844g;
            if (sVar2.S || !Intrinsics.areEqual(sVar2.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar2, iHashCode, gVar);
            }
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            m3.c3 c3VarB = t1.d.b(z11 ? 1.0f : 0.0f, s0.D(f0Var, sVar2), null, null, sVar2, 0, 28);
            m3.c3 c3VarB2 = t1.d.b(z11 ? 1.0f : 0.0f, s0.D(l3.f0.FastSpatial, sVar2), null, null, sVar2, 0, 28);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((h1Var.h() - r3.q0(l3.i0.f26976b)) / 2)) << 32) | (((long) Float.floatToRawIntBits(((z5.c) sVar2.j(c5.x1.f7416h)).c0(f18887f))) & 4294967295L);
            boolean zF = sVar2.f(lVar) | sVar2.e(jFloatToRawIntBits);
            Object objM4 = sVar2.M();
            if (zF || objM4 == fVar) {
                objM4 = new i3.a0(lVar, jFloatToRawIntBits);
                sVar2.k0(objM4);
            }
            u3.d dVarE3 = u3.e.e(-2082182507, sVar2, new y0((i3.a0) objM4, 3));
            u3.d dVarE4 = u3.e.e(-799524251, sVar2, new a3.u2(21, c3VarB, c4Var2));
            boolean zF2 = sVar2.f(c3VarB);
            Object objM5 = sVar2.M();
            if (zF2 || objM5 == fVar) {
                objM5 = new a3.t1(c3VarB, 2);
                sVar2.k0(objM5);
            }
            Function0 function02 = (Function0) objM5;
            boolean zF3 = sVar2.f(c3VarB2);
            Object objM6 = sVar2.M();
            if (zF3 || objM6 == fVar) {
                objM6 = new a3.t1(c3VarB2, 3);
                sVar2.k0(objM6);
            }
            sVar = sVar2;
            c(dVarE3, dVarE4, dVarE2, dVar2, z18, function02, (Function0) objM6, sVar, ((i13 >> 9) & 57344) | 438);
            sVar2.q(true);
            z14 = z18;
            z15 = z19;
            tVar2 = tVar4;
        } else {
            c4Var2 = c4Var;
            sVar2.U();
            tVar2 = tVar;
            z14 = z13;
            sVar = sVar2;
            z15 = z12;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new h4(j2Var, z11, function0, dVar, tVar2, z15, function2, z14, c4Var2, i11);
        }
    }

    public static final void c(u3.d dVar, u3.d dVar2, u3.d dVar3, Function2 function2, boolean z11, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        int i12;
        boolean z12;
        boolean z13;
        Function2 function22 = function2;
        Function0 function03 = function0;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1019541078);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(dVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(dVar2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(dVar3) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function22) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.g(z11) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(function03) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(function02) ? 1048576 : 524288;
        }
        if (sVar.R(i12 & 1, (599187 & i12) != 599186)) {
            float f11 = k.f18924a;
            c60.a aVar = new c60.a(18);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarL = z4.c0.l(qVar, aVar);
            int i13 = 57344 & i12;
            boolean z14 = ((i12 & 7168) == 2048) | ((i12 & 3670016) == 1048576) | (i13 == 16384);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z14 || objM == fVar) {
                objM = new i4(function02, function22, z11);
                sVar.k0(objM);
            }
            z4.u0 u0Var = (z4.u0) objM;
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarL, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            int i14 = i12;
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0Var, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            b5.g gVar3 = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar3);
            }
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            dVar.invoke(sVar, Integer.valueOf(i14 & 14));
            dVar2.invoke(sVar, Integer.valueOf((i14 >> 3) & 14));
            b4.t tVarM = z4.c0.m(qVar, InAppMessageBase.ICON);
            b4.k kVar = b4.d.f5683a;
            z4.u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarM, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode2))) {
                e0.f.y(iHashCode2, sVar, iHashCode2, gVar3);
            }
            m3.i.C(tVarC2, gVar4, sVar);
            r8.k.w((i14 >> 6) & 14, dVar3, sVar, true);
            if (function2 != null) {
                sVar.a0(-660471321);
                b4.t tVarM2 = z4.c0.m(qVar, AnnotatedPrivateKey.LABEL);
                boolean z15 = (i13 == 16384) | ((i14 & 458752) == 131072);
                Object objM2 = sVar.M();
                if (z15 || objM2 == fVar) {
                    z12 = z11;
                    function03 = function0;
                    objM2 = new fi.c(z12, function03, 1);
                    sVar.k0(objM2);
                } else {
                    z12 = z11;
                    function03 = function0;
                }
                b4.t tVarP = i4.g0.p(tVarM2, (Function1) objM2);
                z4.u0 u0VarD2 = d2.p.d(kVar, false);
                int iHashCode3 = Long.hashCode(sVar.T);
                u3.i iVarL3 = sVar.l();
                b4.t tVarC3 = b4.a.c(tVarP, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD2, gVar, sVar);
                m3.i.C(iVarL3, gVar2, sVar);
                if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode3))) {
                    e0.f.y(iHashCode3, sVar, iHashCode3, gVar3);
                }
                m3.i.C(tVarC3, gVar4, sVar);
                function22 = function2;
                z13 = true;
                w.a0.x((i14 >> 9) & 14, function22, sVar, true, false);
            } else {
                function22 = function2;
                z12 = z11;
                function03 = function0;
                z13 = true;
                sVar.a0(-685419935);
                sVar.q(false);
            }
            sVar.q(z13);
        } else {
            z12 = z11;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c0(dVar, dVar2, dVar3, function22, z12, function03, function02, i11);
        }
    }
}
